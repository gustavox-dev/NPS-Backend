package NPSBackend.service;

import NPSBackend.controller.dto.AnswerDTO.AnswerDTO;
import NPSBackend.controller.dto.AnswerDTO.CreateAnswerDTO;
import NPSBackend.controller.dto.mapper.AnswerMapper;
import NPSBackend.entities.Answer;
import NPSBackend.repository.AnswerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AnswerService {

    private final AnswerRepository repo;
    private final QuestionService questionService;

    public AnswerDTO createAnswer(CreateAnswerDTO createAnswerDTO) {
        Answer answer = Answer.builder()
                .userNote(createAnswerDTO.getUserNote())
                .userOpinion(createAnswerDTO.getUserOpinion())
                .question(questionService.findById(createAnswerDTO.getQuestion()))
                .build();

        repo.save(answer);
        return AnswerMapper.fromEntityToRest(answer);
    }

    public Answer findById(Integer id) {
        return repo.findById(id).get();
    }

    public List<AnswerDTO> findAll() {
        return repo.findAll().stream().map(AnswerMapper::fromEntityToRest).collect(Collectors.toList());
    }


}

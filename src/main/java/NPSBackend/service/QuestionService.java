package NPSBackend.service;

import NPSBackend.controller.dto.QuestionDTO.CreateQuestionDTO;
import NPSBackend.controller.dto.QuestionDTO.QuestionDTO;
import NPSBackend.controller.dto.mapper.QuestionMapper;
import NPSBackend.entities.Question;
import NPSBackend.repository.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QuestionService {

    private final QuestionRepository repo;

    public QuestionDTO createQuestion(CreateQuestionDTO createQuestionDTO){
        Question question = Question.builder()
                .title(createQuestionDTO.getTitle())
                .description(createQuestionDTO.getDescription())
                .build();
        repo.save(question);
        return QuestionMapper.fromEntityToRest(question);
    }

    public Question findById(Integer id) {
        return repo.findById(id).get();
    }

    public List<QuestionDTO> findAllQuestion(){

        return repo.findAll().stream().map(QuestionMapper::fromEntityToRest).collect(Collectors.toList());
    }
}

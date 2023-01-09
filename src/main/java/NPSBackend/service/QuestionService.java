package NPSBackend.service;

import NPSBackend.controller.dto.QuestionDTO.CreateQuestionDTO;
import NPSBackend.entities.Question;
import NPSBackend.repository.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionService {

    private final QuestionRepository repo;

    public Question createQuestion(CreateQuestionDTO createQuestionDTO){
        Question question = Question.builder()
                .title(createQuestionDTO.getTitle())
                .description(createQuestionDTO.getDescription())
                .userOpinion(createQuestionDTO.getUserOpinion())
                .build();

        return repo.save(question);
    }

    public List<Question> findAllQuestion(){
        return repo.findAll();
    }
}

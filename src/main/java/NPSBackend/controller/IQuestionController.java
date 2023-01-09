package NPSBackend.controller;

import NPSBackend.controller.dto.QuestionDTO.CreateQuestionDTO;
import NPSBackend.entities.Question;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public interface IQuestionController {


    Question createQuestion(CreateQuestionDTO createQuestionDTO);

    List<Question> findAllQuestion();

}

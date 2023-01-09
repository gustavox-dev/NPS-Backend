package NPSBackend.controller;

import NPSBackend.controller.dto.QuestionDTO.CreateQuestionDTO;
import NPSBackend.controller.dto.QuestionDTO.QuestionDTO;

import java.util.List;


public interface IQuestionController {


    QuestionDTO createQuestion(CreateQuestionDTO createQuestionDTO);

    List<QuestionDTO> findAllQuestion();

}

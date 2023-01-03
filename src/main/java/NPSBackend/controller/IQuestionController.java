package NPSBackend.controller;

import NPSBackend.controller.dto.QuestionDTO.CreateQuestionDTO;
import NPSBackend.entities.Question;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
@Api(tags = "Question")
public interface IQuestionController {


    Question createQuestion(CreateQuestionDTO createQuestionDTO);

    List<Question> findAllQuestion();

}

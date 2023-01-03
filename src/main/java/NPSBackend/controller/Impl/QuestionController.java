package NPSBackend.controller.Impl;

import NPSBackend.controller.IQuestionController;
import NPSBackend.controller.dto.QuestionDTO.CreateQuestionDTO;
import NPSBackend.entities.Question;
import NPSBackend.service.QuestionService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
@AllArgsConstructor
public class QuestionController implements IQuestionController {
    private final QuestionService service;

    @Override
    @ApiOperation("Criar Question")
    @PostMapping(value = "/question")
    public Question createQuestion(@RequestBody CreateQuestionDTO createQuestionDTO) {
        return service.createQuestion(createQuestionDTO);
    }

    @ApiOperation("Busca todas as Questions")
    @GetMapping(value = "/question/all")
    @Override
    public List<Question> findAllQuestion() {
        return service.findAllQuestion();
    }
}

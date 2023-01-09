package NPSBackend.controller.Impl;

import NPSBackend.controller.IQuestionController;
import NPSBackend.controller.dto.QuestionDTO.CreateQuestionDTO;
import NPSBackend.controller.dto.QuestionDTO.QuestionDTO;
import NPSBackend.entities.Question;
import NPSBackend.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
@AllArgsConstructor
public class QuestionController implements IQuestionController {
    private final QuestionService service;

    @Override
    @PostMapping
    public QuestionDTO createQuestion(@RequestBody CreateQuestionDTO createQuestionDTO) {
        return service.createQuestion(createQuestionDTO);
    }

    @GetMapping(value = "/all")
    @Override
    public List<QuestionDTO> findAllQuestion() {
        return service.findAllQuestion();
    }
}

package NPSBackend.controller.Impl;

import NPSBackend.controller.IAnswerController;
import NPSBackend.controller.dto.AnswerDTO.AnswerDTO;
import NPSBackend.controller.dto.AnswerDTO.CreateAnswerDTO;
import NPSBackend.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answer")
@AllArgsConstructor
public class AnswerController implements IAnswerController {

    private final AnswerService service;


    @Override
    @PostMapping
    public AnswerDTO createAnswer(@RequestBody CreateAnswerDTO createAnswerDTO) {
        return service.createAnswer(createAnswerDTO);
    }

    @Override
    @GetMapping
    public List<AnswerDTO> findAll() {
        return service.findAll();
    }
}

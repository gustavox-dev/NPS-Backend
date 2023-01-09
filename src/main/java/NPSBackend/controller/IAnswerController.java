package NPSBackend.controller;

import NPSBackend.controller.dto.AnswerDTO.AnswerDTO;
import NPSBackend.controller.dto.AnswerDTO.CreateAnswerDTO;

import java.util.List;

public interface IAnswerController {

    AnswerDTO createAnswer(CreateAnswerDTO createAnswerDTO);

    List<AnswerDTO> findAll();
}

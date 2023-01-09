package NPSBackend.controller.dto.mapper;

import NPSBackend.controller.dto.AnswerDTO.AnswerDTO;
import NPSBackend.entities.Answer;

public class AnswerMapper {

    public static AnswerDTO fromEntityToRest(Answer answer) {

        return AnswerDTO.builder()
                .userNote(answer.getUserNote())
                .userOpinion(answer.getUserOpinion())
                .question(answer.getQuestion().getId())
                .build();
    }
}

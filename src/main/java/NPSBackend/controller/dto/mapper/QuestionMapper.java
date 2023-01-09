package NPSBackend.controller.dto.mapper;

import NPSBackend.controller.dto.QuestionDTO.QuestionDTO;
import NPSBackend.entities.Question;

public class QuestionMapper {

    public static QuestionDTO fromEntityToRest(Question question){
        return QuestionDTO.builder()
                .title(question.getTitle())
                .description(question.getDescription())
                .build();
    }
}

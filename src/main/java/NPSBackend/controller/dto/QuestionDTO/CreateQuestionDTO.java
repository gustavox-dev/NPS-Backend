package NPSBackend.controller.dto.QuestionDTO;

import lombok.Data;

@Data
public class CreateQuestionDTO {
    private String title;
    private String description;
    private String userOpinion;

}

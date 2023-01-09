package NPSBackend.controller.dto.AnswerDTO;

import lombok.Data;

@Data
public class CreateAnswerDTO {

    private Integer userNote;
    private String userOpinion;
    private Integer question;
}

package NPSBackend.controller.dto.AnswerDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnswerDTO {
    private Integer userNote;
    private String userOpinion;
    private Integer question;
}

package NPSBackend.controller.dto.QuestionDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestionDTO {
    private String title;
    private String description;

}

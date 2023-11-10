package spring.project.groupware.academy.employee.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ImageResponseDto {

    private String imageUrl;
    @Builder
    public ImageResponseDto(String imageUrl){
        this.imageUrl=imageUrl;
    }
}

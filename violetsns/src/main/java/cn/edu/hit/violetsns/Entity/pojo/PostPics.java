package cn.edu.hit.violetsns.Entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostPics {
    private Integer picsId;
    private Integer postId;
    private String media;
}

package cn.edu.hit.violetsns.Entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostElement {
    private Integer id;
    private String title;
    @JsonProperty("nBrowse")
    private Integer nBrowse;
    @JsonProperty("nUpvote")
    private Integer nUpvote;
    @JsonProperty("nComment")
    private Integer nComment;
    private String nickname;
    @JsonProperty("coverPicture")
    private String coverPicture;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date time;
}

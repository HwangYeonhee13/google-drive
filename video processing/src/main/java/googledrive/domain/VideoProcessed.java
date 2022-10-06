package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;

    public VideoProcessed(Video aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}

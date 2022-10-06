package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Index extends AbstractEvent {

    private Long id;

    public Index(File aggregate){
        super(aggregate);
    }
    public Index(){
        super();
    }
}

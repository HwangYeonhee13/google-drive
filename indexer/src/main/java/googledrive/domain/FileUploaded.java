package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
}



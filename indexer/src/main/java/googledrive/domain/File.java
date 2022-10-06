package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.Index;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Index index = new Index(this);
        index.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = IndexerApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }

    public static void makeIndex(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        File file = new File();
        repository().save(file);

        Index index = new Index(file);
        index.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(file->{
            
            file // do something
            repository().save(file);

            Index index = new Index(file);
            index.publishAfterCommit();

         });
        */

    }
}

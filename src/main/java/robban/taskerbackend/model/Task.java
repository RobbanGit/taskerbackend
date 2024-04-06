package robban.taskerbackend.model;


import jakarta.persistence.*;

@Entity
@Table(name = "task_table")
public class Task{

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String description;

    private String authorId;

    private String status;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getAuthorId(){
        return authorId;
    }

    public void setAuthorId(String authorId){
        this.authorId = authorId;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

}
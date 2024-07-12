package be.plgoosse.todolist.api.dto;

public class TodoDTO {

    private Long id;
    private String content;

    public TodoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

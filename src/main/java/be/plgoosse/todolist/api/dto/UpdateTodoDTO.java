package be.plgoosse.todolist.api.dto;

public class UpdateTodoDTO {

    private String content;
    private Boolean checked;

    public UpdateTodoDTO() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}

package mail;

public class Mail {

    private final String id;
    private final String targetMail;
    private final String title;
    private final String content;
    private Status status;

    public Mail(String id, String targetMail, String title, String content) {
        this.id = id;
        this.targetMail = targetMail;
        this.title = title;
        this.content = content;
        this.status = Status.CREATED;
    }

    public void changeStatus(Status status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getTargetMail() {
        return targetMail;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Status getStatus() {
        return status;
    }
}
package mail;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MailService {

    private final Map<String, Mail> mails = new HashMap<>();

    public void createMail(
            String id,
            String targetMail,
            String title,
            String content
    ) {
        Mail mail = new Mail(id, targetMail, title, content);
        this.mails.put(id, mail);

        System.out.println("Stworzono maila o id: " + id);
    }

    public Mail getMail(String id) {
        return this.mails.get(id);
    }

    public boolean checkId(String id) {
        return this.mails.containsKey(id);
    }

    public boolean validateTitle(String title) {
        return title.length() < 67;
    }

    public Collection<Mail> getMails() {
        return this.mails.values();
    }

}
package mail;

import java.util.Scanner;

public class MailMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MailService mailService = new MailService();

        displayUsage();
        while (scanner.hasNext()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Podaj id: ");
                    String id = scanner.nextLine();
                    if (mailService.checkId(id)) {
                        System.out.println("Takie id już istnieje!");
                        displayUsage();
                        break;
                    }

                    System.out.println("Podaj mail:");
                    String target = scanner.nextLine();

                    System.out.println("Wpisz tytuł: ");
                    String title = scanner.nextLine();
                    if (!mailService.validateTitle(title)) {
                        System.out.println("Tytuł za długi (jak mój fiut)!");
                        displayUsage();
                        break;
                    }

                    System.out.println("Wpisz zawartość maila: ");
                    String content = scanner.nextLine();

                    mailService.createMail(id, target, title, content);
                    displayUsage();
                    break;
                case 2:
                    System.out.println("Wyślij maila");
                    System.out.println("Maile: ");
                    for (Mail mail : mailService.getMails()) {
                        System.out.println("=============");
                        System.out.println("Id: " + mail.getId());
                        System.out.println("Tytuł: " + mail.getTitle());
                        System.out.println("Status: " + mail.getStatus().name().toLowerCase());
                    }

                    System.out.println("Wybierz maila: ");
                    String providedId = scanner.nextLine();
                    Mail mail = mailService.getMail(providedId);
                    if (mail == null) {
                        System.out.println("Nie znaleziono maila o podanym id!");
                        displayUsage();
                        break;
                    }

                    mail.changeStatus(Status.SENT);
                    System.out.println("Wysłano maila!");
                    displayUsage();
                    break;
                default:
                    System.out.println("Błąd!");
                    displayUsage();
                    break;
            }
        }
    }

    private static void displayUsage() {
        System.out.println("Wybierz akcje: ");
        System.out.println("1. Stwórz maila");
        System.out.println("2. Wyślij maila");
    }

}
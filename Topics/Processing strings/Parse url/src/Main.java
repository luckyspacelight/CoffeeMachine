import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        String paramString = url.substring(url.indexOf("?") + 1, url.length());
        String[] parameters = paramString.split("&");

        String pass = "";
        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = parameters[i].endsWith("=") ? parameters[i] += "not found" : parameters[i];
            parameters[i] = parameters[i].replace("=", " : ");
            if (parameters[i].startsWith("pass")) {
                pass = parameters[i].replace("pass", "password");
            }
            System.out.println(parameters[i]);
        }
        System.out.println(pass);
    }
}
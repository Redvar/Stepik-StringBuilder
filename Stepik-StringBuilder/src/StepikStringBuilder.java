/**
 * @author Pavel Konoplin
 * @version 13.11.2020
 */

public class StepikStringBuilder {
        public static void main(String[] args) {
            String[] role = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
            String[] textLine = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                    "Аммос Федорович: Как ревизор?",
                    "Артемий Филиппович: Как ревизор?",
                    "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                    "Аммос Федорович: Вот те на!",
                    "Артемий Филиппович: Вот не было заботы, так подай!",
                    "Лука Лукич: Господи боже! И еще и с секретным предписаньем!",
                    "Артемий Филиппович: Господи боже! Лука: еще и с секретным предписаньем!",
                    "Городничий: Здравствуй Городничий: Как поживаешь?"
            };


            String result = printTextPerRole(role, textLine);
            System.out.println(result);
        }

        public static String printTextPerRole(String[] roles, String[] textLines) {
            StringBuilder strResult = new StringBuilder();

            for (String role : roles) {
                strResult.append(role).append(":").append("\n");
                int lineNumber = 1;

                for (String textLine : textLines) {
                    if (textLine.startsWith(role + ":")) {
                        String splitArr = textLine.substring(textLine.indexOf(':') + 2);
                        strResult.append(lineNumber).append(") ").append(splitArr).append("\n");
                    }
                    lineNumber++;
                }
                strResult.append("\n");
            }
            return String.valueOf(strResult);
        }
}


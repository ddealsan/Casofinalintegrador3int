public class InterplanetaryCommunicator {
    public String sendMessageToEarth(String message) {
        // Lógica para enviar mensaje a la Tierra
        // Por simplicidad, aquí simplemente se devuelve el mensaje recibido
        return message;
    }

    public String sendMessageToBase(String message) {
        // Lógica para enviar mensaje a la base
        // Por simplicidad, aquí simplemente se devuelve el mensaje recibido
        return message;
    }

    public int countVowels(String message) {
        // Lógica para contar vocales en el mensaje
        int count = 0;
        for (char c : message.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String message) {
        // Lógica para verificar si el mensaje es un palíndromo
        String normalizedMessage = message.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = normalizedMessage.length() - 1;
        while (left < right) {
            if (normalizedMessage.charAt(left) != normalizedMessage.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String reverseMessage(String message) {
        // Lógica para invertir el mensaje
        StringBuilder reversed = new StringBuilder();
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed.append(message.charAt(i));
        }
        return reversed.toString();
    }
}
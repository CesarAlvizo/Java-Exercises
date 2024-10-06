package pass_seguro;
public class Pass_Seguro {
public static void main(String[] args) {
        String password = "P@ssw0rd"; // Aquí puedes cambiar la contraseña a validar
        String mensaje = validandoContraseña(password);
        System.out.println(mensaje);
    }
    public static String validandoContraseña(String password) {
        // Definir los criterios de validación de la contraseña
        int minLength = 8;
        boolean hasSpecialChar = false; //para verificar si la contraseña contiene caracteres
        boolean hasNumber = false; //para verificar si la contraseña contiene numeros

        // Validar longitud mínima
        if (password.length() < minLength) {
            return "La contraseña debe tener al menos " + minLength + " caracteres.";
        }
        
        // Validar presencia de caracteres especiales, números y mayúsculas
        for (char c : password.toCharArray()) {
        // Se verifica si el carácter actual no es una letra o un dígito utilizando el método  
            if (!Character.isLetterOrDigit(c))
            {
                hasSpecialChar = true;
            }
        // Se verifica si el carácter actual es un dígito utilizando el método
            if (Character.isDigit(c))
            {
                hasNumber = true;
            }
        }

        if (!hasSpecialChar) {
            return "La contraseña debe contener al menos un carácter especial.";
        }

        if (!hasNumber) {
            return "La contraseña debe contener al menos un número.";
        }

        // Si pasa todas las validaciones, la contraseña es válida
        return "La contraseña es válida.";
    }
}

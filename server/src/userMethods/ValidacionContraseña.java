package userMethods;

public class ValidacionContraseña { 
       public static String validarContrasena(String password) {
        if (password == null || password.isEmpty()) {
            return "La contraseña no puede estar vacía.";
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean longitudValida = password.length() >= 8;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            else if (Character.isLowerCase(c)) tieneMinuscula = true;
            else if (Character.isDigit(c)) tieneNumero = true;
        }

        if (!longitudValida) return "Debe tener al menos 8 caracteres.";
        if (!tieneMayuscula || !tieneMinuscula || !tieneNumero)
            return "Debe incluir mayúsculas, minúsculas y números.";

        return "OK";
    }

}

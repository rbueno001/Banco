public class Usuario {

    // Atributos
    private String nombreCompleto;
    private String cedula;
    private String correoElectronico;
    private String contrasenia;

    // Constructor
    public Usuario(String nombreCompleto, String cedula, String correoElectronico, String contrasenia) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        setContrasenia(contrasenia);
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContrasenia(String contrasenia) {
        if (!validarContrasenia(contrasenia)) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial.");
        }

        this.contrasenia = contrasenia;
    }

    // Métodos
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }

        Usuario usuario = (Usuario) objeto;
        return cedula.equals(usuario.cedula);
    }

    @Override
    public String toString() {
        return "Nombre completo: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nCorreo electrónico: " + correoElectronico;
    }

    public boolean validarContrasenia(String contrasenia) {
        if (contrasenia == null || contrasenia.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isUpperCase(contrasenia.charAt(i))) {
                tieneMayuscula = true;
            }

            if (Character.isLowerCase(contrasenia.charAt(i))) {
                tieneMinuscula = true;
            }

            if (Character.isDigit(contrasenia.charAt(i))) {
                tieneNumero = true;
            }

            if (!Character.isLetterOrDigit(contrasenia.charAt(i)) &&
                    !Character.isWhitespace(contrasenia.charAt(i))) {
                tieneEspecial = true;
            }
        }

        if (!tieneMayuscula) return false;
        if (!tieneMinuscula) return false;
        if (!tieneNumero) return false;
        if (!tieneEspecial) return false;

        return true;
    }
}

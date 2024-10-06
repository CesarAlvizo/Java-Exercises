package contacto;
//Definimos la clase Contacto
class Contacto {
    String nombre;
    String numeroCelular;
    String correo;
    String direccion;
    
//Definimos un constructor de la clase Contacto
    public Contacto(String nombre, String numeroCelular, String correo, String direccion) {
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correo=correo;
        this.direccion=direccion;
    }
// Métodos para acceder y establecer los atributos
    public String getNombre() {
        return nombre;
    }
    public String getNumeroCelular() {
        return numeroCelular;
    }
        public String getcorreo() {
        return correo;
    }
        public String getdireccion() {
        return direccion;
    }
}


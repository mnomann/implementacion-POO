class Paciente {
    private String nombre;
    private String rut;
    private int edad;
    private String contacto;

    public Paciente(String nombre, String rut, int edad, String contacto) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.contacto = contacto;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getContacto() { return contacto; }
    public void setContacto(String contacto) { this.contacto = contacto; }
}
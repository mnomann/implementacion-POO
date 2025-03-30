class CitaMedica {
    private CentroClinico centro;
    private Medico medico;
    private Paciente paciente;
    private String fecha;
    private String hora;
    private String motivo;

    public CitaMedica(CentroClinico centro, Medico medico, Paciente paciente, String fecha, String hora, String motivo) {
        this.centro = centro;
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    // Getters y Setters
    public CentroClinico getCentro() { return centro; }
    public void setCentro(CentroClinico centro) { this.centro = centro; }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}
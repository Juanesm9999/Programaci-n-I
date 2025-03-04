package co.edu.uniquindio.poo;

public class Ninio {
    private String nombres, genero, documento, alergias, nombreAcudiente, numeroContactoAcudiente, ID;
    private int edad;

    public Ninio(String nombres, String genero, String documento, String alergias, String nombreAcudiente, String numeroContactoAcudiente, String ID, int edad) {
        this.nombres = nombres;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContactoAcudiente = numeroContactoAcudiente;
        this.ID = ID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Ninio{" +
                "nombres='" + nombres + '\'' +
                ", genero='" + genero + '\'' +
                ", documento='" + documento + '\'' +
                ", alergias='" + alergias + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", numeroContactoAcudiente='" + numeroContactoAcudiente + '\'' +
                ", ID='" + ID + '\'' +
                ", edad=" + edad +
                '}';
    }
}

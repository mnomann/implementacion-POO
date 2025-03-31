import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionHorasMedicas {
    private static List<CitaMedica> citas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Horas Médicas");
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcion = 0;
        do {
            boolean entradaValida = false;
            
            while (!entradaValida) {
                try {
                    System.out.println("\n1. Agregar Cita Médica");
                    System.out.println("2. Modificar Cita Médica");
                    System.out.println("3. Eliminar Cita Médica");
                    System.out.println("4. Listar Citas Médicas");
                    System.out.println("5. Salir");
                    System.out.print("Seleccione una opción: ");
                    
                    opcion = Integer.parseInt(scanner.nextLine()); // Validación de tipo
                    
                    if (opcion >= 1 && opcion <= 5) {
                        entradaValida = true; // Solo acepta opciones válidas
                    } else {
                        System.out.println("Opción fuera de rango. Intente de nuevo");
                    }
                    
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Ingrese un número del 1 al 5");
                }
            }

            switch (opcion) {
                case 1 -> agregarCita();
                case 2 -> modificarCita();
                case 3 -> eliminarCita();
                case 4 -> listarCitas();
                case 5 -> System.out.println("Saliendo del Programa");
            }

        } while (opcion != 5);
    }

    private static void agregarCita() {
        CentroClinico centro = new CentroClinico("Centro Médico ABC", "Av. Principal 123", "123456789");
        Medico medico = new Medico("Dr. Juan Pérez", "Cardiología", 10, true);
        System.out.print("Ingrese nombre del paciente: ");
        Paciente paciente = new Paciente(scanner.nextLine(), "12345678-9", 30, "987654321");
        System.out.print("Ingrese fecha (dd-mm-aaaa): ");
        String fecha = scanner.nextLine();
        System.out.print("Ingrese hora (hh:mm): ");
        String hora = scanner.nextLine();
        System.out.print("Ingrese motivo de la consulta: ");
        String motivo = scanner.nextLine();

        citas.add(new CitaMedica(centro, medico, paciente, fecha, hora, motivo));
        System.out.println("Cita médica agregada con éxito");
    }

    private static void modificarCita() {
        listarCitas();
        System.out.print("Seleccione el número de la cita a modificar: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice >= 0 && indice < citas.size()) {
            CitaMedica cita = citas.get(indice);
            System.out.print("Ingrese nueva fecha (dd-mm-aaaa): ");
            cita.setFecha(scanner.nextLine());
            System.out.print("Ingrese nueva hora (hh:mm): ");
            cita.setHora(scanner.nextLine());
            System.out.print("Ingrese nuevo motivo: ");
            cita.setMotivo(scanner.nextLine());
            System.out.println("Cita médica modificada con éxito.");
        } else {
            System.out.println("Índice no válido");
        }
    }

    private static void eliminarCita() {
        listarCitas();
        System.out.print("Seleccione el número de la cita a eliminar: ");
        int indice = scanner.nextInt() - 1;

        if (indice >= 0 && indice < citas.size()) {
            citas.remove(indice);
            System.out.println("Cita médica eliminada con éxito");
        } else {
            System.out.println("Índice no válido");
        }
    }

    private static void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas");
        } else {
            for (int i = 0; i < citas.size(); i++) {
                CitaMedica cita = citas.get(i);
                System.out.printf("%d. %s | %s | %s | %s | %s\n",
                        i + 1,
                        cita.getPaciente().getNombre(),
                        cita.getMedico().getNombre(),
                        cita.getFecha(),
                        cita.getHora(),
                        cita.getMotivo());
            }
        }
    }
}

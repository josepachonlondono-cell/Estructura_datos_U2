class ColaCarnet {
    private String[] filaEstudiantes;
    private int frente;
    private int fin;
    private int cantidad;
    private int capacidad;
 
    public ColaCarnet(int capacidad) {
        this.capacidad = capacidad;
        this.filaEstudiantes = new String[capacidad];
        this.frente = 0;
        this.fin = 0;
        this.cantidad = 0;
    }
 
    //  Operación para encolar o agregar elemento (Enqueue: Un estudiante llega a la fila
    public void formarEstudiante(String nombreEstudiante) {
        if (cantidad == capacidad) {
            System.out.println("Error: La fila está LLENA. '" + nombreEstudiante + "' debe esperar.");
            return;
        }
        filaEstudiantes[fin] = nombreEstudiante;
        fin = (fin + 1) % capacidad; // Cola circular
        cantidad++;
        System.out.println("En la fila: " + nombreEstudiante);
    }
 
       // Operación para desencolar o retirar elemento (Dequeue): Se atiende al estudiante
    public void entregarCarnet() {
        if (cantidad == 0) {
            System.out.println("Aviso: La fila está VACÍA. No hay estudiantes por atender.");
            return;
        }
        String atendido = filaEstudiantes[frente];
        filaEstudiantes[frente] = null; //  El estudiante sale de la fila
        frente = (frente + 1) % capacidad;
        cantidad--;
        System.out.println("Carnet entregado a: " + atendido);
    }
}
 
 
public class Main {
    public static void main(String[] args) {
        ColaCarnet moduloAtencion = new ColaCarnet(3);
 
        System.out.println("Ingreso o agregar elemento en la cola");
        moduloAtencion.formarEstudiante("María (Semestre 1)");
        moduloAtencion.formarEstudiante("Carlos (Semestre 3)");
        moduloAtencion.entregarCarnet();
 
        System.out.println("\n- CASO LÍMITE --");
        moduloAtencion.formarEstudiante("Ana (Semestre 1)");
        moduloAtencion.formarEstudiante("Luis (Semestre 5)");
        // Intent de exceder capacidad 
        moduloAtencion.formarEstudiante("Pedro (Semestre 2)");
 
        System.out.println("\n-- VACIANDO LA FILA --");
        moduloAtencion.entregarCarnet();
        moduloAtencion.entregarCarnet();
        moduloAtencion.entregarCarnet();
        // Intento de  atender sin estudiantes
        moduloAtencion.entregarCarnet(); 
    }
}
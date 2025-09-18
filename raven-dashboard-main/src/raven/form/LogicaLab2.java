/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.form;

/**
 *
 * @author jahir

 */
import javax.swing.JOptionPane;

public class LogicaLab2 {

   /* public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:"));
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento [" + (i + 1) + "]:"));
        }

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija un método de ordenación:\n" +
                        "1. Burbuja\n" +
                        "2. Burbuja con Señal\n" +
                        "3. Shell\n" +
                        "4. Inserción Directa\n" +
                        "5. Sacudida\n" +
                        "6. Baraja"));

        switch (opcion) {
            case 1: burbuja(arr); break;
            case 2: burbujaSeñal(arr); break;
            case 3: shell(arr); break;
            case 4: insercionDirecta(arr); break;
            case 5: sacudida(arr); break;
            case 6: baraja(arr); break;
            default: JOptionPane.showMessageDialog(null, "Opción no válida");
        }

        mostrarArreglo(arr, "Arreglo ordenado");

        // BÚSQUEDA
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar:"));
        int opcionBusqueda = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija un método de búsqueda:\n" +
                        "1. Binaria\n" +
                        "2. Secuencial en Ordenados\n" +
                        "3. Secuencial en Desordenados"));

        int pos = -1;
        switch (opcionBusqueda) {
            case 1: pos = busquedaBinaria(arr, buscar); break;
            case 2: pos = busquedaSecuencialOrdenada(arr, buscar); break;
            case 3: pos = busquedaSecuencial(arr, buscar); break;
            default: JOptionPane.showMessageDialog(null, "Opción no válida");
        }

        if (pos != -1)
            JOptionPane.showMessageDialog(null, "Elemento encontrado en la posición: " + pos);
        else
            JOptionPane.showMessageDialog(null, "Elemento no encontrado");
    }*/
    
    
public static int alta(int[] elementos, int n, int tam, int nuevoelemento) {
    if (n >= tam - 1) { // Sin espacio
        JOptionPane.showMessageDialog(null, "No hay espacio para más empleados.");
        return n;
    }

    // Checar si ya existe
    for (int i = 0; i <= n; i++) {
        if (elementos[i] == nuevoelemento) {
            JOptionPane.showMessageDialog(null, "El empleado ya existe.");
            return n;
        }
    }

    // Insertar al siguiente índice disponible
    n++;
    elementos[n] = nuevoelemento;
    JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.");
    return n;
}

    
    

    // ---------- MÉTODOS DE ORDENACIÓN ----------
    public static void burbuja(int[] A) {
        int N = A.length;
        for (int P = 1; P <= N; P++) {
            for (int I = 0; I < N - 1; I++) {
                if (A[I] > A[I + 1]) {
                    int Temp = A[I];
                    A[I] = A[I + 1];
                    A[I + 1] = Temp;
                }
            }
        }
    }

    public static void burbujaSeñal(int[] A) {
        int N = A.length;
        int I = 1;
        boolean Band = false;

        while (I < N && !Band) {
            Band = true;
            for (int J = 0; J < N - 1; J++) {
                if (A[J] > A[J + 1]) {
                    int Temp = A[J];
                    A[J] = A[J + 1];
                    A[J + 1] = Temp;
                    Band = false;
                }
            }
            I++;
        }
    }

    public static void shell(int[] A) {
        int N = A.length;
        int Ent = N + 1;
        boolean Band;

        do {
            Ent = Ent / 2;
            Band = true;

            while (Band) {
                Band = false;
                int I = 0;
                while ((I + Ent) < N) {
                    if (A[I] > A[I + Ent]) {
                        int temp = A[I];
                        A[I] = A[I + Ent];
                        A[I + Ent] = temp;
                        Band = true;
                    }
                    I++;
                }
            }
        } while (Ent > 0);
    }

    public static void insercionDirecta(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void sacudida(int[] V) {
        int N = V.length;
        int Izq = 1;
        int Der = N - 1;
        int K = N - 1;

        while (Der > Izq) {
            // Ciclo descendente
            for (int I = Der; I >= Izq; I--) {
                if (V[I - 1] > V[I]) {
                    int Temp = V[I - 1];
                    V[I - 1] = V[I];
                    V[I] = Temp;
                    K = I;
                }
            }
            Izq = K + 1;

            // Ciclo ascendente
            for (int I = Izq; I <= Der; I++) {
                if (V[I - 1] > V[I]) {
                    int Temp = V[I - 1];
                    V[I - 1] = V[I];
                    V[I] = Temp;
                    K = I;
                }
            }
            Der = K - 1;
        }
    }

    public static void baraja(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int carta = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > carta) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = carta;
        }
    }

    // ---------- MÉTODOS DE BÚSQUEDA ----------
    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fin = arr.length - 1;
        boolean band = false;
        int centro = -1;

        while (inicio <= fin && !band) {
            centro = (inicio + fin) / 2;
            if (x == arr[centro]) {
                band = true;
            } else {
                if (x < arr[centro]) {
                    fin = centro - 1;
                } else {
                    inicio = centro + 1;
                }
            }
        }

        if (band) {
            JOptionPane.showMessageDialog(null, x + " se encuentra en la posición " + centro);
            return centro;
        } else {
            JOptionPane.showMessageDialog(null, x + " no se encuentra en el arreglo");
            return -1;
        }
    }

    public static int busquedaSecuencial(int[] arr, int x) {
        int i = 0;
        while (i < arr.length && arr[i] != x) {
            i++;
        }
        if (i == arr.length) {
            return -1;
        } else {
            return i;
        }
    }

    public static int busquedaSecuencialOrdenada(int[] arr, int x) {
        int i = 0;
        while (i < arr.length && arr[i] < x) {
            i++;
        }
        if (i == arr.length || arr[i] != x) {
            return -1;
        } else {
            return i;
        }
    }

    // ---------- UTILIDAD ----------
    public static void mostrarArreglo(int[] arr, String mensaje) {
        StringBuilder sb = new StringBuilder(mensaje + ":\n");
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    

public static int buscar(int[] elemento, int Belemento, int n) {
    int i = 0;
    // Avanza mientras el valor actual sea estrictamente menor al objetivo
    while (i <= n && elemento[i] < Belemento) {
        i++;
    }
    // Si encontramos el valor exacto
    if (i <= n && elemento[i] == Belemento) {
        return i; // el elemento ya existe
    }
    // No se encontró, devolver la posición de inserción negativa
    return -(i + 1);
}

    
    
}


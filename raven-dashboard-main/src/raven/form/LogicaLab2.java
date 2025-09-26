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
    static int[] elementos;

        public static int[] MandarAR() {
        if (elementos == null) {
            JOptionPane.showMessageDialog(null,"No ha definido el tamano");
            return new int[0];
        }
        return elementos.clone();
    }
    
    
    

        
public static int alta(int[] elementos, int n, int tam, int nuevoelemento) {
    if (n >= tam - 1) { // Sin espacio
        JOptionPane.showMessageDialog(null, "No hay espacio para más eelementos.");
        return n;
    }

    // Checar si ya existe
    for (int i = 0; i <= n; i++) {
        if (elementos[i] == nuevoelemento) {
            JOptionPane.showMessageDialog(null, "El elemento ya existe.");
            return n;
        }
    }

    // Insertar al siguiente índice disponible
    n++;
    elementos[n] = nuevoelemento;
    
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
    
    
    
    public static void obtenerAR(int[] elementoss){
    
    elementos = elementoss.clone();
    
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
            
            return centro;
        } else {
            
            return -1;
        }
    }
    
//    busqueda binaria
//    busqueda secuencial
//    busqueda secuencial ordenada

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


package Fase1;

import java.awt.*;
import java.io.*;

class imagen {

    String tipo;
    String ventanilla;
    imagen siguiente;

    public imagen(String tipo) {
        this.tipo = tipo;
        siguiente = null;
    }
}

public class pilaImagenes {
    private imagen ultimo_nodo_ingresado;
    int elementos = 0;
    int color = 0;
    int blanco_negro = 0;
    String lista = "";

    public pilaImagenes() {
        ultimo_nodo_ingresado = null;
        elementos = 0;
    }

    public boolean vacia() {
        return ultimo_nodo_ingresado == null;
    }

    public void ingresarImagen(String tipo,String ventanilla) {
        imagen nuevo = new imagen(tipo);
        nuevo.tipo = tipo;
        nuevo.ventanilla = ventanilla;
        if (tipo == "color") {
            color++;
        } else {
            blanco_negro++;
        }
        nuevo.siguiente = ultimo_nodo_ingresado;
        ultimo_nodo_ingresado = nuevo;
        elementos++;
    }

    public void eliminar() {
        ultimo_nodo_ingresado = ultimo_nodo_ingresado.siguiente;
        elementos--;
    }

    public String ultimo() {
        return ultimo_nodo_ingresado.tipo;
    }

    public int elementos_en_Pila() {
        return elementos;
    }

    public void vaciarPila() {
        while (!vacia()) {
            eliminar();
        }
    }

    public void buscar() {
        imagen actual = ultimo_nodo_ingresado;
        while (actual != null) {
            lista += actual.tipo + "\n";
            actual = actual.siguiente;
        }
        System.out.println(lista);
        lista = "";
    }

    public String generar_dot(String ventanilla) {
        StringBuilder dot = new StringBuilder();
        dot.append("digraph G{\n");
        //dot.append("node[shape=box, style=\"filled\", color = red]\n");
        imagen aux = ultimo_nodo_ingresado;
        dot.append("label=\" Pila de "+ventanilla+" \"\n" +
                "fontsize=\"22\";\n" +
                "labelloc=top;\n" +
                "labeljust=left;");
        String nombresNodos = "";
        String conexiones = "";
        dot.append("node [\n" +
                "fontsize = \"16\"\n" +
                "shape = \"ellipse\"\n" +
                "];");
        int contador=0;
        while (aux != null) {

            nombresNodos += "Nodo" + aux.hashCode() + "\n[label= \" <f0> " +
                    "Numero correlativo:"+(contador++)+" " +
                    "| Tipo de imagen:  " + aux.tipo + " \"" +
                    " \n shape=\"record\"];\n";


            if (aux.siguiente != null) {
                conexiones += String.format("Nodo%d -> Nodo%d;\n", aux.siguiente.hashCode(), aux.hashCode());
            }
            aux = aux.siguiente;
        }
        dot.append(nombresNodos);
        dot.append(conexiones);
        dot.append("}");
        return dot.toString();
    }

    public void grafico(String ventanilla) throws IOException {
        try {
            File file = new File("C:\\Users\\denni\\Desktopila.dot");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(this.generar_dot(ventanilla));
            bw.close();

            ProcessBuilder pbuilderp;

            pbuilderp = new ProcessBuilder("dot", "-Tpng", "-o",
                    "C:\\Users\\denni\\Desktop\\pila.png",
                    "C:\\Users\\denni\\Desktop\\pila.dot");
            pbuilderp.redirectErrorStream(true);
            //Ejecuta el proceso
            pbuilderp.start();

            File f = new File("" +
                    "C:\\Users\\denni\\Desktop\\pila.png");
            if (!f.exists()) {
                f.createNewFile();
            }
            Desktop.getDesktop().open(f);

        } catch (FileNotFoundException e) {
            System.out.println("error");
        } catch (IOException E) {
            System.out.println("error");
        }
    }
}

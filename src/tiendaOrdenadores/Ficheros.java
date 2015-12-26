package tiendaOrdenadores;

import java.io.*;

public class Ficheros {
    private FileInputStream fileI;
    private ObjectInputStream input;
    private FileOutputStream fileO;
    private ObjectOutputStream output;

    public void abrirLeer(String fichero)
        throws IOException
    {
        fileI = new FileInputStream (fichero);
        input = new ObjectInputStream (fileI);
    }

    public void abrirEscribir(String fichero)
            throws IOException
    {
        fileO = new FileOutputStream (fichero);
        output = new ObjectOutputStream (fileO);
    }

    public Formula1 leer() throws IOException, ClassNotFoundException  {
        Formula1 f=null;
        if (input!=null) {
                f=(Formula1) input.readObject();
                Escuderia.contador = input.readInt();
        }
       return f;
    }

    public void escribir (Formula1 f)
            throws IOException
    {
        if (output!=null)
            output.writeObject(f);
            output.writeInt(Escuderia.contador);
    }

    public void cerrar() throws IOException{
        if(output != null){
            output.close();
        }
        else if(input != null){
            input.close();
        }
    }
}

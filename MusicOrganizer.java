import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index) == true) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
    
    /**
     * nuevo metodo checkIndex toma un par�metro entero y
     *comprueba que sea un �ndice v�lido para el atributo files
     */
    public void checkIndex(int indice)
    {
       if(indice >= 0 && indice < files.size())
       {
       }
       else
       {
         
         System.out.println("numero no valido, el rango de la lista es :" + files.size()+ " contando el 1 como 0 ");
       }
    
    }
    
    
    /**
     * m�todo llamado validIndex que devuelva un valor booleano en funci�n de si 
     *su par�metro entero es un �ndice v�lido o no para el atributo files.
     * m�todo no muestra nada por pantalla en ning�n caso.
     */
    public boolean validIndex(int indice)
    {
       boolean indiceValido = false;
       if(indice >= 0 && indice < files.size())
       {
           indiceValido = true;
        
       }
         return indiceValido;
    
    }
}

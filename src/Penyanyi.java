
import Pop.Pop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Niko Rianr
 * Kelas TI-B
 * 21104410083
 */
public class Penyanyi{
    
    public static void main(String[]args){
        Pop pop = new Pop ("Black Pink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        pop.singer("Eclat story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        String penyanyi;
        penyanyi = dangdut.penyanyi;
        dangdut.song( "Kopi Dangdut");
        dangdut.cetakLabel();
        
    }

}

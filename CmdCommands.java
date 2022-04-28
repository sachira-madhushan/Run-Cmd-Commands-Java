import java.io.IOException;
import java.lang.Process.*;
public class CmdCommands{
    void cleanScreen(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    }
}

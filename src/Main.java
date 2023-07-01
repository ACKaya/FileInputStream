import java.io.File;
import java.io.FileInputStream;
public class Main {
    public static void main(String[] args) {
        try{
            FileInputStream file=new FileInputStream("test1/test1.txt");
            int i= file.read();
            System.out.println(file.available());
            file.skip(10);
            while(i!=-1){
                System.out.print((char)i);
                i=file.read();
            }
            file.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
package system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileApp {

    public static void main(String[] argc) {
        System.out.println("copying file");
        File filein  = new File(argc[0]);
        File fileout = new File(argc[1]);
        FileInputStream fin  = null;
        FileOutputStream fout = null;
        long length  = filein.length();
        long counter = 0;
        int r = 0;
        byte[] b = new byte[1024];
        try {
            fin  = new FileInputStream(filein);
            fout = new FileOutputStream(fileout);
            while( (r = fin.read(b)) != -1) {
                counter += r;
                System.out.println( 1.0 * counter / length );
                fout.write(b, 0, r);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

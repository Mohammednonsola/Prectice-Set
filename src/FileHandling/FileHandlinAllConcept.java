package FileHandling;

import java.io.*;

public class FileHandlinAllConcept {

    public static void main(String[] args) {
//        File f=new File("D:\\git\\tetfile");
//     try {
//       boolean mkdir = f.exists();
//        boolean mkdir = f.createNewFile();
//         boolean mkdir = f.delete();
//         boolean mkdir = f.mkdir();
//         boolean mkdir = f.canExecute();
//
//
//         System.out.println(mkdir);
//     } catch (Exception e) {
//         System.out.println(e);
//     }
//    }
//        try {
//
//            FileWriter fr=new FileWriter("D:\\git\\B.txt");
//            BufferedWriter bf=new BufferedWriter(fr);
//             bf.write("mohammed");
//             bf.newLine();
//             bf.write("nonsola");
//             bf.newLine();
//          bf.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }


        try {
            File f= new File("D:\\git\\B.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.print(e);
        }


    }


}

// import java.io.BufferedOutputStream;
// import java.io.DataInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.BufferedInputStream;
// import java.io.DataInputStream;
// import javax.swing.plaf.FontUIResource;

// //Creating a text file using buffer output strening
// public class CreateFile {
//   public static void main(String[] args) {
//       //Atach keybord to datainputstream
//       DataInputStream dis=new DataInputStream(System.in);
//       //Attach myfile to fileoutputstream
//       BufferedInputStream bout=new BufferedInputStream(Fout. 1024);
//       System.out.println("Enter the text (@ at the end)");
//       char ch;
//       //read charecters from dis to ch. Then write them into bout
//       //repeat this as long as the read charecter is @
//       while((ch=(char)dis.read()) !='@');
//       bout.write(ch);
//       //close the file 
//       bout.close();
//   }  
// }

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
      // Attach keyboard to DataInputStream
      try (DataInputStream dis = new DataInputStream(System.in);
           FileOutputStream fout = new FileOutputStream("myfile.txt");
           BufferedOutputStream bout = new BufferedOutputStream(fout, 1024)) {

          System.out.println("Enter the text (@ at the end):");
          char ch;
          // Read characters from dis to ch. Then write them into bout
          // Repeat this until the read character is '@'
          while ((ch = (char) dis.read()) != '@') {
              bout.write(ch);
          }

          // Flush and close the BufferedOutputStream
          bout.flush();
          System.out.println("File created successfully.");
          
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}


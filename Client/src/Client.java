import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket =null;

        // reads characters from server
        InputStreamReader inputStreamReader=null;

        // character based output stream
        OutputStreamWriter outputStreamWriter=null;

        // instead of reading one character a time, use buffer to read blocks of characterss
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;

        try {
            socket = new Socket("localhost",1234);
            inputStreamReader= new InputStreamReader(socket.getInputStream());
            outputStreamWriter= new OutputStreamWriter(socket.getOutputStream());

            bufferedReader= new BufferedReader(inputStreamReader);
            bufferedWriter= new BufferedWriter(outputStreamWriter);

            Scanner scanner= new Scanner(System.in);

            while(true){
                String msgToSend = scanner.nextLine();
                bufferedWriter.write(msgToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.println( "Server: " + bufferedReader.readLine());

                if(msgToSend.equalsIgnoreCase("Bye"))
                    break;
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // executes after try block exits
        finally {
            try {
                if (socket != null)
                    socket.close();
                if (inputStreamReader != null)
                    inputStreamReader.close();
                if (outputStreamWriter != null)
                    outputStreamWriter.close();
                if (bufferedReader != null)
                    bufferedReader.close();
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.DoubleToIntFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Server {
    public static void main(String[] args) throws IOException {
        Socket socket =null;

        // reads characters from server
        InputStreamReader inputStreamReader=null;

        // character based output stream
        OutputStreamWriter outputStreamWriter=null;

        // instead of reading one character a time, use buffer to read blocks of characterss
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;

        // waits for reequests on network
        ServerSocket serverSocket=null;

        serverSocket=new ServerSocket(1234);

        while(true)
            try{
                socket =serverSocket.accept();

                inputStreamReader=new InputStreamReader(socket.getInputStream());
                outputStreamWriter= new OutputStreamWriter(socket.getOutputStream());

                bufferedReader=new BufferedReader(inputStreamReader);
                bufferedWriter=new BufferedWriter(outputStreamWriter);

                while (true){
                    String msgFromClient =bufferedReader.readLine();

                    System.out.println("Client: "+msgFromClient);

                    bufferedWriter.write("Message Received.");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    if(msgFromClient.equalsIgnoreCase("bye"))
                        break;
                }
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

/**
 *
 * @author tanagishunsuke
 */
import java.io.*; 
import java.net.*; 
import java.util.Random;

class TCPServer { 

  public static void main(String argv[]) throws Exception 
    { 
      String clientSentence; 
      String capitalizedSentence;
     
      ServerSocket welcomeSocket = new ServerSocket(6789); 
  
      while(true) { 
  
           Socket connectionSocket = welcomeSocket.accept(); 

           BufferedReader inFromClient = 
              new BufferedReader(new
              InputStreamReader(connectionSocket.getInputStream())); 

           DataOutputStream  outToClient = 
             new DataOutputStream(connectionSocket.getOutputStream()); 

           clientSentence = inFromClient.readLine(); 
           capitalizedSentence = "hello!nice to meet you!";
          
           
          
            outToClient.writeBytes(capitalizedSentence +  '\n');
           
      } 
    }
}
    

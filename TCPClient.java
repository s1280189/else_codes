/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

/**
 *
 * @author tanagishunsuke
 */
import java.io.*; 
import java.net.*; 
class TCPClient { 

    public static void main(String argv[]) throws Exception 
    { 
        String sentence; 
        String modifiedSentence; 
        System.out.println("Hello<->hello!nice to meet you!");

        BufferedReader inFromUser = 
          new BufferedReader(new InputStreamReader(System.in)); 

        Socket clientSocket = new Socket("localhost", 6789); 

        DataOutputStream outToServer = 
          new DataOutputStream(clientSocket.getOutputStream()); 

        BufferedReader inFromServer = 
          new BufferedReader(new
          InputStreamReader(clientSocket.getInputStream())); 

        sentence = inFromUser.readLine(); 
         outToServer.writeBytes(sentence + '\n');

        modifiedSentence = inFromServer.readLine(); 
        System.out.println("FROM SERVER: " + modifiedSentence);

        clientSocket.close(); 
                   
    } 
}
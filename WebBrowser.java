package webbrowser;

import javax.swing.*;
import java.awt.*;
import javafx.application.Platform;
import javafx.embed.swing.*;
import javafx.scene.web.WebView;
import javafx.scene.Scene;

public class WebBrowser implements Runnable{
    JFrame frame;
    Container c;
    JFXPanel panel;
    public void run(){         
        frame=new JFrame();
        frame.setBounds(0,0,2000,900);
        frame.setTitle("ATM Broser");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);      
        
        
        c=frame.getContentPane();
        c.setLayout(null);
        
        panel=new JFXPanel();
        panel.setBounds(0,0,1000,600);
        frame.add(panel);
        
        Platform.runLater(() -> {
            WebView webview=new WebView();
            webview.getEngine().load("https://www.google.com");
            panel.setScene(new Scene(webview));
        });
        
        frame.setVisible(true);
    }
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new WebBrowser());         
    }
    
}

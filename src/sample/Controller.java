package sample;

/**
 * Created by Fatima USF on 13/01/17.
 */

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller{

        float data=0f;
        int operation =-1;
    @FXML
    private JFXButton set;

    @FXML
    private JFXButton ouit;

    @FXML
    private JFXButton neuf;

    @FXML
    private JFXButton moin;

    @FXML
    private JFXButton cate;

    @FXML


    private JFXButton one;

    @FXML
    private JFXButton egale;

    @FXML
    private JFXButton sinc;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton troi;

    @FXML
    private JFXButton c;

    @FXML
    private JFXButton plus;

    @FXML
    private JFXButton produit;

    @FXML
    private JFXButton devise;
    @FXML
    private TextField text;

    @FXML
    public void action (ActionEvent event){
        if(event.getSource()==one){

            text.setText(text.getText()+"1");

        }else if((event.getSource()==two)){

            text.setText(text.getText()+"2");
        }else if((event.getSource()==troi)){

            text.setText(text.getText()+"3");
        }else if((event.getSource()==cate)){

            text.setText(text.getText()+"4");
        }else if((event.getSource()==sinc)){

            text.setText(text.getText()+"5");
        }else if((event.getSource()==six)){

            text.setText(text.getText()+"6");
        }else if((event.getSource()==set)){

            text.setText(text.getText()+"7");
        }else if((event.getSource()==ouit)){

            text.setText(text.getText()+"8");
        }else if((event.getSource()==neuf)){

            text.setText(text.getText()+"9");
        }else if((event.getSource()==zero)){

            text.setText(text.getText()+"0");
        }
        else if((event.getSource()==c)){

            text.setText(" ");

        }
        else if((event.getSource()==plus)){
            data=Float.parseFloat(text.getText());
            operation=1;//addition
            text.setText(" ");

        }
        else if((event.getSource()==moin)){
            data=Float.parseFloat(text.getText());
            operation=2;//soust
            text.setText(" ");

        }
        else if((event.getSource()==produit)){
            data=Float.parseFloat(text.getText());
            operation=3;//produit
            text.setText(" ");

        }
        else if((event.getSource()==devise)){
            data=Float.parseFloat(text.getText());
            operation=4;//devise
            text.setText(" ");

        }
        else if((event.getSource()==egale)){
            Float secondOperand= Float.parseFloat(text.getText());
            switch (operation){
                case 1:
                    Float op= data+secondOperand;
                    text.setText(String.valueOf(op));
                    break;
                case 2:
                     op= data-secondOperand;
                    text.setText(String.valueOf(op));
                    break;
                case 3:
                    op= data*secondOperand;
                    text.setText(String.valueOf(op));
                    break;
                case 4:
                    op=0f;
                    try{
                    op= data/secondOperand;
                    } catch (ArithmeticException  e){
                        text.setText("erreur");
                    }
                    text.setText(String.valueOf(op));
                    break;

            }

        }


    }


}

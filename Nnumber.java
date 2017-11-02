import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Nnumber extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX N");
        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 500, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Welcome, please enter a number N");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label nnumber = new Label("Number N");
        grid.add(nnumber, 0, 3);

        TextField nTextField = new TextField();
        grid.add(nTextField, 1, 3);

        Button btn = new Button("Start");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 5);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                String stringn=nTextField.getText();
                int n =  Integer.valueOf(stringn);

                int f=1;
                int m=1;
                while(m<=n){
                     f=f*m;
                     m++;
                }


                int s=0;
                for(int m2=1;m2<n*2;m2+=2){
                    s=s+m2;
                }


                int x=1;
                int y=1;
                int m3=3;

                if(n==1){
                    System.out.println("0");
                }

                else if(n==2){
                    System.out.println("0"+"\n1");
                }

                else if(n>2){
                    System.out.println("0"+"\n1");
                    do{
                        if(x>y){
                            System.out.println(x);
                            y=y+x;
                        }
                        else{
                            System.out.println(y);
                            x=x+y;}
                            m3++;
                    }while(m3<=n);
                }
                int z;
                if(n==1){
                    z=0;
                }
                else if(x>y) {
                    z=y;
                }
                else{
                    z=x;
                }

                primaryStage.close();

                Stage secondstage=new Stage();
                secondstage.setTitle("Calculated Results");
                secondstage.show();

                GridPane grid2 = new GridPane();
                grid2.setAlignment(Pos.CENTER);
                grid2.setHgap(10);
                grid2.setVgap(10);
                grid2.setPadding(new Insets(25, 25, 25, 25));

                Scene scene2 = new Scene(grid2, 500, 275);
                secondstage.setScene(scene2);

                Text scene2title = new Text("The results are shown below");
                scene2title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
                grid2.add(scene2title, 0, 0, 2, 1);

                Text scene2text=new Text("A factorial of N numbers: "+f+
                        "\nA sum of first N odd numbers:"+s+
                        "\nThe Nst(nd/th) Fibonacci number: "+z);
                scene2text.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
                grid2.add(scene2text,0,1,3,3);


                Button btn2=new Button("Close");
                HBox hbBtn2 = new HBox(10);
                hbBtn2.setAlignment(Pos.BOTTOM_LEFT);
                hbBtn2.getChildren().add(btn2);
                grid2.add(hbBtn2, 1, 5);
                btn2.setOnAction(new EventHandler<ActionEvent>() {


                    @Override
                    public void handle(ActionEvent e) {
                       secondstage.close();
                    }
                });

            }

        });

        }

}

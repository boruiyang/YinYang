package cs280.homework;



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by XIE_XIAO on 4/21/2016.
 */
public class yinyangtaiji extends Application {

    private double x_coordinate = 0;
    private double y_coordinate = 0;
    public void start(Stage stage) {
        Group root = new Group();
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                x_coordinate = event.getSceneX();
                y_coordinate = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - x_coordinate);
                stage.setY(event.getScreenY() - y_coordinate);
            }
        });
        Canvas canvas = new Canvas(530, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Rectangle colors = new Rectangle(530, 500,
                new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop[]{
                        new Stop(0, Color.web( "white",0.9 )),
                        new Stop(0.14, Color.web( "black",0.9 )),
                        new Stop(0.28,Color.web( "white",0.9 )),
                        new Stop(0.43, Color.web( "black",0.9 )),
                        new Stop(0.57, Color.web( "white",0.9 )),
                        new Stop(0.71, Color.web( "black",0.9 )),
                        new Stop(0.85, Color.web( "white",0.9 )),
                        new Stop(1, Color.web( "black",0.9 )),
                }));

        Circle circle = new Circle( 265,250,165 );
        circle.setFill( Color.web( "white",0.8 ) );
        circle.setStrokeType( StrokeType.OUTSIDE );
        circle.setStroke(Color.web( "black",0.8 ));
        circle.setStrokeWidth( 5 );
        circle.setEffect( new GaussianBlur() );

        Text yin = new Text( "阴" );
        yin.setX( 5 );
        yin.setY( 100 );
        yin.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yin.setFill( Color.WHITE );
        yin.setStrokeType( StrokeType.OUTSIDE );
        yin.setStroke(Color.web( "black",0.70 ));
        yin.setStrokeWidth(5);
        Text yang = new Text( "阳" );
        yang.setX( 5 );
        yang.setY( 200 );
        yang.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yang.setFill( Color.WHITE );
        yang.setStrokeType( StrokeType.OUTSIDE );
        yang.setStroke(Color.web( "black",0.70 ));
        yang.setStrokeWidth(5);
        Text liang = new Text( "两" );
        liang.setX( 5 );
        liang.setY( 300 );
        liang.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        liang.setFill( Color.WHITE );
        liang.setStrokeType( StrokeType.OUTSIDE );
        liang.setStroke(Color.web( "black",0.70 ));
        liang.setStrokeWidth(5);
        Text yi = new Text( "仪" );
        yi.setX( 5 );
        yi.setY( 400 );
        yi.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yi.setFill( Color.WHITE );
        yi.setStrokeType( StrokeType.OUTSIDE );
        yi.setStroke(Color.web( "black",0.70 ));
        yi.setStrokeWidth(5);
        Text dao = new Text( "道" );
        dao.setX( 440 );
        dao.setY( 100 );
        dao.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        dao.setFill( Color.WHITE );
        dao.setStrokeType( StrokeType.OUTSIDE );
        dao.setStroke(Color.web( "black",0.70 ));
        dao.setStrokeWidth(5);
        Text wu = new Text( "无" );
        wu.setX( 440 );
        wu.setY( 200 );
        wu.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        wu.setFill( Color.WHITE );
        wu.setStrokeType( StrokeType.OUTSIDE );
        wu.setStroke(Color.web( "black",0.70 ));
        wu.setStrokeWidth(5);
        Text ji = new Text( "极" );
        ji.setX( 440 );
        ji.setY( 300 );
        ji.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        ji.setFill( Color.WHITE );
        ji.setStrokeType( StrokeType.OUTSIDE );
        ji.setStroke(Color.web( "black",0.70 ));
        ji.setStrokeWidth(5);
        Text xian= new Text( "限" );
        xian.setX( 440 );
        xian.setY( 400 );
        xian.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        xian.setFill( Color.WHITE );
        xian.setStrokeType( StrokeType.OUTSIDE );
        xian.setStroke(Color.web( "black",0.70 ));
        xian.setStrokeWidth(5);
        gc.setFill(Color.web( "white",0.85 ));
        gc.fillArc(115,100,300,300,90,180, ArcType.OPEN);
        gc.setFill(Color.web( "black",0.85 ));
        gc.fillArc(115, 100, 300, 300, 270, 180, ArcType.OPEN);
        gc.fillArc(190,250,150,150,90,180,ArcType.OPEN);
        gc.setFill(Color.web( "white" ));
        gc.fillArc(190, 100, 150, 150, 270, 180, ArcType.OPEN);
        gc.setFill(Color.web( "white",0.95 ));
        gc.fillOval(250,300,40,40);
        gc.setFill(Color.web( "black",0.85 ));
        gc.fillOval(250, 150, 40, 40);

        root.getChildren().add(colors);
        root.getChildren().addAll( circle, yin,yang,liang,yi,dao,wu,ji,xian );

        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
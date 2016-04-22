package cs280.homework;



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Shadow;
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

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.WHITE;

/**
 * YinYang Symbol
 * Created by XIE_XIAO on 4/21/2016.
 */
public class yinyangtaiji extends Application {

    private double x_coordinate = 0;
    private double y_coordinate = 0;

    public static void main( String[] args ) {
        launch();
    }

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
        Canvas canvas = new Canvas( 630, 600 );
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Rectangle colors = new Rectangle( 550, 520,
                new LinearGradient( 0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop( 0, Color.web( "white", 0.9 ) ),
                        new Stop(0.14, Color.web( "black",0.9 )),
                        new Stop(0.28,Color.web( "white",0.9 )),
                        new Stop(0.43, Color.web( "black",0.9 )),
                        new Stop(0.57, Color.web( "white",0.9 )),
                        new Stop(0.71, Color.web( "black",0.9 )),
                        new Stop(0.85, Color.web( "white",0.9 )),
                        new Stop( 1, Color.web( "black", 0.9 ) ) ) );
        colors.setX( 37 );
        colors.setY( 38 );

        Rectangle blackRec = new Rectangle( canvas.getWidth(), canvas.getHeight() );
        blackRec.setFill( Color.BLACK );
        blackRec.setEffect(new Shadow());

        Rectangle whiteRec = new Rectangle( 580, 550 );
        whiteRec.setFill( Color.WHITE );
        whiteRec.setX( 23 );
        whiteRec.setY( 24 );
        whiteRec.setEffect(new GaussianBlur());

//        whiteRec.setEffect( new GaussianBlur() );


        Circle circle = new Circle(313, 305, 165);
        circle.setFill( Color.web( "white",0.8 ) );
        circle.setStrokeType( StrokeType.OUTSIDE );
        circle.setStroke(Color.web( "black",0.8 ));
        circle.setStrokeWidth( 5 );
        circle.setEffect( new GaussianBlur() );

        Text yin = new Text( "阴" );
        yin.setX( 50 );
        yin.setY( 135 );
        yin.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yin.setFill( WHITE );
        yin.setStrokeType( StrokeType.OUTSIDE );
        yin.setStroke(Color.web( "black",0.70 ));
        yin.setStrokeWidth(5);
        Text yang = new Text( "阳" );
        yang.setX( 50 );
        yang.setY( 255 );
        yang.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yang.setFill( WHITE );
        yang.setStrokeType( StrokeType.OUTSIDE );
        yang.setStroke(Color.web( "black",0.70 ));
        yang.setStrokeWidth(5);
        Text liang = new Text( "两" );
        liang.setX( 50 );
        liang.setY( 355 );
        liang.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        liang.setFill( WHITE );
        liang.setStrokeType( StrokeType.OUTSIDE );
        liang.setStroke(Color.web( "black",0.70 ));
        liang.setStrokeWidth(5);
        Text yi = new Text( "仪" );
        yi.setX( 50 );
        yi.setY( 455 );
        yi.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        yi.setFill( WHITE );
        yi.setStrokeType( StrokeType.OUTSIDE );
        yi.setStroke(Color.web( "black",0.70 ));
        yi.setStrokeWidth(5);
        Text dao = new Text( "道" );
        dao.setX( 495 );
        dao.setY( 135 );
        dao.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        dao.setFill( WHITE );
        dao.setStrokeType( StrokeType.OUTSIDE );
        dao.setStroke(Color.web( "black",0.70 ));
        dao.setStrokeWidth(5);
        Text wu = new Text( "无" );
        wu.setX( 495 );
        wu.setY( 255 );
        wu.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        wu.setFill( WHITE );
        wu.setStrokeType( StrokeType.OUTSIDE );
        wu.setStroke(Color.web( "black",0.70 ));
        wu.setStrokeWidth(5);
        Text ji = new Text( "极" );
        ji.setX( 495 );
        ji.setY( 355 );
        ji.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        ji.setFill( WHITE );
        ji.setStrokeType( StrokeType.OUTSIDE );
        ji.setStroke(Color.web( "black",0.70 ));
        ji.setStrokeWidth(5);
        Text xian= new Text( "限" );
        xian.setX( 495 );
        xian.setY( 455 );
        xian.setFont( Font.font("汉仪雪君体繁", FontWeight.BOLD,80 ));
        xian.setFill( WHITE );
        xian.setStrokeType( StrokeType.OUTSIDE );
        xian.setStroke(Color.web( "black",0.70 ));
        xian.setStrokeWidth(5);


        gc.setFill(WHITE);
        gc.fillArc(163, 155, 300, 300, 90, 180, ArcType.OPEN);

        gc.setFill(BLACK);
        gc.fillArc(163, 155, 300, 300, 270, 180, ArcType.OPEN);

        gc.fillArc(238, 305, 150, 150, 90, 180, ArcType.OPEN);

        gc.setFill(WHITE);
        gc.fillArc(238, 155, 150, 150, 270, 180, ArcType.OPEN);
        gc.setFill(Color.web( "white",0.95 ));


        gc.fillOval(298, 355, 40, 40);
        gc.setFill(BLACK);
        gc.fillOval(298, 205, 40, 40);

        root.getChildren().add( blackRec );
        root.getChildren().add( whiteRec );
        root.getChildren().add(colors);
        root.getChildren().addAll( circle, yin,yang,liang,yi,dao,wu,ji,xian );

        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }

    public void handle(MouseEvent event) {

    }
}
//Author Name: Kylie Fauquher
//Date: 02/20/2022
//Program Name: Fauquher_LineChart
//Purpose: A default line chart that supports multiple lines, use as needed!


package line;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;

public class linechart extends Application {
		
		//Method for the line chart
		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override public void start(Stage stage) throws IOException {
			        stage.setTitle("Default Line Chart");

			        final NumberAxis xAxis = new NumberAxis();
			        final NumberAxis yAxis = new NumberAxis();
			        
			        //Creating the outer most labels for your line chart
			        xAxis.setLabel("Information Here");
			        yAxis.setLabel("Information Here");
			        
			        //Size of your line chart
			        LineChart chart = new LineChart(xAxis, yAxis);
			        Scene scene = new Scene(chart, 800, 600);
			        
			        //Bottom label for line 1
			        XYChart.Series series1 = new XYChart.Series();
			        series1.setName("Information Here");
			        
			        series1.getData().add(new XYChart.Data(1, 2000));
			        series1.getData().add(new XYChart.Data(2, 4000));
			        series1.getData().add(new XYChart.Data(3, 6000));
			        series1.getData().add(new XYChart.Data(4, 8000));
			        
			        //Bottom label for line 2
			        XYChart.Series series2 = new XYChart.Series();
			        series2.setName("Information Here");
			      
			        series2.getData().add(new XYChart.Data(1, 1000));
			        series2.getData().add(new XYChart.Data(2, 3000));
			        series2.getData().add(new XYChart.Data(3, 5000));
			        series2.getData().add(new XYChart.Data(4, 7000));
			        
			        //Prints the data you entered for line 1 and 2
			        chart.getData().addAll(series1, series2);

			        stage.setScene(scene);
			        stage.show();
			        
			        
			    }
		 
	    public static void main(String[] args) {
    	
	    	//Launches line chart in new window
	        launch(args);
	            
	    }
}
	
	        
	






		  

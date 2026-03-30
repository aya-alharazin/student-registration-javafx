package javafx2.pkgfinal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class week4 extends Application implements EventHandler<ActionEvent>{

    ComboBox<String> id;
    TextField name;
    RadioButton male;
    RadioButton female;
    ToggleGroup tg;
    ListView<String> preferedPL;
    ListView<String> selectedPL;
    String[] pl = {"Java", "Python", "JS", "PHP", "Scala"};
    Button save;
    Button arrow;
    CheckBox c1, c2, c3;
    RadioButton r1, r2, r3;
    ComboBox<Integer> cb;
    ColorPicker cp;
    

    ListView<String> studentList;
    BorderPane root;
    Label title;
    Label message;
    ArrayList<Student> studnets=new ArrayList<>();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        // =========================
        // Student controls
        // =========================
        id = new ComboBox<>();
        id.setPromptText("Select ID");
        id.setPrefWidth(200);

        name = new TextField();
        name.setPromptText("Enter student name");
        name.setPrefWidth(200);

        male = new RadioButton("Male");
        female = new RadioButton("Female");
        tg = new ToggleGroup();
        male.setToggleGroup(tg);
        female.setToggleGroup(tg);

        ObservableList<String> ol = FXCollections.observableArrayList(pl);
        preferedPL = new ListView<>(ol);
        selectedPL = new ListView<>();
        preferedPL.setPrefSize(150, 120);
        selectedPL.setPrefSize(150, 120);
        
        preferedPL.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        arrow=new Button("..");
        save = new Button("Save");
        save.setPrefWidth(100);
        message = new Label("");
        message.setStyle("-fx-text-fill: red;");
        // =========================
        // Design controls
        // =========================
        c1 = new CheckBox("Normal");
        c2 = new CheckBox("Bold");
        c3 = new CheckBox("Italic");

        r1 = new RadioButton("Red");
        r2 = new RadioButton("Green");
        r3 = new RadioButton("Blue");

        ToggleGroup tg2 = new ToggleGroup();
        r1.setToggleGroup(tg2);
        r2.setToggleGroup(tg2);
        r3.setToggleGroup(tg2);

        cb = new ComboBox<>();
        cb.getItems().addAll(5,10, 15,20);
        cb.setValue(10);
        cb.setPrefWidth(120);

        cp = new ColorPicker();
        cp.setValue(Color.WHITE);

        // =========================
        // Right side list
        // =========================
        studentList = new ListView<>();
        studentList.setPrefSize(250, 350);
        // =========================
        // Left panel
        // =========================
        Label designTitle = new Label("Design Tools");

        VBox leftBox = new VBox(12);
        leftBox.setPadding(new Insets(20));
        leftBox.setAlignment(Pos.TOP_LEFT);
        leftBox.setPrefWidth(180);

        leftBox.getChildren().addAll(
                designTitle,
                new Label("Style"),
                c1, c2, c3,
                new Label("Color"),
                r1, r2, r3,
                new Label("Font Size"),
                cb,
                new Label("Custom Color"),
                cp
        );

        // =========================
        // Center panel
        // =========================
        title = new Label("Student Registration System");

        HBox genderBox = new HBox(15, male, female);
        genderBox.setAlignment(Pos.CENTER_LEFT);

        HBox plBox = new HBox(20, preferedPL, arrow,selectedPL);
        plBox.setAlignment(Pos.CENTER_LEFT);

        GridPane formGrid = new GridPane();
        formGrid.setHgap(15);
        formGrid.setVgap(18);
        formGrid.setAlignment(Pos.TOP_LEFT);
        formGrid.setPadding(new Insets(20));

        formGrid.add(title, 0, 0, 2, 1);

        formGrid.add(new Label("ID:"), 0, 1);
        formGrid.add(id, 1, 1);

        formGrid.add(new Label("Name:"), 0, 2);
        formGrid.add(name, 1, 2);

        formGrid.add(new Label("Gender:"), 0, 3);
        formGrid.add(genderBox, 1, 3);

        formGrid.add(new Label("PL:"), 0, 4);
        formGrid.add(plBox, 1, 4);

        formGrid.add(save, 1, 5);
        formGrid.add(message, 1, 6);

        VBox centerBox = new VBox();
        centerBox.setPadding(new Insets(20));
        centerBox.setAlignment(Pos.TOP_CENTER);
        centerBox.getChildren().add(formGrid);

        // =========================
        // Right panel
        // =========================
        Label savedTitle = new Label("Saved Students");

        VBox rightBox = new VBox(15);
        rightBox.setPadding(new Insets(20));
        rightBox.setAlignment(Pos.TOP_CENTER);
        rightBox.setPrefWidth(280);
        rightBox.getChildren().addAll(savedTitle, studentList);

        // =========================
        // Main layout
        // =========================
        root = new BorderPane();
        root.setPadding(new Insets(20));
        root.setLeft(leftBox);
        root.setCenter(centerBox);
        root.setRight(rightBox);
        // =========================
        // ids
        // =========================
        
        leftBox.setId("left-panel");
        centerBox.setId("center-panel");
        rightBox.setId("right-panel");
        formGrid.setId("form-grid");
        save.setId("save-btn");
        designTitle.setId("section-title");
        title.setId("main-title");
        savedTitle.setId("section-title");
        
        
        // =========================
        // Action Register
        // =========================
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        cp.setOnAction(this);
        cb.setOnAction(this);
        male.setOnAction(this);
        female.setOnAction(this);
        save.setOnAction(this);
        arrow.setOnAction(this);
        id.setOnAction(this);
        // =========================
        // Load All StudentsFrom File to Memory
        // =========================
        
        readFromFile();
        // =========================
        // Scene
        // =========================
        
        root.setStyle("-fx-font-family: 'Times New Roman' ");
        Scene scene = new Scene(root, 1000, 500);

        // use this only if style.css exists correctly
         scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setTitle("Student Registration System");
        stage.setScene(scene);
        stage.show();
        stage.setAlwaysOnTop(true);
        
        
        stage.setOnCloseRequest(event -> {
        System.out.println("User is closing the window!");
        saveStudentsToFile();
        
});
        
        
    }

    @Override
    public void handle(ActionEvent e) {
        String gender="";
        String backgroundColor="white";
        if(male.isSelected()){
            gender="male";
        }
        if(female.isSelected()){
            gender="female";
        }
        if(r1.isSelected()){
            backgroundColor="red";
        }
        if(r2.isSelected()){
            backgroundColor="green";
        }
        if(r3.isSelected()){
            backgroundColor="blue";
        }
        if(e.getSource() == cp){
            String hexColor=cp.getValue().toString().substring(2,8);
            System.out.println(hexColor);
            save.setStyle("-fx-background-color:#"+hexColor);
        }
        if(e.getSource() == save){
            if(validate()){
            String std_name= name.getText();
            Student s =new Student(std_name, gender);
            writeDataToStudentListView(s.getId(),s.getName());
            ArrayList<String> al=new ArrayList(selectedPL.getItems());
            s.setPl(al);
            studnets.add(s);
            id.getItems().add(s.getId());
            clear();
            }else{
                message.setText("name and gender are required! ");
            }
        }
        
        if(e.getSource()  == arrow){
            ObservableList<String> selectedItems =
            FXCollections.observableArrayList(preferedPL.getSelectionModel().getSelectedItems());

            selectedPL.getItems().addAll(selectedItems);
            preferedPL.getItems().removeAll(selectedItems);
            
        }
        
        if(e.getSource() == id){
            clear();
            String selectedId = id.getValue();
            Student selectedStd=null;
            for(Student s:studnets){
                if(s.getId().equals(selectedId)){
                    selectedStd=s;
                    break;
                }
            }
            name.setText(selectedStd.getName());
            if (selectedStd.getGender().equals("male")) {
                male.setSelected(true);
            } else {
                female.setSelected(true);
            }     
            preferedPL.getItems().removeAll(selectedStd.getPl());
            selectedPL.getItems().addAll(selectedStd.getPl());

        }
        
    root.setStyle(
        
        "-fx-font-size: " + cb.getValue() + "px;" +
        "-fx-font-weight: " + (c2.isSelected() ? "bold" : "normal") + ";" +
        "-fx-font-style: " + (c3.isSelected() ? "italic" : "normal") + ";"+
        "-fx-background-color : "+backgroundColor+";"
    );    
    
    }
    
    
    public void clear(){
        preferedPL.getItems().setAll(pl);
        selectedPL.getItems().clear();
        message.setText("");
        male.setSelected(false);
        female.setSelected(false);
        name.setText("");
    }
    
    
    public void saveStudentsToFile(){
        if(studnets == null || studnets.isEmpty()){
        System.out.println("Nothing to save.");
        return;
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/javafx2/pkgfinal/students.dat"))) {
        oos.writeObject(studnets);
            System.out.println("Student saved successfully!");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
    
    
public void readFromFile(){

    File file = new File("src/javafx2/pkgfinal/students.dat");

    if(!file.exists()){
        System.out.println("No file yet — starting fresh.");
        return; // exit the method safely
    }

    try (ObjectInputStream ois = new ObjectInputStream(
                                    new FileInputStream(file))) {
        studnets = (ArrayList<Student>) ois.readObject();
        System.out.println(studnets);
        for(Student s : studnets){
            id.getItems().add(s.getId());
            writeDataToStudentListView(s.getId(),s.getName());
        }
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    int id = 0;
    if(!studnets.isEmpty())
         id = Integer.parseInt(studnets.getLast().getId().substring(5));
    Student.counter=id+1;
}


public void writeDataToStudentListView(String id, String name){
    studentList.getItems().add(id+" - "+name);
}

    
    public boolean validate(){
        if(name.getText().isBlank() ||tg.getSelectedToggle() == null  )
            return false;
        return true;
    }


}
    
    
    
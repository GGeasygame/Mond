module ch.ictbz.mond.mond {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens ch.ictbz.mond.mond to javafx.fxml;
    exports ch.ictbz.mond.mond;
}
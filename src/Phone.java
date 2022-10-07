import java.util.ArrayList;

public class Phone {
    private String brand;
    private String model;
    private String releaseDate;
    private String cameraResolution;
    private String operatingSystem;


    public Phone(String brand, String model, String releaseDate, String cameraResolution, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.releaseDate = releaseDate;
        this.cameraResolution = cameraResolution;
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


}

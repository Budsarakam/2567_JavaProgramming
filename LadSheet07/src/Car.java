public class Car {
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;

    public Car ( String companyName , String modelName , int year , double mileage) {
        this.setCompanyName(companyName);
        this.setModeName(modelName);
        this.setYear(year);
        this.setmileage = mileage;
    }

    public Car{
        this.companyName = "Unknown";
        this.modelName = "Unknown";
        this.year = 2000;
        this.mileage = mileage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if(companyName == null || companyName().isEmtry()) {
            System.out.println("Error:Invalid company or model name!");
        }else {
            this.companyName = companyName;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setCompanyName(String modelName) {
        if(modelName == null || modelName.trim().isEmtry() {
            System.out.println("Error: Invalid company or model name!");
        }else {
            this.modelName = modelName;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1886) {
            System.out,println("Error:Invaid year!");
        }else {
            this.year = year;
        }
    }

    public double getmileage() {
        return mileage;
    }
}
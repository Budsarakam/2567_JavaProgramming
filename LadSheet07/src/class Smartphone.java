public class Smartphone {
    private static final int MIN_MODEL_LENGTH = 2;
    private static final int MIN_STORAGE_CAPACITY = 1;
    private static final int MIN_STORAGE_CAPACITY = 512;

    private String brand;
    private String model;
    private int storageCapacity;
    private int usedStorage;

    public Smartphone(String brand , String model , int storageCapacity) {
        this.brand = brand;
        setModel(model);
        setStorageCapacity(storageCapacity);
        this.usedStorage = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.length() < MIN_MODEL_LENGTH) {
            System.out.println("Error: Model must have at least 2 characters!");
        }else {
            this.model = model:
        }
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        if(storageCapacity < MIN_MODEL_CAPACITY || storageCapacity > MAX_STORAGE_CAPACITY) {
            System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
        }else {
            this.storageCapacity = storageCapacity;
        }
    }

    public int getUsedStorage() {
        return usedStorage;
    }

    public void setUsedStorage(int usedStorage) {
        if)usedStorage < 0 || usedStorage > storageCapacity) {
            System.out.println("Error: Used storage must be between 0 and " + storageCapacity + "GB!");
        }else {
            this.usedStorage = usedStorage;
        }
    }

    public void addAdditionalStorage(int addAdditionalStorage) {
        if(addAdditionalStorage <= 0) {
            System.out.println("Error: Additional storage nust be positive!");
        }else if (storageCapacity + addAdditionalStorage > MAX_STORAGE_CAPACITY) {
            System.out.println("Error : Storage capacity cannot exceed " + MAX_STORAGE_CAPACITY + "GB!");
        }else {
            storageCapacity += addAdditionalStorage;
        }
    }

    public void printDetails() {
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Storage Capacity : "+ storageCapacity +" GB");
    }
}
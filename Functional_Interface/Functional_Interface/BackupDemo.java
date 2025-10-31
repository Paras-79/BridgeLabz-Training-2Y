import java.io.Serializable;

class BackupData implements Serializable {
    String name = "Backup File";
    int version = 1;
}

public class BackupDemo {
    public static void main(String[] args) {
        BackupData data = new BackupData();
        System.out.println("Backup ready for: " + data.name);
    }
}

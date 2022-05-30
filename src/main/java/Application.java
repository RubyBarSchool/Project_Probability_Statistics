import entity.DataProvinceInVietNam;
import service.GetAllDataOfJSON;
import service.impl.GetAllDataOfJSONImpl;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        GetAllDataOfJSON iam = new GetAllDataOfJSONImpl();
        List<DataProvinceInVietNam> dataProvinceInVietNamList =  iam.getAll();
        // hiển thị độ tăng nhập cư của hà nội
        for(DataProvinceInVietNam db : dataProvinceInVietNamList){
            if(db.getName().equals("Haf Nội")){
                if(db.getYear()>2005 && db.getYear()<2016){

                }
            }
        }
        System.out.println("Hello");
    }
}

package Second_pack;
interface QuickLookOsSupport{  // supports I
    void QuickLook();
}
interface DeleteFileOsSupport{
    void DeleteFile();
}
interface Parameters{
    void DevicesSupported();
    int cost();
}
class  OperatingSystem {
    Parameters param;
    public  OperatingSystem(){
        this.param=param;
    }
    public  String nameofOS(){
        return "Operating Systems";
    }
}
class DevicesSupported implements  Parameters{ // supports S
    @Override
    public void DevicesSupported() {
       //
    }
    @Override
    public int cost() {
        return 0;
    }
}
class  Cost implements  Parameters{  // Supports S
    @Override
    public void DevicesSupported() {
        //
    }
    @Override
    public int cost() {
        return 0;
    }
}
class Mac extends OperatingSystem implements QuickLookOsSupport,DeleteFileOsSupport{  // supports L
    public  String nameofOS(){
        return "MAC Operating System";
    };
    @Override
    public void QuickLook() {
       //
    }
    @Override
    public void DeleteFile() {
      //
    }
}
//  Supports Open Closed
interface  OSNames{  // Supports O
    public  String nameofOS();
}
class Windows implements OSNames{
    public  String nameofOS(){
        return "Second_pack.Windows Operating System";
    };
}
class MacOS implements  OSNames{
    public  String nameofOS(){
        return "Second_pack.Windows Operating System";
    };
}
class namesOfOperatingSystems{
    String nameofOperatingSystem(OSNames o) {
        return o.nameofOS();
      }
    }

interface WindowsInterface{ // supports D
    public void functions();
}
class Windows10Upgraded{  // supports D
    WindowsInterface w;
    public Windows10Upgraded(WindowsInterface w){
        this.w=w;
    }
    public void functions(){
        //
    }

}
public class After_Modification {
    public static void  MyOperatingSystem(OperatingSystem os){
        System.out.print(os.nameofOS());
    }
    public static void main(String[] args) {
        //MyOperatingSystem(new Windows());
    }
}

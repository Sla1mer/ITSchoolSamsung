package Module_3;

import java.io.File;

public class Terminator {
    public void deleteFiles(String[] fileNames){
        for(int i = 0; i<fileNames.length; i++){
            File file = new File(fileNames[i]);
            if(file.exists()&&file.isFile()){
                file.delete();
            }
        }
    }

}

import java.io.*;
public class getFileInformation {
    public static void getPaths (File f) throws Exception {
        System.out.println("Name : " + f.getName());
        System.out.println("Path : " + f.getPath());
        System.out.println("Parent : " + f.getParent());
    }
    public static void getInfo(File f) throws IOException{
        if(f.exists()){
            System.out.println("File exists");
            System.out.println(f.canRead() ? "and is Readable " : "");
            System.out.println("File is Last Modified: " + f.lastModified());
            System.out.println("File is " + f.length() + "Bytes");
        }
        else System.err.println("File Does Not Exist");
    }

    public static void main(String[] args) throws Exception {
        File fileToCheck;
        if(args.length > 0){
            for(int i=0;i<args.length;i++){
                fileToCheck = new File(args[i]);
                getPaths(fileToCheck);
                getInfo(fileToCheck);
            }
        }
        else {
            System.out.println("Usage : Java file Test <filename (s) >");
        }

    }
}

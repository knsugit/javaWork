import java.io.*;

class FileTest1 {
    public static void main(String[] args) {
        String path;
        if(args.length != 1) {
            System.err.println("Usage:java FileTest1 <File or Dir>");
            System.exit(-1);
        }
        File f = new File(args[0]);
        if(f.exists()) {
            System.out.println("-----------------------------");
            System.out.println("Absolute Path: " + f.getAbsolutePath());
            System.out.println("File Path: " + f.getPath());
            System.out.println("File Name: " + f.getName());
            System.out.println("Parent Directory: " + f.getParent());
            System.out.println("-----------------------------");
            String canRead = f.canRead() ? "Yes" : "No";
            String canWrite = f.canWrite() ? "Yes" : "No";
            String isFile = f.isFile() ? "Yes" : "No";
            String isDir = f.isDirectory() ? "Yes" : "No";
            String isAbs = f.isAbsolute() ? "Yes" : "No";
            System.out.println("Readable: " + canRead);
            System.out.println("Writeable: " + canWrite);
            System.out.println("Is File: " + isFile);
            System.out.println("Is Directory: " + isDir);
            System.out.println("Is Absoulte: " + isAbs);
        }
        else {
            System.out.println("Cannot found file: " + args[0]);
        }
    }
}
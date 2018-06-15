package Lesson1_2;

public class BytesConverter {
    public static void main(String[] args) {
        long totalBytes = 1074791426; // Input: any valid number of bytes

        long gigaBytes = totalBytes/1073741824;
        long megaBytes = (totalBytes-1073741824*gigaBytes)/1048576;
        long kiloBytes = (totalBytes-1073741824*gigaBytes-1048576*megaBytes)/1024;
        long bytes = (totalBytes-1073741824*gigaBytes-1048576*megaBytes-1024*kiloBytes);

        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");
    }

}

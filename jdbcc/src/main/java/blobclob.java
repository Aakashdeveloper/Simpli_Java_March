
public class blobclob {

    public static void main(String[] args) throws Exception {
        try {
            ProductComponent comp = new ProductComponent();

            String prodLine = "Planes";

            Reader reader = comp.readCLOB(prodLine);

            int chr = 0;
            while ((chr = reader.read()) > 0) {
                System.out.write(chr);
            }

            reader.close();

        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}

public class Main_BLOB_Read {

    public static void main(String[] args) throws Exception {
        try {
            ProductComponent comp = new ProductComponent();

            String fileName = "Planes_Image.png";
            String prodLine = "Planes";

            InputStream inStream = comp.readBLOB(prodLine);

            if(inStream == null) {
                System.out.println("Could not read image data from database");
                return;
            }
            File file = new File(fileName);
            FileOutputStream output = new FileOutputStream(file);

            System.out.println("Writing image to file " + fileName);

            byte[] buffer = new byte[1024];
            while (inStream.read(buffer) > 0) {
                output.write(buffer);
            }

            inStream.close();
            output.close();

        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}


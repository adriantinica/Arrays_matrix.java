import java.util.ArrayList;
import java.util.UUID;
import java.util.zip.CRC32;

public class Array_diagonal{
   
    public static void main(String[] args) {
        
        short [][] matrice ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        ArrayList diagonala2 = new ArrayList<>(3);
        ArrayList diagonala1 = new ArrayList<>(3);

        int index;

        for ( index = 0; index < matrice.length; index++) {
            short prim = (matrice[index][index]);
            diagonala1.add(prim);
            


            short sec = (matrice[index][matrice.length-index-1]);
            diagonala2.add(sec);
            //System.out.println(index);
            //System.out.println(matrice.length-index-1);  verification
            
        }

        System.out.println("Prima diagonala este: "+ diagonala1);
        System.out.println("Diagonala secundara este: "+diagonala2);


        //############################################################################
        UUID input = UUID.randomUUID();

        // Convert the UUID to a byte array
        long mostSigBits = input.getMostSignificantBits();
        long leastSigBits = input.getLeastSignificantBits();
        byte[] uuidBytes = new byte[16];

        for (int i = 0; i < 8; i++) {
            uuidBytes[i] = (byte) (mostSigBits >>> 8 * (7 - i));
            uuidBytes[i + 8] = (byte) (leastSigBits >>> 8 * (7 - i));
        }

        // Calculate CRC32 checksum
        CRC32 crc = new CRC32();
        crc.update(uuidBytes);

        // Print the CRC32 value
        System.out.println("CRC32: " + crc.getValue());
       



        //#########################################################################
                    
    }
}
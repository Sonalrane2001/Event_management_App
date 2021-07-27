/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemeetforresources;

/**
 *
 * @author AVCOE
 */
public class GoogleMeetForResources {

    private byte[] picture;
    GoogleMeetForResources(byte[] image)
    {
        this.picture=image;
    }
    public static void main(String[] args) {
        welcome w=new welcome();
        w.show();
    }
    public byte[] getImage()
    {
        return picture;
    }
    
}

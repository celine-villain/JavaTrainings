package academy.learning;

import java.util.ArrayList;
import java.util.Collection;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        String tempXml = xml;
        Collection<String> myList = new ArrayList<>() ;
        String searchFor = "folder name=";

        while (tempXml.contains(searchFor)) {
            tempXml = tempXml.substring(tempXml.indexOf(searchFor) + searchFor.length() + 1);
            int indexEndFolder = tempXml.indexOf("\"");
            String title = tempXml.substring(0, indexEndFolder);
            if (title.startsWith(String.valueOf(startingLetter))) {
                myList.add(title);
            }
        }
        return myList;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
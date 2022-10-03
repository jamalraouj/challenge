import java.lang.reflect.Array;
import java.util.ArrayList;

public class Triangle {
    private int numLines ;
    private String symbole;
    private ArrayList<String> elements = new ArrayList<String>();

    public Triangle(int numLines, String symbole) {
        this.numLines = numLines;
        this.symbole = symbole;
    }
    public Triangle() {

    }

    public void showTriangleDecorated(){

        String name = "0-0";
        char[] s = strToArray(name);
        System.out.println(s[1]);

        int data = 0;
        int[] places = new  int[this.numLines];
        ArrayList<String> langString = new ArrayList<>();
        //count of data
        for(int i=0;i<this.numLines;i++){
            data = data+(2*(i+1)-1);
        }
        for(int i =0 ; i<data ; i++){
            langString.add(this.symbole);
        }
//        for(int s = 0; s<data ; s++){
//            System.out.println(langString.get(s));
//        }
        int l = 0;
        while (true){
//            double rand = Math.random()*this.numLines;
            int rand = (int)(Math.random() * langString.size() - 1) + 1;
            System.out.println(rand);
            if(places.length < this.numLines){
                langString.get(rand);
                System.out.println(langString.get(rand));
            }else{
                break;
            }


//l++;
        }
//        for(int i =0;i< this.numLines;i++){
//            if(places.length < this.numLines){
//
//
//            }
////            System.out.println(rand);
//  }


        System.out.println(data);
//        System.exit(0);
        String arr[] = {"0","-","0"};

        double rand = Math.random()*this.numLines;

        for(int k=1; k<=this.numLines ; k++){

            for(int i=1; i<=this.numLines-k;i++){
                System.out.print(" ");
            }
            for(int j=0;j<2*k-1 ; j++){
                data++;
                System.out.printf("%s",this.symbole);
            }
            System.out.println("");
        }
    }

    public void  showTriangle(){
        for(int k=1; k<=this.numLines ; k++){
            String spaces = "";
            String symboles ="";
            for(int i=1; i<=this.numLines-k;i++){
                spaces += " ";
//                System.out.print(" ");
            }
            for(int j=0;j<2*k-1 ; j++){
                symboles += this.symbole;
//                System.out.printf("%s",this.symbole);
            }
            this.elements.add(spaces + symboles);

        }
        this.elements.forEach( (n) -> { System.out.println(n); } );
    }
    public char[] strToArray(String str){
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

    public int getNumLines() {
        return numLines;
    }

    public void setNumLines(int numLines) {
        this.numLines = numLines;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }
}

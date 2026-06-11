class SongNode{
    String title;
    SongNode next;
    public SongNode(String title){
        this.title=title;
        this.next=null;
    }
}
public class SongPlaylist{
    public static void main(String args[]){
        SongNode song1=new SongNode("songA");
        SongNode song2=new SongNode("SongB");
        SongNode song3=new SongNode("Songc");
        song1.next=song2;
        song2.next=song3;
        SongNode current=song1;
        while(current!=null){
            System.out.println(current.title);
            System.out.println(current);
            System.out.println(current.next);
            current=current.next;
        }
        SongNode songNew=new SongNode("insertedSong");
        songNew.next=song2.next;
        song2.next=songNew;
        current=song1;
        System.out.println("After inserting a new song:");
        while(current!=null){
            System.out.println(current.title);
            System.out.println(current);
            System.out.println(current.next);
            current=current.next;
        }
        System.out.println("Printing in reverse order:\n");
        printReverse(song1);
    }
    public static void printReverse(SongNode node){
        if(node==null){
            return;
        }
        printReverse(node.next);
        System.out.println(node.title);
    }
}
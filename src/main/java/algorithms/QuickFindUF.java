package algorithms;

public class QuickFindUF {
    private int[] id;
    public QuickFindUF(int N){
        id = new int[N];
        for(int i = 0; i< N; i++)
            id[i] = i;
    }
    public boolean connected(int p, int q){
        return id[p] == id[q];
    }
    public void union (int p, int q){
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i< id.length;i++){
            if(id[i] == pid) id[i] = qid;
        }
    }
    public static void main(String args[]){
        QuickFindUF findUF = new QuickFindUF(8);
        QuickFindUF findUF1 = new QuickFindUF( 7);
        System.out.println("findUF id is " + findUF.id);
        System.out.println("findUF1 id is " + findUF1.id);

        //System.out.println(findUF1.connected(7,8));



    }
}

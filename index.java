import java.util.Stack;

public class index
{

    public static void displayrevers(Stack<Integer> st)
    {
        if(st.size()==0) return;
        int rt=st.pop();
        System.out.print(rt+" ");
        displayrevers(st);
        st.push(rt);
    }
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(231);
        st.push(3);

       // System.out.print(st);
        displayrevers(st);
        //System.out.print(st);
    }
}
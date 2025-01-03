public class Sign
{
    private String message;
    private int width;
    public sign(String m, int w){
        message = m;
        width = w;
    }
    public int numberOfLines(){
        message.length() / width + 1;
    }
}
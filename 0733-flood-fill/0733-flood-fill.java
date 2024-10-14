class Pair{
int row;
int col;
public Pair(int r,int c)
{
this.row=r;
this.col=c;
}
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         Queue<Pair> q=new LinkedList<>();
    int[][] vis=new int[image.length][image[0].length];
    
    q.add(new Pair(sr,sc));
    vis[sr][sc]=1;
    int prev_clr=image[sr][sc];
    image[sr][sc]=color;
    int[] drow={-1,0,1,0};
    int[] dcol={0,-1,0,1};
    
    while(!q.isEmpty())
    {
        int r=q.peek().row;
        int c=q.peek().col;
        q.remove();
        
        for(int i=0;i<4;i++)
        {
         int nrow=r+drow[i];
         int ncol=c+dcol[i];
         
        if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && vis[nrow][ncol]==0 && image[nrow][ncol]==prev_clr)
        {
            q.add(new Pair(nrow,ncol));
            vis[nrow][ncol]=1;
            image[nrow][ncol]=color;
        }
    }
        
    }
    
    return image;
    }
}
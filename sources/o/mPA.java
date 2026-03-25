package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes18.dex */
public class mPA extends RecyclerView.ItemDecoration {
    public int AEQbTJ;
    public android.graphics.Paint OLrzqt;

    public mPA(int i, int i2) {
        this.AEQbTJ = i2;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
        paint.setColor(i);
        this.OLrzqt.setAntiAlias(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = recyclerView.getPaddingLeft();
        rect.right = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            int bottom = recyclerView.getChildAt(i).getBottom();
            rect.top = bottom;
            rect.bottom = bottom + this.AEQbTJ;
            canvas.drawRect(rect, this.OLrzqt);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.bottom += this.AEQbTJ;
    }
}

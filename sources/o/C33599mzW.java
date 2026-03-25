package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.mzW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33599mzW extends RecyclerView.ItemDecoration {
    public int AEQbTJ;
    public int EZpvd;
    public boolean KWHzl;
    public int OLrzqt;

    public C33599mzW(int i, int i2, int i3, boolean z) {
        this.OLrzqt = i;
        this.EZpvd = i2;
        this.AEQbTJ = i3;
        this.KWHzl = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.OLrzqt;
        int i2 = childAdapterPosition % i;
        if (this.KWHzl) {
            int i3 = this.EZpvd;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (childAdapterPosition < i) {
                rect.top = this.AEQbTJ;
            }
            rect.bottom = this.AEQbTJ;
            return;
        }
        int i4 = this.EZpvd;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
        if (childAdapterPosition >= i) {
            rect.top = this.AEQbTJ;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }
}

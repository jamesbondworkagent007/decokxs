package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40941qhT extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int KWHzl;
    public final android.graphics.Paint OLrzqt;

    public C40941qhT(int i, int i2) {
        this.KWHzl = i;
        this.AEQbTJ = i2;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(i2);
        this.OLrzqt = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childCount = recyclerView.getChildCount();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.copydefault(adapter);
            if (childAdapterPosition + spanCount < adapter.getItemCount()) {
                int left = childAt.getLeft();
                int right = childAt.getRight();
                canvas.drawRect(left, childAt.getBottom(), right, this.KWHzl + r2, this.OLrzqt);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.copydefault(adapter);
        if (childAdapterPosition + spanCount < adapter.getItemCount()) {
            rect.bottom = this.KWHzl;
        }
    }
}

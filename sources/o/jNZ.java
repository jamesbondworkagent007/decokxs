package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNZ extends RecyclerView.ItemDecoration {
    public final int OLrzqt;

    public jNZ(int i) {
        this.OLrzqt = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            EZpvd((recyclerView.getMeasuredWidth() - (this.OLrzqt * gridLayoutManager.getSpanCount())) / (gridLayoutManager.getSpanCount() - 1), rect, recyclerView.getChildAdapterPosition(view), gridLayoutManager.getOrientation(), gridLayoutManager.getSpanCount());
        }
    }

    public final void EZpvd(int i, android.graphics.Rect rect, int i2, int i3, int i4) {
        int i5 = i3 == 0 ? i2 / i4 : i2 % i4;
        int i6 = i3 == 0 ? i2 % i4 : i2 / i4;
        if (i3 == 0) {
            rect.left = 0;
            rect.top = (i * i6) / i4;
            rect.right = 0;
            rect.bottom = (i * (i4 - (i6 + 1))) / i4;
            return;
        }
        if (i3 != 1) {
            return;
        }
        rect.left = (i * i5) / i4;
        rect.top = 0;
        rect.right = (i * (i4 - (i5 + 1))) / i4;
        rect.bottom = 0;
    }
}

package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYW extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int OLrzqt;

    public wYW(int i, int i2) {
        this.OLrzqt = i;
        this.AEQbTJ = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.OLrzqt;
        if (childAdapterPosition % i < i - 1) {
            rect.right = this.AEQbTJ;
        } else {
            rect.right = 0;
        }
        if (childAdapterPosition >= i) {
            rect.top = this.AEQbTJ;
        }
        rect.left = 0;
        rect.bottom = 0;
    }
}

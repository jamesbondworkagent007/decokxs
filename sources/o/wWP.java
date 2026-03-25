package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wWP extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int KWHzl;

    public wWP(int i, int i2) {
        this.AEQbTJ = i;
        this.KWHzl = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.AEQbTJ;
        if (childAdapterPosition % i < i - 1) {
            rect.left = this.KWHzl;
        }
        if (childAdapterPosition >= i) {
            rect.top = this.KWHzl;
        }
    }
}

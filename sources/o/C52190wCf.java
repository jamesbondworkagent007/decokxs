package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C53800wsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52190wCf extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int KWHzl;
    public final int copydefault;

    public C52190wCf(int i, int i2, int i3) {
        this.KWHzl = i;
        this.AEQbTJ = i2;
        this.copydefault = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && (recyclerView.getChildViewHolder(view) instanceof C53800wsN.StateListAnimator)) {
            int i = this.KWHzl;
            int i2 = childAdapterPosition % i;
            int i3 = this.copydefault;
            rect.left = (i2 * i3) / i;
            rect.right = i3 - (((i2 + 1) * i3) / i);
            if (childAdapterPosition >= i) {
                rect.top = this.AEQbTJ;
            }
            C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
        }
    }
}

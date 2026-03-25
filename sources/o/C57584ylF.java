package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57584ylF extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int copydefault;

    public C57584ylF(int i, int i2, int i3) {
        this.copydefault = i;
        this.AEQbTJ = i2;
        this.EZpvd = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.copydefault;
        int i2 = childAdapterPosition % i;
        int i3 = this.EZpvd;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        if (childAdapterPosition >= i) {
            rect.top = this.AEQbTJ;
        }
        C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
    }
}

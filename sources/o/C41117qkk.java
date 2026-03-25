package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41117qkk extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final boolean EZpvd;
    public final int OLrzqt;
    public final int copydefault;

    public C41117qkk(int i, int i2, int i3, boolean z) {
        this.AEQbTJ = i;
        this.copydefault = i2;
        this.OLrzqt = i3;
        this.EZpvd = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.OLrzqt;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.copydefault(adapter);
        int itemCount = adapter.getItemCount();
        int i2 = this.OLrzqt;
        if (childAdapterPosition < itemCount - (itemCount % i2) || this.EZpvd) {
            rect.bottom = this.copydefault;
        }
        int i3 = this.AEQbTJ;
        rect.left = (i * i3) / i2;
        rect.right = i3 - (((i + 1) * i3) / i2);
        C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
    }
}

package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29647kxb extends RecyclerView.ItemDecoration {
    public final int OLrzqt;
    public final int copydefault;

    public C29647kxb(int i, int i2) {
        this.copydefault = i;
        this.OLrzqt = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            rect.top = this.copydefault / 2;
        } else {
            rect.top = this.copydefault;
        }
        int i = this.OLrzqt;
        rect.left = i;
        rect.right = i;
    }
}

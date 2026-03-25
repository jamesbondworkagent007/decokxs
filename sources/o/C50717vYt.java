package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50717vYt extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    public C50717vYt(int i, int i2, int i3, int i4) {
        this.OLrzqt = i;
        this.KWHzl = i2;
        this.copydefault = i3;
        this.AEQbTJ = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        rect.left = this.OLrzqt;
        rect.right = this.KWHzl;
        rect.top = this.copydefault;
        rect.bottom = this.AEQbTJ;
        C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
    }
}

package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48688uaR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48705uai extends RecyclerView.ItemDecoration {
    public final int KWHzl;
    public final int OLrzqt;
    public final GridLayoutManager.SpanSizeLookup copydefault;

    public C48705uai(@NotNull GridLayoutManager.SpanSizeLookup spanSizeLookup, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanSizeLookup, "");
        this.copydefault = spanSizeLookup;
        this.OLrzqt = i;
        this.KWHzl = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (this.copydefault.getSpanSize(recyclerView.getChildAdapterPosition(view)) == this.OLrzqt && view.getId() == C48688uaR.StateListAnimator.djBIcL) {
            view.setScaleX(4.0f);
            int i = this.KWHzl;
            rect.left = -i;
            rect.right = i;
        }
    }
}

package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51354vlT extends RecyclerView.ItemDecoration {
    public int EZpvd;
    public boolean KWHzl = true;
    public final int copydefault;

    public C51354vlT(int i) {
        this.copydefault = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int i = this.EZpvd + 1;
        this.EZpvd = i;
        boolean z = i == 1;
        if (view instanceof AppCompatTextView) {
            if (!z) {
                rect.top = C55298xhM.dpInt$default(this.KWHzl ? 24 : 8, (android.content.Context) null, 1, (java.lang.Object) null);
            }
            rect.bottom = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
            this.KWHzl = true;
            return;
        }
        if (view instanceof ConstraintLayout) {
            rect.bottom = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
            this.KWHzl = false;
        } else {
            pUU.AEQbTJ("BotSelectItemDecoration not fit this view type !!!");
        }
    }
}

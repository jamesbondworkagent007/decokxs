package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40943qhV extends RecyclerView.ItemDecoration {
    public final int EZpvd;
    public final int KWHzl;

    public C40943qhV(int i, int i2) {
        this.KWHzl = i;
        this.EZpvd = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(rect, view, recyclerView, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.EZpvd;
        layoutParams.width = this.KWHzl;
        view.setLayoutParams(layoutParams);
    }
}

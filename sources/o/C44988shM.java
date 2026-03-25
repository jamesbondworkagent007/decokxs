package o;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.shM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44988shM extends GridLayoutManager.SpanSizeLookup {
    public final ConcatAdapter OLrzqt;

    public C44988shM(@NotNull ConcatAdapter concatAdapter) {
        Intrinsics.checkNotNullParameter(concatAdapter, "");
        this.OLrzqt = concatAdapter;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanSize(int i) {
        return ((RecyclerView.Adapter) this.OLrzqt.getWrappedAdapterAndPosition(i).first) instanceof C45055sia ? 1 : 2;
    }
}

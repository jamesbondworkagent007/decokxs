package o;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45393sou extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final boolean EZpvd;
    public final RecyclerView.Adapter<?> KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 androidx.recyclerview.widget.RecyclerView$Adapter)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
 A[MD:(androidx.recyclerview.widget.RecyclerView$Adapter<?>, int, int, boolean):void (m)] (LINE:12) call: o.sou.<init>(androidx.recyclerview.widget.RecyclerView$Adapter, int, int, boolean):void type: THIS */
    public /* synthetic */ C45393sou(RecyclerView.Adapter adapter, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(adapter, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? true : z);
    }

    public C45393sou(@NotNull RecyclerView.Adapter<?> adapter, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(adapter, "");
        this.KWHzl = adapter;
        this.AEQbTJ = i;
        this.copydefault = i2;
        this.EZpvd = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        android.util.Pair<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>, java.lang.Integer> wrappedAdapterAndPosition;
        android.util.Pair<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>, java.lang.Integer> wrappedAdapterAndPosition2;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        java.lang.Integer num = null;
        ConcatAdapter concatAdapter = adapter instanceof ConcatAdapter ? (ConcatAdapter) adapter : null;
        RecyclerView.Adapter adapter2 = (concatAdapter == null || (wrappedAdapterAndPosition2 = concatAdapter.getWrappedAdapterAndPosition(childAdapterPosition)) == null) ? null : (RecyclerView.Adapter) wrappedAdapterAndPosition2.first;
        if (concatAdapter != null && (wrappedAdapterAndPosition = concatAdapter.getWrappedAdapterAndPosition(childAdapterPosition)) != null) {
            num = (java.lang.Integer) wrappedAdapterAndPosition.second;
        }
        if (childAdapterPosition == 0 && this.EZpvd) {
            super.getItemOffsets(rect, view, recyclerView, state);
        } else if (Intrinsics.EZpvd(adapter2, this.KWHzl) && num != null && num.intValue() == 0) {
            rect.set(0, this.AEQbTJ, 0, this.copydefault);
        } else {
            super.getItemOffsets(rect, view, recyclerView, state);
        }
    }
}

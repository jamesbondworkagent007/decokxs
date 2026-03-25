package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29687kyO extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int KWHzl;
    public final int OLrzqt;
    public final RecyclerView.Adapter<?> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r4v0 androidx.recyclerview.widget.RecyclerView$Adapter)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000d: INVOKE 
  (12 int)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.xhM.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:14)) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0015: INVOKE 
  (12 int)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.xhM.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:15)) : (r7v0 int))
 A[MD:(androidx.recyclerview.widget.RecyclerView$Adapter<?>, int, int, int):void (m)] (LINE:11) call: o.kyO.<init>(androidx.recyclerview.widget.RecyclerView$Adapter, int, int, int):void type: THIS */
    public /* synthetic */ C29687kyO(RecyclerView.Adapter adapter, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(adapter, (i4 & 2) != 0 ? 2 : i, (i4 & 4) != 0 ? C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null) : i2, (i4 & 8) != 0 ? C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null) : i3);
    }

    public C29687kyO(@NotNull RecyclerView.Adapter<?> adapter, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(adapter, "");
        this.copydefault = adapter;
        this.AEQbTJ = i;
        this.OLrzqt = i2;
        this.KWHzl = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        java.util.List<?> items;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        RecyclerView.Adapter<?> adapter = this.copydefault;
        C59534zip c59534zip = adapter instanceof C59534zip ? (C59534zip) adapter : null;
        java.lang.Object objAkhnZx = (c59534zip == null || (items = c59534zip.getItems()) == null) ? null : CollectionsKt___CollectionsKt.AkhnZx(items, childAdapterPosition);
        kMU kmu = objAkhnZx instanceof kMU ? (kMU) objAkhnZx : null;
        if (kmu == null) {
            return;
        }
        if (kmu instanceof C29686kyN) {
            rect.top = childAdapterPosition != 0 ? this.OLrzqt : 0;
            return;
        }
        if (kmu instanceof C29689kyQ) {
            int spanSize = gridLayoutManager.getSpanSizeLookup().getSpanSize(childAdapterPosition);
            int spanIndex = gridLayoutManager.getSpanSizeLookup().getSpanIndex(childAdapterPosition, this.AEQbTJ);
            boolean z = spanIndex == 0;
            boolean z2 = spanSize + spanIndex >= this.AEQbTJ;
            java.util.List<?> items2 = ((C59534zip) this.copydefault).getItems();
            Intrinsics.checkNotNullExpressionValue(items2, "");
            boolean z3 = CollectionsKt___CollectionsKt.AkhnZx(items2, (childAdapterPosition - spanIndex) - 1) instanceof C29686kyN;
            rect.left = z ? 0 : this.KWHzl / 2;
            rect.right = z2 ? 0 : this.KWHzl / 2;
            rect.top = z3 ? 0 : this.KWHzl;
            rect.bottom = 0;
            return;
        }
        rect.top = 0;
        rect.bottom = 0;
    }
}

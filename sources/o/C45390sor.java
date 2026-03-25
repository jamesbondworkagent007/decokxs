package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sor, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45390sor extends RecyclerView.ItemDecoration {
    public final java.util.Set<InterfaceC56551yJo<? extends RecyclerView.ViewHolder>> AEQbTJ;
    public final java.util.Set<InterfaceC56551yJo<? extends RecyclerView.ViewHolder>> EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45390sor() {
        this(0, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.StateListAnimator.ODWQjV int) : (r1v0 int))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Set:0x000a: INVOKE  STATIC call: o.yEE.copydefault():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:20)) : (r2v0 java.util.Set))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Set:0x0012: INVOKE  STATIC call: o.yEE.copydefault():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:21)) : (r3v0 java.util.Set))
 A[MD:(int, java.util.Set<? extends o.yJo<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>>, java.util.Set<? extends o.yJo<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>>):void (m)] (LINE:18) call: o.sor.<init>(int, java.util.Set, java.util.Set):void type: THIS */
    public /* synthetic */ C45390sor(int i, java.util.Set set, java.util.Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C52761wXj.StateListAnimator.ODWQjV : i, (i2 & 2) != 0 ? yEE.copydefault() : set, (i2 & 4) != 0 ? yEE.copydefault() : set2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Set<? extends o.yJo<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Set<? extends o.yJo<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C45390sor(@androidx.annotation.DimenRes int i, @NotNull java.util.Set<? extends InterfaceC56551yJo<? extends RecyclerView.ViewHolder>> set, @NotNull java.util.Set<? extends InterfaceC56551yJo<? extends RecyclerView.ViewHolder>> set2) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(set2, "");
        this.OLrzqt = i;
        this.AEQbTJ = set;
        this.EZpvd = set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            java.util.Set<InterfaceC56551yJo<? extends RecyclerView.ViewHolder>> set = this.AEQbTJ;
            if ((set instanceof java.util.Collection) && set.isEmpty()) {
                if (!this.EZpvd.isEmpty()) {
                }
                rect.set(0, C33070mpX.OLrzqt(this.OLrzqt), 0, 0);
                return;
            }
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((InterfaceC56551yJo) it.next()).copydefault(childViewHolder)) {
                    break;
                }
            }
            if (!this.EZpvd.isEmpty()) {
                java.util.Set<InterfaceC56551yJo<? extends RecyclerView.ViewHolder>> set2 = this.EZpvd;
                if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                    java.util.Iterator<T> it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (((InterfaceC56551yJo) it2.next()).copydefault(childViewHolder)) {
                        }
                    }
                }
            }
            rect.set(0, C33070mpX.OLrzqt(this.OLrzqt), 0, 0);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}

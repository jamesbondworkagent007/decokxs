package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45387soo extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int AYXKKw;
    public final int EZpvd;
    public final java.lang.Integer KWHzl;
    public final int OLrzqt;
    public final java.lang.Integer copydefault;
    public final java.lang.Integer djBIcL;
    public final java.lang.Integer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45387soo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:13) call: o.soo.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ C45387soo(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }

    public C45387soo(@androidx.annotation.DimenRes java.lang.Integer num, @androidx.annotation.DimenRes java.lang.Integer num2, @androidx.annotation.DimenRes java.lang.Integer num3, @androidx.annotation.DimenRes java.lang.Integer num4) {
        this.valueOf = num;
        this.KWHzl = num2;
        this.djBIcL = num3;
        this.copydefault = num4;
        this.AYXKKw = num != null ? C33070mpX.OLrzqt(num.intValue()) : 0;
        this.EZpvd = num2 != null ? C33070mpX.OLrzqt(num2.intValue()) : 0;
        this.AEQbTJ = num3 != null ? C33070mpX.OLrzqt(num3.intValue()) : 0;
        this.OLrzqt = num4 != null ? C33070mpX.OLrzqt(num4.intValue()) : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter() != null ? r6.getItemCount() - 1 : 0;
        int i = childAdapterPosition == 0 ? 0 : this.AEQbTJ;
        int i2 = childAdapterPosition != itemCount ? this.OLrzqt : 0;
        if (!C55296xhK.AEQbTJ(recyclerView)) {
            rect.set(i, this.AYXKKw, i2, this.EZpvd);
        } else {
            rect.set(i2, this.AYXKKw, i, this.EZpvd);
        }
    }
}

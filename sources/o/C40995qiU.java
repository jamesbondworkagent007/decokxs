package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qiU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40995qiU extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (r12v0 int)
 A[MD:(int, int, int, int, int):void (m)] (LINE:8) call: o.qiU.<init>(int, int, int, int, int):void type: THIS */
    public /* synthetic */ C40995qiU(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, i5);
    }

    public C40995qiU(int i, int i2, int i3, int i4, int i5) {
        this.KWHzl = i;
        this.AEQbTJ = i2;
        this.OLrzqt = i3;
        this.EZpvd = i4;
        this.copydefault = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOLrzqt = C55296xhK.OLrzqt(context);
        int i = zOLrzqt ? this.AEQbTJ : this.KWHzl;
        int i2 = zOLrzqt ? this.KWHzl : this.AEQbTJ;
        rect.left = i;
        rect.right = i2;
        rect.bottom = this.OLrzqt;
        rect.top = this.EZpvd;
        if (recyclerView.getAdapter() != null) {
            if (this.copydefault == 0) {
                if (recyclerView.getChildAdapterPosition(view) == r0.getItemCount() - 1) {
                    if (zOLrzqt) {
                        rect.left = 0;
                        return;
                    } else {
                        rect.right = 0;
                        return;
                    }
                }
                return;
            }
            rect.top = 0;
        }
    }
}

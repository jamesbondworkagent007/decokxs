package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57593ylO extends RecyclerView.ItemDecoration {
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final int copydefault;

    public C57593ylO(int i, boolean z, boolean z2) {
        this.copydefault = i;
        this.KWHzl = z;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(int, boolean, boolean):void (m)] (LINE:15) call: o.ylO.<init>(int, boolean, boolean):void type: THIS */
    public /* synthetic */ C57593ylO(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        if (childAdapterPosition == -1 || itemCount == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            if (this.KWHzl) {
                rect.top = this.copydefault;
            }
        } else {
            if (childAdapterPosition == itemCount) {
                int i = this.copydefault;
                rect.top = i;
                if (this.OLrzqt) {
                    rect.bottom = i;
                    return;
                }
                return;
            }
            rect.top = this.copydefault;
        }
    }
}

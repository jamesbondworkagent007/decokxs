package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24290iaz extends RecyclerView.ItemDecoration {
    public final int KWHzl;
    public final boolean copydefault;

    public C24290iaz(int i, boolean z) {
        this.KWHzl = i;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(int, boolean):void (m)] (LINE:7) call: o.iaz.<init>(int, boolean):void type: THIS */
    public /* synthetic */ C24290iaz(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        if (childAdapterPosition == 0) {
            rect.top = this.copydefault ? 0 : this.KWHzl;
        } else {
            if (childAdapterPosition == itemCount) {
                int i = this.KWHzl;
                rect.top = i;
                rect.bottom = i;
                return;
            }
            rect.top = this.KWHzl;
        }
    }
}

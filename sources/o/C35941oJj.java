package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35941oJj extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final float EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final android.graphics.Paint copydefault;
    public final java.util.Set<java.lang.Integer> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r8v0 android.content.Context)
  (r9v0 java.util.Set)
  (wrap:int:0x000a: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.zuBGHE int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:19)) : (r10v0 int))
  (wrap:float:0x0011: TERNARY null = ((wrap:int:0x000b: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.5f float) : (r11v0 float))
  (wrap:int:0x001c: TERNARY null = ((wrap:int:0x0012: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0018: INVOKE (wrap:int:0x0016: SGET  A[WRAPPED] o.wXj.StateListAnimator.AxsJAYaxsJAY int) STATIC call: o.mpX.OLrzqt(int):int A[MD:(int):int (m), WRAPPED] (LINE:21)) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0023: INVOKE (wrap:int:0x0021: SGET  A[WRAPPED] o.wXj.StateListAnimator.ffGIBT int) STATIC call: o.mpX.OLrzqt(int):int A[MD:(int):int (m), WRAPPED] (LINE:22)) : (r13v0 int))
 A[MD:(android.content.Context, java.util.Set<java.lang.Integer>, int, float, int, int):void (m)] (LINE:16) call: o.oJj.<init>(android.content.Context, java.util.Set, int, float, int, int):void type: THIS */
    public /* synthetic */ C35941oJj(android.content.Context context, java.util.Set set, int i, float f, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, set, (i4 & 4) != 0 ? C33070mpX.copydefault(C52761wXj.Activity.zuBGHE) : i, (i4 & 8) != 0 ? 0.5f : f, (i4 & 16) != 0 ? C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY) : i2, (i4 & 32) != 0 ? C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT) : i3);
    }

    public C35941oJj(@NotNull android.content.Context context, @NotNull java.util.Set<java.lang.Integer> set, @androidx.annotation.ColorInt int i, float f, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.valueOf = set;
        this.KWHzl = i;
        this.EZpvd = f;
        this.OLrzqt = i2;
        this.AEQbTJ = i3;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i);
        paint.setStrokeWidth(context.getResources().getDisplayMetrics().density * f);
        this.copydefault = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && childAdapterPosition > 0 && this.valueOf.contains(java.lang.Integer.valueOf(adapter.getItemViewType(childAdapterPosition)))) {
                int top = childAt.getTop();
                int i2 = this.AEQbTJ;
                float f = top - i2;
                canvas.drawLine(childAt.getLeft() + this.OLrzqt, f, childAt.getRight() - this.OLrzqt, f, this.copydefault);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == -1 || !this.valueOf.contains(java.lang.Integer.valueOf(adapter.getItemViewType(childAdapterPosition)))) {
            return;
        }
        if (childAdapterPosition != adapter.getItemCount() - 1) {
            rect.set(0, this.AEQbTJ * 2, 0, 0);
        } else {
            super.getItemOffsets(rect, view, recyclerView, state);
        }
    }
}

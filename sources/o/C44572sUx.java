package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.sWj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44572sUx extends RecyclerView.ItemDecoration {
    public final android.graphics.drawable.Drawable AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(android.content.Context, int, int):void (m)] (LINE:565) call: o.sUx.<init>(android.content.Context, int, int):void type: THIS */
    public /* synthetic */ C44572sUx(android.content.Context context, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public C44572sUx(@NotNull android.content.Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = i;
        this.OLrzqt = i2;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, sWj.ActionBar.copydefault);
        this.AEQbTJ = drawable;
        this.EZpvd = drawable != null ? drawable.getIntrinsicHeight() : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        C44565sUq c44565sUq = adapter instanceof C44565sUq ? (C44565sUq) adapter : null;
        if (c44565sUq == null || childAdapterPosition == -1 || c44565sUq.getItemViewType(childAdapterPosition) != 0) {
            return;
        }
        rect.bottom = this.KWHzl + this.EZpvd + this.OLrzqt;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        android.graphics.drawable.Drawable drawable;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        C44565sUq c44565sUq = adapter instanceof C44565sUq ? (C44565sUq) adapter : null;
        if (c44565sUq == null || (drawable = this.AEQbTJ) == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && c44565sUq.getItemViewType(childAdapterPosition) == 0) {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth();
                int paddingRight = recyclerView.getPaddingRight();
                int bottom = childAt.getBottom();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                int i2 = bottom + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin + this.KWHzl;
                drawable.setBounds(paddingLeft, i2, width - paddingRight, this.EZpvd + i2);
                drawable.draw(canvas);
            }
        }
    }
}

package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oUm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36241oUm extends RecyclerView.ItemDecoration {
    public final Function1<java.lang.Integer, java.lang.Integer> EZpvd;
    public final Function1<java.lang.Integer, java.lang.Integer> KWHzl;
    public final Function1<java.lang.Integer, java.lang.Integer> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function1)
  (r2v0 kotlin.jvm.functions.Function1)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer>, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer>, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer>):void (m)] (LINE:9) call: o.oUm.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C36241oUm(Function1 function1, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, (i & 4) != 0 ? null : function13);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public C36241oUm(@NotNull Function1<? super java.lang.Integer, java.lang.Integer> function1, @NotNull Function1<? super java.lang.Integer, java.lang.Integer> function12, Function1<? super java.lang.Integer, java.lang.Integer> function13) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.OLrzqt = function1;
        this.KWHzl = function12;
        this.EZpvd = function13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
        int spanCount = gridLayoutManager.getSpanCount();
        int spanSize = spanSizeLookup.getSpanSize(childAdapterPosition);
        int spanIndex = spanSizeLookup.getSpanIndex(childAdapterPosition, spanCount);
        int spanGroupIndex = spanSizeLookup.getSpanGroupIndex(childAdapterPosition, spanCount);
        int iIntValue = this.OLrzqt.invoke(java.lang.Integer.valueOf(spanSize)).intValue();
        int iIntValue2 = this.KWHzl.invoke(java.lang.Integer.valueOf(spanSize)).intValue();
        Function1<java.lang.Integer, java.lang.Integer> function1 = this.EZpvd;
        int iIntValue3 = function1 != null ? function1.invoke(java.lang.Integer.valueOf(spanSize)).intValue() : 0;
        boolean z = spanIndex == 0;
        boolean z2 = spanIndex + spanSize == spanCount;
        int i = z ? iIntValue3 : iIntValue / 2;
        int i2 = z2 ? iIntValue3 : iIntValue / 2;
        if (spanGroupIndex != 0) {
            iIntValue3 = iIntValue2 / 2;
        }
        rect.set(i, iIntValue3, i2, iIntValue2 / 2);
    }
}

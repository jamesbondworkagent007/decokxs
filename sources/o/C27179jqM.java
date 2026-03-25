package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27179jqM extends AbstractC52792wYn {
    public Function1<java.lang.Object, Unit> AEQbTJ;
    public java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.lang.Object>> EZpvd = yDY.AhwBna();
    public wYF KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.lang.Object>> list, Function1<java.lang.Object, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jqM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C27179jqM c27179jqM, java.util.List list, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c27179jqM.KWHzl(list, function1);
    }

    public static final Unit KWHzl(C27179jqM c27179jqM, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<java.lang.Object, Unit> function1 = c27179jqM.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c55276xgr != null ? c55276xgr.OLrzqt() : null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYF wyf = new wYF(context, null, 2, null);
        wyf.setType(17);
        wyf.setOKDSSize(52);
        wyf.setCancelText(wyf.getContext().getString(C25493ixk.FragmentManager.DaTmkG));
        wyf.setOnClickListener(new View.OnClickListener() { // from class: o.jqL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27179jqM.EZpvd(this.EZpvd, view);
            }
        });
        this.KWHzl = wyf;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(wyf, layoutParams);
    }

    public static final void EZpvd(C27179jqM c27179jqM, android.view.View view) {
        c27179jqM.dismiss();
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.lang.Object>> list = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            arrayList.add(new C55276xgr((java.lang.CharSequence) pair.getFirst(), pair.getSecond(), null, false, false, null, null, 124, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.jqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C27179jqM.KWHzl(this.copydefault, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }
}

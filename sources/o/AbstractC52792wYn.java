package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52792wYn extends wXX {
    public C55198xfS values;

    public abstract void EZpvd(@NotNull C55198xfS c55198xfS);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55198xfS isConnected() {
        return this.values;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C54946xaf binding;
        wXQ wxq;
        C52781wYc c52781wYc;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.View viewInflate = getCustomLayoutInflater().inflate(C52761wXj.Fragment.ODWQjV, (android.view.ViewGroup) constraintLayout, false);
        Intrinsics.copydefault(viewInflate, "");
        C55198xfS c55198xfS = (C55198xfS) viewInflate;
        this.values = c55198xfS;
        Intrinsics.copydefault(c55198xfS);
        AEQbTJ(c55198xfS);
        constraintLayout.addView(this.values, new ConstraintLayout.LayoutParams(-1, -2));
        C54946xaf binding2 = getBinding();
        if ((binding2 != null && (c52781wYc = binding2.EZpvd) != null && c52781wYc.copydefault() == 0) || ((binding = getBinding()) != null && (wxq = binding.KWHzl) != null && wxq.copydefault() == -1)) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            constraintLayout.setPaddingRelative(0, C55298xhM.OLrzqt(20, contextRequireContext), 0, 0);
        } else {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            constraintLayout.setPaddingRelative(0, C55298xhM.OLrzqt(0, contextRequireContext2), 0, 0);
        }
    }

    public final void AEQbTJ(C55198xfS c55198xfS) {
        EZpvd(c55198xfS);
    }

    public void copydefault(@NotNull C55276xgr c55276xgr, @NotNull Function1<? super C55276xgr, java.lang.Integer> function1) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int iIntValue = function1.invoke(c55276xgr).intValue();
        C55198xfS c55198xfS = this.values;
        if (c55198xfS != null) {
            c55198xfS.values().AEQbTJ(iIntValue, true);
        }
    }

    public void copydefault(final Function2<? super java.lang.Integer, ? super C55276xgr, Unit> function2) {
        C55198xfS c55198xfS = this.values;
        if (c55198xfS != null) {
            c55198xfS.copydefault(new yHO() { // from class: o.wYo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractC52792wYn.OLrzqt(function2, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
                }
            });
        }
    }

    public static final Unit OLrzqt(Function2 function2, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (c55276xgr != null && function2 != null) {
            function2.invoke(0, c55276xgr);
        }
        return Unit.INSTANCE;
    }
}

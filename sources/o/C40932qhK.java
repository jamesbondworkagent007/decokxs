package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.TradingCalendarMonthBottomSheet$onSelectionCreated$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40932qhK extends AbstractC40962qho {
    public Function1<? super C55276xgr, Unit> djBIcL;
    public Function0<Unit> gEmmrt;
    public java.util.List<C55276xgr> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.List<C55276xgr> list, @NotNull Function1<? super C55276xgr, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf = list;
        this.djBIcL = function1;
        this.gEmmrt = function0;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
        c52781wYc.setTitleAlignmentCenter(false);
        c52781wYc.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.atDTRm));
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        java.util.List<C55276xgr> list = this.valueOf;
        if (list == null) {
            return;
        }
        if (list == null) {
            Intrinsics.gEmmrt("");
            list = null;
        }
        c55198xfS.setSingleOneColumnData(list, new yHO() { // from class: o.qhM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C40932qhK.KWHzl(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit KWHzl(C40932qhK c40932qhK, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c40932qhK), null, null, new TradingCalendarMonthBottomSheet$onSelectionCreated$1$1(c40932qhK, c55276xgr, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        function0.invoke();
    }
}

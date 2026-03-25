package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46725tcb extends AbstractC52792wYn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tce
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46725tcb.OLrzqt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tcg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46725tcb.EZpvd(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.tcb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tcb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String OLrzqt(C46725tcb c46725tcb) {
        java.lang.String string;
        android.os.Bundle arguments = c46725tcb.getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "hot-rank" : string;
    }

    private final java.lang.String AEQbTJ() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String EZpvd(C46725tcb c46725tcb) {
        java.lang.String string;
        android.os.Bundle arguments = c46725tcb.getArguments();
        return (arguments == null || (string = arguments.getString("InstType")) == null) ? "SPOT" : string;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
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
        java.util.List<C55276xgr> listGEmmrt;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "hot-rank")) {
            listGEmmrt = yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.RqmePg), C56390yDp.OLrzqt("hot-rank", "SPOT"), null, Intrinsics.EZpvd((java.lang.Object) AEQbTJ(), (java.lang.Object) "SPOT"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.ggKfIT), C56390yDp.OLrzqt("hot-rank", "SWAP"), null, Intrinsics.EZpvd((java.lang.Object) AEQbTJ(), (java.lang.Object) "SWAP"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        } else {
            listGEmmrt = yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.RzdrRQ), C56390yDp.OLrzqt("up-rank", "SPOT"), null, Intrinsics.EZpvd((java.lang.Object) AEQbTJ(), (java.lang.Object) "SPOT"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.RTWSvT), C56390yDp.OLrzqt("up-rank", "SWAP"), null, Intrinsics.EZpvd((java.lang.Object) AEQbTJ(), (java.lang.Object) "SWAP"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        c55198xfS.setSingleOneColumnData(listGEmmrt, new yHO() { // from class: o.tcd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C46725tcb.AEQbTJ(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C46725tcb c46725tcb, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        kotlin.Pair pair = objOLrzqt instanceof kotlin.Pair ? (kotlin.Pair) objOLrzqt : null;
        if (pair != null && !Intrinsics.EZpvd(c46725tcb.AEQbTJ(), pair.getSecond())) {
            java.lang.String simpleName = C46725tcb.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            FragmentKt.setFragmentResult(c46725tcb, simpleName, BundleKt.bundleOf(C56390yDp.OLrzqt("data", pair.getFirst()), C56390yDp.OLrzqt("InstType", pair.getSecond())));
        }
        c46725tcb.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}

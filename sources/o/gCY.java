package o;

import com.okinc.business.defi.biz.core.tx.speedup.bean.EvmSpeedUpInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gCY extends gCD<EvmSpeedUpInfoBean, C12553cpE> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public C12553cpE AhwBna = new C12553cpE();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lo/cmV; */
    /* JADX DEBUG: Possible override for method o.gCD.AhwBna()V */
    @Override // o.gCR
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public C12553cpE gEmmrt() {
        return this.AhwBna;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gCY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final gCY copydefault(@NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            gCY gcy = new gCY();
            gcy.setArguments(bundle);
            return gcy;
        }
    }

    @Override // o.gCD, o.gCR
    public void copydefault() {
        super.copydefault();
        android.widget.TextView textView = KWHzl().OLrzqt;
        int i = C13754dXa.FragmentManager.DcMfJKDGTeJD;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String strSSMYrx = gEmmrt().sSMYrx();
        C10854bwM c10854bwMOLrzqt = gEmmrt().OLrzqt();
        pairArr[0] = C56390yDp.OLrzqt("gasPrice", C54869xYi.weiToGwei$default(strSSMYrx, c10854bwMOLrzqt != null ? java.lang.Integer.valueOf(c10854bwMOLrzqt.valueOf()) : null, true, null, false, 12, null));
        pairArr[1] = C56390yDp.OLrzqt("gasLimit", C54869xYi.OLrzqt(gEmmrt().gHZMYf()));
        textView.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}

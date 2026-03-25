package o;

import com.okinc.business.defi.biz.core.tx.speedup.bean.EvmSpeedUpInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gDg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19462gDg extends gCF<EvmSpeedUpInfoBean, C12573cpY> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C12573cpY djBIcL = new C12573cpY();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lo/cmV; */
    /* JADX DEBUG: Possible override for method o.gCF.AhwBna()V */
    @Override // o.gCR
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public C12573cpY gEmmrt() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.gDg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gDg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C19462gDg KWHzl(@NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            C19462gDg c19462gDg = new C19462gDg();
            c19462gDg.setArguments(bundle);
            return c19462gDg;
        }
    }

    @Override // o.gCF, o.gCR
    public void copydefault() {
        super.copydefault();
        android.widget.TextView textView = KWHzl().copydefault.copydefault;
        int i = C13754dXa.FragmentManager.DcMfJKDGTeJD;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String strORxRYg = gEmmrt().ORxRYg();
        C10854bwM c10854bwMOLrzqt = gEmmrt().OLrzqt();
        pairArr[0] = C56390yDp.OLrzqt("gasPrice", C54869xYi.weiToGwei$default(strORxRYg, c10854bwMOLrzqt != null ? java.lang.Integer.valueOf(c10854bwMOLrzqt.valueOf()) : null, true, null, false, 12, null));
        pairArr[1] = C56390yDp.OLrzqt("gasLimit", C54869xYi.OLrzqt(gEmmrt().AwvSrB()));
        textView.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        android.widget.TextView textView2 = KWHzl().AEQbTJ.copydefault;
        int i2 = C13754dXa.FragmentManager.DcMfJKDGTeJD;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        java.lang.String strSSMYrx = gEmmrt().sSMYrx();
        C10854bwM c10854bwMOLrzqt2 = gEmmrt().OLrzqt();
        pairArr2[0] = C56390yDp.OLrzqt("gasPrice", C54869xYi.weiToGwei$default(strSSMYrx, c10854bwMOLrzqt2 != null ? java.lang.Integer.valueOf(c10854bwMOLrzqt2.valueOf()) : null, true, null, false, 12, null));
        pairArr2[1] = C56390yDp.OLrzqt("gasLimit", C54869xYi.OLrzqt(gEmmrt().gHZMYf()));
        textView2.setText(C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2)));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}

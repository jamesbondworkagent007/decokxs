package o;

import com.okinc.business.defi.biz.core.tx.speedup.bean.EvmSpeedUpInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19458gDc extends gCD<EvmSpeedUpInfoBean, C12539cor> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C12539cor AhwBna = new C12539cor();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lo/cmV; */
    /* JADX DEBUG: Possible override for method o.gCD.djBIcL()V */
    @Override // o.gCR
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C12539cor gEmmrt() {
        return this.AhwBna;
    }

    /* JADX INFO: renamed from: o.gDc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gDc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C19458gDc AEQbTJ(@NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            C19458gDc c19458gDc = new C19458gDc();
            c19458gDc.setArguments(bundle);
            return c19458gDc;
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
    }
}

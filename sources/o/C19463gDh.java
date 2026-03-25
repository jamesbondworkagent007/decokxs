package o;

import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19463gDh extends gCD<UTXOSpeedUpInfoBean, C12482cnl> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public C12482cnl AhwBna = new C12482cnl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lo/cmV; */
    /* JADX DEBUG: Possible override for method o.gCD.djBIcL()V */
    @Override // o.gCR
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C12482cnl gEmmrt() {
        return this.AhwBna;
    }

    /* JADX INFO: renamed from: o.gDh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gDh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C19463gDh OLrzqt(@NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            C19463gDh c19463gDh = new C19463gDh();
            c19463gDh.setArguments(bundle);
            return c19463gDh;
        }
    }

    @Override // o.gCD, o.gCR
    public void copydefault() {
        super.copydefault();
        KWHzl().OLrzqt.setText(pTB.formatLocalizedWithMinPrecision$default(gEmmrt().AuCTelauCTel(), 0, null, 3, null) + " Sat/vB");
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}

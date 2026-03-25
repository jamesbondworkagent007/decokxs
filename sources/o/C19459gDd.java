package o;

import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19459gDd extends gCF<UTXOSpeedUpInfoBean, C12481cnk> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C12481cnk djBIcL = new C12481cnk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lo/cmV; */
    /* JADX DEBUG: Possible override for method o.gCF.AhwBna()V */
    @Override // o.gCR
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public C12481cnk gEmmrt() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.gDd$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gDd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C19459gDd OLrzqt(@NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            C19459gDd c19459gDd = new C19459gDd();
            c19459gDd.setArguments(bundle);
            return c19459gDd;
        }
    }

    @Override // o.gCF, o.gCR
    public void copydefault() {
        super.copydefault();
        KWHzl().copydefault.copydefault.setVisibility(8);
        KWHzl().copydefault.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(gEmmrt().gHZMYf(), 0, null, 2, null) + " Sat/vB");
        KWHzl().AEQbTJ.copydefault.setVisibility(8);
        KWHzl().AEQbTJ.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(gEmmrt().AuCTelauCTel(), 0, null, 2, null) + " Sat/vB");
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}

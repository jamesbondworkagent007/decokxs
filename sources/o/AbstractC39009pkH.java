package o;

import com.okinc.kline.data.PriceWarningItemBean;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C36250oUv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC39009pkH extends AbstractC32998moE {
    public android.widget.TextView AhwBna;
    public C36250oUv djBIcL;
    public C55113xdn gEmmrt;
    public C36250oUv.StateListAnimator valueOf;
    public java.util.List<? extends oLY> AYXKKw = yDY.AhwBna();
    public int copydefault = 50;
    public final java.lang.String OLrzqt = "M";

    public abstract void OLrzqt();

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = (C55113xdn) view.findViewById(C35964oKf.StateListAnimator.DcMfJKDSqxTE);
        this.djBIcL = (C36250oUv) view.findViewById(C35964oKf.StateListAnimator.sFt);
        this.AhwBna = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.setCaptioningEnabled);
        EZpvd();
        C36250oUv c36250oUv = this.djBIcL;
        if (c36250oUv != null) {
            c36250oUv.setVisibility(0);
        }
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        if (interfaceC39509ptgDjBIcL != null) {
            interfaceC39509ptgDjBIcL.valueOf();
        }
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.valueOf = stateListAnimator;
        C36250oUv c36250oUv2 = this.djBIcL;
        if (c36250oUv2 != null) {
            c36250oUv2.setChartStateListener(stateListAnimator);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.pkH$StateListAnimator */
    public static final class StateListAnimator implements C36250oUv.StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C36250oUv.StateListAnimator
        public void OLrzqt(PriceWarningItemBean priceWarningItemBean, java.lang.String str) {
            Intrinsics.checkNotNullParameter(priceWarningItemBean, "");
            Intrinsics.checkNotNullParameter(str, "");
        }

        @Override // o.C36250oUv.StateListAnimator
        public void EZpvd() {
            C37908pFd.djBIcL("");
        }

        @Override // o.C36250oUv.StateListAnimator
        public void KWHzl() {
            C37908pFd.copydefault("");
        }
    }

    public void EZpvd() {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapSSMYrx = C36246oUr.copydefault().sSMYrx();
        C36250oUv c36250oUv = this.djBIcL;
        com.okinc.kline.library.data.DataSource dataSource = mapSSMYrx.get(c36250oUv != null ? c36250oUv.fIwbmz() : null);
        if (dataSource != null) {
            dataSource.KWHzl();
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (pFS.KWHzl.KWHzl(getParentFragment())) {
            return;
        }
        OLrzqt();
    }
}

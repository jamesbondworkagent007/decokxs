package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qDL implements qDN {
    public final qHM AEQbTJ;
    public final qHR copydefault;

    public qDL(qHM qhm, qHR qhr) {
        this.AEQbTJ = qhm;
        this.copydefault = qhr;
    }

    @Override // o.qDN
    public void AEQbTJ(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        qHM qhm = this.AEQbTJ;
        if (qhm != null) {
            C46688tbr.KWHzl.KWHzl("SearchRecommendRootFragmentItemClick", C56423yEv.EZpvd(C56390yDp.OLrzqt(bizInstrument.getInstId(), bizInstrument.getInstType())));
            qhm.OLrzqt(bizInstrument, i, null, str, false, false);
        }
    }

    @Override // o.qDN
    public void OLrzqt(@NotNull BizInstrument bizInstrument, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        qHR qhr = this.copydefault;
        if (qhr != null) {
            qhr.EZpvd(i, bizInstrument, !z);
        }
    }
}

package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40173qMa implements qDN {
    public final qPL EZpvd;
    public final qKN copydefault;

    public C40173qMa(qPL qpl, qKN qkn) {
        this.EZpvd = qpl;
        this.copydefault = qkn;
    }

    @Override // o.qDN
    public void AEQbTJ(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        qPL qpl = this.EZpvd;
        if (qpl != null) {
            qpl.KWHzl(view, bizInstrument, i, C27989kKu.Companion.KWHzl(), "", "", false);
        }
    }

    @Override // o.qDN
    public void OLrzqt(@NotNull BizInstrument bizInstrument, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (z) {
            qKN qkn = this.copydefault;
            if (qkn != null) {
                qkn.KWHzl(bizInstrument);
                return;
            }
            return;
        }
        qKN qkn2 = this.copydefault;
        if (qkn2 != null) {
            qkn2.OLrzqt(bizInstrument);
        }
    }
}

package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMA {
    public final android.content.Context OLrzqt;
    public final TeeWsToastData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeWsToastData copydefault() {
        return this.copydefault;
    }

    public gMA(@NotNull android.content.Context context, @NotNull TeeWsToastData teeWsToastData) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(teeWsToastData, "");
        this.OLrzqt = context;
        this.copydefault = teeWsToastData;
    }

    public final C55097xdX AEQbTJ(@NotNull gML gml) {
        java.lang.String strAYXKKw;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(gml, "");
        C55097xdX c55097xdX = new C55097xdX(this.OLrzqt, null, 0, 4, null);
        c55097xdX.setState(gml.AEQbTJ());
        if (gml.EZpvd() != null) {
            gMN gmnInvoke = gml.EZpvd().invoke(this.copydefault);
            if (!gmnInvoke.AEQbTJ().isEmpty()) {
                string = C33069mpW.KWHzl(this.OLrzqt, gmnInvoke.EZpvd(), gmnInvoke.AEQbTJ());
            } else {
                string = this.OLrzqt.getString(gmnInvoke.EZpvd());
                Intrinsics.copydefault((java.lang.Object) string);
            }
            c55097xdX.setTitle(string);
        } else if (gml.AYXKKw() != null) {
            if (gml.OLrzqt() != null) {
                strAYXKKw = C33069mpW.copydefault(gml.AYXKKw().intValue(), gml.OLrzqt());
            } else {
                strAYXKKw = C33070mpX.AYXKKw(gml.AYXKKw().intValue());
            }
            c55097xdX.setTitle(strAYXKKw);
        }
        java.lang.Integer numCopydefault = gml.copydefault();
        if (numCopydefault != null) {
            c55097xdX.setLeadingIcon(C33070mpX.KWHzl(numCopydefault.intValue()));
        }
        return c55097xdX;
    }

    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("fromToken", this.copydefault.getFromTokenSymbol());
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("toToken", this.copydefault.getToTokenSymbol());
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String fromAmount = this.copydefault.getFromAmount();
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt("fromCount", C23272hvB.formatScientificCurrency$default(c23272hvB, fromAmount, true, roundingMode, false, false, false, true, null, false, false, 476, null)), C56390yDp.OLrzqt("toCount", C23272hvB.formatScientificCurrency$default(c23272hvB, this.copydefault.getToAmount(), true, roundingMode, false, false, false, true, null, false, false, 476, null)));
    }
}

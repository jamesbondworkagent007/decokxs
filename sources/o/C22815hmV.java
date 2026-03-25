package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22815hmV {
    public final AbstractC23101hrq OLrzqt;

    public C22815hmV(@NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.OLrzqt = abstractC23101hrq;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strKWHzl;
        java.lang.String tokenSymbol;
        java.lang.StringBuilder sb;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = this.OLrzqt.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null || (strKWHzl = C25189iry.KWHzl(quotePriceResAxsJAYsNCnLh)) == null) {
            strKWHzl = "--";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.OLrzqt.QUSxYX().valueOf();
        if (dexMultiTokenInfoBeanValueOf == null || (tokenSymbol = dexMultiTokenInfoBeanValueOf.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        if (tokenSymbol.length() == 0) {
            return strKWHzl;
        }
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            sb = new java.lang.StringBuilder();
            sb.append(tokenSymbol);
            sb.append(" ");
            sb.append(strKWHzl);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(strKWHzl);
            sb.append(" ");
            sb.append(tokenSymbol);
        }
        return sb.toString();
    }
}

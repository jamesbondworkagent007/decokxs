package o;

import com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId;
import com.okinc.business.market.features.overview.ui.widget.CoinLabelInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29082kmt {
    public static final CoinLabelInfo copydefault(@NotNull C29006klW c29006klW, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c29006klW, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CoinInfoGridCellId coinInfoGridCellIdOLrzqt = c29006klW.OLrzqt();
        java.lang.String strKWHzl = c29006klW.KWHzl();
        java.lang.String string = c29006klW.copydefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strAYXKKw = c29006klW.AYXKKw();
        java.lang.Integer numEZpvd = c29006klW.EZpvd();
        return new CoinLabelInfo(coinInfoGridCellIdOLrzqt, str, str2, strKWHzl, string, strAYXKKw, numEZpvd != null ? numEZpvd.intValue() : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), c29006klW.djBIcL());
    }
}

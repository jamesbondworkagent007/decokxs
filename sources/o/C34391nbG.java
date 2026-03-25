package o;

import com.okinc.dexkline.market.features.overview.ui.widget.CoinInfoGridCellId;
import com.okinc.dexkline.market.features.overview.ui.widget.CoinLabelInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34391nbG {
    public static final CoinLabelInfo copydefault(@NotNull C34423nbm c34423nbm, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c34423nbm, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CoinInfoGridCellId coinInfoGridCellIdKWHzl = c34423nbm.KWHzl();
        java.lang.String strCopydefault = c34423nbm.copydefault();
        java.lang.String string = c34423nbm.OLrzqt().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strGEmmrt = c34423nbm.gEmmrt();
        java.lang.Integer numAEQbTJ = c34423nbm.AEQbTJ();
        return new CoinLabelInfo(coinInfoGridCellIdKWHzl, str, str2, strCopydefault, string, strGEmmrt, numAEQbTJ != null ? numAEQbTJ.intValue() : mUM.copydefault(C52761wXj.Activity.fdOvFl), c34423nbm.AhwBna());
    }
}

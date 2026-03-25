package o;

import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55913xss extends AbstractC55909xso {
    @Override // o.InterfaceC55914xst
    public C55851xrj AEQbTJ(int i, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, SpotGridTpSlConfig spotGridTpSlConfig, java.lang.String str6) {
        java.lang.String minSlPnlRatio;
        java.lang.String maxSlPnlRatio;
        java.lang.String str7 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (spotGridTpSlConfig == null || (minSlPnlRatio = spotGridTpSlConfig.getMinSlPnlRatio()) == null) {
            minSlPnlRatio = "";
        }
        if (spotGridTpSlConfig != null && (maxSlPnlRatio = spotGridTpSlConfig.getMaxSlPnlRatio()) != null) {
            str7 = maxSlPnlRatio;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getPercentRating);
        xMR xmr = xMR.copydefault;
        return new C55851xrj(strAYXKKw, 2, "-" + xMR.formatPercent$default(xmr, str7, 0, null, 6, null) + " ~ -" + xMR.formatPercent$default(xmr, minSlPnlRatio, 0, null, 6, null), null, 8, null);
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        if (str != null && str.length() != 0) {
            java.lang.String minSlPnlRatio = spotGridTpSlConfig.getMinSlPnlRatio();
            java.lang.String maxSlPnlRatio = spotGridTpSlConfig.getMaxSlPnlRatio();
            if (C33129mqd.AEQbTJ(str, maxSlPnlRatio)) {
                return C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.getPercentRating)), C56390yDp.OLrzqt("lowLimit", "-" + xMR.formatPercent$default(xMR.copydefault, maxSlPnlRatio, 0, null, 6, null))));
            }
            if (C33129mqd.gEmmrt(str, minSlPnlRatio)) {
                return C33069mpW.copydefault(C55688xof.Application.isSystemPickerAvailableactivity_release, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.getPercentRating)), C56390yDp.OLrzqt("upLimit", "-" + xMR.formatPercent$default(xMR.copydefault, minSlPnlRatio, 0, null, 6, null))));
            }
        }
        return "";
    }
}

package o;

import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55911xsq extends AbstractC55905xsk {
    @Override // o.InterfaceC55914xst
    public C55851xrj AEQbTJ(int i, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, SpotGridTpSlConfig spotGridTpSlConfig, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C55887xsS c55887xsSAEQbTJ = AEQbTJ(str3, str2, str4, str5);
        java.lang.String strEZpvd = EZpvd(str3, str2, str4, str5);
        return new C55851xrj(C33070mpX.AYXKKw(C55688xof.Application.newStarRating), i, "≥ " + strEZpvd + " " + c55887xsSAEQbTJ.copydefault("grid"), null, 8, null);
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(spotGridTpSlConfig, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        if (str != null && str.length() != 0) {
            C55887xsS c55887xsSAEQbTJ = AEQbTJ(str3, str4, str5, str6);
            java.lang.String strEZpvd = EZpvd(str3, str4, str5, str6);
            java.lang.String strCopydefault = c55887xsSAEQbTJ.copydefault("grid");
            pUU.EZpvd("GRID_TPSL", "TP PNL type validation: minimum = " + strEZpvd + ", investBy = " + str3);
            if (C33129mqd.gEmmrt(str, strEZpvd)) {
                return C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.newStarRating)), C56390yDp.OLrzqt("lowLimit", strEZpvd + " " + strCopydefault)));
            }
        }
        return "";
    }
}

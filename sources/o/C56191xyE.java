package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.HedgingEstimatesResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56191xyE extends xKE<java.util.List<? extends HedgingEstimatesResp>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.HedgingEstimatesResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends HedgingEstimatesResp>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str7 = this.KWHzl;
        if (str7 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str7;
        }
        java.lang.String str8 = this.copydefault;
        if (str8 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str8;
        }
        java.lang.String str9 = this.OLrzqt;
        if (str9 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str9;
        }
        java.lang.String str10 = this.AEQbTJ;
        if (str10 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        } else {
            str4 = str10;
        }
        java.lang.String str11 = this.EZpvd;
        if (str11 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        } else {
            str5 = str11;
        }
        java.lang.String str12 = this.gEmmrt;
        if (str12 == null) {
            Intrinsics.gEmmrt("");
            str6 = null;
        } else {
            str6 = str12;
        }
        return bizApiService.getHedgingEstimates(str, str2, str3, str4, str5, str6);
    }
}

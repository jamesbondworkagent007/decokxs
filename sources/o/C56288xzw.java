package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56288xzw extends xKE<java.util.List<? extends LiquidatePriceResponse>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.Boolean copydefault;
    public java.lang.String djBIcL;
    public java.lang.String fIwbmz;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.Integer isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk(java.lang.String str) {
        this.fIwbmz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Boolean bool) {
        this.copydefault = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Integer num) {
        this.isConnected = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.LiquidatePriceResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends LiquidatePriceResponse>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str7 = this.EZpvd;
        if (str7 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str7;
        }
        java.lang.String str8 = this.gEmmrt;
        if (str8 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str8;
        }
        java.lang.String str9 = this.djBIcL;
        if (str9 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str9;
        }
        java.lang.String str10 = this.valueOf;
        if (str10 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        } else {
            str4 = str10;
        }
        java.lang.String str11 = this.values;
        if (str11 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        } else {
            str5 = str11;
        }
        java.lang.String str12 = this.fetchVPNInfo;
        java.lang.String str13 = this.AYXKKw;
        if (str13 == null) {
            Intrinsics.gEmmrt("");
            str6 = null;
        } else {
            str6 = str13;
        }
        return bizApiService.getLiquidatePrice(str, str2, str3, str4, str5, str12, str6, this.isConnected, this.AkhnZx, this.fIwbmz, this.copydefault, this.KWHzl, this.AhwBna, this.AEQbTJ, this.OLrzqt, this.DbNXlk);
    }
}

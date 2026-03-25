package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56236xyx extends xKE<java.util.List<? extends Distribution>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String DbNXlk;
    public int EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(java.lang.String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(java.lang.String str) {
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(java.lang.String str) {
        this.AkhnZx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values(java.lang.String str) {
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.Distribution>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends Distribution>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str6 = this.OLrzqt;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str6;
        }
        int i = this.EZpvd;
        java.lang.String str7 = this.KWHzl;
        if (str7 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str7;
        }
        java.lang.String str8 = this.gEmmrt;
        if (str8 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str8;
        }
        java.lang.String str9 = this.djBIcL;
        if (str9 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        } else {
            str4 = str9;
        }
        java.lang.String str10 = this.AEQbTJ;
        if (str10 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        } else {
            str5 = str10;
        }
        return bizApiService.getGridHoldingDistribution(str, i, str2, str3, str4, str5, this.copydefault, this.AYXKKw, this.valueOf, this.AhwBna, this.AkhnZx, this.fetchVPNInfo, this.DbNXlk);
    }
}

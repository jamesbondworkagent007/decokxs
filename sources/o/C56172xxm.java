package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56172xxm extends xKE<java.util.List<? extends MaxAvailableResp>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw = "0";
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.Boolean DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.Boolean OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String fIwbmz;
    public java.lang.Boolean fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56172xxm AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56172xxm EZpvd(java.lang.String str) {
        this.AuCTel = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56172xxm KWHzl(java.lang.Boolean bool) {
        this.DbNXlk = bool;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56172xxm KWHzl(java.lang.String str) {
        this.valueOf = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56172xxm OLrzqt(java.lang.String str) {
        this.gEmmrt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56172xxm copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.MaxAvailableResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends MaxAvailableResp>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = this.EZpvd;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        if (str3.length() != 0) {
            java.lang.String str4 = this.fetchVPNInfo;
            if (str4 == null) {
                Intrinsics.gEmmrt("");
                str4 = null;
            }
            if (str4.length() != 0) {
                BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
                java.lang.String str5 = this.AEQbTJ;
                java.lang.String str6 = this.copydefault;
                java.lang.String str7 = this.EZpvd;
                if (str7 == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                } else {
                    str = str7;
                }
                java.lang.String str8 = this.KWHzl;
                java.lang.String str9 = this.djBIcL;
                java.lang.String str10 = this.fetchVPNInfo;
                if (str10 == null) {
                    Intrinsics.gEmmrt("");
                    str2 = null;
                } else {
                    str2 = str10;
                }
                return BizApiService.TaskDescription.getMaxAvailable$default(bizApiService, str5, str6, str, str8, str9, str2, this.DbNXlk, this.isConnected, this.gEmmrt, this.valueOf, this.values, this.AhwBna, this.fIwbmz, this.AkhnZx, this.fJNWhG, null, null, this.OLrzqt, this.AYXKKw, this.AuCTel, 98304, null);
            }
        }
        return null;
    }
}

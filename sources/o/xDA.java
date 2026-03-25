package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xDA extends xKE<java.util.List<? extends TradeOrderData>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA AEQbTJ(java.lang.String str) {
        this.AhwBna = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA AYXKKw(java.lang.String str) {
        this.fetchVPNInfo = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA AkhnZx(java.lang.String str) {
        this.isConnected = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA EZpvd(java.lang.String str) {
        this.valueOf = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA KWHzl(java.lang.String str) {
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA OLrzqt(java.lang.String str) {
        this.gEmmrt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA copydefault(java.lang.String str) {
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA djBIcL(java.lang.String str) {
        this.AYXKKw = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA fetchVPNInfo(java.lang.String str) {
        this.values = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA gEmmrt(java.lang.String str) {
        this.AEQbTJ = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA isConnected(java.lang.String str) {
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA valueOf(java.lang.String str) {
        this.djBIcL = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDA values(java.lang.String str) {
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.TradeOrderData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TradeOrderData>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        java.lang.String str = this.djBIcL;
        java.lang.String str2 = this.AhwBna;
        java.lang.String str3 = this.AYXKKw;
        java.lang.String str4 = this.fetchVPNInfo;
        java.lang.String str5 = this.isConnected;
        java.lang.String str6 = this.valueOf;
        java.lang.String str7 = this.AkhnZx;
        Intrinsics.copydefault((java.lang.Object) str7);
        return bizApiService.getHistoryOrdersIn3Months(str, str2, str3, str4, str5, str6, str7, this.KWHzl, this.copydefault, this.AEQbTJ, this.EZpvd, this.OLrzqt, this.values, this.gEmmrt, java.lang.Boolean.TRUE);
    }
}

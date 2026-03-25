package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54317xDy extends xKE<java.util.List<? extends TradeOrderData>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy AEQbTJ(java.lang.String str) {
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy AYXKKw(java.lang.String str) {
        this.AYXKKw = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy AhwBna(java.lang.String str) {
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy DbNXlk(java.lang.String str) {
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy EZpvd(java.lang.String str) {
        this.djBIcL = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy KWHzl(java.lang.String str) {
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy OLrzqt(java.lang.String str) {
        this.valueOf = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy copydefault(java.lang.String str) {
        this.gEmmrt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy djBIcL(java.lang.String str) {
        this.AhwBna = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy gEmmrt(java.lang.String str) {
        this.AEQbTJ = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy valueOf(java.lang.String str) {
        this.DbNXlk = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54317xDy values(java.lang.String str) {
        this.isConnected = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.TradeOrderData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TradeOrderData>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        java.lang.String str = this.AYXKKw;
        java.lang.String str2 = this.valueOf;
        java.lang.String str3 = this.djBIcL;
        java.lang.String str4 = this.DbNXlk;
        java.lang.String str5 = this.isConnected;
        java.lang.String str6 = this.gEmmrt;
        java.lang.String str7 = this.AhwBna;
        Intrinsics.copydefault((java.lang.Object) str7);
        return bizApiService.getPendingOrders(str, str2, str3, str4, str5, str6, str7, this.AEQbTJ, this.copydefault, this.KWHzl, this.OLrzqt, this.EZpvd);
    }
}

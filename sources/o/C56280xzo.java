package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xzo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56280xzo extends xKE<java.util.List<? extends SmartRecommendResp>> {
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public long AhwBna;
    public java.lang.String OLrzqt;
    public java.lang.String gEmmrt;
    public java.lang.String EZpvd = "";
    public java.lang.String AYXKKw = "";
    public java.lang.String copydefault = "";

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.copydefault = str3;
        this.gEmmrt = str4;
        this.AhwBna = java.lang.System.currentTimeMillis();
        if (Intrinsics.EZpvd((java.lang.Object) "neutral", (java.lang.Object) str5)) {
            str5 = "net";
        }
        this.AEQbTJ = str5;
        this.OLrzqt = str6;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.bot.SmartRecommendResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SmartRecommendResp>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).queryRecommendList(this.EZpvd, this.AYXKKw, this.copydefault, this.gEmmrt, this.AhwBna, this.AEQbTJ, this.OLrzqt);
    }
}

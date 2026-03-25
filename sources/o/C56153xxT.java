package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractLeverTierLimitResult;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56153xxT extends xKE<java.util.List<? extends ContractLeverTierLimitResult>> {
    public java.lang.String AEQbTJ;
    public java.lang.Boolean AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56153xxT AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.Boolean bool) {
        this.EZpvd = str;
        this.copydefault = str2;
        this.djBIcL = str3;
        this.AEQbTJ = str4;
        this.AhwBna = str5;
        this.valueOf = str6;
        this.gEmmrt = str7;
        this.OLrzqt = str8;
        this.KWHzl = str9;
        this.AYXKKw = bool;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractLeverTierLimitResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractLeverTierLimitResult>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchContractDcaTierLimit(this.EZpvd, this.copydefault, this.djBIcL, this.AEQbTJ, this.AhwBna, this.valueOf, this.gEmmrt, this.OLrzqt, this.KWHzl, this.AYXKKw);
    }
}

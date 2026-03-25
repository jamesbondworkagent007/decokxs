package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractDcaLiqPxResult;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56181xxv extends xKE<java.util.List<? extends ContractDcaLiqPxResult>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public boolean gEmmrt = true;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56181xxv copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        this.copydefault = str;
        this.OLrzqt = str2;
        this.AhwBna = str3;
        this.EZpvd = str4;
        this.AYXKKw = str5;
        this.djBIcL = str6;
        this.DbNXlk = str7;
        this.KWHzl = str8;
        this.AEQbTJ = str9;
        this.valueOf = str10;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractDcaLiqPxResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractDcaLiqPxResult>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str = this.copydefault;
        java.lang.String str2 = this.OLrzqt;
        java.lang.String str3 = this.AhwBna;
        java.lang.String str4 = this.EZpvd;
        java.lang.String str5 = this.AYXKKw;
        java.lang.String str6 = this.djBIcL;
        java.lang.String str7 = this.DbNXlk;
        java.lang.String str8 = this.KWHzl;
        java.lang.String str9 = this.AEQbTJ;
        boolean z = this.gEmmrt;
        return bizApiService.fetchContractDcaLiqPx(str, str2, str3, str4, str5, str6, str7, str8, str9, java.lang.Boolean.valueOf(z), this.valueOf);
    }
}

package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56216xyd extends xKE<java.util.List<? extends StrategyGridTradeOrderDetailsResponse>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.Integer AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Integer num) {
        this.AhwBna = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyGridTradeOrderDetailsResponse>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str3 = this.OLrzqt;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str3;
        }
        java.lang.String str4 = this.KWHzl;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str4;
        }
        return bizApiService.getGridTradeDetails(str, str2, this.copydefault, this.AEQbTJ, this.EZpvd, this.AhwBna, this.AYXKKw);
    }
}

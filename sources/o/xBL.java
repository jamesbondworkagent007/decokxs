package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.UserTierData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xBL extends xKE<java.util.List<? extends UserTierData>> {
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd = "";
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBL AEQbTJ(java.lang.String str) {
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBL KWHzl(java.lang.String str) {
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBL OLrzqt(java.lang.String str) {
        this.gEmmrt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBL copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.roT.httpService$default(o.yJo, o.roR, int, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.UserTierData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends UserTierData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getTier(this.EZpvd, this.OLrzqt, this.AEQbTJ, this.KWHzl, this.valueOf);
    }
}

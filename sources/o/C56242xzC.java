package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotAddInvestLimitResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56242xzC extends xKE<java.util.List<? extends BotAddInvestLimitResponse>> {
    public java.lang.String EZpvd = "";
    public java.lang.String copydefault = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String KWHzl = "";
    public java.lang.Boolean AEQbTJ = java.lang.Boolean.TRUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Boolean bool) {
        this.AEQbTJ = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotAddInvestLimitResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotAddInvestLimitResponse>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).botAddInvestLimit(this.EZpvd, this.copydefault, this.OLrzqt, this.KWHzl, this.AEQbTJ);
    }
}

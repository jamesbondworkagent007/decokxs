package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.FundingRateArbResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56195xyI extends xKE<java.util.List<? extends FundingRateArbResult>> {
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.FundingRateArbResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends FundingRateArbResult>>> EZpvd() {
        java.lang.String str = null;
        InterfaceC55703xou interfaceC55703xou = (InterfaceC55703xou) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC55703xou.class), null, 1, null);
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        java.lang.String str3 = this.KWHzl;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str3;
        }
        return interfaceC55703xou.copydefault(str2, str);
    }
}

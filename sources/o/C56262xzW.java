package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.MultiMinAmountItem;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56262xzW extends xKE<java.util.List<? extends MultiMinAmountItem>> {
    public java.lang.String AEQbTJ;
    public SubArbitrageType4Remote AhwBna = SubArbitrageType4Remote.EMPTY;
    public java.util.List<java.lang.String> EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.MultiMinAmountItem>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends MultiMinAmountItem>>> EZpvd() {
        if (this.AhwBna == SubArbitrageType4Remote.EMPTY) {
            return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getMultiInstsMinAmount(this.EZpvd, this.AEQbTJ, this.OLrzqt, this.copydefault, this.KWHzl, null, this.gEmmrt);
        }
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.util.List<java.lang.String> list = this.EZpvd;
        java.lang.String str = this.AEQbTJ;
        java.lang.String str2 = this.OLrzqt;
        java.lang.String str3 = this.copydefault;
        java.lang.String str4 = this.KWHzl;
        java.lang.String lowerCase = this.AhwBna.name().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return bizApiService.getMultiInstsMinAmount(list, str, str2, str3, str4, C56402yEa.EZpvd(lowerCase), this.gEmmrt);
    }
}

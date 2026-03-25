package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54223xAl extends xKE<java.util.List<? extends ArbitrageInfoResponse>> {
    public static final int OLrzqt = 8;
    public SubArbitrageType4Remote AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;
    public java.lang.String KWHzl = "";
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(SubArbitrageType4Remote subArbitrageType4Remote) {
        this.AYXKKw = subArbitrageType4Remote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(java.lang.String str) {
        this.gEmmrt = str;
    }

    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str = null;
        }
        this.valueOf = str;
    }

    public final void OLrzqt(java.lang.Float f) {
        this.EZpvd = f != null ? f.toString() : null;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ArbitrageInfoResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ArbitrageInfoResponse>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSmartArbInvestDetailsRefactor(this.KWHzl, this.AEQbTJ, this.valueOf, this.EZpvd, this.djBIcL, this.copydefault, this.AhwBna, this.AYXKKw, this.gEmmrt);
    }
}

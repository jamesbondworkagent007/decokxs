package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56168xxi extends xKE<java.util.List<? extends AdjustLeverRequiredData>> {
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi AEQbTJ(java.lang.String str) {
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi EZpvd(java.lang.String str) {
        this.AEQbTJ = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi copydefault(java.lang.String str) {
        this.AYXKKw = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi djBIcL(java.lang.String str) {
        this.AhwBna = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi valueOf(java.lang.String str) {
        this.djBIcL = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.AdjustLeverRequiredData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends AdjustLeverRequiredData>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str3 = this.copydefault;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str3;
        }
        java.lang.String str4 = this.AYXKKw;
        java.lang.String str5 = this.EZpvd;
        java.lang.String str6 = this.AEQbTJ;
        java.lang.String str7 = this.djBIcL;
        java.lang.String str8 = this.KWHzl;
        if (str8 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str8;
        }
        return bizApiService.getAdjustLeverRequired(str, str4, str5, str6, str7, str2, this.AhwBna);
    }
}

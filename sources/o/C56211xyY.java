package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalBotSubsInfoListBean;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56211xyY extends xKE<java.util.List<? extends SignalBotSubsInfoListBean>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.OLrzqt = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.AEQbTJ = str4;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SignalBotSubsInfoListBean>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SignalBotSubsInfoListBean>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.OLrzqt;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        java.lang.String str3 = this.copydefault;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        java.lang.String str4 = this.EZpvd;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        }
        java.lang.String str5 = this.AEQbTJ;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str5;
        }
        return bizApiService.getSignalProviderPersonalSignals(str2, str3, str4, str);
    }
}

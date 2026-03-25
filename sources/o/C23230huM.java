package o;

import com.okinc.business.dex.api.bean.ChainListInfo;
import com.okinc.business.dexlogic.bean.CandleResultBean;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.FaqSwapBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23230huM {
    public final InterfaceC23228huK KWHzl() {
        return InterfaceC23228huK.Companion.KWHzl(C23222huE.AEQbTJ);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<DefiChainInfo>>> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().OLrzqt(str));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<DefiChainInfo>>> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().AEQbTJ(str));
    }

    public final AbstractC58185ywX<ResponseData<CandleResultBean>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().EZpvd(str, str2, "", "", str3));
    }

    public final AbstractC58185ywX<ResponseData<CandleResultBean>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().EZpvd(str, str2, str3, str4, str5));
    }

    public final AbstractC58185ywX<ResponseData<FaqSwapBean>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().KWHzl(str, str2, str3));
    }

    public final AbstractC58185ywX<ResponseData<ChainListInfo>> OLrzqt() {
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().KWHzl());
    }
}

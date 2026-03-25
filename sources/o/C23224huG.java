package o;

import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23224huG {
    public final InterfaceC23225huH KWHzl() {
        return InterfaceC23225huH.Companion.copydefault(C23222huE.AEQbTJ);
    }

    public final AbstractC58185ywX<ResponseData<LimitCalResult>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().AEQbTJ(str4, str5, str6, str, str3, str2, null, null, str7));
    }

    public static /* synthetic */ AbstractC58185ywX getExpireTimeConfig$default(C23224huG c23224huG, BizMode bizMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizMode = BizMode.LIMIT_ORDER;
        }
        return c23224huG.OLrzqt(bizMode);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<ExpireTimeConfig>>> OLrzqt(@NotNull BizMode bizMode) {
        Intrinsics.checkNotNullParameter(bizMode, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().KWHzl(bizMode.getValue()));
    }

    public final AbstractC58185ywX<ResponseData<LimitSuggestCoinBean>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33024moe.KWHzl((AbstractC58185ywX) KWHzl().EZpvd(str, str2, str3));
    }
}

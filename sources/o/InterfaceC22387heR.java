package o;

import com.okinc.business.dex.api.bean.ChainListInfo;
import com.okinc.business.dexlogic.bean.CandleResultBean;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.FaqSwapBean;
import com.okinc.business.dexlogic.bean.MemeTokenInfo;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22387heR {
    java.util.ArrayList<SlippageConfigVo> AEQbTJ();

    AbstractC58185ywX<MemeTokenInfo> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    AbstractC58185ywX<FaqSwapBean> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    boolean AEQbTJ(@NotNull java.lang.String str, boolean z);

    java.util.ArrayList<DefiChainInfo> EZpvd();

    AbstractC58185ywX<CandleResultBean> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    AbstractC58185ywX<java.util.List<DefiChainInfo>> EZpvd(@NotNull java.lang.String str, boolean z);

    DefiChainInfo KWHzl(@NotNull java.lang.String str);

    java.util.ArrayList<DefiChainInfo> OLrzqt();

    AbstractC58185ywX<CandleResultBean> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5);

    AbstractC58185ywX<java.util.List<DefiChainInfo>> OLrzqt(@NotNull java.lang.String str, boolean z);

    AbstractC58185ywX<ChainListInfo> aF_();

    java.lang.String copydefault(boolean z);

    AbstractC58185ywX<java.util.List<SlippageConfigVo>> copydefault();

    AbstractC58185ywX<CheckContinueBean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    /* JADX INFO: renamed from: o.heR$Application */
    public static final class Application {
        public static /* synthetic */ AbstractC58185ywX getSupportChainList$default(InterfaceC22387heR interfaceC22387heR, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSupportChainList");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC22387heR.OLrzqt(str, z);
        }

        public static /* synthetic */ AbstractC58185ywX getSupportSingleChainList$default(InterfaceC22387heR interfaceC22387heR, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSupportSingleChainList");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC22387heR.EZpvd(str, z);
        }
    }
}

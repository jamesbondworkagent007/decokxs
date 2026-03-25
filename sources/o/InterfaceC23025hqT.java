package o;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC23025hqT {
    AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@NotNull java.lang.String str, @NotNull NewCallbackBean newCallbackBean, @NotNull SwapOrderInfoReq swapOrderInfoReq, UnsignedSwapData unsignedSwapData, @NotNull java.lang.String str2, @NotNull TeeSaStatus teeSaStatus);

    AbstractC58185ywX<ResponseData<MergeQuoteCallData>> OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull MergeQuoteCallDataReq mergeQuoteCallDataReq, boolean z2);

    AbstractC58185ywX<MergeCallData> copydefault(@NotNull java.lang.String str, boolean z, @NotNull DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, boolean z2, boolean z3);
}

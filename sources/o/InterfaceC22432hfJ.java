package o;

import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hfJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22432hfJ {
    AbstractC58185ywX<ResponseData<ApproveResultInfo>> EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull SwapApproveInfoReq swapApproveInfoReq);

    AbstractC58185ywX<ApproveSwapData> KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull DefiPlatformInfo defiPlatformInfo, java.lang.Integer num, @NotNull java.lang.String str, @NotNull DefiChainInfo defiChainInfo);

    boolean KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str);

    void copydefault();
}

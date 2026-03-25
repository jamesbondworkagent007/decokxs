package o;

import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.business.dex.trade.common.boost.model.LimitOrderConfirmResponse;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gNX {
    java.lang.Object EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, ServiceFeeInfo serviceFeeInfo, @NotNull Continuation<? super AbstractC43419rot<LimitOrderConfirmResponse, OKServerException>> continuation);

    java.lang.Object EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull Continuation<? super AbstractC43419rot<BoostEstimateVolumeResponse, OKServerException>> continuation);
}

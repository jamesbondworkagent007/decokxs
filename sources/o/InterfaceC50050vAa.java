package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.vAa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC50050vAa {
    @POST("/priapi/v5/algo/trade/ai/preview")
    java.lang.Object KWHzl(@Body @NotNull AiOrderReq aiOrderReq, @NotNull Continuation<? super ResponseData<java.util.List<PreviewAiStrategyResponseDto>>> continuation);
}

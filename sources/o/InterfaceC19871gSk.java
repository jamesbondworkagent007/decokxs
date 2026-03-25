package o;

import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CreateOrderResult;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19871gSk {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull SellSettings sellSettings, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super BuySettings> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull CopyTradingStrategy copyTradingStrategy, @NotNull Continuation<? super Result<CreateOrderResult>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull BuySettings buySettings, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super Result<CopyTradingDefaultConfig>> continuation);

    java.lang.Object OLrzqt(@NotNull CopyTradingStrategy copyTradingStrategy, @NotNull Continuation<? super Result<? extends JsonElement>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super TokenFilter> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends java.util.List<DefiChainInfo>>> continuation);

    void OLrzqt();

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super SellSettings> continuation);
}

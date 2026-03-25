package o;

import com.okinc.buysell.domain.GetUiFlowUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.bsc.FiatCommonUiFlowBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lyW {
    public final InterfaceC31764mDa KWHzl;

    public static /* synthetic */ java.lang.Object invoke$default(lyW lyw, java.lang.String str, java.lang.String str2, TradeType tradeType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return lyw.KWHzl(str, str2, tradeType, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TradeType tradeType, @NotNull Continuation<? super AbstractC43419rot<FiatCommonUiFlowBean, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetUiFlowUseCase$invoke$2(this, str, str2, tradeType, null), continuation);
    }
}

package o;

import com.okinc.buysell.domain.GetDefaultCurrencyUseCase$invoke$2;
import com.okinc.crcore.coreapi.enums.TradeType;
import com.okinc.crcore.shared.net.responsebean.bsc.DefaultCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyR {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC31764mDa OLrzqt;

    @yCM
    public lyR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = interfaceC31764mDa;
    }

    public static /* synthetic */ java.lang.Object invoke$default(lyR lyr, TradeType tradeType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeType = null;
        }
        return lyr.copydefault(tradeType, continuation);
    }

    public final java.lang.Object copydefault(TradeType tradeType, @NotNull Continuation<? super AbstractC43419rot<DefaultCurrencyBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetDefaultCurrencyUseCase$invoke$2(this, tradeType, null), continuation);
    }
}

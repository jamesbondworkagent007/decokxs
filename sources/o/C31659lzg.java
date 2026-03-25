package o;

import com.okinc.buysell.domain.TradeSuggestionUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31659lzg {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC31764mDa KWHzl;
    public final lyF OLrzqt;

    @yCM
    public C31659lzg(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull lyF lyf, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(lyf, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = lyf;
        this.KWHzl = interfaceC31764mDa;
    }

    public final java.lang.Object copydefault(@NotNull TradeType tradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, boolean z, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<TradeSuggestionBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new TradeSuggestionUseCase$invoke$2(str, str2, this, tradeType, str3, str4, i, z, str5, str6, null), continuation);
    }
}

package o;

import com.okinc.business.market.data.model.holdings.HoldingListResponseData;
import com.okinc.business.market.data.model.position_pnl.HoldingTokenData;
import com.okinc.business.market.data.model.position_pnl.HoldingTransactionData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28437kak {
    java.lang.Object EZpvd(@NotNull java.util.List<C28438kal> list, @NotNull Continuation<? super Flow<? extends java.util.List<HoldingTokenData>>> continuation);

    void EZpvd();

    java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Flow<? extends java.util.List<HoldingTransactionData>>> continuation);

    void OLrzqt();

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull C28443kaq c28443kaq, @NotNull Continuation<? super AbstractC43419rot<HoldingListResponseData, OKServerException>> continuation);
}

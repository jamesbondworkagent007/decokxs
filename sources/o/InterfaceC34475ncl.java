package o;

import com.okinc.dexkline.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC34475ncl {
    java.lang.Object EZpvd(long j, boolean z, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super AbstractC43419rot<PnLTransactionResponse, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation);

    java.lang.Object copydefault(@NotNull PnLExtraParams pnLExtraParams, @NotNull Continuation<? super Flow<? extends java.util.List<PnLTransactionData>>> continuation);
}

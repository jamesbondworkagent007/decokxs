package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.business.market.data.model.position_pnl.PnLTransactionData;
import com.okinc.business.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29132knq {
    java.lang.Object AEQbTJ(@NotNull PnLExtraParams pnLExtraParams, @NotNull Continuation<? super Flow<? extends java.util.List<PnLTransactionData>>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DexMultiTokenInfoBean, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(long j, boolean z, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super AbstractC43419rot<PnLTransactionResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Result<Unit>> continuation);
}

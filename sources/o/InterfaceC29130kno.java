package o;

import com.okinc.business.market.data.model.position_pnl.LimitOrderBalanceData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kno, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29130kno {
    Flow<java.util.List<C9922bei>> EZpvd();

    java.lang.Object copydefault(@NotNull C27610jyT c27610jyT, @NotNull Continuation<? super AbstractC43419rot<LimitOrderBalanceData, OKServerException>> continuation);
}

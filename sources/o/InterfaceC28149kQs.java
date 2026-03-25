package o;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.autosell.data.TPSLRemoteConfigResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28149kQs {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<? extends AdvancedAutoSellStrategy>> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<TPSLRemoteConfigResponse, OKServerException>> continuation);
}

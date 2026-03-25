package o;

import com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData;
import com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29294kqt {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<SurgeSignalGemsData, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<SignalStatusWsData>> continuation);
}

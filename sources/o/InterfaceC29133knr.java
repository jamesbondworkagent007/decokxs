package o;

import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29133knr {
    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<LatestPnLData, OKServerException>> continuation);

    void EZpvd();

    java.lang.Object OLrzqt(@NotNull PnLExtraParams pnLExtraParams, @NotNull Continuation<? super Flow<LatestPnLData>> continuation);
}

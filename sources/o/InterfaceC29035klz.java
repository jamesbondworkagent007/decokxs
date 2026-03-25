package o;

import com.okinc.business.market.data.model.OverviewData;
import com.okinc.business.market.data.model.TransactionInfoData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29035klz {
    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<TransactionInfoData, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<OverviewData, OKServerException>> continuation);
}

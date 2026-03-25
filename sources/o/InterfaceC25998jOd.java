package o;

import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers;
import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyersWs;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jOd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25998jOd {
    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<EarlyBuyers>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<EarlyBuyersWs>> continuation);

    void KWHzl();
}

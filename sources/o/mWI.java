package o;

import com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyers;
import com.okinc.dexkline.market.features.coindetail.domain.models.EarlyBuyersWs;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface mWI {
    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<EarlyBuyers>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<EarlyBuyersWs>> continuation);

    void copydefault();
}

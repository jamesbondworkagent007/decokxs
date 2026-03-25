package o;

import com.okinc.business.market.features.meme.data.model.PrivateBuySignalWsData;
import com.okinc.business.market.features.meme.data.model.PublicBuySignalWsData;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28692kfa {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<? extends java.util.List<PrivateBuySignalWsData>>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super Flow<? extends java.util.List<PublicBuySignalWsData>>> continuation);

    void KWHzl();
}

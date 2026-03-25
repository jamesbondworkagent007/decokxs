package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.market.remind.data.model.TokenPriceResponse;
import com.okinc.okmarket.ui.market.remind.data.repo.TokenPriceRepo$queryTokenPrice$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46855tez {
    public final CoroutineDispatcher KWHzl;
    public final C46850teu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public C46855tez(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C46850teu c46850teu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c46850teu, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c46850teu;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<TokenPriceResponse>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new TokenPriceRepo$queryTokenPrice$2(this, str, str2, null), continuation);
    }
}

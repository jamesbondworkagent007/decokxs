package o;

import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import com.okinc.kline.features.kline.indexcomponents.data.repo.IndexComponentsRepository$getIndexComponents$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oRD {
    public final CoroutineDispatcher EZpvd;
    public final oRA KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public oRD(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oRA ora) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ora, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = ora;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super IndexComponentsResp> continuation) {
        return BuildersKt.withContext(OLrzqt(), new IndexComponentsRepository$getIndexComponents$2(this, str, null), continuation);
    }
}

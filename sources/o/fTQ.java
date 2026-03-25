package o;

import com.okinc.business.defi.wallet.tee.common.usecase.AttestationVerifyUseCase$invoke$2;
import com.okinc.wallet.core.tee.TeeAttestationVerifyData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTQ {
    public final CoroutineDispatcher KWHzl;
    public final xYT copydefault;

    @yCM
    public fTQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull xYT xyt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(xyt, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = xyt;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super TeeAttestationVerifyData> continuation) {
        return BuildersKt.withContext(this.KWHzl, new AttestationVerifyUseCase$invoke$2(this, str, null), continuation);
    }
}

package o;

import com.okinc.business.defi.wallet.tee.common.usecase.EvmSignHandleUseCase$teeBase64Signature$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTW {
    public final xYW AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final xYT KWHzl;

    @yCM
    public fTW(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull xYT xyt, @NotNull xYW xyw) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(xyt, "");
        Intrinsics.checkNotNullParameter(xyw, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = xyt;
        this.AEQbTJ = xyw;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.EZpvd, new EvmSignHandleUseCase$teeBase64Signature$2(this, str, str2, null), continuation);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.EZpvd(str);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54910xZw.OLrzqt(this.AEQbTJ.values(str));
    }
}

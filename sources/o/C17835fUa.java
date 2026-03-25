package o;

import com.okinc.business.defi.wallet.tee.common.usecase.RsaCryptoHandleUseCase$teeRsaEncrypt$2;
import com.okinc.business.defi.wallet.tee.common.usecase.RsaCryptoHandleUseCase$teeRsaVerify$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fUa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17835fUa {
    public final xYT KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C17835fUa(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull xYT xyt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(xyt, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = xyt;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new RsaCryptoHandleUseCase$teeRsaVerify$2(this, str, str2, str3, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.copydefault, new RsaCryptoHandleUseCase$teeRsaEncrypt$2(this, str, str2, null), continuation);
    }
}

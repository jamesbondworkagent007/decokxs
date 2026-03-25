package o;

import com.okinc.business.defi.wallet.tee.common.usecase.HPKEHandleUseCase$getHPKEKeypair$2;
import com.okinc.business.defi.wallet.tee.common.usecase.HPKEHandleUseCase$teeEd25519Verify$2;
import com.okinc.business.defi.wallet.tee.common.usecase.HPKEHandleUseCase$teeHPKEDecrypt$2;
import com.okinc.business.defi.wallet.tee.common.usecase.HPKEHandleUseCase$teeHPKEEncrypt$2;
import com.okinc.wallet.core.mpc.PrivateKeyOriginData;
import com.okinc.wallet.core.tee.HPKEEncryptData;
import com.okinc.wallet.core.tee.HPKEKeypair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTV {
    public final CoroutineDispatcher AEQbTJ;
    public final xYT copydefault;

    @yCM
    public fTV(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull xYT xyt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(xyt, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = xyt;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super HPKEKeypair> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new HPKEHandleUseCase$getHPKEKeypair$2(this, str, str2, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<PrivateKeyOriginData> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super HPKEEncryptData> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new HPKEHandleUseCase$teeHPKEEncrypt$2(this, list, str, str2, str3, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new HPKEHandleUseCase$teeHPKEDecrypt$2(this, str, str2, str3, str4, str5, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new HPKEHandleUseCase$teeEd25519Verify$2(this, str, str2, str3, null), continuation);
    }
}

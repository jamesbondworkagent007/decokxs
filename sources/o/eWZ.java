package o;

import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.CheckSelfWalletAddressExistsUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWZ {
    public final CoroutineDispatcher AEQbTJ;
    public final cOG KWHzl;

    @yCM
    public eWZ(@NotNull cOG cog, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(cog, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = cog;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new CheckSelfWalletAddressExistsUseCase$invoke$2(this, str, null), continuation);
    }
}

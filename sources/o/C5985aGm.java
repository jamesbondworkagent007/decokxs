package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.manage.OkxPayUnlinkAuthenticatorUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5985aGm {
    public final PasskeyApiService KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5985aGm(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = passkeyApiService;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC5979aGg> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new OkxPayUnlinkAuthenticatorUseCase$invoke$2(str2, str, this, null), continuation);
    }
}

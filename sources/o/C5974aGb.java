package o;

import com.okinc.auth.impl.passkey.data.PasskeyToggleRemoteDataSource;
import com.okinc.auth.impl.passkey.domain.PasskeyToggleSwitchUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.passkeytoggle.SwitchPasskeyToggleRequest;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5974aGb {
    public final PasskeyToggleRemoteDataSource AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5974aGb(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyToggleRemoteDataSource passkeyToggleRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyToggleRemoteDataSource, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = passkeyToggleRemoteDataSource;
    }

    public final java.lang.Object EZpvd(@NotNull SwitchPasskeyToggleRequest switchPasskeyToggleRequest, @NotNull Continuation<? super AbstractC5981aGi> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new PasskeyToggleSwitchUseCase$invoke$2(this, switchPasskeyToggleRequest, null), continuation);
    }
}

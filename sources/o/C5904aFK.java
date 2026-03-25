package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyCheckChinaIpUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5904aFK {
    public final InterfaceC5687aBF AEQbTJ;
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final java.lang.String copydefault;

    @yCM
    public C5904aFK(@NotNull PasskeyApiService passkeyApiService, @NotNull InterfaceC5687aBF interfaceC5687aBF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(interfaceC5687aBF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = passkeyApiService;
        this.AEQbTJ = interfaceC5687aBF;
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = "PasskeyCheckChinaIpUseCase";
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new PasskeyCheckChinaIpUseCase$invoke$2(this, null), continuation);
    }
}

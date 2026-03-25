package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.StartPasskeyAuthenticateUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5978aGf {
    public final CoroutineDispatcher EZpvd;
    public final PasskeyApiService copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C5978aGf(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = passkeyApiService;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC5990aGr> continuation) {
        return BuildersKt.withContext(this.EZpvd, new StartPasskeyAuthenticateUseCase$invoke$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aGf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

package o;

import com.okinc.auth.api.passkey.PasskeyCanLinkExistingToCedefiWalletState;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.GetDexHasAvailablePasskeyUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5899aFF {
    private static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final PasskeyApiService copydefault;

    @yCM
    public C5899aFF(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = passkeyApiService;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super PasskeyCanLinkExistingToCedefiWalletState> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new GetDexHasAvailablePasskeyUseCase$invoke$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFF$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.StartMfaUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5773aCm {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC8196ayF EZpvd;
    public final MfaApiService OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5773aCm(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC8196ayF;
        this.OLrzqt = mfaApiService;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super MfaResult> continuation) {
        return BuildersKt.withContext(this.copydefault, new StartMfaUseCase$invoke$2(this, mfaScenario, subdomainStrategy, str, null), continuation);
    }

    /* JADX INFO: renamed from: o.aCm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

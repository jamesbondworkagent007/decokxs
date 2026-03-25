package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.SwitchStepUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5776aCp {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher KWHzl;
    public final MfaApiService copydefault;

    @yCM
    public C5776aCp(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = mfaApiService;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull OTP otp, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super MfaResult> continuation) {
        return BuildersKt.withContext(this.KWHzl, new SwitchStepUseCase$invoke$2(mfaScenario, this, subdomainStrategy, str, otp, null), continuation);
    }

    /* JADX INFO: renamed from: o.aCp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

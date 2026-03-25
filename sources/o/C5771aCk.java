package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.SendCodeResult;
import com.okinc.auth.impl.mfa.domain.SendCodeUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5771aCk {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final MfaApiService AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5771aCk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = mfaApiService;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull OTP otp, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super SendCodeResult> continuation) {
        return BuildersKt.withContext(this.copydefault, new SendCodeUseCase$invoke$2(mfaScenario, this, subdomainStrategy, str, otp, null), continuation);
    }

    /* JADX INFO: renamed from: o.aCk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

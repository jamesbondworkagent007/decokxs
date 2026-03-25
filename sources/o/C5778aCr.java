package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.VerifyPasswordUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5778aCr {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final MfaApiService AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5778aCr(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = mfaApiService;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super MfaResult> continuation) {
        return BuildersKt.withContext(this.copydefault, new VerifyPasswordUseCase$invoke$2(mfaScenario, this, subdomainStrategy, str, str2, str3, null), continuation);
    }

    /* JADX INFO: renamed from: o.aCr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

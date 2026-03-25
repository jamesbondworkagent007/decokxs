package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.RetrieveFacialResultUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5769aCi {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher EZpvd;
    public final MfaApiService OLrzqt;

    @yCM
    public C5769aCi(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = mfaApiService;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super MfaResult> continuation) {
        return BuildersKt.withContext(this.EZpvd, new RetrieveFacialResultUseCase$invoke$2(mfaScenario, this, subdomainStrategy, str, null), continuation);
    }

    /* JADX INFO: renamed from: o.aCi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

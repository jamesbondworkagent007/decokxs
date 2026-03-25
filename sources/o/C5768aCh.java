package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.MfaStartPasskeyUseCase$invoke$1;
import com.okinc.auth.impl.mfa.domain.MfaStartPasskeyUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5768aCh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final MfaApiService AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5768aCh(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = mfaApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super Result<AuthenticationStartResponse>> continuation) {
        MfaStartPasskeyUseCase$invoke$1 mfaStartPasskeyUseCase$invoke$1;
        if (continuation instanceof MfaStartPasskeyUseCase$invoke$1) {
            mfaStartPasskeyUseCase$invoke$1 = (MfaStartPasskeyUseCase$invoke$1) continuation;
            int i = mfaStartPasskeyUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfaStartPasskeyUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                mfaStartPasskeyUseCase$invoke$1 = new MfaStartPasskeyUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mfaStartPasskeyUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mfaStartPasskeyUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            MfaStartPasskeyUseCase$invoke$2 mfaStartPasskeyUseCase$invoke$2 = new MfaStartPasskeyUseCase$invoke$2(mfaScenario, this, subdomainStrategy, str, null);
            mfaStartPasskeyUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mfaStartPasskeyUseCase$invoke$2, mfaStartPasskeyUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.aCh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationValidateFido1UseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationValidateFido1UseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5918aFY {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5918aFY(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = passkeyApiService;
    }

    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8557invoke0E7RQCE$default(C5918aFY c5918aFY, int i, RegistrationFinishBody registrationFinishBody, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return c5918aFY.KWHzl(i, registrationFinishBody, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(int i, @NotNull RegistrationFinishBody registrationFinishBody, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        PasskeyRegistrationValidateFido1UseCase$invoke$1 passkeyRegistrationValidateFido1UseCase$invoke$1;
        if (continuation instanceof PasskeyRegistrationValidateFido1UseCase$invoke$1) {
            passkeyRegistrationValidateFido1UseCase$invoke$1 = (PasskeyRegistrationValidateFido1UseCase$invoke$1) continuation;
            int i2 = passkeyRegistrationValidateFido1UseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passkeyRegistrationValidateFido1UseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                passkeyRegistrationValidateFido1UseCase$invoke$1 = new PasskeyRegistrationValidateFido1UseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRegistrationValidateFido1UseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = passkeyRegistrationValidateFido1UseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PasskeyRegistrationValidateFido1UseCase$invoke$2 passkeyRegistrationValidateFido1UseCase$invoke$2 = new PasskeyRegistrationValidateFido1UseCase$invoke$2(i, registrationFinishBody, this, null);
            passkeyRegistrationValidateFido1UseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRegistrationValidateFido1UseCase$invoke$2, passkeyRegistrationValidateFido1UseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.aFY$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

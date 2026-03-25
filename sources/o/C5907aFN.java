package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyFinishUpgradeUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyFinishUpgradeUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C5907aFN {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final PasskeyApiService AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull RegistrationFinishBody registrationFinishBody, @NotNull Continuation<? super Result<Unit>> continuation) {
        PasskeyFinishUpgradeUseCase$invoke$1 passkeyFinishUpgradeUseCase$invoke$1;
        if (continuation instanceof PasskeyFinishUpgradeUseCase$invoke$1) {
            passkeyFinishUpgradeUseCase$invoke$1 = (PasskeyFinishUpgradeUseCase$invoke$1) continuation;
            int i = passkeyFinishUpgradeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyFinishUpgradeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyFinishUpgradeUseCase$invoke$1 = new PasskeyFinishUpgradeUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyFinishUpgradeUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyFinishUpgradeUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PasskeyFinishUpgradeUseCase$invoke$2 passkeyFinishUpgradeUseCase$invoke$2 = new PasskeyFinishUpgradeUseCase$invoke$2(registrationFinishBody, this, null);
            passkeyFinishUpgradeUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyFinishUpgradeUseCase$invoke$2, passkeyFinishUpgradeUseCase$invoke$1);
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

    /* JADX INFO: renamed from: o.aFN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

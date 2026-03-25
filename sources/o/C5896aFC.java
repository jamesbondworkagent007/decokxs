package o;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyRegistrationFinishUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyRegistrationFinishUseCase$invoke$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5896aFC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final PasskeyApiService AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5896aFC(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = passkeyApiService;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aFC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull PublicKeyCredential publicKeyCredential, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OkxPayPasskeyRegistrationFinishUseCase$invoke$1 okxPayPasskeyRegistrationFinishUseCase$invoke$1;
        if (continuation instanceof OkxPayPasskeyRegistrationFinishUseCase$invoke$1) {
            okxPayPasskeyRegistrationFinishUseCase$invoke$1 = (OkxPayPasskeyRegistrationFinishUseCase$invoke$1) continuation;
            int i = okxPayPasskeyRegistrationFinishUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okxPayPasskeyRegistrationFinishUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                okxPayPasskeyRegistrationFinishUseCase$invoke$1 = new OkxPayPasskeyRegistrationFinishUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = okxPayPasskeyRegistrationFinishUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okxPayPasskeyRegistrationFinishUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            OkxPayPasskeyRegistrationFinishUseCase$invoke$2 okxPayPasskeyRegistrationFinishUseCase$invoke$2 = new OkxPayPasskeyRegistrationFinishUseCase$invoke$2(publicKeyCredential, this, null);
            okxPayPasskeyRegistrationFinishUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, okxPayPasskeyRegistrationFinishUseCase$invoke$2, okxPayPasskeyRegistrationFinishUseCase$invoke$1);
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
}

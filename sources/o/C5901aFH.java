package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5901aFH {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final PasskeyApiService KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5901aFH(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = passkeyApiService;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aFH$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFH.TaskDescription.<init>():void type: THIS */
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
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<UnlockTokenResponse>> continuation) throws java.lang.Throwable {
        OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1 okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1;
        if (continuation instanceof OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1) {
            okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1 = (OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1) continuation;
            int i = okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1 = new OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2 okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2 = new OkxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2(str, this, null);
            okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$2, okxPayPasskeyRegistrationUnlockTokenUseCase$invoke$1);
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

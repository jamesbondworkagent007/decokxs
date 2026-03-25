package o;

import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationUseCase$finishRegistration$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationUseCase$finishRegistration$2;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationUseCase$finishRegistration$3;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationUseCase$finishRegistration$4;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationUseCase$getRegistrationResult$2;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationUseCase$internalFinishRegistration$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationUseCase$internalFinishRegistration$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5913aFT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final PasskeyApiService OLrzqt;
    public final Fido2ApiClient copydefault;

    @yCM
    public C5913aFT(@NotNull PasskeyApiService passkeyApiService, @NotNull Fido2ApiClient fido2ApiClient, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = passkeyApiService;
        this.copydefault = fido2ApiClient;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aFT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull Continuation<? super AbstractC5991aGs> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new PasskeyRegistrationUseCase$getRegistrationResult$2(str, str2, passkeyScenario, this, passkeyPromotionAuthenticator, z, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull PasskeyScenario passkeyScenario, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        PasskeyRegistrationUseCase$finishRegistration$1 passkeyRegistrationUseCase$finishRegistration$1;
        if (continuation instanceof PasskeyRegistrationUseCase$finishRegistration$1) {
            passkeyRegistrationUseCase$finishRegistration$1 = (PasskeyRegistrationUseCase$finishRegistration$1) continuation;
            int i = passkeyRegistrationUseCase$finishRegistration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyRegistrationUseCase$finishRegistration$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyRegistrationUseCase$finishRegistration$1 = new PasskeyRegistrationUseCase$finishRegistration$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRegistrationUseCase$finishRegistration$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyRegistrationUseCase$finishRegistration$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            PasskeyRegistrationUseCase$finishRegistration$2 passkeyRegistrationUseCase$finishRegistration$2 = new PasskeyRegistrationUseCase$finishRegistration$2(this, str, passkeyScenario, null);
            passkeyRegistrationUseCase$finishRegistration$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRegistrationUseCase$finishRegistration$2, passkeyRegistrationUseCase$finishRegistration$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull PublicKeyCredential publicKeyCredential, @NotNull PasskeyScenario passkeyScenario, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        PasskeyRegistrationUseCase$finishRegistration$3 passkeyRegistrationUseCase$finishRegistration$3;
        if (continuation instanceof PasskeyRegistrationUseCase$finishRegistration$3) {
            passkeyRegistrationUseCase$finishRegistration$3 = (PasskeyRegistrationUseCase$finishRegistration$3) continuation;
            int i = passkeyRegistrationUseCase$finishRegistration$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyRegistrationUseCase$finishRegistration$3.label = i - Integer.MIN_VALUE;
            } else {
                passkeyRegistrationUseCase$finishRegistration$3 = new PasskeyRegistrationUseCase$finishRegistration$3(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRegistrationUseCase$finishRegistration$3.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyRegistrationUseCase$finishRegistration$3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            PasskeyRegistrationUseCase$finishRegistration$4 passkeyRegistrationUseCase$finishRegistration$4 = new PasskeyRegistrationUseCase$finishRegistration$4(this, publicKeyCredential, passkeyScenario, null);
            passkeyRegistrationUseCase$finishRegistration$3.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRegistrationUseCase$finishRegistration$4, passkeyRegistrationUseCase$finishRegistration$3);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(PublicKeyCredential publicKeyCredential, java.lang.String str, @NotNull PasskeyScenario passkeyScenario, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        PasskeyRegistrationUseCase$internalFinishRegistration$1 passkeyRegistrationUseCase$internalFinishRegistration$1;
        if (continuation instanceof PasskeyRegistrationUseCase$internalFinishRegistration$1) {
            passkeyRegistrationUseCase$internalFinishRegistration$1 = (PasskeyRegistrationUseCase$internalFinishRegistration$1) continuation;
            int i = passkeyRegistrationUseCase$internalFinishRegistration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyRegistrationUseCase$internalFinishRegistration$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyRegistrationUseCase$internalFinishRegistration$1 = new PasskeyRegistrationUseCase$internalFinishRegistration$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRegistrationUseCase$internalFinishRegistration$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyRegistrationUseCase$internalFinishRegistration$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            PasskeyRegistrationUseCase$internalFinishRegistration$2 passkeyRegistrationUseCase$internalFinishRegistration$2 = new PasskeyRegistrationUseCase$internalFinishRegistration$2(publicKeyCredential, str, passkeyScenario, this, null);
            passkeyRegistrationUseCase$internalFinishRegistration$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRegistrationUseCase$internalFinishRegistration$2, passkeyRegistrationUseCase$internalFinishRegistration$1);
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

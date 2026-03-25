package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindFido1FinishUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindFido1FinishUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5909aFP {
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C5909aFP(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = passkeyApiService;
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8554invokeBWLJW6A$default(C5909aFP c5909aFP, RegistrationFinishBody registrationFinishBody, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return c5909aFP.EZpvd(registrationFinishBody, str, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull RegistrationFinishBody registrationFinishBody, @NotNull java.lang.String str, int i, @NotNull Continuation<? super Result<PasskeyRebindFinishResponse>> continuation) throws java.lang.Throwable {
        PasskeyRebindFido1FinishUseCase$invoke$1 passkeyRebindFido1FinishUseCase$invoke$1;
        if (continuation instanceof PasskeyRebindFido1FinishUseCase$invoke$1) {
            passkeyRebindFido1FinishUseCase$invoke$1 = (PasskeyRebindFido1FinishUseCase$invoke$1) continuation;
            int i2 = passkeyRebindFido1FinishUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passkeyRebindFido1FinishUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                passkeyRebindFido1FinishUseCase$invoke$1 = new PasskeyRebindFido1FinishUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRebindFido1FinishUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = passkeyRebindFido1FinishUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PasskeyRebindFido1FinishUseCase$invoke$2 passkeyRebindFido1FinishUseCase$invoke$2 = new PasskeyRebindFido1FinishUseCase$invoke$2(i, str, registrationFinishBody, this, null);
            passkeyRebindFido1FinishUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRebindFido1FinishUseCase$invoke$2, passkeyRebindFido1FinishUseCase$invoke$1);
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

    /* JADX INFO: renamed from: o.aFP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}

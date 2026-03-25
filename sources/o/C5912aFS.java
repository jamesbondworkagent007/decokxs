package o;

import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindFido1StartUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindFido1StartUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5912aFS {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final ActivateGuardUseCase EZpvd;
    public final PasskeyApiService KWHzl;
    public final C5911aFR copydefault;

    @yCM
    public C5912aFS(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService, @NotNull ActivateGuardUseCase activateGuardUseCase, @NotNull C5911aFR c5911aFR) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(activateGuardUseCase, "");
        Intrinsics.checkNotNullParameter(c5911aFR, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = passkeyApiService;
        this.EZpvd = activateGuardUseCase;
        this.copydefault = c5911aFR;
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8555invokeBWLJW6A$default(C5912aFS c5912aFS, java.lang.String str, AbstractC32996moC abstractC32996moC, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return c5912aFS.AEQbTJ(str, abstractC32996moC, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull AbstractC32996moC abstractC32996moC, int i, @NotNull Continuation<? super Result<? extends ActivateGuardUseCase.TaskDescription>> continuation) throws java.lang.Throwable {
        PasskeyRebindFido1StartUseCase$invoke$1 passkeyRebindFido1StartUseCase$invoke$1;
        if (continuation instanceof PasskeyRebindFido1StartUseCase$invoke$1) {
            passkeyRebindFido1StartUseCase$invoke$1 = (PasskeyRebindFido1StartUseCase$invoke$1) continuation;
            int i2 = passkeyRebindFido1StartUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passkeyRebindFido1StartUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                passkeyRebindFido1StartUseCase$invoke$1 = new PasskeyRebindFido1StartUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRebindFido1StartUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = passkeyRebindFido1StartUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            PasskeyRebindFido1StartUseCase$invoke$2 passkeyRebindFido1StartUseCase$invoke$2 = new PasskeyRebindFido1StartUseCase$invoke$2(str, this, i, abstractC32996moC, null);
            passkeyRebindFido1StartUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRebindFido1StartUseCase$invoke$2, passkeyRebindFido1StartUseCase$invoke$1);
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

    /* JADX INFO: renamed from: o.aFS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

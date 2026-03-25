package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.DexPasskeyFinishAuthenticateUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.DexPasskeyFinishAuthenticateUseCase$invoke$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5942aFw {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5942aFw(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = passkeyApiService;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8558invoke0E7RQCE$default(C5942aFw c5942aFw, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c5942aFw.OLrzqt(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        DexPasskeyFinishAuthenticateUseCase$invoke$1 dexPasskeyFinishAuthenticateUseCase$invoke$1;
        if (continuation instanceof DexPasskeyFinishAuthenticateUseCase$invoke$1) {
            dexPasskeyFinishAuthenticateUseCase$invoke$1 = (DexPasskeyFinishAuthenticateUseCase$invoke$1) continuation;
            int i = dexPasskeyFinishAuthenticateUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexPasskeyFinishAuthenticateUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                dexPasskeyFinishAuthenticateUseCase$invoke$1 = new DexPasskeyFinishAuthenticateUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexPasskeyFinishAuthenticateUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexPasskeyFinishAuthenticateUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            DexPasskeyFinishAuthenticateUseCase$invoke$2 dexPasskeyFinishAuthenticateUseCase$invoke$2 = new DexPasskeyFinishAuthenticateUseCase$invoke$2(this, str, str2, null);
            dexPasskeyFinishAuthenticateUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dexPasskeyFinishAuthenticateUseCase$invoke$2, dexPasskeyFinishAuthenticateUseCase$invoke$1);
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

    /* JADX INFO: renamed from: o.aFw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}

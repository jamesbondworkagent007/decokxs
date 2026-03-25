package o;

import com.okinc.auth.api.passkey.InitiateMfaSessionResponse;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyMfaInitUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyMfaInitUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5905aFL {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5905aFL(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = passkeyApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<InitiateMfaSessionResponse>> continuation) throws java.lang.Throwable {
        PasskeyMfaInitUseCase$invoke$1 passkeyMfaInitUseCase$invoke$1;
        if (continuation instanceof PasskeyMfaInitUseCase$invoke$1) {
            passkeyMfaInitUseCase$invoke$1 = (PasskeyMfaInitUseCase$invoke$1) continuation;
            int i = passkeyMfaInitUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyMfaInitUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyMfaInitUseCase$invoke$1 = new PasskeyMfaInitUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyMfaInitUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyMfaInitUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            PasskeyMfaInitUseCase$invoke$2 passkeyMfaInitUseCase$invoke$2 = new PasskeyMfaInitUseCase$invoke$2(this, str, null);
            passkeyMfaInitUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyMfaInitUseCase$invoke$2, passkeyMfaInitUseCase$invoke$1);
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

    /* JADX INFO: renamed from: o.aFL$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

package o;

import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyRegistrationStartUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5895aFB {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final PasskeyApiService AEQbTJ;
    public final Fido2ApiClient OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5895aFB(@NotNull PasskeyApiService passkeyApiService, @NotNull Fido2ApiClient fido2ApiClient, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = passkeyApiService;
        this.OLrzqt = fido2ApiClient;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aFB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(C5895aFB c5895aFB, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c5895aFB.EZpvd(str, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC5991aGs> continuation) {
        return BuildersKt.withContext(this.copydefault, new OkxPayPasskeyRegistrationStartUseCase$invoke$2(str, this, null), continuation);
    }
}

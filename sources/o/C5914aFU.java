package o;

import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindFido2UseCase$getRegistrationPendingIntent$2;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindFido2UseCase$validateRegistration$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindFido2UseCase$validateRegistration$2;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5914aFU {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final PasskeyApiService AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final Fido2ApiClient KWHzl;

    @yCM
    public C5914aFU(@NotNull PasskeyApiService passkeyApiService, @NotNull Fido2ApiClient fido2ApiClient, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = passkeyApiService;
        this.KWHzl = fido2ApiClient;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aFU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static /* synthetic */ java.lang.Object getRegistrationPendingIntent$default(C5914aFU c5914aFU, java.lang.String str, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c5914aFU.copydefault(str, passkeyPromotionAuthenticator, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull Continuation<? super AbstractC5991aGs> continuation) {
        return BuildersKt.withContext(this.EZpvd, new PasskeyRebindFido2UseCase$getRegistrationPendingIntent$2(str, this, passkeyPromotionAuthenticator, null), continuation);
    }

    /* JADX INFO: renamed from: validateRegistration-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8556validateRegistrationBWLJW6A$default(C5914aFU c5914aFU, PublicKeyCredential publicKeyCredential, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c5914aFU.KWHzl(publicKeyCredential, str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull PublicKeyCredential publicKeyCredential, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<PasskeyRebindFinishResponse>> continuation) throws java.lang.Throwable {
        PasskeyRebindFido2UseCase$validateRegistration$1 passkeyRebindFido2UseCase$validateRegistration$1;
        if (continuation instanceof PasskeyRebindFido2UseCase$validateRegistration$1) {
            passkeyRebindFido2UseCase$validateRegistration$1 = (PasskeyRebindFido2UseCase$validateRegistration$1) continuation;
            int i = passkeyRebindFido2UseCase$validateRegistration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyRebindFido2UseCase$validateRegistration$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyRebindFido2UseCase$validateRegistration$1 = new PasskeyRebindFido2UseCase$validateRegistration$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRebindFido2UseCase$validateRegistration$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyRebindFido2UseCase$validateRegistration$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            PasskeyRebindFido2UseCase$validateRegistration$2 passkeyRebindFido2UseCase$validateRegistration$2 = new PasskeyRebindFido2UseCase$validateRegistration$2(publicKeyCredential, str, this, z, null);
            passkeyRebindFido2UseCase$validateRegistration$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRebindFido2UseCase$validateRegistration$2, passkeyRebindFido2UseCase$validateRegistration$1);
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

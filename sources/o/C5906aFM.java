package o;

import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindCredentialManagerUseCase$getRegistrationPendingIntent$2;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindCredentialManagerUseCase$validateRegistration$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRebindCredentialManagerUseCase$validateRegistration$2;
import com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5906aFM {
    public final CoroutineDispatcher KWHzl;
    public final PasskeyApiService copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C5906aFM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = passkeyApiService;
    }

    /* JADX INFO: renamed from: o.aFM$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static /* synthetic */ java.lang.Object getRegistrationPendingIntent$default(C5906aFM c5906aFM, java.lang.String str, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c5906aFM.EZpvd(str, passkeyPromotionAuthenticator, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull Continuation<? super AbstractC5991aGs> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PasskeyRebindCredentialManagerUseCase$getRegistrationPendingIntent$2(str, this, passkeyPromotionAuthenticator, null), continuation);
    }

    /* JADX INFO: renamed from: validateRegistration-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8553validateRegistrationBWLJW6A$default(C5906aFM c5906aFM, java.lang.String str, java.lang.String str2, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c5906aFM.EZpvd(str, str2, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Result<PasskeyRebindFinishResponse>> continuation) throws java.lang.Throwable {
        PasskeyRebindCredentialManagerUseCase$validateRegistration$1 passkeyRebindCredentialManagerUseCase$validateRegistration$1;
        if (continuation instanceof PasskeyRebindCredentialManagerUseCase$validateRegistration$1) {
            passkeyRebindCredentialManagerUseCase$validateRegistration$1 = (PasskeyRebindCredentialManagerUseCase$validateRegistration$1) continuation;
            int i = passkeyRebindCredentialManagerUseCase$validateRegistration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyRebindCredentialManagerUseCase$validateRegistration$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyRebindCredentialManagerUseCase$validateRegistration$1 = new PasskeyRebindCredentialManagerUseCase$validateRegistration$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRebindCredentialManagerUseCase$validateRegistration$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyRebindCredentialManagerUseCase$validateRegistration$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            PasskeyRebindCredentialManagerUseCase$validateRegistration$2 passkeyRebindCredentialManagerUseCase$validateRegistration$2 = new PasskeyRebindCredentialManagerUseCase$validateRegistration$2(str, str2, this, z, null);
            passkeyRebindCredentialManagerUseCase$validateRegistration$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRebindCredentialManagerUseCase$validateRegistration$2, passkeyRebindCredentialManagerUseCase$validateRegistration$1);
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

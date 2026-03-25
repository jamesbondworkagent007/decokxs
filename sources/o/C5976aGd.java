package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.SendPhoneOtpUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.SendPhoneOtpUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.AuthSendSMSRequest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5976aGd {
    public final CoroutineDispatcher EZpvd;
    public final PasskeyApiService OLrzqt;

    @yCM
    public C5976aGd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = passkeyApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull AuthSendSMSRequest authSendSMSRequest, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        SendPhoneOtpUseCase$invoke$1 sendPhoneOtpUseCase$invoke$1;
        if (continuation instanceof SendPhoneOtpUseCase$invoke$1) {
            sendPhoneOtpUseCase$invoke$1 = (SendPhoneOtpUseCase$invoke$1) continuation;
            int i = sendPhoneOtpUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sendPhoneOtpUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                sendPhoneOtpUseCase$invoke$1 = new SendPhoneOtpUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = sendPhoneOtpUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sendPhoneOtpUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            SendPhoneOtpUseCase$invoke$2 sendPhoneOtpUseCase$invoke$2 = new SendPhoneOtpUseCase$invoke$2(this, authSendSMSRequest, null);
            sendPhoneOtpUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, sendPhoneOtpUseCase$invoke$2, sendPhoneOtpUseCase$invoke$1);
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

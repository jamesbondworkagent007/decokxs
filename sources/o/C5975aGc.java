package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.SendEmailOtpUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.SendEmailOtpUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.AuthSendEmailOTPRequest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5975aGc {
    public final CoroutineDispatcher EZpvd;
    public final PasskeyApiService KWHzl;

    @yCM
    public C5975aGc(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = passkeyApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull AuthSendEmailOTPRequest authSendEmailOTPRequest, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        SendEmailOtpUseCase$invoke$1 sendEmailOtpUseCase$invoke$1;
        if (continuation instanceof SendEmailOtpUseCase$invoke$1) {
            sendEmailOtpUseCase$invoke$1 = (SendEmailOtpUseCase$invoke$1) continuation;
            int i = sendEmailOtpUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sendEmailOtpUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                sendEmailOtpUseCase$invoke$1 = new SendEmailOtpUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = sendEmailOtpUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sendEmailOtpUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            SendEmailOtpUseCase$invoke$2 sendEmailOtpUseCase$invoke$2 = new SendEmailOtpUseCase$invoke$2(this, authSendEmailOTPRequest, null);
            sendEmailOtpUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, sendEmailOtpUseCase$invoke$2, sendEmailOtpUseCase$invoke$1);
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

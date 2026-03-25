package o;

import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyToPendingIntentUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyToPendingIntentUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5902aFI {
    public final Fido2ApiClient AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5902aFI(@NotNull Fido2ApiClient fido2ApiClient, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = fido2ApiClient;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull Continuation<? super Result<android.app.PendingIntent>> continuation) throws java.lang.Throwable {
        OkxPayPasskeyToPendingIntentUseCase$invoke$1 okxPayPasskeyToPendingIntentUseCase$invoke$1;
        if (continuation instanceof OkxPayPasskeyToPendingIntentUseCase$invoke$1) {
            okxPayPasskeyToPendingIntentUseCase$invoke$1 = (OkxPayPasskeyToPendingIntentUseCase$invoke$1) continuation;
            int i = okxPayPasskeyToPendingIntentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okxPayPasskeyToPendingIntentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                okxPayPasskeyToPendingIntentUseCase$invoke$1 = new OkxPayPasskeyToPendingIntentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = okxPayPasskeyToPendingIntentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okxPayPasskeyToPendingIntentUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            OkxPayPasskeyToPendingIntentUseCase$invoke$2 okxPayPasskeyToPendingIntentUseCase$invoke$2 = new OkxPayPasskeyToPendingIntentUseCase$invoke$2(this, passkeyAuthenticateRequest, null);
            okxPayPasskeyToPendingIntentUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, okxPayPasskeyToPendingIntentUseCase$invoke$2, okxPayPasskeyToPendingIntentUseCase$invoke$1);
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

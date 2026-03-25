package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.manage.OkxPayGetAuthenticatorUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.manage.OkxPayGetAuthenticatorUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5982aGj {
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C5982aGj(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = passkeyApiService;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<GetAuthenticatorListResponse>> continuation) throws java.lang.Throwable {
        OkxPayGetAuthenticatorUseCase$invoke$1 okxPayGetAuthenticatorUseCase$invoke$1;
        if (continuation instanceof OkxPayGetAuthenticatorUseCase$invoke$1) {
            okxPayGetAuthenticatorUseCase$invoke$1 = (OkxPayGetAuthenticatorUseCase$invoke$1) continuation;
            int i = okxPayGetAuthenticatorUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okxPayGetAuthenticatorUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                okxPayGetAuthenticatorUseCase$invoke$1 = new OkxPayGetAuthenticatorUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = okxPayGetAuthenticatorUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okxPayGetAuthenticatorUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            OkxPayGetAuthenticatorUseCase$invoke$2 okxPayGetAuthenticatorUseCase$invoke$2 = new OkxPayGetAuthenticatorUseCase$invoke$2(this, null);
            okxPayGetAuthenticatorUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, okxPayGetAuthenticatorUseCase$invoke$2, okxPayGetAuthenticatorUseCase$invoke$1);
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

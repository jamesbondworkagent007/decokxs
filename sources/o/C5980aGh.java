package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.manage.OkxPayGetAuthTypeUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.manage.OkxPayGetAuthTypeUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5980aGh {
    public final CoroutineDispatcher KWHzl;
    public final PasskeyApiService OLrzqt;

    @yCM
    public C5980aGh(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = passkeyApiService;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<GetAuthenticationTypeResponse>> continuation) throws java.lang.Throwable {
        OkxPayGetAuthTypeUseCase$invoke$1 okxPayGetAuthTypeUseCase$invoke$1;
        if (continuation instanceof OkxPayGetAuthTypeUseCase$invoke$1) {
            okxPayGetAuthTypeUseCase$invoke$1 = (OkxPayGetAuthTypeUseCase$invoke$1) continuation;
            int i = okxPayGetAuthTypeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okxPayGetAuthTypeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                okxPayGetAuthTypeUseCase$invoke$1 = new OkxPayGetAuthTypeUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = okxPayGetAuthTypeUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okxPayGetAuthTypeUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            OkxPayGetAuthTypeUseCase$invoke$2 okxPayGetAuthTypeUseCase$invoke$2 = new OkxPayGetAuthTypeUseCase$invoke$2(this, null);
            okxPayGetAuthTypeUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, okxPayGetAuthTypeUseCase$invoke$2, okxPayGetAuthTypeUseCase$invoke$1);
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

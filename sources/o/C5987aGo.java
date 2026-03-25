package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.manage.OkxPayRenameAuthenticatorUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.manage.OkxPayRenameAuthenticatorUseCase$invoke$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5987aGo {
    public final CoroutineDispatcher EZpvd;
    public final PasskeyApiService KWHzl;

    @yCM
    public C5987aGo(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = passkeyApiService;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        OkxPayRenameAuthenticatorUseCase$invoke$1 okxPayRenameAuthenticatorUseCase$invoke$1;
        if (continuation instanceof OkxPayRenameAuthenticatorUseCase$invoke$1) {
            okxPayRenameAuthenticatorUseCase$invoke$1 = (OkxPayRenameAuthenticatorUseCase$invoke$1) continuation;
            int i = okxPayRenameAuthenticatorUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okxPayRenameAuthenticatorUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                okxPayRenameAuthenticatorUseCase$invoke$1 = new OkxPayRenameAuthenticatorUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = okxPayRenameAuthenticatorUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okxPayRenameAuthenticatorUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            OkxPayRenameAuthenticatorUseCase$invoke$2 okxPayRenameAuthenticatorUseCase$invoke$2 = new OkxPayRenameAuthenticatorUseCase$invoke$2(str, str2, this, null);
            okxPayRenameAuthenticatorUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, okxPayRenameAuthenticatorUseCase$invoke$2, okxPayRenameAuthenticatorUseCase$invoke$1);
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

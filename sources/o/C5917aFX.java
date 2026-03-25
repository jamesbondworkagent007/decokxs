package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyResetInitUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyResetInitUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.ResetMfaInitiateResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5917aFX {
    public final PasskeyApiService KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5917aFX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = passkeyApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull Continuation<? super Result<ResetMfaInitiateResponse>> continuation) {
        PasskeyResetInitUseCase$invoke$1 passkeyResetInitUseCase$invoke$1;
        if (continuation instanceof PasskeyResetInitUseCase$invoke$1) {
            passkeyResetInitUseCase$invoke$1 = (PasskeyResetInitUseCase$invoke$1) continuation;
            int i = passkeyResetInitUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyResetInitUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyResetInitUseCase$invoke$1 = new PasskeyResetInitUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyResetInitUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyResetInitUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            PasskeyResetInitUseCase$invoke$2 passkeyResetInitUseCase$invoke$2 = new PasskeyResetInitUseCase$invoke$2(this, str, list, null);
            passkeyResetInitUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyResetInitUseCase$invoke$2, passkeyResetInitUseCase$invoke$1);
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

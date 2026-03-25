package o;

import com.okinc.auth.impl.passkey.data.PasskeyToggleRemoteDataSource;
import com.okinc.auth.impl.passkey.domain.PasskeyToggleMfaInitUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyToggleMfaInitUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.passkeytoggle.PasskeyToggleInitiateResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5977aGe {
    public final PasskeyToggleRemoteDataSource AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C5977aGe(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyToggleRemoteDataSource passkeyToggleRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyToggleRemoteDataSource, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = passkeyToggleRemoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<PasskeyToggleInitiateResponse>> continuation) {
        PasskeyToggleMfaInitUseCase$invoke$1 passkeyToggleMfaInitUseCase$invoke$1;
        if (continuation instanceof PasskeyToggleMfaInitUseCase$invoke$1) {
            passkeyToggleMfaInitUseCase$invoke$1 = (PasskeyToggleMfaInitUseCase$invoke$1) continuation;
            int i = passkeyToggleMfaInitUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyToggleMfaInitUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyToggleMfaInitUseCase$invoke$1 = new PasskeyToggleMfaInitUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyToggleMfaInitUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyToggleMfaInitUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            PasskeyToggleMfaInitUseCase$invoke$2 passkeyToggleMfaInitUseCase$invoke$2 = new PasskeyToggleMfaInitUseCase$invoke$2(this, null);
            passkeyToggleMfaInitUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyToggleMfaInitUseCase$invoke$2, passkeyToggleMfaInitUseCase$invoke$1);
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

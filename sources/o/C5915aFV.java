package o;

import com.okinc.auth.impl.passkey.data.PasskeyToggleRemoteDataSource;
import com.okinc.auth.impl.passkey.domain.PasskeyToggleInfoUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyToggleInfoUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.passkeytoggle.PasskeyToggleInfoResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5915aFV {
    public final CoroutineDispatcher AEQbTJ;
    public final PasskeyToggleRemoteDataSource OLrzqt;

    @yCM
    public C5915aFV(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyToggleRemoteDataSource passkeyToggleRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyToggleRemoteDataSource, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = passkeyToggleRemoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<PasskeyToggleInfoResponse>> continuation) {
        PasskeyToggleInfoUseCase$invoke$1 passkeyToggleInfoUseCase$invoke$1;
        if (continuation instanceof PasskeyToggleInfoUseCase$invoke$1) {
            passkeyToggleInfoUseCase$invoke$1 = (PasskeyToggleInfoUseCase$invoke$1) continuation;
            int i = passkeyToggleInfoUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyToggleInfoUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyToggleInfoUseCase$invoke$1 = new PasskeyToggleInfoUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyToggleInfoUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyToggleInfoUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            PasskeyToggleInfoUseCase$invoke$2 passkeyToggleInfoUseCase$invoke$2 = new PasskeyToggleInfoUseCase$invoke$2(this, null);
            passkeyToggleInfoUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyToggleInfoUseCase$invoke$2, passkeyToggleInfoUseCase$invoke$1);
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

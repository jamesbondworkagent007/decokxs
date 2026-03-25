package o;

import com.okinc.auth.api.service.MfaCreateSessionRequest;
import com.okinc.auth.api.service.MfaCreateSessionResponse;
import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.MfaCreateSessionUseCase$invoke$1;
import com.okinc.auth.impl.mfa.domain.MfaCreateSessionUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5765aCe {
    public final CoroutineDispatcher KWHzl;
    public final MfaApiService copydefault;

    @yCM
    public C5765aCe(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = mfaApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull MfaCreateSessionRequest mfaCreateSessionRequest, @NotNull Continuation<? super Result<MfaCreateSessionResponse>> continuation) throws java.lang.Throwable {
        MfaCreateSessionUseCase$invoke$1 mfaCreateSessionUseCase$invoke$1;
        if (continuation instanceof MfaCreateSessionUseCase$invoke$1) {
            mfaCreateSessionUseCase$invoke$1 = (MfaCreateSessionUseCase$invoke$1) continuation;
            int i = mfaCreateSessionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfaCreateSessionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                mfaCreateSessionUseCase$invoke$1 = new MfaCreateSessionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mfaCreateSessionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mfaCreateSessionUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            MfaCreateSessionUseCase$invoke$2 mfaCreateSessionUseCase$invoke$2 = new MfaCreateSessionUseCase$invoke$2(this, mfaCreateSessionRequest, null);
            mfaCreateSessionUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mfaCreateSessionUseCase$invoke$2, mfaCreateSessionUseCase$invoke$1);
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

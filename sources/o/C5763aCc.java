package o;

import com.okinc.auth.api.service.MfaCheckResultResponse;
import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.CheckMfaResultUseCase$invoke$1;
import com.okinc.auth.impl.mfa.domain.CheckMfaResultUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5763aCc {
    public final MfaApiService EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C5763aCc(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = mfaApiService;
    }

    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8552invoke0E7RQCE$default(C5763aCc c5763aCc, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c5763aCc.OLrzqt(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super Result<MfaCheckResultResponse>> continuation) throws java.lang.Throwable {
        CheckMfaResultUseCase$invoke$1 checkMfaResultUseCase$invoke$1;
        if (continuation instanceof CheckMfaResultUseCase$invoke$1) {
            checkMfaResultUseCase$invoke$1 = (CheckMfaResultUseCase$invoke$1) continuation;
            int i = checkMfaResultUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkMfaResultUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkMfaResultUseCase$invoke$1 = new CheckMfaResultUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = checkMfaResultUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkMfaResultUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            CheckMfaResultUseCase$invoke$2 checkMfaResultUseCase$invoke$2 = new CheckMfaResultUseCase$invoke$2(this, str, str2, null);
            checkMfaResultUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, checkMfaResultUseCase$invoke$2, checkMfaResultUseCase$invoke$1);
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

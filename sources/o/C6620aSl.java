package o;

import com.okinc.auth.impl.reset2fa.data.datasource.SecurityMfaRemoteDataSource;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultRequest;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultResponse;
import com.okinc.auth.impl.reset2fa.domain.mfa.PartialAuthMfaCheckResultUseCase$invoke$1;
import com.okinc.auth.impl.reset2fa.domain.mfa.PartialAuthMfaCheckResultUseCase$invoke$2;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6620aSl {
    public final CoroutineDispatcher AEQbTJ;
    public final SecurityMfaRemoteDataSource EZpvd;

    @yCM
    public C6620aSl(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SecurityMfaRemoteDataSource securityMfaRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(securityMfaRemoteDataSource, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = securityMfaRemoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull PartialAuthMfaCheckResultRequest partialAuthMfaCheckResultRequest, SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super Result<PartialAuthMfaCheckResultResponse>> continuation) throws java.lang.Throwable {
        PartialAuthMfaCheckResultUseCase$invoke$1 partialAuthMfaCheckResultUseCase$invoke$1;
        if (continuation instanceof PartialAuthMfaCheckResultUseCase$invoke$1) {
            partialAuthMfaCheckResultUseCase$invoke$1 = (PartialAuthMfaCheckResultUseCase$invoke$1) continuation;
            int i = partialAuthMfaCheckResultUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                partialAuthMfaCheckResultUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                partialAuthMfaCheckResultUseCase$invoke$1 = new PartialAuthMfaCheckResultUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = partialAuthMfaCheckResultUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = partialAuthMfaCheckResultUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            PartialAuthMfaCheckResultUseCase$invoke$2 partialAuthMfaCheckResultUseCase$invoke$2 = new PartialAuthMfaCheckResultUseCase$invoke$2(this, subdomainStrategy, partialAuthMfaCheckResultRequest, null);
            partialAuthMfaCheckResultUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, partialAuthMfaCheckResultUseCase$invoke$2, partialAuthMfaCheckResultUseCase$invoke$1);
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

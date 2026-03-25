package o;

import com.okinc.auth.api.service.NonAuthMfaCheckResultRequest;
import com.okinc.auth.api.service.NonAuthMfaCheckResultResponse;
import com.okinc.auth.impl.reset2fa.data.datasource.SecurityMfaRemoteDataSource;
import com.okinc.auth.impl.reset2fa.domain.mfa.NonAuthMfaCheckResultUseCase$invoke$1;
import com.okinc.auth.impl.reset2fa.domain.mfa.NonAuthMfaCheckResultUseCase$invoke$2;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6618aSj {
    public final CoroutineDispatcher EZpvd;
    public final SecurityMfaRemoteDataSource copydefault;

    @yCM
    public C6618aSj(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SecurityMfaRemoteDataSource securityMfaRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(securityMfaRemoteDataSource, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = securityMfaRemoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull NonAuthMfaCheckResultRequest nonAuthMfaCheckResultRequest, SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super Result<NonAuthMfaCheckResultResponse>> continuation) throws java.lang.Throwable {
        NonAuthMfaCheckResultUseCase$invoke$1 nonAuthMfaCheckResultUseCase$invoke$1;
        if (continuation instanceof NonAuthMfaCheckResultUseCase$invoke$1) {
            nonAuthMfaCheckResultUseCase$invoke$1 = (NonAuthMfaCheckResultUseCase$invoke$1) continuation;
            int i = nonAuthMfaCheckResultUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonAuthMfaCheckResultUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                nonAuthMfaCheckResultUseCase$invoke$1 = new NonAuthMfaCheckResultUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = nonAuthMfaCheckResultUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = nonAuthMfaCheckResultUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            NonAuthMfaCheckResultUseCase$invoke$2 nonAuthMfaCheckResultUseCase$invoke$2 = new NonAuthMfaCheckResultUseCase$invoke$2(this, subdomainStrategy, nonAuthMfaCheckResultRequest, null);
            nonAuthMfaCheckResultUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, nonAuthMfaCheckResultUseCase$invoke$2, nonAuthMfaCheckResultUseCase$invoke$1);
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

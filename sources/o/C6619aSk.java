package o;

import com.okinc.auth.api.service.NonAuthMfaCreateSessionRequest;
import com.okinc.auth.api.service.NonAuthMfaCreateSessionResponse;
import com.okinc.auth.impl.reset2fa.data.datasource.SecurityMfaRemoteDataSource;
import com.okinc.auth.impl.reset2fa.domain.mfa.NonAuthMfaCreateSessionUseCase$invoke$1;
import com.okinc.auth.impl.reset2fa.domain.mfa.NonAuthMfaCreateSessionUseCase$invoke$2;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6619aSk {
    public final CoroutineDispatcher AEQbTJ;
    public final SecurityMfaRemoteDataSource copydefault;

    @yCM
    public C6619aSk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SecurityMfaRemoteDataSource securityMfaRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(securityMfaRemoteDataSource, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = securityMfaRemoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull NonAuthMfaCreateSessionRequest nonAuthMfaCreateSessionRequest, SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super Result<NonAuthMfaCreateSessionResponse>> continuation) throws java.lang.Throwable {
        NonAuthMfaCreateSessionUseCase$invoke$1 nonAuthMfaCreateSessionUseCase$invoke$1;
        if (continuation instanceof NonAuthMfaCreateSessionUseCase$invoke$1) {
            nonAuthMfaCreateSessionUseCase$invoke$1 = (NonAuthMfaCreateSessionUseCase$invoke$1) continuation;
            int i = nonAuthMfaCreateSessionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonAuthMfaCreateSessionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                nonAuthMfaCreateSessionUseCase$invoke$1 = new NonAuthMfaCreateSessionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = nonAuthMfaCreateSessionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = nonAuthMfaCreateSessionUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            NonAuthMfaCreateSessionUseCase$invoke$2 nonAuthMfaCreateSessionUseCase$invoke$2 = new NonAuthMfaCreateSessionUseCase$invoke$2(this, subdomainStrategy, nonAuthMfaCreateSessionRequest, null);
            nonAuthMfaCreateSessionUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, nonAuthMfaCreateSessionUseCase$invoke$2, nonAuthMfaCreateSessionUseCase$invoke$1);
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

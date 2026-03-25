package o;

import com.okinc.auth.impl.reset2fa.data.datasource.SecurityMfaRemoteDataSource;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCreateSessionRequest;
import com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCreateSessionResponse;
import com.okinc.auth.impl.reset2fa.domain.mfa.PartialAuthMfaCreateSessionUseCase$invoke$1;
import com.okinc.auth.impl.reset2fa.domain.mfa.PartialAuthMfaCreateSessionUseCase$invoke$2;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6621aSm {
    public final SecurityMfaRemoteDataSource KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C6621aSm(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SecurityMfaRemoteDataSource securityMfaRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(securityMfaRemoteDataSource, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = securityMfaRemoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull PartialAuthMfaCreateSessionRequest partialAuthMfaCreateSessionRequest, SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super Result<PartialAuthMfaCreateSessionResponse>> continuation) throws java.lang.Throwable {
        PartialAuthMfaCreateSessionUseCase$invoke$1 partialAuthMfaCreateSessionUseCase$invoke$1;
        if (continuation instanceof PartialAuthMfaCreateSessionUseCase$invoke$1) {
            partialAuthMfaCreateSessionUseCase$invoke$1 = (PartialAuthMfaCreateSessionUseCase$invoke$1) continuation;
            int i = partialAuthMfaCreateSessionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                partialAuthMfaCreateSessionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                partialAuthMfaCreateSessionUseCase$invoke$1 = new PartialAuthMfaCreateSessionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = partialAuthMfaCreateSessionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = partialAuthMfaCreateSessionUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PartialAuthMfaCreateSessionUseCase$invoke$2 partialAuthMfaCreateSessionUseCase$invoke$2 = new PartialAuthMfaCreateSessionUseCase$invoke$2(this, subdomainStrategy, partialAuthMfaCreateSessionRequest, null);
            partialAuthMfaCreateSessionUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, partialAuthMfaCreateSessionUseCase$invoke$2, partialAuthMfaCreateSessionUseCase$invoke$1);
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

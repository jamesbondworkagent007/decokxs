package o;

import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Typeface implements InterfaceC5093El<java.lang.Object> {
    @Override // o.InterfaceC5093El
    public AbstractC5091Ej KWHzl(@NotNull java.lang.Object obj) {
        if (Result.m7384isSuccessimpl(obj)) {
            return AbstractC5091Ej.Activity.AEQbTJ;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
        return EZpvd(thM7380exceptionOrNullimpl);
    }

    public final AbstractC5091Ej EZpvd(java.lang.Throwable th) {
        if (th instanceof CredentialsProviderException) {
            CredentialsProviderException credentialsProviderException = (CredentialsProviderException) th;
            return credentialsProviderException.getSdkErrorMetadata().AEQbTJ() ? new AbstractC5091Ej.StateListAnimator(RetryErrorType.Throttling) : credentialsProviderException.getSdkErrorMetadata().copydefault() ? new AbstractC5091Ej.StateListAnimator(RetryErrorType.ServerSide) : AbstractC5091Ej.Application.AEQbTJ;
        }
        return AbstractC5091Ej.Application.AEQbTJ;
    }
}

package o;

import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import o.InterfaceC5148Go;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class InvalidObjectException implements InterfaceC5093El<java.lang.Object> {
    public final CoroutineContext AEQbTJ;

    public InvalidObjectException(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.AEQbTJ = coroutineContext;
    }

    @Override // o.InterfaceC5093El
    public AbstractC5091Ej KWHzl(@NotNull java.lang.Object obj) {
        if (Result.m7384isSuccessimpl(obj)) {
            return AbstractC5091Ej.Activity.AEQbTJ;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
        return EZpvd(thM7380exceptionOrNullimpl);
    }

    private final AbstractC5091Ej EZpvd(final java.lang.Throwable th) {
        if (th instanceof EC2MetadataError) {
            HttpStatusCode.TaskDescription taskDescription = HttpStatusCode.KWHzl;
            HttpStatusCode httpStatusCodeAEQbTJ = taskDescription.AEQbTJ(((EC2MetadataError) th).getStatusCode());
            if (zT.AEQbTJ(httpStatusCodeAEQbTJ) != HttpStatusCode.Category.SERVER_ERROR && !Intrinsics.EZpvd(httpStatusCodeAEQbTJ, taskDescription.dNCPSb())) {
                CoroutineContext coroutineContext = this.AEQbTJ;
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(InvalidObjectException.class).gEmmrt();
                if (strGEmmrt != null) {
                    InterfaceC5148Go.TaskDescription.debug$default(C5141Gh.OLrzqt(coroutineContext, strGEmmrt), null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.imds.ImdsRetryPolicy$evaluate$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Non retryable IMDS error: statusCode=" + ((EC2MetadataError) th).getStatusCode() + "; " + th.getMessage();
                        }
                    }, 1, null);
                    return AbstractC5091Ej.Application.AEQbTJ;
                }
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            return new AbstractC5091Ej.StateListAnimator(RetryErrorType.ServerSide);
        }
        return AbstractC5091Ej.Application.AEQbTJ;
    }
}

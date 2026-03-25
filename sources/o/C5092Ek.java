package o;

import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.SdkBaseException;
import aws.smithy.kotlin.runtime.ServiceException;
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import aws.smithy.kotlin.runtime.retries.policy.StandardRetryPolicy$evaluationStrategies$1;
import aws.smithy.kotlin.runtime.retries.policy.StandardRetryPolicy$evaluationStrategies$2;
import aws.smithy.kotlin.runtime.retries.policy.StandardRetryPolicy$evaluationStrategies$3;
import aws.smithy.kotlin.runtime.retries.policy.StandardRetryPolicy$evaluationStrategies$4;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AbstractC5091Ej;
import o.C5090Ei;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5092Ek implements InterfaceC5093El<java.lang.Object> {
    public final Sequence<C5090Ei<? extends java.lang.Throwable>> valueOf;
    public static final Application KWHzl = new Application(null);
    public static final C5092Ek AYXKKw = new C5092Ek();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5091Ej OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return null;
    }

    /* JADX INFO: renamed from: o.Ek$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ek.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C5092Ek KWHzl() {
            return C5092Ek.AYXKKw;
        }
    }

    public C5092Ek() {
        C5090Ei.Application application = C5090Ei.EZpvd;
        this.valueOf = C59405zgS.EZpvd((java.lang.Object[]) new C5090Ei[]{new C5090Ei(C56524yIo.AEQbTJ(java.lang.Throwable.class), new StandardRetryPolicy$evaluationStrategies$1(this)), new C5090Ei(C56524yIo.AEQbTJ(ServiceException.class), new StandardRetryPolicy$evaluationStrategies$2(this)), new C5090Ei(C56524yIo.AEQbTJ(ClientException.class), new StandardRetryPolicy$evaluationStrategies$3(this)), new C5090Ei(C56524yIo.AEQbTJ(SdkBaseException.class), new StandardRetryPolicy$evaluationStrategies$4(this))});
    }

    @Override // o.InterfaceC5093El
    public AbstractC5091Ej KWHzl(@NotNull java.lang.Object obj) {
        if (Result.m7384isSuccessimpl(obj)) {
            return AbstractC5091Ej.Activity.AEQbTJ;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
        return copydefault(thM7380exceptionOrNullimpl);
    }

    private final AbstractC5091Ej copydefault(java.lang.Throwable th) {
        AbstractC5091Ej abstractC5091EjOLrzqt;
        java.util.Iterator<C5090Ei<? extends java.lang.Throwable>> it = this.valueOf.iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC5091EjOLrzqt = null;
                break;
            }
            abstractC5091EjOLrzqt = it.next().OLrzqt(th);
            if (abstractC5091EjOLrzqt != null) {
                break;
            }
        }
        return abstractC5091EjOLrzqt == null ? AbstractC5091Ej.Application.AEQbTJ : abstractC5091EjOLrzqt;
    }

    public final AbstractC5091Ej KWHzl(SdkBaseException sdkBaseException) {
        C52427wL sdkErrorMetadata = sdkBaseException.getSdkErrorMetadata();
        if (sdkErrorMetadata.AEQbTJ()) {
            return new AbstractC5091Ej.StateListAnimator(RetryErrorType.Throttling);
        }
        if (sdkErrorMetadata.copydefault()) {
            return new AbstractC5091Ej.StateListAnimator(RetryErrorType.Transient);
        }
        return null;
    }

    public final AbstractC5091Ej OLrzqt(ClientException clientException) {
        if (clientException.getSdkErrorMetadata().copydefault()) {
            return new AbstractC5091Ej.StateListAnimator(RetryErrorType.ClientSide);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5091Ej KWHzl(ServiceException serviceException) {
        C52562wQ sdkErrorMetadata = serviceException.getSdkErrorMetadata();
        if (sdkErrorMetadata.copydefault() && sdkErrorMetadata.values() == ServiceException.ErrorType.Server) {
            return new AbstractC5091Ej.StateListAnimator(RetryErrorType.ServerSide);
        }
        if (sdkErrorMetadata.copydefault() && sdkErrorMetadata.values() == ServiceException.ErrorType.Client) {
            return new AbstractC5091Ej.StateListAnimator(RetryErrorType.ClientSide);
        }
        return null;
    }
}

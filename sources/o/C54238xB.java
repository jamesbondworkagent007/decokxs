package o;

import aws.smithy.kotlin.runtime.SdkBaseException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C5173Hn;
import o.C59462zhW;
import o.InterfaceC5148Go;
import o.InterfaceC54725xT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C54238xB implements InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> {
    public static final long AEQbTJ;
    public static final java.util.List<java.lang.String> EZpvd;
    public static final /* synthetic */ AtomicReferenceFieldUpdater KWHzl;
    public static final Application OLrzqt = new Application(null);
    public static final java.util.List<java.lang.String> copydefault;
    public volatile /* synthetic */ java.lang.Object gEmmrt = null;

    /* JADX INFO: renamed from: o.xB$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final long copydefault() {
            return C54238xB.AEQbTJ;
        }

        public final boolean EZpvd(@NotNull C5173Hn c5173Hn, @NotNull C5173Hn c5173Hn2, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(c5173Hn, "");
            Intrinsics.checkNotNullParameter(c5173Hn2, "");
            Intrinsics.checkNotNullParameter(str, "");
            return C54238xB.EZpvd.contains(str) || (C54238xB.copydefault.contains(str) && C59462zhW.KWHzl(C59462zhW.OLrzqt(C5172Hm.OLrzqt(c5173Hn, c5173Hn2)), copydefault()) >= 0);
        }
    }

    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s */
    public java.lang.Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeDeserialization(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX, @NotNull Continuation<? super InterfaceC5039Cj> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX, (Continuation) continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ, (Continuation) continuation);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.ya<java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>] */
    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya, @NotNull Continuation<? super java.lang.Object> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya, continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeTransmit(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ, continuation);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterAttempt(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterDeserialization(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterExecution(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterSerialization(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.AEQbTJ(this, interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.EZpvd(this, interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterTransmit(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
        InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeAttempt(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeDeserialization(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
        InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeExecution(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya) {
        InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeSerialization(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya) {
        InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC56995ya);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeTransmit(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ);
    }

    static {
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        AEQbTJ = C59519zia.EZpvd(4, DurationUnit.MINUTES);
        EZpvd = yDY.gEmmrt("RequestTimeTooSkewed", "RequestExpired", "RequestInTheFuture");
        copydefault = yDY.gEmmrt("InvalidSignatureException", "SignatureDoesNotMatch", "AuthFailure");
        KWHzl = AtomicReferenceFieldUpdater.newUpdater(C54238xB.class, java.lang.Object.class, "gEmmrt");
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        CoroutineContext context = continuation.getContext();
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C54238xB.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
        final C59462zhW c59462zhW = (C59462zhW) this.gEmmrt;
        if (c59462zhW != null) {
            c59462zhW.copydefault();
            InterfaceC5148Go.TaskDescription.info$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.awsprotocol.ClockSkewInterceptor$modifyBeforeSigning$2$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "applying clock skew " + c59462zhW + " to client";
                }
            }, 1, null);
            interfaceC54887xZ.KWHzl().OLrzqt(BC.copydefault.EZpvd(), c59462zhW);
        }
        interfaceC54887xZ.KWHzl().OLrzqt(BC.copydefault.KWHzl(), C5173Hn.AEQbTJ.KWHzl());
        return interfaceC54887xZ.AEQbTJ();
    }

    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public java.lang.Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        java.lang.String strCopydefault;
        C5173Hn.ActionBar actionBar;
        final C5173Hn c5173HnOLrzqt;
        final C5173Hn c5173HnCopydefault;
        CoroutineContext context = continuation.getContext();
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C54238xB.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
        InterfaceC5039Cj interfaceC5039CjEZpvd = interfaceC54860xY.EZpvd();
        if (interfaceC5039CjEZpvd == null || (strCopydefault = C5040Ck.copydefault(interfaceC5039CjEZpvd, "Date")) == null || (c5173HnOLrzqt = (actionBar = C5173Hn.AEQbTJ).OLrzqt(strCopydefault)) == null) {
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.awsprotocol.ClockSkewInterceptor$modifyBeforeAttemptCompletion$serverTime$2$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "service did not return \"Date\" header, skipping skew calculation";
                }
            }, 1, null);
            return interfaceC54860xY.copydefault();
        }
        java.lang.String strCopydefault2 = interfaceC54860xY.AEQbTJ().EZpvd().copydefault("Date");
        if (strCopydefault2 == null || (c5173HnCopydefault = actionBar.OLrzqt(strCopydefault2)) == null) {
            java.lang.String strCopydefault3 = interfaceC54860xY.AEQbTJ().EZpvd().copydefault("x-amz-date");
            if (strCopydefault3 != null) {
                c5173HnCopydefault = actionBar.copydefault(strCopydefault3);
            } else {
                c5173HnCopydefault = (C5173Hn) C58108yv.OLrzqt(interfaceC54860xY.KWHzl(), BC.copydefault.KWHzl());
            }
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(interfaceC54860xY.copydefault());
        SdkBaseException sdkBaseException = thM7380exceptionOrNullimpl instanceof SdkBaseException ? (SdkBaseException) thM7380exceptionOrNullimpl : null;
        if (sdkBaseException == null) {
            return interfaceC54860xY.copydefault();
        }
        java.lang.String str = (java.lang.String) sdkBaseException.getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.AEQbTJ());
        if (str != null && OLrzqt.EZpvd(c5173HnCopydefault, c5173HnOLrzqt, str)) {
            final long jOLrzqt = C5172Hm.OLrzqt(c5173HnCopydefault, c5173HnOLrzqt);
            InterfaceC5148Go.TaskDescription.warn$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.awsprotocol.ClockSkewInterceptor$modifyBeforeAttemptCompletion$2$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "client clock (" + c5173HnCopydefault + ") is skewed " + ((Object) C59462zhW.getFieldNames(jOLrzqt)) + " from the server (" + c5173HnOLrzqt + "), applying correction";
                }
            }, 1, null);
            KWHzl.getAndSet(this, C59462zhW.KWHzl(jOLrzqt));
            interfaceC54860xY.KWHzl().OLrzqt(BC.copydefault.EZpvd(), C59462zhW.KWHzl(jOLrzqt));
            sdkBaseException.getSdkErrorMetadata().OLrzqt().OLrzqt(C52427wL.KWHzl.OLrzqt(), C56443yFo.KWHzl(true));
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(sdkBaseException));
        }
        return interfaceC54860xY.copydefault();
    }
}

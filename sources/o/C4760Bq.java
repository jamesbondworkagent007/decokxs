package o;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5148Go;
import o.InterfaceC54725xT;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4760Bq implements InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final long KWHzl;
    public final java.util.List<InterfaceC59068za> OLrzqt;

    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public java.lang.Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        return InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
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

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.ya<java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>] */
    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya, @NotNull Continuation<? super java.lang.Object> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya, continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC54887xZ, continuation);
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

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        InterfaceC59068za interfaceC59068za;
        final java.lang.String str;
        java.lang.Object next;
        java.lang.Long lAEQbTJ = interfaceC54887xZ.AEQbTJ().KWHzl().AEQbTJ();
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC59068za = null;
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.Iterator<T> it2 = this.OLrzqt.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC59068za) next).OLrzqt(), (java.lang.Object) str2)) {
                    break;
                }
            }
            interfaceC59068za = (InterfaceC59068za) next;
            if (interfaceC59068za != null) {
                break;
            }
        }
        if (interfaceC59068za != null && (OLrzqt(interfaceC54887xZ.AEQbTJ().KWHzl()) || (lAEQbTJ != null && lAEQbTJ.longValue() >= this.KWHzl))) {
            return C3391Al.OLrzqt(interfaceC59068za, interfaceC54887xZ.AEQbTJ());
        }
        CoroutineContext context = continuation.getContext();
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C4760Bq.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
        if (interfaceC59068za == null) {
            str = "no modeled compression algorithms are supported by the client";
        } else {
            str = "request size threshold (" + this.KWHzl + ") was not met";
        }
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.interceptors.RequestCompressionInterceptor$modifyBeforeRetryLoop$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "skipping request compression because " + str;
            }
        }, 1, null);
        return interfaceC54887xZ.AEQbTJ();
    }

    public final boolean OLrzqt(zP zPVar) {
        return (zPVar instanceof zP.Activity) || (zPVar instanceof zP.Application) || zPVar.AEQbTJ() == null;
    }
}

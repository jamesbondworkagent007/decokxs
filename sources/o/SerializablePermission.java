package o;

import aws.sdk.kotlin.runtime.http.interceptors.AwsSpanInterceptor$modifyBeforeAttemptCompletion$1;
import aws.sdk.kotlin.runtime.http.interceptors.AwsSpanInterceptor$modifyBeforeCompletion$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import o.InterfaceC54725xT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializablePermission implements InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> {
    public static final SerializablePermission EZpvd = new SerializablePermission();

    private SerializablePermission() {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        AwsSpanInterceptor$modifyBeforeAttemptCompletion$1 awsSpanInterceptor$modifyBeforeAttemptCompletion$1;
        if (continuation instanceof AwsSpanInterceptor$modifyBeforeAttemptCompletion$1) {
            awsSpanInterceptor$modifyBeforeAttemptCompletion$1 = (AwsSpanInterceptor$modifyBeforeAttemptCompletion$1) continuation;
            int i = awsSpanInterceptor$modifyBeforeAttemptCompletion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsSpanInterceptor$modifyBeforeAttemptCompletion$1.label = i - Integer.MIN_VALUE;
            } else {
                awsSpanInterceptor$modifyBeforeAttemptCompletion$1 = new AwsSpanInterceptor$modifyBeforeAttemptCompletion$1(this, continuation);
            }
        }
        java.lang.Object obj = awsSpanInterceptor$modifyBeforeAttemptCompletion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsSpanInterceptor$modifyBeforeAttemptCompletion$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        AEQbTJ(GO.copydefault(awsSpanInterceptor$modifyBeforeAttemptCompletion$1.getContext()), interfaceC54860xY.EZpvd());
        awsSpanInterceptor$modifyBeforeAttemptCompletion$1.label = 1;
        java.lang.Object objKWHzl = InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) awsSpanInterceptor$modifyBeforeAttemptCompletion$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        AwsSpanInterceptor$modifyBeforeCompletion$1 awsSpanInterceptor$modifyBeforeCompletion$1;
        if (continuation instanceof AwsSpanInterceptor$modifyBeforeCompletion$1) {
            awsSpanInterceptor$modifyBeforeCompletion$1 = (AwsSpanInterceptor$modifyBeforeCompletion$1) continuation;
            int i = awsSpanInterceptor$modifyBeforeCompletion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsSpanInterceptor$modifyBeforeCompletion$1.label = i - Integer.MIN_VALUE;
            } else {
                awsSpanInterceptor$modifyBeforeCompletion$1 = new AwsSpanInterceptor$modifyBeforeCompletion$1(this, continuation);
            }
        }
        java.lang.Object obj = awsSpanInterceptor$modifyBeforeCompletion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsSpanInterceptor$modifyBeforeCompletion$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        AEQbTJ(GO.copydefault(awsSpanInterceptor$modifyBeforeCompletion$1.getContext()), interfaceC54860xY.EZpvd());
        awsSpanInterceptor$modifyBeforeCompletion$1.label = 1;
        java.lang.Object objOLrzqt = InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) awsSpanInterceptor$modifyBeforeCompletion$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    public final void AEQbTJ(GU gu, InterfaceC5039Cj interfaceC5039Cj) {
        if (gu == null || interfaceC5039Cj == null) {
            return;
        }
        java.lang.String strCopydefault = interfaceC5039Cj.AEQbTJ().copydefault("x-amz-request-id");
        if (strCopydefault != null) {
            GX.OLrzqt(gu, "aws.request_id", strCopydefault);
        }
        java.lang.String strCopydefault2 = interfaceC5039Cj.AEQbTJ().copydefault("x-amz-id-2");
        if (strCopydefault2 != null) {
            GX.OLrzqt(gu, "aws.extended_request_id", strCopydefault2);
        }
    }
}

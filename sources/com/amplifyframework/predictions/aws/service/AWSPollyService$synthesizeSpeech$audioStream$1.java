package com.amplifyframework.predictions.aws.service;

import java.io.ByteArrayInputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC59439zh;
import o.C56391yDq;
import o.C56442yFn;
import o.C59651zl;
import o.LinearInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSPollyService$synthesizeSpeech$audioStream$1 extends SuspendLambda implements Function2<LinearInterpolator, Continuation<? super ByteArrayInputStream>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AWSPollyService$synthesizeSpeech$audioStream$1(Continuation<? super AWSPollyService$synthesizeSpeech$audioStream$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        AWSPollyService$synthesizeSpeech$audioStream$1 aWSPollyService$synthesizeSpeech$audioStream$1 = new AWSPollyService$synthesizeSpeech$audioStream$1(continuation);
        aWSPollyService$synthesizeSpeech$audioStream$1.L$0 = obj;
        return aWSPollyService$synthesizeSpeech$audioStream$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull LinearInterpolator linearInterpolator, Continuation<? super ByteArrayInputStream> continuation) {
        return ((AWSPollyService$synthesizeSpeech$audioStream$1) create(linearInterpolator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC59439zh abstractC59439zhOLrzqt = ((LinearInterpolator) this.L$0).OLrzqt();
            if (abstractC59439zhOLrzqt != null) {
                this.label = 1;
                obj = C59651zl.AEQbTJ(abstractC59439zhOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            return new ByteArrayInputStream(bArr);
        }
        return null;
    }
}

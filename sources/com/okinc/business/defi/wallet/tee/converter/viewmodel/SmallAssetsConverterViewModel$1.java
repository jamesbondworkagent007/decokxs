package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.fUX;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fUX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterViewModel$1(fUX fux, Continuation<? super SmallAssetsConverterViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = fux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                fUX fux = this.this$0;
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = fux.uzCIH;
                SmallAssetsConverterViewModel$1$1$1 smallAssetsConverterViewModel$1$1$1 = new SmallAssetsConverterViewModel$1$1$1(fux, null);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, smallAssetsConverterViewModel$1$1$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        fUX fux2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            fux2.values.setValue((AbstractC12782ctV) objM7377constructorimpl);
        }
        return Unit.INSTANCE;
    }
}

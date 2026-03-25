package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$tokenAssetsFlow$2 extends SuspendLambda implements yHO<AbstractC12782ctV, Integer, Continuation<? super AbstractC12782ctV>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmallAssetsConverterViewModel$tokenAssetsFlow$2(Continuation<? super SmallAssetsConverterViewModel$tokenAssetsFlow$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(AbstractC12782ctV abstractC12782ctV, Integer num, Continuation<? super AbstractC12782ctV> continuation) {
        return invoke(abstractC12782ctV, num.intValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(AbstractC12782ctV abstractC12782ctV, int i, Continuation<? super AbstractC12782ctV> continuation) {
        SmallAssetsConverterViewModel$tokenAssetsFlow$2 smallAssetsConverterViewModel$tokenAssetsFlow$2 = new SmallAssetsConverterViewModel$tokenAssetsFlow$2(continuation);
        smallAssetsConverterViewModel$tokenAssetsFlow$2.L$0 = abstractC12782ctV;
        return smallAssetsConverterViewModel$tokenAssetsFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return (AbstractC12782ctV) this.L$0;
    }
}

package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHT;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$quoteFlow$1 extends SuspendLambda implements yHT<Integer, String, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmallAssetsConverterViewModel$quoteFlow$1(Continuation<? super SmallAssetsConverterViewModel$quoteFlow$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, String str, boolean z, Continuation<? super Boolean> continuation) {
        SmallAssetsConverterViewModel$quoteFlow$1 smallAssetsConverterViewModel$quoteFlow$1 = new SmallAssetsConverterViewModel$quoteFlow$1(continuation);
        smallAssetsConverterViewModel$quoteFlow$1.Z$0 = z;
        return smallAssetsConverterViewModel$quoteFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(Integer num, String str, Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(num.intValue(), str, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return C56443yFo.KWHzl(this.Z$0);
    }
}

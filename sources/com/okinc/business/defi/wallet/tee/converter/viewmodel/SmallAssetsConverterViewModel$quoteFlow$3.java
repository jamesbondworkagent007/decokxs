package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fTY;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$quoteFlow$3 extends SuspendLambda implements yHO<fTY, Boolean, Continuation<? super Pair<? extends fTY, ? extends Boolean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmallAssetsConverterViewModel$quoteFlow$3(Continuation<? super SmallAssetsConverterViewModel$quoteFlow$3> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(fTY fty, Boolean bool, Continuation<? super Pair<? extends fTY, ? extends Boolean>> continuation) {
        return invoke(fty, bool.booleanValue(), (Continuation<? super Pair<fTY, Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(fTY fty, boolean z, Continuation<? super Pair<fTY, Boolean>> continuation) {
        SmallAssetsConverterViewModel$quoteFlow$3 smallAssetsConverterViewModel$quoteFlow$3 = new SmallAssetsConverterViewModel$quoteFlow$3(continuation);
        smallAssetsConverterViewModel$quoteFlow$3.L$0 = fty;
        smallAssetsConverterViewModel$quoteFlow$3.Z$0 = z;
        return smallAssetsConverterViewModel$quoteFlow$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((fTY) this.L$0, C56443yFo.KWHzl(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

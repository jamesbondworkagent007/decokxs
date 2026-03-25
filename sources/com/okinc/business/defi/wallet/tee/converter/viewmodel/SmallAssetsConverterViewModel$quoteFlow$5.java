package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$quoteFlow$5 extends SuspendLambda implements yHO<Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>>, Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>>, Continuation<? super Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmallAssetsConverterViewModel$quoteFlow$5(Continuation<? super SmallAssetsConverterViewModel$quoteFlow$5> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>> pair, Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>> pair2, Continuation<? super Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>>> continuation) {
        return invoke2((Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>>) pair, (Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>>) pair2, (Continuation<? super Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>> pair, Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>> pair2, Continuation<? super Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>>> continuation) {
        SmallAssetsConverterViewModel$quoteFlow$5 smallAssetsConverterViewModel$quoteFlow$5 = new SmallAssetsConverterViewModel$quoteFlow$5(continuation);
        smallAssetsConverterViewModel$quoteFlow$5.L$0 = pair;
        smallAssetsConverterViewModel$quoteFlow$5.L$1 = pair2;
        return smallAssetsConverterViewModel$quoteFlow$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            Pair pair2 = (Pair) this.L$1;
            return (pair != null && ((Boolean) pair2.getFirst()).booleanValue()) ? pair : pair2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

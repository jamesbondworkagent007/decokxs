package com.okinc.okmarket.data;

import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.sZN;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketDataApiImpl$httpThenSubscribePriceAndPercent$httpFlow$1 extends SuspendLambda implements Function1<Continuation<? super List<? extends Pair<? extends String, ? extends Triple<? extends String, ? extends Double, ? extends String>>>>, Object> {
    final /* synthetic */ List<String> $ccy;
    final /* synthetic */ boolean $convertPrice;
    final /* synthetic */ boolean $isCcy;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    int label;
    final /* synthetic */ sZN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDataApiImpl$httpThenSubscribePriceAndPercent$httpFlow$1(sZN szn, LifecycleOwner lifecycleOwner, List<String> list, boolean z, boolean z2, Continuation<? super MarketDataApiImpl$httpThenSubscribePriceAndPercent$httpFlow$1> continuation) {
        super(1, continuation);
        this.this$0 = szn;
        this.$lifecycleOwner = lifecycleOwner;
        this.$ccy = list;
        this.$isCcy = z;
        this.$convertPrice = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketDataApiImpl$httpThenSubscribePriceAndPercent$httpFlow$1(this.this$0, this.$lifecycleOwner, this.$ccy, this.$isCcy, this.$convertPrice, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Pair<? extends String, ? extends Triple<? extends String, ? extends Double, ? extends String>>>> continuation) {
        return invoke2((Continuation<? super List<Pair<String, Triple<String, Double, String>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<Pair<String, Triple<String, Double, String>>>> continuation) {
        return ((MarketDataApiImpl$httpThenSubscribePriceAndPercent$httpFlow$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sZN szn = this.this$0;
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            List<String> list = this.$ccy;
            boolean z = this.$isCcy;
            boolean z2 = this.$convertPrice;
            this.label = 1;
            obj = szn.AEQbTJ(lifecycleOwner, list, z, z2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list2 = (List) obj;
        return list2 == null ? yDY.AhwBna() : list2;
    }
}

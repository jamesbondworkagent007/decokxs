package com.okinc.find_ui.ranking.dex.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C34964nmQ;
import o.C41424qqZ;
import o.C42955rgF;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC41655qus;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeDexViewModel$subscribeData$2$3$4 extends SuspendLambda implements Function2<List<? extends InterfaceC41655qus>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $pageSize;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeDexViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeDexViewModel$subscribeData$2$3$4(MarketHomeDexViewModel marketHomeDexViewModel, int i, Continuation<? super MarketHomeDexViewModel$subscribeData$2$3$4> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeDexViewModel;
        this.$pageSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeDexViewModel$subscribeData$2$3$4 marketHomeDexViewModel$subscribeData$2$3$4 = new MarketHomeDexViewModel$subscribeData$2$3$4(this.this$0, this.$pageSize, continuation);
        marketHomeDexViewModel$subscribeData$2$3$4.L$0 = obj;
        return marketHomeDexViewModel$subscribeData$2$3$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends InterfaceC41655qus> list, Continuation<? super Unit> continuation) {
        return ((MarketHomeDexViewModel$subscribeData$2$3$4) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            boolean zEZpvd = Intrinsics.EZpvd((Object) C42955rgF.copydefault.copydefault().getValue(), (Object) "Turnover");
            MarketHomeDexViewModel marketHomeDexViewModel = this.this$0;
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) list, this.$pageSize);
            ArrayList<C34964nmQ> arrayList = new ArrayList();
            for (Object obj2 : listAhwBna) {
                if (obj2 instanceof C34964nmQ) {
                    arrayList.add(obj2);
                }
            }
            MarketHomeDexViewModel marketHomeDexViewModel2 = this.this$0;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (C34964nmQ c34964nmQ : arrayList) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(C34964nmQ.copy$default(c34964nmQ, null, null, null, null, null, null, null, false, null, (C41424qqZ) marketHomeDexViewModel2.EZpvd.copydefault((Object) c34964nmQ), zEZpvd, null, null, null, null, 31231, null));
                arrayList2 = arrayList3;
                i2 = 1;
            }
            this.label = i2;
            if (marketHomeDexViewModel.OLrzqt((List<C34964nmQ>) arrayList2, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}

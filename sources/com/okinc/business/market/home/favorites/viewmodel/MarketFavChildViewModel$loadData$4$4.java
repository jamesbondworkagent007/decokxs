package com.okinc.business.market.home.favorites.viewmodel;

import com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.qWH;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavChildViewModel$loadData$4$4 extends SuspendLambda implements Function2<List<? extends qWH>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketFavChildViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavChildViewModel$loadData$4$4(String str, MarketFavChildViewModel marketFavChildViewModel, Continuation<? super MarketFavChildViewModel$loadData$4$4> continuation) {
        super(2, continuation);
        this.$type = str;
        this.this$0 = marketFavChildViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketFavChildViewModel$loadData$4$4 marketFavChildViewModel$loadData$4$4 = new MarketFavChildViewModel$loadData$4$4(this.$type, this.this$0, continuation);
        marketFavChildViewModel$loadData$4$4.L$0 = obj;
        return marketFavChildViewModel$loadData$4$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends qWH> list, Continuation<? super Unit> continuation) {
        return ((MarketFavChildViewModel$loadData$4$4) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            pUU.KWHzl("MarketFavChildViewModel", "loadData: Received data，type=" + this.$type + ", dataSize=" + list.size());
            MarketFavChildViewModel marketFavChildViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel$loadData$4$4.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((MarketFavChildViewModel.ActionBar) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((MarketFavChildViewModel.ActionBar) obj2).EZpvd((InterfaceC49371unL) obj3);
                }
            };
            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(C56390yDp.OLrzqt(list, this.$type));
            this.label = 1;
            if (marketFavChildViewModel.KWHzl(anonymousClass1, activity, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

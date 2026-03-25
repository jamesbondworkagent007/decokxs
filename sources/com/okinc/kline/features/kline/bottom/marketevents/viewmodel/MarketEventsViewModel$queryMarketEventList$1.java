package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pDX;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsViewModel$queryMarketEventList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<MarketEventsVo> $currentList;
    final /* synthetic */ boolean $isNeedLoading;
    int label;
    final /* synthetic */ MarketEventsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketEventsViewModel$queryMarketEventList$1(MarketEventsViewModel marketEventsViewModel, boolean z, List<? extends MarketEventsVo> list, Continuation<? super MarketEventsViewModel$queryMarketEventList$1> continuation) {
        super(2, continuation);
        this.this$0 = marketEventsViewModel;
        this.$isNeedLoading = z;
        this.$currentList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketEventsViewModel$queryMarketEventList$1(this.this$0, this.$isNeedLoading, this.$currentList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketEventsViewModel$queryMarketEventList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.this$0.AkhnZx;
            if (str == null || str.length() == 0 || Intrinsics.EZpvd((Object) this.this$0.AkhnZx, (Object) "0")) {
                MarketEventsViewModel marketEventsViewModel = this.this$0;
                InterfaceC49371unL.StateListAnimator stateListAnimator = new InterfaceC49371unL.StateListAnimator(null, 1, null);
                this.label = 1;
                if (MarketEventsViewModel.updateEventList$default(marketEventsViewModel, stateListAnimator, false, this, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            if (this.$isNeedLoading) {
                MarketEventsViewModel marketEventsViewModel2 = this.this$0;
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.label = 2;
                if (MarketEventsViewModel.updateEventList$default(marketEventsViewModel2, actionBar, false, this, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (!pDX.AEQbTJ.AYXKKw()) {
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                if (!pDX.AEQbTJ.AYXKKw()) {
                    MarketEventsViewModel marketEventsViewModel3 = this.this$0;
                    boolean z = this.$isNeedLoading;
                    List<MarketEventsVo> list = this.$currentList;
                    this.label = 3;
                    if (marketEventsViewModel3.KWHzl(z, (List<? extends MarketEventsVo>) list, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    MarketEventsViewModel marketEventsViewModel4 = this.this$0;
                    boolean z2 = this.$isNeedLoading;
                    List<MarketEventsVo> list2 = this.$currentList;
                    this.label = 4;
                    if (marketEventsViewModel4.copydefault(z2, (List<? extends MarketEventsVo>) list2, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        }
        return Unit.INSTANCE;
    }
}

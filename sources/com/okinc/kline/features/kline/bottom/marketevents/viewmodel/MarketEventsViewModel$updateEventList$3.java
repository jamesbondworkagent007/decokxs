package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C36157oRj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes23.dex */
public final class MarketEventsViewModel$updateEventList$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketEventsVo.Content $vo;
    int label;
    final /* synthetic */ MarketEventsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketEventsViewModel$updateEventList$3(MarketEventsViewModel marketEventsViewModel, MarketEventsVo.Content content, Continuation<? super MarketEventsViewModel$updateEventList$3> continuation) {
        super(2, continuation);
        this.this$0 = marketEventsViewModel;
        this.$vo = content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketEventsViewModel$updateEventList$3(this.this$0, this.$vo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketEventsViewModel$updateEventList$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        MarketEventsVo marketEventsVoCopy$default;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketEventsViewModel marketEventsViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel$updateEventList$3.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C36157oRj) obj2).copydefault();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C36157oRj) obj2).OLrzqt((InterfaceC49371unL) obj3);
                }
            };
            this.label = 1;
            objCopydefault = marketEventsViewModel.copydefault(marketEventsViewModel, anonymousClass1, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        List<MarketEventsVo> list = (List) objCopydefault;
        if (list != null) {
            MarketEventsVo.Content content = this.$vo;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MarketEventsVo marketEventsVo : list) {
                if (marketEventsVo instanceof MarketEventsVo.Content) {
                    MarketEventsVo.Content content2 = (MarketEventsVo.Content) marketEventsVo;
                    if (Intrinsics.EZpvd((Object) content2.djBIcL().getSummaryContentId(), (Object) content.djBIcL().getSummaryContentId())) {
                        marketEventsVoCopy$default = content;
                    } else {
                        marketEventsVoCopy$default = content2.OLrzqt((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? content2.AYXKKw : null, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? content2.AEQbTJ : null, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? content2.OLrzqt : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? content2.djBIcL : false, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? content2.valueOf : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? content2.copydefault : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? content2.AhwBna : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? content2.KWHzl : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? content2.EZpvd : null);
                    }
                } else {
                    if (!(marketEventsVo instanceof MarketEventsVo.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    marketEventsVoCopy$default = MarketEventsVo.TaskDescription.copy$default((MarketEventsVo.TaskDescription) marketEventsVo, 0L, 1, null);
                }
                arrayList.add(marketEventsVoCopy$default);
            }
            MarketEventsViewModel marketEventsViewModel2 = this.this$0;
            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(arrayList);
            this.label = 2;
            if (MarketEventsViewModel.updateEventList$default(marketEventsViewModel2, activity, false, this, 2, null) == objCopydefault2) {
                return objCopydefault2;
            }
        }
        return Unit.INSTANCE;
    }
}

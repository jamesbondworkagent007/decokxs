package com.okinc.kline.ui;

import android.widget.ImageView;
import com.okinc.unified.BusinessType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C38685peB;
import o.C56391yDq;
import o.C56442yFn;
import o.oOS;
import o.qWJ;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineHeaderFragment$subscribeWatchList$1$1$1$1 extends SuspendLambda implements Function2<List<? extends WatchListData>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38685peB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineHeaderFragment$subscribeWatchList$1$1$1$1(C38685peB c38685peB, Continuation<? super KlineHeaderFragment$subscribeWatchList$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c38685peB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineHeaderFragment$subscribeWatchList$1$1$1$1 klineHeaderFragment$subscribeWatchList$1$1$1$1 = new KlineHeaderFragment$subscribeWatchList$1$1$1$1(this.this$0, continuation);
        klineHeaderFragment$subscribeWatchList$1$1$1$1.L$0 = obj;
        return klineHeaderFragment$subscribeWatchList$1$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends WatchListData> list, Continuation<? super Unit> continuation) {
        return invoke2((List<WatchListData>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<WatchListData> list, Continuation<? super Unit> continuation) {
        return ((KlineHeaderFragment$subscribeWatchList$1$1$1$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ImageView imageView;
        boolean z;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<WatchListData> list = (List) this.L$0;
            oOS oos = this.this$0.valueOf;
            if (oos != null && (imageView = oos.AYXKKw) != null) {
                C38685peB c38685peB = this.this$0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                    imageView.setSelected(z);
                } else {
                    for (WatchListData watchListData : list) {
                        if (c38685peB.AhwBna() == BusinessType.CeDeFi) {
                            if (Intrinsics.EZpvd((Object) watchListData.getChainId(), (Object) c38685peB.AkhnZx()) && Intrinsics.EZpvd((Object) watchListData.getTokenContractAddress(), (Object) c38685peB.QbewEr())) {
                                z = true;
                                break;
                            }
                        } else {
                            BizInstrument bizInstrumentKWHzl = qWJ.KWHzl(watchListData);
                            if (Intrinsics.EZpvd((Object) (bizInstrumentKWHzl != null ? bizInstrumentKWHzl.getInstId() : null), (Object) c38685peB.QKVWgx()) && Intrinsics.EZpvd((Object) bizInstrumentKWHzl.getInstType(), (Object) c38685peB.ORxRYg())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    imageView.setSelected(z);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

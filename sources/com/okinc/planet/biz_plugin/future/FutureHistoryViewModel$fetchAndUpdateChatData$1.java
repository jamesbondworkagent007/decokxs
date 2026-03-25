package com.okinc.planet.biz_plugin.future;

import com.okinc.planet.biz_plugin.future.data.FutureChatBean;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45948tCe;
import o.C56391yDq;
import o.C56442yFn;
import o.tBZ;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureHistoryViewModel$fetchAndUpdateChatData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FutureHistoryBean $item;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function1<FutureHistoryBean, Unit> $onSuccess;
    int label;
    final /* synthetic */ C45948tCe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.future.data.FutureHistoryBean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FutureHistoryViewModel$fetchAndUpdateChatData$1(C45948tCe c45948tCe, FutureHistoryBean futureHistoryBean, Function1<? super FutureHistoryBean, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super FutureHistoryViewModel$fetchAndUpdateChatData$1> continuation) {
        super(2, continuation);
        this.this$0 = c45948tCe;
        this.$item = futureHistoryBean;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureHistoryViewModel$fetchAndUpdateChatData$1(this.this$0, this.$item, this.$onSuccess, this.$onError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureHistoryViewModel$fetchAndUpdateChatData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tBZ tbz = this.this$0.EZpvd;
                String instId = this.$item.getTradeHisPositionPlanetBean().getInstId();
                String instType = this.$item.getTradeHisPositionPlanetBean().getInstType();
                String cTimestamp = this.$item.getTradeHisPositionPlanetBean().getCTimestamp();
                String listTime = this.$item.getTradeHisPositionPlanetBean().getListTime();
                String pluginDataTime = this.$item.getPluginDataTime();
                this.label = 1;
                obj = tbz.copydefault(instId, instType, cTimestamp, listTime, pluginDataTime, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Pair pair = (Pair) obj;
            FutureChatBean futureChatBean = (FutureChatBean) pair.component1();
            if (!((Boolean) pair.component2()).booleanValue() || futureChatBean == null) {
                this.this$0.AEQbTJ(this.$item.getTradeHisPositionPlanetBean().getPosId());
                this.$onError.invoke("Failed to load chart data");
            } else {
                FutureHistoryBean futureHistoryBeanCopy$default = FutureHistoryBean.copy$default(this.$item, null, true, null, futureChatBean.getKlineList(), futureChatBean.getBuySellMarkerList(), false, 5, null);
                this.this$0.EZpvd(futureHistoryBeanCopy$default);
                this.$onSuccess.invoke(futureHistoryBeanCopy$default);
            }
        } catch (Exception e) {
            this.this$0.AEQbTJ(this.$item.getTradeHisPositionPlanetBean().getPosId());
            Function1<String, Unit> function1 = this.$onError;
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error occurred";
            }
            function1.invoke(message);
        }
        return Unit.INSTANCE;
    }
}

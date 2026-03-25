package com.okinc.planet.biz_plugin.future;

import com.okinc.planet.biz_plugin.future.data.FutureChatBean;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45957tCn;
import o.C56391yDq;
import o.C56442yFn;
import o.tBZ;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureQuicklyViewModel$selectWithChatData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FuturePositionBean $item;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function1<FuturePositionBean, Unit> $onSuccess;
    int label;
    final /* synthetic */ C45957tCn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.future.data.FuturePositionBean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FutureQuicklyViewModel$selectWithChatData$3(C45957tCn c45957tCn, FuturePositionBean futurePositionBean, Function1<? super FuturePositionBean, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super FutureQuicklyViewModel$selectWithChatData$3> continuation) {
        super(2, continuation);
        this.this$0 = c45957tCn;
        this.$item = futurePositionBean;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureQuicklyViewModel$selectWithChatData$3(this.this$0, this.$item, this.$onSuccess, this.$onError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureQuicklyViewModel$selectWithChatData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tBZ tbz = this.this$0.copydefault;
                String instId = this.$item.getTradePositionPlanetBean().getInstId();
                String instType = this.$item.getTradePositionPlanetBean().getInstType();
                String cTimestamp = this.$item.getTradePositionPlanetBean().getCTimestamp();
                String listTime = this.$item.getTradePositionPlanetBean().getListTime();
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
            if (((Boolean) pair.component2()).booleanValue() && futureChatBean != null) {
                this.$onSuccess.invoke(FuturePositionBean.copy$default(this.$item, null, true, null, futureChatBean.getKlineList(), futureChatBean.getBuySellMarkerList(), false, 5, null));
            } else {
                FuturePositionBean.copy$default(this.$item, null, false, null, null, null, false, 31, null);
                this.$onError.invoke("Failed to load chart data");
            }
        } catch (Exception e) {
            FuturePositionBean.copy$default(this.$item, null, false, null, null, null, false, 31, null);
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

package com.okinc.planet.biz_plugin.spot;

import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45944tCa;
import o.C56391yDq;
import o.C56442yFn;
import o.tDE;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotHoldingsViewModel$fetchAndUpdateChatData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SpotHoldingBean $item;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function1<SpotHoldingBean, Unit> $onSuccess;
    int label;
    final /* synthetic */ tDE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpotHoldingsViewModel$fetchAndUpdateChatData$1(tDE tde, SpotHoldingBean spotHoldingBean, Function1<? super SpotHoldingBean, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super SpotHoldingsViewModel$fetchAndUpdateChatData$1> continuation) {
        super(2, continuation);
        this.this$0 = tde;
        this.$item = spotHoldingBean;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotHoldingsViewModel$fetchAndUpdateChatData$1(this.this$0, this.$item, this.$onSuccess, this.$onError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotHoldingsViewModel$fetchAndUpdateChatData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C45944tCa c45944tCa = this.this$0.KWHzl;
                String instId = this.$item.getTradeAssetPlanetBean().getInstId();
                String str = instId == null ? "" : instId;
                String instType = this.$item.getTradeAssetPlanetBean().getInstType();
                String str2 = instType == null ? "" : instType;
                String cTimestamp = this.$item.getTradeAssetPlanetBean().getCTimestamp();
                String pluginDataTime = this.$item.getPluginDataTime();
                this.label = 1;
                obj = c45944tCa.AEQbTJ(str, str2, cTimestamp, pluginDataTime, this);
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
            List list = (List) pair.component1();
            if (!((Boolean) pair.component2()).booleanValue()) {
                this.this$0.AEQbTJ(this.$item.getTradeAssetPlanetBean().getInstId());
                this.$onError.invoke("Failed to load chart data");
            } else {
                SpotHoldingBean spotHoldingBeanCopy$default = SpotHoldingBean.copy$default(this.$item, null, true, null, list, false, 5, null);
                this.this$0.EZpvd(spotHoldingBeanCopy$default);
                this.$onSuccess.invoke(spotHoldingBeanCopy$default);
            }
        } catch (Exception e) {
            this.this$0.AEQbTJ(this.$item.getTradeAssetPlanetBean().getInstId());
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

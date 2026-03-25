package com.okinc.unify_trade.trade.position;

import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC58184ywW;
import o.xOE;
import o.xOJ;

/* JADX INFO: loaded from: classes24.dex */
public final class TradePositionManagerV2$getPositions$1$1$onResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TradeUserPositionInfo> $accList;
    final /* synthetic */ InterfaceC58184ywW<Triple<Boolean, List<TradePositionManager.PositionItem>, String>> $emitter;
    final /* synthetic */ String $origin;
    final /* synthetic */ List<TradePositionData> $resp;
    int label;
    final /* synthetic */ xOE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradePositionManagerV2$getPositions$1$1$onResult$1(xOE xoe, List<TradePositionData> list, InterfaceC58184ywW<Triple<Boolean, List<TradePositionManager.PositionItem>, String>> interfaceC58184ywW, List<TradeUserPositionInfo> list2, String str, Continuation<? super TradePositionManagerV2$getPositions$1$1$onResult$1> continuation) {
        super(2, continuation);
        this.this$0 = xoe;
        this.$resp = list;
        this.$emitter = interfaceC58184ywW;
        this.$accList = list2;
        this.$origin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradePositionManagerV2$getPositions$1$1$onResult$1(this.this$0, this.$resp, this.$emitter, this.$accList, this.$origin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradePositionManagerV2$getPositions$1$1$onResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xOE xoe = this.this$0;
                List<TradePositionData> list = this.$resp;
                this.label = 1;
                if (xoe.KWHzl(list, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            TradePositionManager.Companion.AEQbTJ("onNext");
            this.$emitter.onNext(new Triple<>(C56443yFo.KWHzl(true), xOJ.AEQbTJ.EZpvd(this.$resp, this.$accList), this.$origin));
        } catch (Exception e) {
            TradePositionManager.Companion.AEQbTJ("onError :" + e.getMessage());
            this.$emitter.onNext(new Triple<>(C56443yFo.KWHzl(false), new ArrayList(), this.$origin));
        }
        return Unit.INSTANCE;
    }
}

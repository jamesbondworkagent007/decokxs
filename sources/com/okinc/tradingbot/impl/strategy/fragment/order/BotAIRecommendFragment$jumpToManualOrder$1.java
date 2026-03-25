package com.okinc.tradingbot.impl.strategy.fragment.order;

import androidx.fragment.app.FragmentActivity;
import com.okinc.tradelite.bean.TradeProductId;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49505upn;
import o.wIG;

/* JADX INFO: loaded from: classes19.dex */
public final class BotAIRecommendFragment$jumpToManualOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SmartRecommendResp $resp;
    int label;
    final /* synthetic */ wIG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAIRecommendFragment$jumpToManualOrder$1(wIG wig, SmartRecommendResp smartRecommendResp, Continuation<? super BotAIRecommendFragment$jumpToManualOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = wig;
        this.$resp = smartRecommendResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotAIRecommendFragment$jumpToManualOrder$1(this.this$0, this.$resp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotAIRecommendFragment$jumpToManualOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49505upn interfaceC49505upnCopydefault = this.this$0.copydefault();
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            TradeProductId tradeProductIdCopydefault = this.this$0.dxcTrN().copydefault(this.this$0.valueOf());
            this.label = 1;
            obj = interfaceC49505upnCopydefault.KWHzl(fragmentActivityRequireActivity, tradeProductIdCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.EZpvd(this.$resp);
        }
        return Unit.INSTANCE;
    }
}

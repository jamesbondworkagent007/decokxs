package com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment;

import androidx.fragment.app.FragmentActivity;
import com.okinc.tradelite.bean.TradeProductId;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C53273wiQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49505upn;

/* JADX INFO: loaded from: classes16.dex */
public final class SpotDcaManualFragment$initListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SmartRecommendResp> $it;
    int label;
    final /* synthetic */ C53273wiQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaManualFragment$initListener$1$1(C53273wiQ c53273wiQ, List<SmartRecommendResp> list, Continuation<? super SpotDcaManualFragment$initListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c53273wiQ;
        this.$it = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotDcaManualFragment$initListener$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDcaManualFragment$initListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49505upn interfaceC49505upn = (InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class);
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            TradeProductId tradeProductId = TradeProductId.SPOT_DCA;
            this.label = 1;
            obj = interfaceC49505upn.KWHzl(fragmentActivityRequireActivity, tradeProductId, this);
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
            this.this$0.copydefault((List<SmartRecommendResp>) this.$it);
        }
        return Unit.INSTANCE;
    }
}

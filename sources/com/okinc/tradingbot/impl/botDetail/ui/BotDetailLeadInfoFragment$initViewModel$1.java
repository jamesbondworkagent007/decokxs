package com.okinc.tradingbot.impl.botDetail.ui;

import androidx.fragment.app.Fragment;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.uHE;

/* JADX INFO: loaded from: classes16.dex */
public final class BotDetailLeadInfoFragment$initViewModel$1 extends SuspendLambda implements Function2<BotLeadProfitProfitOrderDetails, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uHE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotDetailLeadInfoFragment$initViewModel$1(uHE uhe, Continuation<? super BotDetailLeadInfoFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = uhe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotDetailLeadInfoFragment$initViewModel$1 botDetailLeadInfoFragment$initViewModel$1 = new BotDetailLeadInfoFragment$initViewModel$1(this.this$0, continuation);
        botDetailLeadInfoFragment$initViewModel$1.L$0 = obj;
        return botDetailLeadInfoFragment$initViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails, Continuation<? super Unit> continuation) {
        return ((BotDetailLeadInfoFragment$initViewModel$1) create(botLeadProfitProfitOrderDetails, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ((BotLeadProfitProfitOrderDetails) this.L$0);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

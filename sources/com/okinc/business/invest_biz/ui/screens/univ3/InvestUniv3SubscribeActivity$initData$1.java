package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23732iHg;
import o.C27532jwv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$initData$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$initData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestUniv3SubscribeActivity investUniv3SubscribeActivity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = this.this$0.isConnected();
            this.label = 1;
            obj = investUniv3SubscribeViewModelIsConnected.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                investUniv3SubscribeActivity = (InvestUniv3SubscribeActivity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                investUniv3SubscribeActivity.values();
                investUniv3SubscribeActivity.sSMYrx();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) obj;
        if (investUniv3SubscribeInfo != null) {
            InvestUniv3SubscribeActivity investUniv3SubscribeActivity2 = this.this$0;
            C23732iHg c23732iHg = investUniv3SubscribeActivity2.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            C27532jwv c27532jwv = c23732iHg.DXXBbs;
            Intrinsics.checkNotNullExpressionValue(c27532jwv, "");
            c27532jwv.setVisibility(investUniv3SubscribeInfo.getSupportZap() ? 0 : 8);
            investUniv3SubscribeActivity2.AuCTelauCTel();
            investUniv3SubscribeActivity2.AubY();
            investUniv3SubscribeActivity2.fIwbmz = true;
            if (investUniv3SubscribeActivity2.wlaJM.length() == 0) {
                this.L$0 = investUniv3SubscribeActivity2;
                this.label = 2;
                if (investUniv3SubscribeActivity2.copydefault(investUniv3SubscribeInfo, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                investUniv3SubscribeActivity = investUniv3SubscribeActivity2;
                investUniv3SubscribeActivity.values();
                investUniv3SubscribeActivity.sSMYrx();
            } else {
                investUniv3SubscribeActivity2.zsXlph();
            }
        }
        return Unit.INSTANCE;
    }
}

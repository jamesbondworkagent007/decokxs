package com.okinc.business.invest_biz.app.serviceimpl;

import com.okinc.business.invest_api.bean.DeFiRedeemParam;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C26700jhK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25423iwT;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestServiceApiImpl$doRedeem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ DeFiRedeemParam $params;
    final /* synthetic */ InterfaceC25423iwT $redeemCallback;
    final /* synthetic */ C26700jhK $redeemHandler;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestServiceApiImpl$doRedeem$1(C26700jhK c26700jhK, AbstractActivityC33041mov abstractActivityC33041mov, DeFiRedeemParam deFiRedeemParam, InterfaceC25423iwT interfaceC25423iwT, Continuation<? super InvestServiceApiImpl$doRedeem$1> continuation) {
        super(2, continuation);
        this.$redeemHandler = c26700jhK;
        this.$activity = abstractActivityC33041mov;
        this.$params = deFiRedeemParam;
        this.$redeemCallback = interfaceC25423iwT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestServiceApiImpl$doRedeem$1(this.$redeemHandler, this.$activity, this.$params, this.$redeemCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestServiceApiImpl$doRedeem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26700jhK c26700jhK = this.$redeemHandler;
            AbstractActivityC33041mov abstractActivityC33041mov = this.$activity;
            DeFiRedeemParam deFiRedeemParam = this.$params;
            InterfaceC25423iwT interfaceC25423iwT = this.$redeemCallback;
            this.label = 1;
            if (c26700jhK.copydefault(abstractActivityC33041mov, deFiRedeemParam, interfaceC25423iwT, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

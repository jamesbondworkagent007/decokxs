package com.okinc.business.dex.trade.copytrading.home.ui;

import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingWalletPageStrategiesVM;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C19979gWk;
import o.C19983gWo;
import o.C23274hvD;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPageCopyTradingStrategiesFragment$toggleStrategyStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C19983gWo $strategy;
    int label;
    final /* synthetic */ C19979gWk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPageCopyTradingStrategiesFragment$toggleStrategyStatus$1(C19979gWk c19979gWk, C19983gWo c19983gWo, Continuation<? super WalletPageCopyTradingStrategiesFragment$toggleStrategyStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = c19979gWk;
        this.$strategy = c19983gWo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPageCopyTradingStrategiesFragment$toggleStrategyStatus$1(this.this$0, this.$strategy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPageCopyTradingStrategiesFragment$toggleStrategyStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVMAYXKKw = this.this$0.AYXKKw();
            String strOLrzqt = this.$strategy.OLrzqt();
            this.label = 1;
            obj = copyTradingWalletPageStrategiesVMAYXKKw.OLrzqt(strOLrzqt, this);
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
            this.this$0.AYXKKw().AEQbTJ(new Triple<>(this.$strategy.valueOf(), this.$strategy.gEmmrt(), this.$strategy.OLrzqt()));
            return Unit.INSTANCE;
        }
        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.QMuEJi, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }
}

package com.okinc.business.invest_biz.ui.screens.univ3;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel$settleTransaction$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C24174iXq;
import o.C27493jwI;
import o.C56391yDq;
import o.C56442yFn;
import o.iXD;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3RedeemViewModel$settleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3RedeemViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3RedeemViewModel$settleTransaction$1(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, Continuation<? super InvestUniv3RedeemViewModel$settleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3RedeemViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3RedeemViewModel$settleTransaction$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3RedeemViewModel$settleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TransactionStep transactionStepKWHzl = C24174iXq.KWHzl(this.this$0.AYXKKw().getValue());
            if (this.this$0.aKErDB() == null || this.this$0.AYXKKw == null || transactionStepKWHzl == null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
                iXD.TaskDescription taskDescription = new iXD.TaskDescription(new OKServerException(0, "missing info.", null, null, 13, null), null, 2, null);
                this.label = 1;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStepKWHzl.valueOf())) {
                    final InvestUniv3RedeemViewModel investUniv3RedeemViewModel = this.this$0;
                    investUniv3RedeemViewModel.copydefault(new Function0() { // from class: o.jlh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return InvestUniv3RedeemViewModel$settleTransaction$1.invokeSuspend$lambda$0(investUniv3RedeemViewModel);
                        }
                    });
                } else {
                    final Boolean value = this.this$0.wlaJM().getValue();
                    final InvestUniv3RedeemViewModel investUniv3RedeemViewModel2 = this.this$0;
                    investUniv3RedeemViewModel2.OLrzqt(new Function2<Boolean, Boolean, Unit>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel$settleTransaction$1.3
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function2
                        public /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
                            KWHzl(bool.booleanValue(), bool2.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public void KWHzl(boolean z, boolean z2) {
                            if (z) {
                                if (Intrinsics.EZpvd(value, investUniv3RedeemViewModel2.wlaJM().getValue())) {
                                    investUniv3RedeemViewModel2.AEQbTJ();
                                } else {
                                    C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(investUniv3RedeemViewModel2), null, null, new InvestUniv3RedeemViewModel$settleTransaction$1$2$invoke$1(investUniv3RedeemViewModel2, null), 3, null);
                                }
                            }
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(InvestUniv3RedeemViewModel investUniv3RedeemViewModel) {
        investUniv3RedeemViewModel.AEQbTJ();
        return Unit.INSTANCE;
    }
}

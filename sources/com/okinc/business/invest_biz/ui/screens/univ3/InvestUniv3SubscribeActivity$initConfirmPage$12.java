package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3CurrentPriceViewMode;
import java.math.BigDecimal;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23732iHg;
import o.C23955iPn;
import o.C27271jrz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3SubscribeActivity$initConfirmPage$12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$initConfirmPage$12(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$initConfirmPage$12> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$initConfirmPage$12(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$initConfirmPage$12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<BigDecimal> mutableStateFlowEjfBZ = this.this$0.isConnected().ejfBZ();
            final InvestUniv3SubscribeActivity investUniv3SubscribeActivity = this.this$0;
            FlowCollector<? super BigDecimal> flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$initConfirmPage$12.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
                    C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
                    C23732iHg c23732iHg2 = null;
                    if (c23732iHg == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg = null;
                    }
                    c23732iHg.iZzfmt.KWHzl(InvestUniv3CurrentPriceViewMode.V2);
                    InvestTokenWithAmount fieldNames = investUniv3SubscribeActivity.ejfBZ() ? investUniv3SubscribeActivity.isConnected().getFieldNames() : investUniv3SubscribeActivity.isConnected().RcXXUw();
                    if (fieldNames == null) {
                        return Unit.INSTANCE;
                    }
                    InvestTokenWithAmount investTokenWithAmountRcXXUw = investUniv3SubscribeActivity.ejfBZ() ? investUniv3SubscribeActivity.isConnected().RcXXUw() : investUniv3SubscribeActivity.isConnected().getFieldNames();
                    if (investTokenWithAmountRcXXUw != null) {
                        C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
                        if (c23732iHg3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c23732iHg2 = c23732iHg3;
                        }
                        C27271jrz c27271jrz = c23732iHg2.iZzfmt;
                        String plainString = investUniv3SubscribeActivity.isConnected().ejfBZ().getValue().toPlainString();
                        Intrinsics.checkNotNullExpressionValue(plainString, "");
                        c27271jrz.setData(new C23955iPn(plainString, investTokenWithAmountRcXXUw.getTokenSymbol(), fieldNames.getTokenSymbol(), false, false, 0));
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (mutableStateFlowEjfBZ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}

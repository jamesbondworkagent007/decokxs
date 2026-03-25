package com.okinc.business.invest_biz.ui.screens.product_details.tab.handler;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26573jeq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25526iyQ;
import o.InterfaceC26561jee;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductDetailsTransactionHandler$proceedToMakeTransaction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $complete;
    final /* synthetic */ boolean $isInvesting;
    final /* synthetic */ ProductDetailsByChain $params;
    int label;
    final /* synthetic */ C26573jeq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsTransactionHandler$proceedToMakeTransaction$2(boolean z, C26573jeq c26573jeq, ProductDetailsByChain productDetailsByChain, Function0<Unit> function0, Continuation<? super ProductDetailsTransactionHandler$proceedToMakeTransaction$2> continuation) {
        super(2, continuation);
        this.$isInvesting = z;
        this.this$0 = c26573jeq;
        this.$params = productDetailsByChain;
        this.$complete = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductDetailsTransactionHandler$proceedToMakeTransaction$2(this.$isInvesting, this.this$0, this.$params, this.$complete, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProductDetailsTransactionHandler$proceedToMakeTransaction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isInvesting) {
                InterfaceC25526iyQ interfaceC25526iyQ = this.this$0.valueOf;
                long jOLrzqt = this.$params.OLrzqt();
                InvestmentKind investmentKindKWHzl = this.$params.KWHzl();
                ProductDetailsUserTradeAction productDetailsUserTradeActionAhwBna = this.$params.AhwBna();
                this.label = 1;
                objAEQbTJ = interfaceC25526iyQ.OLrzqt(jOLrzqt, investmentKindKWHzl, productDetailsUserTradeActionAhwBna, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                InterfaceC25526iyQ interfaceC25526iyQ2 = this.this$0.valueOf;
                long jOLrzqt2 = this.$params.OLrzqt();
                InvestmentKind investmentKindKWHzl2 = this.$params.KWHzl();
                this.label = 2;
                objAEQbTJ = interfaceC25526iyQ2.AEQbTJ(jOLrzqt2, investmentKindKWHzl2, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C26573jeq c26573jeq = this.this$0;
        boolean z = this.$isInvesting;
        Function0<Unit> function0 = this.$complete;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            c26573jeq.EZpvd((InterfaceC26561jee) objAEQbTJ, z);
            function0.invoke();
        }
        Function0<Unit> function02 = this.$complete;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            function02.invoke();
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}

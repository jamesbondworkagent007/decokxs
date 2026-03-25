package com.okinc.business.invest_biz.mln;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$supply$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.Supply;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.AbstractActivityC33041mov;
import o.C26573jeq;
import o.C56391yDq;
import o.C56442yFn;
import o.iNZ;

/* JADX INFO: loaded from: classes15.dex */
public final class DeFiLuaTransactionHostAdapter$supply$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $investmentId;
    int label;
    final /* synthetic */ iNZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiLuaTransactionHostAdapter$supply$1(Long l, iNZ inz, Continuation<? super DeFiLuaTransactionHostAdapter$supply$1> continuation) {
        super(1, continuation);
        this.$investmentId = l;
        this.this$0 = inz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DeFiLuaTransactionHostAdapter$supply$1(this.$investmentId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((DeFiLuaTransactionHostAdapter$supply$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Long l = this.$investmentId;
            long jLongValue = l != null ? l.longValue() : 0L;
            InvestmentKind investmentKindOLrzqt = this.this$0.djBIcL.OLrzqt();
            Long lEZpvd = this.this$0.djBIcL.EZpvd();
            long jLongValue2 = lEZpvd != null ? lEZpvd.longValue() : 0L;
            String strAEQbTJ = this.this$0.djBIcL.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            ChainInfo chainInfo = new ChainInfo(jLongValue2, strAEQbTJ, null, null, null, 28, null);
            Long l2 = this.$investmentId;
            ProductDetailsByChain productDetailsByChain = new ProductDetailsByChain(jLongValue, investmentKindOLrzqt, chainInfo, false, null, new Supply(l2 != null ? l2.longValue() : 0L, this.this$0.djBIcL.copydefault()), null, false, 216, null);
            C26573jeq c26573jeq = this.this$0.AhwBna;
            if (c26573jeq != null) {
                final iNZ inz = this.this$0;
                Function0<Unit> function0 = new Function0() { // from class: o.iOe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DeFiLuaTransactionHostAdapter$supply$1.invokeSuspend$lambda$0(inz);
                    }
                };
                this.label = 1;
                if (c26573jeq.AEQbTJ(productDetailsByChain, true, function0, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
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
    public static final Unit invokeSuspend$lambda$0(iNZ inz) {
        AbstractActivityC33041mov abstractActivityC33041mov = inz.AEQbTJ;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        return Unit.INSTANCE;
    }
}

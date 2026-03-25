package com.okinc.business.invest_biz.ui.screens.product_details.bonus_info;

import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26500jdW;
import o.iEM;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsBonusInfoViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ ProductDetailsBonusInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBonusInfoViewModel$loadData$1(ProductDetailsBonusInfoViewModel productDetailsBonusInfoViewModel, long j, Continuation<? super ProductDetailsBonusInfoViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = productDetailsBonusInfoViewModel;
        this.$investmentId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductDetailsBonusInfoViewModel$loadData$1(this.this$0, this.$investmentId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProductDetailsBonusInfoViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iEM iem = this.this$0.AEQbTJ;
            long j = this.$investmentId;
            this.label = 1;
            objKWHzl = iem.KWHzl(j, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        ProductDetailsBonusInfoViewModel productDetailsBonusInfoViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            productDetailsBonusInfoViewModel.OLrzqt().setValue(new InterfaceC26500jdW.StateListAnimator(productDetailsBonusInfoViewModel.OLrzqt.KWHzl((InvestmentBonusInfo) objKWHzl)));
        }
        ProductDetailsBonusInfoViewModel productDetailsBonusInfoViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            productDetailsBonusInfoViewModel2.OLrzqt().setValue(InterfaceC26500jdW.TaskDescription.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}

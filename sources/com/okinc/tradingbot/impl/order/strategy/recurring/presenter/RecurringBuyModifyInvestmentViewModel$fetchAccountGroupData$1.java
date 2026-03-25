package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.network.okg.cache.CacheStrategy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C48159uHd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CacheStrategy $cacheStrategy;
    final /* synthetic */ String $currencyId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecurringBuyModifyInvestmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, String str, CacheStrategy cacheStrategy, Continuation<? super RecurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyModifyInvestmentViewModel;
        this.$currencyId = str;
        this.$cacheStrategy = cacheStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1 recurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1 = new RecurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1(this.this$0, this.$currencyId, this.$cacheStrategy, continuation);
        recurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1.L$0 = obj;
        return recurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel2 = this.this$0;
                String str = this.$currencyId;
                CacheStrategy cacheStrategy = this.$cacheStrategy;
                Result.Application application = Result.Companion;
                C48159uHd c48159uHdAuCTelauCTel = recurringBuyModifyInvestmentViewModel2.AuCTelauCTel();
                C48159uHd.Application application2 = new C48159uHd.Application("recurring", str, cacheStrategy);
                this.L$0 = recurringBuyModifyInvestmentViewModel2;
                this.label = 1;
                Object objKWHzl = c48159uHdAuCTelauCTel.KWHzl(application2, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                recurringBuyModifyInvestmentViewModel = recurringBuyModifyInvestmentViewModel2;
                obj = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                recurringBuyModifyInvestmentViewModel = (RecurringBuyModifyInvestmentViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            recurringBuyModifyInvestmentViewModel.AEQbTJ.setValue(((C48159uHd.ActionBar) obj).copydefault());
            recurringBuyModifyInvestmentViewModel.OLrzqt.setValue(C56443yFo.KWHzl(false));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            recurringBuyModifyInvestmentViewModel3.OLrzqt.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}

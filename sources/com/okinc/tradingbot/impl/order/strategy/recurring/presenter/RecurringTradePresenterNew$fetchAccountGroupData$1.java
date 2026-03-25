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

/* JADX INFO: loaded from: classes19.dex */
public final class RecurringTradePresenterNew$fetchAccountGroupData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CacheStrategy $cacheStrategy;
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecurringTradePresenterNew this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringTradePresenterNew$fetchAccountGroupData$1(RecurringTradePresenterNew recurringTradePresenterNew, String str, CacheStrategy cacheStrategy, Continuation<? super RecurringTradePresenterNew$fetchAccountGroupData$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringTradePresenterNew;
        this.$id = str;
        this.$cacheStrategy = cacheStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringTradePresenterNew$fetchAccountGroupData$1 recurringTradePresenterNew$fetchAccountGroupData$1 = new RecurringTradePresenterNew$fetchAccountGroupData$1(this.this$0, this.$id, this.$cacheStrategy, continuation);
        recurringTradePresenterNew$fetchAccountGroupData$1.L$0 = obj;
        return recurringTradePresenterNew$fetchAccountGroupData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringTradePresenterNew$fetchAccountGroupData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        RecurringTradePresenterNew recurringTradePresenterNew;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RecurringTradePresenterNew recurringTradePresenterNew2 = this.this$0;
                String str = this.$id;
                CacheStrategy cacheStrategy = this.$cacheStrategy;
                Result.Application application = Result.Companion;
                C48159uHd c48159uHdOLrzqt = recurringTradePresenterNew2.OLrzqt();
                C48159uHd.Application application2 = new C48159uHd.Application("recurring", str, cacheStrategy);
                this.L$0 = recurringTradePresenterNew2;
                this.label = 1;
                Object objKWHzl = c48159uHdOLrzqt.KWHzl(application2, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                recurringTradePresenterNew = recurringTradePresenterNew2;
                obj = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                recurringTradePresenterNew = (RecurringTradePresenterNew) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            recurringTradePresenterNew.EZpvd().postValue(((C48159uHd.ActionBar) obj).copydefault());
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return Unit.INSTANCE;
    }
}

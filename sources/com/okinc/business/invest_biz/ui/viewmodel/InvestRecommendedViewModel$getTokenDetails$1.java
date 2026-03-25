package com.okinc.business.invest_biz.ui.viewmodel;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27103joq;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.iGF;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRecommendedViewModel$getTokenDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Long> $investmentIds;
    Object L$0;
    int label;
    final /* synthetic */ C27103joq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRecommendedViewModel$getTokenDetails$1(List<Long> list, C27103joq c27103joq, Continuation<? super InvestRecommendedViewModel$getTokenDetails$1> continuation) {
        super(2, continuation);
        this.$investmentIds = list;
        this.this$0 = c27103joq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestRecommendedViewModel$getTokenDetails$1(this.$investmentIds, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestRecommendedViewModel$getTokenDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$investmentIds.isEmpty()) {
                iGF igf = this.this$0.KWHzl;
                List<Long> list = this.$investmentIds;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C33129mqd.gEmmrt(C56443yFo.KWHzl(((Number) it.next()).longValue())));
                }
                this.label = 1;
                objKWHzl = igf.KWHzl(arrayList, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                C27103joq c27103joq = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            obj2 = objKWHzl;
            C27103joq c27103joq2 = this.this$0;
            if (Result.m7384isSuccessimpl(obj2)) {
                MutableStateFlow mutableStateFlow = c27103joq2.OLrzqt;
                List<TokenInvestDetail> listOLrzqt = ((TokenInvestDetailResponse) obj2).OLrzqt();
                this.L$0 = obj2;
                this.label = 2;
                if (mutableStateFlow.emit(listOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            obj2 = this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C27103joq c27103joq3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(obj2) != null) {
            MutableStateFlow mutableStateFlow2 = c27103joq3.OLrzqt;
            this.L$0 = obj2;
            this.label = 3;
            if (mutableStateFlow2.emit(null, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.invest_biz.ui.screens.token_selection.view_model;

import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C26663jga;
import o.C56391yDq;
import o.C56442yFn;
import o.iDA;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTokenSelectionViewModel$loadInitialData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenSelectionParams $params;
    int label;
    final /* synthetic */ InvestTokenSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestTokenSelectionViewModel$loadInitialData$2(InvestTokenSelectionViewModel investTokenSelectionViewModel, TokenSelectionParams tokenSelectionParams, Continuation<? super InvestTokenSelectionViewModel$loadInitialData$2> continuation) {
        super(2, continuation);
        this.this$0 = investTokenSelectionViewModel;
        this.$params = tokenSelectionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestTokenSelectionViewModel$loadInitialData$2(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestTokenSelectionViewModel$loadInitialData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object value;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDA ida = this.this$0.AEQbTJ;
            long jEZpvd = this.$params.EZpvd();
            String strKWHzl = this.$params.KWHzl();
            long jCopydefault = this.$params.copydefault();
            this.label = 1;
            objAEQbTJ = ida.AEQbTJ(jEZpvd, strKWHzl, jCopydefault, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        InvestTokenSelectionViewModel investTokenSelectionViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            List list = (List) objAEQbTJ;
            MutableStateFlow mutableStateFlow = investTokenSelectionViewModel.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, new C26663jga(list, false, null)));
        }
        InvestTokenSelectionViewModel investTokenSelectionViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            MutableStateFlow mutableStateFlow2 = investTokenSelectionViewModel2.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, new C26663jga(null, false, thM7380exceptionOrNullimpl, 1, null)));
        }
        return Unit.INSTANCE;
    }
}

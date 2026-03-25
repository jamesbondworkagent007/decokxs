package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import com.okinc.market.common.bean.PayloadPeriod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25950jMj;
import o.C56391yDq;
import o.C56442yFn;
import o.jLZ;

/* JADX INFO: loaded from: classes18.dex */
public final class SpotAnalysisCumulativePnlFragment$viewModelCollect$4$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$viewModelCollect$4$1$2$1(jLZ jlz, Continuation<? super SpotAnalysisCumulativePnlFragment$viewModelCollect$4$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$viewModelCollect$4$1$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$viewModelCollect$4$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel;
        String str;
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel2;
        PayloadPeriod payload;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = this.this$0.DbNXlk();
            SpotAnalysisViewModel spotAnalysisViewModelValues = this.this$0.values();
            this.L$0 = spotAnalysisCumulativePnlViewModelDbNXlk;
            this.label = 1;
            Object objAEQbTJ = spotAnalysisViewModelValues.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            spotAnalysisCumulativePnlViewModel = spotAnalysisCumulativePnlViewModelDbNXlk;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                str = (String) this.L$1;
                spotAnalysisCumulativePnlViewModel2 = (SpotAnalysisCumulativePnlViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                payload = ((C25950jMj) obj).EZpvd().getPayload();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (spotAnalysisCumulativePnlViewModel2.EZpvd(str, payload, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            spotAnalysisCumulativePnlViewModel = (SpotAnalysisCumulativePnlViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str2 = (String) obj;
        jLZ jlz = this.this$0;
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk2 = jlz.DbNXlk();
        this.L$0 = spotAnalysisCumulativePnlViewModel;
        this.L$1 = str2;
        this.label = 2;
        Object objCopydefault2 = jlz.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk2, this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel3 = spotAnalysisCumulativePnlViewModel;
        str = str2;
        obj = objCopydefault2;
        spotAnalysisCumulativePnlViewModel2 = spotAnalysisCumulativePnlViewModel3;
        payload = ((C25950jMj) obj).EZpvd().getPayload();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (spotAnalysisCumulativePnlViewModel2.EZpvd(str, payload, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}

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
public final class RedeemTokenSelectionViewModel$reload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenSelectionParams $params;
    final /* synthetic */ String $searchTerm;
    int label;
    final /* synthetic */ RedeemTokenSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemTokenSelectionViewModel$reload$2(String str, RedeemTokenSelectionViewModel redeemTokenSelectionViewModel, TokenSelectionParams tokenSelectionParams, Continuation<? super RedeemTokenSelectionViewModel$reload$2> continuation) {
        super(2, continuation);
        this.$searchTerm = str;
        this.this$0 = redeemTokenSelectionViewModel;
        this.$params = tokenSelectionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedeemTokenSelectionViewModel$reload$2(this.$searchTerm, this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedeemTokenSelectionViewModel$reload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object value;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$searchTerm.length() == 0) {
                iDA ida = this.this$0.OLrzqt;
                long jEZpvd = this.$params.EZpvd();
                String strKWHzl = this.$params.KWHzl();
                long jCopydefault = this.$params.copydefault();
                this.label = 1;
                objOLrzqt = ida.KWHzl(jEZpvd, strKWHzl, jCopydefault, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                iDA ida2 = this.this$0.OLrzqt;
                long jEZpvd2 = this.$params.EZpvd();
                String strKWHzl2 = this.$params.KWHzl();
                String str = this.$searchTerm;
                this.label = 2;
                objOLrzqt = ida2.OLrzqt(jEZpvd2, strKWHzl2, str, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        RedeemTokenSelectionViewModel redeemTokenSelectionViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            List list = (List) objOLrzqt;
            MutableStateFlow mutableStateFlow = redeemTokenSelectionViewModel.copydefault;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, new C26663jga(list, false, null)));
        }
        RedeemTokenSelectionViewModel redeemTokenSelectionViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            MutableStateFlow mutableStateFlow2 = redeemTokenSelectionViewModel2.copydefault;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, new C26663jga(null, false, thM7380exceptionOrNullimpl, 1, null)));
        }
        return Unit.INSTANCE;
    }
}

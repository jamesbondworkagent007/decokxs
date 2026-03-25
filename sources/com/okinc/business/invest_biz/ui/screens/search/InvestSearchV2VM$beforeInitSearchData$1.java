package com.okinc.business.invest_biz.ui.screens.search;

import com.okinc.business.invest_biz.data.bean.InvestChip;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSearchV2VM$beforeInitSearchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InvestSearchV2VM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSearchV2VM$beforeInitSearchData$1(InvestSearchV2VM investSearchV2VM, Continuation<? super InvestSearchV2VM$beforeInitSearchData$1> continuation) {
        super(2, continuation);
        this.this$0 = investSearchV2VM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSearchV2VM$beforeInitSearchData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestSearchV2VM$beforeInitSearchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestChip investChipOLrzqt;
        InvestSearchV2VM investSearchV2VM;
        MutableStateFlow mutableStateFlow;
        List listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            investChipOLrzqt = this.this$0.OLrzqt();
            if (investChipOLrzqt != null) {
                InvestSearchV2VM investSearchV2VM2 = this.this$0;
                MutableStateFlow mutableStateFlow2 = investSearchV2VM2.OLrzqt;
                this.L$0 = investSearchV2VM2;
                this.L$1 = investChipOLrzqt;
                this.label = 1;
                if (mutableStateFlow2.emit(investChipOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
                investSearchV2VM = investSearchV2VM2;
                mutableStateFlow = investSearchV2VM.copydefault;
                listAhwBna = yDY.AhwBna(investChipOLrzqt);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (mutableStateFlow.emit(listAhwBna, this) == objCopydefault) {
                }
            }
        } else if (i == 1) {
            investChipOLrzqt = (InvestChip) this.L$1;
            investSearchV2VM = (InvestSearchV2VM) this.L$0;
            C56391yDq.AEQbTJ(obj);
            mutableStateFlow = investSearchV2VM.copydefault;
            listAhwBna = yDY.AhwBna(investChipOLrzqt);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (mutableStateFlow.emit(listAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.djBIcL();
        return Unit.INSTANCE;
    }
}

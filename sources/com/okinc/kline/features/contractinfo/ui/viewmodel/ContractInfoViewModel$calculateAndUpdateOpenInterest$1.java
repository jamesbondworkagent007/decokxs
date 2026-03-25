package com.okinc.kline.features.contractinfo.ui.viewmodel;

import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C54536xML;
import o.C54571xNh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoViewModel$calculateAndUpdateOpenInterest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ContractInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractInfoViewModel$calculateAndUpdateOpenInterest$1(ContractInfoViewModel contractInfoViewModel, Continuation<? super ContractInfoViewModel$calculateAndUpdateOpenInterest$1> continuation) {
        super(2, continuation);
        this.this$0 = contractInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractInfoViewModel$calculateAndUpdateOpenInterest$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractInfoViewModel$calculateAndUpdateOpenInterest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strCopydefault;
        C54571xNh c54571xNhAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54571xNh c54571xNh = this.this$0.AEQbTJ;
            if (c54571xNh == null || (c54571xNhAhwBna = c54571xNh.AhwBna(this.this$0.djBIcL)) == null) {
                strCopydefault = null;
            } else {
                String str = this.this$0.fARcdN;
                if (str == null) {
                    str = "";
                }
                strCopydefault = c54571xNhAhwBna.copydefault(str);
            }
            String str2 = new C54536xML().OLrzqt(C33129mqd.formatS$default(strCopydefault, C56443yFo.AEQbTJ(0), null, null, 6, null)) + " " + this.this$0.AuCTel;
            ContractInfoViewModel contractInfoViewModel = this.this$0;
            ContractInfoItemType contractInfoItemType = ContractInfoItemType.OPEN_INTEREST;
            this.label = 1;
            if (contractInfoViewModel.AEQbTJ(contractInfoItemType, str2, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.invest_biz.ui.screens.validator_selection.view_model;

import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorTrxType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27088job;
import o.C27090jod;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.iDH;

/* JADX INFO: loaded from: classes6.dex */
public final class ValidatorSelectionViewModel$loadValidators$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ValidatorSelectionParams $params;
    int label;
    final /* synthetic */ ValidatorSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidatorSelectionViewModel$loadValidators$2(ValidatorSelectionViewModel validatorSelectionViewModel, ValidatorSelectionParams validatorSelectionParams, Continuation<? super ValidatorSelectionViewModel$loadValidators$2> continuation) {
        super(2, continuation);
        this.this$0 = validatorSelectionViewModel;
        this.$params = validatorSelectionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ValidatorSelectionViewModel$loadValidators$2(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ValidatorSelectionViewModel$loadValidators$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object value;
        Object value2;
        ArrayList arrayList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.this$0.OLrzqt.gEmmrt().OLrzqt(((InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AuCTelauCTel(this.this$0.OLrzqt.gEmmrt().copydefault())).DbNXlk());
            String strEZpvd = interfaceC9738bbJOLrzqt != null ? interfaceC9738bbJOLrzqt.EZpvd(this.$params.copydefault()) : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            ValidatorRequestParam validatorRequestParam = new ValidatorRequestParam(this.$params.KWHzl(), this.$params.EZpvd() == ValidatorTrxType.REDEEM ? 2 : 1, strEZpvd);
            iDH idh = this.this$0.copydefault;
            this.label = 1;
            objEZpvd = idh.EZpvd(validatorRequestParam, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        ValidatorSelectionViewModel validatorSelectionViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            List list = (List) objEZpvd;
            MutableStateFlow mutableStateFlow = validatorSelectionViewModel.EZpvd;
            do {
                value2 = mutableStateFlow.getValue();
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C27090jod.Companion.copydefault((InvestValidatorListItems) it.next()));
                }
            } while (!mutableStateFlow.compareAndSet(value2, new C27088job(arrayList, false, null)));
        }
        ValidatorSelectionViewModel validatorSelectionViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow2 = validatorSelectionViewModel2.EZpvd;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, new C27088job(null, false, thM7380exceptionOrNullimpl, 1, null)));
        }
        return Unit.INSTANCE;
    }
}

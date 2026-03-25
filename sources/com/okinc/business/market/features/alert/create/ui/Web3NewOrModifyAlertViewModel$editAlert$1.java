package com.okinc.business.market.features.alert.create.ui;

import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertPromptType;
import com.okinc.business.market.data.model.alert.AlertRepeatType;
import com.okinc.business.market.data.model.alert.AlertType;
import com.okinc.business.market.data.model.alert.EditAlertRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.jGT;
import o.jGX;
import o.xVW;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3NewOrModifyAlertViewModel$editAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jGX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3NewOrModifyAlertViewModel$editAlert$1(jGX jgx, Continuation<? super Web3NewOrModifyAlertViewModel$editAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = jgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3NewOrModifyAlertViewModel$editAlert$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3NewOrModifyAlertViewModel$editAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AlertType alertTypeCopydefault;
        EditAlertRequest editAlertRequest;
        jGX jgx;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!(this.this$0.copydefault.getValue() instanceof jGT.Fragment)) {
                MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, jGT.Activity.EZpvd));
                return Unit.INSTANCE;
            }
            Object value3 = this.this$0.copydefault.getValue();
            Intrinsics.copydefault(value3, "");
            jGT.Fragment fragment = (jGT.Fragment) value3;
            this.this$0.valueOf = fragment;
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, jGT.ActionBar.KWHzl));
            jGX jgx2 = this.this$0;
            AlertDataUiItem alertDataUiItem = jgx2.AkhnZx;
            if (alertDataUiItem == null || (alertTypeCopydefault = alertDataUiItem.AEQbTJ()) == null) {
                alertTypeCopydefault = fragment.copydefault();
            }
            AlertType alertType = alertTypeCopydefault;
            AlertDataUiItem alertDataUiItem2 = this.this$0.AkhnZx;
            int iAhwBna = C33129mqd.AhwBna(alertDataUiItem2 != null ? alertDataUiItem2.OLrzqt() : null);
            AlertPromptType alertPromptTypeEZpvd = fragment.EZpvd();
            String strOLrzqt = fragment.OLrzqt();
            AlertRepeatType alertRepeatTypeAEQbTJ = fragment.AEQbTJ();
            String strCopydefault = xVW.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            editAlertRequest = new EditAlertRequest(alertType, iAhwBna, alertPromptTypeEZpvd, strOLrzqt, alertRepeatTypeAEQbTJ, strCopydefault);
            jGX jgx3 = this.this$0;
            this.L$0 = editAlertRequest;
            this.L$1 = jgx2;
            this.label = 1;
            if (jgx3.AEQbTJ(editAlertRequest, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            jgx = jgx2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jgx = (jGX) this.L$1;
            editAlertRequest = (EditAlertRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        jgx.AYXKKw = editAlertRequest;
        return Unit.INSTANCE;
    }
}

package com.okinc.business.market.features.alert.create.ui;

import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertDeleteRequest;
import com.okinc.business.market.data.model.alert.AlertType;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25802jGx;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.jGT;
import o.jGX;
import o.xVW;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3NewOrModifyAlertViewModel$deleteAlert$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AlertDataUiItem $currentAlert;
    int label;
    final /* synthetic */ jGX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3NewOrModifyAlertViewModel$deleteAlert$1$1(jGX jgx, AlertDataUiItem alertDataUiItem, Continuation<? super Web3NewOrModifyAlertViewModel$deleteAlert$1$1> continuation) {
        super(2, continuation);
        this.this$0 = jgx;
        this.$currentAlert = alertDataUiItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3NewOrModifyAlertViewModel$deleteAlert$1$1(this.this$0, this.$currentAlert, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3NewOrModifyAlertViewModel$deleteAlert$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AlertDeleteRequest alertDeleteRequest;
        Object objOLrzqt;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jGX jgx = this.this$0;
            Object value4 = jgx.copydefault.getValue();
            jgx.valueOf = value4 instanceof jGT.Fragment ? (jGT.Fragment) value4 : null;
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, jGT.ActionBar.KWHzl));
            if (this.$currentAlert.AEQbTJ() == AlertType.PRICE) {
                List listEZpvd = C56402yEa.EZpvd(C56443yFo.AEQbTJ(C33129mqd.AhwBna(this.$currentAlert.OLrzqt())));
                List listAhwBna = yDY.AhwBna();
                String strCopydefault = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                alertDeleteRequest = new AlertDeleteRequest(listAhwBna, listEZpvd, strCopydefault);
            } else {
                List listAhwBna2 = yDY.AhwBna();
                List listEZpvd2 = C56402yEa.EZpvd(C56443yFo.AEQbTJ(C33129mqd.AhwBna(this.$currentAlert.OLrzqt())));
                String strCopydefault2 = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault2, "");
                alertDeleteRequest = new AlertDeleteRequest(listEZpvd2, listAhwBna2, strCopydefault2);
            }
            C25802jGx c25802jGx = this.this$0.gEmmrt;
            this.label = 1;
            objOLrzqt = c25802jGx.OLrzqt(alertDeleteRequest, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        jGX jgx2 = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            ((Number) objOLrzqt).intValue();
            MutableStateFlow mutableStateFlow2 = jgx2.copydefault;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, jGT.Application.AEQbTJ));
        }
        jGX jgx3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            MutableStateFlow mutableStateFlow3 = jgx3.copydefault;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, jGT.TaskDescription.OLrzqt));
        }
        return Unit.INSTANCE;
    }
}

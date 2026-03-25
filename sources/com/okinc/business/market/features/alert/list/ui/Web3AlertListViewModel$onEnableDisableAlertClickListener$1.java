package com.okinc.business.market.features.alert.list.ui;

import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertType;
import com.okinc.business.market.data.model.alert.EditAlertActiveRequest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25802jGx;
import o.C25813jHh;
import o.C25829jHx;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25830jHy;
import o.xVW;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3AlertListViewModel$onEnableDisableAlertClickListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AlertDataUiItem $alertDataUiItem;
    Object L$0;
    int label;
    final /* synthetic */ C25829jHx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3AlertListViewModel$onEnableDisableAlertClickListener$1(C25829jHx c25829jHx, AlertDataUiItem alertDataUiItem, Continuation<? super Web3AlertListViewModel$onEnableDisableAlertClickListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c25829jHx;
        this.$alertDataUiItem = alertDataUiItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3AlertListViewModel$onEnableDisableAlertClickListener$1(this.this$0, this.$alertDataUiItem, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3AlertListViewModel$onEnableDisableAlertClickListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        InterfaceC25830jHy.ActionBar actionBar;
        Object objM7386unboximpl;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object value4 = this.this$0.KWHzl.getValue();
            Intrinsics.copydefault(value4, "");
            InterfaceC25830jHy.ActionBar actionBar2 = (InterfaceC25830jHy.ActionBar) value4;
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new InterfaceC25830jHy.ActionBar.Fragment(actionBar2.EZpvd(), actionBar2.AEQbTJ())));
            C25802jGx c25802jGx = this.this$0.EZpvd;
            AlertType alertTypeAEQbTJ = this.$alertDataUiItem.AEQbTJ();
            int iAhwBna = C33129mqd.AhwBna(this.$alertDataUiItem.OLrzqt());
            boolean zEZpvd = this.$alertDataUiItem.EZpvd();
            String strCopydefault = xVW.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            EditAlertActiveRequest editAlertActiveRequest = new EditAlertActiveRequest(alertTypeAEQbTJ, strCopydefault, iAhwBna, !zEZpvd ? 1 : 0);
            this.L$0 = actionBar2;
            this.label = 1;
            Object objAEQbTJ = c25802jGx.AEQbTJ(editAlertActiveRequest, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            actionBar = actionBar2;
            objM7386unboximpl = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InterfaceC25830jHy.ActionBar) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        C25829jHx c25829jHx = this.this$0;
        AlertDataUiItem alertDataUiItem = this.$alertDataUiItem;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            ((Number) objM7386unboximpl).intValue();
            MutableStateFlow mutableStateFlow2 = c25829jHx.KWHzl;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, new InterfaceC25830jHy.ActionBar.C0856ActionBar(C25813jHh.copydefault(actionBar.EZpvd(), alertDataUiItem), actionBar.AEQbTJ())));
        }
        C25829jHx c25829jHx2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            MutableStateFlow mutableStateFlow3 = c25829jHx2.KWHzl;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, new InterfaceC25830jHy.ActionBar.StateListAnimator(actionBar.EZpvd(), actionBar.AEQbTJ())));
        }
        return Unit.INSTANCE;
    }
}

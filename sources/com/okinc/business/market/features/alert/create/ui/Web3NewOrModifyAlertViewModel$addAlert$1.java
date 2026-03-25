package com.okinc.business.market.features.alert.create.ui;

import com.okinc.business.market.data.model.alert.AlertCreateRequest;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$addAlert$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;
import o.jGT;
import o.jGX;
import o.xVW;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3NewOrModifyAlertViewModel$addAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jGX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3NewOrModifyAlertViewModel$addAlert$1(jGX jgx, Continuation<? super Web3NewOrModifyAlertViewModel$addAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = jgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3NewOrModifyAlertViewModel$addAlert$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3NewOrModifyAlertViewModel$addAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        final AlertCreateRequest alertCreateRequest;
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
            final jGT.Fragment fragment = (jGT.Fragment) value3;
            this.this$0.valueOf = fragment;
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, jGT.ActionBar.KWHzl));
            final TokenInfoForAlert tokenInfoForAlertAhwBna = fragment.AhwBna();
            jGX jgx2 = this.this$0;
            String strValueOf = tokenInfoForAlertAhwBna.valueOf();
            String strCopydefault = tokenInfoForAlertAhwBna.copydefault();
            String strCopydefault2 = xVW.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault2, "");
            alertCreateRequest = new AlertCreateRequest(strValueOf, strCopydefault, strCopydefault2, fragment.copydefault(), fragment.EZpvd(), fragment.OLrzqt(), fragment.AEQbTJ());
            jGX jgx3 = this.this$0;
            C32866mlf.onEvent$default("DEXMarket_Token_AlertApplyButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.jGV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return Web3NewOrModifyAlertViewModel$addAlert$1.invokeSuspend$lambda$3$lambda$2(alertCreateRequest, tokenInfoForAlertAhwBna, fragment, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            this.L$0 = alertCreateRequest;
            this.L$1 = jgx2;
            this.label = 1;
            if (jgx3.EZpvd(alertCreateRequest, tokenInfoForAlertAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
            jgx = jgx2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jgx = (jGX) this.L$1;
            alertCreateRequest = (AlertCreateRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        jgx.AhwBna = alertCreateRequest;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(AlertCreateRequest alertCreateRequest, TokenInfoForAlert tokenInfoForAlert, jGT.Fragment fragment, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "token_address", alertCreateRequest.AhwBna(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", tokenInfoForAlert.djBIcL(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "type", fragment.EZpvd().getTypeForTracking(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "interval", fragment.EZpvd().getIntervalForTracking(), false, 4, null);
        return Unit.INSTANCE;
    }
}

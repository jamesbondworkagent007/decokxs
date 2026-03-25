package com.okinc.business.market.features.alert.create.ui;

import com.okinc.business.market.data.model.alert.AlertRepeatType;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.jGT;
import o.jGX;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3NewOrModifyAlertViewModel$updateTokenInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenInfoForAlert $newTokenInfo;
    int label;
    final /* synthetic */ jGX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3NewOrModifyAlertViewModel$updateTokenInfo$1(jGX jgx, TokenInfoForAlert tokenInfoForAlert, Continuation<? super Web3NewOrModifyAlertViewModel$updateTokenInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = jgx;
        this.$newTokenInfo = tokenInfoForAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3NewOrModifyAlertViewModel$updateTokenInfo$1(this.this$0, this.$newTokenInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3NewOrModifyAlertViewModel$updateTokenInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        TokenInfoForAlert tokenInfoForAlert;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jGX jgx = this.this$0;
            TokenInfoForAlert tokenInfoForAlert2 = this.$newTokenInfo;
            this.label = 1;
            if (jgx.copydefault(tokenInfoForAlert2, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object value2 = this.this$0.copydefault.getValue();
        Intrinsics.copydefault(value2, "");
        jGT.Fragment fragment = (jGT.Fragment) value2;
        this.this$0.EZpvd(fragment.EZpvd());
        MutableStateFlow mutableStateFlow = this.this$0.copydefault;
        jGX jgx2 = this.this$0;
        TokenInfoForAlert tokenInfoForAlert3 = this.$newTokenInfo;
        do {
            value = mutableStateFlow.getValue();
            tokenInfoForAlert = jgx2.DbNXlk;
        } while (!mutableStateFlow.compareAndSet(value, new jGT.Fragment(tokenInfoForAlert == null ? tokenInfoForAlert3 : tokenInfoForAlert, fragment.copydefault(), fragment.EZpvd(), (String) jgx2.EZpvd.getValue(), "", AlertRepeatType.REPEAT, false, false, jgx2.EZpvd((String) jgx2.KWHzl.getValue()))));
        return Unit.INSTANCE;
    }
}

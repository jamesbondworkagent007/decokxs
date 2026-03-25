package com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.systemmessage;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.MsgSwitch;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C42606rZb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MsgSwitchUseCaseImpl$getMessageSwitchListOld$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MsgSwitch>>, Object> {
    int label;
    final /* synthetic */ C42606rZb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgSwitchUseCaseImpl$getMessageSwitchListOld$1$1(C42606rZb c42606rZb, Continuation<? super MsgSwitchUseCaseImpl$getMessageSwitchListOld$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c42606rZb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MsgSwitchUseCaseImpl$getMessageSwitchListOld$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MsgSwitch>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<MsgSwitch>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<MsgSwitch>> continuation) {
        return ((MsgSwitchUseCaseImpl$getMessageSwitchListOld$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C42606rZb c42606rZb = this.this$0;
            this.label = 1;
            obj = c42606rZb.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}

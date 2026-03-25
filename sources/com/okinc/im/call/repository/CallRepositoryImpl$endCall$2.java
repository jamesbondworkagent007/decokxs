package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.C35235nrW;
import o.C35340ntV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$endCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends Unit>>, Object> {
    final /* synthetic */ long $duration;
    final /* synthetic */ CallSessionV2 $session;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$endCall$2(C35235nrW c35235nrW, CallSessionV2 callSessionV2, long j, Continuation<? super CallRepositoryImpl$endCall$2> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
        this.$session = callSessionV2;
        this.$duration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$endCall$2(this.this$0, this.$session, this.$duration, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC35226nrN<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return ((CallRepositoryImpl$endCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35340ntV c35340ntV = this.this$0.djBIcL;
                CallSessionV2 callSessionV2 = this.$session;
                OKMessage oKMessageAEQbTJ = c35340ntV.AEQbTJ(callSessionV2.AYXKKw(), callSessionV2.AhwBna(), C56443yFo.KWHzl(this.$duration));
                this.label = 1;
                obj = c35340ntV.AEQbTJ(oKMessageAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
        } catch (Exception e) {
            return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.AssistContent("Failed to end call: " + e.getMessage()));
        }
    }
}

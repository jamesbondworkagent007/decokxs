package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35235nrW;
import o.C35340ntV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$sendAcceptSignal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ CallSessionV2 $session;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$sendAcceptSignal$2(CallSessionV2 callSessionV2, C35235nrW c35235nrW, Continuation<? super CallRepositoryImpl$sendAcceptSignal$2> continuation) {
        super(2, continuation);
        this.$session = callSessionV2;
        this.this$0 = c35235nrW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$sendAcceptSignal$2(this.$session, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((CallRepositoryImpl$sendAcceptSignal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strDbNXlk = this.$session.DbNXlk();
            if (strDbNXlk == null || StringsKt__StringsKt.fARcdN((CharSequence) strDbNXlk)) {
                this.this$0.KWHzl("sendAcceptSignal: Non-QUEUE call, sending WS accept");
                C35340ntV c35340ntV = this.this$0.djBIcL;
                CallSessionV2 callSessionV2 = this.$session;
                OKMessage oKMessageEZpvd = c35340ntV.EZpvd(callSessionV2.AYXKKw(), callSessionV2.AhwBna());
                this.label = 1;
                obj = c35340ntV.AEQbTJ(oKMessageEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                this.this$0.KWHzl("sendAcceptSignal: QUEUE call, notifying CS backend (meetingId=" + strDbNXlk + ")");
                this.this$0.KWHzl(strDbNXlk, this.$session.fetchVPNInfo(), this.$session.values(), 4);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (OKMessage) obj;
    }
}

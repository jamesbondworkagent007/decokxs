package com.okinc.im.imui.messages.audio.call.service;

import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C58114yvF;
import o.InterfaceC35331ntM;
import o.ServiceC37177oos;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallFloatingViewService$showMediaCallNoticeView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKCallSession $callSession;
    final /* synthetic */ boolean $isGroupCall;
    int label;
    final /* synthetic */ ServiceC37177oos this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMAudioCallFloatingViewService$showMediaCallNoticeView$1(boolean z, ServiceC37177oos serviceC37177oos, OKCallSession oKCallSession, Continuation<? super OKIMAudioCallFloatingViewService$showMediaCallNoticeView$1> continuation) {
        super(2, continuation);
        this.$isGroupCall = z;
        this.this$0 = serviceC37177oos;
        this.$callSession = oKCallSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMAudioCallFloatingViewService$showMediaCallNoticeView$1(this.$isGroupCall, this.this$0, this.$callSession, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMAudioCallFloatingViewService$showMediaCallNoticeView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35331ntM interfaceC35331ntM = (InterfaceC35331ntM) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class);
            if (this.$isGroupCall) {
                ServiceC37177oos serviceC37177oos = this.this$0;
                OKCallSession oKCallSession = this.$callSession;
                this.label = 1;
                obj = serviceC37177oos.copydefault(interfaceC35331ntM, oKCallSession, (Continuation<? super Pair<String, OfficialTagInfo>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                pair = (Pair) obj;
            } else {
                ServiceC37177oos serviceC37177oos2 = this.this$0;
                OKCallSession oKCallSession2 = this.$callSession;
                this.label = 2;
                obj = serviceC37177oos2.KWHzl(interfaceC35331ntM, oKCallSession2, (Continuation<? super Pair<String, OfficialTagInfo>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                pair = (Pair) obj;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            pair = (Pair) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            pair = (Pair) obj;
        }
        if (!this.this$0.values().AYXKKw()) {
            this.this$0.fetchVPNInfo().AEQbTJ(this.this$0.isConnected().valueOf());
            boolean zAEQbTJ = this.this$0.isConnected().AEQbTJ((String) pair.getFirst(), (OfficialTagInfo) pair.getSecond());
            this.this$0.fetchVPNInfo().KWHzl();
            this.this$0.fetchVPNInfo.KWHzl(zAEQbTJ);
            C44124sEe.imLogVoiceCall$default("service:showMediaCallNoticeView: shown=" + zAEQbTJ + ", displayName=" + pair.getFirst() + ", isShowingCallView=" + this.this$0.values().AYXKKw(), null, 2, null);
            return Unit.INSTANCE;
        }
        C44124sEe.imLogVoiceCall$default("service:showMediaCallNoticeView: skipping show, call view already showing (QUEUE call activity likely launched)", null, 2, null);
        this.this$0.fetchVPNInfo().KWHzl();
        return Unit.INSTANCE;
    }
}

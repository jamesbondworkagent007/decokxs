package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.C35235nrW;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$joinChannel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends Unit>>, Object> {
    final /* synthetic */ CallSessionV2 $session;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$joinChannel$2(C35235nrW c35235nrW, CallSessionV2 callSessionV2, Continuation<? super CallRepositoryImpl$joinChannel$2> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
        this.$session = callSessionV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$joinChannel$2(this.this$0, this.$session, continuation);
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
        return ((CallRepositoryImpl$joinChannel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl("joinChannel: channelName=" + this.$session.AEQbTJ() + ", uid=" + this.$session.OLrzqt());
            if (this.this$0.OLrzqt == null) {
                C35235nrW.logError$default(this.this$0, "joinChannel: Audio service unavailable", null, 2, null);
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.ActionBar(-1, "Audio service unavailable - call feature not supported"));
            }
            try {
                if (this.$session.AkhnZx()) {
                    this.this$0.KWHzl("joinChannel: Establishing Agora engine");
                    this.this$0.OLrzqt.copydefault(this.this$0.valueOf, this.$session.KWHzl(), this.$session.values());
                    this.this$0.KWHzl("joinChannel: Joining Agora channel");
                    int iKWHzl = this.this$0.OLrzqt.KWHzl(this.$session.AEQbTJ(), this.$session.EZpvd(), this.$session.OLrzqt());
                    if (this.this$0.OLrzqt.copydefault(iKWHzl)) {
                        String strOLrzqt = this.this$0.OLrzqt.OLrzqt(iKWHzl);
                        C35235nrW.logError$default(this.this$0, "joinChannel: Agora error " + iKWHzl + " - " + strOLrzqt, null, 2, null);
                        return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.ActionBar(iKWHzl, "Failed to join channel: " + strOLrzqt));
                    }
                    this.this$0.KWHzl("joinChannel: Successfully joined Agora channel");
                    return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
                }
                C35235nrW.logError$default(this.this$0, "joinChannel: Session missing Agora credentials", null, 2, null);
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.SharedElementCallback("Session missing Agora credentials"));
            } catch (Exception e) {
                this.this$0.KWHzl("joinChannel: Exception - " + e.getMessage(), e);
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.ActionBar(-1, "Failed to join channel: " + e.getMessage()));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

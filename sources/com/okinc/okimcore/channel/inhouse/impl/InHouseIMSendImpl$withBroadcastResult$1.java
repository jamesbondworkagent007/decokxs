package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$withBroadcastResult$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C44138sEs;
import o.C44169sFw;
import o.C44466sQw;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44289sKh;
import o.InterfaceC44291sKj;
import o.InterfaceC44293sKl;
import o.sDN;

/* JADX INFO: loaded from: classes19.dex */
public final class InHouseIMSendImpl$withBroadcastResult$1 extends SuspendLambda implements Function2<C44502sSe.StateListAnimator, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC44289sKh $callback;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44138sEs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMSendImpl$withBroadcastResult$1(InterfaceC44289sKh interfaceC44289sKh, C44138sEs c44138sEs, Continuation<? super InHouseIMSendImpl$withBroadcastResult$1> continuation) {
        super(2, continuation);
        this.$callback = interfaceC44289sKh;
        this.this$0 = c44138sEs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMSendImpl$withBroadcastResult$1 inHouseIMSendImpl$withBroadcastResult$1 = new InHouseIMSendImpl$withBroadcastResult$1(this.$callback, this.this$0, continuation);
        inHouseIMSendImpl$withBroadcastResult$1.L$0 = obj;
        return inHouseIMSendImpl$withBroadcastResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C44502sSe.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        return ((InHouseIMSendImpl$withBroadcastResult$1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44502sSe.StateListAnimator stateListAnimator = (C44502sSe.StateListAnimator) this.L$0;
            if (stateListAnimator instanceof C44502sSe.StateListAnimator.TaskDescription) {
                OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(((C44502sSe.StateListAnimator.TaskDescription) stateListAnimator).AEQbTJ());
                if (oKMessageAEQbTJ != null) {
                    InterfaceC44289sKh interfaceC44289sKh = this.$callback;
                    MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                    InHouseIMSendImpl$withBroadcastResult$1$1$1 inHouseIMSendImpl$withBroadcastResult$1$1$1 = new InHouseIMSendImpl$withBroadcastResult$1$1$1(interfaceC44289sKh, oKMessageAEQbTJ, stateListAnimator, null);
                    this.label = 1;
                    if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, inHouseIMSendImpl$withBroadcastResult$1$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else if (stateListAnimator instanceof C44502sSe.StateListAnimator.C0942StateListAnimator) {
                OKMessage oKMessageAEQbTJ2 = C44169sFw.AEQbTJ(((C44502sSe.StateListAnimator.C0942StateListAnimator) stateListAnimator).OLrzqt());
                if (oKMessageAEQbTJ2 != null) {
                    InterfaceC44289sKh interfaceC44289sKh2 = this.$callback;
                    MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ2 = sDN.copydefault.AEQbTJ();
                    InHouseIMSendImpl$withBroadcastResult$1$2$1 inHouseIMSendImpl$withBroadcastResult$1$2$1 = new InHouseIMSendImpl$withBroadcastResult$1$2$1(interfaceC44289sKh2, oKMessageAEQbTJ2, null);
                    this.label = 2;
                    if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ2, inHouseIMSendImpl$withBroadcastResult$1$2$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (!(stateListAnimator instanceof C44502sSe.StateListAnimator.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                C44502sSe.StateListAnimator.Application application = (C44502sSe.StateListAnimator.Application) stateListAnimator;
                OKMessage oKMessageAEQbTJ3 = C44169sFw.AEQbTJ(application.EZpvd());
                OKMessage oKMessageAEQbTJ4 = C44169sFw.AEQbTJ(application.KWHzl());
                if (oKMessageAEQbTJ3 != null && oKMessageAEQbTJ4 != null) {
                    C44466sQw c44466sQw = new C44466sQw(oKMessageAEQbTJ3, oKMessageAEQbTJ4);
                    MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ3 = sDN.copydefault.AEQbTJ();
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$callback, oKMessageAEQbTJ4, this.this$0, c44466sQw, null);
                    this.label = 3;
                    if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ3, anonymousClass3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$withBroadcastResult$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OKMessage $ackOkMessage;
        final /* synthetic */ InterfaceC44289sKh $callback;
        final /* synthetic */ C44466sQw $replaceEvent;
        int label;
        final /* synthetic */ C44138sEs this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC44289sKh interfaceC44289sKh, OKMessage oKMessage, C44138sEs c44138sEs, C44466sQw c44466sQw, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$callback = interfaceC44289sKh;
            this.$ackOkMessage = oKMessage;
            this.this$0 = c44138sEs;
            this.$replaceEvent = c44466sQw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$callback, this.$ackOkMessage, this.this$0, this.$replaceEvent, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$callback.AEQbTJ(this.$ackOkMessage);
                InterfaceC44293sKl interfaceC44293sKlEZpvd = this.this$0.EZpvd();
                final C44466sQw c44466sQw = this.$replaceEvent;
                interfaceC44293sKlEZpvd.copydefault(new Function1() { // from class: o.sEC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InHouseIMSendImpl$withBroadcastResult$1.AnonymousClass3.invokeSuspend$lambda$0(c44466sQw, (InterfaceC44291sKj) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C44466sQw c44466sQw, InterfaceC44291sKj interfaceC44291sKj) {
            interfaceC44291sKj.KWHzl(c44466sQw);
            return Unit.INSTANCE;
        }
    }
}

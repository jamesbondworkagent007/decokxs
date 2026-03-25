package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C44138sEs;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44295sKn;

/* JADX INFO: loaded from: classes19.dex */
public final class InHouseIMSendImpl$sendReactionMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC44295sKn $callback;
    final /* synthetic */ WSSendReactionData $wsReactionDataRequest;
    int label;
    final /* synthetic */ C44138sEs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMSendImpl$sendReactionMessage$1(C44138sEs c44138sEs, WSSendReactionData wSSendReactionData, InterfaceC44295sKn interfaceC44295sKn, Continuation<? super InHouseIMSendImpl$sendReactionMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = c44138sEs;
        this.$wsReactionDataRequest = wSSendReactionData;
        this.$callback = interfaceC44295sKn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMSendImpl$sendReactionMessage$1(this.this$0, this.$wsReactionDataRequest, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMSendImpl$sendReactionMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowOnEach = FlowKt.onEach(this.this$0.EZpvd.AkhnZx().AEQbTJ(this.$wsReactionDataRequest), new AnonymousClass1(this.$callback, null));
            this.label = 1;
            if (FlowKt.collect(flowOnEach, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$sendReactionMessage$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C44502sSe.Dialog, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC44295sKn $callback;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC44295sKn interfaceC44295sKn, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = interfaceC44295sKn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C44502sSe.Dialog dialog, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(dialog, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C44502sSe.Dialog dialog = (C44502sSe.Dialog) this.L$0;
                if (dialog instanceof C44502sSe.Dialog.StateListAnimator) {
                    InterfaceC44295sKn interfaceC44295sKn = this.$callback;
                    if (interfaceC44295sKn != null) {
                        interfaceC44295sKn.OLrzqt();
                    }
                } else if (dialog instanceof C44502sSe.Dialog.ActionBar) {
                    InterfaceC44295sKn interfaceC44295sKn2 = this.$callback;
                    if (interfaceC44295sKn2 != null) {
                        C44502sSe.Dialog.ActionBar actionBar = (C44502sSe.Dialog.ActionBar) dialog;
                        interfaceC44295sKn2.OLrzqt(actionBar.EZpvd(), actionBar.KWHzl());
                    }
                } else {
                    if (!(dialog instanceof C44502sSe.Dialog.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC44295sKn interfaceC44295sKn3 = this.$callback;
                    if (interfaceC44295sKn3 != null) {
                        interfaceC44295sKn3.AEQbTJ(((C44502sSe.Dialog.TaskDescription) dialog).AEQbTJ());
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

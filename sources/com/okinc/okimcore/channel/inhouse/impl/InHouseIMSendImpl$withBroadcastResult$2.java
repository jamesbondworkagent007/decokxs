package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import o.C44124sEe;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44289sKh;
import o.sDN;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class InHouseIMSendImpl$withBroadcastResult$2 extends SuspendLambda implements yHO<FlowCollector<? super C44502sSe.StateListAnimator>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC44289sKh $callback;
    final /* synthetic */ OKMessage $message;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMSendImpl$withBroadcastResult$2(OKMessage oKMessage, InterfaceC44289sKh interfaceC44289sKh, Continuation<? super InHouseIMSendImpl$withBroadcastResult$2> continuation) {
        super(3, continuation);
        this.$message = oKMessage;
        this.$callback = interfaceC44289sKh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super C44502sSe.StateListAnimator> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        InHouseIMSendImpl$withBroadcastResult$2 inHouseIMSendImpl$withBroadcastResult$2 = new InHouseIMSendImpl$withBroadcastResult$2(this.$message, this.$callback, continuation);
        inHouseIMSendImpl$withBroadcastResult$2.L$0 = th;
        return inHouseIMSendImpl$withBroadcastResult$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            C44124sEe.KWHzl(this.$message.getTargetId(), "failed to send message", th);
            MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, this.$message, th, null);
            this.label = 1;
            if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$withBroadcastResult$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC44289sKh $callback;
        final /* synthetic */ Throwable $error;
        final /* synthetic */ OKMessage $message;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC44289sKh interfaceC44289sKh, OKMessage oKMessage, Throwable th, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = interfaceC44289sKh;
            this.$message = oKMessage;
            this.$error = th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$message, this.$error, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$callback.OLrzqt(this.$message, this.$error);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

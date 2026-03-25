package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusUseCase$isDownloading$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC57039yar;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckDeviceStatusUseCase$isDownloading$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC57039yar $oneKeyManager;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDeviceStatusUseCase$isDownloading$1(InterfaceC57039yar interfaceC57039yar, Continuation<? super CheckDeviceStatusUseCase$isDownloading$1> continuation) {
        super(2, continuation);
        this.$oneKeyManager = interfaceC57039yar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckDeviceStatusUseCase$isDownloading$1 checkDeviceStatusUseCase$isDownloading$1 = new CheckDeviceStatusUseCase$isDownloading$1(this.$oneKeyManager, continuation);
        checkDeviceStatusUseCase$isDownloading$1.L$0 = obj;
        return checkDeviceStatusUseCase$isDownloading$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return ((CheckDeviceStatusUseCase$isDownloading$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription implements InterfaceC57039yar.Application {
        public final /* synthetic */ ProducerScope<Boolean> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(ProducerScope<? super Boolean> producerScope) {
            this.KWHzl = producerScope;
        }

        @Override // o.InterfaceC57039yar.Application
        public void OLrzqt() {
            this.KWHzl.mo5769trySendJP2dKIU(Boolean.TRUE);
        }

        @Override // o.InterfaceC57039yar.Application
        public void KWHzl() {
            this.KWHzl.mo5769trySendJP2dKIU(Boolean.FALSE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final TaskDescription taskDescription = new TaskDescription(producerScope);
            this.$oneKeyManager.AEQbTJ(taskDescription);
            final InterfaceC57039yar interfaceC57039yar = this.$oneKeyManager;
            Function0 function0 = new Function0() { // from class: o.eHX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckDeviceStatusUseCase$isDownloading$1.invokeSuspend$lambda$0(interfaceC57039yar, taskDescription);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(InterfaceC57039yar interfaceC57039yar, TaskDescription taskDescription) {
        interfaceC57039yar.KWHzl(taskDescription);
        return Unit.INSTANCE;
    }
}

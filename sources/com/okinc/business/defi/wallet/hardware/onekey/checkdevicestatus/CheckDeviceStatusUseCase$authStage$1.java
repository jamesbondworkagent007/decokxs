package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusUseCase$authStage$1;
import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
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
public final class CheckDeviceStatusUseCase$authStage$1 extends SuspendLambda implements Function2<ProducerScope<? super OneKeyAuthStage>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC57039yar $oneKeyManager;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDeviceStatusUseCase$authStage$1(InterfaceC57039yar interfaceC57039yar, Continuation<? super CheckDeviceStatusUseCase$authStage$1> continuation) {
        super(2, continuation);
        this.$oneKeyManager = interfaceC57039yar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckDeviceStatusUseCase$authStage$1 checkDeviceStatusUseCase$authStage$1 = new CheckDeviceStatusUseCase$authStage$1(this.$oneKeyManager, continuation);
        checkDeviceStatusUseCase$authStage$1.L$0 = obj;
        return checkDeviceStatusUseCase$authStage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super OneKeyAuthStage> producerScope, Continuation<? super Unit> continuation) {
        return ((CheckDeviceStatusUseCase$authStage$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final InterfaceC57039yar.ActionBar actionBar = new InterfaceC57039yar.ActionBar() { // from class: o.eHV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57039yar.ActionBar
                public final void EZpvd(OneKeyAuthStage oneKeyAuthStage) {
                    producerScope.mo5769trySendJP2dKIU(oneKeyAuthStage);
                }
            };
            this.$oneKeyManager.AEQbTJ(actionBar);
            final InterfaceC57039yar interfaceC57039yar = this.$oneKeyManager;
            Function0 function0 = new Function0() { // from class: o.eHU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckDeviceStatusUseCase$authStage$1.invokeSuspend$lambda$1(interfaceC57039yar, actionBar);
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
    public static final Unit invokeSuspend$lambda$1(InterfaceC57039yar interfaceC57039yar, InterfaceC57039yar.ActionBar actionBar) {
        interfaceC57039yar.EZpvd(actionBar);
        return Unit.INSTANCE;
    }
}

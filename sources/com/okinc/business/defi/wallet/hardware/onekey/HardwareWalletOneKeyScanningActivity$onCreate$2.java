package com.okinc.business.defi.wallet.hardware.onekey;

import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C15406eHd;
import o.C56391yDq;
import o.C56442yFn;
import o.eGU;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletOneKeyScanningActivity$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eGU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletOneKeyScanningActivity$onCreate$2(eGU egu, Continuation<? super HardwareWalletOneKeyScanningActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = egu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletOneKeyScanningActivity$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletOneKeyScanningActivity$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<OneKeyConnectEvent.ShowNotification> flowAEQbTJ = this.this$0.gEmmrt().AEQbTJ();
            final eGU egu = this.this$0;
            FlowCollector<? super OneKeyConnectEvent.ShowNotification> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$onCreate$2.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(OneKeyConnectEvent.ShowNotification showNotification, Continuation<? super Unit> continuation) {
                    C15406eHd.KWHzl(egu, showNotification.getTitle());
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
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
}

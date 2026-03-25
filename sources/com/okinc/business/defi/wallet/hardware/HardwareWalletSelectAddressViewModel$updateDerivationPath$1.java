package com.okinc.business.defi.wallet.hardware;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eEX;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectAddressViewModel$updateDerivationPath$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HardwareWalletDerivationPath $item;
    int label;
    final /* synthetic */ eEX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectAddressViewModel$updateDerivationPath$1(eEX eex, HardwareWalletDerivationPath hardwareWalletDerivationPath, Continuation<? super HardwareWalletSelectAddressViewModel$updateDerivationPath$1> continuation) {
        super(2, continuation);
        this.this$0 = eex;
        this.$item = hardwareWalletDerivationPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectAddressViewModel$updateDerivationPath$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletSelectAddressViewModel$updateDerivationPath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ(0);
            this.this$0.KWHzl.setValue(C56443yFo.AEQbTJ(0));
            this.this$0.gEmmrt = null;
            MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
            HardwareWalletDerivationPath hardwareWalletDerivationPath = this.$item;
            this.label = 1;
            if (mutableSharedFlow.emit(hardwareWalletDerivationPath, this) == objCopydefault) {
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

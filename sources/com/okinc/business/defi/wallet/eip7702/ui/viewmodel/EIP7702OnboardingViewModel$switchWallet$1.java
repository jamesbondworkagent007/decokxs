package com.okinc.business.defi.wallet.eip7702.ui.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.eCD;

/* JADX INFO: loaded from: classes18.dex */
public final class EIP7702OnboardingViewModel$switchWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC9738bbJ $wallet;
    int label;
    final /* synthetic */ eCD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EIP7702OnboardingViewModel$switchWallet$1(eCD ecd, InterfaceC9738bbJ interfaceC9738bbJ, Continuation<? super EIP7702OnboardingViewModel$switchWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = ecd;
        this.$wallet = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EIP7702OnboardingViewModel$switchWallet$1(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EIP7702OnboardingViewModel$switchWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            eCD ecd = this.this$0;
            InterfaceC9738bbJ interfaceC9738bbJ = this.$wallet;
            Intrinsics.copydefault(interfaceC9738bbJ, "");
            ecd.gEmmrt = (AbstractC12782ctV) interfaceC9738bbJ;
            MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.$wallet;
            this.label = 1;
            if (mutableSharedFlow.emit(interfaceC9738bbJ2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.valueOf();
        return Unit.INSTANCE;
    }
}

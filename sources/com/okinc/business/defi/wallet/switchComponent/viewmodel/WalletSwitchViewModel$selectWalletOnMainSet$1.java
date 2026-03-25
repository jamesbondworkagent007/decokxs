package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AbstractC12782ctV;
import o.C17781fSa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC17773fRt;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$selectWalletOnMainSet$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$selectWalletOnMainSet$1(C17781fSa c17781fSa, String str, Continuation<? super WalletSwitchViewModel$selectWalletOnMainSet$1> continuation) {
        super(1, continuation);
        this.this$0 = c17781fSa;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WalletSwitchViewModel$selectWalletOnMainSet$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WalletSwitchViewModel$selectWalletOnMainSet$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC17773fRt interfaceC17773fRt = this.this$0.AwvSrB;
            String str = this.$walletId;
            this.label = 1;
            obj = interfaceC17773fRt.copydefault(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        if ((interfaceC9738bbJ instanceof AbstractC12782ctV ? (AbstractC12782ctV) interfaceC9738bbJ : null) != null) {
            this.this$0.copydefault((AbstractC12782ctV) interfaceC9738bbJ);
        }
        return Unit.INSTANCE;
    }
}

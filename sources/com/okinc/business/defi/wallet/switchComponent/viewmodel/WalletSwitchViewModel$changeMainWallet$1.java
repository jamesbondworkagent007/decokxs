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

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$changeMainWallet$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$changeMainWallet$1(AbstractC12782ctV abstractC12782ctV, C17781fSa c17781fSa, Continuation<? super WalletSwitchViewModel$changeMainWallet$1> continuation) {
        super(1, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = c17781fSa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WalletSwitchViewModel$changeMainWallet$1(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WalletSwitchViewModel$changeMainWallet$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$wallet.zuWLRA()) {
                InterfaceC17773fRt interfaceC17773fRt = this.this$0.AwvSrB;
                String strDbNXlk = this.$wallet.DbNXlk();
                this.label = 1;
                obj = interfaceC17773fRt.OLrzqt(strDbNXlk, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            this.this$0.copydefault(this.$wallet);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (((Number) obj).intValue() > 0) {
            this.this$0.copydefault(this.$wallet);
        }
        return Unit.INSTANCE;
    }
}

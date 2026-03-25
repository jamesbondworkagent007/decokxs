package com.okinc.business.defi.biz.database.wallet.repository;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.C11571cTe;
import o.C56391yDq;
import o.C56442yFn;
import o.cQM;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletRepository$getAllWalletsSuspend$2$1$1$walletsOfRootWallet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC12782ctV>, Object> {
    final /* synthetic */ C11571cTe $it;
    final /* synthetic */ AbstractC12784ctX $rootWallet;
    int label;
    final /* synthetic */ cQM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletRepository$getAllWalletsSuspend$2$1$1$walletsOfRootWallet$1$1(cQM cqm, C11571cTe c11571cTe, AbstractC12784ctX abstractC12784ctX, Continuation<? super WalletRepository$getAllWalletsSuspend$2$1$1$walletsOfRootWallet$1$1> continuation) {
        super(2, continuation);
        this.this$0 = cqm;
        this.$it = c11571cTe;
        this.$rootWallet = abstractC12784ctX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletRepository$getAllWalletsSuspend$2$1$1$walletsOfRootWallet$1$1(this.this$0, this.$it, this.$rootWallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC12782ctV> continuation) {
        return ((WalletRepository$getAllWalletsSuspend$2$1$1$walletsOfRootWallet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctVEZpvd = this.this$0.EZpvd(this.$it, this.$rootWallet);
            abstractC12782ctVEZpvd.copydefault(this.$rootWallet);
            return abstractC12782ctVEZpvd;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

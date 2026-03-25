package com.okinc.business.defi.wallet.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.ePI;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletFragment$loadMainWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $selectedWallet;
    int label;
    final /* synthetic */ ePI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletFragment$loadMainWallet$1(ePI epi, AbstractC12782ctV abstractC12782ctV, Continuation<? super DefiHomeWalletFragment$loadMainWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = epi;
        this.$selectedWallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletFragment$loadMainWallet$1(this.this$0, this.$selectedWallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletFragment$loadMainWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            DefiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1 defiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1 = new DefiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1(this.$selectedWallet, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, defiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.QfsBiF().KWHzl().setValue(C56443yFo.AEQbTJ(((Boolean) obj).booleanValue() ? 0 : 8));
        return Unit.INSTANCE;
    }
}

package com.okinc.business.defi.wallet.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C17926fXk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eUI;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletViewModel$fetchMainWalletTeeAndEIP7702Status$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ eUI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$fetchMainWalletTeeAndEIP7702Status$1(AbstractC12782ctV abstractC12782ctV, eUI eui, Continuation<? super WalletViewModel$fetchMainWalletTeeAndEIP7702Status$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = eui;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$fetchMainWalletTeeAndEIP7702Status$1(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((WalletViewModel$fetchMainWalletTeeAndEIP7702Status$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if ((this.$wallet.AubY() || this.$wallet.AwvSrB()) && this.$wallet.AuCTelauCTel()) {
                this.this$0.fARcdN = true;
                C17926fXk c17926fXk = this.this$0.dxcTrN;
                String strDbNXlk = this.$wallet.DbNXlk();
                String strEjfBZ = this.$wallet.ejfBZ();
                this.label = 1;
                obj = c17926fXk.EZpvd(strDbNXlk, strEjfBZ, true, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.AEQbTJ(0);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return C56443yFo.AEQbTJ(0);
    }
}

package com.okinc.business.defi.wallet.imported;

import com.okinc.web3.security.model.TonAddress;
import com.okinc.web3.security.model.TonAddressInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18408fho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TonAddress>, Object> {
    final /* synthetic */ String $seedPhrase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1(String str, Continuation<? super DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1> continuation) {
        super(2, continuation);
        this.$seedPhrase = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1(this.$seedPhrase, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TonAddress> continuation) {
        return ((DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C18408fho c18408fho = C18408fho.EZpvd;
            String strAEQbTJ = c18408fho.AEQbTJ(this.$seedPhrase, true);
            String strAEQbTJ2 = c18408fho.AEQbTJ(this.$seedPhrase, false);
            return new TonAddress(this.$seedPhrase, new TonAddressInfo(strAEQbTJ, false, 2, null), new TonAddressInfo(strAEQbTJ2, false, 2, null));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

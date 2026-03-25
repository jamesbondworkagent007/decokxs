package com.okinc.business.defi.wallet.imported;

import com.okinc.web3.security.model.ValidSeedPhraseResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C13758dXe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ C13758dXe $importWalletAvailableChecker;
    final /* synthetic */ ValidSeedPhraseResult $result;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1(ValidSeedPhraseResult validSeedPhraseResult, C13758dXe c13758dXe, Continuation<? super DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1> continuation) {
        super(1, continuation);
        this.$result = validSeedPhraseResult;
        this.$importWalletAvailableChecker = c13758dXe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1(this.$result, this.$importWalletAvailableChecker, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$result.getIgnoreCheckImportAvailable()) {
                return C56443yFo.KWHzl(true);
            }
            if (this.$result.isTon()) {
                C13758dXe c13758dXe = this.$importWalletAvailableChecker;
                String seedPhrase = this.$result.getSeedPhrase();
                this.label = 1;
                obj = c13758dXe.AEQbTJ(seedPhrase, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                C13758dXe c13758dXe2 = this.$importWalletAvailableChecker;
                String seedPhrase2 = this.$result.getSeedPhrase();
                this.label = 2;
                obj = c13758dXe2.KWHzl(seedPhrase2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        return C56443yFo.KWHzl(zBooleanValue);
    }
}

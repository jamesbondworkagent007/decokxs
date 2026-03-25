package com.okinc.business.defi.wallet.imported;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C13758dXe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ C13758dXe $importWalletAvailableChecker;
    final /* synthetic */ String $seedPhrase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$1(C13758dXe c13758dXe, String str, Continuation<? super DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$1> continuation) {
        super(1, continuation);
        this.$importWalletAvailableChecker = c13758dXe;
        this.$seedPhrase = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$1(this.$importWalletAvailableChecker, this.$seedPhrase, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13758dXe c13758dXe = this.$importWalletAvailableChecker;
            String str = this.$seedPhrase;
            this.label = 1;
            obj = c13758dXe.KWHzl(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                    z = false;
                }
                return C56443yFo.KWHzl(z);
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C13758dXe c13758dXe2 = this.$importWalletAvailableChecker;
            String str2 = this.$seedPhrase;
            this.label = 2;
            obj = c13758dXe2.AEQbTJ(str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
        return C56443yFo.KWHzl(z);
    }
}

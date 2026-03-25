package com.okinc.business.defi.wallet.imported;

import com.okinc.web3.security.model.TonAddress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C13754dXa;
import o.C18408fho;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function1<TonAddress, Unit> $onSuccess;
    final /* synthetic */ String $password;
    final /* synthetic */ String $seedPhrase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.web3.security.model.TonAddress, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1(String str, String str2, Function1<? super String, Unit> function1, Function1<? super TonAddress, Unit> function12, Continuation<? super DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1> continuation) {
        super(2, continuation);
        this.$seedPhrase = str;
        this.$password = str2;
        this.$onError = function1;
        this.$onSuccess = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1(this.$seedPhrase, this.$password, this.$onError, this.$onSuccess, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TonAddress tonAddress;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1 defiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1 = new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1(this.$seedPhrase, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, defiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1$address$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                tonAddress = (TonAddress) obj;
                if (!tonAddress.getHdTonAddress().getAlreadyExist() && tonAddress.getTonAddress().getAlreadyExist()) {
                    this.$onError.invoke(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hrNTAI));
                } else {
                    this.$onSuccess.invoke(tonAddress);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C18408fho c18408fho = C18408fho.EZpvd;
        String str = this.$seedPhrase;
        String str2 = this.$password;
        this.label = 2;
        obj = c18408fho.OLrzqt((TonAddress) obj, str, str2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        tonAddress = (TonAddress) obj;
        if (!tonAddress.getHdTonAddress().getAlreadyExist()) {
            this.$onSuccess.invoke(tonAddress);
        }
        return Unit.INSTANCE;
    }
}

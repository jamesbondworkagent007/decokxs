package com.okinc.web3.security.features.importing.activity;

import com.okinc.web3.security.listener.ImportWalletListener;
import com.okinc.web3.security.model.TonAddress;
import com.okinc.web3.security.model.ValidSeedPhraseResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class ImportWalletActivity$setupListener$1$tonItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TonAddress $tonAddress;
    int label;
    final /* synthetic */ ImportWalletActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportWalletActivity$setupListener$1$tonItemClick$1(ImportWalletActivity importWalletActivity, TonAddress tonAddress, Continuation<? super ImportWalletActivity$setupListener$1$tonItemClick$1> continuation) {
        super(2, continuation);
        this.this$0 = importWalletActivity;
        this.$tonAddress = tonAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImportWalletActivity$setupListener$1$tonItemClick$1(this.this$0, this.$tonAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImportWalletActivity$setupListener$1$tonItemClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ImportWalletListener importWalletListener = ImportWalletActivity.mImportWalletListener;
            if (importWalletListener != null) {
                ImportWalletActivity importWalletActivity = this.this$0;
                ValidSeedPhraseResult validSeedPhraseResult = new ValidSeedPhraseResult(this.$tonAddress.getSeedPhrase(), true, true, true);
                final ImportWalletActivity importWalletActivity2 = this.this$0;
                importWalletListener.onSeedPhraseValid(importWalletActivity, validSeedPhraseResult, new Function1() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$setupListener$1$tonItemClick$1$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ImportWalletActivity$setupListener$1$tonItemClick$1.invokeSuspend$lambda$0(importWalletActivity2, (String) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ImportWalletActivity importWalletActivity, String str) {
        importWalletActivity.getViewModel().setErrorMsg(str);
        return Unit.INSTANCE;
    }
}

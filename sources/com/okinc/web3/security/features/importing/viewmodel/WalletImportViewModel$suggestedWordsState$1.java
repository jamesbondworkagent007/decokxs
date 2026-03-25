package com.okinc.web3.security.features.importing.viewmodel;

import com.okinc.web3.security.features.importing.model.SuggestedWordsState;
import com.okinc.web3.security.features.importing.model.WalletImportInput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletImportViewModel$suggestedWordsState$1 extends SuspendLambda implements yHO<WalletImportInput, Boolean, Continuation<? super SuggestedWordsState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ WalletImportViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportViewModel$suggestedWordsState$1(WalletImportViewModel walletImportViewModel, Continuation<? super WalletImportViewModel$suggestedWordsState$1> continuation) {
        super(3, continuation);
        this.this$0 = walletImportViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(WalletImportInput walletImportInput, boolean z, Continuation<? super SuggestedWordsState> continuation) {
        WalletImportViewModel$suggestedWordsState$1 walletImportViewModel$suggestedWordsState$1 = new WalletImportViewModel$suggestedWordsState$1(this.this$0, continuation);
        walletImportViewModel$suggestedWordsState$1.L$0 = walletImportInput;
        walletImportViewModel$suggestedWordsState$1.Z$0 = z;
        return walletImportViewModel$suggestedWordsState$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(WalletImportInput walletImportInput, Boolean bool, Continuation<? super SuggestedWordsState> continuation) {
        return invoke(walletImportInput, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletImportInput walletImportInput = (WalletImportInput) this.L$0;
            if (this.Z$0) {
                return this.this$0.getSuggestedWords(walletImportInput);
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

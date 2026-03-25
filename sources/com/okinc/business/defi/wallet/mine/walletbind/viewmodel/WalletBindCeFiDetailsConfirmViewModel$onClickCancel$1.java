package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiDetailsConfirmViewModel$onClickCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intention $intention;
    final /* synthetic */ String $packageName;
    int label;
    final /* synthetic */ WalletBindCeFiDetailsConfirmViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindCeFiDetailsConfirmViewModel$onClickCancel$1(WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel, String str, Intention intention, Continuation<? super WalletBindCeFiDetailsConfirmViewModel$onClickCancel$1> continuation) {
        super(2, continuation);
        this.this$0 = walletBindCeFiDetailsConfirmViewModel;
        this.$packageName = str;
        this.$intention = intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindCeFiDetailsConfirmViewModel$onClickCancel$1(this.this$0, this.$packageName, this.$intention, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindCeFiDetailsConfirmViewModel$onClickCancel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object objOLrzqt = this.this$0.gEmmrt.OLrzqt(this.$packageName, this.$intention);
            if (Result.m7383isFailureimpl(objOLrzqt)) {
                objOLrzqt = null;
            }
            String str = (String) objOLrzqt;
            if (str != null) {
                WalletBindCeFiDetailsConfirmViewModel walletBindCeFiDetailsConfirmViewModel = this.this$0;
                String str2 = this.$packageName;
                MutableSharedFlow mutableSharedFlow = walletBindCeFiDetailsConfirmViewModel.valueOf;
                Pair pair = new Pair(str, str2);
                this.label = 1;
                if (mutableSharedFlow.emit(pair, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

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
import o.C19339fzS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindViewModel$startCeFiBind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intention $intention;
    final /* synthetic */ String $targetPackageName;
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ WalletBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindViewModel$startCeFiBind$1(WalletBindViewModel walletBindViewModel, String str, String str2, Intention intention, Continuation<? super WalletBindViewModel$startCeFiBind$1> continuation) {
        super(2, continuation);
        this.this$0 = walletBindViewModel;
        this.$targetPackageName = str;
        this.$token = str2;
        this.$intention = intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindViewModel$startCeFiBind$1(this.this$0, this.$targetPackageName, this.$token, this.$intention, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindViewModel$startCeFiBind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19339fzS c19339fzS = C19339fzS.EZpvd;
            c19339fzS.OLrzqt("[Wallet APP-Bind Wallet]", "get deeplink started");
            objEZpvd = this.this$0.fIwbmz.EZpvd(this.$targetPackageName, this.$token, this.$intention);
            String str = (String) (Result.m7383isFailureimpl(objEZpvd) ? null : objEZpvd);
            if (str != null) {
                WalletBindViewModel walletBindViewModel = this.this$0;
                String str2 = this.$targetPackageName;
                c19339fzS.OLrzqt("[Wallet APP-Bind Wallet]", "get deeplink succeed:" + str);
                MutableSharedFlow mutableSharedFlow = walletBindViewModel.values;
                Pair pair = new Pair(str, str2);
                this.L$0 = objEZpvd;
                this.label = 1;
                if (mutableSharedFlow.emit(pair, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            objEZpvd = this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            WalletBindViewModel walletBindViewModel2 = this.this$0;
            C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "get deeplink failed:" + thM7380exceptionOrNullimpl.getMessage());
            MutableSharedFlow mutableSharedFlow2 = walletBindViewModel2.values;
            Pair pair2 = new Pair("", "");
            this.L$0 = null;
            this.label = 2;
            if (mutableSharedFlow2.emit(pair2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}

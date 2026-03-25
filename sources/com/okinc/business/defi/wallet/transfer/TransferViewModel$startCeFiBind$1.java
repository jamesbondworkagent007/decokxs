package com.okinc.business.defi.wallet.transfer;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C20708glw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TransferViewModel$startCeFiBind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $targetPackageName;
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ C20708glw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferViewModel$startCeFiBind$1(C20708glw c20708glw, String str, String str2, Continuation<? super TransferViewModel$startCeFiBind$1> continuation) {
        super(2, continuation);
        this.this$0 = c20708glw;
        this.$targetPackageName = str;
        this.$token = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferViewModel$startCeFiBind$1(this.this$0, this.$targetPackageName, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransferViewModel$startCeFiBind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd = this.this$0.EZpvd().EZpvd(this.$targetPackageName, this.$token, Intention.WALLET_WITHDRAW);
            String str = (String) (Result.m7383isFailureimpl(objEZpvd) ? null : objEZpvd);
            if (str != null) {
                C20708glw c20708glw = this.this$0;
                String str2 = this.$targetPackageName;
                MutableSharedFlow mutableSharedFlow = c20708glw.OLrzqt;
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
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
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

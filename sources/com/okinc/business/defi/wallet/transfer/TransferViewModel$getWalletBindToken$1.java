package com.okinc.business.defi.wallet.transfer;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenResponseBody;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC12782ctV;
import o.C13934dbu;
import o.C20708glw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TransferViewModel$getWalletBindToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C20708glw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferViewModel$getWalletBindToken$1(C20708glw c20708glw, Continuation<? super TransferViewModel$getWalletBindToken$1> continuation) {
        super(2, continuation);
        this.this$0 = c20708glw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferViewModel$getWalletBindToken$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransferViewModel$getWalletBindToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C20708glw c20708glw;
        Object objCopydefault;
        Object obj2;
        C20708glw c20708glw2;
        GetBindingTokenResponseBody getBindingTokenResponseBody;
        C20708glw c20708glw3;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctVValues = this.this$0.values();
            if (abstractC12782ctVValues != null) {
                c20708glw = this.this$0;
                GetBindingTokenRequestBody getBindingTokenRequestBody = new GetBindingTokenRequestBody(abstractC12782ctVValues.DbNXlk(), abstractC12782ctVValues.AYXKKw());
                C13934dbu c13934dbu = c20708glw.fIwbmz;
                this.L$0 = c20708glw;
                this.label = 1;
                objCopydefault = c13934dbu.copydefault(getBindingTokenRequestBody, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                C20708glw c20708glw4 = c20708glw;
                obj2 = objCopydefault;
                c20708glw2 = c20708glw4;
                getBindingTokenResponseBody = (GetBindingTokenResponseBody) (!Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (getBindingTokenResponseBody != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
            }
        } else if (i == 1) {
            c20708glw = (C20708glw) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            C20708glw c20708glw42 = c20708glw;
            obj2 = objCopydefault;
            c20708glw2 = c20708glw42;
            getBindingTokenResponseBody = (GetBindingTokenResponseBody) (!Result.m7383isFailureimpl(obj2) ? null : obj2);
            if (getBindingTokenResponseBody != null) {
                MutableSharedFlow mutableSharedFlow = c20708glw2.KWHzl;
                String bindingToken = getBindingTokenResponseBody.getBindingToken();
                this.L$0 = c20708glw2;
                this.L$1 = obj2;
                this.label = 2;
                if (mutableSharedFlow.emit(bindingToken, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                c20708glw3 = c20708glw2;
                c20708glw2 = c20708glw3;
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i == 2) {
            obj2 = this.L$1;
            c20708glw3 = (C20708glw) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c20708glw2 = c20708glw3;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
            if (thM7380exceptionOrNullimpl != null) {
                MutableSharedFlow mutableSharedFlow2 = c20708glw2.AEQbTJ;
                String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (mutableSharedFlow2.emit(message, this) == objCopydefault2) {
                    return objCopydefault2;
                }
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

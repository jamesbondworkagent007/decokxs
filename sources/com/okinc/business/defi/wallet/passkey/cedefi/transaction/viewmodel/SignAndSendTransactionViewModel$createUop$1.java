package com.okinc.business.defi.wallet.passkey.cedefi.transaction.viewmodel;

import com.okinc.business.defi.wallet.passkey.common.bean.SignAndSendTransactionReq;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.KSerializer;
import o.C17652fNg;
import o.C56391yDq;
import o.C56442yFn;
import o.fMC;

/* JADX INFO: loaded from: classes23.dex */
public final class SignAndSendTransactionViewModel$createUop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ fMC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignAndSendTransactionViewModel$createUop$1(fMC fmc, String str, Continuation<? super SignAndSendTransactionViewModel$createUop$1> continuation) {
        super(2, continuation);
        this.this$0 = fmc;
        this.$orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignAndSendTransactionViewModel$createUop$1(this.this$0, this.$orderId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignAndSendTransactionViewModel$createUop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17652fNg c17652fNg = this.this$0.AEQbTJ;
            String strKWHzl = this.this$0.KWHzl();
            KSerializer<SignAndSendTransactionReq> kSerializerSerializer = SignAndSendTransactionReq.Companion.serializer();
            SignAndSendTransactionReq signAndSendTransactionReq = new SignAndSendTransactionReq(this.$orderId);
            this.label = 1;
            objEZpvd = c17652fNg.EZpvd(strKWHzl, kSerializerSerializer, signAndSendTransactionReq, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
            if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                OKServerException oKServerExceptionOLrzqt = this.this$0.OLrzqt((OKServerException) thM7380exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                Result.Application application = Result.Companion;
                Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(oKServerExceptionOLrzqt)));
                this.label = 2;
                if (mutableStateFlow.emit(resultM7376boximpl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
        Result resultM7376boximpl2 = Result.m7376boximpl(objEZpvd);
        this.label = 3;
        if (mutableStateFlow2.emit(resultM7376boximpl2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

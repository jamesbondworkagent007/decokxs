package com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionResult;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13754dXa;
import o.C17639fMu;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class SignAndSendTransactionFragment$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C17639fMu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignAndSendTransactionFragment$onCreate$2(C17639fMu c17639fMu, Continuation<? super SignAndSendTransactionFragment$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = c17639fMu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignAndSendTransactionFragment$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignAndSendTransactionFragment$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment.SignAndSendTransactionFragment$onCreate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends String>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C17639fMu this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C17639fMu c17639fMu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c17639fMu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Result<? extends String> result, Continuation<? super Unit> continuation) {
            return invoke(result.m7386unboximpl(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SignAndSendTransactionResult unknownError;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Object objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    C17639fMu c17639fMu = this.this$0;
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    c17639fMu.copydefault(new SignAndSendTransactionResult.Success((String) objM7386unboximpl));
                } else {
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        C17639fMu c17639fMu2 = this.this$0;
                        pUU.AEQbTJ("SignAndSendTransactionFragment", "sendUop", thM7380exceptionOrNullimpl);
                        if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                            int code = ((OKServerException) thM7380exceptionOrNullimpl).getCode();
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty);
                            }
                            unknownError = new SignAndSendTransactionResult.Failed.NetworkFailure(code, message);
                        } else {
                            unknownError = new SignAndSendTransactionResult.Failed.UnknownError(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty));
                        }
                        c17639fMu2.copydefault(unknownError);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<Result<String>> sharedFlowAEQbTJ = this.this$0.KWHzl().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
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

package com.okinc.business.defi.impl;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.TransactionResult;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionResult;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;
import o.C13754dXa;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class PasskeyWalletServiceImpl$signDexTransaction$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InternalTransactionResult $it;
    final /* synthetic */ Function1<TransactionResult, Unit> $transactionResultCallback;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.passkeywallet.cedefi.TransactionResult, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasskeyWalletServiceImpl$signDexTransaction$1$1$1(InternalTransactionResult internalTransactionResult, Function1<? super TransactionResult, Unit> function1, Continuation<? super PasskeyWalletServiceImpl$signDexTransaction$1$1$1> continuation) {
        super(2, continuation);
        this.$it = internalTransactionResult;
        this.$transactionResultCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyWalletServiceImpl$signDexTransaction$1$1$1(this.$it, this.$transactionResultCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyWalletServiceImpl$signDexTransaction$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.impl.PasskeyWalletServiceImpl$signDexTransaction$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
        final /* synthetic */ InternalTransactionResult $it;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InternalTransactionResult internalTransactionResult, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = internalTransactionResult;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$it, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InternalTransactionResult internalTransactionResult = this.$it;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(Json.Default.encodeToString(PasskeyWalletSignedMsg.Companion.serializer(), new PasskeyWalletSignedMsg(((InternalTransactionResult.Success) internalTransactionResult).AEQbTJ())));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                return Result.m7376boximpl(objM7377constructorimpl);
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
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
        Function1<TransactionResult, Unit> function1 = this.$transactionResultCallback;
        InternalTransactionResult internalTransactionResult = this.$it;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            function1.invoke(new TransactionResult.Success((String) objM7386unboximpl, ((InternalTransactionResult.Success) internalTransactionResult).OLrzqt()));
        }
        Function1<TransactionResult, Unit> function12 = this.$transactionResultCallback;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            function12.invoke(new TransactionResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty)));
            pUU.AEQbTJ("PasskeyWalletServiceImpl", "signTransaction2 error: ", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}

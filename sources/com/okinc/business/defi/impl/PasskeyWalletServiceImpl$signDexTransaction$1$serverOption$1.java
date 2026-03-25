package com.okinc.business.defi.impl;

import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.TransactionInput;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class PasskeyWalletServiceImpl$signDexTransaction$1$serverOption$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PasskeyAuthenticateRequest>>, Object> {
    final /* synthetic */ TransactionInput $transactionInput;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyWalletServiceImpl$signDexTransaction$1$serverOption$1(TransactionInput transactionInput, Continuation<? super PasskeyWalletServiceImpl$signDexTransaction$1$serverOption$1> continuation) {
        super(2, continuation);
        this.$transactionInput = transactionInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyWalletServiceImpl$signDexTransaction$1$serverOption$1(this.$transactionInput, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PasskeyAuthenticateRequest>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PasskeyAuthenticateRequest>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PasskeyAuthenticateRequest>> continuation) {
        return ((PasskeyWalletServiceImpl$signDexTransaction$1$serverOption$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TransactionInput transactionInput = this.$transactionInput;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((PasskeyAuthenticateRequest) Json.Default.decodeFromString(PasskeyAuthenticateRequest.Companion.serializer(), transactionInput.KWHzl()));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.business.dexui.utils;

import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes6.dex */
public final class SafetyNetUtilsKt$getNewApiResult$responseData$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<T>>, Object> {
    final /* synthetic */ Function1<Continuation<? super ResponseData<T>>, Object> $apiCall;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<T>>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SafetyNetUtilsKt$getNewApiResult$responseData$1(Function1<? super Continuation<? super ResponseData<T>>, ? extends Object> function1, Continuation<? super SafetyNetUtilsKt$getNewApiResult$responseData$1> continuation) {
        super(2, continuation);
        this.$apiCall = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SafetyNetUtilsKt$getNewApiResult$responseData$1(this.$apiCall, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<T>> continuation) {
        return ((SafetyNetUtilsKt$getNewApiResult$responseData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Function1<Continuation<? super ResponseData<T>>, Object> function1 = this.$apiCall;
            this.label = 1;
            obj = function1.invoke(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$apiCall.invoke(this);
    }
}

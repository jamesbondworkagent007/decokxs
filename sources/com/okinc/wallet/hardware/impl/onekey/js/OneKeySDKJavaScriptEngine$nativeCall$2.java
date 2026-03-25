package com.okinc.wallet.hardware.impl.onekey.js;

import com.okinc.wallet.hardware.impl.onekey.data.Response;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.DeserializationStrategy;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKJavaScriptEngine$nativeCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
    final /* synthetic */ String $responseString;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$nativeCall$2(String str, Continuation<? super OneKeySDKJavaScriptEngine$nativeCall$2> continuation) {
        super(2, continuation);
        this.$responseString = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$nativeCall$2(this.$responseString, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response> continuation) {
        return ((OneKeySDKJavaScriptEngine$nativeCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) Response.Companion.serializer(), this.$responseString);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.wallet.hardware.impl.onekey.js;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC57148ycu;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKJavaScriptEngine$handleRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $method;
    final /* synthetic */ String $params;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ C57149ycv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$handleRequest$1(C57149ycv c57149ycv, String str, String str2, String str3, Continuation<? super OneKeySDKJavaScriptEngine$handleRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = c57149ycv;
        this.$method = str;
        this.$requestId = str2;
        this.$params = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$handleRequest$1(this.this$0, this.$method, this.$requestId, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneKeySDKJavaScriptEngine$handleRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        AbstractC57148ycu abstractC57148ycu = (AbstractC57148ycu) this.this$0.AYXKKw.get(this.$method);
        if (abstractC57148ycu != null) {
            abstractC57148ycu.copydefault(this.$requestId, this.$params);
        }
        return Unit.INSTANCE;
    }
}

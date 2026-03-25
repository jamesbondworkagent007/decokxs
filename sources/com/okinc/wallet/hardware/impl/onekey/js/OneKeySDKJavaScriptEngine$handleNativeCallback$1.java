package com.okinc.wallet.hardware.impl.onekey.js;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKJavaScriptEngine$handleNativeCallback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callId;
    final /* synthetic */ String $data;
    int label;
    final /* synthetic */ C57149ycv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$handleNativeCallback$1(C57149ycv c57149ycv, String str, String str2, Continuation<? super OneKeySDKJavaScriptEngine$handleNativeCallback$1> continuation) {
        super(2, continuation);
        this.this$0 = c57149ycv;
        this.$callId = str;
        this.$data = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$handleNativeCallback$1(this.this$0, this.$callId, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneKeySDKJavaScriptEngine$handleNativeCallback$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CancellableContinuation<String> cancellableContinuationAEQbTJ;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C57149ycv.ActionBar actionBar = (C57149ycv.ActionBar) this.this$0.djBIcL.remove(this.$callId);
            if (actionBar != null && (cancellableContinuationAEQbTJ = actionBar.AEQbTJ()) != null) {
                String str = this.$data;
                if (cancellableContinuationAEQbTJ.isActive()) {
                    Result.Application application = Result.Companion;
                    cancellableContinuationAEQbTJ.resumeWith(Result.m7377constructorimpl(str));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

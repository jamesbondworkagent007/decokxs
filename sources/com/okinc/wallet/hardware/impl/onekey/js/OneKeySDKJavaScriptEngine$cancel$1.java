package com.okinc.wallet.hardware.impl.onekey.js;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKJavaScriptEngine$cancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $connectId;
    final /* synthetic */ Job $loadScriptJob;
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ C57149ycv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$cancel$1(Job job, C57149ycv c57149ycv, WebView webView, String str, Continuation<? super OneKeySDKJavaScriptEngine$cancel$1> continuation) {
        super(2, continuation);
        this.$loadScriptJob = job;
        this.this$0 = c57149ycv;
        this.$webView = webView;
        this.$connectId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$cancel$1(this.$loadScriptJob, this.this$0, this.$webView, this.$connectId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneKeySDKJavaScriptEngine$cancel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Job job = this.$loadScriptJob;
            this.label = 1;
            if (job.join(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C57149ycv c57149ycv = this.this$0;
        WebView webView = this.$webView;
        String str = this.$connectId;
        this.label = 2;
        if (c57149ycv.AEQbTJ(webView, str, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

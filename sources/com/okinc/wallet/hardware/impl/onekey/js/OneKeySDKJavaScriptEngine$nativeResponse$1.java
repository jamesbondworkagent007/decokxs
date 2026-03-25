package com.okinc.wallet.hardware.impl.onekey.js;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class OneKeySDKJavaScriptEngine$nativeResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ T $params;
    Object L$0;
    int label;
    final /* synthetic */ C57149ycv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$nativeResponse$1(C57149ycv c57149ycv, String str, T t, Continuation<? super OneKeySDKJavaScriptEngine$nativeResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = c57149ycv;
        this.$id = str;
        this.$params = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$nativeResponse$1(this.this$0, this.$id, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneKeySDKJavaScriptEngine$nativeResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WebView webViewCopydefault;
        WebView webView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            webViewCopydefault = this.this$0.copydefault();
            if (webViewCopydefault != null) {
                Job job = this.this$0.values;
                if (job == null) {
                    return Unit.INSTANCE;
                }
                this.L$0 = webViewCopydefault;
                this.label = 1;
                if (job.join(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to respond to JS call");
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webView = (WebView) this.L$0;
                C56391yDq.AEQbTJ(obj);
                String str = "window.WKWebViewJavascriptBridge.nativeResponse(\"" + this.$id + "\", " + ((String) obj) + ");";
                pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeResponse: " + str);
                webView.evaluateJavascript(str, null);
                return Unit.INSTANCE;
            }
            WebView webView2 = (WebView) this.L$0;
            C56391yDq.AEQbTJ(obj);
            webViewCopydefault = webView2;
        }
        CoroutineDispatcher coroutineDispatcher = this.this$0.AhwBna;
        Intrinsics.OLrzqt();
        OneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1 oneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1 = new OneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1(this.$params, null);
        this.L$0 = webViewCopydefault;
        this.label = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1, this);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        webView = webViewCopydefault;
        obj = objWithContext;
        String str2 = "window.WKWebViewJavascriptBridge.nativeResponse(\"" + this.$id + "\", " + ((String) obj) + ");";
        pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeResponse: " + str2);
        webView.evaluateJavascript(str2, null);
        return Unit.INSTANCE;
    }
}

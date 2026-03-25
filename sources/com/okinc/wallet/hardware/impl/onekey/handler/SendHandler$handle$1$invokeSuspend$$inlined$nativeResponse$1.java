package com.okinc.wallet.hardware.impl.onekey.handler;

import android.webkit.WebView;
import com.okinc.wallet.hardware.impl.onekey.data.Empty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.JsonElementKt;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class SendHandler$handle$1$invokeSuspend$$inlined$nativeResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ Object $params;
    Object L$0;
    int label;
    final /* synthetic */ C57149ycv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendHandler$handle$1$invokeSuspend$$inlined$nativeResponse$1(C57149ycv c57149ycv, String str, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c57149ycv;
        this.$id = str;
        this.$params = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendHandler$handle$1$invokeSuspend$$inlined$nativeResponse$1(this.this$0, this.$id, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SendHandler$handle$1$invokeSuspend$$inlined$nativeResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$params, null);
        this.L$0 = webViewCopydefault;
        this.label = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
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

    /* JADX INFO: renamed from: com.okinc.wallet.hardware.impl.onekey.handler.SendHandler$handle$1$invokeSuspend$$inlined$nativeResponse$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ Object $params;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation) {
            super(2, continuation);
            this.$params = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                return JsonElementKt.JsonPrimitive(C33489mxS.KWHzl.KWHzl(Empty.INSTANCE.serializer(), this.$params)).toString();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

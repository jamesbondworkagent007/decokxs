package com.okinc.wallet.hardware.impl.onekey.js;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.C57149ycv;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKJavaScriptEngine$loadScriptInternal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $file;
    final /* synthetic */ WebView $this_loadScriptInternal;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C57149ycv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$loadScriptInternal$1(WebView webView, C57149ycv c57149ycv, File file, Continuation<? super OneKeySDKJavaScriptEngine$loadScriptInternal$1> continuation) {
        super(2, continuation);
        this.$this_loadScriptInternal = webView;
        this.this$0 = c57149ycv;
        this.$file = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$loadScriptInternal$1(this.$this_loadScriptInternal, this.this$0, this.$file, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneKeySDKJavaScriptEngine$loadScriptInternal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object result;
        Object result2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$this_loadScriptInternal.addJavascriptInterface(this.this$0.DbNXlk, "OneKeyNativeBridge");
                WebView webView = this.$this_loadScriptInternal;
                this.L$0 = webView;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                webView.evaluateJavascript("window[\"isAndroid\"] = true;", new ActionBar(cancellableContinuationImpl));
                Object result3 = cancellableContinuationImpl.getResult();
                if (result3 == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(this);
                }
                if (result3 == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj);
                            return Unit.INSTANCE;
                        }
                        C56391yDq.AEQbTJ(obj);
                        C57149ycv c57149ycv = this.this$0;
                        WebView webView2 = this.$this_loadScriptInternal;
                        this.L$0 = c57149ycv;
                        this.L$1 = webView2;
                        this.label = 4;
                        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                        cancellableContinuationImpl2.initCancellability();
                        String strValueOf = String.valueOf(c57149ycv.copydefault.getAndIncrement());
                        c57149ycv.djBIcL.put(strValueOf, new C57149ycv.ActionBar(strValueOf, null, cancellableContinuationImpl2));
                        webView2.evaluateJavascript("window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"init\", \"{}\");", null);
                        result2 = cancellableContinuationImpl2.getResult();
                        if (result2 == C56442yFn.copydefault()) {
                            C56447yFs.copydefault(this);
                        }
                        if (result2 == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    String str = (String) obj;
                    WebView webView3 = this.$this_loadScriptInternal;
                    this.L$0 = str;
                    this.L$1 = webView3;
                    this.label = 3;
                    CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                    cancellableContinuationImpl3.initCancellability();
                    webView3.evaluateJavascript(str, new Application(cancellableContinuationImpl3));
                    result = cancellableContinuationImpl3.getResult();
                    if (result == C56442yFn.copydefault()) {
                        C56447yFs.copydefault(this);
                    }
                    if (result == objCopydefault) {
                        return objCopydefault;
                    }
                    C57149ycv c57149ycv2 = this.this$0;
                    WebView webView22 = this.$this_loadScriptInternal;
                    this.L$0 = c57149ycv2;
                    this.L$1 = webView22;
                    this.label = 4;
                    CancellableContinuationImpl cancellableContinuationImpl22 = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                    cancellableContinuationImpl22.initCancellability();
                    String strValueOf2 = String.valueOf(c57149ycv2.copydefault.getAndIncrement());
                    c57149ycv2.djBIcL.put(strValueOf2, new C57149ycv.ActionBar(strValueOf2, null, cancellableContinuationImpl22));
                    webView22.evaluateJavascript("window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf2 + "\", \"init\", \"{}\");", null);
                    result2 = cancellableContinuationImpl22.getResult();
                    if (result2 == C56442yFn.copydefault()) {
                    }
                    if (result2 == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            CoroutineDispatcher coroutineDispatcher = this.this$0.gEmmrt;
            OneKeySDKJavaScriptEngine$loadScriptInternal$1$script$1 oneKeySDKJavaScriptEngine$loadScriptInternal$1$script$1 = new OneKeySDKJavaScriptEngine$loadScriptInternal$1$script$1(this.$file, null);
            this.L$0 = null;
            this.label = 2;
            obj = BuildersKt.withContext(coroutineDispatcher, oneKeySDKJavaScriptEngine$loadScriptInternal$1$script$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            String str2 = (String) obj;
            WebView webView32 = this.$this_loadScriptInternal;
            this.L$0 = str2;
            this.L$1 = webView32;
            this.label = 3;
            CancellableContinuationImpl cancellableContinuationImpl32 = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl32.initCancellability();
            webView32.evaluateJavascript(str2, new Application(cancellableContinuationImpl32));
            result = cancellableContinuationImpl32.getResult();
            if (result == C56442yFn.copydefault()) {
            }
            if (result == objCopydefault) {
            }
            C57149ycv c57149ycv22 = this.this$0;
            WebView webView222 = this.$this_loadScriptInternal;
            this.L$0 = c57149ycv22;
            this.L$1 = webView222;
            this.label = 4;
            CancellableContinuationImpl cancellableContinuationImpl222 = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl222.initCancellability();
            String strValueOf22 = String.valueOf(c57149ycv22.copydefault.getAndIncrement());
            c57149ycv22.djBIcL.put(strValueOf22, new C57149ycv.ActionBar(strValueOf22, null, cancellableContinuationImpl222));
            webView222.evaluateJavascript("window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf22 + "\", \"init\", \"{}\");", null);
            result2 = cancellableContinuationImpl222.getResult();
            if (result2 == C56442yFn.copydefault()) {
            }
            if (result2 == objCopydefault) {
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            pUU.AEQbTJ("OneKeySDKJavaScriptEngine", "Failed to load onekey_sdk.js", e);
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar<T> implements ValueCallback {
        public final /* synthetic */ CancellableContinuation<Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method merged with bridge method: onReceiveValue(Ljava/lang/Object;)V */
        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(String str) {
            if (this.EZpvd.isActive()) {
                CancellableContinuation<Unit> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }
    }

    public static final class Application<T> implements ValueCallback {
        public final /* synthetic */ CancellableContinuation<Unit> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        /* JADX DEBUG: Method merged with bridge method: onReceiveValue(Ljava/lang/Object;)V */
        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(String str) {
            if (this.AEQbTJ.isActive()) {
                CancellableContinuation<Unit> cancellableContinuation = this.AEQbTJ;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }
    }
}

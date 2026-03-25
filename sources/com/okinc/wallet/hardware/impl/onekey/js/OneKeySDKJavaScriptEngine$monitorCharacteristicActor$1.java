package com.okinc.wallet.hardware.impl.onekey.js;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ActorScope;
import kotlinx.coroutines.channels.ChannelIterator;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1 extends SuspendLambda implements Function2<ActorScope<C57149ycv.StateListAnimator>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C57149ycv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1(C57149ycv c57149ycv, Continuation<? super OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1> continuation) {
        super(2, continuation);
        this.this$0 = c57149ycv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1 oneKeySDKJavaScriptEngine$monitorCharacteristicActor$1 = new OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1(this.this$0, continuation);
        oneKeySDKJavaScriptEngine$monitorCharacteristicActor$1.L$0 = obj;
        return oneKeySDKJavaScriptEngine$monitorCharacteristicActor$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActorScope<C57149ycv.StateListAnimator> actorScope, Continuation<? super Unit> continuation) {
        return ((OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1) create(actorScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:13:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:29:0x00a7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChannelIterator it;
        ChannelIterator channelIterator;
        C57149ycv.StateListAnimator stateListAnimator;
        WebView webView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            it = ((ActorScope) this.L$0).iterator();
            this.L$0 = it;
            this.L$1 = null;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == objCopydefault) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else if (i == 1) {
            it = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (((Boolean) obj).booleanValue()) {
            }
        } else if (i == 2) {
            webView = (WebView) this.L$2;
            stateListAnimator = (C57149ycv.StateListAnimator) this.L$1;
            channelIterator = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcher = this.this$0.AhwBna;
            OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1 oneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1 = new OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1(stateListAnimator, null);
            this.L$0 = channelIterator;
            this.L$1 = webView;
            this.L$2 = null;
            this.label = 3;
            obj = BuildersKt.withContext(coroutineDispatcher, oneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1, this);
            if (obj != objCopydefault) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webView = (WebView) this.L$1;
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            String str = "window.WKWebViewJavascriptBridge.nativeCall(\"" + this.this$0.copydefault.getAndIncrement() + "\", \"monitorCharacteristic\", " + ((String) obj) + ");";
            pUU.KWHzl("OneKeySDKJavaScriptEngine", "monitorCharacteristic: " + str);
            webView.evaluateJavascript(str, null);
            it = channelIterator2;
            this.L$0 = it;
            this.L$1 = null;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (((Boolean) obj).booleanValue()) {
                stateListAnimator = (C57149ycv.StateListAnimator) it.next();
                WebView webViewCopydefault = this.this$0.copydefault();
                if (webViewCopydefault == null) {
                    pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to monitorCharacteristic");
                    this.L$0 = it;
                    this.L$1 = null;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == objCopydefault) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                } else {
                    Job jobOLrzqt = stateListAnimator.OLrzqt();
                    this.L$0 = it;
                    this.L$1 = stateListAnimator;
                    this.L$2 = webViewCopydefault;
                    this.label = 2;
                    if (jobOLrzqt.join(this) == objCopydefault) {
                        return objCopydefault;
                    }
                    channelIterator = it;
                    webView = webViewCopydefault;
                    CoroutineDispatcher coroutineDispatcher2 = this.this$0.AhwBna;
                    OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1 oneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$12 = new OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1(stateListAnimator, null);
                    this.L$0 = channelIterator;
                    this.L$1 = webView;
                    this.L$2 = null;
                    this.label = 3;
                    obj = BuildersKt.withContext(coroutineDispatcher2, oneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$12, this);
                    if (obj != objCopydefault) {
                        return objCopydefault;
                    }
                    channelIterator2 = channelIterator;
                    String str2 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + this.this$0.copydefault.getAndIncrement() + "\", \"monitorCharacteristic\", " + ((String) obj) + ");";
                    pUU.KWHzl("OneKeySDKJavaScriptEngine", "monitorCharacteristic: " + str2);
                    webView.evaluateJavascript(str2, null);
                    it = channelIterator2;
                    this.L$0 = it;
                    this.L$1 = null;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == objCopydefault) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
        }
    }
}

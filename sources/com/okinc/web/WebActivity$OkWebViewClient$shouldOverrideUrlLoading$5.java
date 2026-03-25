package com.okinc.web;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.web.WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43238rlX;
import o.C33129mqd;
import o.C34704nhP;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C59449zhJ;
import o.InterfaceC43294rma;

/* JADX INFO: loaded from: classes19.dex */
public final class WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC43294rma $deeplinkService;
    final /* synthetic */ WebResourceRequest $request;
    final /* synthetic */ String $url;
    final /* synthetic */ WebView $view;
    int label;
    final /* synthetic */ WebActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5(WebView webView, InterfaceC43294rma interfaceC43294rma, WebActivity webActivity, String str, WebResourceRequest webResourceRequest, Continuation<? super WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5> continuation) {
        super(2, continuation);
        this.$view = webView;
        this.$deeplinkService = interfaceC43294rma;
        this.this$0 = webActivity;
        this.$url = str;
        this.$request = webResourceRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5(this.$view, this.$deeplinkService, this.this$0, this.$url, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String path;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1 webActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1 = new WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1(this.$deeplinkService, this.this$0, this.$url, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, webActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!Intrinsics.EZpvd((AbstractC43238rlX) obj, AbstractC43238rlX.StateListAnimator.OLrzqt)) {
            String[] strArrKWHzl = C34704nhP.copydefault.KWHzl();
            String str = this.$url;
            int length = strArrKWHzl.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (C59449zhJ.startsWith$default(str, strArrKWHzl[i2], false, 2, null)) {
                        WebView webView = this.$view;
                        if (webView != null) {
                            final WebActivity webActivity = this.this$0;
                            final InterfaceC43294rma interfaceC43294rma = this.$deeplinkService;
                            final String str2 = this.$url;
                            webActivity.OLrzqt(webView, RemoteMessageConst.Notification.CHANNEL_ID, (Function1<? super String, Unit>) new Function1() { // from class: o.ygb
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5.invokeSuspend$lambda$3(interfaceC43294rma, webActivity, str2, (java.lang.String) obj2);
                                }
                            });
                        } else {
                            InterfaceC43294rma.Application.processDeeplink$default(this.$deeplinkService, this.this$0, this.$url, null, new Function1() { // from class: o.yfW
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5.invokeSuspend$lambda$1((AbstractC43238rlX) obj2);
                                }
                            }, 4, null);
                        }
                    } else {
                        i2++;
                    }
                } else if (this.$deeplinkService.AkhnZx(this.$url)) {
                    this.$deeplinkService.KWHzl(this.this$0, this.$url, C56424yEw.KWHzl(), new Function1() { // from class: o.ygc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5.invokeSuspend$lambda$4((AbstractC43238rlX) obj2);
                        }
                    });
                } else {
                    WebActivity webActivity2 = this.this$0;
                    Uri url = this.$request.getUrl();
                    if (url == null || (path = url.getPath()) == null) {
                        path = "";
                    }
                    webActivity2.copydefault(path, "shouldOverrideUrlLoading");
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AbstractC43238rlX abstractC43238rlX) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(InterfaceC43294rma interfaceC43294rma, WebActivity webActivity, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C33129mqd.OLrzqt((CharSequence) str2)) {
            linkedHashMap.put(RemoteMessageConst.Notification.CHANNEL_ID, String.valueOf(str2));
        }
        interfaceC43294rma.KWHzl(webActivity, str, linkedHashMap, new Function1() { // from class: o.yge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5.invokeSuspend$lambda$3$lambda$2((AbstractC43238rlX) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(AbstractC43238rlX abstractC43238rlX) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(AbstractC43238rlX abstractC43238rlX) {
        return Unit.INSTANCE;
    }
}

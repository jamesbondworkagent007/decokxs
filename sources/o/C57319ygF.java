package o;

import android.content.DialogInterface;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import com.just.agentweb.AgentWeb;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.okuser.data.Token;
import com.okinc.web.WebStringEnum;
import com.okinc.web.view.IOKWebContentView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C57262yfB;
import o.C57319ygF;
import o.DialogInterfaceC33581mzE;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57319ygF extends android.widget.FrameLayout implements IOKWebContentView {
    private static final java.lang.String TAG = "CustomWebView";
    private static final java.lang.String WEB_IS_DEBUG = "web_is_debug";
    private boolean cache;
    private final C57350ygk dohInterceptor;
    private boolean isSpecial;
    private boolean isTelegram;
    private AgentWeb mAgentWeb;
    private C57330ygQ mBridgeWebViewManager;
    private StateListAnimator mWebChromeClient;
    private Activity mWebViewClient;
    private java.lang.String url;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57319ygF(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.dohInterceptor = new C57350ygk();
    }

    /* JADX INFO: renamed from: o.ygF$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ygF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final void loadUrl(java.lang.String str) {
        java.lang.String strInvoke;
        java.lang.String strInvoke2;
        java.lang.String strInvoke3;
        this.dohInterceptor.KWHzl(C43324rnD.AEQbTJ.KWHzl());
        this.mWebViewClient = new Activity(this, this.dohInterceptor);
        this.mWebChromeClient = new StateListAnimator(this, this.dohInterceptor);
        android.content.Context context = getContext();
        Intrinsics.copydefault(context, "");
        AgentWeb.CommonBuilder commonBuilderUseDefaultIndicator = AgentWeb.with((android.app.Activity) context).setAgentWebParent(this, new LinearLayout.LayoutParams(-1, -1)).useDefaultIndicator();
        Activity activity = this.mWebViewClient;
        AgentWeb agentWeb = null;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        AgentWeb.CommonBuilder webViewClient = commonBuilderUseDefaultIndicator.setWebViewClient(activity);
        StateListAnimator stateListAnimator = this.mWebChromeClient;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        AgentWeb.CommonBuilder webChromeClient = webViewClient.setWebChromeClient(stateListAnimator);
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C57262yfB.Application.OLrzqt, (android.view.ViewGroup) null);
        C55173xeu c55173xeu = (C55173xeu) viewInflate.findViewById(C57262yfB.Activity.copydefault);
        C57309yfw c57309yfw = C57309yfw.AEQbTJ;
        Function1<WebStringEnum, java.lang.String> function1Values = c57309yfw.values();
        if (function1Values == null || (strInvoke = function1Values.invoke(WebStringEnum.EMPTY_TITLE_ERROR)) == null) {
            strInvoke = "";
        }
        c55173xeu.setTitle(strInvoke);
        Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
        if (function1ZsXlph == null || (strInvoke2 = function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) == null) {
            strInvoke2 = "";
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) strInvoke2);
        Function1<WebStringEnum, java.lang.String> function1Values2 = c57309yfw.values();
        if (function1Values2 == null || (strInvoke3 = function1Values2.invoke(WebStringEnum.BTN_RELOAD)) == null) {
            strInvoke3 = "";
        }
        c55173xeu.setRetry(strInvoke3);
        viewInflate.setBackgroundColor(ContextCompat.getColor(viewInflate.getContext(), C52761wXj.Activity.registerUser));
        AgentWeb.CommonBuilder mainFrameErrorView = webChromeClient.setMainFrameErrorView(viewInflate);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        AgentWeb agentWebGo = mainFrameErrorView.setAgentWebWebSettings(new C57338ygY(context2, true, this.cache, this.isTelegram)).setSecurityType(AgentWeb.SecurityType.STRICT_CHECK).additionalHttpHeader(str, HttpHeaders.ACCEPT_LANGUAGE, pSC.AEQbTJ.KWHzl()).interceptUnkownUrl().createAgentWeb().ready().go(str);
        this.mAgentWeb = agentWebGo;
        if (agentWebGo == null) {
            Intrinsics.gEmmrt("");
            agentWebGo = null;
        }
        this.mBridgeWebViewManager = new C57330ygQ(agentWebGo.getWebCreator().getWebView());
        AgentWeb agentWeb2 = this.mAgentWeb;
        if (agentWeb2 == null) {
            Intrinsics.gEmmrt("");
            agentWeb2 = null;
        }
        agentWeb2.getWebCreator().getWebView().setBackgroundColor(C33070mpX.copydefault(C32113mPz.ActionBar.QbewEr));
        AgentWeb agentWeb3 = this.mAgentWeb;
        if (agentWeb3 == null) {
            Intrinsics.gEmmrt("");
            agentWeb3 = null;
        }
        android.webkit.WebView webView = agentWeb3.getWebCreator().getWebView();
        C57330ygQ c57330ygQ = this.mBridgeWebViewManager;
        if (c57330ygQ == null) {
            Intrinsics.gEmmrt("");
            c57330ygQ = null;
        }
        webView.addJavascriptInterface(new C57394yhb(c57330ygQ, str), "native");
        Activity activity2 = this.mWebViewClient;
        if (activity2 == null) {
            Intrinsics.gEmmrt("");
            activity2 = null;
        }
        C57345ygf c57345ygf = new C57345ygf(activity2.EZpvd());
        AgentWeb agentWeb4 = this.mAgentWeb;
        if (agentWeb4 == null) {
            Intrinsics.gEmmrt("");
            agentWeb4 = null;
        }
        agentWeb4.getWebCreator().getWebView().addJavascriptInterface(c57345ygf, "interception");
        android.webkit.WebView.setWebContentsDebuggingEnabled(SPUtils.getBoolean(WEB_IS_DEBUG, false));
        AgentWeb agentWeb5 = this.mAgentWeb;
        if (agentWeb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            agentWeb = agentWeb5;
        }
        agentWeb.getWebCreator().getWebView().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.ygJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C57319ygF.loadUrl$lambda$4(this.OLrzqt, view);
            }
        });
    }

    public static final boolean loadUrl$lambda$4(final C57319ygF c57319ygF, android.view.View view) {
        java.lang.String strInvoke;
        java.lang.String strInvoke2;
        java.lang.String strInvoke3;
        java.lang.String str = "";
        Intrinsics.copydefault(view, "");
        final WebView.HitTestResult hitTestResult = ((android.webkit.WebView) view).getHitTestResult();
        Intrinsics.checkNotNullExpressionValue(hitTestResult, "");
        int type = hitTestResult.getType();
        if (type != 5 && type != 8) {
            return true;
        }
        DialogInterfaceC33581mzE.TaskDescription taskDescription = new DialogInterfaceC33581mzE.TaskDescription(c57319ygF.getContext());
        C57309yfw c57309yfw = C57309yfw.AEQbTJ;
        Function1<WebStringEnum, java.lang.String> function1Values = c57309yfw.values();
        if (function1Values == null || (strInvoke = function1Values.invoke(WebStringEnum.BTN_SAVE_IMAGE)) == null) {
            strInvoke = "";
        }
        DialogInterfaceC33581mzE.TaskDescription taskDescriptionKWHzl = taskDescription.KWHzl(strInvoke);
        Function1<WebStringEnum, java.lang.String> function1Values2 = c57309yfw.values();
        if (function1Values2 == null || (strInvoke2 = function1Values2.invoke(WebStringEnum.BTN_CANCEL)) == null) {
            strInvoke2 = "";
        }
        DialogInterfaceC33581mzE.TaskDescription taskDescriptionKWHzl2 = taskDescriptionKWHzl.KWHzl(strInvoke2, null);
        Function1<WebStringEnum, java.lang.String> function1Values3 = c57309yfw.values();
        if (function1Values3 != null && (strInvoke3 = function1Values3.invoke(WebStringEnum.BTN_OK)) != null) {
            str = strInvoke3;
        }
        taskDescriptionKWHzl2.EZpvd(str, new DialogInterface.OnClickListener() { // from class: o.ygK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                C57319ygF.loadUrl$lambda$4$lambda$3(hitTestResult, c57319ygF, dialogInterface, i);
            }
        }).AEQbTJ();
        return true;
    }

    public static final void loadUrl$lambda$4$lambda$3(WebView.HitTestResult hitTestResult, C57319ygF c57319ygF, final android.content.DialogInterface dialogInterface, int i) {
        java.lang.String extra = hitTestResult.getExtra();
        if (extra == null) {
            extra = "";
        }
        C33610mzh c33610mzh = C33610mzh.OLrzqt;
        android.content.Context context = c57319ygF.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c33610mzh.copydefault(context, extra, new Function1() { // from class: o.ygM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57319ygF.loadUrl$lambda$4$lambda$3$lambda$2(dialogInterface, (java.lang.String) obj);
            }
        });
    }

    public static final Unit loadUrl$lambda$4$lambda$3$lambda$2(android.content.DialogInterface dialogInterface, java.lang.String str) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ygF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncToken$default(C57319ygF c57319ygF, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncToken");
        }
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.ygN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C57319ygF.syncToken$lambda$5((java.lang.String) obj2);
                }
            };
        }
        c57319ygF.syncToken(function1);
    }

    public static final Unit syncToken$lambda$5(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void syncToken(Function1<? super java.lang.String, Unit> function1) {
        java.lang.String value;
        Token tokenAhwBna = C43292rmY.OLrzqt.AwvSrB().AhwBna();
        if (tokenAhwBna == null || (value = tokenAhwBna.getValue()) == null) {
            return;
        }
        saveToLocalStorage("token", value);
        function1.invoke(value);
    }

    public final void saveToLocalStorage(final java.lang.String str, final java.lang.String str2) {
        AgentWeb agentWeb = this.mAgentWeb;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebCreator().getWebView().evaluateJavascript("window.localStorage.getItem('" + str + "');", new android.webkit.ValueCallback() { // from class: o.ygL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C57319ygF.saveToLocalStorage$lambda$6(str2, this, str, (java.lang.String) obj);
            }
        });
    }

    public static final void saveToLocalStorage$lambda$6(java.lang.String str, C57319ygF c57319ygF, java.lang.String str2, java.lang.String str3) {
        if (!android.text.TextUtils.isEmpty(str3)) {
            Intrinsics.copydefault((java.lang.Object) str3);
            if (Intrinsics.EZpvd((java.lang.Object) C59449zhJ.replace$default(str3, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "", false, 4, (java.lang.Object) null), (java.lang.Object) C59449zhJ.replace$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "", false, 4, (java.lang.Object) null))) {
                return;
            }
        }
        AgentWeb agentWeb = c57319ygF.mAgentWeb;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebCreator().getWebView().evaluateJavascript("window.localStorage.setItem('" + str2 + "','" + str + "');", null);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "");
        AgentWeb agentWeb = this.mAgentWeb;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        if (agentWeb.handleKeyEvent(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: renamed from: o.ygF$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public final class Activity extends com.just.agentweb.WebViewClient {
        public final C57350ygk AEQbTJ;
        public final /* synthetic */ C57319ygF EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C57350ygk EZpvd() {
            return this.AEQbTJ;
        }

        public Activity(@NotNull C57319ygF c57319ygF, C57350ygk c57350ygk) {
            Intrinsics.checkNotNullParameter(c57350ygk, "");
            this.EZpvd = c57319ygF;
            this.AEQbTJ = c57350ygk;
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(@NotNull android.webkit.WebView webView, @NotNull android.webkit.WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            return this.AEQbTJ.KWHzl(webView, webResourceRequest);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull android.webkit.WebView webView, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String strAEQbTJ = C34704nhP.copydefault.AEQbTJ();
            if (C59449zhJ.startsWith$default(str, strAEQbTJ, false, 2, null)) {
                java.lang.String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(str, strAEQbTJ, (java.lang.String) null, 2, (java.lang.Object) null);
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, strSubstringAfter$default, null, new Function1() { // from class: o.ygS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C57319ygF.Activity.OLrzqt((AbstractC43238rlX) obj);
                    }
                }, 4, null);
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            java.lang.String strAEQbTJ = C34704nhP.copydefault.AEQbTJ();
            java.lang.String str = this.EZpvd.url;
            if (str == null) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            if (C59449zhJ.startsWith$default(str, strAEQbTJ, false, 2, null)) {
                java.lang.String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(str, strAEQbTJ, (java.lang.String) null, 2, (java.lang.Object) null);
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, strSubstringAfter$default, null, new Function1() { // from class: o.ygR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C57319ygF.Activity.AEQbTJ((AbstractC43238rlX) obj);
                    }
                }, 4, null);
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            C57319ygF.syncToken$default(this.EZpvd, null, 1, null);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
            if (sslErrorHandler != null) {
                try {
                    sslErrorHandler.cancel();
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
            pUU.valueOf(C57319ygF.TAG, "onReceivedSslError: " + sslError);
        }
    }

    /* JADX INFO: renamed from: o.ygF$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public final class StateListAnimator extends com.just.agentweb.WebChromeClient {
        public int AEQbTJ;
        public final /* synthetic */ C57319ygF EZpvd;
        public final C57350ygk OLrzqt;

        public StateListAnimator(@NotNull C57319ygF c57319ygF, C57350ygk c57350ygk) {
            Intrinsics.checkNotNullParameter(c57350ygk, "");
            this.EZpvd = c57319ygF;
            this.OLrzqt = c57350ygk;
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
            if (permissionRequest != null) {
                permissionRequest.grant(permissionRequest.getResources());
            }
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            C57330ygQ c57330ygQ = this.EZpvd.mBridgeWebViewManager;
            if (c57330ygQ == null) {
                Intrinsics.gEmmrt("");
                c57330ygQ = null;
            }
            C35962oKd.copydefault(c57330ygQ, str2);
            if (jsPromptResult == null) {
                return true;
            }
            jsPromptResult.confirm("JsBridge");
            return true;
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i) {
            if (this.AEQbTJ != i) {
                this.AEQbTJ = i;
                super.onProgressChanged(webView, i);
            }
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onShowFileChooser(@NotNull android.webkit.WebView webView, @NotNull android.webkit.ValueCallback<android.net.Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            android.content.Context context = this.EZpvd.getContext();
            Intrinsics.copydefault(context, "");
            android.app.Activity activity = (android.app.Activity) context;
            AgentWeb agentWeb = this.EZpvd.mAgentWeb;
            if (agentWeb == null) {
                Intrinsics.gEmmrt("");
                agentWeb = null;
            }
            return C57316ygC.KWHzl(activity, webView, valueCallback, fileChooserParams, agentWeb.getPermissionInterceptor(), null, null, null, new android.webkit.ValueCallback() { // from class: o.ygO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    C57319ygF.StateListAnimator.AEQbTJ(this.OLrzqt, (android.util.Pair) obj);
                }
            });
        }

        public static final void AEQbTJ(StateListAnimator stateListAnimator, android.util.Pair pair) {
            java.lang.Object obj = pair.first;
            if (obj == null || pair.second == null) {
                return;
            }
            C57350ygk c57350ygk = stateListAnimator.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(obj, "");
            java.lang.Object obj2 = pair.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            c57350ygk.copydefault((java.lang.String) obj, (android.net.Uri) obj2);
        }
    }

    @Override // com.okinc.web.view.IOKWebContentView
    public void url(java.lang.String str) {
        if (str != null) {
            this.url = str;
            loadUrl(resolveUrl$default(this, str, null, 2, null));
        }
    }

    @Override // com.okinc.web.view.IOKWebContentView
    public void url(@NotNull java.lang.String str, @NotNull SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(subdomainStrategy, "");
        this.url = str;
        this.dohInterceptor.EZpvd(subdomainStrategy);
        loadUrl(resolveUrl(str, subdomainStrategy));
    }

    public static /* synthetic */ java.lang.String resolveUrl$default(C57319ygF c57319ygF, java.lang.String str, SubdomainStrategy subdomainStrategy, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveUrl");
        }
        if ((i & 2) != 0) {
            subdomainStrategy = SubdomainStrategy.Auto.KWHzl;
        }
        return c57319ygF.resolveUrl(str, subdomainStrategy);
    }

    public java.lang.String resolveUrl(@NotNull java.lang.String str, @NotNull SubdomainStrategy subdomainStrategy) {
        android.net.Uri uri;
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(subdomainStrategy, "");
        if (!this.isSpecial) {
            if (str.length() > 0) {
                if (android.text.TextUtils.isEmpty(android.net.Uri.parse(str).getScheme())) {
                    str = C6813aWU.AEQbTJ(str);
                }
            } else {
                str = C57309yfw.AEQbTJ.DbNXlk();
            }
        }
        java.lang.String strReplace$default = str;
        C34704nhP c34704nhP = C34704nhP.copydefault;
        if (c34704nhP.copydefault()) {
            strReplace$default = C59449zhJ.replace$default(strReplace$default, "okexcomweb.bafang.com", C57354ygo.OLrzqt.KWHzl().invoke(), false, 4, (java.lang.Object) null);
        }
        java.lang.String strOLrzqt = strReplace$default;
        if (c34704nhP.EZpvd()) {
            strOLrzqt = C59449zhJ.replace$default(C59449zhJ.replace$default(strOLrzqt, "okcoincomweb.bafang.com", "www.okcoin.com", false, 4, (java.lang.Object) null), "okcoinzendesk.bafang.com", "support.okcoin.com", false, 4, (java.lang.Object) null);
        }
        try {
            uri = android.net.Uri.parse(strOLrzqt);
        } catch (java.lang.Exception unused) {
            uri = null;
        }
        if (uri != null && !C57354ygo.OLrzqt.KWHzl(uri)) {
            strOLrzqt = C43324rnD.AEQbTJ.OLrzqt(strOLrzqt, subdomainStrategy);
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(android.net.Uri.parse(strOLrzqt).getHost());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.String strInvoke = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        C57350ygk c57350ygk = this.dohInterceptor;
        if (strInvoke == null) {
            strInvoke = C57354ygo.OLrzqt.KWHzl().invoke();
        }
        c57350ygk.AhwBna(strInvoke);
        pUU.KWHzl(TAG, "resolved url: " + strOLrzqt);
        return strOLrzqt;
    }
}

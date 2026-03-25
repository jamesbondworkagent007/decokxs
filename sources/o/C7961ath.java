package o;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.ConsoleMessage;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.bumptech.glide.Glide;
import com.immomo.mls.view.hybrid.IJsBridge;
import com.immomo.mls.view.hybrid.JsBridge;
import com.immomo.mls.view.hybrid.handler.DefaultHandlers;
import com.immomo.mls.view.hybrid.handler.impl.DomHeightChangeHandler;
import com.immomo.mls.view.hybrid.handler.impl.HyperLinkHandler;
import com.immomo.mls.view.hybrid.handler.impl.ImageGalleryHandler;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48864udi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ath, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7961ath extends android.webkit.WebView implements IJsBridge {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public IJsBridge AEQbTJ;
    public final int AYXKKw;
    public IJsBridge.InjectHtmlContentPayload KWHzl;
    public volatile boolean OLrzqt;
    public java.lang.String copydefault;
    public Function1<? super java.lang.Integer, Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7961ath(@NotNull android.content.Context context) {
        this(context, null, 0, null, 0, 30, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7961ath(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 0, 28, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7961ath(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 0, 24, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnProgressChangeListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    @Override // com.immomo.mls.view.hybrid.IJsBridge
    public void registerExtensionCallback(@NotNull java.lang.String str, @NotNull Function1<? super InterfaceC7973att, Unit> function1) {
        IJsBridge.StateListAnimator.OLrzqt(this, str, function1);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r9v0 android.util.AttributeSet))
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-100 int) : (r12v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, java.lang.String, int):void (m)] (LINE:40) call: o.ath.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.String, int):void type: THIS */
    public /* synthetic */ C7961ath(android.content.Context context, android.util.AttributeSet attributeSet, int i, java.lang.String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? -100 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7961ath(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, java.lang.String str, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = i2;
        this.copydefault = str;
        EZpvd();
        copydefault();
        OLrzqt(new JsBridge(this));
        loadUrl(djBIcL());
        KWHzl();
        setOnLongClickListener(new View.OnLongClickListener() { // from class: o.atf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C7961ath.AEQbTJ(view);
            }
        });
    }

    /* JADX INFO: renamed from: o.ath$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ath.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final boolean AEQbTJ(android.view.View view) {
        pUU.valueOf("HybridWebView", "try long click to select content, here we ignored");
        return true;
    }

    public final void EZpvd() {
        android.webkit.WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(0);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setLoadsImagesAutomatically(true);
        if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
            if (AEQbTJ()) {
                WebSettingsCompat.setForceDark(settings, 2);
                pUU.KWHzl("HybridWebView", "set force dark: FORCE_DARK_ON");
                return;
            } else {
                WebSettingsCompat.setForceDark(settings, 0);
                pUU.KWHzl("HybridWebView", "set force dark: FORCE_DARK_OFF");
                return;
            }
        }
        pUU.valueOf("HybridWebView", "WebViewFeature not support set force dark");
    }

    private final java.lang.String djBIcL() {
        java.lang.String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ("file_okmarket_community_webview_android");
        if (strAEQbTJ != null) {
            java.io.File file = new java.io.File(strAEQbTJ, "hybrid/index.html");
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                java.lang.String str = "file://" + file.getAbsolutePath();
                if (str != null) {
                    return str;
                }
            }
        }
        return "file:///android_asset/hybrid/index.html";
    }

    @Override // android.webkit.WebView
    public final void loadUrl(@NotNull java.lang.String str) {
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            str2 = "&cssName=" + this.copydefault;
        }
        java.lang.String str3 = str + "?darkMode=" + AEQbTJ() + str2;
        pUU.KWHzl("HybridWebView", "loadUrl: " + str3);
        super.loadUrl(str3);
    }

    public final boolean AEQbTJ() {
        AppCompatDelegate delegate;
        int i = this.AYXKKw;
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AppCompatActivity appCompatActivityOLrzqt = OLrzqt(context);
            java.lang.Integer numValueOf = (appCompatActivityOLrzqt == null || (delegate = appCompatActivityOLrzqt.getDelegate()) == null) ? null : java.lang.Integer.valueOf(delegate.getLocalNightMode());
            if (numValueOf != null && numValueOf.intValue() == 2) {
                return true;
            }
            if (numValueOf == null || numValueOf.intValue() != 1) {
                return C33492mxV.OLrzqt();
            }
        }
        return false;
    }

    public final AppCompatActivity OLrzqt(android.content.Context context) {
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        return OLrzqt(baseContext);
    }

    public final void copydefault() {
        setWebViewClient(new TaskDescription(new Function1() { // from class: o.atn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C7961ath.OLrzqt(this.KWHzl, (java.lang.String) obj));
            }
        }));
        setWebChromeClient(new Activity());
    }

    public static final boolean OLrzqt(C7961ath c7961ath, java.lang.String str) {
        java.util.List<IJsBridge.InjectHtmlContentPayload.ImgConfig> imgConfigList;
        IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload = c7961ath.KWHzl;
        java.lang.Object obj = null;
        if (injectHtmlContentPayload != null && (imgConfigList = injectHtmlContentPayload.getImgConfigList()) != null) {
            java.util.Iterator<T> it = imgConfigList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((IJsBridge.InjectHtmlContentPayload.ImgConfig) next).getSrc(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            obj = (IJsBridge.InjectHtmlContentPayload.ImgConfig) obj;
        }
        return obj != null;
    }

    public final void OLrzqt(IJsBridge iJsBridge) {
        addJavascriptInterface(iJsBridge, "AndroidApi");
        this.AEQbTJ = iJsBridge;
    }

    /* JADX INFO: renamed from: o.ath$ActionBar */
    public static final class ActionBar implements AbstractC48864udi.ActionBar {
        @Override // o.AbstractC48864udi.ActionBar
        public void AEQbTJ(long j, long j2) {
            AbstractC48864udi.ActionBar.C0977ActionBar.OLrzqt(this, j, j2);
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("HybridWebView", "download bundle success: " + str);
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void OLrzqt(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.AEQbTJ("HybridWebView", "download bundle failed", th);
        }
    }

    public final void KWHzl() {
        C48872udq.AEQbTJ.OLrzqt("file_okmarket_community_webview_android", new ActionBar());
    }

    public final void OLrzqt() {
        this.OLrzqt = true;
        setHtmlContent$default(this, null, true, 1, null);
    }

    public final void setHtmlContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setHtmlContent(str, (java.util.List<IJsBridge.InjectHtmlContentPayload.ImgConfig>) null);
    }

    public final void setHtmlContent(@NotNull java.lang.String str, java.util.List<IJsBridge.InjectHtmlContentPayload.ImgConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        setHtmlContent$default(this, new IJsBridge.InjectHtmlContentPayload(str, list), false, 2, null);
    }

    public static /* synthetic */ void setHtmlContent$default(C7961ath c7961ath, IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHtmlContent");
        }
        if ((i & 1) != 0) {
            injectHtmlContentPayload = c7961ath.KWHzl;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c7961ath.setHtmlContent(injectHtmlContentPayload, z);
    }

    public final void setHtmlContent(IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload, boolean z) {
        if (injectHtmlContentPayload == null) {
            return;
        }
        if (!Intrinsics.EZpvd(this.KWHzl, injectHtmlContentPayload) || z) {
            this.KWHzl = injectHtmlContentPayload;
            if (this.OLrzqt) {
                injectHtmlContent(injectHtmlContentPayload);
            }
        }
    }

    @Override // com.immomo.mls.view.hybrid.IJsBridge
    public void invokeNativeApi(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IJsBridge iJsBridge = this.AEQbTJ;
        if (iJsBridge == null) {
            Intrinsics.gEmmrt("");
            iJsBridge = null;
        }
        iJsBridge.invokeNativeApi(str, str2);
    }

    @Override // com.immomo.mls.view.hybrid.IJsBridge
    public void injectHtmlContent(IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload) {
        IJsBridge iJsBridge = this.AEQbTJ;
        if (iJsBridge == null) {
            Intrinsics.gEmmrt("");
            iJsBridge = null;
        }
        iJsBridge.injectHtmlContent(injectHtmlContentPayload);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: renamed from: o.ath$TaskDescription */
    public static final class TaskDescription extends android.webkit.WebViewClient {
        public final Function1<java.lang.String, java.lang.Boolean> EZpvd;

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull Function1<? super java.lang.String, java.lang.Boolean> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull android.webkit.WebView webView, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            C7961ath c7961ath = webView instanceof C7961ath ? (C7961ath) webView : null;
            if (c7961ath != null) {
                c7961ath.OLrzqt();
            }
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(@NotNull android.webkit.WebView webView, @NotNull android.webkit.WebResourceRequest webResourceRequest) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            C7961ath c7961ath = webView instanceof C7961ath ? (C7961ath) webView : null;
            if (c7961ath == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            if (!this.EZpvd.invoke(webResourceRequest.getUrl().toString()).booleanValue()) {
                pUU.valueOf("HybridWebView", "interceptRequest ignore: " + webResourceRequest.getUrl());
                return null;
            }
            if (webResourceRequest.getUrl().getPath() != null) {
                pUU.KWHzl("HybridWebView", "interceptRequest: " + webResourceRequest.getUrl());
                try {
                    Result.Application application = Result.Companion;
                    C5448Sc c5448ScAEQbTJ = new C5448Sc().AEQbTJ(new C5405Ql(), new C5417Qx(12));
                    Intrinsics.checkNotNullExpressionValue(c5448ScAEQbTJ, "");
                    android.graphics.Bitmap bitmap = Glide.AEQbTJ(c7961ath.getContext()).EZpvd().OLrzqt((RX<?>) c5448ScAEQbTJ).EZpvd(webResourceRequest.getUrl()).AEQbTJ().get();
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    objM7377constructorimpl = Result.m7377constructorimpl(new android.webkit.WebResourceResponse("image/*", com.google.android.exoplayer2.C.UTF8_NAME, new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray())));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("HybridWebView", "interceptRequest error", thM7380exceptionOrNullimpl);
                }
                android.webkit.WebResourceResponse webResourceResponse = (android.webkit.WebResourceResponse) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (webResourceResponse != null) {
                    pUU.KWHzl("HybridWebView", "interceptRequest image: " + webResourceRequest.getUrl());
                    return webResourceResponse;
                }
            }
            return super.shouldInterceptRequest(c7961ath, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            pUU.copydefault("HybridWebView", "onReceivedError: " + ((java.lang.Object) (webResourceError != null ? webResourceError.getDescription() : null)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            pUU.copydefault("HybridWebView", "onReceivedHttpError: " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null));
        }
    }

    /* JADX INFO: renamed from: o.ath$Activity */
    public static final class Activity extends android.webkit.WebChromeClient {

        /* JADX INFO: renamed from: o.ath$Activity$Application */
        /* JADX INFO: loaded from: classes14.dex */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
                try {
                    iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                EZpvd = iArr;
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            int iLineNumber = consoleMessage != null ? consoleMessage.lineNumber() : -1;
            java.lang.String strMessage = consoleMessage != null ? consoleMessage.message() : null;
            ConsoleMessage.MessageLevel messageLevel = consoleMessage != null ? consoleMessage.messageLevel() : null;
            int i = messageLevel != null ? Application.EZpvd[messageLevel.ordinal()] : -1;
            if (i == 1) {
                pUU.copydefault("HybridWebView", "onJsMsg: [L:" + iLineNumber + "], " + strMessage);
            } else if (i == 2) {
                pUU.valueOf("HybridWebView", "onJsMsg: [L:" + iLineNumber + "], " + strMessage);
            } else {
                pUU.KWHzl("HybridWebView", "onJsMsg: [L:" + iLineNumber + "], " + strMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i) {
            Function1 function1;
            super.onProgressChanged(webView, i);
            C7961ath c7961ath = webView instanceof C7961ath ? (C7961ath) webView : null;
            if (c7961ath == null || (function1 = c7961ath.djBIcL) == null) {
                return;
            }
            function1.invoke(java.lang.Integer.valueOf(i));
        }
    }

    public final void setOnContentUpdatedListener(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        IJsBridge iJsBridge = this.AEQbTJ;
        if (iJsBridge == null) {
            Intrinsics.gEmmrt("");
            iJsBridge = null;
        }
        iJsBridge.registerExtensionCallback(DefaultHandlers.CONTENT_UPDATED.getHandlerName(), new Function1() { // from class: o.ate
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7961ath.AEQbTJ(function0, (InterfaceC7973att) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function0 function0, InterfaceC7973att interfaceC7973att) {
        Intrinsics.checkNotNullParameter(interfaceC7973att, "");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void setOnWebViewHeightUpdatedListener(@NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        IJsBridge iJsBridge = this.AEQbTJ;
        if (iJsBridge == null) {
            Intrinsics.gEmmrt("");
            iJsBridge = null;
        }
        iJsBridge.registerExtensionCallback(DefaultHandlers.WEB_VIEW_DOM_HEIGHT_CHANGED.getHandlerName(), new Function1() { // from class: o.atk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7961ath.AEQbTJ(function1, (InterfaceC7973att) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function1 function1, InterfaceC7973att interfaceC7973att) {
        Intrinsics.checkNotNullParameter(interfaceC7973att, "");
        DomHeightChangeHandler domHeightChangeHandler = interfaceC7973att instanceof DomHeightChangeHandler ? (DomHeightChangeHandler) interfaceC7973att : null;
        if (domHeightChangeHandler != null) {
            function1.invoke(java.lang.Integer.valueOf(domHeightChangeHandler.getHeight$MLN_mlnservics()));
        }
        return Unit.INSTANCE;
    }

    public final void setOnHyperLinkClickListener(@NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        IJsBridge iJsBridge = this.AEQbTJ;
        if (iJsBridge == null) {
            Intrinsics.gEmmrt("");
            iJsBridge = null;
        }
        iJsBridge.registerExtensionCallback(DefaultHandlers.OPEN_HYPER_LINK.getHandlerName(), new Function1() { // from class: o.atm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7961ath.OLrzqt(function1, (InterfaceC7973att) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, InterfaceC7973att interfaceC7973att) {
        Intrinsics.checkNotNullParameter(interfaceC7973att, "");
        HyperLinkHandler hyperLinkHandler = interfaceC7973att instanceof HyperLinkHandler ? (HyperLinkHandler) interfaceC7973att : null;
        if (hyperLinkHandler != null) {
            function1.invoke(hyperLinkHandler.getUrl$MLN_mlnservics());
        }
        return Unit.INSTANCE;
    }

    public final void setOnImgClickListener(@NotNull final Function2<? super java.lang.Integer, ? super ImageGalleryHandler, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        IJsBridge iJsBridge = this.AEQbTJ;
        if (iJsBridge == null) {
            Intrinsics.gEmmrt("");
            iJsBridge = null;
        }
        iJsBridge.registerExtensionCallback(DefaultHandlers.PREVIEW_IMAGE_GALLERY.getHandlerName(), new Function1() { // from class: o.atj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7961ath.AEQbTJ(function2, (InterfaceC7973att) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function2 function2, InterfaceC7973att interfaceC7973att) {
        Intrinsics.checkNotNullParameter(interfaceC7973att, "");
        ImageGalleryHandler imageGalleryHandler = interfaceC7973att instanceof ImageGalleryHandler ? (ImageGalleryHandler) interfaceC7973att : null;
        if (imageGalleryHandler != null) {
            function2.invoke(java.lang.Integer.valueOf(imageGalleryHandler.getDefaultSelectIndex()), imageGalleryHandler);
        }
        return Unit.INSTANCE;
    }
}

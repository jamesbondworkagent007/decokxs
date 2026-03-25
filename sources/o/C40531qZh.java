package o;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.ConsoleMessage;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.bumptech.glide.Glide;
import com.okinc.market.widget.hybrid.IJsBridge;
import com.okinc.market.widget.hybrid.JsBridge;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48864udi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qZh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C40531qZh extends android.webkit.WebView implements IJsBridge {
    public volatile boolean EZpvd;
    public IJsBridge.InjectHtmlContentPayload KWHzl;
    public Function1<? super java.lang.Integer, Unit> OLrzqt;
    public IJsBridge copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40531qZh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40531qZh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.qZh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40531qZh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40531qZh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
        KWHzl();
        AEQbTJ(new JsBridge(this));
        loadUrl(OLrzqt());
        EZpvd();
        setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C40531qZh.OLrzqt(view);
            }
        });
    }

    /* JADX INFO: renamed from: o.qZh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qZh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final boolean OLrzqt(android.view.View view) {
        pUU.valueOf("HybridWebView", "try long click to select content, here we ignored");
        return true;
    }

    public final void copydefault() {
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
            if (C33492mxV.OLrzqt()) {
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

    private final java.lang.String OLrzqt() {
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
        Intrinsics.checkNotNullParameter(str, "");
        super.loadUrl(str + "?darkMode=" + C33492mxV.OLrzqt());
    }

    public final void KWHzl() {
        setWebViewClient(new Activity(new Function1() { // from class: o.qZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C40531qZh.copydefault(this.KWHzl, (java.lang.String) obj));
            }
        }));
        setWebChromeClient(new TaskDescription());
    }

    public static final boolean copydefault(C40531qZh c40531qZh, java.lang.String str) {
        java.util.List<IJsBridge.InjectHtmlContentPayload.ImgConfig> imgConfigList;
        IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload = c40531qZh.KWHzl;
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

    public final void AEQbTJ(IJsBridge iJsBridge) {
        addJavascriptInterface(iJsBridge, "AndroidApi");
        this.copydefault = iJsBridge;
    }

    /* JADX INFO: renamed from: o.qZh$Application */
    public static final class Application implements AbstractC48864udi.ActionBar {
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

    public final void EZpvd() {
        C48872udq.AEQbTJ.OLrzqt("file_okmarket_community_webview_android", new Application());
    }

    public final void AEQbTJ() {
        this.EZpvd = true;
        setHtmlContent$default(this, null, true, 1, null);
    }

    public final void setHtmlContent(@NotNull java.lang.String str, java.util.List<IJsBridge.InjectHtmlContentPayload.ImgConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        setHtmlContent$default(this, new IJsBridge.InjectHtmlContentPayload(str, list), false, 2, null);
    }

    public static /* synthetic */ void setHtmlContent$default(C40531qZh c40531qZh, IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHtmlContent");
        }
        if ((i & 1) != 0) {
            injectHtmlContentPayload = c40531qZh.KWHzl;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c40531qZh.setHtmlContent(injectHtmlContentPayload, z);
    }

    public final void setHtmlContent(IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload, boolean z) {
        if (injectHtmlContentPayload == null) {
            return;
        }
        if (!Intrinsics.EZpvd(this.KWHzl, injectHtmlContentPayload) || z) {
            this.KWHzl = injectHtmlContentPayload;
            if (this.EZpvd) {
                injectHtmlContent(injectHtmlContentPayload);
            }
        }
    }

    @Override // com.okinc.market.widget.hybrid.IJsBridge
    public void invokeNativeApi(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IJsBridge iJsBridge = this.copydefault;
        if (iJsBridge == null) {
            Intrinsics.gEmmrt("");
            iJsBridge = null;
        }
        iJsBridge.invokeNativeApi(str, str2);
    }

    @Override // com.okinc.market.widget.hybrid.IJsBridge
    public void injectHtmlContent(IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload) {
        IJsBridge iJsBridge = this.copydefault;
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

    /* JADX INFO: renamed from: o.qZh$Activity */
    public static final class Activity extends android.webkit.WebViewClient {
        public final Function1<java.lang.String, java.lang.Boolean> EZpvd;

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull Function1<? super java.lang.String, java.lang.Boolean> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull android.webkit.WebView webView, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            C40531qZh c40531qZh = webView instanceof C40531qZh ? (C40531qZh) webView : null;
            if (c40531qZh != null) {
                c40531qZh.AEQbTJ();
            }
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(@NotNull android.webkit.WebView webView, @NotNull android.webkit.WebResourceRequest webResourceRequest) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            C40531qZh c40531qZh = webView instanceof C40531qZh ? (C40531qZh) webView : null;
            if (c40531qZh == null) {
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
                    android.graphics.Bitmap bitmap = Glide.AEQbTJ(c40531qZh.getContext()).EZpvd().OLrzqt((RX<?>) c5448ScAEQbTJ).EZpvd(webResourceRequest.getUrl()).AEQbTJ().get();
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
            return super.shouldInterceptRequest(c40531qZh, webResourceRequest);
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

    /* JADX INFO: renamed from: o.qZh$TaskDescription */
    public static final class TaskDescription extends android.webkit.WebChromeClient {

        /* JADX INFO: renamed from: o.qZh$TaskDescription$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] AEQbTJ;

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
                AEQbTJ = iArr;
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            int iLineNumber = consoleMessage != null ? consoleMessage.lineNumber() : -1;
            java.lang.String strMessage = consoleMessage != null ? consoleMessage.message() : null;
            ConsoleMessage.MessageLevel messageLevel = consoleMessage != null ? consoleMessage.messageLevel() : null;
            int i = messageLevel != null ? ActionBar.AEQbTJ[messageLevel.ordinal()] : -1;
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
            C40531qZh c40531qZh = webView instanceof C40531qZh ? (C40531qZh) webView : null;
            if (c40531qZh == null || (function1 = c40531qZh.OLrzqt) == null) {
                return;
            }
            function1.invoke(java.lang.Integer.valueOf(i));
        }
    }
}

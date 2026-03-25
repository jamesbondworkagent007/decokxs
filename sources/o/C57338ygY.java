package o;

import android.os.Build;
import android.webkit.WebSettings;
import com.just.agentweb.AbsAgentWebSettings;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.AgentWebConfig;
import com.just.agentweb.AgentWebUtils;
import com.just.agentweb.IAgentWebSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57338ygY extends AbsAgentWebSettings {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final android.content.Context AEQbTJ;
    public android.webkit.WebSettings AYXKKw;
    public final boolean EZpvd;
    public java.lang.String KWHzl;
    public final boolean copydefault;
    public final boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.just.agentweb.AbsAgentWebSettings
    public void bindAgentWebSupport(AgentWeb agentWeb) {
        this.mAgentWeb = agentWeb;
    }

    public C57338ygY(@NotNull android.content.Context context, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.copydefault = z;
        this.EZpvd = z2;
        this.djBIcL = z3;
    }

    /* JADX INFO: renamed from: o.ygY$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ygY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // com.just.agentweb.AbsAgentWebSettings, com.just.agentweb.IAgentWebSettings
    public IAgentWebSettings<?> toSetting(android.webkit.WebView webView) throws java.lang.Throwable {
        IAgentWebSettings agentWebSettings;
        android.webkit.WebSettings webSettings;
        if (webView == null) {
            return this;
        }
        OLrzqt(webView);
        getWebSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getWebSettings().setLoadWithOverviewMode(true);
        getWebSettings().setUseWideViewPort(true);
        getWebSettings().setSupportZoom(true);
        getWebSettings().setBuiltInZoomControls(true);
        getWebSettings().setDisplayZoomControls(false);
        getWebSettings().setMinimumFontSize(1);
        getWebSettings().setAllowFileAccess(true);
        AgentWeb agentWeb = this.mAgentWeb;
        this.KWHzl = (agentWeb == null || (agentWebSettings = agentWeb.getAgentWebSettings()) == null || (webSettings = agentWebSettings.getWebSettings()) == null) ? null : webSettings.getUserAgentString();
        if (this.copydefault) {
            getWebSettings().setUserAgentString(OLrzqt(true));
        }
        getWebSettings().setJavaScriptEnabled(true);
        getWebSettings().setDatabaseEnabled(true);
        getWebSettings().setDomStorageEnabled(true);
        getWebSettings().setAllowFileAccess(true);
        getWebSettings().setAllowContentAccess(true);
        if (this.EZpvd) {
            getWebSettings().setCacheMode(1);
        }
        if (this.djBIcL) {
            getWebSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            getWebSettings().setSupportMultipleWindows(true);
        }
        return this;
    }

    public final void OLrzqt(android.webkit.WebView webView) throws java.lang.Throwable {
        android.webkit.WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        this.AYXKKw = settings;
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(false);
        settings.setSavePassword(false);
        if (AgentWebUtils.checkNetwork(webView.getContext().getApplicationContext())) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        settings.setMixedContentMode(0);
        webView.setLayerType(2, null);
        settings.setTextZoom(100);
        settings.setDatabaseEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportMultipleWindows(false);
        settings.setBlockNetworkImage(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setLoadWithOverviewMode(false);
        settings.setUseWideViewPort(false);
        settings.setDomStorageEnabled(true);
        settings.setNeedInitialFocus(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setDefaultFontSize(16);
        settings.setMinimumFontSize(12);
        settings.setGeolocationEnabled(true);
        java.lang.String cachePath = AgentWebConfig.getCachePath(webView.getContext());
        pUU.KWHzl("OKWebSettings", "dir:" + cachePath + "   appcache:" + AgentWebConfig.getCachePath(webView.getContext()));
        settings.setGeolocationDatabasePath(cachePath);
        settings.setDatabasePath(cachePath);
        settings.setUserAgentString(getWebSettings().getUserAgentString() + " AgentWeb/3.1.0 Mobile Safari/537.36");
        pUU.KWHzl("OKWebSettings", "UserAgentString : " + settings.getUserAgentString());
        if (Build.VERSION.SDK_INT >= 28) {
            android.content.Context context = webView.getContext();
            java.lang.String strEZpvd = C38352pVp.EZpvd(context);
            if (Intrinsics.EZpvd((java.lang.Object) context.getApplicationContext().getPackageName(), (java.lang.Object) strEZpvd)) {
                return;
            }
            android.webkit.WebView.setDataDirectorySuffix(strEZpvd);
        }
    }

    @Override // com.just.agentweb.AbsAgentWebSettings, com.just.agentweb.IAgentWebSettings
    public android.webkit.WebSettings getWebSettings() {
        android.webkit.WebSettings webSettings = this.AYXKKw;
        Intrinsics.copydefault(webSettings);
        return webSettings;
    }

    public final java.lang.String OLrzqt(boolean z) {
        if (!z) {
            return this.KWHzl;
        }
        return C43384roK.KWHzl.valueOf() + " " + this.KWHzl;
    }
}

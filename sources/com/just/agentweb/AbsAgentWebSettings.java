package com.just.agentweb;

import android.content.Context;
import android.os.Build;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsAgentWebSettings implements IAgentWebSettings, WebListenerManager {
    private static final String TAG = "AbsAgentWebSettings";
    public static final String USERAGENT_AGENTWEB = " AgentWeb/1.0 ";
    public static final String USERAGENT_QQ_BROWSER = " MQQBrowser/8.0 ";
    public static final String USERAGENT_UC = " UCBrowser/11.6.4.950 ";
    public AgentWeb mAgentWeb;
    private WebSettings mWebSettings;

    public abstract void bindAgentWebSupport(AgentWeb agentWeb);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.just.agentweb.IAgentWebSettings
    public WebSettings getWebSettings() {
        return this.mWebSettings;
    }

    public static AbsAgentWebSettings getInstance() {
        return new AgentWebSettingsImpl();
    }

    public final void bindAgentWeb(AgentWeb agentWeb) {
        this.mAgentWeb = agentWeb;
        bindAgentWebSupport(agentWeb);
    }

    @Override // com.just.agentweb.IAgentWebSettings
    public IAgentWebSettings toSetting(WebView webView) {
        settings(webView);
        return this;
    }

    private void settings(WebView webView) {
        WebSettings settings = webView.getSettings();
        this.mWebSettings = settings;
        settings.setJavaScriptEnabled(true);
        this.mWebSettings.setSupportZoom(true);
        this.mWebSettings.setBuiltInZoomControls(false);
        this.mWebSettings.setSavePassword(false);
        if (AgentWebUtils.checkNetwork(webView.getContext())) {
            this.mWebSettings.setCacheMode(-1);
        } else {
            this.mWebSettings.setCacheMode(1);
        }
        int i = Build.VERSION.SDK_INT;
        this.mWebSettings.setMixedContentMode(0);
        webView.setLayerType(2, null);
        this.mWebSettings.setTextZoom(100);
        this.mWebSettings.setDatabaseEnabled(true);
        this.mWebSettings.setLoadsImagesAutomatically(true);
        this.mWebSettings.setSupportMultipleWindows(false);
        this.mWebSettings.setBlockNetworkImage(false);
        this.mWebSettings.setAllowFileAccess(true);
        this.mWebSettings.setAllowFileAccessFromFileURLs(false);
        this.mWebSettings.setAllowUniversalAccessFromFileURLs(false);
        this.mWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        this.mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.mWebSettings.setLoadWithOverviewMode(false);
        this.mWebSettings.setUseWideViewPort(false);
        this.mWebSettings.setDomStorageEnabled(true);
        this.mWebSettings.setNeedInitialFocus(true);
        this.mWebSettings.setDefaultTextEncodingName("utf-8");
        this.mWebSettings.setDefaultFontSize(16);
        this.mWebSettings.setMinimumFontSize(12);
        this.mWebSettings.setGeolocationEnabled(true);
        String cachePath = AgentWebConfig.getCachePath(webView.getContext());
        String str = TAG;
        LogUtils.i(str, "dir:" + cachePath + "   appcache:" + AgentWebConfig.getCachePath(webView.getContext()));
        this.mWebSettings.setGeolocationDatabasePath(cachePath);
        this.mWebSettings.setDatabasePath(cachePath);
        this.mWebSettings.setUserAgentString(getWebSettings().getUserAgentString().concat(USERAGENT_AGENTWEB).concat(USERAGENT_UC));
        LogUtils.i(str, "UserAgentString : " + this.mWebSettings.getUserAgentString());
        if (i >= 28) {
            Context context = webView.getContext();
            String currentProcessName = ProcessUtils.getCurrentProcessName(context);
            if (context.getApplicationContext().getPackageName().equals(currentProcessName)) {
                return;
            }
            WebView.setDataDirectorySuffix(currentProcessName);
        }
    }

    @Override // com.just.agentweb.WebListenerManager
    public WebListenerManager setWebChromeClient(WebView webView, android.webkit.WebChromeClient webChromeClient) {
        webView.setWebChromeClient(webChromeClient);
        return this;
    }

    @Override // com.just.agentweb.WebListenerManager
    public WebListenerManager setWebViewClient(WebView webView, android.webkit.WebViewClient webViewClient) {
        webView.setWebViewClient(webViewClient);
        return this;
    }

    @Override // com.just.agentweb.WebListenerManager
    public WebListenerManager setDownloader(WebView webView, DownloadListener downloadListener) {
        webView.setDownloadListener(downloadListener);
        return this;
    }
}

package com.geetest.captcha.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.geetest.captcha.c0;
import com.geetest.captcha.i;
import com.geetest.captcha.j;
import com.geetest.captcha.utils.LogUtils;
import com.geetest.captcha.views.GTC4WebView;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GTC4WebView extends WebView {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f380a;
    public final Handler b;
    public int c;
    public final c d;
    public final d e;

    public static final class a extends WebChromeClient {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@NotNull WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onProgressChanged(webView, i);
            LogUtils.f375a.d("GTC4WebView", "onProgressChanged: " + i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(@NotNull WebView webView, @NotNull String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onReceivedTitle(webView, str);
            LogUtils.f375a.d("onReceivedTitle: " + str);
        }
    }

    public static final class c extends Lambda implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static final void a(GTC4WebView gTC4WebView) throws JSONException {
            Intrinsics.checkNotNullParameter(gTC4WebView, "");
            int i = GTC4WebView.f;
            gTC4WebView.getClass();
            gTC4WebView.stopLoading();
            b bVar = gTC4WebView.f380a;
            if (bVar != null) {
                bVar.a();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            GTC4WebView gTC4WebView = GTC4WebView.this;
            int i = GTC4WebView.f;
            gTC4WebView.getClass();
            final GTC4WebView gTC4WebView2 = GTC4WebView.this;
            gTC4WebView2.b.postDelayed(new Runnable() { // from class: com.geetest.captcha.views.GTC4WebView$c$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    GTC4WebView.c.a(gTC4WebView2);
                }
            }, GTC4WebView.this.c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTC4WebView(Context context) {
        super(context);
        Intrinsics.copydefault(context);
        this.b = new Handler(Looper.getMainLooper());
        this.c = 10000;
        this.d = new c();
        this.e = new d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(@NotNull c0 c0Var, @NotNull com.geetest.captcha.d dVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c0Var, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(2);
        settings.setSupportZoom(true);
        settings.setTextZoom(100);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setOverScrollMode(2);
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(new a());
        this.c = dVar.j;
        b bVar = new b(str, dVar.j, c0Var, this.d, this.e);
        this.f380a = bVar;
        setWebViewClient(bVar);
        setBackgroundColor(dVar.k);
        if (dVar.c) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        super.onResume();
        resumeTimers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LogUtils.f375a.release("GTC4WebView.onDetachedFromWindow");
        super.onDetachedFromWindow();
        removeJavascriptInterface("JSInterface");
        removeAllViews();
        removeAllViewsInLayout();
        stopLoading();
        this.b.removeCallbacksAndMessages(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        resumeTimers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LogUtils.f375a.d("GTC4WebView", "newWidth: " + i + ", newHeight: " + i2 + ", oldWidth: " + i3 + ", oldHeight: " + i4);
    }

    public static final class d extends Lambda implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public d() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            GTC4WebView.this.b.removeCallbacksAndMessages(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void setWebViewObservable(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "");
        b bVar = this.f380a;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(c0Var, "");
            bVar.c = c0Var;
        }
    }

    public static final class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f381a;
        public final int b;
        public c0 c;
        public final Function0<Unit> d;
        public final Function0<Unit> e;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(@NotNull String str, int i, @NotNull c0 c0Var, @NotNull c cVar, @NotNull d dVar) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c0Var, "");
            Intrinsics.checkNotNullParameter(cVar, "");
            Intrinsics.checkNotNullParameter(dVar, "");
            this.f381a = str;
            this.b = i;
            this.c = c0Var;
            this.d = cVar;
            this.e = dVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void a() throws JSONException {
            LogUtils.f375a.release("WebViewClient.onTimedOut. Timeout ms: " + this.b + '.');
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(-8))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            c0 c0Var = this.c;
            String str2 = i.WEB_VIEW_HTTP.getType() + str;
            String str3 = j.c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.f381a);
            jSONObject.put("description", j.c + ", Timeout ms: " + this.b + '.');
            Unit unit = Unit.INSTANCE;
            c0Var.a(str2, str3, jSONObject);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final void onLoadResource(@NotNull WebView webView, @NotNull String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onLoadResource(webView, str);
            LogUtils.f375a.release("onLoadResource: " + str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@NotNull WebView webView, @NotNull String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            LogUtils.f375a.release("onPageFinished: " + str);
            if (Intrinsics.EZpvd((Object) str, (Object) this.f381a)) {
                this.e.invoke();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            LogUtils.f375a.release("onPageStarted: " + str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceError webResourceError) throws JSONException {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            Intrinsics.checkNotNullParameter(webResourceError, "");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            LogUtils.f375a.release("WebViewClient.onReceivedError: URL: " + webResourceRequest.getUrl() + ", Method: " + webResourceRequest.getMethod() + ", ErrorCode: " + webResourceError.getErrorCode() + ", Description: " + ((Object) webResourceError.getDescription()));
            if (Intrinsics.EZpvd((Object) webResourceRequest.getUrl().toString(), (Object) this.f381a)) {
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                String str = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(webResourceError.getErrorCode()))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                c0 c0Var = this.c;
                String str2 = i.WEB_VIEW_HTTP.getType() + str;
                String str3 = j.b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", webResourceRequest.getUrl());
                jSONObject.put("description", webResourceError.getDescription());
                Unit unit = Unit.INSTANCE;
                c0Var.a(str2, str3, jSONObject);
            }
            this.e.invoke();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse) throws JSONException {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            Intrinsics.checkNotNullParameter(webResourceResponse, "");
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            LogUtils.f375a.release("WebViewClient.onReceivedHttpError: URL: " + webResourceRequest.getUrl() + ", Code: " + webResourceResponse.getStatusCode() + ", Message: " + webResourceResponse.getReasonPhrase());
            if (Intrinsics.EZpvd((Object) webResourceRequest.getUrl().toString(), (Object) this.f381a)) {
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                String str = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(webResourceResponse.getStatusCode()))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                c0 c0Var = this.c;
                String str2 = j.b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", webResourceRequest.getUrl());
                jSONObject.put("description", webResourceResponse.getReasonPhrase());
                Unit unit = Unit.INSTANCE;
                c0Var.a(str, str2, jSONObject);
                this.e.invoke();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(@NotNull WebView webView, @NotNull SslErrorHandler sslErrorHandler, @NotNull SslError sslError) throws JSONException {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(sslErrorHandler, "");
            Intrinsics.checkNotNullParameter(sslError, "");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            LogUtils.f375a.release("WebViewClient.onReceivedSslError: URL: " + sslError.getUrl() + ", ErrorCode: " + sslError.getPrimaryError() + ", Description: " + sslError);
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(sslError.getPrimaryError()))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            c0 c0Var = this.c;
            String str2 = i.WEB_VIEW_SSL.getType() + str;
            String str3 = j.d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", sslError.getUrl());
            jSONObject.put("description", sslError.toString());
            Unit unit = Unit.INSTANCE;
            c0Var.a(str2, str3, jSONObject);
            this.e.invoke();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            LogUtils logUtils = LogUtils.f375a;
            StringBuilder sb = new StringBuilder("shouldInterceptRequest(high): ");
            sb.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            logUtils.release(sb.toString());
            if (Intrinsics.EZpvd((Object) String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), (Object) this.f381a)) {
                this.d.invoke();
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Context context;
            LogUtils logUtils = LogUtils.f375a;
            StringBuilder sb = new StringBuilder("shouldOverrideUrlLoading(high): ");
            sb.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            logUtils.release(sb.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)));
                if (webView == null || (context = webView.getContext()) == null) {
                    return true;
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView webView, int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            super.onReceivedError(webView, i, str, str2);
            this.e.invoke();
        }
    }
}

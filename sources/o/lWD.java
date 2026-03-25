package o;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lWD {
    public static final android.webkit.WebView OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        android.webkit.WebView webView = new android.webkit.WebView(fragment.requireContext());
        webView.setBackgroundColor(0);
        android.webkit.WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        webView.setWebChromeClient(new Activity());
        webView.setWebViewClient(new TaskDescription());
        return webView;
    }

    public static final class Activity extends android.webkit.WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public android.graphics.Bitmap getDefaultVideoPoster() {
            android.graphics.Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            if (defaultVideoPoster != null) {
                return defaultVideoPoster;
            }
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            return bitmapCreateBitmap;
        }
    }

    public static final class TaskDescription extends android.webkit.WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }
}

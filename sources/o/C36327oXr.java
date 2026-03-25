package o;

import android.graphics.Color;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.WebViewClientCompat;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36327oXr extends android.webkit.WebView implements InterfaceC36254oUz {
    public boolean OLrzqt;
    public StateListAnimator copydefault;

    /* JADX INFO: renamed from: o.oXr$StateListAnimator */
    public interface StateListAnimator {
        java.lang.String KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC36254oUz
    public void AxsJAY() {
        this.OLrzqt = false;
    }

    public void setChartStyle(int i) {
    }

    public void setConvertCNY(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCurrentDataSource(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIndicator(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC36254oUz
    public void setInitUrlListener(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInited(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMainIndicator(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC36254oUz
    public android.view.View zsXlph() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36327oXr(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36327oXr(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        java.lang.String strKWHzl;
        super.onLayout(z, i, i2, i3, i4);
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        AEQbTJ(this);
        WebViewAssetLoader webViewAssetLoaderBuild = new WebViewAssetLoader.Builder().addPathHandler("/", new WebViewAssetLoader.AssetsPathHandler(getContext())).build();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, "");
        setWebViewClient(new Activity(webViewAssetLoaderBuild));
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator != null) {
            if (stateListAnimator != null && (strKWHzl = stateListAnimator.KWHzl()) != null) {
                str = strKWHzl;
            }
            loadUrl("file://" + str);
        }
    }

    /* JADX INFO: renamed from: o.oXr$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity extends WebViewClientCompat {
        public final WebViewAssetLoader KWHzl;

        public Activity(@NotNull WebViewAssetLoader webViewAssetLoader) {
            Intrinsics.checkNotNullParameter(webViewAssetLoader, "");
            this.KWHzl = webViewAssetLoader;
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, @NotNull android.webkit.WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            return this.KWHzl.shouldInterceptRequest(webResourceRequest.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
            return this.KWHzl.shouldInterceptRequest(android.net.Uri.parse(str));
        }
    }

    private final void AEQbTJ(android.webkit.WebView webView) {
        android.webkit.WebView.setWebContentsDebuggingEnabled(false);
        android.webkit.WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        settings.setMixedContentMode(0);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setLoadsImagesAutomatically(true);
    }

    public void setPriceFractionDigits(int i) {
        C36246oUr.copydefault().DbNXlk(i);
    }

    public void setMoneySymbol(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C36246oUr.copydefault().ejfBZ(str);
    }

    public void setFutures(boolean z) {
        C36246oUr.copydefault().DbNXlk(z);
    }

    public void setCoinVol(int i) {
        C36246oUr.copydefault().KWHzl(i);
    }

    public void setUsdCnyRate(double d) {
        C36246oUr.copydefault().KWHzl(d);
    }

    public final void KWHzl() {
        if (Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                setBackgroundColor(Color.parseColor("#000000"));
                return;
            } else {
                if (C33492mxV.EZpvd() == 1) {
                    setBackgroundColor(Color.parseColor("#FFFFFF"));
                    return;
                }
                return;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            setBackgroundColor(Color.parseColor("#000000"));
        } else {
            setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
    }
}

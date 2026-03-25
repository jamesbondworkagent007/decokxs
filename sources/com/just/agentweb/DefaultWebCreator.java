package com.just.agentweb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes17.dex */
public class DefaultWebCreator implements WebCreator {
    private static final String TAG = "DefaultWebCreator";
    private Activity mActivity;
    private BaseIndicatorSpec mBaseIndicatorSpec;
    private int mColor;
    private FrameLayout mFrameLayout;
    private int mHeight;
    private IWebLayout mIWebLayout;
    private int mIndex;
    private boolean mIsCreated;
    private boolean mIsNeedDefaultProgress;
    private ViewGroup.LayoutParams mLayoutParams;
    private BaseIndicatorView mProgressView;
    private View mTargetProgress;
    private ViewGroup mViewGroup;
    private WebView mWebView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FrameLayout getFrameLayout() {
        return this.mFrameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public View getTargetProgress() {
        return this.mTargetProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.just.agentweb.WebCreator
    public FrameLayout getWebParentLayout() {
        return this.mFrameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.just.agentweb.WebCreator
    public WebView getWebView() {
        return this.mWebView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.just.agentweb.IWebIndicator
    public BaseIndicatorSpec offer() {
        return this.mBaseIndicatorSpec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTargetProgress(View view) {
        this.mTargetProgress = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setWebView(WebView webView) {
        this.mWebView = webView;
    }

    public DefaultWebCreator(@NonNull Activity activity, @Nullable ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i, int i2, int i3, WebView webView, IWebLayout iWebLayout) {
        this.mIsCreated = false;
        this.mFrameLayout = null;
        this.mActivity = activity;
        this.mViewGroup = viewGroup;
        this.mIsNeedDefaultProgress = true;
        this.mIndex = i;
        this.mColor = i2;
        this.mLayoutParams = layoutParams;
        this.mHeight = i3;
        this.mWebView = webView;
        this.mIWebLayout = iWebLayout;
    }

    public DefaultWebCreator(@NonNull Activity activity, @Nullable ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i, @Nullable WebView webView, IWebLayout iWebLayout) {
        this.mColor = -1;
        this.mIsCreated = false;
        this.mFrameLayout = null;
        this.mActivity = activity;
        this.mViewGroup = viewGroup;
        this.mIsNeedDefaultProgress = false;
        this.mIndex = i;
        this.mLayoutParams = layoutParams;
        this.mWebView = webView;
        this.mIWebLayout = iWebLayout;
    }

    public DefaultWebCreator(@NonNull Activity activity, @Nullable ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i, BaseIndicatorView baseIndicatorView, WebView webView, IWebLayout iWebLayout) {
        this.mColor = -1;
        this.mIsCreated = false;
        this.mFrameLayout = null;
        this.mActivity = activity;
        this.mViewGroup = viewGroup;
        this.mIsNeedDefaultProgress = false;
        this.mIndex = i;
        this.mLayoutParams = layoutParams;
        this.mProgressView = baseIndicatorView;
        this.mWebView = webView;
        this.mIWebLayout = iWebLayout;
    }

    /* JADX DEBUG: Method merged with bridge method: create()Lcom/just/agentweb/WebCreator; */
    @Override // com.just.agentweb.WebCreator
    public DefaultWebCreator create() {
        if (this.mIsCreated) {
            return this;
        }
        this.mIsCreated = true;
        ViewGroup viewGroup = this.mViewGroup;
        if (viewGroup == null) {
            FrameLayout frameLayout = (FrameLayout) createLayout();
            this.mFrameLayout = frameLayout;
            this.mActivity.setContentView(frameLayout);
        } else if (this.mIndex == -1) {
            FrameLayout frameLayout2 = (FrameLayout) createLayout();
            this.mFrameLayout = frameLayout2;
            viewGroup.addView(frameLayout2, this.mLayoutParams);
        } else {
            FrameLayout frameLayout3 = (FrameLayout) createLayout();
            this.mFrameLayout = frameLayout3;
            viewGroup.addView(frameLayout3, this.mIndex, this.mLayoutParams);
        }
        return this;
    }

    private ViewGroup createLayout() {
        WebView webViewWebLayout;
        BaseIndicatorView baseIndicatorView;
        FrameLayout.LayoutParams layoutParamsOfferLayoutParams;
        Activity activity = this.mActivity;
        WebParentLayout webParentLayout = new WebParentLayout(activity);
        webParentLayout.setId(R.id.web_parent_layout_id);
        webParentLayout.setBackgroundColor(-1);
        if (this.mIWebLayout == null) {
            WebView webViewCreateWebView = createWebView();
            this.mWebView = webViewCreateWebView;
            webViewWebLayout = webViewCreateWebView;
        } else {
            webViewWebLayout = webLayout();
        }
        webParentLayout.addView(webViewWebLayout, new FrameLayout.LayoutParams(-1, -1));
        webParentLayout.bindWebView(this.mWebView);
        LogUtils.i(TAG, "  instanceof  AgentWebView:" + (this.mWebView instanceof AgentWebView));
        if (this.mWebView instanceof AgentWebView) {
            AgentWebConfig.WEBVIEW_TYPE = 2;
        }
        ViewStub viewStub = new ViewStub(activity);
        viewStub.setId(R.id.mainframe_error_viewsub_id);
        webParentLayout.addView(viewStub, new FrameLayout.LayoutParams(-1, -1));
        boolean z = this.mIsNeedDefaultProgress;
        if (z) {
            WebIndicator webIndicator = new WebIndicator(activity);
            if (this.mHeight > 0) {
                layoutParamsOfferLayoutParams = new FrameLayout.LayoutParams(-2, AgentWebUtils.dp2px(activity, this.mHeight));
            } else {
                layoutParamsOfferLayoutParams = webIndicator.offerLayoutParams();
            }
            int i = this.mColor;
            if (i != -1) {
                webIndicator.setColor(i);
            }
            layoutParamsOfferLayoutParams.gravity = 48;
            this.mBaseIndicatorSpec = webIndicator;
            webParentLayout.addView(webIndicator, layoutParamsOfferLayoutParams);
            webIndicator.setVisibility(8);
        } else if (!z && (baseIndicatorView = this.mProgressView) != null) {
            this.mBaseIndicatorSpec = baseIndicatorView;
            webParentLayout.addView(baseIndicatorView, baseIndicatorView.offerLayoutParams());
            this.mProgressView.setVisibility(8);
        }
        return webParentLayout;
    }

    private View webLayout() {
        WebView webView = this.mIWebLayout.getWebView();
        if (webView == null) {
            webView = createWebView();
            this.mIWebLayout.getLayout().addView(webView, -1, -1);
            LogUtils.i(TAG, "add webview");
        } else {
            AgentWebConfig.WEBVIEW_TYPE = 3;
        }
        this.mWebView = webView;
        return this.mIWebLayout.getLayout();
    }

    private WebView createWebView() {
        WebView webView = this.mWebView;
        if (webView != null) {
            AgentWebConfig.WEBVIEW_TYPE = 3;
            return webView;
        }
        if (AgentWebConfig.IS_KITKAT_OR_BELOW_KITKAT) {
            AgentWebView agentWebView = new AgentWebView(this.mActivity);
            AgentWebConfig.WEBVIEW_TYPE = 2;
            return agentWebView;
        }
        LollipopFixedWebView lollipopFixedWebView = new LollipopFixedWebView(this.mActivity);
        AgentWebConfig.WEBVIEW_TYPE = 1;
        return lollipopFixedWebView;
    }
}

package com.just.agentweb;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes17.dex */
public class WebParentLayout extends FrameLayout implements Provider<AbsAgentWebUIController> {
    private static final String TAG = "WebParentLayout";
    private AbsAgentWebUIController mAgentWebUIController;
    private int mClickId;
    private FrameLayout mErrorLayout;
    private int mErrorLayoutRes;
    private View mErrorView;
    private WebView mWebView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void bindWebView(WebView webView) {
        if (this.mWebView == null) {
            this.mWebView = webView;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebView getWebView() {
        return this.mWebView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: provide()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.just.agentweb.Provider
    public AbsAgentWebUIController provide() {
        return this.mAgentWebUIController;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setErrorLayoutRes(@LayoutRes int i, @IdRes int i2) {
        this.mClickId = i2;
        if (i2 <= 0) {
            this.mClickId = -1;
        }
        this.mErrorLayoutRes = i;
        if (i <= 0) {
            this.mErrorLayoutRes = R.layout.agentweb_error_page;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setErrorView(@NonNull View view) {
        this.mErrorView = view;
    }

    public WebParentLayout(@NonNull Context context) {
        this(context, null);
        LogUtils.i(TAG, "WebParentLayout");
    }

    public WebParentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public WebParentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAgentWebUIController = null;
        this.mClickId = -1;
        this.mErrorLayout = null;
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("WebParentLayout context must be activity or activity sub class .");
        }
        this.mErrorLayoutRes = R.layout.agentweb_error_page;
    }

    public void bindController(AbsAgentWebUIController absAgentWebUIController) {
        this.mAgentWebUIController = absAgentWebUIController;
        absAgentWebUIController.bindWebParent(this, (Activity) getContext());
    }

    public void setColorValue(int i, int i2) {
        this.mAgentWebUIController.setWhiteBackgroundColor(i);
        this.mAgentWebUIController.setTitleColor(i2);
    }

    public void showPageMainFrameError() {
        View viewFindViewById;
        FrameLayout frameLayout = this.mErrorLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        } else {
            createErrorLayout();
            frameLayout = this.mErrorLayout;
        }
        int i = this.mClickId;
        if (i != -1 && (viewFindViewById = frameLayout.findViewById(i)) != null) {
            viewFindViewById.setClickable(true);
        } else {
            frameLayout.setClickable(true);
        }
    }

    private void createErrorLayout() {
        final FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(-1);
        frameLayout.setId(R.id.mainframe_error_container_id);
        View view = this.mErrorView;
        if (view == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            LogUtils.i(TAG, "mErrorLayoutRes:" + this.mErrorLayoutRes);
            layoutInflaterFrom.inflate(this.mErrorLayoutRes, (ViewGroup) frameLayout, true);
        } else {
            frameLayout.addView(view);
        }
        View view2 = (ViewStub) findViewById(R.id.mainframe_error_viewsub_id);
        int iIndexOfChild = indexOfChild(view2);
        removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            this.mErrorLayout = frameLayout;
            addView(frameLayout, iIndexOfChild, layoutParams);
        } else {
            this.mErrorLayout = frameLayout;
            addView(frameLayout, iIndexOfChild);
        }
        frameLayout.setVisibility(0);
        int i = this.mClickId;
        if (i != -1) {
            final View viewFindViewById = frameLayout.findViewById(i);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.just.agentweb.WebParentLayout.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        if (WebParentLayout.this.getWebView() != null) {
                            viewFindViewById.setClickable(false);
                            WebParentLayout.this.getWebView().reload();
                        }
                    }
                });
                return;
            } else if (LogUtils.isDebug()) {
                LogUtils.e(TAG, "ClickView is null , cannot bind accurate view to refresh or reload .");
            }
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.just.agentweb.WebParentLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                if (WebParentLayout.this.getWebView() != null) {
                    frameLayout.setClickable(false);
                    WebParentLayout.this.getWebView().reload();
                }
            }
        });
    }

    public void hideErrorLayout() {
        View viewFindViewById = findViewById(R.id.mainframe_error_container_id);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }
}

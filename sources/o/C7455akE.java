package o;

import android.widget.FrameLayout;
import java.util.LinkedList;

/* JADX INFO: renamed from: o.akE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7455akE {
    public static final LinkedList<android.webkit.WebView> copydefault = new LinkedList<>();

    public static android.webkit.WebView OLrzqt(android.content.Context context) {
        android.webkit.WebView webView = new android.webkit.WebView(context);
        webView.setVisibility(4);
        webView.setBackgroundColor(0);
        if (webView.getBackground() != null) {
            webView.getBackground().setAlpha(0);
        }
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setBuiltInZoomControls(false);
        return webView;
    }

    public static android.webkit.WebView copydefault(android.content.Context context, int i, int i2, boolean z) {
        android.webkit.WebView webViewRemoveFirst;
        if (context == null) {
            return null;
        }
        try {
            LinkedList<android.webkit.WebView> linkedList = copydefault;
            synchronized (linkedList) {
                webViewRemoveFirst = !linkedList.isEmpty() ? linkedList.removeFirst() : null;
            }
            android.content.Context applicationContext = z ? context.getApplicationContext() : context;
            if (webViewRemoveFirst == null) {
                webViewRemoveFirst = OLrzqt(new android.content.MutableContextWrapper(applicationContext));
            }
            ((android.content.MutableContextWrapper) webViewRemoveFirst.getContext()).setBaseContext(applicationContext);
            webViewRemoveFirst.clearHistory();
            if (context instanceof android.app.Activity) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView();
                webViewRemoveFirst.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
                viewGroup.addView(webViewRemoveFirst);
            }
            C7870arw.KWHzl("obtain webView: " + webViewRemoveFirst);
            return webViewRemoveFirst;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void KWHzl(android.webkit.WebView webView) {
        try {
            webView.setWebViewClient(null);
            android.view.ViewParent parent = webView.getParent();
            if (parent != null) {
                ((android.view.ViewGroup) parent).removeView(webView);
            }
            webView.stopLoading();
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            webView.clearHistory();
            webView.clearFormData();
            webView.removeJavascriptInterface("webkit");
            if (webView.getContext() instanceof android.content.MutableContextWrapper) {
                android.content.MutableContextWrapper mutableContextWrapper = (android.content.MutableContextWrapper) webView.getContext();
                if (mutableContextWrapper.getBaseContext() != null) {
                    mutableContextWrapper.setBaseContext(mutableContextWrapper.getBaseContext().getApplicationContext());
                }
            }
            LinkedList<android.webkit.WebView> linkedList = copydefault;
            synchronized (linkedList) {
                if (linkedList.size() < 8 && !linkedList.contains(webView)) {
                    linkedList.add(webView);
                }
            }
            C7870arw.KWHzl("recycle webView: " + webView);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static void OLrzqt() {
        try {
            LinkedList<android.webkit.WebView> linkedList = copydefault;
            synchronized (linkedList) {
                java.util.Iterator<android.webkit.WebView> it = linkedList.iterator();
                while (it.hasNext()) {
                    android.webkit.WebView next = it.next();
                    next.removeAllViews();
                    next.destroy();
                    it.remove();
                }
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }
}

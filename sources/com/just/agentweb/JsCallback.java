package com.just.agentweb;

import android.webkit.WebView;
import com.amplifyframework.core.model.ModelIdentifier;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class JsCallback {
    private static final String CALLBACK_JS_FORMAT = "javascript:%s.callback(%d, %d %s);";
    private boolean mCouldGoOn = true;
    private int mIndex;
    private String mInjectedName;
    private int mIsPermanent;
    private WeakReference<WebView> mWebViewRef;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPermanent(boolean z) {
        this.mIsPermanent = z ? 1 : 0;
    }

    public JsCallback(WebView webView, String str, int i) {
        this.mWebViewRef = new WeakReference<>(webView);
        this.mInjectedName = str;
        this.mIndex = i;
    }

    public void apply(Object... objArr) throws JsCallbackException {
        if (this.mWebViewRef.get() == null) {
            throw new JsCallbackException("the WebView related to the JsCallback has been recycled");
        }
        if (!this.mCouldGoOn) {
            throw new JsCallbackException("the JsCallback isn't permanent,cannot be called more than once");
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(",");
            boolean z = obj instanceof String;
            boolean zIsJavaScriptObject = isJavaScriptObject(obj);
            if (z && !zIsJavaScriptObject) {
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            sb.append(String.valueOf(obj));
            if (z && !zIsJavaScriptObject) {
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
        }
        String str = String.format(CALLBACK_JS_FORMAT, this.mInjectedName, Integer.valueOf(this.mIndex), Integer.valueOf(this.mIsPermanent), sb.toString());
        LogUtils.isDebug();
        this.mWebViewRef.get().loadUrl(str);
        this.mCouldGoOn = this.mIsPermanent > 0;
    }

    private boolean isJavaScriptObject(Object obj) {
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return true;
        }
        String string = obj.toString();
        try {
            try {
                new JSONObject(string);
            } catch (JSONException unused) {
                return false;
            }
        } catch (JSONException unused2) {
            new JSONArray(string);
        }
        return true;
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static class JsCallbackException extends Exception {
        public JsCallbackException(String str) {
            super(str);
        }
    }
}

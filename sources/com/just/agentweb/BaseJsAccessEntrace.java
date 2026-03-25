package com.just.agentweb;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bytedance.applog.util.WebViewJsUtil;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseJsAccessEntrace implements JsAccessEntrace {
    public static final String TAG = "BaseJsAccessEntrace";
    private WebView mWebView;

    public BaseJsAccessEntrace(WebView webView) {
        this.mWebView = webView;
    }

    @Override // com.just.agentweb.JsAccessEntrace
    public void callJs(String str, ValueCallback<String> valueCallback) {
        evaluateJs(str, valueCallback);
    }

    @Override // com.just.agentweb.JsAccessEntrace
    public void callJs(String str) {
        callJs(str, null);
    }

    private void loadJs(String str) {
        this.mWebView.loadUrl(str);
    }

    private void evaluateJs(String str, final ValueCallback<String> valueCallback) {
        this.mWebView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.just.agentweb.BaseJsAccessEntrace.1
            /* JADX DEBUG: Method merged with bridge method: onReceiveValue(Ljava/lang/Object;)V */
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                ValueCallback valueCallback2 = valueCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(str2);
                }
            }
        });
    }

    @Override // com.just.agentweb.QuickCallJs
    public void quickCallJs(String str, ValueCallback<String> valueCallback, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(WebViewJsUtil.JS_URL_PREFIX + str);
        if (strArr == null || strArr.length == 0) {
            sb.append("()");
        } else {
            sb.append("(");
            sb.append(concat(strArr));
            sb.append(")");
        }
        callJs(sb.toString(), valueCallback);
    }

    private String concat(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!AgentWebUtils.isJson(str)) {
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                sb.append(str);
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            } else {
                sb.append(str);
            }
            if (i != strArr.length - 1) {
                sb.append(" , ");
            }
        }
        return sb.toString();
    }

    @Override // com.just.agentweb.QuickCallJs
    public void quickCallJs(String str, String... strArr) {
        quickCallJs(str, null, strArr);
    }

    @Override // com.just.agentweb.QuickCallJs
    public void quickCallJs(String str) {
        quickCallJs(str, null);
    }
}

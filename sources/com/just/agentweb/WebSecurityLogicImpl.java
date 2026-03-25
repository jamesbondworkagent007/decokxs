package com.just.agentweb;

import android.webkit.WebView;
import androidx.collection.ArrayMap;
import com.just.agentweb.AgentWeb;

/* JADX INFO: loaded from: classes17.dex */
public class WebSecurityLogicImpl implements WebSecurityCheckLogic {
    private String TAG = getClass().getSimpleName();

    @Override // com.just.agentweb.WebSecurityCheckLogic
    public void dealHoneyComb(WebView webView) {
    }

    public static WebSecurityLogicImpl getInstance() {
        return new WebSecurityLogicImpl();
    }

    @Override // com.just.agentweb.WebSecurityCheckLogic
    public void dealJsInterface(ArrayMap<String, Object> arrayMap, AgentWeb.SecurityType securityType) {
        if (securityType == AgentWeb.SecurityType.STRICT_CHECK) {
            int i = AgentWebConfig.WEBVIEW_TYPE;
        }
    }
}

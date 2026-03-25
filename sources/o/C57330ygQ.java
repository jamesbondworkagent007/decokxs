package o;

import com.bytedance.applog.util.WebViewJsUtil;
import java.util.Map;

/* JADX INFO: renamed from: o.ygQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57330ygQ implements oJZ {
    public android.webkit.WebView AEQbTJ;
    public java.util.HashMap<java.lang.Class<? extends InterfaceC35960oKb>, InterfaceC35960oKb> KWHzl = new java.util.HashMap<>();
    public StateListAnimator OLrzqt = new StateListAnimator() { // from class: o.ygQ.2
        @Override // o.C57330ygQ.StateListAnimator
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            C57330ygQ.this.copydefault(str, str2);
        }
    };

    /* JADX INFO: renamed from: o.ygQ$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(java.lang.String str, java.lang.String str2);
    }

    public C57330ygQ(android.webkit.WebView webView) {
        this.AEQbTJ = webView;
        this.KWHzl.put(C57402yhj.class, new C57402yhj(copydefault(), this.OLrzqt));
        this.KWHzl.put(C57397yhe.class, new C57397yhe(copydefault(), this.OLrzqt));
    }

    public android.content.Context copydefault() {
        return this.AEQbTJ.getContext();
    }

    public void copydefault(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            this.AEQbTJ.loadUrl(WebViewJsUtil.JS_URL_PREFIX + str + "();");
            return;
        }
        this.AEQbTJ.loadUrl(WebViewJsUtil.JS_URL_PREFIX + str + "('" + str2 + "');");
    }

    @Override // o.oJZ
    public <T extends InterfaceC35960oKb> InterfaceC35960oKb EZpvd(java.lang.Class<T> cls) {
        return this.KWHzl.get(cls);
    }

    public void KWHzl() {
        this.AEQbTJ = null;
        java.util.Iterator<Map.Entry<java.lang.Class<? extends InterfaceC35960oKb>, InterfaceC35960oKb>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = (InterfaceC35960oKb) it.next().getValue();
            if (obj instanceof AbstractC57334ygU) {
                ((AbstractC57334ygU) obj).copydefault();
            }
        }
        this.KWHzl.clear();
    }
}

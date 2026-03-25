package o;

import java.util.Collections;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public class dIR implements CookieJar {
    public android.webkit.CookieManager AEQbTJ;

    public dIR() {
        try {
            this.AEQbTJ = android.webkit.CookieManager.getInstance();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@androidx.annotation.NonNull HttpUrl httpUrl, @androidx.annotation.NonNull java.util.List<Cookie> list) {
        if (this.AEQbTJ != null) {
            java.lang.String string = httpUrl.toString();
            java.util.Iterator<Cookie> it = list.iterator();
            while (it.hasNext()) {
                this.AEQbTJ.setCookie(string, it.next().toString());
            }
        }
    }

    @Override // okhttp3.CookieJar
    public java.util.List<Cookie> loadForRequest(@androidx.annotation.NonNull HttpUrl httpUrl) {
        if (this.AEQbTJ != null) {
            java.lang.String cookie = this.AEQbTJ.getCookie(httpUrl.toString());
            if (cookie != null && !android.text.TextUtils.isEmpty(cookie)) {
                java.lang.String[] strArrSplit = cookie.split(";");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : strArrSplit) {
                    arrayList.add(Cookie.parse(httpUrl, str));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }
}

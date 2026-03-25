package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dBP {
    public volatile java.lang.String EZpvd;
    public final C57330ygQ KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final java.lang.String copydefault;

    public dBP(@NotNull C57330ygQ c57330ygQ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c57330ygQ, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = c57330ygQ;
        this.EZpvd = str;
        this.copydefault = "DappJsInterface";
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.dBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dBP.EZpvd(this.OLrzqt);
            }
        });
    }

    public final C57394yhb EZpvd() {
        return (C57394yhb) this.OLrzqt.getValue();
    }

    public static final C57394yhb EZpvd(dBP dbp) {
        return new C57394yhb(dbp.KWHzl, dbp.EZpvd);
    }

    public final void OLrzqt(java.lang.String str) {
        pUU.copydefault(this.copydefault, "setUrl  " + str + " ");
        EZpvd().EZpvd(str);
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getToken() {
        pUU.copydefault(this.copydefault, "getToken ");
        return null;
    }

    @android.webkit.JavascriptInterface
    public final void jsBridge(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String strOptString = new JSONObject(str).optString(FirebaseAnalytics.Param.METHOD);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strOptString)) {
                C15142dyj c15142dyj = C15142dyj.EZpvd;
                Intrinsics.copydefault((java.lang.Object) strOptString);
                if (c15142dyj.EZpvd(strOptString)) {
                    pUU.copydefault(this.copydefault, "jsBridget  ignore");
                    return;
                }
            }
            pUU.copydefault(this.copydefault, "jsBridget  " + str);
            EZpvd().jsBridge(str);
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.copydefault, "jsBridge exception " + e.getMessage());
            EZpvd().jsBridge(str);
        }
    }
}

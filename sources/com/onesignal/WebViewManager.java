package com.onesignal;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.okinc.liveness.lca.EopTrackEvent;
import com.onesignal.OneSignal;
import java.io.UnsupportedEncodingException;
import o.C57689ynE;
import o.C57712ynb;
import o.C57714ynd;
import o.C57770yog;
import o.C57776yom;
import o.C57823ypg;
import o.C57825ypi;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class WebViewManager extends C57712ynb.TaskDescription {
    public static final String AEQbTJ = "com.onesignal.WebViewManager";
    public static final int EZpvd = C57823ypg.copydefault(24);
    public static WebViewManager OLrzqt = null;
    public android.app.Activity KWHzl;
    public C57770yog djBIcL;
    public C57689ynE fetchVPNInfo;
    public C57776yom gEmmrt;
    public C57825ypi values;
    public final Object AkhnZx = new Object() { // from class: com.onesignal.WebViewManager.1
    };
    public String AYXKKw = null;
    public Integer valueOf = null;
    public boolean AhwBna = false;
    public boolean copydefault = false;

    public interface ActionBar {
        void KWHzl();
    }

    public final void OLrzqt(@NonNull WebView webView) {
    }

    /* JADX INFO: renamed from: com.onesignal.WebViewManager$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[Position.values().length];
            EZpvd = iArr;
            try {
                iArr[Position.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[Position.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Position {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public boolean isBanner() {
            int i = AnonymousClass4.EZpvd[ordinal()];
            return i == 1 || i == 2;
        }
    }

    public WebViewManager(@NonNull C57776yom c57776yom, @NonNull android.app.Activity activity, @NonNull C57770yog c57770yog) {
        this.gEmmrt = c57776yom;
        this.KWHzl = activity;
        this.djBIcL = c57770yog;
    }

    public static void EZpvd(@NonNull final C57776yom c57776yom, @NonNull final C57770yog c57770yog) {
        final android.app.Activity newProxyInstance = OneSignal.getNewProxyInstance();
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "in app message showMessageContent on currentActivity: " + newProxyInstance);
        if (newProxyInstance != null) {
            WebViewManager webViewManager = OLrzqt;
            if (webViewManager != null && c57776yom.AhwBna) {
                webViewManager.copydefault(new ActionBar() { // from class: com.onesignal.WebViewManager.5
                    @Override // com.onesignal.WebViewManager.ActionBar
                    public void KWHzl() {
                        WebViewManager.OLrzqt = null;
                        WebViewManager.EZpvd(newProxyInstance, c57776yom, c57770yog);
                    }
                });
                return;
            } else {
                EZpvd(newProxyInstance, c57776yom, c57770yog);
                return;
            }
        }
        Looper.prepare();
        new Handler().postDelayed(new Runnable() { // from class: com.onesignal.WebViewManager.2
            @Override // java.lang.Runnable
            public void run() {
                WebViewManager.EZpvd(c57776yom, c57770yog);
            }
        }, 200L);
    }

    public static void EZpvd() {
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + OLrzqt);
        WebViewManager webViewManager = OLrzqt;
        if (webViewManager != null) {
            webViewManager.copydefault((ActionBar) null);
        }
    }

    public static void OLrzqt(C57770yog c57770yog, @NonNull android.app.Activity activity) {
        String strOLrzqt = c57770yog.OLrzqt();
        int[] iArrAEQbTJ = C57823ypg.AEQbTJ(activity);
        c57770yog.copydefault(strOLrzqt + String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrAEQbTJ[0]), Integer.valueOf(iArrAEQbTJ[1]), Integer.valueOf(iArrAEQbTJ[2]), Integer.valueOf(iArrAEQbTJ[3]))));
    }

    public static void EZpvd(@NonNull final android.app.Activity activity, @NonNull C57776yom c57776yom, @NonNull final C57770yog c57770yog) {
        if (c57770yog.djBIcL()) {
            OLrzqt(c57770yog, activity);
        }
        try {
            final String strEncodeToString = Base64.encodeToString(c57770yog.OLrzqt().getBytes(C.UTF8_NAME), 2);
            WebViewManager webViewManager = new WebViewManager(c57776yom, activity, c57770yog);
            OLrzqt = webViewManager;
            OSUtils.EZpvd(new Runnable() { // from class: com.onesignal.WebViewManager.3
                @Override // java.lang.Runnable
                public void run() throws Exception {
                    try {
                        WebViewManager.this.EZpvd(activity, strEncodeToString, c57770yog.djBIcL());
                    } catch (Exception e) {
                        if (e.getMessage() != null && e.getMessage().contains("No WebView installed")) {
                            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error setting up WebView: ", e);
                            return;
                        }
                        throw e;
                    }
                }
            });
        } catch (UnsupportedEncodingException e) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Catch on initInAppMessage: ", e);
            e.printStackTrace();
        }
    }

    public class Activity {
        public Activity() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void postMessage(String str) {
            byte b;
            try {
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                switch (string.hashCode()) {
                    case -1484226720:
                        b = !string.equals("page_change") ? (byte) -1 : (byte) 3;
                        break;
                    case -934437708:
                        if (string.equals("resize")) {
                            b = 2;
                            break;
                        }
                        break;
                    case 42998156:
                        if (string.equals("rendering_complete")) {
                            b = 0;
                            break;
                        }
                        break;
                    case 1851145598:
                        if (string.equals("action_taken")) {
                            b = 1;
                            break;
                        }
                        break;
                    default:
                        break;
                }
                if (b == 0) {
                    AYXKKw(jSONObject);
                    return;
                }
                if (b == 1) {
                    if (WebViewManager.this.fetchVPNInfo.gEmmrt()) {
                        return;
                    }
                    KWHzl(jSONObject);
                } else {
                    if (b != 3) {
                        return;
                    }
                    EZpvd(jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public final void AYXKKw(JSONObject jSONObject) {
            Position positionOLrzqt = OLrzqt(jSONObject);
            int iAEQbTJ = positionOLrzqt == Position.FULL_SCREEN ? -1 : AEQbTJ(jSONObject);
            boolean zCopydefault = copydefault(jSONObject);
            WebViewManager.this.djBIcL.OLrzqt(positionOLrzqt);
            WebViewManager.this.djBIcL.copydefault(iAEQbTJ);
            WebViewManager.this.KWHzl(zCopydefault);
        }

        public final int AEQbTJ(JSONObject jSONObject) {
            try {
                WebViewManager webViewManager = WebViewManager.this;
                return webViewManager.KWHzl(webViewManager.KWHzl, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
                return -1;
            }
        }

        public final Position OLrzqt(JSONObject jSONObject) {
            Position position = Position.FULL_SCREEN;
            try {
                return (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) ? position : Position.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
            } catch (JSONException e) {
                e.printStackTrace();
                return position;
            }
        }

        public final boolean copydefault(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean("dragToDismissDisabled");
            } catch (JSONException unused) {
                return false;
            }
        }

        public final void KWHzl(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String strOptString = jSONObject2.optString("id", null);
            WebViewManager.this.copydefault = jSONObject2.getBoolean(EopTrackEvent.CLOSE);
            if (WebViewManager.this.gEmmrt.AhwBna) {
                OneSignal.sSMYrx().AEQbTJ(WebViewManager.this.gEmmrt, jSONObject2);
            } else if (strOptString != null) {
                OneSignal.sSMYrx().OLrzqt(WebViewManager.this.gEmmrt, jSONObject2);
            }
            if (WebViewManager.this.copydefault) {
                WebViewManager.this.copydefault((ActionBar) null);
            }
        }

        public final void EZpvd(JSONObject jSONObject) throws JSONException {
            OneSignal.sSMYrx().EZpvd(WebViewManager.this.gEmmrt, jSONObject);
        }
    }

    public final int KWHzl(@NonNull android.app.Activity activity, @NonNull JSONObject jSONObject) {
        try {
            int iCopydefault = C57823ypg.copydefault(jSONObject.getJSONObject("rect").getInt("height"));
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.AEQbTJ(log_level, "getPageHeightData:pxHeight: " + iCopydefault);
            int iEZpvd = EZpvd(activity);
            if (iCopydefault <= iEZpvd) {
                return iCopydefault;
            }
            OneSignal.KWHzl(log_level, "getPageHeightData:pxHeight is over screen max: " + iEZpvd);
            return iEZpvd;
        } catch (JSONException e) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "pageRectToViewHeight could not get page height", e);
            return -1;
        }
    }

    public final void OLrzqt() {
        OSUtils.EZpvd(new Runnable() { // from class: com.onesignal.WebViewManager.7
            @Override // java.lang.Runnable
            public void run() {
                int[] iArrAEQbTJ = C57823ypg.AEQbTJ(WebViewManager.this.KWHzl);
                WebViewManager.this.values.evaluateJavascript(String.format("setSafeAreaInsets(%s)", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrAEQbTJ[0]), Integer.valueOf(iArrAEQbTJ[1]), Integer.valueOf(iArrAEQbTJ[2]), Integer.valueOf(iArrAEQbTJ[3]))), null);
            }
        });
    }

    public final void copydefault() {
        C57689ynE c57689ynE = this.fetchVPNInfo;
        if (c57689ynE == null) {
            return;
        }
        if (c57689ynE.KWHzl() == Position.FULL_SCREEN && !this.djBIcL.djBIcL()) {
            AEQbTJ((Integer) null);
        } else {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "In app message new activity, calculate height and show ");
            C57823ypg.KWHzl(this.KWHzl, new Runnable() { // from class: com.onesignal.WebViewManager.9
                @Override // java.lang.Runnable
                public void run() {
                    WebViewManager webViewManager = WebViewManager.this;
                    webViewManager.copydefault(webViewManager.KWHzl);
                    if (WebViewManager.this.djBIcL.djBIcL()) {
                        WebViewManager.this.OLrzqt();
                    }
                    WebViewManager.this.values.evaluateJavascript("getPageMetaData()", new ValueCallback<String>() { // from class: com.onesignal.WebViewManager.9.1
                        /* JADX DEBUG: Method merged with bridge method: onReceiveValue(Ljava/lang/Object;)V */
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            try {
                                WebViewManager webViewManager2 = WebViewManager.this;
                                WebViewManager.this.AEQbTJ(Integer.valueOf(webViewManager2.KWHzl(webViewManager2.KWHzl, new JSONObject(str))));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // o.C57712ynb.TaskDescription
    public void OLrzqt(@NonNull android.app.Activity activity) {
        String str = this.AYXKKw;
        this.KWHzl = activity;
        this.AYXKKw = activity.getLocalClassName();
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "In app message activity available currentActivityName: " + this.AYXKKw + " lastActivityName: " + str);
        if (str == null) {
            AEQbTJ((Integer) null);
            return;
        }
        if (str.equals(this.AYXKKw)) {
            copydefault();
        } else {
            if (this.copydefault) {
                return;
            }
            C57689ynE c57689ynE = this.fetchVPNInfo;
            if (c57689ynE != null) {
                c57689ynE.AYXKKw();
            }
            AEQbTJ(this.valueOf);
        }
    }

    @Override // o.C57712ynb.TaskDescription
    public void KWHzl(@NonNull android.app.Activity activity) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "In app message activity stopped, cleaning views, currentActivityName: " + this.AYXKKw + "\nactivity: " + this.KWHzl + "\nmessageView: " + this.fetchVPNInfo);
        if (this.fetchVPNInfo == null || !activity.getLocalClassName().equals(this.AYXKKw)) {
            return;
        }
        this.fetchVPNInfo.AYXKKw();
    }

    public final void AEQbTJ(@Nullable Integer num) {
        synchronized (this.AkhnZx) {
            if (this.fetchVPNInfo == null) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "No messageView found to update a with a new height.");
                return;
            }
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "In app message, showing first one with height: " + num);
            this.fetchVPNInfo.copydefault(this.values);
            if (num != null) {
                this.valueOf = num;
                this.fetchVPNInfo.AEQbTJ(num.intValue());
            }
            this.fetchVPNInfo.copydefault(this.KWHzl);
            this.fetchVPNInfo.EZpvd();
        }
    }

    public final void EZpvd(@NonNull final android.app.Activity activity, @NonNull final String str, boolean z) {
        KWHzl();
        C57825ypi c57825ypi = new C57825ypi(activity);
        this.values = c57825ypi;
        c57825ypi.setOverScrollMode(2);
        this.values.setVerticalScrollBarEnabled(false);
        this.values.setHorizontalScrollBarEnabled(false);
        this.values.getSettings().setJavaScriptEnabled(true);
        this.values.addJavascriptInterface(new Activity(), "OSAndroid");
        if (z) {
            this.values.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.values.setFitsSystemWindows(false);
            }
        }
        OLrzqt(this.values);
        C57823ypg.KWHzl(activity, new Runnable() { // from class: com.onesignal.WebViewManager.8
            @Override // java.lang.Runnable
            public void run() {
                WebViewManager.this.copydefault(activity);
                WebViewManager.this.values.loadData(str, "text/html; charset=utf-8", "base64");
            }
        });
    }

    public final void copydefault(android.app.Activity activity) {
        this.values.layout(0, 0, AEQbTJ(activity), EZpvd(activity));
    }

    public final void copydefault(C57689ynE c57689ynE) {
        synchronized (this.AkhnZx) {
            this.fetchVPNInfo = c57689ynE;
        }
    }

    public final void KWHzl(boolean z) {
        this.valueOf = Integer.valueOf(this.djBIcL.AEQbTJ());
        copydefault(new C57689ynE(this.values, this.djBIcL, z));
        this.fetchVPNInfo.KWHzl(new C57689ynE.StateListAnimator() { // from class: com.onesignal.WebViewManager.10
            @Override // o.C57689ynE.StateListAnimator
            public void OLrzqt() {
                OneSignal.sSMYrx().valueOf(WebViewManager.this.gEmmrt);
            }

            @Override // o.C57689ynE.StateListAnimator
            public void EZpvd() {
                OneSignal.sSMYrx().AhwBna(WebViewManager.this.gEmmrt);
            }

            @Override // o.C57689ynE.StateListAnimator
            public void copydefault() {
                OneSignal.sSMYrx().copydefault(WebViewManager.this.gEmmrt);
                WebViewManager.this.AEQbTJ();
            }
        });
        C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
        if (c57712ynbCopydefault != null) {
            c57712ynbCopydefault.KWHzl(AEQbTJ + this.gEmmrt.copydefault, this);
        }
    }

    public static void KWHzl() {
        if (OneSignal.copydefault(OneSignal.LOG_LEVEL.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    public final int AEQbTJ(android.app.Activity activity) {
        if (this.djBIcL.djBIcL()) {
            return C57823ypg.KWHzl(activity);
        }
        return C57823ypg.AYXKKw(activity) - (EZpvd * 2);
    }

    public final int EZpvd(android.app.Activity activity) {
        return C57823ypg.EZpvd(activity) - (this.djBIcL.djBIcL() ? 0 : EZpvd * 2);
    }

    public final void AEQbTJ() {
        C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
        if (c57712ynbCopydefault != null) {
            c57712ynbCopydefault.OLrzqt(AEQbTJ + this.gEmmrt.copydefault);
        }
    }

    public void copydefault(@Nullable final ActionBar actionBar) {
        C57689ynE c57689ynE = this.fetchVPNInfo;
        if (c57689ynE == null || this.AhwBna) {
            if (actionBar != null) {
                actionBar.KWHzl();
            }
        } else {
            if (this.gEmmrt != null && c57689ynE != null) {
                OneSignal.sSMYrx().AhwBna(this.gEmmrt);
            }
            this.fetchVPNInfo.KWHzl(new ActionBar() { // from class: com.onesignal.WebViewManager.6
                @Override // com.onesignal.WebViewManager.ActionBar
                public void KWHzl() {
                    WebViewManager.this.AhwBna = false;
                    WebViewManager.this.copydefault((C57689ynE) null);
                    ActionBar actionBar2 = actionBar;
                    if (actionBar2 != null) {
                        actionBar2.KWHzl();
                    }
                }
            });
            this.AhwBna = true;
        }
    }
}

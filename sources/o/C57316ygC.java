package o;

import android.os.Handler;
import android.webkit.WebChromeClient;
import com.just.agentweb.PermissionInterceptor;

/* JADX INFO: renamed from: o.ygC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C57316ygC {
    public static boolean KWHzl(android.app.Activity activity, android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams, PermissionInterceptor permissionInterceptor, android.webkit.ValueCallback valueCallback2, java.lang.String str, Handler.Callback callback, android.webkit.ValueCallback<android.util.Pair<java.lang.String, android.net.Uri>> valueCallback3) {
        try {
            java.lang.Object objInvoke = java.lang.Class.forName("com.just.agentweb.filechooser.FileChooser").getDeclaredMethod("newBuilder", android.app.Activity.class, android.webkit.WebView.class).invoke(null, activity, webView);
            java.lang.Class<?> cls = objInvoke.getClass();
            if (valueCallback != null) {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setUriValueCallbacks", android.webkit.ValueCallback.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(objInvoke, valueCallback);
            }
            if (fileChooserParams != null) {
                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod("setFileChooserParams", WebChromeClient.FileChooserParams.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(objInvoke, fileChooserParams);
            }
            if (valueCallback2 != null) {
                java.lang.reflect.Method declaredMethod3 = cls.getDeclaredMethod("setUriValueCallback", android.webkit.ValueCallback.class);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(objInvoke, valueCallback2);
            }
            if (valueCallback3 != null) {
                java.lang.reflect.Method declaredMethod4 = cls.getDeclaredMethod("setPathCallback", android.webkit.ValueCallback.class);
                declaredMethod4.setAccessible(true);
                declaredMethod4.invoke(objInvoke, valueCallback3);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.reflect.Method declaredMethod5 = cls.getDeclaredMethod("setAcceptType", java.lang.String.class);
                declaredMethod5.setAccessible(true);
                declaredMethod5.invoke(objInvoke, str);
            }
            if (callback != null) {
                java.lang.reflect.Method declaredMethod6 = cls.getDeclaredMethod("setJsChannelCallback", Handler.Callback.class);
                declaredMethod6.setAccessible(true);
                declaredMethod6.invoke(objInvoke, callback);
            }
            java.lang.reflect.Method declaredMethod7 = cls.getDeclaredMethod("setPermissionInterceptor", PermissionInterceptor.class);
            declaredMethod7.setAccessible(true);
            declaredMethod7.invoke(objInvoke, permissionInterceptor);
            java.lang.reflect.Method declaredMethod8 = cls.getDeclaredMethod("build", new java.lang.Class[0]);
            declaredMethod8.setAccessible(true);
            java.lang.Object objInvoke2 = declaredMethod8.invoke(objInvoke, new java.lang.Object[0]);
            java.lang.reflect.Method declaredMethod9 = objInvoke2.getClass().getDeclaredMethod("openFileChooser", new java.lang.Class[0]);
            declaredMethod9.setAccessible(true);
            declaredMethod9.invoke(objInvoke2, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            if (valueCallback != null) {
                return false;
            }
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
        }
        return true;
    }
}

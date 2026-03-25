package o;

/* JADX INFO: renamed from: o.mxF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33476mxF {
    public static boolean OLrzqt(android.app.Activity activity) {
        try {
            java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((android.content.pm.ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean KWHzl(android.app.Activity activity) {
        java.lang.Exception e;
        boolean zBooleanValue;
        try {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes((int[]) java.lang.Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            java.lang.reflect.Method method = android.content.pm.ActivityInfo.class.getMethod("isTranslucentOrFloating", android.content.res.TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((java.lang.Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
            } catch (java.lang.Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            zBooleanValue = false;
        }
        return zBooleanValue;
    }
}

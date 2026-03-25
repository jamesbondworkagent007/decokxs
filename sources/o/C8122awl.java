package o;

/* JADX INFO: renamed from: o.awl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8122awl {
    public static boolean EZpvd(android.content.Context context) {
        return EZpvd(context, 24);
    }

    public static void copydefault(android.app.Fragment fragment) {
        try {
            android.content.Intent intent = new android.content.Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.putExtra("packageName", fragment.getActivity().getPackageName());
            fragment.startActivityForResult(intent, 199);
        } catch (java.lang.Exception e) {
            try {
                android.util.Log.getStackTraceString(e);
                C8116awf.OLrzqt(fragment);
            } catch (java.lang.Exception e2) {
                android.util.Log.getStackTraceString(e2);
            }
        }
    }

    public static boolean EZpvd(android.content.Context context, int i) {
        android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) context.getSystemService("appops");
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            return ((java.lang.Integer) android.app.AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, java.lang.String.class).invoke(appOpsManager, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(android.os.Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            return false;
        }
    }
}

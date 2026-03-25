package o;

/* JADX INFO: renamed from: o.myt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33569myt {
    public static android.app.Activity OLrzqt(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return OLrzqt(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void copydefault(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
        }
    }
}

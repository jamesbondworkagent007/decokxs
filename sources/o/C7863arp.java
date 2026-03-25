package o;

/* JADX INFO: renamed from: o.arp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7863arp {
    public static android.app.Activity copydefault(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static boolean KWHzl(android.content.Context context) {
        android.app.Activity activityCopydefault;
        return (context == null || (activityCopydefault = copydefault(context)) == null || activityCopydefault.isDestroyed() || activityCopydefault.isFinishing()) ? false : true;
    }
}

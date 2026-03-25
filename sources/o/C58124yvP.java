package o;

/* JADX INFO: renamed from: o.yvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58124yvP {
    public static android.app.Application EZpvd(android.content.Context context) {
        if (context instanceof android.app.Application) {
            return (android.app.Application) context;
        }
        android.content.Context baseContext = context;
        while (baseContext instanceof android.content.ContextWrapper) {
            baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof android.app.Application) {
                return (android.app.Application) baseContext;
            }
        }
        throw new java.lang.IllegalStateException("Could not find an Application in the given context: " + context);
    }

    private C58124yvP() {
    }
}

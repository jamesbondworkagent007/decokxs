package o;

/* JADX INFO: loaded from: classes2.dex */
public class YG {

    public interface ActionBar {
        void log(java.lang.String str);
    }

    public interface Activity {
        void EZpvd(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.io.File file, YF yf);
    }

    public interface Application {
        void failure(java.lang.Throwable th);

        void success();
    }

    public interface StateListAnimator {
        void AEQbTJ(java.lang.String str);

        java.lang.String EZpvd(java.lang.String str);

        java.lang.String[] KWHzl();

        void OLrzqt(java.lang.String str);

        java.lang.String copydefault(java.lang.String str);
    }

    public static void AEQbTJ(android.content.Context context, java.lang.String str) {
        KWHzl(context, str, null, null);
    }

    public static void copydefault(android.content.Context context, java.lang.String str, Application application) {
        KWHzl(context, str, null, application);
    }

    public static void KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2, Application application) {
        new YF().EZpvd(context, str, str2, application);
    }

    public static YF copydefault(ActionBar actionBar) {
        return new YF().EZpvd(actionBar);
    }

    public static YF AEQbTJ() {
        return new YF().KWHzl();
    }

    private YG() {
    }
}

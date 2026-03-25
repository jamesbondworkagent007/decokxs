package o;

import androidx.core.app.ActivityCompat;

/* JADX INFO: renamed from: o.ynj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57720ynj {

    /* JADX INFO: renamed from: o.ynj$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public interface StateListAnimator {
        void copydefault(int i);
    }

    /* JADX INFO: renamed from: o.ynj$Activity */
    public static class Activity {
        public static int copydefault(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull java.lang.String str) {
            try {
                return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
            } catch (java.lang.Throwable unused) {
                return -1;
            }
        }

        public static int OLrzqt(android.content.Context context, int i) {
            return context.getColor(i);
        }
    }

    /* JADX INFO: renamed from: o.ynj$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static class TaskDescription {
        public static void KWHzl(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull java.lang.String[] strArr, int i) {
            ActionBar.OLrzqt(activity, strArr, i);
        }

        public static boolean KWHzl(android.app.Activity activity, java.lang.String str) {
            return ActionBar.copydefault(activity, str);
        }
    }

    /* JADX INFO: renamed from: o.ynj$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static class ActionBar {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static void OLrzqt(android.app.Activity activity, java.lang.String[] strArr, int i) {
            if (activity instanceof StateListAnimator) {
                ((StateListAnimator) activity).copydefault(i);
            }
            activity.requestPermissions(strArr, i);
        }

        public static boolean copydefault(android.app.Activity activity, java.lang.String str) {
            return ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
        }
    }
}

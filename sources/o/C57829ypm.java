package o;

import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.ypm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57829ypm {
    public static boolean AEQbTJ() {
        return true;
    }

    public static boolean copydefault(java.lang.String str, boolean z) {
        if (!AEQbTJ()) {
            return false;
        }
        return CustomTabsClient.bindCustomTabsService(OneSignal.AEQbTJ, "com.android.chrome", new TaskDescription(str, z));
    }

    /* JADX INFO: renamed from: o.ypm$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static class TaskDescription extends CustomTabsServiceConnection {
        public boolean KWHzl;
        public java.lang.String copydefault;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
        }

        public TaskDescription(@androidx.annotation.NonNull java.lang.String str, boolean z) {
            this.copydefault = str;
            this.KWHzl = z;
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(@androidx.annotation.NonNull android.content.ComponentName componentName, @androidx.annotation.NonNull CustomTabsClient customTabsClient) {
            customTabsClient.warmup(0L);
            CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(null);
            if (customTabsSessionNewSession == null) {
                return;
            }
            android.net.Uri uri = android.net.Uri.parse(this.copydefault);
            customTabsSessionNewSession.mayLaunchUrl(uri, null, null);
            if (this.KWHzl) {
                CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder(customTabsSessionNewSession).build();
                customTabsIntentBuild.intent.setData(uri);
                customTabsIntentBuild.intent.addFlags(268435456);
                OneSignal.AEQbTJ.startActivity(customTabsIntentBuild.intent, customTabsIntentBuild.startAnimationBundle);
            }
        }
    }
}

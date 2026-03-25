package o;

import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: renamed from: o.yni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57719yni {
    public static int AEQbTJ = -1;

    public static boolean OLrzqt(android.content.Context context) {
        int i = AEQbTJ;
        if (i != -1) {
            return i == 1;
        }
        android.content.pm.ApplicationInfo applicationInfoKWHzl = C57721ynk.Companion.KWHzl(context);
        if (applicationInfoKWHzl == null) {
            AEQbTJ = 0;
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.");
            return false;
        }
        android.os.Bundle bundle = applicationInfoKWHzl.metaData;
        if (bundle != null) {
            AEQbTJ = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
        } else {
            AEQbTJ = 1;
        }
        return AEQbTJ == 1;
    }

    public static boolean EZpvd(android.content.Context context) {
        return OLrzqt(context) && OSUtils.AEQbTJ(context);
    }

    public static void EZpvd(InterfaceC57833ypq interfaceC57833ypq, android.content.Context context) {
        if (EZpvd(context)) {
            copydefault(context);
        }
    }

    public static void copydefault(android.content.Context context) {
        int i = 0;
        for (android.service.notification.StatusBarNotification statusBarNotification : C57836ypt.OLrzqt(context)) {
            if (!C57700ynP.copydefault(statusBarNotification)) {
                i++;
            }
        }
        AEQbTJ(i, context);
    }

    public static void AEQbTJ(int i, android.content.Context context) {
        if (OLrzqt(context)) {
            try {
                C57894yqy.KWHzl(context, i);
            } catch (ShortcutBadgeException unused) {
            }
        }
    }
}

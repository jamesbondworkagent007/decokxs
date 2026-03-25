package o;

import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.LinkedList;

/* JADX INFO: renamed from: o.yqy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57894yqy {
    public static android.content.ComponentName AEQbTJ;
    public static final java.lang.Object KWHzl;
    public static InterfaceC57892yqw OLrzqt;
    public static final java.util.List<java.lang.Class<? extends InterfaceC57892yqw>> copydefault;

    static {
        LinkedList linkedList = new LinkedList();
        copydefault = linkedList;
        KWHzl = new java.lang.Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    public static void KWHzl(android.content.Context context, int i) throws ShortcutBadgeException {
        if (OLrzqt == null && !copydefault(context)) {
            throw new ShortcutBadgeException("No default launcher available");
        }
        try {
            OLrzqt.copydefault(context, AEQbTJ, i);
        } catch (java.lang.Exception e) {
            throw new ShortcutBadgeException("Unable to execute badge", e);
        }
    }

    public static boolean copydefault(android.content.Context context) {
        InterfaceC57892yqw interfaceC57892yqwNewInstance;
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            context.getPackageName();
            return false;
        }
        AEQbTJ = launchIntentForPackage.getComponent();
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        android.content.pm.ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        java.lang.String str = resolveInfoResolveActivity.activityInfo.packageName;
        java.util.Iterator<java.lang.Class<? extends InterfaceC57892yqw>> it = copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                interfaceC57892yqwNewInstance = it.next().newInstance();
            } catch (java.lang.Exception unused) {
                interfaceC57892yqwNewInstance = null;
            }
            if (interfaceC57892yqwNewInstance != null && interfaceC57892yqwNewInstance.OLrzqt().contains(str)) {
                OLrzqt = interfaceC57892yqwNewInstance;
                break;
            }
        }
        if (OLrzqt != null) {
            return true;
        }
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            OLrzqt = new ZukHomeBadger();
            return true;
        }
        if (str2.equalsIgnoreCase("OPPO")) {
            OLrzqt = new OPPOHomeBader();
            return true;
        }
        if (str2.equalsIgnoreCase("VIVO")) {
            OLrzqt = new VivoHomeBadger();
            return true;
        }
        OLrzqt = new DefaultBadger();
        return true;
    }

    private C57894yqy() {
    }
}

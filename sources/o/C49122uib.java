package o;

import com.okinc.share.platforms.SharePlatform;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49122uib {
    public static final StateListAnimator AEQbTJ;
    public static final ConcurrentHashMap<SharePlatform, java.lang.Boolean> AYXKKw;
    public static final CopyOnWriteArrayList<Application> EZpvd;
    public static final int KWHzl;
    public static final C49122uib OLrzqt = new C49122uib();
    public static final AtomicBoolean copydefault;
    public static final ConcurrentHashMap<SharePlatform, java.lang.String> gEmmrt;

    /* JADX INFO: renamed from: o.uib$Application */
    public interface Application {
        void EZpvd(@NotNull SharePlatform sharePlatform, @NotNull java.lang.String str, boolean z);
    }

    private C49122uib() {
    }

    static {
        StateListAnimator stateListAnimator = new StateListAnimator();
        AEQbTJ = stateListAnimator;
        EZpvd = new CopyOnWriteArrayList<>();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        C32979mnm.EZpvd.OLrzqt().registerReceiver(stateListAnimator, intentFilter);
        gEmmrt = new ConcurrentHashMap<>();
        copydefault = new AtomicBoolean(true);
        AYXKKw = new ConcurrentHashMap<>();
        KWHzl = 8;
    }

    /* JADX INFO: renamed from: o.uib$StateListAnimator */
    public static final class StateListAnimator extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            java.lang.String action = intent.getAction();
            android.net.Uri data = intent.getData();
            java.lang.String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            pUU.KWHzl("PlatformPackageMonitor", "onReceive-> action:" + intent.getAction() + " packageName:" + schemeSpecificPart);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) schemeSpecificPart)) {
                if (android.text.TextUtils.equals(action, "android.intent.action.PACKAGE_ADDED")) {
                    C49122uib c49122uib = C49122uib.OLrzqt;
                    Intrinsics.copydefault((java.lang.Object) schemeSpecificPart);
                    c49122uib.copydefault(schemeSpecificPart, true);
                } else if (android.text.TextUtils.equals(action, "android.intent.action.PACKAGE_REMOVED")) {
                    C49122uib c49122uib2 = C49122uib.OLrzqt;
                    Intrinsics.copydefault((java.lang.Object) schemeSpecificPart);
                    c49122uib2.copydefault(schemeSpecificPart, false);
                }
            }
        }
    }

    public final void copydefault(java.lang.String str, boolean z) {
        java.lang.Object next;
        java.util.Set<Map.Entry<SharePlatform, java.lang.String>> setEntrySet = gEmmrt.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd(((Map.Entry) next).getValue(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        pUU.EZpvd("PlatformPackageMonitor", "find entry-> key:" + (entry != null ? (SharePlatform) entry.getKey() : null) + " value:" + (entry != null ? (java.lang.String) entry.getValue() : null));
        if (entry != null) {
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            SharePlatform sharePlatform = (SharePlatform) key;
            AYXKKw.put(sharePlatform, java.lang.Boolean.valueOf(z));
            KWHzl(sharePlatform, str, z);
            pUU.EZpvd("PlatformPackageMonitor", "updateInstallStatus-> key:" + sharePlatform + " isInstalled:" + z);
        }
    }

    public final boolean EZpvd(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
        } catch (java.lang.Exception e) {
            pUU.copydefault("PlatformPackageMonitor", "isPackageExist->pkg:" + str + " occur error:" + e.getMessage());
        }
        return packageManager.getPackageInfo(str, 128) != null;
    }

    public static /* synthetic */ void ensurePackagesScan$default(C49122uib c49122uib, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c49122uib.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        if (AYXKKw.isEmpty() || z) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                java.util.HashMap map = new java.util.HashMap(gEmmrt);
                android.content.pm.PackageManager packageManager = C32979mnm.EZpvd.OLrzqt().getPackageManager();
                java.util.Set<Map.Entry> setEntrySet = map.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
                for (Map.Entry entry : setEntrySet) {
                    java.lang.String str = (java.lang.String) entry.getValue();
                    SharePlatform sharePlatform = (SharePlatform) entry.getKey();
                    C49122uib c49122uib = OLrzqt;
                    Intrinsics.copydefault(packageManager);
                    Intrinsics.copydefault((java.lang.Object) str);
                    boolean zEZpvd = c49122uib.EZpvd(packageManager, str);
                    pUU.KWHzl("PlatformPackageMonitor", "isPackageExist->SharePlatform:" + sharePlatform + " pkg:" + str + " exist:" + zEZpvd);
                    AYXKKw.put(sharePlatform, java.lang.Boolean.valueOf(zEZpvd));
                    Intrinsics.copydefault(sharePlatform);
                    c49122uib.KWHzl(sharePlatform, str, zEZpvd);
                }
                copydefault.set(false);
            } catch (java.lang.Exception e) {
                pUU.copydefault("tag", java.lang.String.valueOf(e.getMessage()));
            }
            pUU.KWHzl("PlatformPackageMonitor", "ensurePackagesScan->costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        }
    }

    public final void AEQbTJ(@NotNull SharePlatform sharePlatform, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt.put(sharePlatform, str);
        copydefault.set(true);
    }

    public final boolean OLrzqt(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        OLrzqt(copydefault.get());
        java.lang.Boolean bool = AYXKKw.get(sharePlatform);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        EZpvd.add(application);
    }

    public final void KWHzl(SharePlatform sharePlatform, java.lang.String str, boolean z) {
        java.util.Iterator<T> it = EZpvd.iterator();
        while (it.hasNext()) {
            ((Application) it.next()).EZpvd(sharePlatform, str, z);
        }
    }
}

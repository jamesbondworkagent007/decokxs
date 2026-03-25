package o;

import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: o.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5464Ss {
    public static final ConcurrentMap<java.lang.String, NH> OLrzqt = new ConcurrentHashMap();

    public static NH EZpvd(@androidx.annotation.NonNull android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        ConcurrentMap<java.lang.String, NH> concurrentMap = OLrzqt;
        NH nh = concurrentMap.get(packageName);
        if (nh != null) {
            return nh;
        }
        NH nhKWHzl = KWHzl(context);
        NH nhPutIfAbsent = concurrentMap.putIfAbsent(packageName, nhKWHzl);
        return nhPutIfAbsent == null ? nhKWHzl : nhPutIfAbsent;
    }

    public static NH KWHzl(@androidx.annotation.NonNull android.content.Context context) {
        return new C5465St(EZpvd(copydefault(context)));
    }

    public static java.lang.String EZpvd(@androidx.annotation.Nullable android.content.pm.PackageInfo packageInfo) {
        if (packageInfo != null) {
            return java.lang.String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    public static android.content.pm.PackageInfo copydefault(@androidx.annotation.NonNull android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return null;
        }
    }

    private C5464Ss() {
    }
}

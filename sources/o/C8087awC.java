package o;

/* JADX INFO: renamed from: o.awC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8087awC {
    private C8087awC() {
    }

    public static java.lang.String copydefault(@androidx.annotation.NonNull android.content.Context context) {
        return OLrzqt(context, null);
    }

    public static java.lang.String OLrzqt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull java.lang.String str) {
        C8135awy c8135awyEZpvd = EZpvd(context);
        return c8135awyEZpvd == null ? str : c8135awyEZpvd.AEQbTJ();
    }

    public static C8135awy EZpvd(@androidx.annotation.NonNull android.content.Context context) {
        java.lang.String strAEQbTJ = AEQbTJ(context);
        if (android.text.TextUtils.isEmpty(strAEQbTJ)) {
            return null;
        }
        return C8134awx.EZpvd(new java.io.File(strAEQbTJ));
    }

    public static java.lang.String KWHzl(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl = KWHzl(context);
        if (mapKWHzl == null) {
            return null;
        }
        return mapKWHzl.get(str);
    }

    public static java.util.Map<java.lang.String, java.lang.String> KWHzl(@androidx.annotation.NonNull android.content.Context context) {
        java.lang.String strAEQbTJ = AEQbTJ(context);
        if (android.text.TextUtils.isEmpty(strAEQbTJ)) {
            return null;
        }
        return C8134awx.KWHzl(new java.io.File(strAEQbTJ));
    }

    public static java.lang.String AEQbTJ(@androidx.annotation.NonNull android.content.Context context) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}

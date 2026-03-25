package o;

import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47136tkO {
    public static final C47136tkO AEQbTJ = new C47136tkO();

    private C47136tkO() {
    }

    public static final java.lang.String copydefault(android.content.Context context) {
        java.lang.String string = SPUtils.getString("OKRLAId", "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        java.lang.String strGEmmrt = AEQbTJ.gEmmrt(context);
        SPUtils.put("OKRLAId", strGEmmrt);
        return strGEmmrt;
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(context);
    }

    public final java.lang.String valueOf(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strQKVWgx = C47138tkQ.EZpvd.QKVWgx();
        return AEQbTJ(context) + "_app_start_" + strQKVWgx;
    }

    public final java.lang.String AhwBna(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strQKVWgx = C47138tkQ.EZpvd.QKVWgx();
        return AEQbTJ(context) + "_txn_start_" + strQKVWgx;
    }

    public final java.lang.String EZpvd() {
        java.lang.String string = SPUtils.getString("OKRLFP", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return packageName;
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            java.lang.String id = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
            return id == null ? "" : id;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String gEmmrt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        xVW.EZpvd(context);
        java.lang.String strCopydefault = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        return strCopydefault;
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: o.tkO$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }

        public static final java.lang.String KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C47136tkO.AEQbTJ.gEmmrt(context);
        }
    }
}

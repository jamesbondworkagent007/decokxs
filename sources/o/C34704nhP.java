package o;

import com.okinc.environment.AppSiteType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34704nhP {
    public static java.lang.String[] EZpvd;
    public static java.lang.String KWHzl;
    public static AppSiteType OLrzqt;
    public static final C34704nhP copydefault = new C34704nhP();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        EZpvd = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull AppSiteType appSiteType) {
        Intrinsics.checkNotNullParameter(appSiteType, "");
        if (OLrzqt == null) {
            OLrzqt = appSiteType;
        }
    }

    private C34704nhP() {
    }

    public final AppSiteType OLrzqt() {
        AppSiteType appSiteType = OLrzqt;
        if (appSiteType != null) {
            return appSiteType;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String str = KWHzl;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl = str;
        EZpvd(new java.lang.String[]{str});
    }

    public final java.lang.String[] KWHzl() {
        java.lang.String[] strArr = EZpvd;
        if (strArr != null) {
            return strArr;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean copydefault() {
        return OLrzqt() == AppSiteType.OKEX;
    }

    public final boolean EZpvd() {
        return OLrzqt() == AppSiteType.OKCOIN;
    }
}

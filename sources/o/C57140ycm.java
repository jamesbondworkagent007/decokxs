package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57140ycm {
    public static final java.lang.String AEQbTJ;
    public static final java.lang.String EZpvd;
    public static final C57140ycm KWHzl = new C57140ycm();
    public static final java.lang.String OLrzqt;
    public static final java.lang.String copydefault;

    private C57140ycm() {
    }

    static {
        java.lang.String str = java.io.File.separator;
        java.lang.String str2 = "defi" + str + "wallet" + str;
        copydefault = str2;
        OLrzqt = "download" + str + str2;
        java.lang.String str3 = str2 + "hardware" + str;
        EZpvd = str3;
        AEQbTJ = str3 + "ledger" + str;
    }

    public final java.io.File copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new java.io.File(context.getCacheDir(), OLrzqt);
    }

    public final java.io.File KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new java.io.File(context.getFilesDir(), AEQbTJ);
    }

    public final java.io.File AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(str, KWHzl(context));
    }

    public final java.io.File EZpvd(java.lang.String str, java.io.File file) {
        java.io.File[] fileArrListFiles;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return null;
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) file2.getName())) {
                    return file2;
                }
            } else {
                C57140ycm c57140ycm = KWHzl;
                Intrinsics.copydefault(file2);
                java.io.File fileEZpvd = c57140ycm.EZpvd(str, file2);
                if (fileEZpvd != null) {
                    return fileEZpvd;
                }
            }
        }
        return null;
    }
}

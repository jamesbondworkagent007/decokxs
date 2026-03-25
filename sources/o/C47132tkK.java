package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47132tkK {
    public static final C47132tkK OLrzqt = new C47132tkK();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tkH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47132tkK.OLrzqt();
        }
    });
    public static final int AEQbTJ = 8;

    private C47132tkK() {
    }

    public final java.io.File[] KWHzl() {
        return (java.io.File[]) copydefault.getValue();
    }

    public static final java.io.File[] OLrzqt() {
        return OLrzqt.AEQbTJ(new java.io.File("/system/fonts/"));
    }

    public static final boolean EZpvd(java.io.File file) {
        if (!file.isFile()) {
            return false;
        }
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return C59449zhJ.endsWith$default(name, ".ttf", false, 2, null);
    }

    public final java.io.File[] AEQbTJ(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        java.io.File[] fileArrListFiles = file.listFiles(new java.io.FileFilter() { // from class: o.tkJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FileFilter
            public final boolean accept(java.io.File file2) {
                return C47132tkK.EZpvd(file2);
            }
        });
        return fileArrListFiles == null ? new java.io.File[0] : fileArrListFiles;
    }

    public final java.lang.String copydefault() {
        return java.lang.String.valueOf(KWHzl().length);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.io.File file : KWHzl()) {
            sb.append(file.getName());
        }
        C47137tkP c47137tkP = C47137tkP.KWHzl;
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return c47137tkP.AEQbTJ(string);
    }
}

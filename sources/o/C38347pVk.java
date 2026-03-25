package o;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38347pVk {
    public static final C38347pVk OLrzqt = new C38347pVk();

    private C38347pVk() {
    }

    public final boolean copydefault(java.io.File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    public final boolean OLrzqt(java.lang.String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!java.lang.Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final java.io.File AEQbTJ(java.lang.String str) {
        if (OLrzqt(str)) {
            return null;
        }
        return new java.io.File(str);
    }

    public final java.util.List<java.io.File> EZpvd(java.lang.String str, @NotNull java.io.FileFilter fileFilter) {
        Intrinsics.checkNotNullParameter(fileFilter, "");
        return listFilesInDirWithFilter$default(this, AEQbTJ(str), fileFilter, false, null, 12, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pVk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List listFilesInDirWithFilter$default(C38347pVk c38347pVk, java.io.File file, java.io.FileFilter fileFilter, boolean z, java.util.Comparator comparator, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            comparator = null;
        }
        return c38347pVk.EZpvd(file, fileFilter, z, comparator);
    }

    public final java.util.List<java.io.File> EZpvd(java.io.File file, @NotNull java.io.FileFilter fileFilter, boolean z, java.util.Comparator<java.io.File> comparator) {
        Intrinsics.checkNotNullParameter(fileFilter, "");
        java.util.List<java.io.File> listAEQbTJ = AEQbTJ(file, fileFilter, z);
        if (comparator != null) {
            Collections.sort(listAEQbTJ, comparator);
        }
        return listAEQbTJ;
    }

    public final java.util.List<java.io.File> AEQbTJ(java.io.File file, java.io.FileFilter fileFilter, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!copydefault(file)) {
            return arrayList;
        }
        Intrinsics.copydefault(file);
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            java.util.Iterator itEZpvd = yHX.EZpvd(fileArrListFiles);
            while (itEZpvd.hasNext()) {
                java.io.File file2 = (java.io.File) itEZpvd.next();
                if (fileFilter.accept(file2)) {
                    Intrinsics.copydefault(file2);
                    arrayList.add(file2);
                }
                if (z && file2.isDirectory()) {
                    arrayList.addAll(AEQbTJ(file2, fileFilter, true));
                }
            }
        }
        return arrayList;
    }

    public final boolean EZpvd(java.io.File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final boolean copydefault(java.lang.String str) {
        return EZpvd(AEQbTJ(str));
    }

    public final java.io.File KWHzl(java.lang.String str, java.lang.String str2) {
        copydefault(str);
        return EZpvd(str, str2);
    }

    public final java.io.File EZpvd(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return new java.io.File(str, str2);
    }

    public final boolean KWHzl(java.lang.String str) {
        return AEQbTJ(AEQbTJ(str));
    }

    public final boolean AEQbTJ(java.io.File file) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists()) {
                return false;
            }
            if (file.isDirectory()) {
                java.io.File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    java.util.Iterator itEZpvd = yHX.EZpvd(fileArrListFiles);
                    while (itEZpvd.hasNext()) {
                        KWHzl(((java.io.File) itEZpvd.next()).getPath());
                    }
                }
                return file.delete();
            }
            return KWHzl(file);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final boolean KWHzl(java.io.File file) {
        if (file == null || !file.exists() || file.isDirectory()) {
            return false;
        }
        return file.delete();
    }
}

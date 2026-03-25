package o;

/* JADX INFO: renamed from: o.aWH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6800aWH {
    public static java.io.File KWHzl(java.lang.String str) {
        if (C6798aWF.copydefault((java.lang.CharSequence) str)) {
            return null;
        }
        return new java.io.File(str);
    }

    public static boolean EZpvd(java.io.File file) {
        return file != null && file.exists();
    }

    public static boolean copydefault(java.lang.String str) {
        return EZpvd(KWHzl(str));
    }

    public static boolean OLrzqt(java.io.File file, java.lang.String str) {
        if (C6798aWF.AEQbTJ(str) || file == null || !file.exists()) {
            return false;
        }
        if (str.equals(file.getName())) {
            return true;
        }
        java.io.File file2 = new java.io.File(file.getParent() + java.io.File.separator + str);
        return !file2.exists() && file.renameTo(file2);
    }

    public static boolean EZpvd(java.lang.String str) {
        return OLrzqt(KWHzl(str));
    }

    public static boolean OLrzqt(java.io.File file) {
        if (file == null || !file.exists() || file.isDirectory()) {
            return false;
        }
        return file.delete();
    }

    public static boolean AEQbTJ(java.lang.String str) {
        return KWHzl(KWHzl(str));
    }

    public static boolean KWHzl(java.io.File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        java.io.File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            for (java.io.File file2 : fileArrListFiles) {
                                AEQbTJ(file2.getPath());
                            }
                        }
                        return file.delete();
                    }
                    return OLrzqt(file);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static boolean AEQbTJ(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (java.io.File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !AEQbTJ(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean EZpvd(java.io.File file, java.io.FileFilter fileFilter) {
        if (fileFilter == null || file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (java.io.File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !AEQbTJ(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

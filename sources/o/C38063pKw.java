package o;

import androidx.camera.video.AudioStats;
import com.okinc.lib.utils.OkUtils;

/* JADX INFO: renamed from: o.pKw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38063pKw {
    public static final java.lang.String OLrzqt = "FileUtils";
    public static final java.lang.String[] KWHzl = {".PNG", ".JPG", ".JPEG", ".BMP", ".GIF", ".WEBP"};
    public static final java.lang.String[] copydefault = {".MP3", ".AAC", ".OGG", ".WMA", ".APE", ".FLAC", ".RA"};
    public static final java.lang.String[] AEQbTJ = {".MP4", ".AVI", ".MOV", ".ASF", ".MPG", ".MPEG", ".WMV", ".RM", ".RMVB", ".3GP", ".MKV"};

    private C38063pKw() {
    }

    public static java.io.File OLrzqt(java.lang.String str) {
        return KWHzl(str);
    }

    public static java.io.File KWHzl(java.lang.String str) {
        if (C38061pKu.OLrzqt(str)) {
            return null;
        }
        return new java.io.File(str);
    }

    public static boolean EZpvd(java.lang.String str) {
        return OLrzqt(KWHzl(str));
    }

    public static boolean OLrzqt(java.io.File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(OLrzqt, "createFolder", e);
            return false;
        }
    }

    public static boolean AEQbTJ(java.io.File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    public static boolean copydefault(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!AEQbTJ(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(OLrzqt, "createOrExistsFile", e);
            return false;
        }
    }

    public static java.lang.String djBIcL(java.io.File file) {
        if (file == null) {
            return null;
        }
        return AEQbTJ(file.getPath());
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        if (C38061pKu.copydefault(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iLastIndexOf2 = str.lastIndexOf(java.io.File.separator);
        if (iLastIndexOf2 == -1) {
            return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
        }
        if (iLastIndexOf == -1 || iLastIndexOf2 > iLastIndexOf) {
            return str.substring(iLastIndexOf2 + 1);
        }
        return str.substring(iLastIndexOf2 + 1, iLastIndexOf);
    }

    public static boolean DbNXlk(java.io.File file) {
        return file != null && file.exists();
    }

    public static boolean copydefault(java.lang.String str) {
        return isConnected(KWHzl(str));
    }

    public static boolean isConnected(java.io.File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean AYXKKw(java.io.File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    public static long AhwBna(java.io.File file) {
        if (file == null) {
            return 0L;
        }
        return file.lastModified();
    }

    public static java.lang.String valueOf(java.io.File file) {
        return copydefault(gEmmrt(file));
    }

    public static long gEmmrt(java.io.File file) {
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public static java.lang.String copydefault(double d) {
        return OLrzqt(3, d);
    }

    public static java.lang.String OLrzqt(int i, double d) {
        if (d < AudioStats.AUDIO_AMPLITUDE_NONE) {
            return "0B";
        }
        if (d < 1024.0d) {
            return java.lang.String.format("%." + i + "fB", java.lang.Double.valueOf(d));
        }
        if (d < 1048576.0d) {
            return java.lang.String.format("%." + i + "fKB", java.lang.Double.valueOf(d / 1024.0d));
        }
        if (d < 1.073741824E9d) {
            return java.lang.String.format("%." + i + "fMB", java.lang.Double.valueOf(d / 1048576.0d));
        }
        if (d < 1.099511627776E12d) {
            return java.lang.String.format("%." + i + "fGB", java.lang.Double.valueOf(d / 1.073741824E9d));
        }
        return java.lang.String.format("%." + i + "fTB", java.lang.Double.valueOf(d / 1.099511627776E12d));
    }

    public static boolean EZpvd(java.io.File file) {
        if (file == null || !file.exists() || file.isDirectory()) {
            return false;
        }
        return file.delete();
    }

    public static boolean EZpvd(java.io.InputStream inputStream, java.lang.String str, boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.FileOutputStream fileOutputStream;
        if (inputStream == null || str == null) {
            return false;
        }
        java.io.File file = new java.io.File(str);
        if (file.isDirectory()) {
            return false;
        }
        if (file.exists()) {
            if (!z) {
                return false;
            }
            file.delete();
        } else if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            return false;
        }
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            C38058pKr.copydefault(fileOutputStream, inputStream);
                            return true;
                        }
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    OkUtils.AhwBna().copydefault(OLrzqt, "copyFile", e);
                    C38058pKr.copydefault(fileOutputStream2, inputStream);
                    return false;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    C38058pKr.copydefault(fileOutputStream, inputStream);
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th3) {
            java.io.FileOutputStream fileOutputStream3 = fileOutputStream2;
            th = th3;
            fileOutputStream = fileOutputStream3;
        }
    }

    public static boolean KWHzl(java.lang.String str, java.lang.String str2, boolean z) {
        if (str2 != null && copydefault(str)) {
            return EZpvd(C38057pKq.EZpvd(str), str2, z);
        }
        return false;
    }

    public static boolean KWHzl(java.io.File file) {
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
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !KWHzl(file2)) {
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
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !KWHzl(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static java.util.List<java.io.File> copydefault(java.io.File file, java.io.FileFilter fileFilter, boolean z) {
        java.util.List<java.io.File> listCopydefault;
        if (!AYXKKw(file) || fileFilter == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    arrayList.add(file2);
                }
                if (z && file2.isDirectory() && (listCopydefault = copydefault(file2, fileFilter, true)) != null) {
                    arrayList.addAll(listCopydefault);
                }
            }
        }
        return arrayList;
    }

    public static java.io.File OLrzqt(@androidx.annotation.NonNull java.io.File file, @androidx.annotation.Nullable java.io.FilenameFilter filenameFilter) {
        java.io.File[] fileArrListFiles;
        java.io.File file2 = null;
        if (file.exists() && (fileArrListFiles = file.listFiles(filenameFilter)) != null) {
            long jLastModified = 0;
            for (java.io.File file3 : fileArrListFiles) {
                if (file3.lastModified() > jLastModified) {
                    jLastModified = file3.lastModified();
                    file2 = file3;
                }
            }
        }
        return file2;
    }
}

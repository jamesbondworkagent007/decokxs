package o;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: o.pVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38354pVr {
    private C38354pVr() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean EZpvd(java.util.Collection<java.io.File> collection, java.io.File file) throws java.io.IOException {
        return KWHzl(collection, file, (java.lang.String) null);
    }

    public static boolean KWHzl(java.util.Collection<java.io.File> collection, java.io.File file, java.lang.String str) throws java.lang.Throwable {
        ZipOutputStream zipOutputStream;
        if (collection == null || file == null) {
            return false;
        }
        try {
            zipOutputStream = new ZipOutputStream(new java.io.FileOutputStream(file));
        } catch (java.lang.Throwable th) {
            th = th;
            zipOutputStream = null;
        }
        try {
            java.util.Iterator<java.io.File> it = collection.iterator();
            while (it.hasNext()) {
                if (!KWHzl(it.next(), "", zipOutputStream, str)) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                    return false;
                }
            }
            zipOutputStream.finish();
            zipOutputStream.close();
            return true;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (zipOutputStream != null) {
                zipOutputStream.finish();
                zipOutputStream.close();
            }
            throw th;
        }
    }

    public static boolean copydefault(java.io.File file, java.io.File file2) throws java.io.IOException {
        return EZpvd(file, file2, null);
    }

    public static boolean EZpvd(java.io.File file, java.io.File file2, java.lang.String str) throws java.lang.Throwable {
        ZipOutputStream zipOutputStream;
        if (file == null || file2 == null) {
            return false;
        }
        try {
            zipOutputStream = new ZipOutputStream(new java.io.FileOutputStream(file2));
        } catch (java.lang.Throwable th) {
            th = th;
            zipOutputStream = null;
        }
        try {
            boolean zKWHzl = KWHzl(file, "", zipOutputStream, str);
            zipOutputStream.close();
            return zKWHzl;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (zipOutputStream != null) {
                zipOutputStream.close();
            }
            throw th;
        }
    }

    public static boolean KWHzl(java.io.File file, java.lang.String str, ZipOutputStream zipOutputStream, java.lang.String str2) throws java.lang.Throwable {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(OLrzqt(str) ? "" : java.io.File.separator);
        sb.append(file.getName());
        java.lang.String string = sb.toString();
        if (file.isDirectory()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                ZipEntry zipEntry = new ZipEntry(string + JsonPointer.SEPARATOR);
                zipEntry.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.closeEntry();
                return true;
            }
            for (java.io.File file2 : fileArrListFiles) {
                if (!KWHzl(file2, string, zipOutputStream, str2)) {
                    return false;
                }
            }
            return true;
        }
        try {
            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
            try {
                ZipEntry zipEntry2 = new ZipEntry(string);
                zipEntry2.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 8192);
                    if (i != -1) {
                        zipOutputStream.write(bArr, 0, i);
                    } else {
                        zipOutputStream.closeEntry();
                        bufferedInputStream.close();
                        return true;
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    public static boolean copydefault(java.util.Collection<java.io.File> collection, java.io.File file, java.lang.Long l) throws java.io.IOException {
        return KWHzl(collection, file, (java.lang.String) null, l);
    }

    public static boolean KWHzl(java.util.Collection<java.io.File> collection, java.io.File file, java.lang.String str, java.lang.Long l) throws java.lang.Throwable {
        ZipOutputStream zipOutputStream;
        if (collection == null || file == null) {
            return false;
        }
        try {
            zipOutputStream = new ZipOutputStream(new java.io.FileOutputStream(file));
        } catch (java.lang.Throwable th) {
            th = th;
            zipOutputStream = null;
        }
        try {
            java.util.Iterator<java.io.File> it = collection.iterator();
            while (it.hasNext()) {
                if (!EZpvd(it.next(), "", file, zipOutputStream, str, java.lang.Long.valueOf((long) (l.longValue() * 0.9d)))) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                    return false;
                }
            }
            zipOutputStream.finish();
            zipOutputStream.close();
            return true;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (zipOutputStream != null) {
                zipOutputStream.finish();
                zipOutputStream.close();
            }
            throw th;
        }
    }

    public static boolean EZpvd(java.io.File file, java.lang.String str, java.io.File file2, ZipOutputStream zipOutputStream, java.lang.String str2, java.lang.Long l) throws java.lang.Throwable {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(OLrzqt(str) ? "" : java.io.File.separator);
        sb.append(file.getName());
        java.lang.String string = sb.toString();
        if (file.isDirectory()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                ZipEntry zipEntry = new ZipEntry(string + JsonPointer.SEPARATOR);
                zipEntry.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.closeEntry();
            } else {
                for (java.io.File file3 : fileArrListFiles) {
                    if (!EZpvd(file3, string, file2, zipOutputStream, str2, l)) {
                        return false;
                    }
                }
            }
        } else {
            try {
                bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedInputStream = null;
            }
            try {
                ZipEntry zipEntry2 = new ZipEntry(string);
                if (file2.length() + file.length() > l.longValue()) {
                    zipOutputStream.closeEntry();
                    bufferedInputStream.close();
                    return true;
                }
                zipEntry2.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 8192);
                    if (i == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                bufferedInputStream.close();
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        }
        return true;
    }

    public static java.util.List<java.io.File> OLrzqt(java.io.File file, java.io.File file2) throws java.io.IOException {
        return KWHzl(file, file2, (java.lang.String) null);
    }

    public static java.util.List<java.io.File> KWHzl(java.io.File file, java.io.File file2, java.lang.String str) throws java.io.IOException {
        if (file == null || file2 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ZipFile zipFile = new ZipFile(file);
        java.util.Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        try {
            if (OLrzqt(str)) {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    java.lang.String name = zipEntryNextElement.getName();
                    if (name.contains("../")) {
                        java.lang.System.err.println("entryName: " + name + " is dangerous!");
                    } else if (!AEQbTJ(file2, arrayList, zipFile, zipEntryNextElement, name)) {
                        return arrayList;
                    }
                }
            } else {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                    java.lang.String name2 = zipEntryNextElement2.getName();
                    if (name2.contains("../")) {
                        java.lang.System.out.println("entryName: " + name2 + " is dangerous!");
                    } else if (name2.contains(str) && !AEQbTJ(file2, arrayList, zipFile, zipEntryNextElement2, name2)) {
                        return arrayList;
                    }
                }
            }
            return arrayList;
        } finally {
            zipFile.close();
        }
    }

    public static boolean AEQbTJ(java.io.File file, java.util.List<java.io.File> list, ZipFile zipFile, ZipEntry zipEntry, java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.File file2 = new java.io.File(file, str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            return copydefault(file2);
        }
        if (!OLrzqt(file2)) {
            return false;
        }
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedInputStream = new java.io.BufferedInputStream(zipFile.getInputStream(zipEntry));
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file2));
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i != -1) {
                    bufferedOutputStream.write(bArr, 0, i);
                } else {
                    bufferedInputStream.close();
                    bufferedOutputStream.close();
                    return true;
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }

    public static boolean copydefault(java.io.File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    public static boolean OLrzqt(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!copydefault(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean OLrzqt(java.lang.String str) {
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
}

package o;

import android.os.Build;
import com.okinc.network.okg.unifieddomain.DomainType;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: o.arq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7864arq {
    public static boolean AEQbTJ = false;
    public static final java.lang.String[] EZpvd = {"../", "~/"};
    public static boolean copydefault = true;

    /* JADX INFO: renamed from: o.arq$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public interface StateListAnimator {
        void EZpvd(float f);
    }

    public static boolean AhwBna(@androidx.annotation.NonNull java.lang.String str) {
        int length = EZpvd.length;
        for (int i = 0; i < length; i++) {
            if (str.contains(EZpvd[i])) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("..");
        java.lang.String str3 = java.io.File.separator;
        sb.append(str3);
        java.lang.String string = sb.toString();
        int length = str.length();
        int length2 = str2.length();
        if (length > 0) {
            int i = length - 1;
            if (str.charAt(i) == java.io.File.separatorChar) {
                str = str.substring(0, i);
                length = i;
            }
        }
        char cCharAt = str2.charAt(0);
        char c = java.io.File.separatorChar;
        if (cCharAt == c) {
            str2 = str2.substring(1);
        } else if (str2.charAt(0) == '.' && length2 > 1 && str2.charAt(1) == c) {
            str2 = str2.substring(2);
        }
        if (length == 0) {
            return str2;
        }
        java.lang.String str4 = str + str3 + str2;
        int iIndexOf = str4.indexOf(string, 1);
        while (iIndexOf >= 2) {
            int iLastIndexOf = str4.lastIndexOf(java.io.File.separatorChar, iIndexOf - 2);
            if (iLastIndexOf < 0) {
                return str4.substring(iIndexOf + 3);
            }
            str4 = str4.substring(0, iLastIndexOf) + str4.substring(iIndexOf + 2);
            iIndexOf = str4.indexOf(string, iLastIndexOf);
        }
        return str4;
    }

    public static void KWHzl(@androidx.annotation.NonNull java.lang.String str, java.io.InputStream inputStream) throws java.lang.Exception {
        EZpvd(str, inputStream);
        EZpvd(new java.io.File(str));
    }

    public static void EZpvd(@androidx.annotation.NonNull java.lang.String str, java.io.InputStream inputStream) throws java.lang.Exception {
        ZipInputStream zipInputStream;
        try {
            zipInputStream = new ZipInputStream(new java.io.BufferedInputStream(inputStream));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        java.lang.String name = nextEntry.getName();
                        if (!AhwBna(name)) {
                            throw new java.lang.IllegalArgumentException("unsecurity zipfile!");
                        }
                        java.io.File file = new java.io.File(str, name);
                        if (nextEntry.isDirectory()) {
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                        } else {
                            java.io.File file2 = new java.io.File(file.getParent());
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            java.io.File file3 = new java.io.File(file2, ".nomedia");
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                            EZpvd(file, zipInputStream);
                            zipInputStream.closeEntry();
                        }
                    } else {
                        C7866ars.AEQbTJ((java.io.Closeable) zipInputStream);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    C7866ars.AEQbTJ((java.io.Closeable) zipInputStream);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            zipInputStream = null;
        }
    }

    public static void EZpvd(java.io.File file) {
        OLrzqt(file);
        java.io.File[] fileArrListFiles = file.listFiles(new java.io.FileFilter() { // from class: o.arq.4
            @Override // java.io.FileFilter
            public boolean accept(java.io.File file2) {
                return file2.isDirectory() && !".lastModify__time".equals(file2.getName());
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (java.io.File file2 : fileArrListFiles) {
            EZpvd(file2);
        }
    }

    public static void OLrzqt(java.io.File file) {
        if (".lastModify__time".equals(file.getName())) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.File file2 = new java.io.File(file, ".lastModify__time");
        if (!file2.exists()) {
            file2.mkdir();
        }
        file.setLastModified(jCurrentTimeMillis);
        file2.setLastModified(jCurrentTimeMillis);
    }

    public static void EZpvd(@androidx.annotation.NonNull java.io.File file, java.io.InputStream inputStream) throws java.lang.Exception {
        byte[] bArr = new byte[8192];
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file), 8192);
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                bufferedOutputStream.write(bArr, 0, i);
            } else {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                return;
            }
        }
    }

    public static java.lang.String djBIcL(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        java.lang.String host = uri.getHost();
        java.lang.String path = uri.getPath();
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        if (host == null) {
            return path;
        }
        return host + path;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        java.lang.String path = android.net.Uri.parse(str).getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        return iLastIndexOf >= 0 ? path.substring(iLastIndexOf + 1) : path;
    }

    public static java.io.File AEQbTJ() {
        return C7788aqT.AEQbTJ().djBIcL();
    }

    public static java.io.File KWHzl() {
        return C7788aqT.AEQbTJ().valueOf();
    }

    public static java.io.File OLrzqt() {
        return C7788aqT.AEQbTJ().AEQbTJ();
    }

    public static java.io.File EZpvd() {
        return C7788aqT.AEQbTJ().KWHzl();
    }

    public static java.io.File copydefault() {
        return new java.io.File(KWHzl(), "LuaView");
    }

    public static boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        return (android.text.TextUtils.isEmpty(str) || str2 == null || !str.endsWith(str2)) ? false : true;
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            if (file.isFile()) {
                return file.getParent();
            }
            return file.getPath();
        }
        char c = java.io.File.separatorChar;
        return str.lastIndexOf(c) != -1 ? str.substring(0, str.lastIndexOf(c)) : "";
    }

    public static java.io.File KWHzl(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return file;
        }
        java.io.File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        return new java.io.File(parentFile, file.getName());
    }

    public static byte[] KWHzl(java.io.File file) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        if (file != null && file.exists() && file.isFile()) {
            try {
                fileInputStream = new java.io.FileInputStream(file);
            } catch (java.io.FileNotFoundException e) {
                e = e;
                fileInputStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                C7866ars.AEQbTJ((java.io.Closeable) fileInputStream2);
                throw th;
            }
            try {
                try {
                    byte[] bArrAEQbTJ = C7866ars.AEQbTJ((java.io.InputStream) fileInputStream);
                    C7866ars.AEQbTJ((java.io.Closeable) fileInputStream);
                    return bArrAEQbTJ;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C7866ars.AEQbTJ((java.io.Closeable) fileInputStream2);
                    throw th;
                }
            } catch (java.io.FileNotFoundException e2) {
                e = e2;
                OLrzqt(e);
                C7866ars.AEQbTJ((java.io.Closeable) fileInputStream);
                return null;
            }
        }
        return null;
    }

    public static byte[] copydefault(java.io.File file) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        if (!copydefault) {
            return KWHzl(file);
        }
        java.io.FileInputStream fileInputStream2 = null;
        if (file != null && file.exists() && file.isFile()) {
            try {
                fileInputStream = new java.io.FileInputStream(file);
            } catch (java.lang.Exception e) {
                e = e;
                fileInputStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                C7866ars.AEQbTJ((java.io.Closeable) fileInputStream2);
                throw th;
            }
            try {
                try {
                    MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                    byte[] bArr = new byte[(int) file.length()];
                    map.get(bArr);
                    C7866ars.AEQbTJ((java.io.Closeable) fileInputStream);
                    return bArr;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C7866ars.AEQbTJ((java.io.Closeable) fileInputStream2);
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                OLrzqt(e);
                C7866ars.AEQbTJ((java.io.Closeable) fileInputStream);
                return null;
            }
        }
        return null;
    }

    public static boolean copydefault(java.io.File file, byte[] bArr) {
        if (!copydefault) {
            return OLrzqt(file, bArr);
        }
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        java.nio.channels.FileChannel channel = null;
        try {
            try {
                channel = new java.io.RandomAccessFile(file, "rw").getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0L, bArr.length);
                map.put(bArr);
                map.force();
                C7866ars.AEQbTJ(channel);
                return true;
            } catch (java.io.IOException e) {
                OLrzqt(e);
                C7866ars.AEQbTJ(channel);
                return false;
            }
        } catch (java.lang.Throwable th) {
            C7866ars.AEQbTJ(channel);
            throw th;
        }
    }

    public static boolean copydefault(java.io.File file, java.io.File file2) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.nio.channels.FileChannel fileChannel;
        java.nio.channels.FileChannel channel;
        java.nio.channels.FileChannel fileChannel2;
        java.nio.channels.FileChannel fileChannel3;
        java.io.FileInputStream fileInputStream = null;
        channel = null;
        java.nio.channels.FileChannel channel2 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        java.io.FileOutputStream fileOutputStream2 = null;
        java.io.FileOutputStream fileOutputStream3 = null;
        fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                channel = fileInputStream2.getChannel();
                try {
                    java.io.FileOutputStream fileOutputStream4 = new java.io.FileOutputStream(file2);
                    try {
                        channel2 = fileOutputStream4.getChannel();
                        channel2.transferFrom(channel, 0L, file.length());
                        C7866ars.AEQbTJ((java.io.Closeable) fileInputStream2);
                        C7866ars.AEQbTJ(channel);
                        C7866ars.AEQbTJ(fileOutputStream4);
                        C7866ars.AEQbTJ(channel2);
                        return true;
                    } catch (java.io.IOException e) {
                        e = e;
                        fileChannel3 = channel2;
                        fileOutputStream2 = fileOutputStream4;
                        fileChannel = fileChannel3;
                        fileOutputStream = fileOutputStream2;
                        fileInputStream = fileInputStream2;
                        try {
                            OLrzqt(e);
                            C7866ars.AEQbTJ((java.io.Closeable) fileInputStream);
                            C7866ars.AEQbTJ(channel);
                            C7866ars.AEQbTJ(fileOutputStream);
                            C7866ars.AEQbTJ(fileChannel);
                            return false;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            C7866ars.AEQbTJ((java.io.Closeable) fileInputStream);
                            C7866ars.AEQbTJ(channel);
                            C7866ars.AEQbTJ(fileOutputStream);
                            C7866ars.AEQbTJ(fileChannel);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileChannel2 = channel2;
                        fileOutputStream3 = fileOutputStream4;
                        fileChannel = fileChannel2;
                        fileOutputStream = fileOutputStream3;
                        fileInputStream = fileInputStream2;
                        C7866ars.AEQbTJ((java.io.Closeable) fileInputStream);
                        C7866ars.AEQbTJ(channel);
                        C7866ars.AEQbTJ(fileOutputStream);
                        C7866ars.AEQbTJ(fileChannel);
                        throw th;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    fileChannel3 = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    fileChannel2 = null;
                }
            } catch (java.io.IOException e3) {
                e = e3;
                fileChannel3 = null;
                channel = null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                fileChannel2 = null;
                channel = null;
            }
        } catch (java.io.IOException e4) {
            e = e4;
            fileOutputStream = null;
            fileChannel = null;
            channel = null;
        } catch (java.lang.Throwable th5) {
            th = th5;
            fileOutputStream = null;
            fileChannel = null;
            channel = null;
        }
    }

    public static boolean OLrzqt(java.io.File file, byte[] bArr) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    C7866ars.AEQbTJ(fileOutputStream);
                    return true;
                } catch (java.io.IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    OLrzqt(e);
                    C7866ars.AEQbTJ(fileOutputStream2);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    C7866ars.AEQbTJ(fileOutputStream);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static java.io.InputStream gEmmrt(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.isFile()) {
                return new java.io.FileInputStream(file);
            }
            return null;
        } catch (java.lang.Exception e) {
            OLrzqt(e);
            return null;
        }
    }

    public static boolean OLrzqt(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return new java.io.File(str).exists();
    }

    public static boolean KWHzl(android.content.Context context, java.lang.String str) {
        try {
            C7866ars.AEQbTJ((java.io.Closeable) context.getAssets().open(str));
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static java.io.InputStream OLrzqt(android.content.Context context, java.lang.String str) {
        try {
            return context.getAssets().open(str);
        } catch (java.io.IOException e) {
            OLrzqt(e);
            return null;
        }
    }

    public static java.lang.String EZpvd(android.content.Context context, java.lang.String str) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getAssets().open(str), com.google.android.exoplayer2.C.UTF8_NAME));
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static boolean OLrzqt(java.io.InputStream inputStream, java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(KWHzl(str)), 8192);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            bufferedOutputStream.write(bArr, 0, i);
                        } else {
                            bufferedOutputStream.flush();
                            C7866ars.AEQbTJ((java.io.Closeable) inputStream);
                            C7866ars.AEQbTJ(bufferedOutputStream);
                            return true;
                        }
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    OLrzqt(e);
                    C7866ars.AEQbTJ((java.io.Closeable) inputStream);
                    C7866ars.AEQbTJ(bufferedOutputStream2);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    C7866ars.AEQbTJ((java.io.Closeable) inputStream);
                    C7866ars.AEQbTJ(bufferedOutputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    public static void EZpvd(java.io.InputStream inputStream, java.lang.String str, long j, StateListAnimator stateListAnimator) throws java.lang.Exception {
        java.io.BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(KWHzl(str)), 8192);
        } catch (java.lang.Throwable th) {
            th = th;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            long j2 = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    bufferedOutputStream.write(bArr, 0, i);
                    j2 += (long) i;
                    if (stateListAnimator != null) {
                        stateListAnimator.EZpvd((float) (j2 / j));
                    }
                } else {
                    bufferedOutputStream.flush();
                    C7866ars.AEQbTJ(bufferedOutputStream);
                    return;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            C7866ars.AEQbTJ(bufferedOutputStream);
            throw th;
        }
    }

    public static boolean EZpvd(java.lang.String str) throws java.io.IOException {
        if (str != null) {
            return AEQbTJ(new java.io.File(str));
        }
        return false;
    }

    public static boolean AEQbTJ(java.io.File file) throws java.io.IOException {
        boolean zDelete;
        if (file == null || !file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.deleteIfExists(file.toPath());
                return true;
            }
            zDelete = file.delete();
            return !zDelete;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                if (!AEQbTJ(file2)) {
                    return false;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Files.deleteIfExists(file.toPath());
            return true;
        }
        zDelete = file.delete();
        return !zDelete;
    }

    public static void OLrzqt(java.lang.Throwable th) {
        if (AEQbTJ) {
            C7870arw.AEQbTJ(th, new java.lang.Object[0]);
        }
    }

    public static void copydefault(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC33145mqt interfaceC33145mqt) {
        new C33143mqr(context, str, str2, str3, DomainType.OSS, interfaceC33145mqt).EZpvd();
    }
}

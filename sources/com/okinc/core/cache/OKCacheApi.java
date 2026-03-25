package com.okinc.core.cache;

import android.os.Build;
import android.os.Environment;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.zip.ZipFile;
import o.YW;
import o.Za;
import o.Zc;
import o.Ze;
import o.Zk;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes23.dex */
public class OKCacheApi {
    private static long AEQbTJ;
    private static final byte[] AhwBna;
    private static char[] EZpvd;
    private static byte KWHzl;
    private static char[] OLrzqt;
    private static int copydefault;
    private static final int djBIcL;
    private static boolean gEmmrt;
    private static boolean valueOf;

    public static native boolean hasCache();

    static {
        byte[] bArr = {Ascii.SI, 4, 53, -50, 6, -6, Ascii.DC4, -3, 3, -1, -3, Ascii.FF, Ascii.SUB, -27, 9, -14, 19, -15, -5};
        AhwBna = bArr;
        djBIcL = 245;
        EZpvd();
        AEQbTJ();
        byte b = bArr[9];
        byte b2 = (byte) (-b);
        Object[] objArr = new Object[1];
        a(b2, (byte) (b2 - 1), (byte) (-b), objArr);
        EZpvd((String) objArr[0]);
    }

    private static InputStream OLrzqt(InputStream inputStream, int i, int i2, byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        YW.AEQbTJ(bArr2, KWHzl, AEQbTJ);
        return new Zc(inputStream, i2, bArr2, Za.AEQbTJ(i));
    }

    private static void c(int i, int[] iArr, char[] cArr, byte[] bArr, Object[] objArr) {
        Ze ze = new Ze();
        char[] cArr2 = EZpvd;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (((long) cArr2[i2]) ^ 5452877452951418167L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (5452877452951418167L ^ ((long) copydefault));
        if (gEmmrt) {
            ze.copydefault = bArr.length;
            char[] cArr4 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - i3);
                ze.AEQbTJ++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (valueOf) {
            ze.copydefault = cArr.length;
            char[] cArr5 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr5[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - i3);
                ze.AEQbTJ++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        ze.copydefault = iArr.length;
        char[] cArr6 = new char[ze.copydefault];
        ze.AEQbTJ = 0;
        while (ze.AEQbTJ < ze.copydefault) {
            cArr6[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - i3);
            ze.AEQbTJ++;
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        Zk zk = new Zk();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = OLrzqt;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (((long) cArr[i5]) ^ 8282470936566976269L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            char[] cArr4 = new char[i2];
            zk.EZpvd = 0;
            char c = 0;
            while (zk.EZpvd < i2) {
                if (bArr[zk.EZpvd] == 1) {
                    cArr4[zk.EZpvd] = (char) (((cArr3[zk.EZpvd] * 2) + 1) - c);
                } else {
                    cArr4[zk.EZpvd] = (char) ((cArr3[zk.EZpvd] * 2) - c);
                }
                c = cArr4[zk.EZpvd];
                zk.EZpvd++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i6, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            zk.EZpvd = 0;
            while (zk.EZpvd < i2) {
                cArr6[zk.EZpvd] = cArr3[(i2 - zk.EZpvd) - 1];
                zk.EZpvd++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            zk.EZpvd = 0;
            while (zk.EZpvd < i2) {
                cArr3[zk.EZpvd] = (char) (cArr3[zk.EZpvd] - iArr[2]);
                zk.EZpvd++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 8 - (i3 * 5);
        byte[] bArr = AhwBna;
        int i6 = (i * 9) + 102;
        int i7 = i2 * 5;
        byte[] bArr2 = new byte[i7 + 6];
        int i8 = i7 + 5;
        if (bArr == null) {
            int i9 = i8;
            i4 = 0;
            i6 = i6 + (-i9) + 2;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5++;
            i9 = bArr[i5];
            i4++;
            i6 = i6 + (-i9) + 2;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
            }
        }
    }

    static void EZpvd() {
        OLrzqt = new char[]{20298, 20388, 20431, 20423, 20423, 20389, 20388, 20431, 20423, 20423, 20389, 20388, 20420, 20419, 20384, 20387, 20416, 20444, 20414, 20415, 20417, 20427, 20417, 20421, 20417, 19986, 20011, 20461, 20012, 19990, 20461, 19998, 20005, 19998, 19985, 20009, 19990, 19995, 20015, 20346, 20451, 20473, 20454, 20454, 20468, 20468, 20475, 20478, 20476, 20273, 20344, 20324, 20324, 20327, 20328, 20311, 20309, 20335, 20325, 20320, 20280, 20328, 20324, 20315, 20317, 20330, 20327, 20325, 20290, 20359, 19995, 19996, 19974, 20292, 20364, 20364, 20353, 20363, 20357, 20286, 20331, 20321, 20304, 20296, 20276, 20347, 20350, 20325, 20281, 20323, 20327, 20309, 20311, 20321, 20345, 20349, 20320, 20348, 20327, 20316, 20311, 20321, 20331};
        EZpvd = new char[]{62526, 62512, 62499, 62922, 62511, 62520, 62509, 62524, 62501, 62510, 62936, 62525, 62505, 62914, 62523, 62508, 62527, 62522, 62498, 62507, 62917};
        copydefault = 585627025;
        valueOf = true;
        gEmmrt = true;
    }

    static void AEQbTJ() {
        AEQbTJ = 8346539560852386884L;
        KWHzl = (byte) -12;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void EZpvd(String str) throws Throwable {
        InputStream inputStream;
        Object objInvoke;
        Object objInvoke2;
        Object[] objArr = new Object[1];
        b(new int[]{39, 10, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 0, 0}, objArr);
        String str2 = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        b(new int[]{0, 25, 96, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr2);
        try {
            Object objNewInstance = File.class.getDeclaredConstructor(String.class).newInstance((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            c(127, null, null, new byte[]{-120, -121, -122, -123, -124, -125, -126, -127}, objArr3);
            if (!((Boolean) File.class.getMethod((String) objArr3[0], null).invoke(objNewInstance, null)).booleanValue()) {
                Object[] objArr4 = new Object[1];
                b(new int[]{25, 14, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 10}, true, null, objArr4);
                String str3 = (String) objArr4[0];
                objNewInstance = File.class.getDeclaredConstructor(String.class).newInstance(System.getProperty(str3, str3));
                Object[] objArr5 = new Object[1];
                c(127, null, null, new byte[]{-120, -121, -122, -123, -124, -125, -126, -127}, objArr5);
                if (!((Boolean) File.class.getMethod((String) objArr5[0], null).invoke(objNewInstance, null)).booleanValue()) {
                    objNewInstance = Environment.getExternalStorageDirectory();
                }
            }
            ClassLoader classLoader = OKCacheApi.class.getClassLoader();
            byte[] bArr = AhwBna;
            byte b = bArr[9];
            byte b2 = (byte) (-b);
            Object[] objArr6 = new Object[1];
            a(b2, (byte) (b2 - 1), (byte) (-b), objArr6);
            try {
                Object[] objArr7 = {(String) objArr6[0]};
                byte b3 = bArr[9];
                byte b4 = (byte) (b3 + 1);
                byte b5 = (byte) (-b3);
                Object[] objArr8 = new Object[1];
                a(b4, b5, (byte) (b5 - 1), objArr8);
                Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr8[0], String.class);
                declaredMethod.setAccessible(true);
                String str4 = (String) declaredMethod.invoke(classLoader, objArr7);
                if (str4 == null) {
                    Object[] objArr9 = new Object[1];
                    b(new int[]{49, 11, 0, 0}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1}, objArr9);
                    Runtime.class.getMethod((String) objArr9[0], String.class).invoke(Runtime.class.getMethod(str2, null).invoke(null, null), str);
                    return;
                }
                Object[] objArr10 = new Object[1];
                c(127, null, null, new byte[]{-113, -114, -115, -120, -116, -125, -117, -121, -118, -126, -119}, objArr10);
                Object[] objArr11 = {Integer.valueOf(((Integer) String.class.getMethod((String) objArr10[0], Integer.TYPE).invoke(str4, 47)).intValue() + 1)};
                Object[] objArr12 = new Object[1];
                c(127, null, null, new byte[]{-110, -125, -122, -123, -121, -118, -111, -112, -118}, objArr12);
                Object objNewInstance2 = File.class.getDeclaredConstructor(File.class, String.class).newInstance(objNewInstance, String.class.getMethod((String) objArr12[0], Integer.TYPE).invoke(str4, objArr11));
                Object[] objArr13 = new Object[1];
                c(127, null, null, new byte[]{-118, -125, -122, -126, -121, -125, -109, -127}, objArr13);
                if (((Boolean) String.class.getMethod((String) objArr13[0], CharSequence.class).invoke(str4, "!")).booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr14 = new Object[1];
                    b(new int[]{60, 9, 0, 0}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 1}, objArr14);
                    sb.append((String) objArr14[0]);
                    sb.append(str4);
                    String path = new URL(sb.toString()).getPath();
                    Object[] objArr15 = new Object[1];
                    c(127, null, null, new byte[]{-113, -114, -115, -120, -116, -125, -117, -121, -118, -126, -119}, objArr15);
                    Object[] objArr16 = {5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr15[0], String.class).invoke(path, "!/")).intValue())};
                    Object[] objArr17 = new Object[1];
                    c(127, null, null, new byte[]{-110, -125, -122, -123, -121, -118, -111, -112, -118}, objArr17);
                    ZipFile zipFile = new ZipFile((String) String.class.getMethod((String) objArr17[0], Integer.TYPE, Integer.TYPE).invoke(path, objArr16));
                    Object[] objArr18 = new Object[1];
                    c(127, null, null, new byte[]{-113, -114, -115, -120, -116, -125, -117, -121, -118, -126, -119}, objArr18);
                    Object[] objArr19 = {Integer.valueOf(((Integer) String.class.getMethod((String) objArr18[0], String.class).invoke(str4, "!/")).intValue())};
                    Object[] objArr20 = new Object[1];
                    c(127, null, null, new byte[]{-110, -125, -122, -123, -121, -118, -111, -112, -118}, objArr20);
                    Object objInvoke3 = String.class.getMethod((String) objArr20[0], Integer.TYPE).invoke(str4, objArr19);
                    Object[] objArr21 = {2};
                    Object[] objArr22 = new Object[1];
                    c(127, null, null, new byte[]{-110, -125, -122, -123, -121, -118, -111, -112, -118}, objArr22);
                    inputStream = zipFile.getInputStream(zipFile.getEntry((String) String.class.getMethod((String) objArr22[0], Integer.TYPE).invoke(objInvoke3, objArr21)));
                } else {
                    inputStream = (InputStream) FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str4);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                bufferedInputStream.skip(5L);
                InputStream inputStreamOLrzqt = OLrzqt(bufferedInputStream, -511238536, 3, new byte[]{88, 32, Ascii.FF, -108, 117, 77, 58, -1, 46, -44, -38, -54, 6, Ascii.EM, 98, 50});
                if (bufferedInputStream != inputStreamOLrzqt) {
                    OutputStream outputStream = (OutputStream) FileOutputStream.class.getDeclaredConstructor(File.class).newInstance(objNewInstance2);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int i = inputStreamOLrzqt.read(bArr2);
                        if (i < 0) {
                            break;
                        } else {
                            bufferedOutputStream.write(bArr2, 0, i);
                        }
                    }
                    bufferedOutputStream.flush();
                    Object[] objArr23 = new Object[1];
                    b(new int[]{79, 5, 0, 0}, false, new byte[]{1, 0, 1, 0, 0}, objArr23);
                    Object objInvoke4 = FileOutputStream.class.getMethod((String) objArr23[0], null).invoke(outputStream, null);
                    Object[] objArr24 = new Object[1];
                    b(new int[]{84, 4, 0, 0}, false, new byte[]{1, 0, 1, 1}, objArr24);
                    FileDescriptor.class.getMethod((String) objArr24[0], null).invoke(objInvoke4, null);
                    bufferedOutputStream.close();
                    inputStreamOLrzqt.close();
                    try {
                        try {
                            try {
                                Object objInvoke5 = Runtime.class.getMethod(str2, null).invoke(null, null);
                                try {
                                    Object[] objArr25 = new Object[1];
                                    b(new int[]{88, 15, 0, 0}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr25);
                                    try {
                                        Object[] objArr26 = {File.class.getMethod((String) objArr25[0], null).invoke(objNewInstance2, null), OKCacheApi.class.getClassLoader()};
                                        Object[] objArr27 = new Object[1];
                                        b(new int[]{69, 4, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 4}, false, new byte[]{1, 1, 0, 1}, objArr27);
                                        Method declaredMethod2 = Runtime.class.getDeclaredMethod((String) objArr27[0], String.class, ClassLoader.class);
                                        declaredMethod2.setAccessible(true);
                                        declaredMethod2.invoke(objInvoke5, objArr26);
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } catch (NoSuchMethodException unused) {
                                objInvoke = Runtime.class.getMethod(str2, null).invoke(null, null);
                                Object[] objArr28 = new Object[1];
                                b(new int[]{88, 15, 0, 0}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr28);
                                Object objInvoke6 = File.class.getMethod((String) objArr28[0], null).invoke(objNewInstance2, null);
                                ClassLoader classLoader2 = OKCacheApi.class.getClassLoader();
                                synchronized (objInvoke) {
                                }
                            }
                        } catch (Exception unused2) {
                            if (Build.VERSION.SDK_INT <= 27) {
                                try {
                                    Object objInvoke7 = Runtime.class.getMethod(str2, null).invoke(null, null);
                                    try {
                                        Object[] objArr29 = new Object[1];
                                        b(new int[]{88, 15, 0, 0}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr29);
                                        try {
                                            Object[] objArr30 = {File.class.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null), OKCacheApi.class.getClassLoader()};
                                            Object[] objArr31 = new Object[1];
                                            b(new int[]{73, 6, 36, 5}, false, new byte[]{1, 1, 1, 0, 1, 0}, objArr31);
                                            Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr31[0], String.class, ClassLoader.class);
                                            declaredMethod3.setAccessible(true);
                                            declaredMethod3.invoke(objInvoke7, objArr30);
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 == null) {
                                                throw th3;
                                            }
                                            throw cause3;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 == null) {
                                            throw th4;
                                        }
                                        throw cause4;
                                    }
                                } catch (Throwable th5) {
                                    Throwable cause5 = th5.getCause();
                                    if (cause5 == null) {
                                        throw th5;
                                    }
                                    throw cause5;
                                }
                            } else {
                                objInvoke = Runtime.class.getMethod(str2, null).invoke(null, null);
                                Object[] objArr282 = new Object[1];
                                b(new int[]{88, 15, 0, 0}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}, objArr282);
                                Object objInvoke62 = File.class.getMethod((String) objArr282[0], null).invoke(objNewInstance2, null);
                                ClassLoader classLoader22 = OKCacheApi.class.getClassLoader();
                                synchronized (objInvoke) {
                                    try {
                                        Object[] objArr32 = {objInvoke62, classLoader22};
                                        Object[] objArr33 = new Object[1];
                                        c(127, null, null, new byte[]{-116, -126, -109, -107, -120, -108, -122, -121, -126, -125}, objArr33);
                                        Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                        declaredMethod4.setAccessible(true);
                                        String str5 = (String) declaredMethod4.invoke(objInvoke, objArr32);
                                        if (str5 != null) {
                                            throw new UnsatisfiedLinkError(str5);
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause6 = th6.getCause();
                                        if (cause6 == null) {
                                            throw th6;
                                        }
                                        throw cause6;
                                    }
                                }
                            }
                        }
                        try {
                            Object[] objArr34 = new Object[1];
                            c(127, null, null, new byte[]{-120, -121, -120, -119, -120, -116}, objArr34);
                            ((Boolean) File.class.getMethod((String) objArr34[0], null).invoke(objNewInstance2, null)).booleanValue();
                            return;
                        } catch (Throwable th7) {
                            try {
                                Throwable cause7 = th7.getCause();
                                if (cause7 == null) {
                                    throw th7;
                                }
                                throw cause7;
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                    } catch (Throwable th8) {
                        Throwable cause8 = th8.getCause();
                        if (cause8 == null) {
                            throw th8;
                        }
                        throw cause8;
                    }
                }
                inputStreamOLrzqt.close();
                try {
                    try {
                        Object objInvoke8 = Runtime.class.getMethod(str2, null).invoke(null, null);
                        try {
                            try {
                                Object[] objArr35 = {str4, OKCacheApi.class.getClassLoader()};
                                Object[] objArr36 = new Object[1];
                                b(new int[]{69, 4, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 4}, false, new byte[]{1, 1, 0, 1}, objArr36);
                                Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr36[0], String.class, ClassLoader.class);
                                declaredMethod5.setAccessible(true);
                                declaredMethod5.invoke(objInvoke8, objArr35);
                            } catch (NoSuchMethodException unused4) {
                                objInvoke2 = Runtime.class.getMethod(str2, null).invoke(null, null);
                                ClassLoader classLoader3 = OKCacheApi.class.getClassLoader();
                                synchronized (objInvoke2) {
                                }
                            }
                        } catch (Throwable th9) {
                            Throwable cause9 = th9.getCause();
                            if (cause9 == null) {
                                throw th9;
                            }
                            throw cause9;
                        }
                    } catch (Exception unused5) {
                        if (Build.VERSION.SDK_INT <= 27) {
                            try {
                                Object objInvoke9 = Runtime.class.getMethod(str2, null).invoke(null, null);
                                try {
                                    Object[] objArr37 = {str4, OKCacheApi.class.getClassLoader()};
                                    Object[] objArr38 = new Object[1];
                                    b(new int[]{73, 6, 36, 5}, false, new byte[]{1, 1, 1, 0, 1, 0}, objArr38);
                                    Method declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr38[0], String.class, ClassLoader.class);
                                    declaredMethod6.setAccessible(true);
                                    declaredMethod6.invoke(objInvoke9, objArr37);
                                    return;
                                } catch (Throwable th10) {
                                    Throwable cause10 = th10.getCause();
                                    if (cause10 == null) {
                                        throw th10;
                                    }
                                    throw cause10;
                                }
                            } catch (Throwable th11) {
                                Throwable cause11 = th11.getCause();
                                if (cause11 == null) {
                                    throw th11;
                                }
                                throw cause11;
                            }
                        }
                        objInvoke2 = Runtime.class.getMethod(str2, null).invoke(null, null);
                        ClassLoader classLoader32 = OKCacheApi.class.getClassLoader();
                        synchronized (objInvoke2) {
                            try {
                                Object[] objArr39 = new Object[1];
                                c(127, null, null, new byte[]{-116, -126, -109, -107, -120, -108, -122, -121, -126, -125}, objArr39);
                                Method declaredMethod7 = Runtime.class.getDeclaredMethod((String) objArr39[0], String.class, ClassLoader.class);
                                declaredMethod7.setAccessible(true);
                                String str6 = (String) declaredMethod7.invoke(objInvoke2, str4, classLoader32);
                                if (str6 != null) {
                                    throw new UnsatisfiedLinkError(str6);
                                }
                            } catch (Throwable th12) {
                                Throwable cause12 = th12.getCause();
                                if (cause12 == null) {
                                    throw th12;
                                }
                                throw cause12;
                            }
                        }
                    }
                } catch (Throwable th13) {
                    Throwable cause13 = th13.getCause();
                    if (cause13 == null) {
                        throw th13;
                    }
                    throw cause13;
                }
            } catch (Throwable th14) {
                Throwable cause14 = th14.getCause();
                if (cause14 == null) {
                    throw th14;
                }
                throw cause14;
            }
        } catch (Throwable th15) {
            Throwable cause15 = th15.getCause();
            if (cause15 == null) {
                throw th15;
            }
            throw cause15;
        }
    }
}

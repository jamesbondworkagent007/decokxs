package o;

import com.google.common.base.Ascii;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipFile;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class Zr {
    private static int EZpvd;
    private static final byte[] copydefault = {95, 45, -118, 121, 3, 5, -10, -24, Ascii.GS, -7, 16, -17, 17, 7, -21, 5, -21, 8, 33, -79, 83, 2, -12, Ascii.VT, -19, 1, 10, -7, -69, 65, 17, -15, 5, 1, Ascii.VT, -15, -2, 17, 1, -3, -13, -69, 70, 9, 6, -7, -10, -68, 70, 9, 3, -82, 78, -13, 19, -11, Ascii.CR, -17, -69, 76, -3, -7, 16, -17, 17, 7, -63, -26};
    private static final int OLrzqt = CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA;

    public static java.lang.String AEQbTJ(int i) {
        return null;
    }

    public static java.lang.String EZpvd(int i) {
        return null;
    }

    public static java.lang.String OLrzqt(java.lang.Class cls, java.lang.String str) {
        try {
            int iCopydefault = copydefault(str.getBytes(StandardCharsets.UTF_8));
            java.lang.String strEZpvd = EZpvd(iCopydefault);
            if (strEZpvd == null) {
                byte[] bArr = copydefault;
                byte b = bArr[5];
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(b, (byte) (b - 5), (byte) (-bArr[25]), objArr);
                java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr[0], java.lang.String.class);
                declaredMethod.setAccessible(true);
                return (java.lang.String) declaredMethod.invoke(Zr.class.getClassLoader(), str);
            }
            int iEZpvd = EZpvd(cls, str, strEZpvd);
            int i = iCopydefault ^ iEZpvd;
            java.lang.String strAEQbTJ = AEQbTJ(i);
            if (strAEQbTJ != null) {
                return strAEQbTJ;
            }
            byte[] bArr2 = copydefault;
            byte b2 = bArr2[5];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(b2, (byte) (b2 - 5), (byte) (-bArr2[25]), objArr2);
            java.lang.reflect.Method declaredMethod2 = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr2[0], java.lang.String.class);
            declaredMethod2.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod2.invoke(Zr.class.getClassLoader(), str);
            if (objInvoke == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(bArr2[21], bArr2[18], bArr2[43], objArr3);
                sb.append((java.lang.String) objArr3[0]);
                sb.append(str);
                byte b3 = (byte) (bArr2[25] - 1);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(b3, (byte) (b3 | 58), bArr2[56], objArr4);
                sb.append((java.lang.String) objArr4[0]);
                sb.append(strEZpvd);
                byte b4 = (byte) (bArr2[25] - 1);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a(b4, (byte) (b4 | 58), bArr2[56], objArr5);
                sb.append((java.lang.String) objArr5[0]);
                sb.append(i);
                byte b5 = (byte) (bArr2[25] - 1);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(b5, (byte) (b5 | 58), bArr2[56], objArr6);
                sb.append((java.lang.String) objArr6[0]);
                sb.append(iEZpvd);
                byte b6 = (byte) (bArr2[25] - 1);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(b6, (byte) (b6 | 61), bArr2[56], objArr7);
                sb.append((java.lang.String) objArr7[0]);
                throw new java.lang.RuntimeException(sb.toString());
            }
            return (java.lang.String) objInvoke;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static int EZpvd(java.lang.Class cls, java.lang.String str, java.lang.String str2) throws java.lang.NoSuchMethodException, java.io.IOException {
        byte[] bArr = copydefault;
        byte b = bArr[5];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (byte) (b - 5), (byte) (-bArr[25]), objArr);
        java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr[0], java.lang.String.class);
        declaredMethod.setAccessible(true);
        java.lang.String str3 = (java.lang.String) declaredMethod.invoke(cls.getClassLoader(), str2);
        if (str3 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((byte) 25, (byte) (-bArr[7]), bArr[56], objArr2);
            sb.append((java.lang.String) objArr2[0]);
            sb.append(str);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.io.InputStream fileInputStream = null;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((byte) (bArr[25] - 1), (byte) (-bArr[28]), (byte) (-bArr[66]), objArr3);
            if (str3.contains((java.lang.String) objArr3[0])) {
                int iLastIndexOf = str3.lastIndexOf(33);
                java.lang.String strSubstring = str3.substring(0, iLastIndexOf);
                java.lang.String strSubstring2 = str3.substring(iLastIndexOf + 1);
                byte b2 = (byte) (bArr[25] - 1);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(b2, (byte) (b2 | 55), (byte) (-bArr[66]), objArr4);
                if (strSubstring2.startsWith((java.lang.String) objArr4[0])) {
                    strSubstring2 = strSubstring2.substring(1);
                }
                ZipFile zipFile = new ZipFile(strSubstring);
                fileInputStream = zipFile.getInputStream(zipFile.getEntry(strSubstring2));
            } else {
                fileInputStream = new java.io.FileInputStream(str3);
            }
            fileInputStream.skip(4L);
            int i = fileInputStream.read() == 1 ? 4 : 8;
            fileInputStream.skip(i + 19 + i + i + 16);
            return (fileInputStream.read() << 24) | (fileInputStream.read() << 16) | (fileInputStream.read() << 8) | fileInputStream.read();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }

    private static int copydefault(byte[] bArr) {
        int i = EZpvd;
        for (byte b : bArr) {
            i = (i ^ b) * 16777619;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = s + 4;
        int i5 = i * 2;
        byte[] bArr = copydefault;
        int i6 = 102 - i2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6 = i5;
            i6 += i7;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i4];
            i6 += i7;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }
}

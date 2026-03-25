package o;

import android.os.Build;
import com.google.common.base.Ascii;
import java.util.zip.ZipFile;
import o.InterfaceC44717scG;
import o.YG;
import okio.Utf8;

/* JADX INFO: renamed from: o.scB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C44712scB {
    public static YG.ActionBar AEQbTJ = null;
    private static char AYXKKw = 0;
    private static byte AhwBna = 0;
    public static android.content.Context EZpvd = null;
    public static volatile boolean KWHzl = false;
    private static long OLrzqt;
    public static InterfaceC44717scG copydefault;
    private static int[] djBIcL;
    private static final byte[] gEmmrt = {Ascii.DC4, 77, -57, -89, -6, 6, -20, 3, -3, 1, 3, -12, -26, Ascii.ESC, -9, Ascii.SO, -19, Ascii.SI, 5};
    private static final int isConnected = 57;
    private static char[] valueOf;

    /* JADX INFO: renamed from: o.scB$TaskDescription */
    public static class TaskDescription implements YG.ActionBar {
        @Override // o.YG.ActionBar
        public void log(java.lang.String str) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault() {
        return KWHzl;
    }

    public static void copydefault(android.content.Context context, YG.ActionBar actionBar, InterfaceC44717scG interfaceC44717scG) {
        EZpvd = context;
        if (actionBar != null) {
            AEQbTJ = actionBar;
        } else {
            AEQbTJ = new TaskDescription();
        }
        AEQbTJ.log("init");
        if (interfaceC44717scG != null) {
            copydefault = interfaceC44717scG;
        } else {
            copydefault = new InterfaceC44717scG.StateListAnimator();
        }
        AEQbTJ.log("before oksafe loadLibrary");
        OLrzqt();
        AEQbTJ.log("after oksafe loadLibrary");
    }

    public static void OLrzqt() {
        synchronized (C44712scB.class) {
            try {
                if (!KWHzl) {
                    if (AEQbTJ == null) {
                        AEQbTJ = new TaskDescription();
                    }
                    if (EZpvd == null) {
                        AEQbTJ.log("System LoadLibrary begin");
                        byte b = gEmmrt[9];
                        byte b2 = (byte) (-b);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(b, b2, (byte) (b2 + 1), objArr);
                        EZpvd((java.lang.String) objArr[0]);
                    } else {
                        AEQbTJ.log("ReLinker LoadLibrary begin");
                        YG.copydefault(AEQbTJ).EZpvd(EZpvd, "oksafe");
                    }
                    KWHzl = true;
                    AEQbTJ.log("LoadLibrarySuccess");
                }
            } catch (java.lang.Throwable th) {
                KWHzl = false;
                InterfaceC44717scG interfaceC44717scG = copydefault;
                if (interfaceC44717scG != null) {
                    interfaceC44717scG.AEQbTJ(th);
                }
                YG.ActionBar actionBar = AEQbTJ;
                if (actionBar != null) {
                    actionBar.log("load sosafe failed, error : " + th);
                }
                try {
                    byte b3 = gEmmrt[9];
                    byte b4 = (byte) (-b3);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(b3, b4, (byte) (b4 + 1), objArr2);
                } catch (java.lang.Throwable th2) {
                    YG.ActionBar actionBar2 = AEQbTJ;
                    if (actionBar2 != null) {
                        actionBar2.log("load sosafe failed again, error : " + th2);
                    }
                }
            }
        }
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        Zm zm = new Zm();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = djBIcL;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (((long) iArr2[i2]) ^ 613195425809619345L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = djBIcL;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (((long) iArr5[i3]) ^ 613195425809619345L);
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        zm.OLrzqt = 0;
        while (zm.OLrzqt < iArr.length) {
            cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
            cArr[1] = (char) iArr[zm.OLrzqt];
            cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
            cArr[3] = (char) iArr[zm.OLrzqt + 1];
            zm.copydefault = (cArr[0] << 16) + cArr[1];
            zm.KWHzl = (cArr[2] << 16) + cArr[3];
            Zm.EZpvd(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                zm.copydefault ^= iArr4[i4];
                zm.KWHzl = Zm.AEQbTJ(zm.copydefault) ^ zm.KWHzl;
                int i5 = zm.copydefault;
                zm.copydefault = zm.KWHzl;
                zm.KWHzl = i5;
            }
            int i6 = zm.copydefault;
            zm.copydefault = zm.KWHzl;
            zm.KWHzl = i6;
            zm.KWHzl ^= iArr4[16];
            zm.copydefault ^= iArr4[17];
            int i7 = zm.copydefault;
            int i8 = zm.KWHzl;
            cArr[0] = (char) (zm.copydefault >>> 16);
            cArr[1] = (char) zm.copydefault;
            cArr[2] = (char) (zm.KWHzl >>> 16);
            cArr[3] = (char) zm.KWHzl;
            Zm.EZpvd(iArr4);
            cArr2[zm.OLrzqt * 2] = cArr[0];
            cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
            cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
            cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
            zm.OLrzqt += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static java.io.InputStream AEQbTJ(java.io.InputStream inputStream, int i, int i2, byte[] bArr) throws java.io.IOException {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        YW.AEQbTJ(bArr2, AhwBna, OLrzqt);
        return new Zc(inputStream, i2, bArr2, Za.AEQbTJ(i));
    }

    private static void c(char[] cArr, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        Zg zg = new Zg();
        char[] cArr2 = valueOf;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ (-1373230739542369308L));
            }
            cArr2 = cArr3;
        }
        char c = (char) ((-1373230739542369308L) ^ ((long) AYXKKw));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            zg.KWHzl = 0;
            while (zg.KWHzl < i2) {
                zg.AEQbTJ = cArr[zg.KWHzl];
                zg.OLrzqt = cArr[zg.KWHzl + 1];
                if (zg.AEQbTJ == zg.OLrzqt) {
                    cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                    cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                } else {
                    zg.copydefault = zg.AEQbTJ / c;
                    zg.AYXKKw = zg.AEQbTJ % c;
                    zg.EZpvd = zg.OLrzqt / c;
                    zg.djBIcL = zg.OLrzqt % c;
                    if (zg.AYXKKw == zg.djBIcL) {
                        zg.copydefault = ((zg.copydefault + c) - 1) % c;
                        zg.EZpvd = ((zg.EZpvd + c) - 1) % c;
                        int i4 = (zg.copydefault * c) + zg.AYXKKw;
                        int i5 = (zg.EZpvd * c) + zg.djBIcL;
                        cArr4[zg.KWHzl] = cArr2[i4];
                        cArr4[zg.KWHzl + 1] = cArr2[i5];
                    } else if (zg.copydefault == zg.EZpvd) {
                        zg.AYXKKw = ((zg.AYXKKw + c) - 1) % c;
                        zg.djBIcL = ((zg.djBIcL + c) - 1) % c;
                        int i6 = (zg.copydefault * c) + zg.AYXKKw;
                        int i7 = (zg.EZpvd * c) + zg.djBIcL;
                        cArr4[zg.KWHzl] = cArr2[i6];
                        cArr4[zg.KWHzl + 1] = cArr2[i7];
                    } else {
                        int i8 = (zg.copydefault * c) + zg.djBIcL;
                        int i9 = (zg.EZpvd * c) + zg.AYXKKw;
                        cArr4[zg.KWHzl] = cArr2[i8];
                        cArr4[zg.KWHzl + 1] = cArr2[i9];
                    }
                }
                zg.KWHzl += 2;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = gEmmrt;
        int i4 = (i * 9) + 102;
        int i5 = s + 4;
        int i6 = (s2 * 5) + 6;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i5 + i8 + 2;
            i2 = i3;
            i5 = i7;
            i4 = i9;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i5 + 1;
            i8 = bArr[i10];
            i5 = i4;
            i7 = i10;
            int i92 = i5 + i8 + 2;
            i2 = i3;
            i5 = i7;
            i4 = i92;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static void EZpvd() {
        valueOf = new char[]{11795, 11785, 11794, 11798, 11804, 11822, 11807, 11805, 11797, 11832, 11806, 11783, 11789, 11796, 11802, 11801, 11857, 11817, 11856, 11749, 11792, 11784, 11782, 11748, 11750, 11787, 11826, 11803, 11839, 11788, 11786, 11799, 11793, 11800, 11834, 11844};
        AYXKKw = (char) 7138;
        djBIcL = new int[]{-571758658, 1386583581, -1221419014, 474250132, 1041821197, 1308020496, 269588928, -1433243016, 1003641776, -1699108102, 1922778259, 988039955, -693826713, -363675001, 1667442090, 1802721387, 914203972, -621864123};
    }

    static {
        EZpvd();
        OLrzqt = 8346539560852386884L;
        AhwBna = (byte) -12;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void EZpvd(java.lang.String str) throws java.lang.Throwable {
        java.io.InputStream inputStream;
        java.lang.Object objInvoke;
        java.lang.Object objInvoke2;
        java.lang.Object objInvoke3;
        java.lang.Object objInvoke4;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(new int[]{-1409210122, -1116444983, 1674905759, -1612968151, -365783509, 236688634}, 10, objArr);
        java.lang.String str2 = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        c(new char[]{17, 15, '\f', 0, '\n', '\f', '\f', '\b', 0, '\f', '\r', '\n', 30, 2, 20, 30, '\n', 20, 19, 0, '\b', 0, 3, 26, 13912}, (byte) 106, 25, objArr2);
        try {
            java.lang.Object objNewInstance = java.io.File.class.getDeclaredConstructor(java.lang.String.class).newInstance((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            c(new char[]{'\b', 7, 23, 14, 25, '#', '!', 24}, Utf8.REPLACEMENT_BYTE, 8, objArr3);
            if (!((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr3[0], null).invoke(objNewInstance, null)).booleanValue()) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(new int[]{-1581870559, 404575204, 609930418, -1642863764, 155659981, -530317052, -460710843, -1530117279}, 14, objArr4);
                java.lang.String str3 = (java.lang.String) objArr4[0];
                objNewInstance = java.io.File.class.getDeclaredConstructor(java.lang.String.class).newInstance(java.lang.System.getProperty(str3, str3));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                c(new char[]{'\b', 7, 23, 14, 25, '#', '!', 24}, Utf8.REPLACEMENT_BYTE, 8, objArr5);
                if (!((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr5[0], null).invoke(objNewInstance, null)).booleanValue()) {
                    objNewInstance = android.os.Environment.getExternalStorageDirectory();
                }
            }
            java.lang.ClassLoader classLoader = C44712scB.class.getClassLoader();
            byte[] bArr = gEmmrt;
            byte b = bArr[9];
            byte b2 = (byte) (-b);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(b, b2, (byte) (b2 + 1), objArr6);
            try {
                java.lang.Object[] objArr7 = {(java.lang.String) objArr6[0]};
                byte b3 = bArr[9];
                byte b4 = (byte) (b3 - 1);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a(b4, (byte) (b4 + 4), b3, objArr8);
                java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr8[0], java.lang.String.class);
                declaredMethod.setAccessible(true);
                java.lang.String str4 = (java.lang.String) declaredMethod.invoke(classLoader, objArr7);
                if (str4 == null) {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(new int[]{19541988, -1935840553, 527874518, -1639265368, 898169313, -244560102}, 11, objArr9);
                    java.lang.Runtime.class.getMethod((java.lang.String) objArr9[0], java.lang.String.class).invoke(java.lang.Runtime.class.getMethod(str2, null).invoke(null, null), str);
                    return;
                }
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(new int[]{771768666, -2005102036, -300002904, 108137829, -339812211, 2010396443}, 11, objArr10);
                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE).invoke(str4, 47)).intValue() + 1)};
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                b(new int[]{1184330353, 148866512, -597203382, 1798625921, 77524721, 2045295595}, 9, objArr12);
                java.lang.Object objNewInstance2 = java.io.File.class.getDeclaredConstructor(java.io.File.class, java.lang.String.class).newInstance(objNewInstance, java.lang.String.class.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE).invoke(str4, objArr11));
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                b(new int[]{-585069655, -860415446, -39242663, 1609804132}, 8, objArr13);
                if (((java.lang.Boolean) java.lang.String.class.getMethod((java.lang.String) objArr13[0], java.lang.CharSequence.class).invoke(str4, "!")).booleanValue()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    c(new char[]{'\f', 7, '#', 5, '\"', ' ', 3, 26, 13825}, (byte) 97, 9, objArr14);
                    sb.append((java.lang.String) objArr14[0]);
                    sb.append(str4);
                    java.lang.String path = new java.net.URL(sb.toString()).getPath();
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    b(new int[]{771768666, -2005102036, -300002904, 108137829, -339812211, 2010396443}, 11, objArr15);
                    java.lang.Object[] objArr16 = {5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr15[0], java.lang.String.class).invoke(path, "!/")).intValue())};
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    b(new int[]{1184330353, 148866512, -597203382, 1798625921, 77524721, 2045295595}, 9, objArr17);
                    ZipFile zipFile = new ZipFile((java.lang.String) java.lang.String.class.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(path, objArr16));
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    b(new int[]{771768666, -2005102036, -300002904, 108137829, -339812211, 2010396443}, 11, objArr18);
                    java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr18[0], java.lang.String.class).invoke(str4, "!/")).intValue())};
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    b(new int[]{1184330353, 148866512, -597203382, 1798625921, 77524721, 2045295595}, 9, objArr20);
                    java.lang.Object objInvoke5 = java.lang.String.class.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE).invoke(str4, objArr19);
                    java.lang.Object[] objArr21 = {2};
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    b(new int[]{1184330353, 148866512, -597203382, 1798625921, 77524721, 2045295595}, 9, objArr22);
                    inputStream = zipFile.getInputStream(zipFile.getEntry((java.lang.String) java.lang.String.class.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE).invoke(objInvoke5, objArr21)));
                } else {
                    inputStream = (java.io.InputStream) java.io.FileInputStream.class.getDeclaredConstructor(java.lang.String.class).newInstance(str4);
                }
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                bufferedInputStream.skip(5L);
                java.io.InputStream inputStreamAEQbTJ = AEQbTJ(bufferedInputStream, -511238536, 3, new byte[]{88, 32, Ascii.FF, -108, 117, 77, 58, -1, 46, -44, -38, -54, 6, Ascii.EM, 98, 50});
                if (bufferedInputStream == inputStreamAEQbTJ) {
                    inputStreamAEQbTJ.close();
                    try {
                        try {
                            objInvoke4 = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Exception unused) {
                        if (Build.VERSION.SDK_INT <= 27) {
                            try {
                                java.lang.Object objInvoke6 = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                                try {
                                    java.lang.Object[] objArr23 = {str4, C44712scB.class.getClassLoader()};
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    b(new int[]{1218307386, -1616285141, -958723270, -60662860}, 6, objArr24);
                                    java.lang.reflect.Method declaredMethod2 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr24[0], java.lang.String.class, java.lang.ClassLoader.class);
                                    declaredMethod2.setAccessible(true);
                                    declaredMethod2.invoke(objInvoke6, objArr23);
                                    return;
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }
                        objInvoke3 = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                        java.lang.ClassLoader classLoader2 = C44712scB.class.getClassLoader();
                        synchronized (objInvoke3) {
                        }
                    }
                    try {
                        try {
                            java.lang.Object[] objArr25 = {str4, C44712scB.class.getClassLoader()};
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            b(new int[]{19541988, -1935840553}, 4, objArr26);
                            java.lang.reflect.Method declaredMethod3 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr26[0], java.lang.String.class, java.lang.ClassLoader.class);
                            declaredMethod3.setAccessible(true);
                            declaredMethod3.invoke(objInvoke4, objArr25);
                            return;
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    } catch (java.lang.NoSuchMethodException unused2) {
                        objInvoke3 = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                        java.lang.ClassLoader classLoader22 = C44712scB.class.getClassLoader();
                        synchronized (objInvoke3) {
                            try {
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                c(new char[]{18, '\b', 31, ' ', 27, '!', ' ', 2, '\b', '\f'}, (byte) 50, 10, objArr27);
                                java.lang.reflect.Method declaredMethod4 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr27[0], java.lang.String.class, java.lang.ClassLoader.class);
                                declaredMethod4.setAccessible(true);
                                java.lang.String str5 = (java.lang.String) declaredMethod4.invoke(objInvoke3, str4, classLoader22);
                                if (str5 != null) {
                                    throw new java.lang.UnsatisfiedLinkError(str5);
                                }
                            } catch (java.lang.Throwable th5) {
                                java.lang.Throwable cause5 = th5.getCause();
                                if (cause5 == null) {
                                    throw th5;
                                }
                                throw cause5;
                            }
                        }
                        return;
                    }
                }
                java.io.OutputStream outputStream = (java.io.OutputStream) java.io.FileOutputStream.class.getDeclaredConstructor(java.io.File.class).newInstance(objNewInstance2);
                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i = inputStreamAEQbTJ.read(bArr2);
                    if (i < 0) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr2, 0, i);
                    }
                }
                bufferedOutputStream.flush();
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                c(new char[]{21, '!', '!', 6, 13862}, (byte) 72, 5, objArr28);
                java.lang.Object objInvoke7 = java.io.FileOutputStream.class.getMethod((java.lang.String) objArr28[0], null).invoke(outputStream, null);
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                c(new char[]{17, 6, 19, '\b'}, (byte) 48, 4, objArr29);
                java.io.FileDescriptor.class.getMethod((java.lang.String) objArr29[0], null).invoke(objInvoke7, null);
                bufferedOutputStream.close();
                inputStreamAEQbTJ.close();
                try {
                    try {
                        objInvoke2 = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                    } catch (java.lang.Throwable th6) {
                        java.lang.Throwable cause6 = th6.getCause();
                        if (cause6 == null) {
                            throw th6;
                        }
                        throw cause6;
                    }
                } catch (java.lang.Exception unused3) {
                    if (Build.VERSION.SDK_INT <= 27) {
                        try {
                            java.lang.Object objInvoke8 = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                            try {
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c(new char[]{21, '!', '\"', 24, 0, 16, 2, '\b', 24, 31, 29, 3, '\f', 0, 13900}, (byte) 90, 15, objArr30);
                                try {
                                    java.lang.Object[] objArr31 = {java.io.File.class.getMethod((java.lang.String) objArr30[0], null).invoke(objNewInstance2, null), C44712scB.class.getClassLoader()};
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    b(new int[]{1218307386, -1616285141, -958723270, -60662860}, 6, objArr32);
                                    java.lang.reflect.Method declaredMethod5 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr32[0], java.lang.String.class, java.lang.ClassLoader.class);
                                    declaredMethod5.setAccessible(true);
                                    declaredMethod5.invoke(objInvoke8, objArr31);
                                } catch (java.lang.Throwable th7) {
                                    java.lang.Throwable cause7 = th7.getCause();
                                    if (cause7 == null) {
                                        throw th7;
                                    }
                                    throw cause7;
                                }
                            } catch (java.lang.Throwable th8) {
                                java.lang.Throwable cause8 = th8.getCause();
                                if (cause8 == null) {
                                    throw th8;
                                }
                                throw cause8;
                            }
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause9 = th9.getCause();
                            if (cause9 == null) {
                                throw th9;
                            }
                            throw cause9;
                        }
                    } else {
                        objInvoke = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        c(new char[]{21, '!', '\"', 24, 0, 16, 2, '\b', 24, 31, 29, 3, '\f', 0, 13900}, (byte) 90, 15, objArr33);
                        java.lang.Object objInvoke9 = java.io.File.class.getMethod((java.lang.String) objArr33[0], null).invoke(objNewInstance2, null);
                        java.lang.ClassLoader classLoader3 = C44712scB.class.getClassLoader();
                        synchronized (objInvoke) {
                        }
                    }
                }
                try {
                    try {
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        c(new char[]{21, '!', '\"', 24, 0, 16, 2, '\b', 24, 31, 29, 3, '\f', 0, 13900}, (byte) 90, 15, objArr34);
                        try {
                            java.lang.Object[] objArr35 = {java.io.File.class.getMethod((java.lang.String) objArr34[0], null).invoke(objNewInstance2, null), C44712scB.class.getClassLoader()};
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            b(new int[]{19541988, -1935840553}, 4, objArr36);
                            java.lang.reflect.Method declaredMethod6 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr36[0], java.lang.String.class, java.lang.ClassLoader.class);
                            declaredMethod6.setAccessible(true);
                            declaredMethod6.invoke(objInvoke2, objArr35);
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause10 = th10.getCause();
                            if (cause10 == null) {
                                throw th10;
                            }
                            throw cause10;
                        }
                    } catch (java.lang.Throwable th11) {
                        java.lang.Throwable cause11 = th11.getCause();
                        if (cause11 == null) {
                            throw th11;
                        }
                        throw cause11;
                    }
                } catch (java.lang.NoSuchMethodException unused4) {
                    objInvoke = java.lang.Runtime.class.getMethod(str2, null).invoke(null, null);
                    java.lang.Object[] objArr332 = new java.lang.Object[1];
                    c(new char[]{21, '!', '\"', 24, 0, 16, 2, '\b', 24, 31, 29, 3, '\f', 0, 13900}, (byte) 90, 15, objArr332);
                    java.lang.Object objInvoke92 = java.io.File.class.getMethod((java.lang.String) objArr332[0], null).invoke(objNewInstance2, null);
                    java.lang.ClassLoader classLoader32 = C44712scB.class.getClassLoader();
                    synchronized (objInvoke) {
                        try {
                            java.lang.Object[] objArr37 = {objInvoke92, classLoader32};
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            c(new char[]{18, '\b', 31, ' ', 27, '!', ' ', 2, '\b', '\f'}, (byte) 50, 10, objArr38);
                            java.lang.reflect.Method declaredMethod7 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr38[0], java.lang.String.class, java.lang.ClassLoader.class);
                            declaredMethod7.setAccessible(true);
                            java.lang.String str6 = (java.lang.String) declaredMethod7.invoke(objInvoke, objArr37);
                            if (str6 != null) {
                                throw new java.lang.UnsatisfiedLinkError(str6);
                            }
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause12 = th12.getCause();
                            if (cause12 == null) {
                                throw th12;
                            }
                            throw cause12;
                        }
                    }
                }
                try {
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    b(new int[]{667710471, 1896719721, -1490782523, -980210619}, 6, objArr39);
                    ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr39[0], null).invoke(objNewInstance2, null)).booleanValue();
                } catch (java.lang.Throwable th13) {
                    try {
                        java.lang.Throwable cause13 = th13.getCause();
                        if (cause13 == null) {
                            throw th13;
                        }
                        throw cause13;
                    } catch (java.lang.Exception unused5) {
                    }
                }
            } catch (java.lang.Throwable th14) {
                java.lang.Throwable cause14 = th14.getCause();
                if (cause14 == null) {
                    throw th14;
                }
                throw cause14;
            }
        } catch (java.lang.Throwable th15) {
            java.lang.Throwable cause15 = th15.getCause();
            if (cause15 == null) {
                throw th15;
            }
            throw cause15;
        }
    }
}

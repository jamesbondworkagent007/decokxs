package o;

import android.os.Build;
import com.google.common.base.Ascii;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: o.aie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7375aie implements InterfaceC7342ahy {
    public static volatile C7375aie copydefault;
    private static final byte[] gEmmrt = {1, 37, -122, 42, -1, -3, Ascii.FF, Ascii.SUB, -27, 9, -14, 19, -15, -5};
    private static final int djBIcL = 31;
    private static char[] KWHzl = {62840, 62883, 62887, 62899, 62901, 62904, 62799, 62884, 62909, 62882, 62897, 62908, 62880, 62905, 62886, 62898, 62911, 62788, 62881, 62906, 62810, 62900, 62893, 62828, 62896, 62800, 62802};
    private static int AEQbTJ = 585626902;
    private static boolean EZpvd = true;
    private static boolean OLrzqt = true;
    private static long valueOf = 9143523331971805393L;

    public static C7375aie KWHzl() {
        if (copydefault == null) {
            synchronized (C7375aie.class) {
                if (copydefault == null) {
                    copydefault = new C7375aie();
                }
            }
        }
        return copydefault;
    }

    private C7375aie() {
    }

    public boolean copydefault(java.lang.String str) {
        try {
            java.lang.String str2 = C32979mnm.EZpvd.OLrzqt().getApplicationInfo().nativeLibraryDir;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("lib");
            sb.append(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(127, null, null, new byte[]{-125, -126, -127}, objArr);
            sb.append((java.lang.String) objArr[0]);
            AEQbTJ(new java.io.File(str2, sb.toString()).getAbsolutePath());
            return true;
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder sb2 = C7326ahi.gEmmrt;
            sb2.append(" reload ");
            sb2.append(th.getMessage());
            C7870arw.AEQbTJ(th, "reloadWithPath " + str + " failed");
            return false;
        }
    }

    private static void b(char[] cArr, int i, java.lang.Object[] objArr) {
        Zi zi = new Zi();
        zi.OLrzqt = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            jArr[zi.AEQbTJ] = (((long) cArr[zi.AEQbTJ]) ^ (((long) zi.AEQbTJ) * ((long) zi.OLrzqt))) ^ (valueOf ^ 5439468278228498061L);
            zi.AEQbTJ++;
        }
        char[] cArr2 = new char[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
            zi.AEQbTJ++;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    @Override // o.InterfaceC7342ahy
    public boolean OLrzqt(java.lang.String str) {
        try {
            KWHzl(str);
            return true;
        } catch (java.lang.Throwable th) {
            C7326ahi.gEmmrt.append(th.getMessage());
            C7870arw.AEQbTJ(th, "load " + str + " failed");
            return copydefault(str);
        }
    }

    private static void a(int i, char[] cArr, int[] iArr, byte[] bArr, java.lang.Object[] objArr) {
        Ze ze = new Ze();
        char[] cArr2 = KWHzl;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (((long) cArr2[i2]) ^ 5452877452951418167L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (5452877452951418167L ^ ((long) AEQbTJ));
        if (OLrzqt) {
            ze.copydefault = bArr.length;
            char[] cArr4 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - i3);
                ze.AEQbTJ++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        if (EZpvd) {
            ze.copydefault = cArr.length;
            char[] cArr5 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr5[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - i3);
                ze.AEQbTJ++;
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        ze.copydefault = iArr.length;
        char[] cArr6 = new char[ze.copydefault];
        ze.AEQbTJ = 0;
        while (ze.AEQbTJ < ze.copydefault) {
            cArr6[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - i3);
            ze.AEQbTJ++;
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 3) + 11;
        int i5 = 102 - (b * 2);
        int i6 = i + 4;
        byte[] bArr = gEmmrt;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = i6 + (-i7) + 2;
            i2 = i3;
            i6 = i8;
            i5 = i9;
            int i10 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i10];
            i6 = i5;
            i8 = i10;
            int i92 = i6 + (-i7) + 2;
            i2 = i3;
            i6 = i8;
            i5 = i92;
            int i102 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i1022 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:396:0x0852 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:398:0x0854 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:400:0x0856 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:601:0x0a3e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:638:0x00f7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:818:0x0a53 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0865 A[Catch: Exception -> 0x0a53, TryCatch #86 {Exception -> 0x0a53, blocks: (B:407:0x085f, B:409:0x0865, B:410:0x0866), top: B:786:0x085f }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0866 A[Catch: Exception -> 0x0a53, TRY_LEAVE, TryCatch #86 {Exception -> 0x0a53, blocks: (B:407:0x085f, B:409:0x0865, B:410:0x0866), top: B:786:0x085f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08a7 A[Catch: all -> 0x08a9, TryCatch #54 {all -> 0x08a9, blocks: (B:414:0x0873, B:415:0x0878, B:440:0x08ab, B:434:0x08a0, B:436:0x08a7, B:437:0x08a8), top: B:727:0x07f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08a8 A[Catch: all -> 0x08a9, TryCatch #54 {all -> 0x08a9, blocks: (B:414:0x0873, B:415:0x0878, B:440:0x08ab, B:434:0x08a0, B:436:0x08a7, B:437:0x08a8), top: B:727:0x07f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08cc A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08cd A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0910 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0911 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0936 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0937 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0951 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0952 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0967 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0968 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0993 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0994 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x09ad A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x09ae A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x09d8 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x09d9 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x09f5 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x09f6 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0a14 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0a15 A[Catch: Exception -> 0x0a3e, TryCatch #91 {Exception -> 0x0a3e, blocks: (B:511:0x0961, B:513:0x0967, B:514:0x0968, B:441:0x08ac, B:452:0x08c5, B:454:0x08cc, B:455:0x08cd, B:460:0x08d9, B:462:0x08e2, B:463:0x08e3, B:475:0x0909, B:477:0x0910, B:478:0x0911, B:491:0x092f, B:493:0x0936, B:494:0x0937, B:502:0x094a, B:504:0x0951, B:505:0x0952, B:529:0x098c, B:531:0x0993, B:532:0x0994, B:540:0x09a6, B:542:0x09ad, B:543:0x09ae, B:557:0x09d1, B:559:0x09d8, B:560:0x09d9, B:570:0x09ee, B:572:0x09f5, B:573:0x09f6, B:584:0x0a0d, B:586:0x0a14, B:587:0x0a15, B:592:0x0a21, B:594:0x0a2b, B:595:0x0a2c, B:597:0x0a2e, B:599:0x0a3c, B:600:0x0a3d, B:15:0x00f7), top: B:638:0x00f7, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x05ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024e A[Catch: Exception -> 0x0255, TRY_LEAVE, TryCatch #85 {Exception -> 0x0255, blocks: (B:46:0x01ab, B:52:0x0211, B:79:0x024e, B:91:0x0292, B:93:0x0298, B:94:0x0299, B:127:0x033f, B:131:0x034e, B:135:0x03b4, B:140:0x040e, B:218:0x0525, B:234:0x057e, B:238:0x058f, B:243:0x05c8, B:245:0x05ce, B:246:0x05cf, B:248:0x05d1, B:250:0x05d8, B:251:0x05d9, B:253:0x05e5, B:254:0x05eb, B:269:0x063e, B:271:0x0640, B:273:0x0647, B:274:0x0648, B:287:0x0671, B:334:0x073f, B:339:0x076f, B:344:0x07a9, B:346:0x07af, B:347:0x07b0, B:349:0x07b2, B:351:0x07b9, B:352:0x07ba, B:354:0x07bc, B:356:0x07c3, B:357:0x07c4, B:142:0x0419, B:144:0x0420, B:145:0x0421, B:147:0x0423, B:149:0x042a, B:150:0x042b, B:152:0x042d, B:154:0x0434, B:155:0x0435, B:157:0x0437, B:159:0x043e, B:160:0x043f, B:162:0x0441, B:164:0x0448, B:165:0x0449, B:172:0x0469, B:174:0x046f, B:175:0x0470, B:177:0x0472, B:179:0x0479, B:180:0x047a, B:96:0x029b, B:98:0x02a2, B:99:0x02a3, B:56:0x021a, B:58:0x0221, B:59:0x0222, B:61:0x0224, B:63:0x022b, B:64:0x022c, B:66:0x022e, B:68:0x0235, B:69:0x0236, B:138:0x03d8, B:49:0x01d4, B:136:0x03bb, B:47:0x01b6, B:134:0x038b, B:257:0x0622, B:259:0x062b, B:260:0x0630, B:262:0x0632, B:264:0x0639, B:265:0x063a, B:255:0x05ec, B:252:0x05da, B:132:0x036e, B:168:0x044d, B:125:0x030c, B:87:0x0267, B:84:0x0259, B:139:0x03f1, B:51:0x01ea), top: B:785:0x01ab, inners: #1, #2, #6, #7, #11, #13, #15, #17, #27, #32, #44, #49, #95, #97 }] */
    /* JADX WARN: Removed duplicated region for block: B:814:0x0a60 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0a53 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [char[], int[], java.lang.Class[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v138 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v129 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v135 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r12v99 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v9, types: [char[]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v122 */
    /* JADX WARN: Type inference failed for: r9v123 */
    /* JADX WARN: Type inference failed for: r9v124 */
    /* JADX WARN: Type inference failed for: r9v125 */
    /* JADX WARN: Type inference failed for: r9v135 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v92 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void AEQbTJ(java.lang.String str) throws java.lang.Exception {
        ?? r15;
        ?? declaredConstructor;
        char c;
        ?? NewInstance;
        java.lang.Exception exc;
        ?? r152;
        ?? r12;
        ?? r11;
        ?? r9;
        boolean zBooleanValue;
        ?? externalStorageDirectory;
        java.lang.String strOLrzqt;
        java.lang.Throwable cause;
        java.lang.Object[] objArr;
        java.lang.Class[] clsArr;
        java.lang.Throwable cause2;
        java.lang.Object[] objArr2;
        java.lang.Class[] clsArr2;
        java.lang.Throwable cause3;
        java.lang.Object[] objArr3;
        java.lang.Class[] clsArr3;
        java.lang.Throwable cause4;
        java.lang.Object[] objArr4;
        java.lang.Class[] clsArr4;
        java.lang.Throwable cause5;
        java.lang.Object[] objArr5;
        java.lang.Class[] clsArr5;
        java.io.InputStream inputStream;
        java.lang.Throwable th;
        java.lang.Throwable cause6;
        java.lang.Object[] objArr6;
        java.lang.Object objEZpvd;
        java.lang.Throwable cause7;
        java.lang.Object[] objArr7;
        java.lang.Class[] clsArr6;
        java.lang.Throwable cause8;
        java.lang.Throwable cause9;
        java.lang.Object[] objArr8;
        java.lang.Throwable cause10;
        java.lang.Object[] objArr9;
        java.lang.Throwable cause11;
        java.lang.Object[] objArr10;
        java.lang.Object[] objArr11;
        java.lang.String str2;
        java.lang.Throwable cause12;
        java.lang.Object[] objArr12;
        java.lang.Object[] objArr13;
        java.lang.Object objInvoke;
        java.lang.String str3 = str;
        int i = 1;
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b(new char[]{17968, 29472, 11285, 55679, 37473, 20387, 30870, 13810, 61132, 38934, 21784}, 13597, objArr14);
        ?? r2 = 0;
        java.lang.String str4 = (java.lang.String) objArr14[0];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        b(new char[]{17967, 22998, 31168, 6610, 14804, 55765, 63951, 39371, 47555}, 8191, objArr15);
        java.lang.String str5 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        ?? r92 = 127;
        ?? r10 = 0;
        a(127, null, null, new byte[]{-117, -114, -119, -118, -122, -109, -110, -118, -117, -111}, objArr16);
        java.lang.String str6 = (java.lang.String) objArr16[0];
        char c2 = 18035;
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        b(new char[]{18035}, 19661, objArr17);
        try {
            java.lang.Object objInvoke2 = java.lang.String.class.getMethod(str5, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(str3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str4, java.lang.String.class).invoke(str3, (java.lang.String) objArr17[0])).intValue() + 4), java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod("length", null).invoke(str3, null)).intValue() - 3));
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            b(new char[]{17929, 62207, 12276, 22676, 38328}, 46327, objArr18);
            java.lang.String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) java.lang.String.class.getMethod("getBytes", java.lang.String.class).invoke(objInvoke2, (java.lang.String) objArr18[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new java.lang.String[0];
            }
            int length = strArrAEQbTJ.length;
            java.lang.String[] strArr = new java.lang.String[length + 1];
            java.lang.System.arraycopy(strArrAEQbTJ, 0, strArr, 0, length);
            strArr[length] = str3;
            int i2 = 0;
            while (i2 <= length) {
                java.lang.String str7 = strArr[i2];
                try {
                    r15 = new char[]{18035, 63709, 15351, 31367, 48553, 64522, 16230, 32382, 45312, 61488, 12929, 30184, 46223, 63376, 14068, 26968, 43111, 60177, 10856, 27860, 45017, 61177, 8606, 24746, 41808};
                    declaredConstructor = new java.lang.Object[i];
                } catch (java.lang.Exception e) {
                    e = e;
                    r15 = r2;
                    declaredConstructor = r10;
                    c = c2;
                    NewInstance = r92 == true ? 1 : 0;
                }
                try {
                    b(r15, 48869, declaredConstructor);
                    NewInstance = (java.lang.String) declaredConstructor[r2];
                } catch (java.lang.Exception e2) {
                    e = e2;
                    r15 = r2;
                    NewInstance = r92 == true ? 1 : 0;
                    declaredConstructor = r10;
                    c = 18035;
                    r92 = i;
                    exc = e;
                    r9 = r92;
                    r11 = NewInstance;
                    r12 = declaredConstructor;
                    r152 = r15;
                    if (i2 < length) {
                    }
                }
                try {
                    try {
                        r15 = new java.lang.Class[i];
                        r15[r2] = java.lang.String.class;
                        declaredConstructor = java.io.File.class.getDeclaredConstructor(r15);
                        NewInstance = declaredConstructor.newInstance(NewInstance);
                        try {
                            java.lang.Object[] objArr19 = new java.lang.Object[i];
                            a(r92 == true ? 1 : 0, r10, r10, new byte[]{-117, -118, -119, -120, -121, -122, -123, -124}, objArr19);
                            try {
                                zBooleanValue = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr19[0], r10).invoke(NewInstance, r10)).booleanValue();
                                externalStorageDirectory = NewInstance;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                boolean z = r92 == true ? 1 : 0;
                                java.lang.Throwable th3 = th;
                                java.lang.Throwable cause13 = th3.getCause();
                                if (cause13 == null) {
                                    throw th3;
                                }
                                throw cause13;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            boolean z2 = r92 == true ? 1 : 0;
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                    }
                    if (zBooleanValue) {
                        if (i2 < length) {
                        }
                        if (i2 < length) {
                        }
                        if (strOLrzqt != null) {
                        }
                        e = e;
                        exc = e;
                        r9 = 1;
                        r11 = 127;
                        r12 = 0;
                        r152 = 0;
                        if (i2 < length) {
                        }
                    } else {
                        try {
                            java.lang.Object[] objArr20 = new java.lang.Object[i];
                            a(r92 == true ? 1 : 0, r10, r10, new byte[]{-120, -119, -112, -113, -114, -118, -127, -125, -119, -127, -123, -115, -123, -116}, objArr20);
                            java.lang.String str8 = (java.lang.String) objArr20[0];
                            try {
                                java.lang.Object[] objArr21 = {java.lang.System.getProperty(str8, str8)};
                                java.lang.Class[] clsArr7 = new java.lang.Class[i];
                                clsArr7[0] = java.lang.String.class;
                                java.lang.Object objNewInstance = java.io.File.class.getDeclaredConstructor(clsArr7).newInstance(objArr21);
                                try {
                                    java.lang.Object[] objArr22 = new java.lang.Object[i];
                                    a(r92 == true ? 1 : 0, r10, r10, new byte[]{-117, -118, -119, -120, -121, -122, -123, -124}, objArr22);
                                    boolean zBooleanValue2 = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr22[0], r10).invoke(objNewInstance, r10)).booleanValue();
                                    externalStorageDirectory = objNewInstance;
                                    if (!zBooleanValue2) {
                                        externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
                                    }
                                    if (i2 < length) {
                                        try {
                                            char[] cArr = new char[i];
                                            c = 18035;
                                            try {
                                                cArr[0] = 18035;
                                                try {
                                                    java.lang.Object[] objArr23 = new java.lang.Object[i];
                                                    b(cArr, 19661, objArr23);
                                                    try {
                                                        java.lang.Object[] objArr24 = {(java.lang.String) objArr23[0]};
                                                        java.lang.Class[] clsArr8 = new java.lang.Class[i];
                                                        clsArr8[0] = java.lang.String.class;
                                                        int iIntValue = ((java.lang.Integer) java.lang.String.class.getMethod(str4, clsArr8).invoke(str3, objArr24)).intValue() + 4;
                                                        try {
                                                            try {
                                                                java.lang.Object[] objArr25 = new java.lang.Object[2];
                                                                objArr25[i] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod("length", null).invoke(str3, null)).intValue() - 3);
                                                                objArr25[0] = java.lang.Integer.valueOf(iIntValue);
                                                                strOLrzqt = Zr.OLrzqt(C7375aie.class, (java.lang.String) java.lang.String.class.getMethod(str5, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(str3, objArr25));
                                                                if (strOLrzqt == null) {
                                                                    strOLrzqt = str3;
                                                                }
                                                            } catch (java.lang.Throwable th5) {
                                                                java.lang.Throwable cause14 = th5.getCause();
                                                                if (cause14 == null) {
                                                                    throw th5;
                                                                }
                                                                throw cause14;
                                                            }
                                                        } catch (java.lang.Throwable th6) {
                                                            java.lang.Throwable cause15 = th6.getCause();
                                                            if (cause15 == null) {
                                                                throw th6;
                                                            }
                                                            throw cause15;
                                                        }
                                                    } catch (java.lang.Throwable th7) {
                                                        java.lang.Throwable cause16 = th7.getCause();
                                                        if (cause16 == null) {
                                                            throw th7;
                                                        }
                                                        throw cause16;
                                                    }
                                                } catch (java.lang.Exception e4) {
                                                    e = e4;
                                                    exc = e;
                                                    r9 = 1;
                                                    r11 = 127;
                                                    r12 = 0;
                                                    r152 = 0;
                                                    if (i2 < length) {
                                                    }
                                                }
                                            } catch (java.lang.Exception e5) {
                                                e = e5;
                                            }
                                        } catch (java.lang.Exception e6) {
                                            e = e6;
                                            c = 18035;
                                        }
                                    } else {
                                        c = 18035;
                                        strOLrzqt = str7;
                                    }
                                    if (i2 < length) {
                                        strOLrzqt = Zr.OLrzqt(C7375aie.class, strOLrzqt);
                                    }
                                    if (strOLrzqt != null) {
                                        try {
                                            java.lang.Object objInvoke3 = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                            if (i2 >= length) {
                                                str7 = str3;
                                            }
                                            try {
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                a(127, null, null, new byte[]{-105, -120, -123, -120, -106, -119, -107, -112, -123, -125, -108}, objArr26);
                                                java.lang.Runtime.class.getMethod((java.lang.String) objArr26[0], java.lang.String.class).invoke(objInvoke3, str7);
                                                return;
                                            } catch (java.lang.Throwable th8) {
                                                java.lang.Throwable cause17 = th8.getCause();
                                                if (cause17 == null) {
                                                    throw th8;
                                                }
                                                throw cause17;
                                            }
                                        } catch (java.lang.Throwable th9) {
                                            java.lang.Throwable cause18 = th9.getCause();
                                            if (cause18 == null) {
                                                throw th9;
                                            }
                                            throw cause18;
                                        }
                                    }
                                    try {
                                        objArr = new java.lang.Object[1];
                                        try {
                                            objArr[0] = 47;
                                            clsArr = new java.lang.Class[1];
                                        } catch (java.lang.Throwable th10) {
                                            th = th10;
                                        }
                                    } catch (java.lang.Throwable th11) {
                                        th = th11;
                                    }
                                    try {
                                        clsArr[0] = java.lang.Integer.TYPE;
                                    } catch (java.lang.Throwable th12) {
                                        th = th12;
                                        java.lang.Throwable th13 = th;
                                        cause = th13.getCause();
                                        if (cause != null) {
                                        }
                                    }
                                    try {
                                        try {
                                            objArr2 = new java.lang.Object[1];
                                            try {
                                                objArr2[0] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str4, clsArr).invoke(strOLrzqt, objArr)).intValue() + 1);
                                                clsArr2 = new java.lang.Class[1];
                                            } catch (java.lang.Throwable th14) {
                                                th = th14;
                                            }
                                        } catch (java.lang.Throwable th15) {
                                            th = th15;
                                        }
                                        try {
                                            clsArr2[0] = java.lang.Integer.TYPE;
                                        } catch (java.lang.Throwable th16) {
                                            th = th16;
                                            java.lang.Throwable th17 = th;
                                            cause2 = th17.getCause();
                                            if (cause2 != null) {
                                            }
                                        }
                                        try {
                                            try {
                                                objArr3 = new java.lang.Object[]{externalStorageDirectory, java.lang.String.class.getMethod(str5, clsArr2).invoke(strOLrzqt, objArr2)};
                                            } catch (java.lang.Throwable th18) {
                                                th = th18;
                                            }
                                            try {
                                                clsArr3 = new java.lang.Class[2];
                                            } catch (java.lang.Throwable th19) {
                                                th = th19;
                                                java.lang.Throwable th20 = th;
                                                cause3 = th20.getCause();
                                                if (cause3 == null) {
                                                }
                                            }
                                            try {
                                                clsArr3[0] = java.io.File.class;
                                            } catch (java.lang.Throwable th21) {
                                                th = th21;
                                                java.lang.Throwable th202 = th;
                                                cause3 = th202.getCause();
                                                if (cause3 == null) {
                                                }
                                            }
                                            try {
                                                clsArr3[1] = java.lang.String.class;
                                                java.lang.Object objNewInstance2 = java.io.File.class.getDeclaredConstructor(clsArr3).newInstance(objArr3);
                                                try {
                                                    java.net.URL resource = C7375aie.class.getClassLoader().getResource(strOLrzqt);
                                                    if (resource == null) {
                                                        try {
                                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                            b(new char[]{17983, 28506, 5344, 14867, 58265, 35128, 48708, 26608}, 10601, objArr27);
                                                            if (((java.lang.Boolean) java.lang.String.class.getMethod((java.lang.String) objArr27[0], java.lang.CharSequence.class).invoke(strOLrzqt, "!")).booleanValue()) {
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                try {
                                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                    a(127, null, null, new byte[]{-104, -117, -108, -119, -103, -104, -120, -123, -116}, objArr28);
                                                                    sb.append((java.lang.String) objArr28[0]);
                                                                    sb.append(strOLrzqt);
                                                                    java.lang.String path = new java.net.URL(sb.toString()).getPath();
                                                                    try {
                                                                        try {
                                                                            ZipFile zipFile = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str5, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(path, 5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str4, java.lang.String.class).invoke(path, "!/")).intValue())));
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        inputStream = zipFile.getInputStream(zipFile.getEntry((java.lang.String) java.lang.String.class.getMethod(str5, java.lang.Integer.TYPE).invoke(java.lang.String.class.getMethod(str5, java.lang.Integer.TYPE).invoke(strOLrzqt, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str4, java.lang.String.class).invoke(strOLrzqt, "!/")).intValue())), 2)));
                                                                                    } catch (java.lang.Throwable th22) {
                                                                                        java.lang.Throwable cause19 = th22.getCause();
                                                                                        if (cause19 == null) {
                                                                                            throw th22;
                                                                                        }
                                                                                        throw cause19;
                                                                                    }
                                                                                } catch (java.lang.Throwable th23) {
                                                                                    java.lang.Throwable cause20 = th23.getCause();
                                                                                    if (cause20 == null) {
                                                                                        throw th23;
                                                                                    }
                                                                                    throw cause20;
                                                                                }
                                                                            } catch (java.lang.Throwable th24) {
                                                                                java.lang.Throwable cause21 = th24.getCause();
                                                                                if (cause21 == null) {
                                                                                    throw th24;
                                                                                }
                                                                                throw cause21;
                                                                            }
                                                                        } catch (java.lang.Throwable th25) {
                                                                            java.lang.Throwable cause22 = th25.getCause();
                                                                            if (cause22 == null) {
                                                                                throw th25;
                                                                            }
                                                                            throw cause22;
                                                                        }
                                                                    } catch (java.lang.Throwable th26) {
                                                                        java.lang.Throwable cause23 = th26.getCause();
                                                                        if (cause23 == null) {
                                                                            throw th26;
                                                                        }
                                                                        throw cause23;
                                                                    }
                                                                } catch (java.lang.Exception e7) {
                                                                    e = e7;
                                                                    exc = e;
                                                                    r9 = 1;
                                                                    r11 = 127;
                                                                    r12 = 0;
                                                                    r152 = 0;
                                                                    if (i2 < length) {
                                                                    }
                                                                }
                                                            } else {
                                                                try {
                                                                    inputStream = (java.io.InputStream) java.io.FileInputStream.class.getDeclaredConstructor(java.lang.String.class).newInstance(strOLrzqt);
                                                                } catch (java.lang.Throwable th27) {
                                                                    java.lang.Throwable cause24 = th27.getCause();
                                                                    if (cause24 == null) {
                                                                        throw th27;
                                                                    }
                                                                    throw cause24;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th28) {
                                                            java.lang.Throwable cause25 = th28.getCause();
                                                            if (cause25 == null) {
                                                                throw th28;
                                                            }
                                                            throw cause25;
                                                        }
                                                    } else {
                                                        java.lang.String path2 = resource.getPath();
                                                        try {
                                                            objArr4 = new java.lang.Object[]{"!/" + strOLrzqt};
                                                        } catch (java.lang.Throwable th29) {
                                                            th = th29;
                                                        }
                                                        try {
                                                            clsArr4 = new java.lang.Class[1];
                                                        } catch (java.lang.Throwable th30) {
                                                            th = th30;
                                                            java.lang.Throwable th31 = th;
                                                            cause4 = th31.getCause();
                                                            if (cause4 != null) {
                                                            }
                                                        }
                                                        try {
                                                            clsArr4[0] = java.lang.String.class;
                                                            try {
                                                                objArr5 = new java.lang.Object[2];
                                                                try {
                                                                    try {
                                                                        objArr5[1] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str4, clsArr4).invoke(path2, objArr4)).intValue());
                                                                        try {
                                                                            objArr5[0] = 5;
                                                                        } catch (java.lang.Throwable th32) {
                                                                            th = th32;
                                                                        }
                                                                    } catch (java.lang.Throwable th33) {
                                                                        th = th33;
                                                                    }
                                                                } catch (java.lang.Throwable th34) {
                                                                    th = th34;
                                                                }
                                                            } catch (java.lang.Throwable th35) {
                                                                th = th35;
                                                            }
                                                            try {
                                                                clsArr5 = new java.lang.Class[2];
                                                                clsArr5[0] = java.lang.Integer.TYPE;
                                                            } catch (java.lang.Throwable th36) {
                                                                th = th36;
                                                                java.lang.Throwable th37 = th;
                                                                cause5 = th37.getCause();
                                                                if (cause5 != null) {
                                                                }
                                                            }
                                                            try {
                                                                clsArr5[1] = java.lang.Integer.TYPE;
                                                                ZipFile zipFile2 = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str5, clsArr5).invoke(path2, objArr5));
                                                                inputStream = zipFile2.getInputStream(zipFile2.getEntry(strOLrzqt));
                                                            } catch (java.lang.Throwable th38) {
                                                                th = th38;
                                                                java.lang.Throwable th372 = th;
                                                                cause5 = th372.getCause();
                                                                if (cause5 != null) {
                                                                    throw th372;
                                                                }
                                                                throw cause5;
                                                            }
                                                        } catch (java.lang.Throwable th39) {
                                                            th = th39;
                                                            java.lang.Throwable th312 = th;
                                                            cause4 = th312.getCause();
                                                            if (cause4 != null) {
                                                                throw th312;
                                                            }
                                                            throw cause4;
                                                        }
                                                    }
                                                    java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                                                    try {
                                                        objArr6 = new java.lang.Object[]{bufferedInputStream};
                                                        objEZpvd = YY.EZpvd(1683135861);
                                                        if (objEZpvd == null) {
                                                            try {
                                                                objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new java.lang.Class[]{java.io.InputStream.class});
                                                            } catch (java.lang.Throwable th40) {
                                                                th = th40;
                                                                cause6 = th.getCause();
                                                                if (cause6 != null) {
                                                                }
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th41) {
                                                        th = th41;
                                                    }
                                                    try {
                                                        java.io.InputStream inputStream2 = (java.io.InputStream) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr6);
                                                        if (bufferedInputStream == inputStream2) {
                                                            inputStream2.close();
                                                            try {
                                                                java.lang.Object objInvoke4 = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            java.lang.Object[] objArr29 = {strOLrzqt, C7375aie.class.getClassLoader()};
                                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                            a(127, null, null, new byte[]{-112, -123, -125, -108}, objArr30);
                                                                            java.lang.reflect.Method declaredMethod = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr30[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                            declaredMethod.setAccessible(true);
                                                                            declaredMethod.invoke(objInvoke4, objArr29);
                                                                        } catch (java.lang.Exception unused) {
                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                try {
                                                                                    java.lang.Object objInvoke5 = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                    try {
                                                                                        java.lang.Object[] objArr31 = {strOLrzqt, C7375aie.class.getClassLoader()};
                                                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                                        b(new char[]{17976, 34296, 49542, 3410, 18705, 38095}, 50123, objArr32);
                                                                                        java.lang.reflect.Method declaredMethod2 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr32[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                        declaredMethod2.setAccessible(true);
                                                                                        declaredMethod2.invoke(objInvoke5, objArr31);
                                                                                    } catch (java.lang.Throwable th42) {
                                                                                        java.lang.Throwable cause26 = th42.getCause();
                                                                                        if (cause26 == null) {
                                                                                            throw th42;
                                                                                        }
                                                                                        throw cause26;
                                                                                    }
                                                                                } catch (java.lang.Throwable th43) {
                                                                                    java.lang.Throwable cause27 = th43.getCause();
                                                                                    if (cause27 == null) {
                                                                                        throw th43;
                                                                                    }
                                                                                    throw cause27;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    objInvoke = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                    java.lang.ClassLoader classLoader = C7375aie.class.getClassLoader();
                                                                                    synchronized (objInvoke) {
                                                                                    }
                                                                                } catch (java.lang.Throwable th44) {
                                                                                    java.lang.Throwable cause28 = th44.getCause();
                                                                                    if (cause28 == null) {
                                                                                        throw th44;
                                                                                    }
                                                                                    throw cause28;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (java.lang.NoSuchMethodException unused2) {
                                                                        objInvoke = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                        java.lang.ClassLoader classLoader2 = C7375aie.class.getClassLoader();
                                                                        synchronized (objInvoke) {
                                                                            try {
                                                                                java.lang.Object[] objArr33 = {strOLrzqt, classLoader2};
                                                                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                                                a(127, null, null, new byte[]{-112, -123, -125, -107, -117, -115, -119, -118, -123, -122}, objArr34);
                                                                                java.lang.reflect.Method declaredMethod3 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr34[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                declaredMethod3.setAccessible(true);
                                                                                java.lang.String str9 = (java.lang.String) declaredMethod3.invoke(objInvoke, objArr33);
                                                                                if (str9 != null) {
                                                                                    throw new java.lang.UnsatisfiedLinkError(str9);
                                                                                }
                                                                            } catch (java.lang.Throwable th45) {
                                                                                java.lang.Throwable cause29 = th45.getCause();
                                                                                if (cause29 == null) {
                                                                                    throw th45;
                                                                                }
                                                                                throw cause29;
                                                                            }
                                                                        }
                                                                    }
                                                                    r9 = 1;
                                                                    r11 = 127;
                                                                    r12 = 0;
                                                                    r152 = 0;
                                                                } catch (java.lang.Throwable th46) {
                                                                    java.lang.Throwable cause30 = th46.getCause();
                                                                    if (cause30 == null) {
                                                                        throw th46;
                                                                    }
                                                                    throw cause30;
                                                                }
                                                            } catch (java.lang.Throwable th47) {
                                                                java.lang.Throwable cause31 = th47.getCause();
                                                                if (cause31 == null) {
                                                                    throw th47;
                                                                }
                                                                throw cause31;
                                                            }
                                                        } else {
                                                            try {
                                                                objArr7 = new java.lang.Object[]{objNewInstance2};
                                                            } catch (java.lang.Throwable th48) {
                                                                th = th48;
                                                            }
                                                            try {
                                                                clsArr6 = new java.lang.Class[1];
                                                            } catch (java.lang.Throwable th49) {
                                                                th = th49;
                                                                java.lang.Throwable th50 = th;
                                                                cause7 = th50.getCause();
                                                                if (cause7 != null) {
                                                                }
                                                            }
                                                            try {
                                                                clsArr6[0] = java.io.File.class;
                                                                java.io.OutputStream outputStream = (java.io.OutputStream) java.io.FileOutputStream.class.getDeclaredConstructor(clsArr6).newInstance(objArr7);
                                                                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
                                                                byte[] bArr = new byte[1024];
                                                                while (true) {
                                                                    int i3 = inputStream2.read(bArr);
                                                                    if (i3 < 0) {
                                                                        break;
                                                                    } else {
                                                                        bufferedOutputStream.write(bArr, 0, i3);
                                                                    }
                                                                }
                                                                bufferedOutputStream.flush();
                                                                try {
                                                                } catch (java.lang.Throwable th51) {
                                                                    th = th51;
                                                                }
                                                                try {
                                                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                    try {
                                                                        a(127, null, null, new byte[]{-101, -102, -118, -117, -111}, objArr35);
                                                                        try {
                                                                        } catch (java.lang.Throwable th52) {
                                                                            th = th52;
                                                                            java.lang.Throwable th53 = th;
                                                                            cause8 = th53.getCause();
                                                                            if (cause8 == null) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            java.lang.Object objInvoke6 = java.io.FileOutputStream.class.getMethod((java.lang.String) objArr35[0], null).invoke(outputStream, null);
                                                                            try {
                                                                                try {
                                                                                    objArr8 = new java.lang.Object[1];
                                                                                } catch (java.lang.Throwable th54) {
                                                                                    th = th54;
                                                                                }
                                                                            } catch (java.lang.Throwable th55) {
                                                                                th = th55;
                                                                            }
                                                                            try {
                                                                                a(127, null, null, new byte[]{-124, -122, -105, -126}, objArr8);
                                                                            } catch (java.lang.Throwable th56) {
                                                                                th = th56;
                                                                                java.lang.Throwable th57 = th;
                                                                                cause9 = th57.getCause();
                                                                                if (cause9 != null) {
                                                                                }
                                                                            }
                                                                            try {
                                                                                java.io.FileDescriptor.class.getMethod((java.lang.String) objArr8[0], null).invoke(objInvoke6, null);
                                                                                try {
                                                                                    bufferedOutputStream.close();
                                                                                    inputStream2.close();
                                                                                    try {
                                                                                        java.lang.Object objInvoke7 = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                        try {
                                                                                            try {
                                                                                                objArr12 = new java.lang.Object[1];
                                                                                                b(new char[]{17979, 11520, 36954, 1974, 60122, 24114, 50533, 43199, 8161, 33577, 30211, 56703, 16529, 14285, 39722}, 27449, objArr12);
                                                                                            } catch (java.lang.Exception unused3) {
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    objArr13 = new java.lang.Object[]{java.io.File.class.getMethod((java.lang.String) objArr12[0], null).invoke(objNewInstance2, null), C7375aie.class.getClassLoader()};
                                                                                                } catch (java.lang.Throwable th58) {
                                                                                                    th = th58;
                                                                                                }
                                                                                                try {
                                                                                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                                                    a(127, null, null, new byte[]{-112, -123, -125, -108}, objArr36);
                                                                                                    java.lang.reflect.Method declaredMethod4 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr36[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                                    declaredMethod4.setAccessible(true);
                                                                                                    declaredMethod4.invoke(objInvoke7, objArr13);
                                                                                                } catch (java.lang.Throwable th59) {
                                                                                                    th = th59;
                                                                                                    java.lang.Throwable th60 = th;
                                                                                                    java.lang.Throwable cause32 = th60.getCause();
                                                                                                    if (cause32 == null) {
                                                                                                        throw th60;
                                                                                                    }
                                                                                                    throw cause32;
                                                                                                }
                                                                                            } catch (java.lang.Exception unused4) {
                                                                                                try {
                                                                                                    if (Build.VERSION.SDK_INT <= 27) {
                                                                                                        try {
                                                                                                            java.lang.Object objInvoke8 = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                                            try {
                                                                                                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                                                                b(new char[]{17979, 11520, 36954, 1974, 60122, 24114, 50533, 43199, 8161, 33577, 30211, 56703, 16529, 14285, 39722}, 27449, objArr37);
                                                                                                                try {
                                                                                                                    java.lang.Object[] objArr38 = {java.io.File.class.getMethod((java.lang.String) objArr37[0], null).invoke(objNewInstance2, null), C7375aie.class.getClassLoader()};
                                                                                                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                                                                    b(new char[]{17976, 34296, 49542, 3410, 18705, 38095}, 50123, objArr39);
                                                                                                                    java.lang.reflect.Method declaredMethod5 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr39[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                                                    declaredMethod5.setAccessible(true);
                                                                                                                    declaredMethod5.invoke(objInvoke8, objArr38);
                                                                                                                } catch (java.lang.Throwable th61) {
                                                                                                                    java.lang.Throwable cause33 = th61.getCause();
                                                                                                                    if (cause33 == null) {
                                                                                                                        throw th61;
                                                                                                                    }
                                                                                                                    throw cause33;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th62) {
                                                                                                                java.lang.Throwable cause34 = th62.getCause();
                                                                                                                if (cause34 == null) {
                                                                                                                    throw th62;
                                                                                                                }
                                                                                                                throw cause34;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th63) {
                                                                                                            java.lang.Throwable cause35 = th63.getCause();
                                                                                                            if (cause35 == null) {
                                                                                                                throw th63;
                                                                                                            }
                                                                                                            throw cause35;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (java.lang.NoSuchMethodException unused5) {
                                                                                                }
                                                                                                try {
                                                                                                    java.lang.Object objInvoke9 = java.lang.Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                                    try {
                                                                                                    } catch (java.lang.Throwable th64) {
                                                                                                        th = th64;
                                                                                                    }
                                                                                                    try {
                                                                                                        objArr9 = new java.lang.Object[1];
                                                                                                        b(new char[]{17979, 11520, 36954, 1974, 60122, 24114, 50533, 43199, 8161, 33577, 30211, 56703, 16529, 14285, 39722}, 27449, objArr9);
                                                                                                    } catch (java.lang.Throwable th65) {
                                                                                                        th = th65;
                                                                                                        java.lang.Throwable th66 = th;
                                                                                                        cause10 = th66.getCause();
                                                                                                        if (cause10 == null) {
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                    } catch (java.lang.Throwable th67) {
                                                                                                        th = th67;
                                                                                                        java.lang.Throwable th662 = th;
                                                                                                        cause10 = th662.getCause();
                                                                                                        if (cause10 == null) {
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        java.lang.Object objInvoke10 = java.io.File.class.getMethod((java.lang.String) objArr9[0], null).invoke(objNewInstance2, null);
                                                                                                        java.lang.ClassLoader classLoader3 = C7375aie.class.getClassLoader();
                                                                                                        try {
                                                                                                            synchronized (objInvoke9) {
                                                                                                                try {
                                                                                                                    objArr10 = new java.lang.Object[]{objInvoke10, classLoader3};
                                                                                                                } catch (java.lang.Throwable th68) {
                                                                                                                    th = th68;
                                                                                                                }
                                                                                                                try {
                                                                                                                    objArr11 = new java.lang.Object[1];
                                                                                                                } catch (java.lang.Throwable th69) {
                                                                                                                    th = th69;
                                                                                                                    java.lang.Throwable th70 = th;
                                                                                                                    cause11 = th70.getCause();
                                                                                                                    if (cause11 != null) {
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    a(127, null, null, new byte[]{-112, -123, -125, -107, -117, -115, -119, -118, -123, -122}, objArr11);
                                                                                                                    try {
                                                                                                                        str2 = (java.lang.String) objArr11[0];
                                                                                                                    } catch (java.lang.Throwable th71) {
                                                                                                                        th = th71;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th72) {
                                                                                                                    th = th72;
                                                                                                                    java.lang.Throwable th702 = th;
                                                                                                                    cause11 = th702.getCause();
                                                                                                                    if (cause11 != null) {
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    java.lang.Class[] clsArr9 = new java.lang.Class[2];
                                                                                                                    clsArr9[0] = java.lang.String.class;
                                                                                                                    try {
                                                                                                                        clsArr9[1] = java.lang.ClassLoader.class;
                                                                                                                        java.lang.reflect.Method declaredMethod6 = java.lang.Runtime.class.getDeclaredMethod(str2, clsArr9);
                                                                                                                        declaredMethod6.setAccessible(true);
                                                                                                                        try {
                                                                                                                            java.lang.String str10 = (java.lang.String) declaredMethod6.invoke(objInvoke9, objArr10);
                                                                                                                            if (str10 != null) {
                                                                                                                                throw new java.lang.UnsatisfiedLinkError(str10);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                            } catch (java.lang.Throwable th73) {
                                                                                                                                th = th73;
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (java.lang.Throwable th74) {
                                                                                                                            th = th74;
                                                                                                                            java.lang.Throwable th7022 = th;
                                                                                                                            cause11 = th7022.getCause();
                                                                                                                            if (cause11 != null) {
                                                                                                                                throw th7022;
                                                                                                                            }
                                                                                                                            throw cause11;
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th75) {
                                                                                                                        th = th75;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th76) {
                                                                                                                    th = th76;
                                                                                                                    java.lang.Throwable th70222 = th;
                                                                                                                    cause11 = th70222.getCause();
                                                                                                                    if (cause11 != null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            r9 = 1;
                                                                                                            r9 = 1;
                                                                                                            r9 = 1;
                                                                                                            r9 = 1;
                                                                                                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                                                            r11 = 127;
                                                                                                            r11 = 127;
                                                                                                            r11 = 127;
                                                                                                            r12 = 0;
                                                                                                            r12 = 0;
                                                                                                            r12 = 0;
                                                                                                            a(127, null, null, new byte[]{-117, -118, -117, -108, -117, -112}, objArr40);
                                                                                                            r152 = 0;
                                                                                                            r152 = 0;
                                                                                                            ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr40[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                                            i2++;
                                                                                                            str3 = str;
                                                                                                            i = r9;
                                                                                                            r92 = r11;
                                                                                                            r10 = r12;
                                                                                                            r2 = r152;
                                                                                                            c2 = c;
                                                                                                        } catch (java.lang.Throwable th77) {
                                                                                                            th = th77;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th78) {
                                                                                                        th = th78;
                                                                                                        java.lang.Throwable th6622 = th;
                                                                                                        cause10 = th6622.getCause();
                                                                                                        if (cause10 == null) {
                                                                                                            throw th6622;
                                                                                                        }
                                                                                                        throw cause10;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th79) {
                                                                                                    java.lang.Throwable cause36 = th79.getCause();
                                                                                                    if (cause36 == null) {
                                                                                                        throw th79;
                                                                                                    }
                                                                                                    throw cause36;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                r9 = 1;
                                                                                                r9 = 1;
                                                                                                r9 = 1;
                                                                                                r9 = 1;
                                                                                            } catch (java.lang.Throwable th80) {
                                                                                                th = th80;
                                                                                                r9 = 1;
                                                                                            }
                                                                                            try {
                                                                                                java.lang.Object[] objArr402 = new java.lang.Object[1];
                                                                                                r11 = 127;
                                                                                                r11 = 127;
                                                                                                r11 = 127;
                                                                                                r12 = 0;
                                                                                                r12 = 0;
                                                                                                r12 = 0;
                                                                                            } catch (java.lang.Throwable th81) {
                                                                                                th = th81;
                                                                                                r11 = 127;
                                                                                                r12 = 0;
                                                                                                r152 = 0;
                                                                                                java.lang.Throwable th82 = th;
                                                                                                try {
                                                                                                    cause12 = th82.getCause();
                                                                                                    if (cause12 == null) {
                                                                                                    }
                                                                                                } catch (java.lang.Exception unused6) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                a(127, null, null, new byte[]{-117, -118, -117, -108, -117, -112}, objArr402);
                                                                                                r152 = 0;
                                                                                                r152 = 0;
                                                                                            } catch (java.lang.Throwable th83) {
                                                                                                th = th83;
                                                                                                r152 = 0;
                                                                                                java.lang.Throwable th822 = th;
                                                                                                cause12 = th822.getCause();
                                                                                                if (cause12 == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr402[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                            } catch (java.lang.Throwable th84) {
                                                                                                th = th84;
                                                                                                java.lang.Throwable th8222 = th;
                                                                                                cause12 = th8222.getCause();
                                                                                                if (cause12 == null) {
                                                                                                    throw th8222;
                                                                                                }
                                                                                                throw cause12;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th85) {
                                                                                            java.lang.Throwable cause37 = th85.getCause();
                                                                                            if (cause37 == null) {
                                                                                                throw th85;
                                                                                            }
                                                                                            throw cause37;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th86) {
                                                                                        java.lang.Throwable cause38 = th86.getCause();
                                                                                        if (cause38 == null) {
                                                                                            throw th86;
                                                                                        }
                                                                                        throw cause38;
                                                                                    }
                                                                                } catch (java.lang.Exception e8) {
                                                                                    e = e8;
                                                                                    declaredConstructor = 0;
                                                                                    r92 = 1;
                                                                                    NewInstance = 127;
                                                                                    r15 = 0;
                                                                                    exc = e;
                                                                                    r9 = r92;
                                                                                    r11 = NewInstance;
                                                                                    r12 = declaredConstructor;
                                                                                    r152 = r15;
                                                                                    if (i2 < length) {
                                                                                    }
                                                                                }
                                                                            } catch (java.lang.Throwable th87) {
                                                                                th = th87;
                                                                                java.lang.Throwable th572 = th;
                                                                                cause9 = th572.getCause();
                                                                                if (cause9 != null) {
                                                                                    throw th572;
                                                                                }
                                                                                throw cause9;
                                                                            }
                                                                        } catch (java.lang.Throwable th88) {
                                                                            th = th88;
                                                                            java.lang.Throwable th532 = th;
                                                                            cause8 = th532.getCause();
                                                                            if (cause8 == null) {
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Throwable th89) {
                                                                        th = th89;
                                                                    }
                                                                } catch (java.lang.Throwable th90) {
                                                                    th = th90;
                                                                    java.lang.Throwable th5322 = th;
                                                                    cause8 = th5322.getCause();
                                                                    if (cause8 == null) {
                                                                        throw th5322;
                                                                    }
                                                                    throw cause8;
                                                                }
                                                            } catch (java.lang.Throwable th91) {
                                                                th = th91;
                                                                java.lang.Throwable th502 = th;
                                                                cause7 = th502.getCause();
                                                                if (cause7 != null) {
                                                                    throw th502;
                                                                }
                                                                throw cause7;
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th92) {
                                                        th = th92;
                                                        th = th;
                                                        cause6 = th.getCause();
                                                        if (cause6 != null) {
                                                            throw th;
                                                        }
                                                        throw cause6;
                                                    }
                                                } catch (java.lang.Exception e9) {
                                                    e = e9;
                                                    r92 = 1;
                                                    NewInstance = 127;
                                                    declaredConstructor = 0;
                                                }
                                            } catch (java.lang.Throwable th93) {
                                                th = th93;
                                                java.lang.Throwable th2022 = th;
                                                cause3 = th2022.getCause();
                                                if (cause3 == null) {
                                                    throw th2022;
                                                }
                                                throw cause3;
                                            }
                                        } catch (java.lang.Throwable th94) {
                                            th = th94;
                                            java.lang.Throwable th172 = th;
                                            cause2 = th172.getCause();
                                            if (cause2 != null) {
                                                throw th172;
                                            }
                                            throw cause2;
                                        }
                                    } catch (java.lang.Throwable th95) {
                                        th = th95;
                                        java.lang.Throwable th132 = th;
                                        cause = th132.getCause();
                                        if (cause != null) {
                                            throw th132;
                                        }
                                        throw cause;
                                    }
                                    e = e4;
                                    exc = e;
                                    r9 = 1;
                                    r11 = 127;
                                    r12 = 0;
                                    r152 = 0;
                                } catch (java.lang.Throwable th96) {
                                    java.lang.Throwable cause39 = th96.getCause();
                                    if (cause39 == null) {
                                        throw th96;
                                    }
                                    throw cause39;
                                }
                            } catch (java.lang.Throwable th97) {
                                java.lang.Throwable cause40 = th97.getCause();
                                if (cause40 == null) {
                                    throw th97;
                                }
                                throw cause40;
                            }
                        } catch (java.lang.Exception e10) {
                            exc = e10;
                            r11 = r92 == true ? 1 : 0;
                            r12 = r10;
                            r152 = 0;
                            c = 18035;
                            r9 = i;
                        }
                        if (i2 < length) {
                            throw exc;
                        }
                    }
                    i2++;
                    str3 = str;
                    i = r9;
                    r92 = r11;
                    r10 = r12;
                    r2 = r152;
                    c2 = c;
                } catch (java.lang.Throwable th98) {
                    boolean z3 = r92 == true ? 1 : 0;
                    java.lang.Throwable cause41 = th98.getCause();
                    if (cause41 == null) {
                        throw th98;
                    }
                    throw cause41;
                }
            }
        } catch (java.lang.Throwable th99) {
            java.lang.Throwable cause42 = th99.getCause();
            if (cause42 == null) {
                throw th99;
            }
            throw cause42;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:358:0x07a2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:360:0x07a4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:362:0x07a6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:585:0x09b0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:649:0x0085 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:796:0x09c6 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07b5 A[Catch: Exception -> 0x09c6, TryCatch #51 {Exception -> 0x09c6, blocks: (B:369:0x07af, B:371:0x07b5, B:372:0x07b6), top: B:697:0x07af }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07b6 A[Catch: Exception -> 0x09c6, TRY_LEAVE, TryCatch #51 {Exception -> 0x09c6, blocks: (B:369:0x07af, B:371:0x07b5, B:372:0x07b6), top: B:697:0x07af }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07e7 A[Catch: all -> 0x07e9, TryCatch #80 {all -> 0x07e9, blocks: (B:376:0x07c3, B:377:0x07c8, B:396:0x07eb, B:390:0x07e0, B:392:0x07e7, B:393:0x07e8), top: B:750:0x0745 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07e8 A[Catch: all -> 0x07e9, TryCatch #80 {all -> 0x07e9, blocks: (B:376:0x07c3, B:377:0x07c8, B:396:0x07eb, B:390:0x07e0, B:392:0x07e7, B:393:0x07e8), top: B:750:0x0745 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x080e A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x080f A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0848 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0849 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0870 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0871 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x088b A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x088c A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x08a2 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x08a3 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08c0 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x08c1 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08df A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08e0 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0903 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0904 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0922 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0923 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0944 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0945 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0975 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0976 A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x099d A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x099e A[Catch: Exception -> 0x09b0, TryCatch #23 {Exception -> 0x09b0, blocks: (B:472:0x089c, B:474:0x08a2, B:475:0x08a3, B:397:0x07ec, B:410:0x0807, B:412:0x080e, B:413:0x080f, B:418:0x081b, B:420:0x0823, B:421:0x0824, B:434:0x0841, B:436:0x0848, B:437:0x0849, B:452:0x0869, B:454:0x0870, B:455:0x0871, B:463:0x0884, B:465:0x088b, B:466:0x088c, B:485:0x08b9, B:487:0x08c0, B:488:0x08c1, B:499:0x08d8, B:501:0x08df, B:502:0x08e0, B:514:0x08fc, B:516:0x0903, B:517:0x0904, B:528:0x091b, B:530:0x0922, B:531:0x0923, B:544:0x093d, B:546:0x0944, B:547:0x0945, B:563:0x096e, B:565:0x0975, B:566:0x0976, B:576:0x0995, B:578:0x099d, B:579:0x099e, B:581:0x09a0, B:583:0x09ae, B:584:0x09af, B:13:0x0085), top: B:649:0x0085, inners: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:678:0x053f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0746 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x09d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:796:0x09c6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v115 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v118 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r12v95 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v80 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [char[]] */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v68 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v138, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v105 */
    /* JADX WARN: Type inference failed for: r6v106 */
    /* JADX WARN: Type inference failed for: r6v107 */
    /* JADX WARN: Type inference failed for: r6v108 */
    /* JADX WARN: Type inference failed for: r6v109 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v128 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v138 */
    /* JADX WARN: Type inference failed for: r6v139 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v140 */
    /* JADX WARN: Type inference failed for: r6v141 */
    /* JADX WARN: Type inference failed for: r6v142 */
    /* JADX WARN: Type inference failed for: r6v143 */
    /* JADX WARN: Type inference failed for: r6v144 */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r6v146 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [char[], int[], java.lang.Class[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void KWHzl(java.lang.String str) throws java.lang.Exception {
        ?? declaredConstructor;
        ?? r19;
        ?? NewInstance;
        java.lang.Exception exc;
        ?? r14;
        ?? r13;
        ?? r12;
        ?? r8;
        ?? r6;
        java.lang.Throwable cause;
        java.lang.Object[] objArr;
        boolean zBooleanValue;
        ?? externalStorageDirectory;
        java.lang.Throwable cause2;
        java.lang.String str2;
        boolean z;
        char c;
        java.lang.Throwable cause3;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.Throwable cause4;
        java.lang.Object[] objArr4;
        java.lang.Class[] clsArr;
        java.lang.Throwable cause5;
        java.lang.Object[] objArr5;
        java.lang.Class[] clsArr2;
        boolean z2;
        char c2;
        java.lang.Throwable cause6;
        java.lang.Object[] objArr6;
        java.lang.String str3;
        java.lang.Class[] clsArr3;
        java.lang.Throwable cause7;
        java.lang.Object[] objArr7;
        java.lang.Class[] clsArr4;
        java.io.InputStream inputStream;
        java.lang.Throwable th;
        java.lang.Throwable cause8;
        java.lang.Object[] objArr8;
        java.lang.Object objEZpvd;
        java.lang.Throwable cause9;
        java.lang.Object[] objArr9;
        java.lang.Class[] clsArr5;
        java.lang.Throwable cause10;
        java.lang.Object[] objArr10;
        java.lang.Throwable cause11;
        java.lang.Object[] objArr11;
        java.lang.Object objInvoke;
        java.lang.Throwable cause12;
        java.lang.Throwable cause13;
        java.lang.Object[] objArr12;
        java.lang.Object[] objArr13;
        java.lang.String str4;
        java.lang.Class[] clsArr6;
        java.lang.Throwable cause14;
        java.lang.Object[] objArr14;
        java.lang.Object objInvoke2;
        java.lang.String str5 = str;
        int i = 1;
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        b(new char[]{17967, 22998, 31168, 6610, 14804, 55765, 63951, 39371, 47555}, 8191, objArr15);
        ?? r2 = 0;
        java.lang.String str6 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        ?? r7 = 127;
        ?? r82 = 0;
        a(127, null, null, new byte[]{-117, -114, -119, -118, -122, -109, -110, -118, -117, -111}, objArr16);
        java.lang.String str7 = (java.lang.String) objArr16[0];
        ?? r62 = 5;
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        b(new char[]{17929, 62207, 12276, 22676, 38328}, 46327, objArr17);
        try {
            java.lang.String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) java.lang.String.class.getMethod("getBytes", java.lang.String.class).invoke(str5, (java.lang.String) objArr17[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new java.lang.String[0];
            }
            int length = strArrAEQbTJ.length;
            java.lang.String[] strArr = new java.lang.String[length + 1];
            java.lang.System.arraycopy(strArrAEQbTJ, 0, strArr, 0, length);
            strArr[length] = str5;
            int i2 = 0;
            ?? r122 = strArr;
            while (i2 <= length) {
                ?? r132 = r122[i2];
                try {
                    declaredConstructor = new char[]{18035, 63709, 15351, 31367, 48553, 64522, 16230, 32382, 45312, 61488, 12929, 30184, 46223, 63376, 14068, 26968, 43111, 60177, 10856, 27860, 45017, 61177, 8606, 24746, 41808};
                    java.lang.Object[] objArr18 = new java.lang.Object[i];
                    try {
                        b(declaredConstructor, 48869, objArr18);
                        NewInstance = (java.lang.String) objArr18[r2];
                        try {
                            try {
                                java.lang.Class[] clsArr7 = new java.lang.Class[i];
                                clsArr7[r2] = java.lang.String.class;
                                declaredConstructor = java.io.File.class.getDeclaredConstructor(clsArr7);
                                NewInstance = declaredConstructor.newInstance(NewInstance);
                                try {
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    objArr = new java.lang.Object[i];
                                    a(r7, r82, r82, new byte[]{-117, -118, -119, -120, -121, -122, -123, -124}, objArr);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    java.lang.Throwable th4 = th;
                                    cause = th4.getCause();
                                    if (cause != null) {
                                    }
                                }
                                try {
                                    zBooleanValue = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr[0], r82).invoke(NewInstance, r82)).booleanValue();
                                    externalStorageDirectory = NewInstance;
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    java.lang.Throwable th42 = th;
                                    cause = th42.getCause();
                                    if (cause != null) {
                                        throw th42;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th6) {
                                java.lang.Throwable cause15 = th6.getCause();
                                if (cause15 == null) {
                                    throw th6;
                                }
                                throw cause15;
                            }
                        } catch (java.lang.Exception e) {
                            e = e;
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        declaredConstructor = r2;
                        NewInstance = i;
                        r132 = r82;
                        r19 = r122;
                        r82 = 5;
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                    declaredConstructor = r2;
                    r132 = r82;
                    r19 = r122;
                    r82 = r62;
                    r122 = r7;
                    NewInstance = i;
                }
                if (zBooleanValue) {
                    java.lang.ClassLoader classLoader = C7375aie.class.getClassLoader();
                    java.lang.Object[] objArr19 = {i2 < length ? str5 : r132};
                    byte[] bArr = gEmmrt;
                    byte b = (byte) (bArr[0] - 1);
                    r19 = r122;
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    c(b, b, bArr[4], objArr20);
                    java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr20[0], java.lang.String.class);
                    declaredMethod.setAccessible(true);
                    str2 = (java.lang.String) declaredMethod.invoke(classLoader, objArr19);
                    if (str2 != null) {
                    }
                    exc = e;
                    z = true;
                    c = 5;
                    r12 = 127;
                    r13 = 0;
                    r14 = 0;
                    r6 = z;
                    r8 = c;
                    r19 = r19;
                    if (i2 >= length) {
                    }
                } else {
                    try {
                        java.lang.Object[] objArr21 = new java.lang.Object[i];
                        a(r7, r82, r82, new byte[]{-120, -119, -112, -113, -114, -118, -127, -125, -119, -127, -123, -115, -123, -116}, objArr21);
                        java.lang.String str8 = (java.lang.String) objArr21[0];
                        try {
                            java.lang.Object[] objArr22 = {java.lang.System.getProperty(str8, str8)};
                            java.lang.Class[] clsArr8 = new java.lang.Class[i];
                            clsArr8[0] = java.lang.String.class;
                            java.lang.Object objNewInstance = java.io.File.class.getDeclaredConstructor(clsArr8).newInstance(objArr22);
                            try {
                                java.lang.Object[] objArr23 = new java.lang.Object[i];
                                a(r7, r82, r82, new byte[]{-117, -118, -119, -120, -121, -122, -123, -124}, objArr23);
                                boolean zBooleanValue2 = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr23[0], r82).invoke(objNewInstance, r82)).booleanValue();
                                externalStorageDirectory = objNewInstance;
                                if (!zBooleanValue2) {
                                    externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause16 = th7.getCause();
                                if (cause16 == null) {
                                    throw th7;
                                }
                                throw cause16;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause17 = th8.getCause();
                            if (cause17 == null) {
                                throw th8;
                            }
                            throw cause17;
                        }
                    } catch (java.lang.Exception e4) {
                        exc = e4;
                        r6 = i;
                        r13 = r82;
                        r19 = r122;
                        r8 = 5;
                        r14 = 0;
                        r12 = r7;
                    }
                    try {
                        java.lang.ClassLoader classLoader2 = C7375aie.class.getClassLoader();
                        try {
                            java.lang.Object[] objArr192 = {i2 < length ? str5 : r132};
                            byte[] bArr2 = gEmmrt;
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                        }
                        try {
                            byte b2 = (byte) (bArr2[0] - 1);
                            try {
                                r19 = r122;
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            java.lang.Throwable th12 = th;
                            cause2 = th12.getCause();
                            if (cause2 != null) {
                            }
                        }
                        try {
                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                            c(b2, b2, bArr2[4], objArr202);
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                            java.lang.Throwable th122 = th;
                            cause2 = th122.getCause();
                            if (cause2 != null) {
                            }
                        }
                        try {
                            java.lang.reflect.Method declaredMethod2 = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr202[0], java.lang.String.class);
                            declaredMethod2.setAccessible(true);
                        } catch (java.lang.Throwable th14) {
                            th = th14;
                            java.lang.Throwable th1222 = th;
                            cause2 = th1222.getCause();
                            if (cause2 != null) {
                            }
                        }
                        try {
                            str2 = (java.lang.String) declaredMethod2.invoke(classLoader2, objArr192);
                            if (str2 != null) {
                                try {
                                    java.lang.Object objInvoke3 = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                    ?? r133 = r132;
                                    if (i2 >= length) {
                                        r133 = str;
                                    }
                                    try {
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        a(127, null, null, new byte[]{-105, -120, -123, -120, -106, -119, -107, -112, -123, -125, -108}, objArr24);
                                        java.lang.Runtime.class.getMethod((java.lang.String) objArr24[0], java.lang.String.class).invoke(objInvoke3, r133);
                                        return;
                                    } catch (java.lang.Throwable th15) {
                                        java.lang.Throwable cause18 = th15.getCause();
                                        if (cause18 == null) {
                                            throw th15;
                                        }
                                        throw cause18;
                                    }
                                } catch (java.lang.Throwable th16) {
                                    java.lang.Throwable cause19 = th16.getCause();
                                    if (cause19 == null) {
                                        throw th16;
                                    }
                                    throw cause19;
                                }
                            }
                            try {
                                objArr2 = new java.lang.Object[1];
                                try {
                                    try {
                                        objArr2[0] = 47;
                                    } catch (java.lang.Throwable th17) {
                                        th = th17;
                                    }
                                } catch (java.lang.Throwable th18) {
                                    th = th18;
                                }
                            } catch (java.lang.Throwable th19) {
                                th = th19;
                            }
                            try {
                                objArr3 = new java.lang.Object[1];
                                b(new char[]{17968, 29472, 11285, 55679, 37473, 20387, 30870, 13810, 61132, 38934, 21784}, 13597, objArr3);
                            } catch (java.lang.Throwable th20) {
                                th = th20;
                                java.lang.Throwable th21 = th;
                                cause3 = th21.getCause();
                                if (cause3 != null) {
                                }
                            }
                            try {
                                java.lang.String str9 = (java.lang.String) objArr3[0];
                                java.lang.Class[] clsArr9 = new java.lang.Class[1];
                                clsArr9[0] = java.lang.Integer.TYPE;
                                try {
                                    objArr4 = new java.lang.Object[1];
                                    try {
                                        objArr4[0] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str9, clsArr9).invoke(str2, objArr2)).intValue() + 1);
                                        clsArr = new java.lang.Class[1];
                                    } catch (java.lang.Throwable th22) {
                                        th = th22;
                                    }
                                } catch (java.lang.Throwable th23) {
                                    th = th23;
                                }
                                try {
                                    clsArr[0] = java.lang.Integer.TYPE;
                                } catch (java.lang.Throwable th24) {
                                    th = th24;
                                    java.lang.Throwable th25 = th;
                                    cause4 = th25.getCause();
                                    if (cause4 != null) {
                                    }
                                }
                                try {
                                    try {
                                        objArr5 = new java.lang.Object[]{externalStorageDirectory, java.lang.String.class.getMethod(str6, clsArr).invoke(str2, objArr4)};
                                        clsArr2 = new java.lang.Class[2];
                                    } catch (java.lang.Throwable th26) {
                                        th = th26;
                                    }
                                    try {
                                        clsArr2[0] = java.io.File.class;
                                    } catch (java.lang.Throwable th27) {
                                        th = th27;
                                        java.lang.Throwable th28 = th;
                                        cause5 = th28.getCause();
                                        if (cause5 != null) {
                                        }
                                    }
                                    try {
                                        clsArr2[1] = java.lang.String.class;
                                        java.lang.Object objNewInstance2 = java.io.File.class.getDeclaredConstructor(clsArr2).newInstance(objArr5);
                                        try {
                                            java.net.URL resource = C7375aie.class.getClassLoader().getResource(str2);
                                            if (resource == null) {
                                                try {
                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                    b(new char[]{17983, 28506, 5344, 14867, 58265, 35128, 48708, 26608}, 10601, objArr25);
                                                    if (((java.lang.Boolean) java.lang.String.class.getMethod((java.lang.String) objArr25[0], java.lang.CharSequence.class).invoke(str2, "!")).booleanValue()) {
                                                        try {
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                            a(127, null, null, new byte[]{-104, -117, -108, -119, -103, -104, -120, -123, -116}, objArr26);
                                                            sb.append((java.lang.String) objArr26[0]);
                                                            sb.append(str2);
                                                            java.lang.String path = new java.net.URL(sb.toString()).getPath();
                                                            try {
                                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                                b(new char[]{17968, 29472, 11285, 55679, 37473, 20387, 30870, 13810, 61132, 38934, 21784}, 13597, objArr27);
                                                                try {
                                                                    ZipFile zipFile = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str6, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(path, 5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr27[0], java.lang.String.class).invoke(path, "!/")).intValue())));
                                                                    try {
                                                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                        b(new char[]{17968, 29472, 11285, 55679, 37473, 20387, 30870, 13810, 61132, 38934, 21784}, 13597, objArr28);
                                                                        try {
                                                                            try {
                                                                                inputStream = zipFile.getInputStream(zipFile.getEntry((java.lang.String) java.lang.String.class.getMethod(str6, java.lang.Integer.TYPE).invoke(java.lang.String.class.getMethod(str6, java.lang.Integer.TYPE).invoke(str2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr28[0], java.lang.String.class).invoke(str2, "!/")).intValue())), 2)));
                                                                            } catch (java.lang.Throwable th29) {
                                                                                java.lang.Throwable cause20 = th29.getCause();
                                                                                if (cause20 == null) {
                                                                                    throw th29;
                                                                                }
                                                                                throw cause20;
                                                                            }
                                                                        } catch (java.lang.Throwable th30) {
                                                                            java.lang.Throwable cause21 = th30.getCause();
                                                                            if (cause21 == null) {
                                                                                throw th30;
                                                                            }
                                                                            throw cause21;
                                                                        }
                                                                    } catch (java.lang.Throwable th31) {
                                                                        java.lang.Throwable cause22 = th31.getCause();
                                                                        if (cause22 == null) {
                                                                            throw th31;
                                                                        }
                                                                        throw cause22;
                                                                    }
                                                                } catch (java.lang.Throwable th32) {
                                                                    java.lang.Throwable cause23 = th32.getCause();
                                                                    if (cause23 == null) {
                                                                        throw th32;
                                                                    }
                                                                    throw cause23;
                                                                }
                                                            } catch (java.lang.Throwable th33) {
                                                                java.lang.Throwable cause24 = th33.getCause();
                                                                if (cause24 == null) {
                                                                    throw th33;
                                                                }
                                                                throw cause24;
                                                            }
                                                        } catch (java.lang.Exception e5) {
                                                            exc = e5;
                                                            z = true;
                                                            c = 5;
                                                        }
                                                    } else {
                                                        try {
                                                            inputStream = (java.io.InputStream) java.io.FileInputStream.class.getDeclaredConstructor(java.lang.String.class).newInstance(str2);
                                                        } catch (java.lang.Throwable th34) {
                                                            java.lang.Throwable cause25 = th34.getCause();
                                                            if (cause25 == null) {
                                                                throw th34;
                                                            }
                                                            throw cause25;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th35) {
                                                    java.lang.Throwable cause26 = th35.getCause();
                                                    if (cause26 == null) {
                                                        throw th35;
                                                    }
                                                    throw cause26;
                                                }
                                            } else {
                                                java.lang.String path2 = resource.getPath();
                                                try {
                                                    objArr6 = new java.lang.Object[]{"!/" + str2};
                                                } catch (java.lang.Throwable th36) {
                                                    th = th36;
                                                }
                                                try {
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    b(new char[]{17968, 29472, 11285, 55679, 37473, 20387, 30870, 13810, 61132, 38934, 21784}, 13597, objArr29);
                                                    try {
                                                        str3 = (java.lang.String) objArr29[0];
                                                        clsArr3 = new java.lang.Class[1];
                                                    } catch (java.lang.Throwable th37) {
                                                        th = th37;
                                                    }
                                                } catch (java.lang.Throwable th38) {
                                                    th = th38;
                                                    java.lang.Throwable th39 = th;
                                                    cause6 = th39.getCause();
                                                    if (cause6 != null) {
                                                    }
                                                }
                                                try {
                                                    clsArr3[0] = java.lang.String.class;
                                                    try {
                                                        objArr7 = new java.lang.Object[2];
                                                        try {
                                                            objArr7[1] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str3, clsArr3).invoke(path2, objArr6)).intValue());
                                                        } catch (java.lang.Throwable th40) {
                                                            th = th40;
                                                        }
                                                    } catch (java.lang.Throwable th41) {
                                                        th = th41;
                                                    }
                                                    try {
                                                        objArr7[0] = 5;
                                                        clsArr4 = new java.lang.Class[2];
                                                        clsArr4[0] = java.lang.Integer.TYPE;
                                                    } catch (java.lang.Throwable th43) {
                                                        th = th43;
                                                        java.lang.Throwable th44 = th;
                                                        cause7 = th44.getCause();
                                                        if (cause7 != null) {
                                                        }
                                                    }
                                                    try {
                                                        clsArr4[1] = java.lang.Integer.TYPE;
                                                        ZipFile zipFile2 = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str6, clsArr4).invoke(path2, objArr7));
                                                        inputStream = zipFile2.getInputStream(zipFile2.getEntry(str2));
                                                    } catch (java.lang.Throwable th45) {
                                                        th = th45;
                                                        java.lang.Throwable th442 = th;
                                                        cause7 = th442.getCause();
                                                        if (cause7 != null) {
                                                            throw th442;
                                                        }
                                                        throw cause7;
                                                    }
                                                } catch (java.lang.Throwable th46) {
                                                    th = th46;
                                                    java.lang.Throwable th392 = th;
                                                    cause6 = th392.getCause();
                                                    if (cause6 != null) {
                                                        throw th392;
                                                    }
                                                    throw cause6;
                                                }
                                            }
                                            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                                            try {
                                                objArr8 = new java.lang.Object[]{bufferedInputStream};
                                                objEZpvd = YY.EZpvd(1683135861);
                                                if (objEZpvd == null) {
                                                    try {
                                                        objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new java.lang.Class[]{java.io.InputStream.class});
                                                    } catch (java.lang.Throwable th47) {
                                                        th = th47;
                                                        cause8 = th.getCause();
                                                        if (cause8 != null) {
                                                            throw th;
                                                        }
                                                        throw cause8;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th48) {
                                                th = th48;
                                            }
                                            try {
                                                java.io.InputStream inputStream2 = (java.io.InputStream) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr8);
                                                if (bufferedInputStream == inputStream2) {
                                                    inputStream2.close();
                                                    try {
                                                        try {
                                                            try {
                                                                java.lang.Object objInvoke4 = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                try {
                                                                    java.lang.Object[] objArr30 = {str2, C7375aie.class.getClassLoader()};
                                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                    a(127, null, null, new byte[]{-112, -123, -125, -108}, objArr31);
                                                                    java.lang.reflect.Method declaredMethod3 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr31[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                    declaredMethod3.setAccessible(true);
                                                                    declaredMethod3.invoke(objInvoke4, objArr30);
                                                                } catch (java.lang.Throwable th49) {
                                                                    java.lang.Throwable cause27 = th49.getCause();
                                                                    if (cause27 == null) {
                                                                        throw th49;
                                                                    }
                                                                    throw cause27;
                                                                }
                                                            } catch (java.lang.Throwable th50) {
                                                                java.lang.Throwable cause28 = th50.getCause();
                                                                if (cause28 == null) {
                                                                    throw th50;
                                                                }
                                                                throw cause28;
                                                            }
                                                        } catch (java.lang.Exception unused) {
                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                try {
                                                                    java.lang.Object objInvoke5 = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                    try {
                                                                        java.lang.Object[] objArr32 = {str2, C7375aie.class.getClassLoader()};
                                                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                                        b(new char[]{17976, 34296, 49542, 3410, 18705, 38095}, 50123, objArr33);
                                                                        java.lang.reflect.Method declaredMethod4 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr33[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                        declaredMethod4.setAccessible(true);
                                                                        declaredMethod4.invoke(objInvoke5, objArr32);
                                                                    } catch (java.lang.Throwable th51) {
                                                                        java.lang.Throwable cause29 = th51.getCause();
                                                                        if (cause29 == null) {
                                                                            throw th51;
                                                                        }
                                                                        throw cause29;
                                                                    }
                                                                } catch (java.lang.Throwable th52) {
                                                                    java.lang.Throwable cause30 = th52.getCause();
                                                                    if (cause30 == null) {
                                                                        throw th52;
                                                                    }
                                                                    throw cause30;
                                                                }
                                                            } else {
                                                                try {
                                                                    objInvoke2 = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                    java.lang.ClassLoader classLoader3 = C7375aie.class.getClassLoader();
                                                                    synchronized (objInvoke2) {
                                                                    }
                                                                } catch (java.lang.Throwable th53) {
                                                                    java.lang.Throwable cause31 = th53.getCause();
                                                                    if (cause31 == null) {
                                                                        throw th53;
                                                                    }
                                                                    throw cause31;
                                                                }
                                                            }
                                                        }
                                                    } catch (java.lang.NoSuchMethodException unused2) {
                                                        objInvoke2 = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                        java.lang.ClassLoader classLoader32 = C7375aie.class.getClassLoader();
                                                        synchronized (objInvoke2) {
                                                            try {
                                                                java.lang.Object[] objArr34 = {str2, classLoader32};
                                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                a(127, null, null, new byte[]{-112, -123, -125, -107, -117, -115, -119, -118, -123, -122}, objArr35);
                                                                java.lang.reflect.Method declaredMethod5 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr35[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                declaredMethod5.setAccessible(true);
                                                                java.lang.String str10 = (java.lang.String) declaredMethod5.invoke(objInvoke2, objArr34);
                                                                if (str10 != null) {
                                                                    throw new java.lang.UnsatisfiedLinkError(str10);
                                                                }
                                                            } catch (java.lang.Throwable th54) {
                                                                java.lang.Throwable cause32 = th54.getCause();
                                                                if (cause32 == null) {
                                                                    throw th54;
                                                                }
                                                                throw cause32;
                                                            }
                                                        }
                                                        r6 = 1;
                                                        r8 = 5;
                                                        r12 = 127;
                                                        r13 = 0;
                                                        r14 = 0;
                                                        i2++;
                                                        str5 = str;
                                                        i = r6;
                                                        r62 = r8;
                                                        r7 = r12;
                                                        r82 = r13;
                                                        r2 = r14;
                                                        r122 = r19;
                                                    }
                                                    r6 = 1;
                                                    r8 = 5;
                                                    r12 = 127;
                                                    r13 = 0;
                                                    r14 = 0;
                                                } else {
                                                    try {
                                                        objArr9 = new java.lang.Object[]{objNewInstance2};
                                                    } catch (java.lang.Throwable th55) {
                                                        th = th55;
                                                    }
                                                    try {
                                                        clsArr5 = new java.lang.Class[1];
                                                    } catch (java.lang.Throwable th56) {
                                                        th = th56;
                                                        java.lang.Throwable th57 = th;
                                                        cause9 = th57.getCause();
                                                        if (cause9 != null) {
                                                        }
                                                    }
                                                    try {
                                                        clsArr5[0] = java.io.File.class;
                                                        java.io.OutputStream outputStream = (java.io.OutputStream) java.io.FileOutputStream.class.getDeclaredConstructor(clsArr5).newInstance(objArr9);
                                                        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
                                                        byte[] bArr3 = new byte[1024];
                                                        while (true) {
                                                            int i3 = inputStream2.read(bArr3);
                                                            if (i3 < 0) {
                                                                break;
                                                            } else {
                                                                bufferedOutputStream.write(bArr3, 0, i3);
                                                            }
                                                        }
                                                        bufferedOutputStream.flush();
                                                        r82 = 5;
                                                        r8 = 5;
                                                        r8 = 5;
                                                        c2 = 5;
                                                        c = 5;
                                                        try {
                                                        } catch (java.lang.Throwable th58) {
                                                            th = th58;
                                                        }
                                                        try {
                                                            objArr10 = new java.lang.Object[1];
                                                            try {
                                                                a(127, null, null, new byte[]{-101, -102, -118, -117, -111}, objArr10);
                                                            } catch (java.lang.Throwable th59) {
                                                                th = th59;
                                                            }
                                                        } catch (java.lang.Throwable th60) {
                                                            th = th60;
                                                            java.lang.Throwable th61 = th;
                                                            cause10 = th61.getCause();
                                                            if (cause10 == null) {
                                                            }
                                                        }
                                                        try {
                                                        } catch (java.lang.Throwable th62) {
                                                            th = th62;
                                                            java.lang.Throwable th612 = th;
                                                            cause10 = th612.getCause();
                                                            if (cause10 == null) {
                                                            }
                                                        }
                                                        try {
                                                            java.lang.Object objInvoke6 = java.io.FileOutputStream.class.getMethod((java.lang.String) objArr10[0], null).invoke(outputStream, null);
                                                            try {
                                                            } catch (java.lang.Throwable th63) {
                                                                th = th63;
                                                            }
                                                            try {
                                                                objArr11 = new java.lang.Object[1];
                                                            } catch (java.lang.Throwable th64) {
                                                                th = th64;
                                                                java.lang.Throwable th65 = th;
                                                                cause11 = th65.getCause();
                                                                if (cause11 == null) {
                                                                }
                                                            }
                                                            try {
                                                                a(127, null, null, new byte[]{-124, -122, -105, -126}, objArr11);
                                                            } catch (java.lang.Throwable th66) {
                                                                th = th66;
                                                                java.lang.Throwable th652 = th;
                                                                cause11 = th652.getCause();
                                                                if (cause11 == null) {
                                                                }
                                                            }
                                                            try {
                                                                java.io.FileDescriptor.class.getMethod((java.lang.String) objArr11[0], null).invoke(objInvoke6, null);
                                                                try {
                                                                    bufferedOutputStream.close();
                                                                    inputStream2.close();
                                                                    try {
                                                                        java.lang.Object objInvoke7 = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                        try {
                                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                            b(new char[]{17979, 11520, 36954, 1974, 60122, 24114, 50533, 43199, 8161, 33577, 30211, 56703, 16529, 14285, 39722}, 27449, objArr36);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        java.lang.Object[] objArr37 = {java.io.File.class.getMethod((java.lang.String) objArr36[0], null).invoke(objNewInstance2, null), C7375aie.class.getClassLoader()};
                                                                                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                                                        a(127, null, null, new byte[]{-112, -123, -125, -108}, objArr38);
                                                                                        java.lang.reflect.Method declaredMethod6 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr38[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                        declaredMethod6.setAccessible(true);
                                                                                        declaredMethod6.invoke(objInvoke7, objArr37);
                                                                                    } catch (java.lang.NoSuchMethodException unused3) {
                                                                                        try {
                                                                                            objInvoke = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                            try {
                                                                                            } catch (java.lang.Throwable th67) {
                                                                                                th = th67;
                                                                                            }
                                                                                            try {
                                                                                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                                                b(new char[]{17979, 11520, 36954, 1974, 60122, 24114, 50533, 43199, 8161, 33577, 30211, 56703, 16529, 14285, 39722}, 27449, objArr39);
                                                                                            } catch (java.lang.Throwable th68) {
                                                                                                th = th68;
                                                                                                java.lang.Throwable th69 = th;
                                                                                                cause12 = th69.getCause();
                                                                                                if (cause12 == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                            } catch (java.lang.Throwable th70) {
                                                                                                th = th70;
                                                                                                java.lang.Throwable th692 = th;
                                                                                                cause12 = th692.getCause();
                                                                                                if (cause12 == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                java.lang.Object objInvoke8 = java.io.File.class.getMethod((java.lang.String) objArr39[0], null).invoke(objNewInstance2, null);
                                                                                                try {
                                                                                                    java.lang.ClassLoader classLoader4 = C7375aie.class.getClassLoader();
                                                                                                    try {
                                                                                                        synchronized (objInvoke) {
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th71) {
                                                                                                        th = th71;
                                                                                                    }
                                                                                                } catch (java.lang.Exception e6) {
                                                                                                    e = e6;
                                                                                                    z2 = true;
                                                                                                    r122 = 127;
                                                                                                    r132 = 0;
                                                                                                    NewInstance = z2;
                                                                                                    r82 = c2;
                                                                                                    declaredConstructor = 0;
                                                                                                    exc = e;
                                                                                                    r6 = NewInstance;
                                                                                                    r8 = r82;
                                                                                                    r12 = r122;
                                                                                                    r13 = r132;
                                                                                                    r14 = declaredConstructor;
                                                                                                    r19 = r19;
                                                                                                    if (i2 >= length) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (java.lang.Throwable th72) {
                                                                                                th = th72;
                                                                                                java.lang.Throwable th6922 = th;
                                                                                                cause12 = th6922.getCause();
                                                                                                if (cause12 == null) {
                                                                                                    throw th6922;
                                                                                                }
                                                                                                throw cause12;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th73) {
                                                                                            java.lang.Throwable cause33 = th73.getCause();
                                                                                            if (cause33 == null) {
                                                                                                throw th73;
                                                                                            }
                                                                                            throw cause33;
                                                                                        }
                                                                                    } catch (java.lang.Exception e7) {
                                                                                        exc = e7;
                                                                                        z = true;
                                                                                    }
                                                                                } catch (java.lang.Exception unused4) {
                                                                                    if (Build.VERSION.SDK_INT <= 27) {
                                                                                        try {
                                                                                            java.lang.Object objInvoke9 = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                            try {
                                                                                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                                                b(new char[]{17979, 11520, 36954, 1974, 60122, 24114, 50533, 43199, 8161, 33577, 30211, 56703, 16529, 14285, 39722}, 27449, objArr40);
                                                                                                try {
                                                                                                    java.lang.Object[] objArr41 = {java.io.File.class.getMethod((java.lang.String) objArr40[0], null).invoke(objNewInstance2, null), C7375aie.class.getClassLoader()};
                                                                                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                                                                    b(new char[]{17976, 34296, 49542, 3410, 18705, 38095}, 50123, objArr42);
                                                                                                    java.lang.reflect.Method declaredMethod7 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr42[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                                    declaredMethod7.setAccessible(true);
                                                                                                    declaredMethod7.invoke(objInvoke9, objArr41);
                                                                                                } catch (java.lang.Throwable th74) {
                                                                                                    java.lang.Throwable cause34 = th74.getCause();
                                                                                                    if (cause34 == null) {
                                                                                                        throw th74;
                                                                                                    }
                                                                                                    throw cause34;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th75) {
                                                                                                java.lang.Throwable cause35 = th75.getCause();
                                                                                                if (cause35 == null) {
                                                                                                    throw th75;
                                                                                                }
                                                                                                throw cause35;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th76) {
                                                                                            java.lang.Throwable cause36 = th76.getCause();
                                                                                            if (cause36 == null) {
                                                                                                throw th76;
                                                                                            }
                                                                                            throw cause36;
                                                                                        }
                                                                                    } else {
                                                                                        objInvoke = java.lang.Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                        java.lang.Object[] objArr392 = new java.lang.Object[1];
                                                                                        b(new char[]{17979, 11520, 36954, 1974, 60122, 24114, 50533, 43199, 8161, 33577, 30211, 56703, 16529, 14285, 39722}, 27449, objArr392);
                                                                                        java.lang.Object objInvoke82 = java.io.File.class.getMethod((java.lang.String) objArr392[0], null).invoke(objNewInstance2, null);
                                                                                        java.lang.ClassLoader classLoader42 = C7375aie.class.getClassLoader();
                                                                                        synchronized (objInvoke) {
                                                                                            try {
                                                                                                objArr12 = new java.lang.Object[]{objInvoke82, classLoader42};
                                                                                                try {
                                                                                                    objArr13 = new java.lang.Object[1];
                                                                                                } catch (java.lang.Throwable th77) {
                                                                                                    th = th77;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th78) {
                                                                                                th = th78;
                                                                                            }
                                                                                            try {
                                                                                                a(127, null, null, new byte[]{-112, -123, -125, -107, -117, -115, -119, -118, -123, -122}, objArr13);
                                                                                            } catch (java.lang.Throwable th79) {
                                                                                                th = th79;
                                                                                                java.lang.Throwable th80 = th;
                                                                                                cause13 = th80.getCause();
                                                                                                if (cause13 == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                str4 = (java.lang.String) objArr13[0];
                                                                                                clsArr6 = new java.lang.Class[2];
                                                                                                clsArr6[0] = java.lang.String.class;
                                                                                            } catch (java.lang.Throwable th81) {
                                                                                                th = th81;
                                                                                                java.lang.Throwable th802 = th;
                                                                                                cause13 = th802.getCause();
                                                                                                if (cause13 == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                clsArr6[1] = java.lang.ClassLoader.class;
                                                                                                java.lang.reflect.Method declaredMethod8 = java.lang.Runtime.class.getDeclaredMethod(str4, clsArr6);
                                                                                                declaredMethod8.setAccessible(true);
                                                                                                java.lang.String str11 = (java.lang.String) declaredMethod8.invoke(objInvoke, objArr12);
                                                                                                if (str11 != null) {
                                                                                                    throw new java.lang.UnsatisfiedLinkError(str11);
                                                                                                }
                                                                                                try {
                                                                                                } catch (java.lang.Throwable th82) {
                                                                                                    th = th82;
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th83) {
                                                                                                th = th83;
                                                                                                java.lang.Throwable th8022 = th;
                                                                                                cause13 = th8022.getCause();
                                                                                                if (cause13 == null) {
                                                                                                    throw th8022;
                                                                                                }
                                                                                                throw cause13;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    r6 = 1;
                                                                                    r6 = 1;
                                                                                    r6 = 1;
                                                                                    r6 = 1;
                                                                                } catch (java.lang.Throwable th84) {
                                                                                    th = th84;
                                                                                    r6 = 1;
                                                                                }
                                                                                try {
                                                                                    objArr14 = new java.lang.Object[1];
                                                                                    r12 = 127;
                                                                                    r12 = 127;
                                                                                    r12 = 127;
                                                                                    r13 = 0;
                                                                                    r13 = 0;
                                                                                    r13 = 0;
                                                                                } catch (java.lang.Throwable th85) {
                                                                                    th = th85;
                                                                                    r12 = 127;
                                                                                    r13 = 0;
                                                                                    r14 = 0;
                                                                                    java.lang.Throwable th86 = th;
                                                                                    try {
                                                                                        cause14 = th86.getCause();
                                                                                        if (cause14 == null) {
                                                                                        }
                                                                                    } catch (java.lang.Exception unused5) {
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    a(127, null, null, new byte[]{-117, -118, -117, -108, -117, -112}, objArr14);
                                                                                    r14 = 0;
                                                                                    r14 = 0;
                                                                                } catch (java.lang.Throwable th87) {
                                                                                    th = th87;
                                                                                    r14 = 0;
                                                                                    java.lang.Throwable th862 = th;
                                                                                    cause14 = th862.getCause();
                                                                                    if (cause14 == null) {
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr14[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                } catch (java.lang.Throwable th88) {
                                                                                    th = th88;
                                                                                    java.lang.Throwable th8622 = th;
                                                                                    cause14 = th8622.getCause();
                                                                                    if (cause14 == null) {
                                                                                        throw th8622;
                                                                                    }
                                                                                    throw cause14;
                                                                                }
                                                                            } catch (java.lang.Throwable th89) {
                                                                                java.lang.Throwable cause37 = th89.getCause();
                                                                                if (cause37 == null) {
                                                                                    throw th89;
                                                                                }
                                                                                throw cause37;
                                                                            }
                                                                        } catch (java.lang.Throwable th90) {
                                                                            java.lang.Throwable cause38 = th90.getCause();
                                                                            if (cause38 == null) {
                                                                                throw th90;
                                                                            }
                                                                            throw cause38;
                                                                        }
                                                                    } catch (java.lang.Throwable th91) {
                                                                        java.lang.Throwable cause39 = th91.getCause();
                                                                        if (cause39 == null) {
                                                                            throw th91;
                                                                        }
                                                                        throw cause39;
                                                                    }
                                                                } catch (java.lang.Exception e8) {
                                                                    e = e8;
                                                                    r132 = 0;
                                                                    NewInstance = 1;
                                                                    r122 = 127;
                                                                    declaredConstructor = 0;
                                                                    exc = e;
                                                                    r6 = NewInstance;
                                                                    r8 = r82;
                                                                    r12 = r122;
                                                                    r13 = r132;
                                                                    r14 = declaredConstructor;
                                                                    r19 = r19;
                                                                    if (i2 >= length) {
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th92) {
                                                                th = th92;
                                                                java.lang.Throwable th6522 = th;
                                                                cause11 = th6522.getCause();
                                                                if (cause11 == null) {
                                                                    throw th6522;
                                                                }
                                                                throw cause11;
                                                            }
                                                        } catch (java.lang.Throwable th93) {
                                                            th = th93;
                                                            java.lang.Throwable th6122 = th;
                                                            cause10 = th6122.getCause();
                                                            if (cause10 == null) {
                                                                throw th6122;
                                                            }
                                                            throw cause10;
                                                        }
                                                    } catch (java.lang.Throwable th94) {
                                                        th = th94;
                                                        java.lang.Throwable th572 = th;
                                                        cause9 = th572.getCause();
                                                        if (cause9 != null) {
                                                            throw th572;
                                                        }
                                                        throw cause9;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th95) {
                                                th = th95;
                                                th = th;
                                                cause8 = th.getCause();
                                                if (cause8 != null) {
                                                }
                                            }
                                        } catch (java.lang.Exception e9) {
                                            e = e9;
                                            z2 = true;
                                            c2 = 5;
                                        }
                                    } catch (java.lang.Throwable th96) {
                                        th = th96;
                                        java.lang.Throwable th282 = th;
                                        cause5 = th282.getCause();
                                        if (cause5 != null) {
                                            throw th282;
                                        }
                                        throw cause5;
                                    }
                                } catch (java.lang.Throwable th97) {
                                    th = th97;
                                    java.lang.Throwable th252 = th;
                                    cause4 = th252.getCause();
                                    if (cause4 != null) {
                                        throw th252;
                                    }
                                    throw cause4;
                                }
                            } catch (java.lang.Throwable th98) {
                                th = th98;
                                java.lang.Throwable th212 = th;
                                cause3 = th212.getCause();
                                if (cause3 != null) {
                                    throw th212;
                                }
                                throw cause3;
                            }
                            exc = e5;
                            z = true;
                            c = 5;
                            r12 = 127;
                            r13 = 0;
                            r14 = 0;
                            r6 = z;
                            r8 = c;
                            r19 = r19;
                        } catch (java.lang.Throwable th99) {
                            th = th99;
                            java.lang.Throwable th12222 = th;
                            cause2 = th12222.getCause();
                            if (cause2 != null) {
                                throw th12222;
                            }
                            throw cause2;
                        }
                    } catch (java.lang.Exception e10) {
                        e = e10;
                        NewInstance = i;
                        r132 = r82;
                        r19 = r122;
                        r82 = 5;
                        declaredConstructor = 0;
                        r122 = r7;
                        exc = e;
                        r6 = NewInstance;
                        r8 = r82;
                        r12 = r122;
                        r13 = r132;
                        r14 = declaredConstructor;
                        r19 = r19;
                        if (i2 >= length) {
                        }
                    }
                    if (i2 >= length) {
                        throw exc;
                    }
                }
                i2++;
                str5 = str;
                i = r6;
                r62 = r8;
                r7 = r12;
                r82 = r13;
                r2 = r14;
                r122 = r19;
            }
        } catch (java.lang.Throwable th100) {
            java.lang.Throwable cause40 = th100.getCause();
            if (cause40 == null) {
                throw th100;
            }
            throw cause40;
        }
    }
}

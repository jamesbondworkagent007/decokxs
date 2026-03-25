package o;

import android.os.Build;
import com.google.common.base.Ascii;
import java.util.zip.ZipFile;
import o.YG;

/* JADX INFO: loaded from: classes2.dex */
public final class YJ implements YG.StateListAnimator {
    private static final byte[] EZpvd = {19, -119, 81, -60, 1, 3, -12, -26, Ascii.ESC, -9, Ascii.SO, -19, Ascii.SI, 5};
    private static final int KWHzl = 248;
    private static long copydefault = -1154347247295937824L;
    private static int[] OLrzqt = {-1291627875, -1961496304, 1190059096, -1375458089, -1788797584, 1418423992, 206442868, 1302321423, -1892090031, -1415142690, -1951379718, 1370709743, 1824390004, -777204776, -317354052, 1288650892, 838037802, 1348000729};

    @Override // o.YG.StateListAnimator
    public void AEQbTJ(java.lang.String str) throws java.lang.Exception {
        KWHzl(str);
    }

    @Override // o.YG.StateListAnimator
    public void OLrzqt(java.lang.String str) throws java.lang.Exception {
        djBIcL(str);
    }

    @Override // o.YG.StateListAnimator
    public java.lang.String EZpvd(java.lang.String str) {
        if (str.startsWith("lib")) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{29763, 20793, 15948}, 9511, objArr);
            if (str.endsWith((java.lang.String) objArr[0])) {
                return str;
            }
        }
        return java.lang.System.mapLibraryName(str);
    }

    @Override // o.YG.StateListAnimator
    public java.lang.String copydefault(java.lang.String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // o.YG.StateListAnimator
    public java.lang.String[] KWHzl() {
        java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        java.lang.String str = android.os.Build.CPU_ABI2;
        if (!YN.OLrzqt(str)) {
            return new java.lang.String[]{android.os.Build.CPU_ABI, str};
        }
        return new java.lang.String[]{android.os.Build.CPU_ABI};
    }

    private static void a(char[] cArr, int i, java.lang.Object[] objArr) {
        Zi zi = new Zi();
        zi.OLrzqt = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            jArr[zi.AEQbTJ] = (((long) cArr[zi.AEQbTJ]) ^ (((long) zi.AEQbTJ) * ((long) zi.OLrzqt))) ^ (copydefault ^ 5439468278228498061L);
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

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        Zm zm = new Zm();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = OLrzqt;
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
        int[] iArr5 = OLrzqt;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5;
        byte[] bArr = EZpvd;
        int i6 = (i * 4) + 11;
        int i7 = (b * 4) + 4;
        int i8 = (i2 * 3) + 102;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i6;
            i4 = i7;
            i5 = 0;
            i4++;
            i7 = i7 + i9 + 2;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i9 = bArr[i4];
            i4++;
            i7 = i7 + i9 + 2;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i7;
            i7 = i8;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:373:0x0828 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:384:0x084e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:388:0x0853 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:598:0x0a11 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:661:0x00f6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:803:0x0a22 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0863 A[Catch: Exception -> 0x0a22, TryCatch #85 {Exception -> 0x0a22, blocks: (B:397:0x085d, B:399:0x0863, B:400:0x0864), top: B:780:0x085d }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0864 A[Catch: Exception -> 0x0a22, TRY_LEAVE, TryCatch #85 {Exception -> 0x0a22, blocks: (B:397:0x085d, B:399:0x0863, B:400:0x0864), top: B:780:0x085d }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x089c A[Catch: all -> 0x089e, TryCatch #51 {all -> 0x089e, blocks: (B:404:0x086f, B:405:0x0874, B:430:0x08a0, B:424:0x0895, B:426:0x089c, B:427:0x089d), top: B:717:0x07f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x089d A[Catch: all -> 0x089e, TryCatch #51 {all -> 0x089e, blocks: (B:404:0x086f, B:405:0x0874, B:430:0x08a0, B:424:0x0895, B:426:0x089c, B:427:0x089d), top: B:717:0x07f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08bd A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08be A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x08f4 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08f5 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0911 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0912 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x092a A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x092b A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x093d A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x093e A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0967 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0968 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0980 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0981 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x09a7 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x09a8 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x09c3 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x09c4 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x09df A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x09e0 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0a00 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0a01 A[Catch: Exception -> 0x0a11, TryCatch #22 {Exception -> 0x0a11, blocks: (B:500:0x0937, B:502:0x093d, B:503:0x093e, B:431:0x08a1, B:442:0x08b5, B:444:0x08bd, B:445:0x08be, B:450:0x08c8, B:452:0x08d1, B:453:0x08d2, B:466:0x08ec, B:468:0x08f4, B:469:0x08f5, B:480:0x0909, B:482:0x0911, B:483:0x0912, B:491:0x0922, B:493:0x092a, B:494:0x092b, B:519:0x0960, B:521:0x0967, B:522:0x0968, B:530:0x0978, B:532:0x0980, B:533:0x0981, B:547:0x09a0, B:549:0x09a7, B:550:0x09a8, B:561:0x09bb, B:563:0x09c3, B:564:0x09c4, B:575:0x09d7, B:577:0x09df, B:578:0x09e0, B:589:0x09f9, B:591:0x0a00, B:592:0x0a01, B:594:0x0a03, B:596:0x0a0f, B:597:0x0a10, B:15:0x00f6), top: B:661:0x00f6, inners: #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x05f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:707:0x07f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:718:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0256 A[Catch: Exception -> 0x024d, TRY_LEAVE, TryCatch #88 {Exception -> 0x024d, blocks: (B:45:0x01b6, B:51:0x0227, B:73:0x0256, B:82:0x0297, B:84:0x029d, B:85:0x029e, B:118:0x0345, B:122:0x03be, B:127:0x0419, B:203:0x052c, B:219:0x0584, B:223:0x0595, B:228:0x05ce, B:230:0x05d4, B:231:0x05d5, B:233:0x05d7, B:235:0x05de, B:236:0x05df, B:238:0x05eb, B:239:0x05f1, B:254:0x0641, B:256:0x0643, B:258:0x064a, B:259:0x064b, B:272:0x0674, B:317:0x073d, B:322:0x076d, B:327:0x07a7, B:329:0x07ad, B:330:0x07ae, B:332:0x07b0, B:334:0x07b7, B:335:0x07b8, B:337:0x07ba, B:339:0x07c1, B:340:0x07c2, B:129:0x0424, B:131:0x042b, B:132:0x042c, B:134:0x042e, B:136:0x0435, B:137:0x0436, B:139:0x0438, B:141:0x043f, B:142:0x0440, B:144:0x0442, B:146:0x0449, B:147:0x044a, B:149:0x044c, B:151:0x0453, B:152:0x0454, B:157:0x0471, B:159:0x0477, B:160:0x0478, B:162:0x047a, B:164:0x0481, B:165:0x0482, B:87:0x02a0, B:89:0x02a7, B:90:0x02a8, B:55:0x0230, B:57:0x0237, B:58:0x0238, B:60:0x023a, B:62:0x0241, B:63:0x0242, B:65:0x0244, B:67:0x024b, B:68:0x024c, B:126:0x03fe, B:125:0x03e3, B:50:0x0200, B:123:0x03c5, B:48:0x01ea, B:242:0x0626, B:244:0x062e, B:245:0x0633, B:247:0x0635, B:249:0x063c, B:250:0x063d, B:240:0x05f2, B:121:0x0392, B:237:0x05e0, B:46:0x01cc, B:119:0x0374, B:153:0x0455, B:116:0x0311, B:78:0x026c, B:75:0x025e), top: B:784:0x01b6, inners: #0, #3, #4, #9, #10, #11, #13, #15, #16, #18, #32, #37, #48, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:784:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:799:0x0a2e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:803:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a9  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v133 */
    /* JADX WARN: Type inference failed for: r11v134 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v151 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v181 */
    /* JADX WARN: Type inference failed for: r11v182 */
    /* JADX WARN: Type inference failed for: r11v183 */
    /* JADX WARN: Type inference failed for: r11v184 */
    /* JADX WARN: Type inference failed for: r11v185 */
    /* JADX WARN: Type inference failed for: r11v186 */
    /* JADX WARN: Type inference failed for: r11v187 */
    /* JADX WARN: Type inference failed for: r11v188 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v100 */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v132 */
    /* JADX WARN: Type inference failed for: r12v133 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r15v10, types: [char[]] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void djBIcL(java.lang.String str) throws java.lang.Exception {
        ?? NewInstance;
        ?? r15;
        ?? declaredConstructor;
        ?? r152;
        ?? r13;
        ?? r12;
        ?? r11;
        java.lang.Exception exc;
        java.lang.Object[] objArr;
        java.lang.Throwable cause;
        java.lang.Object[] objArr2;
        boolean zBooleanValue;
        int i;
        ?? externalStorageDirectory;
        java.lang.String strOLrzqt;
        java.lang.Throwable cause2;
        java.lang.Object[] objArr3;
        java.lang.Class[] clsArr;
        java.lang.Throwable cause3;
        java.lang.Object[] objArr4;
        java.lang.Class[] clsArr2;
        java.lang.Throwable cause4;
        java.lang.Object[] objArr5;
        java.lang.Class[] clsArr3;
        java.lang.Throwable cause5;
        java.lang.Object[] objArr6;
        java.lang.Class[] clsArr4;
        java.lang.Throwable cause6;
        java.lang.Object[] objArr7;
        java.lang.Class[] clsArr5;
        java.io.InputStream inputStream;
        java.lang.Throwable th;
        java.lang.Throwable cause7;
        java.lang.Object[] objArr8;
        java.lang.Object objEZpvd;
        java.lang.Throwable cause8;
        java.lang.Object[] objArr9;
        java.lang.Class[] clsArr6;
        java.lang.Throwable cause9;
        java.lang.Object[] objArr10;
        java.lang.Throwable cause10;
        java.lang.Object[] objArr11;
        java.lang.Object objInvoke;
        java.lang.Throwable cause11;
        java.lang.Throwable cause12;
        java.lang.Object[] objArr12;
        java.lang.Object[] objArr13;
        java.lang.Throwable cause13;
        java.lang.Object objInvoke2;
        java.lang.String str2 = str;
        int i2 = 1;
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b(new int[]{381996839, -426653774, 1809445851, 888153213, 230711139, -917073691}, 11, objArr14);
        ?? r3 = 0;
        java.lang.String str3 = (java.lang.String) objArr14[0];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a(new char[]{29726, 53797, 14453, 34473, 60653, 19246, 37226, 65448, 17890}, 42557, objArr15);
        java.lang.String str4 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        b(new int[]{-1129247088, 190326642, 2051367672, 19797919, 740543497, -522509098}, 10, objArr16);
        java.lang.String str5 = (java.lang.String) objArr16[0];
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        b(new int[]{-245468662, 1129706606}, 1, objArr17);
        try {
            ?? r132 = 0;
            ?? r122 = 2;
            java.lang.Object objInvoke3 = java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(str2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str3, java.lang.String.class).invoke(str2, (java.lang.String) objArr17[0])).intValue() + 4), java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod("length", null).invoke(str2, null)).intValue() - 3));
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            a(new char[]{29752, 41188, 56721, 2775, 10017}, 54493, objArr18);
            java.lang.String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) java.lang.String.class.getMethod("getBytes", java.lang.String.class).invoke(objInvoke3, (java.lang.String) objArr18[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new java.lang.String[0];
            }
            int length = strArrAEQbTJ.length;
            java.lang.String[] strArr = new java.lang.String[length + 1];
            java.lang.System.arraycopy(strArrAEQbTJ, 0, strArr, 0, length);
            strArr[length] = str2;
            int i3 = 0;
            while (i3 <= length) {
                java.lang.String str6 = strArr[i3];
                try {
                    r15 = new char[]{29762, 23710, 9506, 3548, 54864, 48817, 34691, 26669, 12449, 6467, 57764, 51827, 37654, 31659, 19457, 5339, 64886, 50706, 44765, 30511, 24512, 8290, 2299, 53657, 47665};
                    objArr = new java.lang.Object[i2];
                    declaredConstructor = 10391;
                } catch (java.lang.Exception e) {
                    e = e;
                    NewInstance = i2;
                    r15 = r122;
                    declaredConstructor = r132;
                }
                try {
                    a(r15, 10391, objArr);
                    NewInstance = (java.lang.String) objArr[r3];
                    try {
                        try {
                            r15 = new java.lang.Class[i2];
                            r15[r3] = java.lang.String.class;
                            declaredConstructor = java.io.File.class.getDeclaredConstructor(r15);
                            NewInstance = declaredConstructor.newInstance(NewInstance);
                            try {
                                objArr2 = new java.lang.Object[i2];
                                b(new int[]{-834340365, 1617530297, -174791193, -2123559933}, 8, objArr2);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                            try {
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                java.lang.Throwable th4 = th;
                                cause = th4.getCause();
                                if (cause != null) {
                                }
                            }
                            try {
                                zBooleanValue = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr2[0], null).invoke(NewInstance, null)).booleanValue();
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
                            java.lang.Throwable cause14 = th6.getCause();
                            if (cause14 == null) {
                                throw th6;
                            }
                            throw cause14;
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                    NewInstance = i2;
                    declaredConstructor = r132;
                    r15 = 2;
                    r132 = r3;
                    exc = e;
                    r11 = NewInstance;
                    r12 = declaredConstructor;
                    r13 = r132;
                    r152 = r15;
                    if (i3 >= length) {
                    }
                }
                if (zBooleanValue) {
                    if (i3 < length) {
                    }
                    if (i3 < length) {
                    }
                    if (strOLrzqt != null) {
                    }
                    exc = e;
                    i = 1;
                    r12 = 0;
                    r13 = 0;
                    r152 = 2;
                    r11 = i;
                    if (i3 >= length) {
                    }
                } else {
                    try {
                        java.lang.Object[] objArr19 = new java.lang.Object[i2];
                        b(new int[]{1994940439, -214170090, 1052960537, -520092750, 299630434, -47354770, -241390786, 1764345395}, 14, objArr19);
                        java.lang.String str7 = (java.lang.String) objArr19[0];
                        try {
                            java.lang.Object[] objArr20 = {java.lang.System.getProperty(str7, str7)};
                            java.lang.Class[] clsArr7 = new java.lang.Class[i2];
                            clsArr7[0] = java.lang.String.class;
                            java.lang.Object objNewInstance = java.io.File.class.getDeclaredConstructor(clsArr7).newInstance(objArr20);
                            try {
                                java.lang.Object[] objArr21 = new java.lang.Object[i2];
                                b(new int[]{-834340365, 1617530297, -174791193, -2123559933}, 8, objArr21);
                                boolean zBooleanValue2 = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr21[0], null).invoke(objNewInstance, null)).booleanValue();
                                externalStorageDirectory = objNewInstance;
                                if (!zBooleanValue2) {
                                    externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
                                }
                                if (i3 < length) {
                                    try {
                                        java.lang.Object[] objArr22 = new java.lang.Object[i2];
                                        b(new int[]{-245468662, 1129706606}, i2, objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {(java.lang.String) objArr22[0]};
                                            java.lang.Class[] clsArr8 = new java.lang.Class[i2];
                                            clsArr8[0] = java.lang.String.class;
                                            int iIntValue = ((java.lang.Integer) java.lang.String.class.getMethod(str3, clsArr8).invoke(str2, objArr23)).intValue() + 4;
                                            try {
                                                try {
                                                    java.lang.Object[] objArr24 = new java.lang.Object[2];
                                                    objArr24[i2] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod("length", null).invoke(str2, null)).intValue() - 3);
                                                    objArr24[0] = java.lang.Integer.valueOf(iIntValue);
                                                    strOLrzqt = Zr.OLrzqt(YJ.class, (java.lang.String) java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(str2, objArr24));
                                                    if (strOLrzqt == null) {
                                                        strOLrzqt = str2;
                                                    }
                                                } catch (java.lang.Throwable th7) {
                                                    java.lang.Throwable cause15 = th7.getCause();
                                                    if (cause15 == null) {
                                                        throw th7;
                                                    }
                                                    throw cause15;
                                                }
                                            } catch (java.lang.Throwable th8) {
                                                java.lang.Throwable cause16 = th8.getCause();
                                                if (cause16 == null) {
                                                    throw th8;
                                                }
                                                throw cause16;
                                            }
                                        } catch (java.lang.Throwable th9) {
                                            java.lang.Throwable cause17 = th9.getCause();
                                            if (cause17 == null) {
                                                throw th9;
                                            }
                                            throw cause17;
                                        }
                                    } catch (java.lang.Exception e4) {
                                        exc = e4;
                                        i = 1;
                                        r12 = 0;
                                        r13 = 0;
                                        r152 = 2;
                                        r11 = i;
                                        if (i3 >= length) {
                                        }
                                    }
                                } else {
                                    strOLrzqt = str6;
                                }
                                if (i3 < length) {
                                    strOLrzqt = Zr.OLrzqt(YJ.class, strOLrzqt);
                                }
                                if (strOLrzqt != null) {
                                    try {
                                        java.lang.Object objInvoke4 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                        if (i3 >= length) {
                                            str6 = str2;
                                        }
                                        try {
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            a(new char[]{29697, 57959, 22726, 46886, 11701, 39933, 62033, 26844, 50980, 15762, 44006}, 38501, objArr25);
                                            java.lang.Runtime.class.getMethod((java.lang.String) objArr25[0], java.lang.String.class).invoke(objInvoke4, str6);
                                            return;
                                        } catch (java.lang.Throwable th10) {
                                            java.lang.Throwable cause18 = th10.getCause();
                                            if (cause18 == null) {
                                                throw th10;
                                            }
                                            throw cause18;
                                        }
                                    } catch (java.lang.Throwable th11) {
                                        java.lang.Throwable cause19 = th11.getCause();
                                        if (cause19 == null) {
                                            throw th11;
                                        }
                                        throw cause19;
                                    }
                                }
                                try {
                                    objArr3 = new java.lang.Object[1];
                                    try {
                                        objArr3[0] = 47;
                                        clsArr = new java.lang.Class[1];
                                    } catch (java.lang.Throwable th12) {
                                        th = th12;
                                    }
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                }
                                try {
                                    clsArr[0] = java.lang.Integer.TYPE;
                                } catch (java.lang.Throwable th14) {
                                    th = th14;
                                    java.lang.Throwable th15 = th;
                                    cause2 = th15.getCause();
                                    if (cause2 != null) {
                                    }
                                }
                                try {
                                    try {
                                        objArr4 = new java.lang.Object[1];
                                        try {
                                            objArr4[0] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str3, clsArr).invoke(strOLrzqt, objArr3)).intValue() + 1);
                                            clsArr2 = new java.lang.Class[1];
                                        } catch (java.lang.Throwable th16) {
                                            th = th16;
                                        }
                                    } catch (java.lang.Throwable th17) {
                                        th = th17;
                                    }
                                    try {
                                        clsArr2[0] = java.lang.Integer.TYPE;
                                    } catch (java.lang.Throwable th18) {
                                        th = th18;
                                        java.lang.Throwable th19 = th;
                                        cause3 = th19.getCause();
                                        if (cause3 != null) {
                                        }
                                    }
                                    try {
                                        try {
                                            objArr5 = new java.lang.Object[]{externalStorageDirectory, java.lang.String.class.getMethod(str4, clsArr2).invoke(strOLrzqt, objArr4)};
                                        } catch (java.lang.Throwable th20) {
                                            th = th20;
                                        }
                                        try {
                                            clsArr3 = new java.lang.Class[2];
                                        } catch (java.lang.Throwable th21) {
                                            th = th21;
                                            java.lang.Throwable th22 = th;
                                            cause4 = th22.getCause();
                                            if (cause4 == null) {
                                            }
                                        }
                                        try {
                                            clsArr3[0] = java.io.File.class;
                                        } catch (java.lang.Throwable th23) {
                                            th = th23;
                                            java.lang.Throwable th222 = th;
                                            cause4 = th222.getCause();
                                            if (cause4 == null) {
                                            }
                                        }
                                        try {
                                            clsArr3[1] = java.lang.String.class;
                                            java.lang.Object objNewInstance2 = java.io.File.class.getDeclaredConstructor(clsArr3).newInstance(objArr5);
                                            try {
                                                java.net.URL resource = YJ.class.getClassLoader().getResource(strOLrzqt);
                                                if (resource == null) {
                                                    try {
                                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                        a(new char[]{29710, 37387, 47121, 50690, 60456, 2601, 4149, 15905}, 58889, objArr26);
                                                        if (((java.lang.Boolean) java.lang.String.class.getMethod((java.lang.String) objArr26[0], java.lang.CharSequence.class).invoke(strOLrzqt, "!")).booleanValue()) {
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                            a(new char[]{29703, 37049, 48501, 55880, 59103, 909, 10303, 13563, 20991}, 58549, objArr27);
                                                            sb.append((java.lang.String) objArr27[0]);
                                                            sb.append(strOLrzqt);
                                                            java.lang.String path = new java.net.URL(sb.toString()).getPath();
                                                            try {
                                                                try {
                                                                    ZipFile zipFile = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(path, 5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str3, java.lang.String.class).invoke(path, "!/")).intValue())));
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                inputStream = zipFile.getInputStream(zipFile.getEntry((java.lang.String) java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE).invoke(java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE).invoke(strOLrzqt, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str3, java.lang.String.class).invoke(strOLrzqt, "!/")).intValue())), 2)));
                                                                            } catch (java.lang.Throwable th24) {
                                                                                java.lang.Throwable cause20 = th24.getCause();
                                                                                if (cause20 == null) {
                                                                                    throw th24;
                                                                                }
                                                                                throw cause20;
                                                                            }
                                                                        } catch (java.lang.Throwable th25) {
                                                                            java.lang.Throwable cause21 = th25.getCause();
                                                                            if (cause21 == null) {
                                                                                throw th25;
                                                                            }
                                                                            throw cause21;
                                                                        }
                                                                    } catch (java.lang.Throwable th26) {
                                                                        java.lang.Throwable cause22 = th26.getCause();
                                                                        if (cause22 == null) {
                                                                            throw th26;
                                                                        }
                                                                        throw cause22;
                                                                    }
                                                                } catch (java.lang.Throwable th27) {
                                                                    java.lang.Throwable cause23 = th27.getCause();
                                                                    if (cause23 == null) {
                                                                        throw th27;
                                                                    }
                                                                    throw cause23;
                                                                }
                                                            } catch (java.lang.Throwable th28) {
                                                                java.lang.Throwable cause24 = th28.getCause();
                                                                if (cause24 == null) {
                                                                    throw th28;
                                                                }
                                                                throw cause24;
                                                            }
                                                        } else {
                                                            try {
                                                                inputStream = (java.io.InputStream) java.io.FileInputStream.class.getDeclaredConstructor(java.lang.String.class).newInstance(strOLrzqt);
                                                            } catch (java.lang.Throwable th29) {
                                                                java.lang.Throwable cause25 = th29.getCause();
                                                                if (cause25 == null) {
                                                                    throw th29;
                                                                }
                                                                throw cause25;
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th30) {
                                                        java.lang.Throwable cause26 = th30.getCause();
                                                        if (cause26 == null) {
                                                            throw th30;
                                                        }
                                                        throw cause26;
                                                    }
                                                } else {
                                                    java.lang.String path2 = resource.getPath();
                                                    try {
                                                        objArr6 = new java.lang.Object[]{"!/" + strOLrzqt};
                                                    } catch (java.lang.Throwable th31) {
                                                        th = th31;
                                                    }
                                                    try {
                                                        clsArr4 = new java.lang.Class[1];
                                                    } catch (java.lang.Throwable th32) {
                                                        th = th32;
                                                        java.lang.Throwable th33 = th;
                                                        cause5 = th33.getCause();
                                                        if (cause5 != null) {
                                                        }
                                                    }
                                                    try {
                                                        clsArr4[0] = java.lang.String.class;
                                                        try {
                                                            objArr7 = new java.lang.Object[2];
                                                            try {
                                                            } catch (java.lang.Throwable th34) {
                                                                th = th34;
                                                            }
                                                        } catch (java.lang.Throwable th35) {
                                                            th = th35;
                                                        }
                                                        try {
                                                            objArr7[1] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod(str3, clsArr4).invoke(path2, objArr6)).intValue());
                                                        } catch (java.lang.Throwable th36) {
                                                            th = th36;
                                                            java.lang.Throwable th37 = th;
                                                            cause6 = th37.getCause();
                                                            if (cause6 != null) {
                                                            }
                                                        }
                                                        try {
                                                            objArr7[0] = 5;
                                                        } catch (java.lang.Throwable th38) {
                                                            th = th38;
                                                            java.lang.Throwable th372 = th;
                                                            cause6 = th372.getCause();
                                                            if (cause6 != null) {
                                                            }
                                                        }
                                                        try {
                                                            clsArr5 = new java.lang.Class[2];
                                                            clsArr5[0] = java.lang.Integer.TYPE;
                                                        } catch (java.lang.Throwable th39) {
                                                            th = th39;
                                                            java.lang.Throwable th3722 = th;
                                                            cause6 = th3722.getCause();
                                                            if (cause6 != null) {
                                                            }
                                                        }
                                                        try {
                                                            clsArr5[1] = java.lang.Integer.TYPE;
                                                            ZipFile zipFile2 = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str4, clsArr5).invoke(path2, objArr7));
                                                            inputStream = zipFile2.getInputStream(zipFile2.getEntry(strOLrzqt));
                                                        } catch (java.lang.Throwable th40) {
                                                            th = th40;
                                                            java.lang.Throwable th37222 = th;
                                                            cause6 = th37222.getCause();
                                                            if (cause6 != null) {
                                                                throw th37222;
                                                            }
                                                            throw cause6;
                                                        }
                                                    } catch (java.lang.Throwable th41) {
                                                        th = th41;
                                                        java.lang.Throwable th332 = th;
                                                        cause5 = th332.getCause();
                                                        if (cause5 != null) {
                                                            throw th332;
                                                        }
                                                        throw cause5;
                                                    }
                                                }
                                                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                                                try {
                                                    objArr8 = new java.lang.Object[]{bufferedInputStream};
                                                    objEZpvd = YY.EZpvd(1683135861);
                                                    if (objEZpvd == null) {
                                                        try {
                                                            objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new java.lang.Class[]{java.io.InputStream.class});
                                                        } catch (java.lang.Throwable th43) {
                                                            th = th43;
                                                            cause7 = th.getCause();
                                                            if (cause7 != null) {
                                                            }
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th44) {
                                                    th = th44;
                                                }
                                                try {
                                                    java.io.InputStream inputStream2 = (java.io.InputStream) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr8);
                                                    if (bufferedInputStream == inputStream2) {
                                                        inputStream2.close();
                                                        try {
                                                            java.lang.Object objInvoke5 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                            try {
                                                                try {
                                                                    try {
                                                                        java.lang.Object[] objArr28 = {strOLrzqt, YJ.class.getClassLoader()};
                                                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                        a(new char[]{29697, 10739, 53230, 28122}, 24049, objArr29);
                                                                        java.lang.reflect.Method declaredMethod = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr29[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                        declaredMethod.setAccessible(true);
                                                                        declaredMethod.invoke(objInvoke5, objArr28);
                                                                    } catch (java.lang.Exception unused) {
                                                                        if (Build.VERSION.SDK_INT <= 27) {
                                                                            try {
                                                                                java.lang.Object objInvoke6 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                try {
                                                                                    java.lang.Object[] objArr30 = {strOLrzqt, YJ.class.getClassLoader()};
                                                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                                    a(new char[]{29705, 65315, 25187, 54625, 22664, 50092}, 35617, objArr31);
                                                                                    java.lang.reflect.Method declaredMethod2 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr31[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                    declaredMethod2.setAccessible(true);
                                                                                    declaredMethod2.invoke(objInvoke6, objArr30);
                                                                                } catch (java.lang.Throwable th45) {
                                                                                    java.lang.Throwable cause27 = th45.getCause();
                                                                                    if (cause27 == null) {
                                                                                        throw th45;
                                                                                    }
                                                                                    throw cause27;
                                                                                }
                                                                            } catch (java.lang.Throwable th46) {
                                                                                java.lang.Throwable cause28 = th46.getCause();
                                                                                if (cause28 == null) {
                                                                                    throw th46;
                                                                                }
                                                                                throw cause28;
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                objInvoke2 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                java.lang.ClassLoader classLoader = YJ.class.getClassLoader();
                                                                                synchronized (objInvoke2) {
                                                                                }
                                                                            } catch (java.lang.Throwable th47) {
                                                                                java.lang.Throwable cause29 = th47.getCause();
                                                                                if (cause29 == null) {
                                                                                    throw th47;
                                                                                }
                                                                                throw cause29;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (java.lang.NoSuchMethodException unused2) {
                                                                    objInvoke2 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                    java.lang.ClassLoader classLoader2 = YJ.class.getClassLoader();
                                                                    synchronized (objInvoke2) {
                                                                        try {
                                                                            java.lang.Object[] objArr32 = {strOLrzqt, classLoader2};
                                                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                                            b(new int[]{1597003743, -1452583603, 1922063606, 757654269, 516793240, -937980961}, 10, objArr33);
                                                                            java.lang.reflect.Method declaredMethod3 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr33[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                            declaredMethod3.setAccessible(true);
                                                                            java.lang.String str8 = (java.lang.String) declaredMethod3.invoke(objInvoke2, objArr32);
                                                                            if (str8 != null) {
                                                                                throw new java.lang.UnsatisfiedLinkError(str8);
                                                                            }
                                                                        } catch (java.lang.Throwable th48) {
                                                                            java.lang.Throwable cause30 = th48.getCause();
                                                                            if (cause30 == null) {
                                                                                throw th48;
                                                                            }
                                                                            throw cause30;
                                                                        }
                                                                    }
                                                                }
                                                                r11 = 1;
                                                                r12 = 0;
                                                                r13 = 0;
                                                                r152 = 2;
                                                            } catch (java.lang.Throwable th49) {
                                                                java.lang.Throwable cause31 = th49.getCause();
                                                                if (cause31 == null) {
                                                                    throw th49;
                                                                }
                                                                throw cause31;
                                                            }
                                                        } catch (java.lang.Throwable th50) {
                                                            java.lang.Throwable cause32 = th50.getCause();
                                                            if (cause32 == null) {
                                                                throw th50;
                                                            }
                                                            throw cause32;
                                                        }
                                                    } else {
                                                        try {
                                                            objArr9 = new java.lang.Object[]{objNewInstance2};
                                                        } catch (java.lang.Throwable th51) {
                                                            th = th51;
                                                        }
                                                        try {
                                                            clsArr6 = new java.lang.Class[1];
                                                        } catch (java.lang.Throwable th52) {
                                                            th = th52;
                                                            java.lang.Throwable th53 = th;
                                                            cause8 = th53.getCause();
                                                            if (cause8 != null) {
                                                            }
                                                        }
                                                        try {
                                                            clsArr6[0] = java.io.File.class;
                                                            java.io.OutputStream outputStream = (java.io.OutputStream) java.io.FileOutputStream.class.getDeclaredConstructor(clsArr6).newInstance(objArr9);
                                                            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
                                                            byte[] bArr = new byte[1024];
                                                            while (true) {
                                                                int i4 = inputStream2.read(bArr);
                                                                if (i4 < 0) {
                                                                    break;
                                                                } else {
                                                                    bufferedOutputStream.write(bArr, 0, i4);
                                                                }
                                                            }
                                                            bufferedOutputStream.flush();
                                                            try {
                                                            } catch (java.lang.Throwable th54) {
                                                                th = th54;
                                                            }
                                                            try {
                                                                objArr10 = new java.lang.Object[1];
                                                                a(new char[]{29706, 53203, 943, 18362, 39749}, 48091, objArr10);
                                                            } catch (java.lang.Throwable th55) {
                                                                th = th55;
                                                                java.lang.Throwable th56 = th;
                                                                cause9 = th56.getCause();
                                                                if (cause9 == null) {
                                                                }
                                                            }
                                                            try {
                                                            } catch (java.lang.Throwable th57) {
                                                                th = th57;
                                                                java.lang.Throwable th562 = th;
                                                                cause9 = th562.getCause();
                                                                if (cause9 == null) {
                                                                }
                                                            }
                                                            try {
                                                                java.lang.Object objInvoke7 = java.io.FileOutputStream.class.getMethod((java.lang.String) objArr10[0], null).invoke(outputStream, null);
                                                                try {
                                                                } catch (java.lang.Throwable th58) {
                                                                    th = th58;
                                                                }
                                                                try {
                                                                    objArr11 = new java.lang.Object[1];
                                                                    a(new char[]{29726, 58035, 22861, 47099}, 38567, objArr11);
                                                                } catch (java.lang.Throwable th59) {
                                                                    th = th59;
                                                                    java.lang.Throwable th60 = th;
                                                                    cause10 = th60.getCause();
                                                                    if (cause10 == null) {
                                                                    }
                                                                }
                                                                try {
                                                                } catch (java.lang.Throwable th61) {
                                                                    th = th61;
                                                                    java.lang.Throwable th602 = th;
                                                                    cause10 = th602.getCause();
                                                                    if (cause10 == null) {
                                                                    }
                                                                }
                                                                try {
                                                                    java.io.FileDescriptor.class.getMethod((java.lang.String) objArr11[0], null).invoke(objInvoke7, null);
                                                                    try {
                                                                        bufferedOutputStream.close();
                                                                        inputStream2.close();
                                                                        try {
                                                                            java.lang.Object objInvoke8 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                                                        a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr34);
                                                                                        try {
                                                                                            java.lang.Object[] objArr35 = {java.io.File.class.getMethod((java.lang.String) objArr34[0], null).invoke(objNewInstance2, null), YJ.class.getClassLoader()};
                                                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                                            a(new char[]{29697, 10739, 53230, 28122}, 24049, objArr36);
                                                                                            java.lang.reflect.Method declaredMethod4 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr36[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                            declaredMethod4.setAccessible(true);
                                                                                            declaredMethod4.invoke(objInvoke8, objArr35);
                                                                                        } catch (java.lang.Throwable th62) {
                                                                                            java.lang.Throwable cause33 = th62.getCause();
                                                                                            if (cause33 == null) {
                                                                                                throw th62;
                                                                                            }
                                                                                            throw cause33;
                                                                                        }
                                                                                    } catch (java.lang.NoSuchMethodException unused3) {
                                                                                        try {
                                                                                            objInvoke = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                            try {
                                                                                            } catch (java.lang.Throwable th63) {
                                                                                                th = th63;
                                                                                            }
                                                                                            try {
                                                                                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                                                a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr37);
                                                                                            } catch (java.lang.Throwable th64) {
                                                                                                th = th64;
                                                                                                java.lang.Throwable th65 = th;
                                                                                                cause11 = th65.getCause();
                                                                                                if (cause11 == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                            } catch (java.lang.Throwable th66) {
                                                                                                th = th66;
                                                                                                java.lang.Throwable th652 = th;
                                                                                                cause11 = th652.getCause();
                                                                                                if (cause11 == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                java.lang.Object objInvoke9 = java.io.File.class.getMethod((java.lang.String) objArr37[0], null).invoke(objNewInstance2, null);
                                                                                                java.lang.ClassLoader classLoader3 = YJ.class.getClassLoader();
                                                                                                try {
                                                                                                    synchronized (objInvoke) {
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th67) {
                                                                                                    th = th67;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th68) {
                                                                                                th = th68;
                                                                                                java.lang.Throwable th6522 = th;
                                                                                                cause11 = th6522.getCause();
                                                                                                if (cause11 == null) {
                                                                                                    throw th6522;
                                                                                                }
                                                                                                throw cause11;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th69) {
                                                                                            java.lang.Throwable cause34 = th69.getCause();
                                                                                            if (cause34 == null) {
                                                                                                throw th69;
                                                                                            }
                                                                                            throw cause34;
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.Exception unused4) {
                                                                                    if (Build.VERSION.SDK_INT <= 27) {
                                                                                        try {
                                                                                            java.lang.Object objInvoke10 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                            try {
                                                                                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                                                                a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr38);
                                                                                                try {
                                                                                                    java.lang.Object[] objArr39 = {java.io.File.class.getMethod((java.lang.String) objArr38[0], null).invoke(objNewInstance2, null), YJ.class.getClassLoader()};
                                                                                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                                                    a(new char[]{29705, 65315, 25187, 54625, 22664, 50092}, 35617, objArr40);
                                                                                                    java.lang.reflect.Method declaredMethod5 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr40[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                                    declaredMethod5.setAccessible(true);
                                                                                                    declaredMethod5.invoke(objInvoke10, objArr39);
                                                                                                } catch (java.lang.Throwable th70) {
                                                                                                    java.lang.Throwable cause35 = th70.getCause();
                                                                                                    if (cause35 == null) {
                                                                                                        throw th70;
                                                                                                    }
                                                                                                    throw cause35;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th71) {
                                                                                                java.lang.Throwable cause36 = th71.getCause();
                                                                                                if (cause36 == null) {
                                                                                                    throw th71;
                                                                                                }
                                                                                                throw cause36;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th72) {
                                                                                            java.lang.Throwable cause37 = th72.getCause();
                                                                                            if (cause37 == null) {
                                                                                                throw th72;
                                                                                            }
                                                                                            throw cause37;
                                                                                        }
                                                                                    }
                                                                                    objInvoke = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                    java.lang.Object[] objArr372 = new java.lang.Object[1];
                                                                                    a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr372);
                                                                                    java.lang.Object objInvoke92 = java.io.File.class.getMethod((java.lang.String) objArr372[0], null).invoke(objNewInstance2, null);
                                                                                    java.lang.ClassLoader classLoader32 = YJ.class.getClassLoader();
                                                                                    synchronized (objInvoke) {
                                                                                        try {
                                                                                            objArr12 = new java.lang.Object[]{objInvoke92, classLoader32};
                                                                                        } catch (java.lang.Throwable th73) {
                                                                                            th = th73;
                                                                                        }
                                                                                        try {
                                                                                        } catch (java.lang.Throwable th74) {
                                                                                            th = th74;
                                                                                            java.lang.Throwable th75 = th;
                                                                                            cause12 = th75.getCause();
                                                                                            if (cause12 != null) {
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            objArr13 = new java.lang.Object[1];
                                                                                            b(new int[]{1597003743, -1452583603, 1922063606, 757654269, 516793240, -937980961}, 10, objArr13);
                                                                                        } catch (java.lang.Throwable th76) {
                                                                                            th = th76;
                                                                                            java.lang.Throwable th752 = th;
                                                                                            cause12 = th752.getCause();
                                                                                            if (cause12 != null) {
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            java.lang.String str9 = (java.lang.String) objArr13[0];
                                                                                            r152 = 2;
                                                                                            try {
                                                                                                java.lang.Class[] clsArr9 = new java.lang.Class[2];
                                                                                                clsArr9[0] = java.lang.String.class;
                                                                                                try {
                                                                                                    clsArr9[1] = java.lang.ClassLoader.class;
                                                                                                    java.lang.reflect.Method declaredMethod6 = java.lang.Runtime.class.getDeclaredMethod(str9, clsArr9);
                                                                                                    declaredMethod6.setAccessible(true);
                                                                                                    try {
                                                                                                        java.lang.String str10 = (java.lang.String) declaredMethod6.invoke(objInvoke, objArr12);
                                                                                                        if (str10 != null) {
                                                                                                            throw new java.lang.UnsatisfiedLinkError(str10);
                                                                                                        }
                                                                                                        try {
                                                                                                        } catch (java.lang.Throwable th77) {
                                                                                                            th = th77;
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th78) {
                                                                                                        th = th78;
                                                                                                        java.lang.Throwable th7522 = th;
                                                                                                        cause12 = th7522.getCause();
                                                                                                        if (cause12 != null) {
                                                                                                            throw th7522;
                                                                                                        }
                                                                                                        throw cause12;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th79) {
                                                                                                    th = th79;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th80) {
                                                                                                th = th80;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th81) {
                                                                                            th = th81;
                                                                                            java.lang.Throwable th75222 = th;
                                                                                            cause12 = th75222.getCause();
                                                                                            if (cause12 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    r11 = 1;
                                                                                    r11 = 1;
                                                                                    r11 = 1;
                                                                                    r11 = 1;
                                                                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                                    a(new char[]{29705, 27301, 18779, 10255, 3757, 60777}, 7853, objArr41);
                                                                                    r13 = 0;
                                                                                    r13 = 0;
                                                                                    r13 = 0;
                                                                                    java.lang.String str11 = (java.lang.String) objArr41[0];
                                                                                    r12 = 0;
                                                                                    r12 = 0;
                                                                                    ((java.lang.Boolean) java.io.File.class.getMethod(str11, null).invoke(objNewInstance2, null)).booleanValue();
                                                                                    i3++;
                                                                                    str2 = str;
                                                                                    i2 = r11;
                                                                                    r3 = r13;
                                                                                    r132 = r12;
                                                                                    r122 = r152;
                                                                                }
                                                                                r152 = 2;
                                                                                try {
                                                                                    r11 = 1;
                                                                                    r11 = 1;
                                                                                    r11 = 1;
                                                                                    r11 = 1;
                                                                                } catch (java.lang.Throwable th82) {
                                                                                    th = th82;
                                                                                    r11 = 1;
                                                                                }
                                                                                try {
                                                                                    java.lang.Object[] objArr412 = new java.lang.Object[1];
                                                                                    a(new char[]{29705, 27301, 18779, 10255, 3757, 60777}, 7853, objArr412);
                                                                                    r13 = 0;
                                                                                    r13 = 0;
                                                                                    r13 = 0;
                                                                                    try {
                                                                                        java.lang.String str112 = (java.lang.String) objArr412[0];
                                                                                        r12 = 0;
                                                                                        r12 = 0;
                                                                                    } catch (java.lang.Throwable th83) {
                                                                                        th = th83;
                                                                                        r12 = 0;
                                                                                    }
                                                                                } catch (java.lang.Throwable th84) {
                                                                                    th = th84;
                                                                                    r12 = 0;
                                                                                    r13 = 0;
                                                                                    java.lang.Throwable th85 = th;
                                                                                    try {
                                                                                        cause13 = th85.getCause();
                                                                                        if (cause13 != null) {
                                                                                        }
                                                                                    } catch (java.lang.Exception unused5) {
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    ((java.lang.Boolean) java.io.File.class.getMethod(str112, null).invoke(objNewInstance2, null)).booleanValue();
                                                                                } catch (java.lang.Throwable th86) {
                                                                                    th = th86;
                                                                                    java.lang.Throwable th852 = th;
                                                                                    cause13 = th852.getCause();
                                                                                    if (cause13 != null) {
                                                                                        throw th852;
                                                                                    }
                                                                                    throw cause13;
                                                                                }
                                                                            } catch (java.lang.Throwable th87) {
                                                                                java.lang.Throwable cause38 = th87.getCause();
                                                                                if (cause38 == null) {
                                                                                    throw th87;
                                                                                }
                                                                                throw cause38;
                                                                            }
                                                                        } catch (java.lang.Throwable th88) {
                                                                            java.lang.Throwable cause39 = th88.getCause();
                                                                            if (cause39 == null) {
                                                                                throw th88;
                                                                            }
                                                                            throw cause39;
                                                                        }
                                                                    } catch (java.lang.Exception e5) {
                                                                        e = e5;
                                                                        declaredConstructor = 0;
                                                                        NewInstance = 1;
                                                                        r132 = 0;
                                                                        r15 = 2;
                                                                        exc = e;
                                                                        r11 = NewInstance;
                                                                        r12 = declaredConstructor;
                                                                        r13 = r132;
                                                                        r152 = r15;
                                                                        if (i3 >= length) {
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th89) {
                                                                    th = th89;
                                                                    java.lang.Throwable th6022 = th;
                                                                    cause10 = th6022.getCause();
                                                                    if (cause10 == null) {
                                                                        throw th6022;
                                                                    }
                                                                    throw cause10;
                                                                }
                                                            } catch (java.lang.Throwable th90) {
                                                                th = th90;
                                                                java.lang.Throwable th5622 = th;
                                                                cause9 = th5622.getCause();
                                                                if (cause9 == null) {
                                                                    throw th5622;
                                                                }
                                                                throw cause9;
                                                            }
                                                        } catch (java.lang.Throwable th91) {
                                                            th = th91;
                                                            java.lang.Throwable th532 = th;
                                                            cause8 = th532.getCause();
                                                            if (cause8 != null) {
                                                                throw th532;
                                                            }
                                                            throw cause8;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th92) {
                                                    th = th92;
                                                    th = th;
                                                    cause7 = th.getCause();
                                                    if (cause7 != null) {
                                                        throw th;
                                                    }
                                                    throw cause7;
                                                }
                                            } catch (java.lang.Exception e6) {
                                                e = e6;
                                                NewInstance = 1;
                                                declaredConstructor = 0;
                                            }
                                        } catch (java.lang.Throwable th93) {
                                            th = th93;
                                            java.lang.Throwable th2222 = th;
                                            cause4 = th2222.getCause();
                                            if (cause4 == null) {
                                                throw th2222;
                                            }
                                            throw cause4;
                                        }
                                    } catch (java.lang.Throwable th94) {
                                        th = th94;
                                        java.lang.Throwable th192 = th;
                                        cause3 = th192.getCause();
                                        if (cause3 != null) {
                                            throw th192;
                                        }
                                        throw cause3;
                                    }
                                } catch (java.lang.Throwable th95) {
                                    th = th95;
                                    java.lang.Throwable th152 = th;
                                    cause2 = th152.getCause();
                                    if (cause2 != null) {
                                        throw th152;
                                    }
                                    throw cause2;
                                }
                                exc = e4;
                                i = 1;
                            } catch (java.lang.Throwable th96) {
                                java.lang.Throwable cause40 = th96.getCause();
                                if (cause40 == null) {
                                    throw th96;
                                }
                                throw cause40;
                            }
                        } catch (java.lang.Throwable th97) {
                            java.lang.Throwable cause41 = th97.getCause();
                            if (cause41 == null) {
                                throw th97;
                            }
                            throw cause41;
                        }
                    } catch (java.lang.Exception e7) {
                        exc = e7;
                        i = i2;
                    }
                    r12 = 0;
                    r13 = 0;
                    r152 = 2;
                    r11 = i;
                    if (i3 >= length) {
                        throw exc;
                    }
                }
                i3++;
                str2 = str;
                i2 = r11;
                r3 = r13;
                r132 = r12;
                r122 = r152;
            }
        } catch (java.lang.Throwable th98) {
            java.lang.Throwable cause42 = th98.getCause();
            if (cause42 == null) {
                throw th98;
            }
            throw cause42;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:309:0x075d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:316:0x0782 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:480:0x08e8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:498:0x06fb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:515:0x05f6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:556:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:642:0x08fc */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(11:562|242|243|(2:525|244)|(4:(7:515|245|566|246|247|550|248)|600|314|643)|249|310|311|604|312|313) */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0784, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0788, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07b4 A[Catch: all -> 0x07b6, TryCatch #14 {all -> 0x07b6, blocks: (B:331:0x0798, B:332:0x079d, B:348:0x07b8, B:342:0x07ad, B:344:0x07b4, B:345:0x07b5), top: B:524:0x072a }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07b5 A[Catch: all -> 0x07b6, TryCatch #14 {all -> 0x07b6, blocks: (B:331:0x0798, B:332:0x079d, B:348:0x07b8, B:342:0x07ad, B:344:0x07b4, B:345:0x07b5), top: B:524:0x072a }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0851 A[Catch: Exception -> 0x08e8, TryCatch #17 {Exception -> 0x08e8, blocks: (B:394:0x0820, B:396:0x0826, B:397:0x0827, B:349:0x07b9, B:354:0x07c1, B:356:0x07ca, B:357:0x07cb, B:359:0x07cd, B:361:0x07d8, B:362:0x07d9, B:369:0x07e5, B:371:0x07ee, B:372:0x07ef, B:380:0x07fa, B:382:0x0803, B:383:0x0804, B:388:0x080e, B:390:0x0817, B:391:0x0818, B:402:0x0831, B:404:0x083a, B:405:0x083b, B:413:0x0848, B:415:0x0851, B:416:0x0852, B:423:0x085f, B:425:0x0868, B:426:0x0869, B:431:0x0873, B:433:0x087c, B:434:0x087d, B:445:0x088c, B:447:0x0895, B:448:0x0896, B:456:0x08a4, B:458:0x08ad, B:459:0x08ae, B:471:0x08cf, B:473:0x08d6, B:474:0x08d7, B:476:0x08d9, B:478:0x08e6, B:479:0x08e7, B:292:0x06fb, B:13:0x0083), top: B:529:0x06fb, inners: #28, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0852 A[Catch: Exception -> 0x08e8, TryCatch #17 {Exception -> 0x08e8, blocks: (B:394:0x0820, B:396:0x0826, B:397:0x0827, B:349:0x07b9, B:354:0x07c1, B:356:0x07ca, B:357:0x07cb, B:359:0x07cd, B:361:0x07d8, B:362:0x07d9, B:369:0x07e5, B:371:0x07ee, B:372:0x07ef, B:380:0x07fa, B:382:0x0803, B:383:0x0804, B:388:0x080e, B:390:0x0817, B:391:0x0818, B:402:0x0831, B:404:0x083a, B:405:0x083b, B:413:0x0848, B:415:0x0851, B:416:0x0852, B:423:0x085f, B:425:0x0868, B:426:0x0869, B:431:0x0873, B:433:0x087c, B:434:0x087d, B:445:0x088c, B:447:0x0895, B:448:0x0896, B:456:0x08a4, B:458:0x08ad, B:459:0x08ae, B:471:0x08cf, B:473:0x08d6, B:474:0x08d7, B:476:0x08d9, B:478:0x08e6, B:479:0x08e7, B:292:0x06fb, B:13:0x0083), top: B:529:0x06fb, inners: #28, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0895 A[Catch: Exception -> 0x08e8, TryCatch #17 {Exception -> 0x08e8, blocks: (B:394:0x0820, B:396:0x0826, B:397:0x0827, B:349:0x07b9, B:354:0x07c1, B:356:0x07ca, B:357:0x07cb, B:359:0x07cd, B:361:0x07d8, B:362:0x07d9, B:369:0x07e5, B:371:0x07ee, B:372:0x07ef, B:380:0x07fa, B:382:0x0803, B:383:0x0804, B:388:0x080e, B:390:0x0817, B:391:0x0818, B:402:0x0831, B:404:0x083a, B:405:0x083b, B:413:0x0848, B:415:0x0851, B:416:0x0852, B:423:0x085f, B:425:0x0868, B:426:0x0869, B:431:0x0873, B:433:0x087c, B:434:0x087d, B:445:0x088c, B:447:0x0895, B:448:0x0896, B:456:0x08a4, B:458:0x08ad, B:459:0x08ae, B:471:0x08cf, B:473:0x08d6, B:474:0x08d7, B:476:0x08d9, B:478:0x08e6, B:479:0x08e7, B:292:0x06fb, B:13:0x0083), top: B:529:0x06fb, inners: #28, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0896 A[Catch: Exception -> 0x08e8, TryCatch #17 {Exception -> 0x08e8, blocks: (B:394:0x0820, B:396:0x0826, B:397:0x0827, B:349:0x07b9, B:354:0x07c1, B:356:0x07ca, B:357:0x07cb, B:359:0x07cd, B:361:0x07d8, B:362:0x07d9, B:369:0x07e5, B:371:0x07ee, B:372:0x07ef, B:380:0x07fa, B:382:0x0803, B:383:0x0804, B:388:0x080e, B:390:0x0817, B:391:0x0818, B:402:0x0831, B:404:0x083a, B:405:0x083b, B:413:0x0848, B:415:0x0851, B:416:0x0852, B:423:0x085f, B:425:0x0868, B:426:0x0869, B:431:0x0873, B:433:0x087c, B:434:0x087d, B:445:0x088c, B:447:0x0895, B:448:0x0896, B:456:0x08a4, B:458:0x08ad, B:459:0x08ae, B:471:0x08cf, B:473:0x08d6, B:474:0x08d7, B:476:0x08d9, B:478:0x08e6, B:479:0x08e7, B:292:0x06fb, B:13:0x0083), top: B:529:0x06fb, inners: #28, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08ad A[Catch: Exception -> 0x08e8, TryCatch #17 {Exception -> 0x08e8, blocks: (B:394:0x0820, B:396:0x0826, B:397:0x0827, B:349:0x07b9, B:354:0x07c1, B:356:0x07ca, B:357:0x07cb, B:359:0x07cd, B:361:0x07d8, B:362:0x07d9, B:369:0x07e5, B:371:0x07ee, B:372:0x07ef, B:380:0x07fa, B:382:0x0803, B:383:0x0804, B:388:0x080e, B:390:0x0817, B:391:0x0818, B:402:0x0831, B:404:0x083a, B:405:0x083b, B:413:0x0848, B:415:0x0851, B:416:0x0852, B:423:0x085f, B:425:0x0868, B:426:0x0869, B:431:0x0873, B:433:0x087c, B:434:0x087d, B:445:0x088c, B:447:0x0895, B:448:0x0896, B:456:0x08a4, B:458:0x08ad, B:459:0x08ae, B:471:0x08cf, B:473:0x08d6, B:474:0x08d7, B:476:0x08d9, B:478:0x08e6, B:479:0x08e7, B:292:0x06fb, B:13:0x0083), top: B:529:0x06fb, inners: #28, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x08ae A[Catch: Exception -> 0x08e8, TryCatch #17 {Exception -> 0x08e8, blocks: (B:394:0x0820, B:396:0x0826, B:397:0x0827, B:349:0x07b9, B:354:0x07c1, B:356:0x07ca, B:357:0x07cb, B:359:0x07cd, B:361:0x07d8, B:362:0x07d9, B:369:0x07e5, B:371:0x07ee, B:372:0x07ef, B:380:0x07fa, B:382:0x0803, B:383:0x0804, B:388:0x080e, B:390:0x0817, B:391:0x0818, B:402:0x0831, B:404:0x083a, B:405:0x083b, B:413:0x0848, B:415:0x0851, B:416:0x0852, B:423:0x085f, B:425:0x0868, B:426:0x0869, B:431:0x0873, B:433:0x087c, B:434:0x087d, B:445:0x088c, B:447:0x0895, B:448:0x0896, B:456:0x08a4, B:458:0x08ad, B:459:0x08ae, B:471:0x08cf, B:473:0x08d6, B:474:0x08d7, B:476:0x08d9, B:478:0x08e6, B:479:0x08e7, B:292:0x06fb, B:13:0x0083), top: B:529:0x06fb, inners: #28, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x072b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x052f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0908 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v101 */
    /* JADX WARN: Type inference failed for: r13v102 */
    /* JADX WARN: Type inference failed for: r13v103 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v105 */
    /* JADX WARN: Type inference failed for: r13v106 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v66, types: [java.lang.Class<java.lang.ClassLoader>] */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v74, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v80 */
    /* JADX WARN: Type inference failed for: r13v99, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v57, types: [java.lang.Class<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v6, types: [char[]] */
    /* JADX WARN: Type inference failed for: r14v62, types: [java.lang.Class<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Class[]] */
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
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v103 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v111 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v87, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v96, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.reflect.Method] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
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
        ?? r7;
        java.lang.Object[] objArr;
        boolean zBooleanValue;
        ?? r192;
        ?? r193;
        char c;
        char c2;
        ?? externalStorageDirectory;
        ?? r194;
        java.lang.Throwable cause;
        java.lang.String str2;
        java.lang.Throwable cause2;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        java.lang.Object[] objArr5;
        java.lang.Class[] clsArr;
        java.lang.Throwable cause3;
        java.lang.Object[] objArr6;
        java.lang.Object[] objArr7;
        java.lang.Object[] objArr8;
        java.io.InputStream inputStream;
        java.lang.Throwable th;
        java.lang.Object[] objArr9;
        java.lang.Class[] clsArr2;
        java.lang.Object[] objArr10;
        java.lang.Object[] objArr11;
        java.lang.Object objInvoke;
        java.lang.Throwable cause4;
        java.lang.Object[] objArr12;
        java.lang.Object objInvoke2;
        java.lang.String str3 = str;
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(new char[]{29726, 53797, 14453, 34473, 60653, 19246, 37226, 65448, 17890}, 42557, objArr13);
        ?? r2 = 0;
        java.lang.String str4 = (java.lang.String) objArr13[0];
        ?? r5 = 6;
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        ?? r8 = 10;
        b(new int[]{-1129247088, 190326642, 2051367672, 19797919, 740543497, -522509098}, 10, objArr14);
        java.lang.String str5 = (java.lang.String) objArr14[0];
        ?? r72 = 5;
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a(new char[]{29752, 41188, 56721, 2775, 10017}, 54493, objArr15);
        try {
            java.lang.String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) java.lang.String.class.getMethod("getBytes", java.lang.String.class).invoke(str3, (java.lang.String) objArr15[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new java.lang.String[0];
            }
            int length = strArrAEQbTJ.length;
            java.lang.String[] strArr = new java.lang.String[length + 1];
            java.lang.System.arraycopy(strArrAEQbTJ, 0, strArr, 0, length);
            strArr[length] = str3;
            int i = 0;
            ?? r122 = strArr;
            while (i <= length) {
                ?? r132 = r122[i];
                try {
                    declaredConstructor = new char[]{29762, 23710, 9506, 3548, 54864, 48817, 34691, 26669, 12449, 6467, 57764, 51827, 37654, 31659, 19457, 5339, 64886, 50706, 44765, 30511, 24512, 8290, 2299, 53657, 47665};
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    try {
                        a(declaredConstructor, 10391, objArr16);
                        NewInstance = (java.lang.String) objArr16[r2];
                        try {
                            java.lang.Class[] clsArr3 = new java.lang.Class[1];
                            clsArr3[r2] = java.lang.String.class;
                            declaredConstructor = java.io.File.class.getDeclaredConstructor(clsArr3);
                            NewInstance = declaredConstructor.newInstance(NewInstance);
                            try {
                                objArr = new java.lang.Object[1];
                                b(new int[]{-834340365, 1617530297, -174791193, -2123559933}, 8, objArr);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                            try {
                                zBooleanValue = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr[0], null).invoke(NewInstance, null)).booleanValue();
                                externalStorageDirectory = NewInstance;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                java.lang.Throwable th4 = th;
                                java.lang.Throwable cause5 = th4.getCause();
                                if (cause5 == null) {
                                    throw th4;
                                }
                                throw cause5;
                            }
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause6 = th5.getCause();
                            if (cause6 == null) {
                                throw th5;
                            }
                            throw cause6;
                        }
                    } catch (java.lang.Exception e) {
                        e = e;
                        r132 = r2;
                        NewInstance = r5;
                        declaredConstructor = r8;
                        r19 = r122;
                        r122 = 5;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    r132 = r2;
                    declaredConstructor = r8;
                    r19 = r122;
                    r122 = r72;
                    NewInstance = r5;
                }
                if (zBooleanValue) {
                    java.lang.ClassLoader classLoader = YJ.class.getClassLoader();
                    java.lang.Object[] objArr17 = {i < length ? str3 : r132};
                    byte b = (byte) (EZpvd[4] - 1);
                    byte b2 = b;
                    r19 = r122;
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    c(b, b2, b2, objArr18);
                    java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr18[0], java.lang.String.class);
                    declaredMethod.setAccessible(true);
                    str2 = (java.lang.String) declaredMethod.invoke(classLoader, objArr17);
                    if (str2 != null) {
                    }
                    exc = e;
                    r192 = r19;
                    c2 = 6;
                    c = 5;
                    r193 = r192;
                    r13 = 0;
                    r14 = 10;
                    r7 = c2;
                    r12 = c;
                    r19 = r193;
                    if (i >= length) {
                    }
                } else {
                    try {
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        b(new int[]{1994940439, -214170090, 1052960537, -520092750, 299630434, -47354770, -241390786, 1764345395}, 14, objArr19);
                        java.lang.String str6 = (java.lang.String) objArr19[0];
                        try {
                            java.lang.Object objNewInstance = java.io.File.class.getDeclaredConstructor(java.lang.String.class).newInstance(java.lang.System.getProperty(str6, str6));
                            try {
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                b(new int[]{-834340365, 1617530297, -174791193, -2123559933}, 8, objArr20);
                                boolean zBooleanValue2 = ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr20[0], null).invoke(objNewInstance, null)).booleanValue();
                                externalStorageDirectory = objNewInstance;
                                if (!zBooleanValue2) {
                                    externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
                                }
                                try {
                                    java.lang.ClassLoader classLoader2 = YJ.class.getClassLoader();
                                    try {
                                        java.lang.Object[] objArr172 = {i < length ? str3 : r132};
                                        byte b3 = (byte) (EZpvd[4] - 1);
                                        byte b22 = b3;
                                        r19 = r122;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                    }
                                    try {
                                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                                        c(b3, b22, b22, objArr182);
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        java.lang.Throwable th8 = th;
                                        cause = th8.getCause();
                                        if (cause != null) {
                                        }
                                    }
                                    try {
                                        java.lang.reflect.Method declaredMethod2 = java.lang.ClassLoader.class.getDeclaredMethod((java.lang.String) objArr182[0], java.lang.String.class);
                                        declaredMethod2.setAccessible(true);
                                        str2 = (java.lang.String) declaredMethod2.invoke(classLoader2, objArr172);
                                        if (str2 != null) {
                                            try {
                                                java.lang.Object objInvoke3 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                ?? r133 = r132;
                                                if (i >= length) {
                                                    r133 = str;
                                                }
                                                try {
                                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                    a(new char[]{29697, 57959, 22726, 46886, 11701, 39933, 62033, 26844, 50980, 15762, 44006}, 38501, objArr21);
                                                    java.lang.Runtime.class.getMethod((java.lang.String) objArr21[0], java.lang.String.class).invoke(objInvoke3, r133);
                                                    return;
                                                } catch (java.lang.Throwable th9) {
                                                    java.lang.Throwable cause7 = th9.getCause();
                                                    if (cause7 == null) {
                                                        throw th9;
                                                    }
                                                    throw cause7;
                                                }
                                            } catch (java.lang.Throwable th10) {
                                                java.lang.Throwable cause8 = th10.getCause();
                                                if (cause8 == null) {
                                                    throw th10;
                                                }
                                                throw cause8;
                                            }
                                        }
                                        try {
                                            objArr2 = new java.lang.Object[1];
                                            try {
                                                objArr2[0] = 47;
                                            } catch (java.lang.Throwable th11) {
                                                th = th11;
                                            }
                                        } catch (java.lang.Throwable th12) {
                                            th = th12;
                                        }
                                        try {
                                            objArr3 = new java.lang.Object[1];
                                            b(new int[]{381996839, -426653774, 1809445851, 888153213, 230711139, -917073691}, 11, objArr3);
                                        } catch (java.lang.Throwable th13) {
                                            th = th13;
                                            java.lang.Throwable th14 = th;
                                            cause2 = th14.getCause();
                                            if (cause2 != null) {
                                            }
                                        }
                                        try {
                                            try {
                                                objArr4 = new java.lang.Object[1];
                                            } catch (java.lang.Throwable th15) {
                                                th = th15;
                                            }
                                            try {
                                                objArr4[0] = java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE).invoke(str2, objArr2)).intValue() + 1);
                                                try {
                                                    objArr5 = new java.lang.Object[]{externalStorageDirectory, java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE).invoke(str2, objArr4)};
                                                    clsArr = new java.lang.Class[2];
                                                } catch (java.lang.Throwable th16) {
                                                    th = th16;
                                                }
                                                try {
                                                    clsArr[0] = java.io.File.class;
                                                    clsArr[1] = java.lang.String.class;
                                                    java.lang.Object objNewInstance2 = java.io.File.class.getDeclaredConstructor(clsArr).newInstance(objArr5);
                                                    try {
                                                        java.net.URL resource = YJ.class.getClassLoader().getResource(str2);
                                                        if (resource == null) {
                                                            try {
                                                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                                a(new char[]{29710, 37387, 47121, 50690, 60456, 2601, 4149, 15905}, 58889, objArr22);
                                                                if (((java.lang.Boolean) java.lang.String.class.getMethod((java.lang.String) objArr22[0], java.lang.CharSequence.class).invoke(str2, "!")).booleanValue()) {
                                                                    try {
                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                        a(new char[]{29703, 37049, 48501, 55880, 59103, 909, 10303, 13563, 20991}, 58549, objArr23);
                                                                        sb.append((java.lang.String) objArr23[0]);
                                                                        sb.append(str2);
                                                                        java.lang.String path = new java.net.URL(sb.toString()).getPath();
                                                                        try {
                                                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                                            b(new int[]{381996839, -426653774, 1809445851, 888153213, 230711139, -917073691}, 11, objArr24);
                                                                            try {
                                                                                ZipFile zipFile = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(path, 5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr24[0], java.lang.String.class).invoke(path, "!/")).intValue())));
                                                                                try {
                                                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                                                    b(new int[]{381996839, -426653774, 1809445851, 888153213, 230711139, -917073691}, 11, objArr25);
                                                                                    try {
                                                                                        try {
                                                                                            inputStream = zipFile.getInputStream(zipFile.getEntry((java.lang.String) java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE).invoke(java.lang.String.class.getMethod(str4, java.lang.Integer.TYPE).invoke(str2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr25[0], java.lang.String.class).invoke(str2, "!/")).intValue())), 2)));
                                                                                        } catch (java.lang.Throwable th17) {
                                                                                            java.lang.Throwable cause9 = th17.getCause();
                                                                                            if (cause9 == null) {
                                                                                                throw th17;
                                                                                            }
                                                                                            throw cause9;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th18) {
                                                                                        java.lang.Throwable cause10 = th18.getCause();
                                                                                        if (cause10 == null) {
                                                                                            throw th18;
                                                                                        }
                                                                                        throw cause10;
                                                                                    }
                                                                                } catch (java.lang.Throwable th19) {
                                                                                    java.lang.Throwable cause11 = th19.getCause();
                                                                                    if (cause11 == null) {
                                                                                        throw th19;
                                                                                    }
                                                                                    throw cause11;
                                                                                }
                                                                            } catch (java.lang.Throwable th20) {
                                                                                java.lang.Throwable cause12 = th20.getCause();
                                                                                if (cause12 == null) {
                                                                                    throw th20;
                                                                                }
                                                                                throw cause12;
                                                                            }
                                                                        } catch (java.lang.Throwable th21) {
                                                                            java.lang.Throwable cause13 = th21.getCause();
                                                                            if (cause13 == null) {
                                                                                throw th21;
                                                                            }
                                                                            throw cause13;
                                                                        }
                                                                    } catch (java.lang.Exception e3) {
                                                                        exc = e3;
                                                                        r192 = r19;
                                                                        c2 = 6;
                                                                        c = 5;
                                                                        r193 = r192;
                                                                    }
                                                                } else {
                                                                    try {
                                                                        inputStream = (java.io.InputStream) java.io.FileInputStream.class.getDeclaredConstructor(java.lang.String.class).newInstance(str2);
                                                                    } catch (java.lang.Throwable th22) {
                                                                        java.lang.Throwable cause14 = th22.getCause();
                                                                        if (cause14 == null) {
                                                                            throw th22;
                                                                        }
                                                                        throw cause14;
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th23) {
                                                                java.lang.Throwable cause15 = th23.getCause();
                                                                if (cause15 == null) {
                                                                    throw th23;
                                                                }
                                                                throw cause15;
                                                            }
                                                        } else {
                                                            java.lang.String path2 = resource.getPath();
                                                            try {
                                                                objArr6 = new java.lang.Object[]{"!/" + str2};
                                                            } catch (java.lang.Throwable th24) {
                                                                th = th24;
                                                            }
                                                            try {
                                                                objArr7 = new java.lang.Object[1];
                                                                b(new int[]{381996839, -426653774, 1809445851, 888153213, 230711139, -917073691}, 11, objArr7);
                                                            } catch (java.lang.Throwable th25) {
                                                                th = th25;
                                                                java.lang.Throwable th26 = th;
                                                                cause3 = th26.getCause();
                                                                if (cause3 != null) {
                                                                }
                                                            }
                                                            try {
                                                                int iIntValue = ((java.lang.Integer) java.lang.String.class.getMethod((java.lang.String) objArr7[0], java.lang.String.class).invoke(path2, objArr6)).intValue();
                                                                try {
                                                                    objArr8 = new java.lang.Object[2];
                                                                    objArr8[1] = java.lang.Integer.valueOf(iIntValue);
                                                                } catch (java.lang.Throwable th27) {
                                                                    th = th27;
                                                                }
                                                                try {
                                                                    objArr8[0] = 5;
                                                                    java.lang.Class[] clsArr4 = new java.lang.Class[2];
                                                                    clsArr4[0] = java.lang.Integer.TYPE;
                                                                    clsArr4[1] = java.lang.Integer.TYPE;
                                                                    ZipFile zipFile2 = new ZipFile((java.lang.String) java.lang.String.class.getMethod(str4, clsArr4).invoke(path2, objArr8));
                                                                    inputStream = zipFile2.getInputStream(zipFile2.getEntry(str2));
                                                                } catch (java.lang.Throwable th28) {
                                                                    th = th28;
                                                                    java.lang.Throwable th29 = th;
                                                                    java.lang.Throwable cause16 = th29.getCause();
                                                                    if (cause16 == null) {
                                                                        throw th29;
                                                                    }
                                                                    throw cause16;
                                                                }
                                                            } catch (java.lang.Throwable th30) {
                                                                th = th30;
                                                                java.lang.Throwable th262 = th;
                                                                cause3 = th262.getCause();
                                                                if (cause3 != null) {
                                                                    throw th262;
                                                                }
                                                                throw cause3;
                                                            }
                                                        }
                                                        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                                                        try {
                                                            java.lang.Object[] objArr26 = {bufferedInputStream};
                                                            java.lang.Object objEZpvd = YY.EZpvd(1683135861);
                                                            if (objEZpvd == null) {
                                                                try {
                                                                    objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new java.lang.Class[]{java.io.InputStream.class});
                                                                } catch (java.lang.Throwable th31) {
                                                                    th = th31;
                                                                    java.lang.Throwable cause17 = th.getCause();
                                                                    if (cause17 == null) {
                                                                        throw th;
                                                                    }
                                                                    throw cause17;
                                                                }
                                                            }
                                                            java.io.InputStream inputStream2 = (java.io.InputStream) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr26);
                                                            if (bufferedInputStream == inputStream2) {
                                                                inputStream2.close();
                                                                try {
                                                                    java.lang.Object objInvoke4 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                java.lang.Object[] objArr27 = {str2, YJ.class.getClassLoader()};
                                                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                                a(new char[]{29697, 10739, 53230, 28122}, 24049, objArr28);
                                                                                java.lang.reflect.Method declaredMethod3 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr28[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                declaredMethod3.setAccessible(true);
                                                                                declaredMethod3.invoke(objInvoke4, objArr27);
                                                                            } catch (java.lang.Exception unused) {
                                                                                if (Build.VERSION.SDK_INT <= 27) {
                                                                                    try {
                                                                                        java.lang.Object objInvoke5 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                        try {
                                                                                            java.lang.Object[] objArr29 = {str2, YJ.class.getClassLoader()};
                                                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                                            a(new char[]{29705, 65315, 25187, 54625, 22664, 50092}, 35617, objArr30);
                                                                                            java.lang.reflect.Method declaredMethod4 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr30[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                            declaredMethod4.setAccessible(true);
                                                                                            declaredMethod4.invoke(objInvoke5, objArr29);
                                                                                        } catch (java.lang.Throwable th32) {
                                                                                            java.lang.Throwable cause18 = th32.getCause();
                                                                                            if (cause18 == null) {
                                                                                                throw th32;
                                                                                            }
                                                                                            throw cause18;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th33) {
                                                                                        java.lang.Throwable cause19 = th33.getCause();
                                                                                        if (cause19 == null) {
                                                                                            throw th33;
                                                                                        }
                                                                                        throw cause19;
                                                                                    }
                                                                                } else {
                                                                                    try {
                                                                                        objInvoke2 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                        java.lang.ClassLoader classLoader3 = YJ.class.getClassLoader();
                                                                                        synchronized (objInvoke2) {
                                                                                        }
                                                                                    } catch (java.lang.Throwable th34) {
                                                                                        java.lang.Throwable cause20 = th34.getCause();
                                                                                        if (cause20 == null) {
                                                                                            throw th34;
                                                                                        }
                                                                                        throw cause20;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (java.lang.NoSuchMethodException unused2) {
                                                                            objInvoke2 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                            java.lang.ClassLoader classLoader32 = YJ.class.getClassLoader();
                                                                            synchronized (objInvoke2) {
                                                                                try {
                                                                                    java.lang.Object[] objArr31 = {str2, classLoader32};
                                                                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                                    b(new int[]{1597003743, -1452583603, 1922063606, 757654269, 516793240, -937980961}, 10, objArr32);
                                                                                    java.lang.reflect.Method declaredMethod5 = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr32[0], java.lang.String.class, java.lang.ClassLoader.class);
                                                                                    declaredMethod5.setAccessible(true);
                                                                                    java.lang.String str7 = (java.lang.String) declaredMethod5.invoke(objInvoke2, objArr31);
                                                                                    if (str7 != null) {
                                                                                        throw new java.lang.UnsatisfiedLinkError(str7);
                                                                                    }
                                                                                } catch (java.lang.Throwable th35) {
                                                                                    java.lang.Throwable cause21 = th35.getCause();
                                                                                    if (cause21 == null) {
                                                                                        throw th35;
                                                                                    }
                                                                                    throw cause21;
                                                                                }
                                                                            }
                                                                        }
                                                                        r7 = 6;
                                                                        r12 = 5;
                                                                        r13 = 0;
                                                                        r14 = 10;
                                                                    } catch (java.lang.Throwable th36) {
                                                                        java.lang.Throwable cause22 = th36.getCause();
                                                                        if (cause22 == null) {
                                                                            throw th36;
                                                                        }
                                                                        throw cause22;
                                                                    }
                                                                } catch (java.lang.Throwable th37) {
                                                                    java.lang.Throwable cause23 = th37.getCause();
                                                                    if (cause23 == null) {
                                                                        throw th37;
                                                                    }
                                                                    throw cause23;
                                                                }
                                                            } else {
                                                                try {
                                                                    objArr9 = new java.lang.Object[]{objNewInstance2};
                                                                    clsArr2 = new java.lang.Class[1];
                                                                } catch (java.lang.Throwable th38) {
                                                                    th = th38;
                                                                }
                                                                try {
                                                                    clsArr2[0] = java.io.File.class;
                                                                    java.io.OutputStream outputStream = (java.io.OutputStream) java.io.FileOutputStream.class.getDeclaredConstructor(clsArr2).newInstance(objArr9);
                                                                    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
                                                                    byte[] bArr = new byte[1024];
                                                                    while (true) {
                                                                        int i2 = inputStream2.read(bArr);
                                                                        if (i2 < 0) {
                                                                            break;
                                                                        } else {
                                                                            bufferedOutputStream.write(bArr, 0, i2);
                                                                        }
                                                                    }
                                                                    bufferedOutputStream.flush();
                                                                    r122 = 5;
                                                                    r12 = 5;
                                                                    r12 = 5;
                                                                    r122 = 5;
                                                                    r122 = 5;
                                                                    c = 5;
                                                                    try {
                                                                        objArr10 = new java.lang.Object[1];
                                                                        a(new char[]{29706, 53203, 943, 18362, 39749}, 48091, objArr10);
                                                                    } catch (java.lang.Throwable th39) {
                                                                        th = th39;
                                                                    }
                                                                    try {
                                                                        NewInstance = java.io.FileOutputStream.class.getMethod((java.lang.String) objArr10[0], null).invoke(outputStream, null);
                                                                        try {
                                                                            objArr11 = new java.lang.Object[1];
                                                                            a(new char[]{29726, 58035, 22861, 47099}, 38567, objArr11);
                                                                        } catch (java.lang.Throwable th40) {
                                                                            th = th40;
                                                                        }
                                                                        try {
                                                                            r132 = (java.lang.String) objArr11[0];
                                                                            declaredConstructor = 0;
                                                                            declaredConstructor = 0;
                                                                            declaredConstructor = 0;
                                                                            declaredConstructor = 0;
                                                                            declaredConstructor = 0;
                                                                            declaredConstructor = 0;
                                                                            java.io.FileDescriptor.class.getMethod(r132, null).invoke(NewInstance, null);
                                                                            try {
                                                                                bufferedOutputStream.close();
                                                                                inputStream2.close();
                                                                            } catch (java.lang.Exception e4) {
                                                                                e = e4;
                                                                                NewInstance = 6;
                                                                                r19 = r19;
                                                                                r132 = 0;
                                                                                declaredConstructor = 10;
                                                                                exc = e;
                                                                                r7 = NewInstance;
                                                                                r12 = r122;
                                                                                r13 = r132;
                                                                                r14 = declaredConstructor;
                                                                                r19 = r19;
                                                                                if (i >= length) {
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            java.lang.Object objInvoke6 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                            try {
                                                                                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                                                                r132 = 14057;
                                                                                                r132 = 14057;
                                                                                                a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr33);
                                                                                                NewInstance = 0;
                                                                                                try {
                                                                                                    java.lang.Object[] objArr34 = {java.io.File.class.getMethod((java.lang.String) objArr33[0], null).invoke(objNewInstance2, null), YJ.class.getClassLoader()};
                                                                                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                                                    a(new char[]{29697, 10739, 53230, 28122}, 24049, objArr35);
                                                                                                    r132 = (java.lang.String) objArr35[0];
                                                                                                    declaredConstructor = java.lang.String.class;
                                                                                                    NewInstance = java.lang.Runtime.class.getDeclaredMethod(r132, new java.lang.Class[]{declaredConstructor, java.lang.ClassLoader.class});
                                                                                                    NewInstance.setAccessible(true);
                                                                                                    NewInstance.invoke(objInvoke6, objArr34);
                                                                                                } catch (java.lang.Throwable th41) {
                                                                                                    java.lang.Throwable cause24 = th41.getCause();
                                                                                                    if (cause24 == null) {
                                                                                                        throw th41;
                                                                                                    }
                                                                                                    throw cause24;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th42) {
                                                                                                java.lang.Throwable cause25 = th42.getCause();
                                                                                                if (cause25 == null) {
                                                                                                    throw th42;
                                                                                                }
                                                                                                throw cause25;
                                                                                            }
                                                                                        } catch (java.lang.NoSuchMethodException unused3) {
                                                                                            try {
                                                                                                try {
                                                                                                    objInvoke = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                    try {
                                                                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                                                        a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr36);
                                                                                                    } catch (java.lang.Throwable th43) {
                                                                                                        th = th43;
                                                                                                    }
                                                                                                    try {
                                                                                                        java.lang.Object objInvoke7 = java.io.File.class.getMethod((java.lang.String) objArr36[0], null).invoke(objNewInstance2, null);
                                                                                                        java.lang.ClassLoader classLoader4 = YJ.class.getClassLoader();
                                                                                                        try {
                                                                                                            synchronized (objInvoke) {
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th44) {
                                                                                                            th = th44;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th45) {
                                                                                                        th = th45;
                                                                                                        java.lang.Throwable th46 = th;
                                                                                                        java.lang.Throwable cause26 = th46.getCause();
                                                                                                        if (cause26 == null) {
                                                                                                            throw th46;
                                                                                                        }
                                                                                                        throw cause26;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th47) {
                                                                                                    java.lang.Throwable cause27 = th47.getCause();
                                                                                                    if (cause27 == null) {
                                                                                                        throw th47;
                                                                                                    }
                                                                                                    throw cause27;
                                                                                                }
                                                                                            } catch (java.lang.Exception e5) {
                                                                                                e = e5;
                                                                                                exc = e;
                                                                                                r7 = NewInstance;
                                                                                                r12 = r122;
                                                                                                r13 = r132;
                                                                                                r14 = declaredConstructor;
                                                                                                r19 = r19;
                                                                                                if (i >= length) {
                                                                                                }
                                                                                            }
                                                                                        } catch (java.lang.Exception e6) {
                                                                                            exc = e6;
                                                                                            c2 = 6;
                                                                                            r193 = r19;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th48) {
                                                                                        java.lang.Throwable cause28 = th48.getCause();
                                                                                        if (cause28 == null) {
                                                                                            throw th48;
                                                                                        }
                                                                                        throw cause28;
                                                                                    }
                                                                                } catch (java.lang.Exception unused4) {
                                                                                    if (Build.VERSION.SDK_INT <= 27) {
                                                                                        try {
                                                                                            java.lang.Object objInvoke8 = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                            try {
                                                                                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                                                r132 = 14057;
                                                                                                r132 = 14057;
                                                                                                a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr37);
                                                                                                NewInstance = 0;
                                                                                                try {
                                                                                                    java.lang.Object[] objArr38 = {java.io.File.class.getMethod((java.lang.String) objArr37[0], null).invoke(objNewInstance2, null), YJ.class.getClassLoader()};
                                                                                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                                                    a(new char[]{29705, 65315, 25187, 54625, 22664, 50092}, 35617, objArr39);
                                                                                                    declaredConstructor = java.lang.String.class;
                                                                                                    r132 = java.lang.ClassLoader.class;
                                                                                                    NewInstance = java.lang.Runtime.class.getDeclaredMethod((java.lang.String) objArr39[0], new java.lang.Class[]{declaredConstructor, r132});
                                                                                                    NewInstance.setAccessible(true);
                                                                                                    NewInstance.invoke(objInvoke8, objArr38);
                                                                                                } catch (java.lang.Throwable th49) {
                                                                                                    java.lang.Throwable cause29 = th49.getCause();
                                                                                                    if (cause29 == null) {
                                                                                                        throw th49;
                                                                                                    }
                                                                                                    throw cause29;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th50) {
                                                                                                java.lang.Throwable cause30 = th50.getCause();
                                                                                                if (cause30 == null) {
                                                                                                    throw th50;
                                                                                                }
                                                                                                throw cause30;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th51) {
                                                                                            java.lang.Throwable cause31 = th51.getCause();
                                                                                            if (cause31 == null) {
                                                                                                throw th51;
                                                                                            }
                                                                                            throw cause31;
                                                                                        }
                                                                                    }
                                                                                    objInvoke = java.lang.Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                    java.lang.Object[] objArr362 = new java.lang.Object[1];
                                                                                    a(new char[]{29706, 17121, 6603, 53399, 44971, 26259, 15732, 62558, 50000, 39464, 20754, 10302, 59104, 48588, 29883}, 14057, objArr362);
                                                                                    java.lang.Object objInvoke72 = java.io.File.class.getMethod((java.lang.String) objArr362[0], null).invoke(objNewInstance2, null);
                                                                                    java.lang.ClassLoader classLoader42 = YJ.class.getClassLoader();
                                                                                    synchronized (objInvoke) {
                                                                                        try {
                                                                                            objArr12 = new java.lang.Object[]{objInvoke72, classLoader42};
                                                                                        } catch (java.lang.Throwable th52) {
                                                                                            th = th52;
                                                                                        }
                                                                                        try {
                                                                                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                                            r14 = 10;
                                                                                            try {
                                                                                                b(new int[]{1597003743, -1452583603, 1922063606, 757654269, 516793240, -937980961}, 10, objArr40);
                                                                                                try {
                                                                                                    java.lang.String str8 = (java.lang.String) objArr40[0];
                                                                                                    java.lang.Class[] clsArr5 = new java.lang.Class[2];
                                                                                                    clsArr5[0] = java.lang.String.class;
                                                                                                    clsArr5[1] = java.lang.ClassLoader.class;
                                                                                                    java.lang.reflect.Method declaredMethod6 = java.lang.Runtime.class.getDeclaredMethod(str8, clsArr5);
                                                                                                    declaredMethod6.setAccessible(true);
                                                                                                    java.lang.String str9 = (java.lang.String) declaredMethod6.invoke(objInvoke, objArr12);
                                                                                                    if (str9 != null) {
                                                                                                        throw new java.lang.UnsatisfiedLinkError(str9);
                                                                                                    }
                                                                                                    try {
                                                                                                    } catch (java.lang.Throwable th53) {
                                                                                                        th = th53;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th54) {
                                                                                                    th = th54;
                                                                                                    java.lang.Throwable th55 = th;
                                                                                                    cause4 = th55.getCause();
                                                                                                    if (cause4 != null) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (java.lang.Throwable th56) {
                                                                                                th = th56;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th57) {
                                                                                            th = th57;
                                                                                            java.lang.Throwable th552 = th;
                                                                                            cause4 = th552.getCause();
                                                                                            if (cause4 != null) {
                                                                                                throw th552;
                                                                                            }
                                                                                            throw cause4;
                                                                                        }
                                                                                    }
                                                                                    r7 = 6;
                                                                                    r7 = 6;
                                                                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                                    a(new char[]{29705, 27301, 18779, 10255, 3757, 60777}, 7853, objArr41);
                                                                                    r13 = 0;
                                                                                    r13 = 0;
                                                                                    ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr41[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                    i++;
                                                                                    str3 = str;
                                                                                    r5 = r7;
                                                                                    r72 = r12;
                                                                                    r2 = r13;
                                                                                    r8 = r14;
                                                                                    r122 = r19;
                                                                                }
                                                                                ((java.lang.Boolean) java.io.File.class.getMethod((java.lang.String) objArr41[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                            } catch (java.lang.Throwable th58) {
                                                                                th = th58;
                                                                                java.lang.Throwable th59 = th;
                                                                                try {
                                                                                    java.lang.Throwable cause32 = th59.getCause();
                                                                                    if (cause32 == null) {
                                                                                        throw th59;
                                                                                    }
                                                                                    throw cause32;
                                                                                } catch (java.lang.Exception unused5) {
                                                                                }
                                                                            }
                                                                            r14 = 10;
                                                                            r7 = 6;
                                                                            r7 = 6;
                                                                            java.lang.Object[] objArr412 = new java.lang.Object[1];
                                                                            a(new char[]{29705, 27301, 18779, 10255, 3757, 60777}, 7853, objArr412);
                                                                            r13 = 0;
                                                                            r13 = 0;
                                                                        } catch (java.lang.Throwable th60) {
                                                                            th = th60;
                                                                            java.lang.Throwable th61 = th;
                                                                            java.lang.Throwable cause33 = th61.getCause();
                                                                            if (cause33 == null) {
                                                                                throw th61;
                                                                            }
                                                                            throw cause33;
                                                                        }
                                                                    } catch (java.lang.Throwable th62) {
                                                                        th = th62;
                                                                        java.lang.Throwable th63 = th;
                                                                        java.lang.Throwable cause34 = th63.getCause();
                                                                        if (cause34 == null) {
                                                                            throw th63;
                                                                        }
                                                                        throw cause34;
                                                                    }
                                                                } catch (java.lang.Throwable th64) {
                                                                    th = th64;
                                                                    java.lang.Throwable th65 = th;
                                                                    java.lang.Throwable cause35 = th65.getCause();
                                                                    if (cause35 == null) {
                                                                        throw th65;
                                                                    }
                                                                    throw cause35;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th66) {
                                                            th = th66;
                                                        }
                                                    } catch (java.lang.Exception e7) {
                                                        e = e7;
                                                        r194 = r19;
                                                        NewInstance = 6;
                                                        r122 = 5;
                                                        r19 = r194;
                                                        r132 = 0;
                                                        declaredConstructor = 10;
                                                        exc = e;
                                                        r7 = NewInstance;
                                                        r12 = r122;
                                                        r13 = r132;
                                                        r14 = declaredConstructor;
                                                        r19 = r19;
                                                        if (i >= length) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th67) {
                                                    th = th67;
                                                    java.lang.Throwable th68 = th;
                                                    java.lang.Throwable cause36 = th68.getCause();
                                                    if (cause36 == null) {
                                                        throw th68;
                                                    }
                                                    throw cause36;
                                                }
                                            } catch (java.lang.Throwable th69) {
                                                th = th69;
                                                java.lang.Throwable th70 = th;
                                                java.lang.Throwable cause37 = th70.getCause();
                                                if (cause37 == null) {
                                                    throw th70;
                                                }
                                                throw cause37;
                                            }
                                        } catch (java.lang.Throwable th71) {
                                            th = th71;
                                            java.lang.Throwable th142 = th;
                                            cause2 = th142.getCause();
                                            if (cause2 != null) {
                                                throw th142;
                                            }
                                            throw cause2;
                                        }
                                        exc = e3;
                                        r192 = r19;
                                    } catch (java.lang.Throwable th72) {
                                        th = th72;
                                        java.lang.Throwable th82 = th;
                                        cause = th82.getCause();
                                        if (cause != null) {
                                            throw th82;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Exception e8) {
                                    e = e8;
                                    r194 = r122;
                                }
                            } catch (java.lang.Throwable th73) {
                                java.lang.Throwable cause38 = th73.getCause();
                                if (cause38 == null) {
                                    throw th73;
                                }
                                throw cause38;
                            }
                        } catch (java.lang.Throwable th74) {
                            java.lang.Throwable cause39 = th74.getCause();
                            if (cause39 == null) {
                                throw th74;
                            }
                            throw cause39;
                        }
                    } catch (java.lang.Exception e9) {
                        exc = e9;
                        r192 = r122;
                    }
                    c2 = 6;
                    c = 5;
                    r193 = r192;
                    r13 = 0;
                    r14 = 10;
                    r7 = c2;
                    r12 = c;
                    r19 = r193;
                    if (i >= length) {
                        throw exc;
                    }
                }
                i++;
                str3 = str;
                r5 = r7;
                r72 = r12;
                r2 = r13;
                r8 = r14;
                r122 = r19;
            }
        } catch (java.lang.Throwable th75) {
            java.lang.Throwable cause40 = th75.getCause();
            if (cause40 == null) {
                throw th75;
            }
            throw cause40;
        }
    }
}

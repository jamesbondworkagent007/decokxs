package com.lexisnexisrisk.threatmetrix;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.zip.ZipFile;
import o.YY;
import o.Zh;
import o.Zk;
import o.Zs;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class NativeGathererHelper {
    private static char AEQbTJ = 0;
    private static final byte[] AYXKKw = {59, 54, -122, -120, 1, 3, -12, -26, Ascii.ESC, -9, Ascii.SO, -19, Ascii.SI, 5};
    private static final int AhwBna = 72;
    public static int EFa = 5225;
    private static char EZpvd;
    private static char KWHzl;
    private static char[] OLrzqt;
    private static char copydefault;

    public native int cancel();

    public native String[] checkURLs(String[] strArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean dCwqvq(String str, boolean z, boolean z2) throws Exception {
        KWHzl(str);
        return init(88, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void finalize() throws Throwable {
        super.finalize();
        finit();
    }

    public native void finit();

    public native Object getAddresses(Class cls);

    public native long getAppTime(String str, boolean z);

    public native String getBinaryArch();

    public native String getConnections(Context context);

    public native int getCpuCores();

    public native String[] getFontList(String str);

    public native String[] getNetworkInfo();

    public native String getRandomString(int i);

    public native int getSelinuxMode();

    public native long getTamperCode(int i);

    public native String getTextSectionHash(String str);

    public native String hashFile(String str, int i);

    public native boolean init(int i, boolean z, boolean z2);

    public native int jniDetectedDebugStatus(String str);

    public native String md5(String str);

    public native void setInfoLogging(int i);

    public native String sha1Base32Encode(byte[] bArr);

    public native String sha1HexEncode(byte[] bArr);

    public native String sha256HexEncode(byte[] bArr);

    public native String urlEncode(String str);

    public native String validatePackage(String str);

    public native int waitUntilCancelled();

    public native String xor(String str, String str2);

    private static void b(char[] cArr, int i, Object[] objArr) {
        Zh zh = new Zh();
        char[] cArr2 = new char[cArr.length];
        zh.EZpvd = 0;
        char[] cArr3 = new char[2];
        while (zh.EZpvd < cArr.length) {
            cArr3[0] = cArr[zh.EZpvd];
            cArr3[1] = cArr[zh.EZpvd + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (((long) copydefault) ^ 6538634990023091910L)))) ^ ((c2 >>> 5) + ((char) (((long) AEQbTJ) ^ 6538634990023091910L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) EZpvd) ^ 6538634990023091910L))) ^ ((c3 + i2) ^ ((c3 << 4) + ((char) (((long) KWHzl) ^ 6538634990023091910L))))));
                i2 -= 40503;
            }
            cArr2[zh.EZpvd] = cArr3[0];
            cArr2[zh.EZpvd + 1] = cArr3[1];
            zh.EZpvd += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) {
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4;
        int i5 = 11 - (i * 3);
        int i6 = (i2 * 3) + 102;
        byte[] bArr = AYXKKw;
        int i7 = (s * 3) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i6 = i6 + i8 + 2;
            i7++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i6 = i6 + i8 + 2;
            i7++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void KWHzl() {
        OLrzqt = new char[]{20263, 20313, 20288, 20276, 20287, 20382, 20011, 20006, 20011, 20005, 20028, 20031, 20029, 20250, 20316, 20349, 20323, 20327, 20331, 20320, 20323, 20328, 20326, 20326, 20298, 20294, 20321, 20273, 20334, 20311, 20324, 20331, 20327, 20350, 20307, 20310, 20324, 20329, 20276, 20345, 20326, 20327, 20350, 20350, 20320, 20326, 20327, 20305, 20409, 20405, 20392, 20370, 20411, 20404, 20410, 20371, 20424, 20400, 20407, 20421, 20287, 20329, 20324, 20304, 20304, 20325, 20282, 20330, 20327, 20323, 20322, 20320, 20309, 20304, 20325, 20335, 20286, 20331, 20321, 20304, 20296, 20276, 20347, 20350, 20325, 20287, 20321, 20311, 20316, 20327, 20348, 20320, 20349, 20345, 20321, 20311, 20309, 20327, 20323, 20330};
        KWHzl = (char) 28386;
        EZpvd = (char) 62689;
        copydefault = (char) 6784;
        AEQbTJ = (char) 51257;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:353:0x07e5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:360:0x0808 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:550:0x09e2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:570:0x0819 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:571:0x0779 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:578:0x066e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:623:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:748:0x0a0d */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(14:686|280|281|282|283|284|(5:(7:578|285|653|286|287|640|288)|712|358|371|747)|289|718|354|355|714|356|357) */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x080a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x080b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x080d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x080e, code lost:
    
        r2 = 0;
        r8 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0845 A[Catch: all -> 0x0847, TryCatch #31 {all -> 0x0847, blocks: (B:375:0x0825, B:376:0x082a, B:394:0x0849, B:388:0x083e, B:390:0x0845, B:391:0x0846), top: B:630:0x07ab }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0846 A[Catch: all -> 0x0847, TryCatch #31 {all -> 0x0847, blocks: (B:375:0x0825, B:376:0x082a, B:394:0x0849, B:388:0x083e, B:390:0x0845, B:391:0x0846), top: B:630:0x07ab }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0860 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0861 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0885 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0886 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x089c A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x089d A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08b3 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08b4 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x08da A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x08db A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x08f1 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x08f2 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x091e A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x091f A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0949 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x094a A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0974 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0975 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x09a0 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x09a1 A[Catch: Exception -> 0x09e2, TryCatch #26 {Exception -> 0x09e2, blocks: (B:447:0x08bb, B:449:0x08c1, B:450:0x08c2, B:395:0x084a, B:403:0x0859, B:405:0x0860, B:406:0x0861, B:408:0x0863, B:410:0x086e, B:411:0x086f, B:419:0x087e, B:421:0x0885, B:422:0x0886, B:430:0x0895, B:432:0x089c, B:433:0x089d, B:441:0x08ac, B:443:0x08b3, B:444:0x08b4, B:461:0x08d3, B:463:0x08da, B:464:0x08db, B:472:0x08ea, B:474:0x08f1, B:475:0x08f2, B:488:0x0917, B:490:0x091e, B:491:0x091f, B:502:0x0942, B:504:0x0949, B:505:0x094a, B:516:0x096d, B:518:0x0974, B:519:0x0975, B:530:0x0999, B:532:0x09a0, B:533:0x09a1, B:541:0x09c5, B:543:0x09cc, B:544:0x09cd, B:546:0x09cf, B:548:0x09e0, B:549:0x09e1, B:14:0x0086, B:330:0x0779), top: B:623:0x0086, inners: #37, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:615:0x07ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0590 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0a1c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0a0d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v129 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /* JADX WARN: Type inference failed for: r6v92 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v114 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v121 */
    /* JADX WARN: Type inference failed for: r8v122 */
    /* JADX WARN: Type inference failed for: r8v123 */
    /* JADX WARN: Type inference failed for: r8v124 */
    /* JADX WARN: Type inference failed for: r8v125 */
    /* JADX WARN: Type inference failed for: r8v126 */
    /* JADX WARN: Type inference failed for: r8v127 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v96, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void KWHzl(String str) throws Exception {
        int i;
        int i2;
        String[] strArr;
        Exception exc;
        int i3;
        int i4;
        ?? r8;
        ?? r6;
        int i5;
        Object objNewInstance;
        byte[] bArr;
        Object[] objArr;
        Throwable cause;
        String str2;
        int i6;
        Throwable cause2;
        Object[] objArr2;
        Throwable cause3;
        Object[] objArr3;
        Class[] clsArr;
        Throwable cause4;
        Object[] objArr4;
        Class[] clsArr2;
        BufferedInputStream bufferedInputStream;
        Throwable cause5;
        Object[] objArr5;
        Throwable cause6;
        Object[] objArr6;
        Class[] clsArr3;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Object objInvoke;
        Throwable cause7;
        Object[] objArr7;
        Throwable cause8;
        Throwable cause9;
        Object objInvoke2;
        Throwable cause10;
        Throwable cause11;
        Object[] objArr8;
        String str3;
        Class[] clsArr4;
        Object[] objArr9;
        String str4;
        int i7 = 9;
        int i8 = 0;
        int i9 = 1;
        Object[] objArr10 = new Object[1];
        a(new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{38, 9, 0, 0}, false, objArr10);
        String str5 = (String) objArr10[0];
        ?? r4 = 10;
        Object[] objArr11 = new Object[1];
        b(new char[]{18796, 32800, 56414, 55840, 26501, 59572, 55468, 11775, 38221, 58256}, 10, objArr11);
        String str6 = (String) objArr11[0];
        int i10 = 5;
        Object[] objArr12 = new Object[1];
        a(new byte[]{1, 1, 0, 1, 1}, new int[]{0, 5, 0, 0}, false, objArr12);
        try {
            String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) String.class.getMethod("getBytes", String.class).invoke(str, (String) objArr12[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new String[0];
            }
            int length = strArrAEQbTJ.length;
            String[] strArr2 = new String[length + 1];
            System.arraycopy(strArrAEQbTJ, 0, strArr2, 0, length);
            strArr2[length] = str;
            int i11 = 0;
            while (i11 <= length) {
                String str7 = strArr2[i11];
                try {
                    try {
                        Object[] objArr13 = new Object[i9];
                        try {
                            b(new char[]{29424, 283, 62418, 61517, 18527, 1942, 22279, 8913, 59187, 59624, 12923, 17929, 46624, 20303, 52466, 48352, 54136, 7215, 41773, 23136, 11592, 31077, 45805, 18489, 45361, 17381}, 25, objArr13);
                            try {
                                try {
                                    Object[] objArr14 = {(String) objArr13[i8]};
                                    Class[] clsArr5 = new Class[i9];
                                    clsArr5[i8] = String.class;
                                    objNewInstance = File.class.getDeclaredConstructor(clsArr5).newInstance(objArr14);
                                    try {
                                        bArr = new byte[]{1, 0, 1, 1, 1, 1, 1, 1};
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        int[] iArr = {i10, 8, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, i8};
                                        objArr = new Object[1];
                                        a(bArr, iArr, i8, objArr);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Throwable th4 = th;
                                        Throwable cause12 = th4.getCause();
                                        if (cause12 == null) {
                                            throw th4;
                                        }
                                        throw cause12;
                                    }
                                } catch (Throwable th5) {
                                    Throwable cause13 = th5.getCause();
                                    if (cause13 == null) {
                                        throw th5;
                                    }
                                    throw cause13;
                                }
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i7 = i8;
                            i10 = i9;
                            i = i11;
                            i2 = length;
                            strArr = strArr2;
                            i9 = 10;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i7 = i8;
                        i10 = i9;
                        i = i11;
                        i2 = length;
                        strArr = strArr2;
                        i9 = r4;
                    }
                } catch (Exception e4) {
                    e = e4;
                    i7 = i8;
                    i10 = i9;
                    i = i11;
                    i2 = length;
                    strArr = strArr2;
                    i9 = r4;
                }
                if (((Boolean) File.class.getMethod((String) objArr[i8], null).invoke(objNewInstance, null)).booleanValue()) {
                    ClassLoader classLoader = NativeGathererHelper.class.getClassLoader();
                    Object[] objArr15 = {i11 < length ? str : str7};
                    byte b = (byte) (AYXKKw[4] - 1);
                    byte b2 = b;
                    strArr = strArr2;
                    Object[] objArr16 = new Object[1];
                    c(b, b2, b2, objArr16);
                    Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr16[0], String.class);
                    declaredMethod.setAccessible(true);
                    str2 = (String) declaredMethod.invoke(classLoader, objArr15);
                    if (str2 != null) {
                    }
                    i6 = 0;
                    r6 = 10;
                    r8 = 1;
                    i5 = i6;
                    if (i3 < i4) {
                    }
                } else {
                    try {
                        Object[] objArr17 = new Object[1];
                        a(new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0}, new int[]{13, 14, i8, 7}, i8, objArr17);
                        str4 = (String) objArr17[i8];
                    } catch (Exception e5) {
                        exc = e5;
                        i6 = i8;
                        i3 = i11;
                        i4 = length;
                        strArr = strArr2;
                    }
                    try {
                        Object[] objArr18 = {System.getProperty(str4, str4)};
                        Class[] clsArr6 = new Class[1];
                        clsArr6[i8] = String.class;
                        objNewInstance = File.class.getDeclaredConstructor(clsArr6).newInstance(objArr18);
                        try {
                            Object[] objArr19 = new Object[1];
                            a(new byte[]{1, 0, 1, 1, 1, 1, 1, 1}, new int[]{5, 8, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, i8}, i8, objArr19);
                            if (!((Boolean) File.class.getMethod((String) objArr19[i8], null).invoke(objNewInstance, null)).booleanValue()) {
                                objNewInstance = Environment.getExternalStorageDirectory();
                            }
                            try {
                                ClassLoader classLoader2 = NativeGathererHelper.class.getClassLoader();
                                try {
                                    Object[] objArr152 = {i11 < length ? str : str7};
                                    byte b3 = (byte) (AYXKKw[4] - 1);
                                    byte b22 = b3;
                                    strArr = strArr2;
                                    try {
                                        Object[] objArr162 = new Object[1];
                                        c(b3, b22, b22, objArr162);
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                                try {
                                    Method declaredMethod2 = ClassLoader.class.getDeclaredMethod((String) objArr162[0], String.class);
                                    declaredMethod2.setAccessible(true);
                                } catch (Throwable th8) {
                                    th = th8;
                                    Throwable th9 = th;
                                    cause = th9.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                i7 = i8;
                                i = i11;
                                i2 = length;
                                strArr = strArr2;
                            }
                            try {
                                str2 = (String) declaredMethod2.invoke(classLoader2, objArr152);
                                if (str2 != null) {
                                    try {
                                        Object objInvoke3 = Runtime.class.getMethod(str6, null).invoke(null, null);
                                        if (i11 >= length) {
                                            str7 = str;
                                        }
                                        try {
                                            try {
                                                Object[] objArr20 = new Object[1];
                                                b(new char[]{44758, 9655, 22112, 39947, 3678, 10342, 9551, 19206, 64082, 39624, 24905, 54148}, 11, objArr20);
                                                Runtime.class.getMethod((String) objArr20[0], String.class).invoke(objInvoke3, str7);
                                                return;
                                            } catch (Exception e7) {
                                                exc = e7;
                                                i3 = i11;
                                                i4 = length;
                                            }
                                        } catch (Throwable th10) {
                                            Throwable cause14 = th10.getCause();
                                            if (cause14 == null) {
                                                throw th10;
                                            }
                                            throw cause14;
                                        }
                                    } catch (Throwable th11) {
                                        Throwable cause15 = th11.getCause();
                                        if (cause15 == null) {
                                            throw th11;
                                        }
                                        throw cause15;
                                    }
                                } else {
                                    try {
                                        objArr2 = new Object[1];
                                        try {
                                        } catch (Throwable th12) {
                                            th = th12;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                    }
                                    try {
                                        objArr2[0] = 47;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        Throwable th15 = th;
                                        cause2 = th15.getCause();
                                        if (cause2 != null) {
                                        }
                                    }
                                    try {
                                        Object[] objArr21 = new Object[1];
                                        a(new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{27, 11, 0, 3}, false, objArr21);
                                        String str8 = (String) objArr21[0];
                                        Class[] clsArr7 = new Class[1];
                                        clsArr7[0] = Integer.TYPE;
                                        try {
                                            objArr3 = new Object[1];
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                        try {
                                            objArr3[0] = Integer.valueOf(((Integer) String.class.getMethod(str8, clsArr7).invoke(str2, objArr2)).intValue() + 1);
                                            clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                            } catch (Throwable th17) {
                                                th = th17;
                                            }
                                        } catch (Throwable th18) {
                                            th = th18;
                                            Throwable th19 = th;
                                            cause3 = th19.getCause();
                                            if (cause3 != null) {
                                            }
                                        }
                                        try {
                                            try {
                                                objArr4 = new Object[]{objNewInstance, String.class.getMethod(str5, clsArr).invoke(str2, objArr3)};
                                                clsArr2 = new Class[2];
                                            } catch (Throwable th20) {
                                                th = th20;
                                            }
                                            try {
                                                clsArr2[0] = File.class;
                                            } catch (Throwable th21) {
                                                th = th21;
                                                Throwable th22 = th;
                                                cause4 = th22.getCause();
                                                if (cause4 != null) {
                                                }
                                            }
                                            try {
                                                clsArr2[1] = String.class;
                                                Object objNewInstance2 = File.class.getDeclaredConstructor(clsArr2).newInstance(objArr4);
                                                try {
                                                    URL resource = NativeGathererHelper.class.getClassLoader().getResource(str2);
                                                    if (resource == null) {
                                                        try {
                                                            Object[] objArr22 = new Object[1];
                                                            b(new char[]{48676, 47612, 33387, 508, 35018, 24977, 51503, 64919}, 8, objArr22);
                                                            if (((Boolean) String.class.getMethod((String) objArr22[0], CharSequence.class).invoke(str2, "!")).booleanValue()) {
                                                                try {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    try {
                                                                        Object[] objArr23 = new Object[1];
                                                                        a(new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 1}, new int[]{47, 9, 79, 0}, false, objArr23);
                                                                        sb.append((String) objArr23[0]);
                                                                        sb.append(str2);
                                                                        String path = new URL(sb.toString()).getPath();
                                                                        try {
                                                                            objArr9 = new Object[]{"!/"};
                                                                            i = i11;
                                                                            i2 = length;
                                                                        } catch (Throwable th23) {
                                                                            th = th23;
                                                                        }
                                                                        try {
                                                                            Object[] objArr24 = new Object[1];
                                                                            a(new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{27, 11, 0, 3}, false, objArr24);
                                                                            try {
                                                                                ZipFile zipFile = new ZipFile((String) String.class.getMethod(str5, Integer.TYPE, Integer.TYPE).invoke(path, 5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr24[0], String.class).invoke(path, objArr9)).intValue())));
                                                                                try {
                                                                                    Object[] objArr25 = new Object[1];
                                                                                    a(new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{27, 11, 0, 3}, false, objArr25);
                                                                                    try {
                                                                                        try {
                                                                                            inputStream = zipFile.getInputStream(zipFile.getEntry((String) String.class.getMethod(str5, Integer.TYPE).invoke(String.class.getMethod(str5, Integer.TYPE).invoke(str2, Integer.valueOf(((Integer) String.class.getMethod((String) objArr25[0], String.class).invoke(str2, "!/")).intValue())), 2)));
                                                                                        } catch (Throwable th24) {
                                                                                            Throwable cause16 = th24.getCause();
                                                                                            if (cause16 == null) {
                                                                                                throw th24;
                                                                                            }
                                                                                            throw cause16;
                                                                                        }
                                                                                    } catch (Throwable th25) {
                                                                                        Throwable cause17 = th25.getCause();
                                                                                        if (cause17 == null) {
                                                                                            throw th25;
                                                                                        }
                                                                                        throw cause17;
                                                                                    }
                                                                                } catch (Throwable th26) {
                                                                                    Throwable cause18 = th26.getCause();
                                                                                    if (cause18 == null) {
                                                                                        throw th26;
                                                                                    }
                                                                                    throw cause18;
                                                                                }
                                                                            } catch (Throwable th27) {
                                                                                Throwable cause19 = th27.getCause();
                                                                                if (cause19 == null) {
                                                                                    throw th27;
                                                                                }
                                                                                throw cause19;
                                                                            }
                                                                        } catch (Throwable th28) {
                                                                            th = th28;
                                                                            Throwable th29 = th;
                                                                            Throwable cause20 = th29.getCause();
                                                                            if (cause20 == null) {
                                                                                throw th29;
                                                                            }
                                                                            throw cause20;
                                                                        }
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        i = i11;
                                                                        i2 = length;
                                                                        exc = e;
                                                                        i3 = i;
                                                                        i4 = i2;
                                                                        i6 = 0;
                                                                        r6 = 10;
                                                                        r8 = 1;
                                                                        i5 = i6;
                                                                        if (i3 < i4) {
                                                                        }
                                                                    }
                                                                } catch (Exception e9) {
                                                                    e = e9;
                                                                    i = i11;
                                                                    i2 = length;
                                                                }
                                                            } else {
                                                                i = i11;
                                                                i2 = length;
                                                                try {
                                                                    inputStream = (InputStream) FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str2);
                                                                } catch (Throwable th30) {
                                                                    Throwable cause21 = th30.getCause();
                                                                    if (cause21 == null) {
                                                                        throw th30;
                                                                    }
                                                                    throw cause21;
                                                                }
                                                            }
                                                        } catch (Throwable th31) {
                                                            Throwable cause22 = th31.getCause();
                                                            if (cause22 == null) {
                                                                throw th31;
                                                            }
                                                            throw cause22;
                                                        }
                                                    } else {
                                                        i = i11;
                                                        i2 = length;
                                                        String path2 = resource.getPath();
                                                        try {
                                                            objArr5 = new Object[]{"!/" + str2};
                                                        } catch (Throwable th32) {
                                                            th = th32;
                                                        }
                                                        try {
                                                        } catch (Throwable th33) {
                                                            th = th33;
                                                            Throwable th34 = th;
                                                            cause5 = th34.getCause();
                                                            if (cause5 != null) {
                                                            }
                                                        }
                                                        try {
                                                            Object[] objArr26 = new Object[1];
                                                            a(new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{27, 11, 0, 3}, false, objArr26);
                                                            String str9 = (String) objArr26[0];
                                                            Class[] clsArr8 = new Class[1];
                                                            clsArr8[0] = String.class;
                                                            int iIntValue = ((Integer) String.class.getMethod(str9, clsArr8).invoke(path2, objArr5)).intValue();
                                                            try {
                                                                objArr6 = new Object[2];
                                                                try {
                                                                    objArr6[1] = Integer.valueOf(iIntValue);
                                                                } catch (Throwable th35) {
                                                                    th = th35;
                                                                }
                                                            } catch (Throwable th36) {
                                                                th = th36;
                                                            }
                                                            try {
                                                                objArr6[0] = 5;
                                                                clsArr3 = new Class[2];
                                                                clsArr3[0] = Integer.TYPE;
                                                            } catch (Throwable th37) {
                                                                th = th37;
                                                                Throwable th38 = th;
                                                                cause6 = th38.getCause();
                                                                if (cause6 != null) {
                                                                }
                                                            }
                                                            try {
                                                                clsArr3[1] = Integer.TYPE;
                                                                ZipFile zipFile2 = new ZipFile((String) String.class.getMethod(str5, clsArr3).invoke(path2, objArr6));
                                                                inputStream = zipFile2.getInputStream(zipFile2.getEntry(str2));
                                                            } catch (Throwable th39) {
                                                                th = th39;
                                                                Throwable th382 = th;
                                                                cause6 = th382.getCause();
                                                                if (cause6 != null) {
                                                                    throw th382;
                                                                }
                                                                throw cause6;
                                                            }
                                                        } catch (Throwable th40) {
                                                            th = th40;
                                                            Throwable th342 = th;
                                                            cause5 = th342.getCause();
                                                            if (cause5 != null) {
                                                                throw th342;
                                                            }
                                                            throw cause5;
                                                        }
                                                    }
                                                    bufferedInputStream = new BufferedInputStream(inputStream);
                                                    try {
                                                        Object[] objArr27 = {bufferedInputStream};
                                                        Object objEZpvd = YY.EZpvd(1683135861);
                                                        if (objEZpvd == null) {
                                                            try {
                                                                objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new Class[]{InputStream.class});
                                                            } catch (Throwable th41) {
                                                                th = th41;
                                                                Throwable cause23 = th.getCause();
                                                                if (cause23 == null) {
                                                                    throw th;
                                                                }
                                                                throw cause23;
                                                            }
                                                        }
                                                        inputStream2 = (InputStream) ((Method) objEZpvd).invoke(null, objArr27);
                                                        i9 = 89;
                                                        i10 = 56;
                                                        i10 = 56;
                                                        i10 = 56;
                                                        i10 = 56;
                                                        i10 = 56;
                                                        i10 = 56;
                                                    } catch (Throwable th42) {
                                                        th = th42;
                                                    }
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    i = i11;
                                                    i2 = length;
                                                }
                                                if (bufferedInputStream == inputStream2) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        exc = e;
                                                        i3 = i;
                                                        i4 = i2;
                                                        i6 = 0;
                                                        r6 = 10;
                                                        r8 = 1;
                                                        i5 = i6;
                                                        if (i3 < i4) {
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                Object objInvoke4 = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                try {
                                                                    Object[] objArr28 = {str2, NativeGathererHelper.class.getClassLoader()};
                                                                    Object[] objArr29 = new Object[1];
                                                                    a(null, new int[]{56, 4, 89, 1}, true, objArr29);
                                                                    Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr29[0], String.class, ClassLoader.class);
                                                                    declaredMethod3.setAccessible(true);
                                                                    declaredMethod3.invoke(objInvoke4, objArr28);
                                                                } catch (Throwable th43) {
                                                                    Throwable cause24 = th43.getCause();
                                                                    if (cause24 == null) {
                                                                        throw th43;
                                                                    }
                                                                    throw cause24;
                                                                }
                                                            } catch (Throwable th44) {
                                                                Throwable cause25 = th44.getCause();
                                                                if (cause25 == null) {
                                                                    throw th44;
                                                                }
                                                                throw cause25;
                                                            }
                                                        } catch (Exception unused) {
                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                try {
                                                                    Object objInvoke5 = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                    try {
                                                                        Object[] objArr30 = {str2, NativeGathererHelper.class.getClassLoader()};
                                                                        Object[] objArr31 = new Object[1];
                                                                        a(new byte[]{0, 0, 1, 1, 1, 0}, new int[]{60, 6, 0, 1}, false, objArr31);
                                                                        Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr31[0], String.class, ClassLoader.class);
                                                                        declaredMethod4.setAccessible(true);
                                                                        declaredMethod4.invoke(objInvoke5, objArr30);
                                                                    } catch (Throwable th45) {
                                                                        Throwable cause26 = th45.getCause();
                                                                        if (cause26 == null) {
                                                                            throw th45;
                                                                        }
                                                                        throw cause26;
                                                                    }
                                                                } catch (Throwable th46) {
                                                                    Throwable cause27 = th46.getCause();
                                                                    if (cause27 == null) {
                                                                        throw th46;
                                                                    }
                                                                    throw cause27;
                                                                }
                                                            } else {
                                                                try {
                                                                    objInvoke = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                    ClassLoader classLoader3 = NativeGathererHelper.class.getClassLoader();
                                                                    synchronized (objInvoke) {
                                                                    }
                                                                } catch (Throwable th47) {
                                                                    Throwable cause28 = th47.getCause();
                                                                    if (cause28 == null) {
                                                                        throw th47;
                                                                    }
                                                                    throw cause28;
                                                                }
                                                            }
                                                        }
                                                    } catch (NoSuchMethodException unused2) {
                                                        objInvoke = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                        ClassLoader classLoader32 = NativeGathererHelper.class.getClassLoader();
                                                        synchronized (objInvoke) {
                                                            try {
                                                                Object[] objArr32 = {str2, classLoader32};
                                                                Object[] objArr33 = new Object[1];
                                                                a(new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{66, 10, 0, 0}, false, objArr33);
                                                                Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                                                declaredMethod5.setAccessible(true);
                                                                String str10 = (String) declaredMethod5.invoke(objInvoke, objArr32);
                                                                if (str10 != null) {
                                                                    throw new UnsatisfiedLinkError(str10);
                                                                }
                                                                i11 = i3 + 1;
                                                                i8 = i5;
                                                                length = i4;
                                                                r4 = r6;
                                                                i9 = r8;
                                                                strArr2 = strArr;
                                                                i7 = 9;
                                                                i10 = 5;
                                                            } catch (Throwable th48) {
                                                                Throwable cause29 = th48.getCause();
                                                                if (cause29 == null) {
                                                                    throw th48;
                                                                }
                                                                throw cause29;
                                                            }
                                                        }
                                                        i3 = i;
                                                        i4 = i2;
                                                        i5 = 0;
                                                        r6 = 10;
                                                        r8 = 1;
                                                        i11 = i3 + 1;
                                                        i8 = i5;
                                                        length = i4;
                                                        r4 = r6;
                                                        i9 = r8;
                                                        strArr2 = strArr;
                                                        i7 = 9;
                                                        i10 = 5;
                                                    }
                                                    i3 = i;
                                                    i4 = i2;
                                                    i5 = 0;
                                                    r6 = 10;
                                                    r8 = 1;
                                                } else {
                                                    try {
                                                        try {
                                                            objArr7 = new Object[]{objNewInstance2};
                                                        } catch (Throwable th49) {
                                                            th = th49;
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        i7 = 0;
                                                        i9 = 10;
                                                        i10 = 1;
                                                        exc = e;
                                                        i3 = i;
                                                        i4 = i2;
                                                        i5 = i7;
                                                        r6 = i9;
                                                        r8 = i10;
                                                        if (i3 < i4) {
                                                        }
                                                    }
                                                    try {
                                                        Class[] clsArr9 = new Class[1];
                                                        try {
                                                            clsArr9[0] = File.class;
                                                            OutputStream outputStream = (OutputStream) FileOutputStream.class.getDeclaredConstructor(clsArr9).newInstance(objArr7);
                                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                                                            byte[] bArr2 = new byte[1024];
                                                            while (true) {
                                                                int i12 = inputStream2.read(bArr2);
                                                                if (i12 < 0) {
                                                                    break;
                                                                } else {
                                                                    bufferedOutputStream.write(bArr2, 0, i12);
                                                                }
                                                                exc = e;
                                                                i3 = i;
                                                                i4 = i2;
                                                                i5 = i7;
                                                                r6 = i9;
                                                                r8 = i10;
                                                                if (i3 < i4) {
                                                                    throw exc;
                                                                }
                                                            }
                                                            bufferedOutputStream.flush();
                                                            try {
                                                            } catch (Throwable th50) {
                                                                th = th50;
                                                            }
                                                            try {
                                                            } catch (Throwable th51) {
                                                                th = th51;
                                                                Throwable th52 = th;
                                                                cause8 = th52.getCause();
                                                                if (cause8 != null) {
                                                                }
                                                            }
                                                            try {
                                                                Object[] objArr34 = new Object[1];
                                                                a(new byte[]{1, 0, 1, 0, 0}, new int[]{76, 5, 0, 0}, false, objArr34);
                                                                Object objInvoke6 = FileOutputStream.class.getMethod((String) objArr34[0], null).invoke(outputStream, null);
                                                                try {
                                                                } catch (Throwable th53) {
                                                                    th = th53;
                                                                }
                                                                try {
                                                                } catch (Throwable th54) {
                                                                    th = th54;
                                                                    Throwable th55 = th;
                                                                    cause9 = th55.getCause();
                                                                    if (cause9 != null) {
                                                                    }
                                                                }
                                                                try {
                                                                    Object[] objArr35 = new Object[1];
                                                                    a(new byte[]{1, 0, 1, 1}, new int[]{81, 4, 0, 0}, false, objArr35);
                                                                    FileDescriptor.class.getMethod((String) objArr35[0], null).invoke(objInvoke6, null);
                                                                    bufferedOutputStream.close();
                                                                    inputStream2.close();
                                                                    i7 = 15;
                                                                    i7 = 15;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    Object objInvoke7 = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                    try {
                                                                                        Object[] objArr36 = new Object[1];
                                                                                        a(new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{85, 15, 0, 14}, false, objArr36);
                                                                                        try {
                                                                                            Object[] objArr37 = {File.class.getMethod((String) objArr36[0], null).invoke(objNewInstance2, null), NativeGathererHelper.class.getClassLoader()};
                                                                                            Object[] objArr38 = new Object[1];
                                                                                            a(null, new int[]{56, 4, 89, 1}, true, objArr38);
                                                                                            i10 = (String) objArr38[0];
                                                                                            Method declaredMethod6 = Runtime.class.getDeclaredMethod(i10, String.class, ClassLoader.class);
                                                                                            declaredMethod6.setAccessible(true);
                                                                                            declaredMethod6.invoke(objInvoke7, objArr37);
                                                                                        } catch (Throwable th56) {
                                                                                            Throwable cause30 = th56.getCause();
                                                                                            if (cause30 == null) {
                                                                                                throw th56;
                                                                                            }
                                                                                            throw cause30;
                                                                                        }
                                                                                    } catch (Throwable th57) {
                                                                                        Throwable cause31 = th57.getCause();
                                                                                        if (cause31 == null) {
                                                                                            throw th57;
                                                                                        }
                                                                                        throw cause31;
                                                                                    }
                                                                                } catch (Throwable th58) {
                                                                                    Throwable cause32 = th58.getCause();
                                                                                    if (cause32 == null) {
                                                                                        throw th58;
                                                                                    }
                                                                                    throw cause32;
                                                                                }
                                                                            } catch (NoSuchMethodException unused3) {
                                                                                try {
                                                                                    i9 = 0;
                                                                                    objInvoke2 = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                    try {
                                                                                    } catch (Throwable th59) {
                                                                                        th = th59;
                                                                                    }
                                                                                    try {
                                                                                    } catch (Throwable th60) {
                                                                                        th = th60;
                                                                                        Throwable th61 = th;
                                                                                        cause10 = th61.getCause();
                                                                                        if (cause10 != null) {
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        Object[] objArr39 = new Object[1];
                                                                                        a(new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{85, 15, 0, 14}, false, objArr39);
                                                                                        Object objInvoke8 = File.class.getMethod((String) objArr39[0], null).invoke(objNewInstance2, null);
                                                                                        ClassLoader classLoader4 = NativeGathererHelper.class.getClassLoader();
                                                                                        try {
                                                                                            synchronized (objInvoke2) {
                                                                                            }
                                                                                        } catch (Throwable th62) {
                                                                                            th = th62;
                                                                                        }
                                                                                    } catch (Throwable th63) {
                                                                                        th = th63;
                                                                                        Throwable th612 = th;
                                                                                        cause10 = th612.getCause();
                                                                                        if (cause10 != null) {
                                                                                            throw th612;
                                                                                        }
                                                                                        throw cause10;
                                                                                    }
                                                                                } catch (Throwable th64) {
                                                                                    Throwable cause33 = th64.getCause();
                                                                                    if (cause33 == null) {
                                                                                        throw th64;
                                                                                    }
                                                                                    throw cause33;
                                                                                }
                                                                            }
                                                                        } catch (Exception unused4) {
                                                                            i9 = 27;
                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                try {
                                                                                    Object objInvoke9 = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                                    try {
                                                                                        Object[] objArr40 = new Object[1];
                                                                                        a(new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{85, 15, 0, 14}, false, objArr40);
                                                                                        try {
                                                                                            Object[] objArr41 = {File.class.getMethod((String) objArr40[0], null).invoke(objNewInstance2, null), NativeGathererHelper.class.getClassLoader()};
                                                                                            Object[] objArr42 = new Object[1];
                                                                                            a(new byte[]{0, 0, 1, 1, 1, 0}, new int[]{60, 6, 0, 1}, false, objArr42);
                                                                                            Method declaredMethod7 = Runtime.class.getDeclaredMethod((String) objArr42[0], String.class, ClassLoader.class);
                                                                                            declaredMethod7.setAccessible(true);
                                                                                            declaredMethod7.invoke(objInvoke9, objArr41);
                                                                                        } catch (Throwable th65) {
                                                                                            Throwable cause34 = th65.getCause();
                                                                                            if (cause34 == null) {
                                                                                                throw th65;
                                                                                            }
                                                                                            throw cause34;
                                                                                        }
                                                                                    } catch (Throwable th66) {
                                                                                        Throwable cause35 = th66.getCause();
                                                                                        if (cause35 == null) {
                                                                                            throw th66;
                                                                                        }
                                                                                        throw cause35;
                                                                                    }
                                                                                } catch (Throwable th67) {
                                                                                    Throwable cause36 = th67.getCause();
                                                                                    if (cause36 == null) {
                                                                                        throw th67;
                                                                                    }
                                                                                    throw cause36;
                                                                                }
                                                                            }
                                                                            i9 = 0;
                                                                            objInvoke2 = Runtime.class.getMethod(str6, null).invoke(null, null);
                                                                            Object[] objArr392 = new Object[1];
                                                                            a(new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{85, 15, 0, 14}, false, objArr392);
                                                                            Object objInvoke82 = File.class.getMethod((String) objArr392[0], null).invoke(objNewInstance2, null);
                                                                            ClassLoader classLoader42 = NativeGathererHelper.class.getClassLoader();
                                                                            synchronized (objInvoke2) {
                                                                                try {
                                                                                    objArr8 = new Object[]{objInvoke82, classLoader42};
                                                                                    r6 = 10;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                Object[] objArr43 = new Object[1];
                                                                                                a(new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{66, 10, 0, 0}, false, objArr43);
                                                                                                str3 = (String) objArr43[0];
                                                                                                clsArr4 = new Class[2];
                                                                                                clsArr4[0] = String.class;
                                                                                            } catch (Throwable th68) {
                                                                                                th = th68;
                                                                                            }
                                                                                        } catch (Throwable th69) {
                                                                                            th = th69;
                                                                                            Throwable th70 = th;
                                                                                            cause11 = th70.getCause();
                                                                                            if (cause11 != null) {
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th71) {
                                                                                        th = th71;
                                                                                    }
                                                                                } catch (Throwable th72) {
                                                                                    th = th72;
                                                                                }
                                                                                try {
                                                                                    clsArr4[1] = ClassLoader.class;
                                                                                    Method declaredMethod8 = Runtime.class.getDeclaredMethod(str3, clsArr4);
                                                                                    declaredMethod8.setAccessible(true);
                                                                                    String str11 = (String) declaredMethod8.invoke(objInvoke2, objArr8);
                                                                                    if (str11 != null) {
                                                                                        throw new UnsatisfiedLinkError(str11);
                                                                                    }
                                                                                    try {
                                                                                    } catch (Throwable th73) {
                                                                                        th = th73;
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th74) {
                                                                                    th = th74;
                                                                                    Throwable th702 = th;
                                                                                    cause11 = th702.getCause();
                                                                                    if (cause11 != null) {
                                                                                        throw th702;
                                                                                    }
                                                                                    throw cause11;
                                                                                }
                                                                            }
                                                                            r8 = 1;
                                                                            r8 = 1;
                                                                            r8 = 1;
                                                                            Object[] objArr44 = new Object[1];
                                                                            b(new char[]{25796, 3374, 45805, 18489, 39816, 32080}, 6, objArr44);
                                                                            i5 = 0;
                                                                            i5 = 0;
                                                                            ((Boolean) File.class.getMethod((String) objArr44[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                            i3 = i;
                                                                            i4 = i2;
                                                                            i11 = i3 + 1;
                                                                            i8 = i5;
                                                                            length = i4;
                                                                            r4 = r6;
                                                                            i9 = r8;
                                                                            strArr2 = strArr;
                                                                            i7 = 9;
                                                                            i10 = 5;
                                                                        }
                                                                        ((Boolean) File.class.getMethod((String) objArr44[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                        i3 = i;
                                                                        i4 = i2;
                                                                    } catch (Throwable th75) {
                                                                        th = th75;
                                                                        Throwable th76 = th;
                                                                        try {
                                                                            Throwable cause37 = th76.getCause();
                                                                            if (cause37 == null) {
                                                                                throw th76;
                                                                            }
                                                                            throw cause37;
                                                                        } catch (Exception unused5) {
                                                                        }
                                                                    }
                                                                    r6 = 10;
                                                                    r8 = 1;
                                                                    r8 = 1;
                                                                    r8 = 1;
                                                                    Object[] objArr442 = new Object[1];
                                                                    b(new char[]{25796, 3374, 45805, 18489, 39816, 32080}, 6, objArr442);
                                                                    i5 = 0;
                                                                    i5 = 0;
                                                                } catch (Throwable th77) {
                                                                    th = th77;
                                                                    Throwable th552 = th;
                                                                    cause9 = th552.getCause();
                                                                    if (cause9 != null) {
                                                                        throw th552;
                                                                    }
                                                                    throw cause9;
                                                                }
                                                            } catch (Throwable th78) {
                                                                th = th78;
                                                                Throwable th522 = th;
                                                                cause8 = th522.getCause();
                                                                if (cause8 != null) {
                                                                    throw th522;
                                                                }
                                                                throw cause8;
                                                            }
                                                        } catch (Throwable th79) {
                                                            th = th79;
                                                            Throwable th80 = th;
                                                            cause7 = th80.getCause();
                                                            if (cause7 != null) {
                                                            }
                                                        }
                                                    } catch (Throwable th81) {
                                                        th = th81;
                                                        Throwable th802 = th;
                                                        cause7 = th802.getCause();
                                                        if (cause7 != null) {
                                                            throw th802;
                                                        }
                                                        throw cause7;
                                                    }
                                                }
                                            } catch (Throwable th82) {
                                                th = th82;
                                                Throwable th222 = th;
                                                cause4 = th222.getCause();
                                                if (cause4 != null) {
                                                    throw th222;
                                                }
                                                throw cause4;
                                            }
                                        } catch (Throwable th83) {
                                            th = th83;
                                            Throwable th192 = th;
                                            cause3 = th192.getCause();
                                            if (cause3 != null) {
                                                throw th192;
                                            }
                                            throw cause3;
                                        }
                                    } catch (Throwable th84) {
                                        th = th84;
                                        Throwable th152 = th;
                                        cause2 = th152.getCause();
                                        if (cause2 != null) {
                                            throw th152;
                                        }
                                        throw cause2;
                                    }
                                }
                                i6 = 0;
                            } catch (Throwable th85) {
                                th = th85;
                                Throwable th92 = th;
                                cause = th92.getCause();
                                if (cause != null) {
                                    throw th92;
                                }
                                throw cause;
                            }
                        } catch (Throwable th86) {
                            Throwable cause38 = th86.getCause();
                            if (cause38 == null) {
                                throw th86;
                            }
                            throw cause38;
                        }
                    } catch (Throwable th87) {
                        Throwable cause39 = th87.getCause();
                        if (cause39 == null) {
                            throw th87;
                        }
                        throw cause39;
                    }
                    r6 = 10;
                    r8 = 1;
                    i5 = i6;
                    if (i3 < i4) {
                    }
                }
                i11 = i3 + 1;
                i8 = i5;
                length = i4;
                r4 = r6;
                i9 = r8;
                strArr2 = strArr;
                i7 = 9;
                i10 = 5;
            }
        } catch (Throwable th88) {
            Throwable cause40 = th88.getCause();
            if (cause40 == null) {
                throw th88;
            }
            throw cause40;
        }
    }
}

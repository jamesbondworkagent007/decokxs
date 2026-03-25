package o;

import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.wallet.WalletConstants;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.common.base.Ascii;
import com.just.agentweb.WebIndicator;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.C8550bEo;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8561bEz implements Function1 {
    public final /* synthetic */ C8550bEo EZpvd;
    public final /* synthetic */ AbstractC8727bIF OLrzqt;
    private static final byte[] $$c = {94, -113, -19, 84};
    private static final int $$d = 79;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Ascii.SO, -58, 119, -50, -25, Ascii.FF, -36, 35, Ascii.EM, Ascii.CR, Ascii.ETB};
    private static final int $$b = 134;
    private static int AEQbTJ = 0;
    private static int djBIcL = 1;
    private static long KWHzl = -7537085029937026286L;
    private static long copydefault = 8748377193085747575L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(short s, byte b, short s2) {
        int i;
        int i2 = b * 2;
        byte[] bArr = $$c;
        int i3 = s2 + 98;
        int i4 = 3 - (s * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == 0) {
            int i6 = i3;
            i = 0;
            int i7 = i4;
            int i8 = i7;
            i3 = i4 + (-i6);
            i4 = i8;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                return new java.lang.String(bArr2, 0);
            }
            int i9 = i4 + 1;
            i++;
            i6 = bArr[i9];
            int i10 = i3;
            i7 = i9;
            i4 = i10;
            int i82 = i7;
            i3 = i4 + (-i6);
            i4 = i82;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8561bEz(C8550bEo c8550bEo, AbstractC8727bIF abstractC8727bIF) {
        this.EZpvd = c8550bEo;
        this.OLrzqt = abstractC8727bIF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 114 - b;
        int i4 = 8 - s;
        int i5 = b2 + 3;
        byte[] bArr2 = new byte[i5];
        if (bArr == 0) {
            int i6 = i3;
            i2 = 0;
            int i7 = i4;
            int i8 = i4 + (-i6) + 16;
            i = i2;
            int i9 = i7;
            i3 = i8;
            i4 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i10 = i4 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i10];
            int i11 = i3;
            i7 = i10;
            i4 = i11;
            int i82 = i4 + (-i6) + 16;
            i = i2;
            int i92 = i7;
            i3 = i82;
            i4 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i102 = i4 + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i1022 = i4 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bEo.AEQbTJ(o.bEo, o.bIF, o.bEo$StateListAnimator):kotlin.Unit */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = AEQbTJ + 45;
        djBIcL = i2 % 128;
        int i3 = i2 % 2;
        C8550bEo c8550bEo = this.EZpvd;
        if (i3 != 0) {
            return C8550bEo.KWHzl(c8550bEo, this.OLrzqt, (C8550bEo.StateListAnimator) obj);
        }
        Unit unitKWHzl = C8550bEo.KWHzl(c8550bEo, this.OLrzqt, (C8550bEo.StateListAnimator) obj);
        int i4 = 36 / 0;
        return unitKWHzl;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i2 = 2 % 2;
        Zo zo = new Zo();
        char[] cArrOLrzqt = Zo.OLrzqt(KWHzl ^ (-5747691001614856746L), cArr, i);
        zo.KWHzl = 4;
        while (zo.KWHzl < cArrOLrzqt.length) {
            int i3 = $11 + 77;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            zo.OLrzqt = zo.KWHzl - 4;
            int i5 = zo.KWHzl;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(cArrOLrzqt[zo.KWHzl] ^ cArrOLrzqt[zo.KWHzl % 4]), java.lang.Long.valueOf(zo.OLrzqt), java.lang.Long.valueOf(KWHzl)};
                java.lang.Object objEZpvd = YY.EZpvd(1769962791);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    objEZpvd = YY.EZpvd(368, 5, (char) 0, 1834987611, false, $$e(b, b, (byte) (-$$c[2])), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                cArrOLrzqt[i5] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {zo, zo};
                java.lang.Object objEZpvd2 = YY.EZpvd(-1024411099);
                if (objEZpvd2 == null) {
                    objEZpvd2 = YY.EZpvd(81, 4, (char) 0, -959416487, false, com.ibm.icu.text.DateFormat.YEAR, new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str = new java.lang.String(cArrOLrzqt, 4, cArrOLrzqt.length - 4);
        int i6 = $11 + 5;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [77=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void c(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i2 = 2 % 2;
        Zi zi = new Zi();
        zi.OLrzqt = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            int i3 = zi.AEQbTJ;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                java.lang.Object objEZpvd = YY.EZpvd(-295504478);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$e(b, b2, (byte) (b2 + 2)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5439468278228498061L);
                java.lang.Object[] objArr3 = {zi, zi};
                java.lang.Object objEZpvd2 = YY.EZpvd(1444313200);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd2 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                int i4 = $11 + 13;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        zi.AEQbTJ = 0;
        int i6 = $10 + 87;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (zi.AEQbTJ < cArr.length) {
            cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
            java.lang.Object[] objArr4 = {zi, zi};
            java.lang.Object objEZpvd3 = YY.EZpvd(1444313200);
            if (objEZpvd3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0fb3 A[PHI: r3
  0x0fb3: PHI (r3v312 int) = (r3v310 int), (r3v347 int) binds: [B:160:0x0fb1, B:148:0x0eae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x120b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1933  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x19f5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x1a63 A[Catch: Exception -> 0x1b92, TRY_LEAVE, TryCatch #18 {Exception -> 0x1b92, blocks: (B:234:0x19f8, B:241:0x1a4b, B:243:0x1a63, B:250:0x1ab8, B:253:0x1ad3, B:259:0x1b27, B:261:0x1b2d, B:263:0x1b75, B:265:0x1b7c, B:266:0x1b7d, B:268:0x1b7f, B:270:0x1b86, B:271:0x1b87, B:273:0x1b89, B:275:0x1b90, B:276:0x1b91, B:254:0x1ae5, B:256:0x1af2, B:257:0x1b1c, B:244:0x1a77, B:246:0x1a84, B:247:0x1aae, B:235:0x1a07, B:237:0x1a14, B:238:0x1a3e), top: B:665:0x19f8, inners: #7, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1b92  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x206f  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x25bc  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x25bf  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x2c24 A[Catch: all -> 0x3b24, TRY_ENTER, TryCatch #2 {all -> 0x3b24, blocks: (B:5:0x0021, B:7:0x0027, B:8:0x0047, B:11:0x0056, B:13:0x005c, B:14:0x007c, B:21:0x01b6, B:23:0x01c6, B:24:0x01ed, B:28:0x0220, B:30:0x022d, B:31:0x025f, B:35:0x0317, B:37:0x0324, B:38:0x034e, B:40:0x0367, B:42:0x0374, B:43:0x039e, B:45:0x03a7, B:47:0x03bf, B:48:0x03f1, B:92:0x0842, B:94:0x084f, B:95:0x087c, B:116:0x0c88, B:118:0x0c95, B:119:0x0cbf, B:133:0x0d2b, B:135:0x0d38, B:136:0x0d62, B:138:0x0d7b, B:140:0x0d88, B:141:0x0db2, B:143:0x0dbb, B:145:0x0dd3, B:146:0x0e05, B:165:0x0fd5, B:167:0x0fe2, B:168:0x100a, B:182:0x121e, B:184:0x122b, B:185:0x1257, B:187:0x130d, B:189:0x131a, B:190:0x1346, B:199:0x1496, B:201:0x14a3, B:202:0x14cf, B:204:0x1590, B:206:0x159d, B:207:0x15c9, B:438:0x2305, B:440:0x230b, B:441:0x2333, B:504:0x2c24, B:506:0x2c36, B:507:0x2c62, B:514:0x2da4, B:516:0x2daa, B:517:0x2dce, B:532:0x2f78, B:534:0x2f7e, B:535:0x2fa6, B:542:0x3104, B:544:0x310a, B:545:0x3130, B:550:0x3292, B:552:0x32b6, B:553:0x32f2, B:558:0x345a, B:560:0x3467, B:561:0x3492, B:570:0x35bd, B:572:0x35c3, B:573:0x35eb, B:584:0x3726, B:586:0x372c, B:587:0x3754, B:592:0x38ac, B:594:0x38cf, B:595:0x3901, B:448:0x24ba, B:450:0x24c0, B:451:0x24e9, B:466:0x2685, B:468:0x268b, B:469:0x26b1, B:477:0x2827, B:479:0x282d, B:480:0x2855, B:487:0x29d0, B:489:0x29d6, B:490:0x29ff, B:284:0x1c26, B:286:0x1c33, B:287:0x1c5d, B:294:0x1c9a, B:296:0x1ca7, B:297:0x1cd9, B:304:0x1e97, B:306:0x1ea4, B:307:0x1ecd, B:223:0x17dc, B:225:0x17e9, B:226:0x1815, B:153:0x0eb5, B:155:0x0ecc, B:156:0x0efe, B:100:0x0939, B:102:0x0946, B:103:0x0970, B:55:0x04aa, B:57:0x04c1, B:58:0x04f3, B:69:0x05e9, B:71:0x0600, B:72:0x0632, B:79:0x06db, B:81:0x06f2, B:82:0x071e), top: B:648:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:615:0x3a73  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x3b12  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x204e A[EXC_TOP_SPLITTER, PHI: r4
  0x204e: PHI (r4v182 java.io.BufferedInputStream) = (r4v181 java.io.BufferedInputStream), (r4v511 java.io.BufferedInputStream) binds: [B:348:0x2066, B:322:0x202d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x2244 A[EXC_TOP_SPLITTER, PHI: r4
  0x2244: PHI (r4v193 java.io.BufferedInputStream) = (r4v192 java.io.BufferedInputStream), (r4v494 java.io.BufferedInputStream) binds: [B:431:0x2256, B:409:0x2223] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:733:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x06d5 A[PHI: r30
  0x06d5: PHI (r30v78 long) = (r30v75 long), (r30v75 long), (r30v79 long) binds: [B:74:0x06d2, B:64:0x05e1, B:50:0x04a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0925  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AEQbTJ$1908f70b(int i, int i2, java.lang.Object obj, int i3, boolean z) throws java.lang.Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        java.lang.String[] strArr;
        char[] cArr;
        char c;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        java.lang.Throwable th2;
        java.io.BufferedInputStream bufferedInputStream3;
        java.io.BufferedInputStream bufferedInputStream4;
        int i10;
        java.lang.Throwable th3;
        java.io.BufferedInputStream bufferedInputStream5;
        java.io.BufferedInputStream bufferedInputStream6;
        int i11;
        boolean z2;
        int i12;
        int i13;
        long j;
        int i14;
        char c2;
        java.lang.Object[] objArr;
        char c3;
        int i15;
        int i16;
        int i17;
        char c4;
        int i18;
        int i19;
        char c5;
        long j2;
        int i20;
        java.lang.Object[] objArr2;
        char c6;
        long j3;
        int i21;
        int i22;
        java.lang.Object[] objArr3;
        int i23;
        java.lang.Object[] objArr4;
        int i24;
        boolean z3;
        int i25;
        long j4;
        java.lang.Object obj2;
        int i26;
        long j5;
        long j6;
        long j7;
        int i27;
        char c7;
        int i28;
        int i29;
        int i30 = 2 % 2;
        int i31 = AEQbTJ;
        int i32 = (i31 ^ 121) + ((i31 & 121) << 1);
        djBIcL = i32 % 128;
        try {
            if (i32 % 2 == 0) {
                java.lang.Object objEZpvd = YY.EZpvd(764142643);
                if (objEZpvd == null) {
                    byte b = (byte) 49;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 3, b, (byte) (b & 7), objArr5);
                    objEZpvd = YY.EZpvd(121, 4, (char) 0, 699083087, false, (java.lang.String) objArr5[0], new java.lang.Class[0]);
                }
                ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, null)).longValue();
                throw null;
            }
            java.lang.Object objEZpvd2 = YY.EZpvd(764142643);
            if (objEZpvd2 == null) {
                byte b2 = (byte) 49;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((byte) 3, b2, (byte) (b2 & 7), objArr6);
                objEZpvd2 = YY.EZpvd(121, 4, (char) 0, 699083087, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
            }
            long jLongValue = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, null)).longValue();
            long j8 = 410130152;
            long j9 = (((long) 491) * j8) + (((long) (-489)) * jLongValue);
            long j10 = -1;
            long j11 = j8 ^ j10;
            long j12 = jLongValue ^ j10;
            long jMaxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
            long j13 = 490;
            long j14 = j9 + (((long) (-490)) * (j11 | j12 | (jMaxMemory ^ j10))) + ((((j12 | j8) ^ j10) | ((j12 | jMaxMemory) ^ j10)) * j13) + (j13 * j11) + ((long) (-694435826));
            int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
            int i33 = ((int) (j14 >> 32)) & (83436995 + (((~((-1319980696) | startElapsedRealtime)) | (-1537760190)) * 191) + (((~((~startElapsedRealtime) | (-1319980696))) | 67437570) * 191));
            int startElapsedRealtime2 = (int) android.os.Process.getStartElapsedRealtime();
            int i34 = ((int) j14) & (1342165314 + (((~((-1247332530) | startElapsedRealtime2)) | 189893880) * (-465)) + (((-1247332530) | (~(189893880 | startElapsedRealtime2))) * 930) + ((startElapsedRealtime2 | (-1074282498)) * 465));
            int i35 = (i33 & i34) | (i33 ^ i34);
            int i36 = djBIcL;
            int i37 = (i36 & 3) + (i36 | 3);
            AEQbTJ = i37 % 128;
            if (i37 % 2 != 0) {
                throw null;
            }
            if (i35 != 0) {
                java.lang.Object[] objArr7 = {new int[]{(~(i & 271)) & (i | 271)}, new int[]{i}, new int[1], null};
                int iFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                int i38 = (-2062259584) + (((~((~iFreeMemory) | (-390121789))) | 1423297616) * (-235)) + (((~((-390121789) | iFreeMemory)) | 1423297616) * (-470)) + (((~(iFreeMemory | (-50331949))) | 1083507776) * 235);
                int i39 = (i38 ^ 16) + ((i38 & 16) << 1) + i3;
                int i40 = i39 << 13;
                int i41 = (i39 | i40) & (~(i39 & i40));
                int i42 = i41 >>> 17;
                int i43 = (i41 | i42) & (~(i41 & i42));
                ((int[]) objArr7[2])[0] = i43 ^ (i43 << 5);
                return objArr7;
            }
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(new char[]{41630, 8661, 41708, 22135, 34536, 51070, 39889, 13004, 14831, 41075, 16011, 51651, 38111, 15683, 21946}, 0, objArr8);
            java.lang.Object[] objArr9 = {(java.lang.String) objArr8[0]};
            java.lang.Object objEZpvd3 = YY.EZpvd(1845277648);
            if (objEZpvd3 == null) {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b((byte) 5, (byte) 46, (byte) 0, objArr10);
                objEZpvd3 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr10[0], new java.lang.Class[]{java.lang.String.class});
            }
            java.lang.Object objInvoke = ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr9);
            if (objInvoke != null) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                c(new char[]{63368, 41902, 24574, 2822, 42822, 21126}, 21557, objArr11);
                java.lang.String str = (java.lang.String) objArr11[0];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                c(new char[]{63389, 31172, 60212, 23917, 52952, 12294, 41583, 5029}, 36433, objArr12);
                java.lang.Object[] objArr13 = {objInvoke, new java.lang.String[]{str, (java.lang.String) objArr12[0]}};
                java.lang.Object objEZpvd4 = YY.EZpvd(-1100697334);
                if (objEZpvd4 == null) {
                    byte b3 = (byte) 49;
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    b((byte) 3, b3, (byte) (b3 & 7), objArr14);
                    objEZpvd4 = YY.EZpvd(449, 5, (char) 22140, -1169916810, false, (java.lang.String) objArr14[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                }
                long jLongValue2 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr13)).longValue();
                long j15 = -1039974508;
                long j16 = j15 ^ j10;
                long j17 = i;
                long j18 = j17 ^ j10;
                long j19 = (((long) 55) * j15) + (((long) (-107)) * jLongValue2) + (((long) (-108)) * (((j16 | jLongValue2) ^ j10) | ((j18 | jLongValue2) ^ j10)));
                long j20 = 54;
                long j21 = ((jLongValue2 ^ j10) | j15) ^ j10;
                long j22 = j19 + ((((j16 | j17) ^ j10) | j21 | ((j18 | j15) ^ j10)) * j20) + (j20 * (j21 | j17)) + ((long) 2053981538);
                int i44 = (int) java.lang.Runtime.getRuntime().totalMemory();
                int i45 = ((int) (j22 >> 32)) & (((((1074045952 | r9) | (~(333142245 | i44))) * (-338)) - 607461974) + (((~(i44 | 1407188197)) | (~((-333142246) | (~i44)))) * 338));
                int i46 = ~i;
                int i47 = ((int) j22) & (((((~((-8922405) | i46)) | (~((-1054723) | i))) * 988) - 1106272243) + (((~(1427249283 | i)) | (-1436171688) | (~((-1054723) | i46))) * 988));
                if (((i45 & i47) | (i45 ^ i47)) != 0) {
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c(new char[]{63368, 53796, 48310, 34457, 24908, 19424, 5560, 61528, 55825, 42167, 36670, 26892, 13271, 7785, 63521, 49859, 44171, 30552, 20988, 15276, 1628, 57370, 51902}, 9649, objArr15);
                    java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                    java.lang.Object objEZpvd5 = YY.EZpvd(1845277648);
                    if (objEZpvd5 == null) {
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        b((byte) 5, (byte) 46, (byte) 0, objArr17);
                        objEZpvd5 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.Object objInvoke2 = ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr16);
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    a(new char[]{43012, 18725, 43126, 35541, 18462, 44942, 18291, 64546, 13158, 51358, 57897, 1847, 40519, 21941, 35155, 41473, 31053, 65186, 5145, 52487, 50217, 6671, 45936, 26867, 44858, 42820, 24171, 62435, 2567, 49269, 58696, 7872, 38161, 28003}, 0, objArr18);
                    java.lang.Object[] objArr19 = {(java.lang.String) objArr18[0]};
                    java.lang.Object objEZpvd6 = YY.EZpvd(1845277648);
                    if (objEZpvd6 == null) {
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        b((byte) 5, (byte) 46, (byte) 0, objArr20);
                        objEZpvd6 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.Object objInvoke3 = ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr19);
                    if (objInvoke2 != null) {
                        java.lang.Object[] objArr21 = {objInvoke2, 42};
                        java.lang.Object objEZpvd7 = YY.EZpvd(1485637403);
                        if (objEZpvd7 == null) {
                            byte b4 = (byte) 49;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            b((byte) 3, b4, (byte) (b4 & 7), objArr22);
                            objEZpvd7 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr22[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long jLongValue3 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd7).invoke(null, objArr21)).longValue();
                        long j23 = 97498817;
                        obj2 = objInvoke2;
                        j4 = j17;
                        long j24 = (int) java.lang.Runtime.getRuntime().totalMemory();
                        long j25 = j24 ^ j10;
                        long j26 = jLongValue3 ^ j10;
                        long j27 = (((long) 758) * j23) + (((long) (-756)) * jLongValue3) + (((long) (-757)) * (j23 | j25)) + (((long) 1514) * (((j26 | j23) | j24) ^ j10)) + (((long) 757) * ((((j23 ^ j10) | j26) ^ j10) | ((j26 | j25) ^ j10) | ((j24 | (jLongValue3 | j23)) ^ j10))) + ((long) 1230454713);
                        int iUptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                        int i48 = ~iUptimeMillis;
                        int i49 = ((int) (j27 >> 32)) & ((-1453938172) + (((~((-1444438830) | i48)) | (-7212419)) * 519) + (((~(i48 | (-524545))) | (~((-6687875) | iUptimeMillis))) * (-519)) + (((~(iUptimeMillis | (-7212419))) | 1444438829) * 519));
                        int i50 = ~(1942529055 | i);
                        if ((i49 | (((int) j27) & ((((-101481357) + (((-915211831) | i50) * (-220))) + ((i50 | (-2009966144)) * 220)) - 1007964770))) == 477111747) {
                            i4 = i;
                            if (Build.VERSION.SDK_INT > 33) {
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                c(new char[]{63445, 13832, 29856, 45916, 61833, 12384, 32286, 48306, 64310, 14746, 30832, 42731, 58501, 9013, 24981, 41031, 61167, 11423, 27409, 43432, 59473, 5880, 21858, 37639, 53687, 4203, 24286, 40308}, 49559, objArr23);
                                java.lang.Object[] objArr24 = {(java.lang.String) objArr23[0]};
                                java.lang.Object objEZpvd8 = YY.EZpvd(1229107605);
                                if (objEZpvd8 == null) {
                                    byte b5 = (byte) 49;
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    b((byte) 3, b5, (byte) (b5 & 7), objArr25);
                                    objEZpvd8 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (java.lang.String) objArr25[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long jLongValue4 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd8).invoke(null, objArr24)).longValue();
                                long j28 = 1922020719;
                                long j29 = jLongValue4 ^ j10;
                                long j30 = (((long) 758) * j28) + (((long) (-756)) * jLongValue4) + (((long) (-757)) * (j28 | j18)) + (((long) 1514) * (((j29 | j28) | j4) ^ j10)) + (((long) 757) * ((((jLongValue4 | j28) | j4) ^ j10) | (((j28 ^ j10) | j29) ^ j10) | ((j29 | j18) ^ j10))) + ((long) 105813567);
                                int iMyTid = android.os.Process.myTid();
                                int i51 = ~iMyTid;
                                int i52 = (~((-25160580) | i51)) | 22380928;
                                int i53 = ~(iMyTid | (-1409286181));
                                int i54 = ((int) (j30 >> 32)) & (416259814 + ((i52 | i53) * (-713)) + (i53 * 1426) + ((~((-1412065832) | i51)) * 713));
                                int iNextInt = new java.util.Random().nextInt(2060945423);
                                int i55 = ((int) j30) & ((-651676219) + (((~(1474248183 | iNextInt)) | 37021773) * (-366)) + (((~(iNextInt | 1476394495)) | 34875461) * 366));
                                i27 = 1;
                                if (i == 1) {
                                    i28 = 4;
                                    c7 = 0;
                                    java.lang.Object[] objArr26 = new java.lang.Object[i28];
                                    int[] iArr = new int[i27];
                                    objArr26[c7] = iArr;
                                    int[] iArr2 = new int[i27];
                                    objArr26[i27] = iArr2;
                                    objArr26[2] = new int[i27];
                                    int i56 = i4 ^ 260;
                                    int[] iArr3 = iArr2;
                                    int i57 = AEQbTJ;
                                    i29 = (i57 & 103) + (i57 | 103);
                                    djBIcL = i29 % 128;
                                    if (i29 % 2 != 0) {
                                        iArr3[0] = i4;
                                        iArr[0] = i56;
                                        objArr26[4] = null;
                                    } else {
                                        iArr3[0] = i4;
                                        iArr[0] = i56;
                                        objArr26[3] = null;
                                    }
                                    int i58 = ~((int) android.os.Process.getStartElapsedRealtime());
                                    int i59 = (-1441772052) + (((~(i58 | 802051948)) | (-1070497645)) * (-160)) + (((~(i58 | (-1011367457))) | 802051948) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
                                    int i60 = (i59 & 16) + (16 | i59);
                                    int iKWHzl = AbstractC31905mIg.KWHzl();
                                    int i61 = i60 * 1773;
                                    int i62 = -(-(i3 * (-885)));
                                    int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
                                    int i64 = ~i60;
                                    int i65 = ~i3;
                                    int i66 = ~((i64 & i65) | (i64 ^ i65));
                                    int i67 = ~((i65 & iKWHzl) | (i65 ^ iKWHzl));
                                    int i68 = (i66 & i67) | (i66 ^ i67);
                                    int i69 = ~iKWHzl;
                                    int i70 = (i69 ^ i60) | (i69 & i60);
                                    int i71 = -(-((i68 | (~((i70 & i3) | (i70 ^ i3)))) * 886));
                                    int i72 = (i63 & i71) + (i71 | i63);
                                    int i73 = ~((i69 ^ i3) | (i3 & i69));
                                    int i74 = ~iKWHzl;
                                    int i75 = ((i72 + (((i73 & i60) | (i60 ^ i73)) * (-1772))) - (~(-(-((~((i60 & i74) | (i74 ^ i60))) * 886))))) - 1;
                                    int i76 = (i75 << 13) ^ i75;
                                    int i77 = i76 >>> 17;
                                    int i78 = (i76 | i77) & (~(i76 & i77));
                                    int i79 = i78 << 5;
                                    ((int[]) objArr26[2])[0] = ((~i78) & i79) | ((~i79) & i78);
                                    return objArr26;
                                }
                            } else {
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                c(new char[]{63368, 53876, 48150, 34365, 24603, 19197, 5321, 65210, 55445, 41842, 36178, 22333, 12563}, 9697, objArr27);
                                java.lang.Object[] objArr28 = {(java.lang.String) objArr27[0]};
                                java.lang.Object objEZpvd9 = YY.EZpvd(1845277648);
                                if (objEZpvd9 == null) {
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    b((byte) 5, (byte) 46, (byte) 0, objArr29);
                                    objEZpvd9 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr29[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                java.lang.Object objInvoke4 = ((java.lang.reflect.Method) objEZpvd9).invoke(null, objArr28);
                                i27 = 1;
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c7 = 0;
                                a(new char[]{25008, 12840, 24961, 60524, 58088}, 0, objArr30);
                                if (objInvoke4.equals((java.lang.String) objArr30[0])) {
                                    i28 = 4;
                                    java.lang.Object[] objArr262 = new java.lang.Object[i28];
                                    int[] iArr4 = new int[i27];
                                    objArr262[c7] = iArr4;
                                    int[] iArr22 = new int[i27];
                                    objArr262[i27] = iArr22;
                                    objArr262[2] = new int[i27];
                                    int i562 = i4 ^ 260;
                                    int[] iArr32 = iArr22;
                                    int i572 = AEQbTJ;
                                    i29 = (i572 & 103) + (i572 | 103);
                                    djBIcL = i29 % 128;
                                    if (i29 % 2 != 0) {
                                    }
                                    int i582 = ~((int) android.os.Process.getStartElapsedRealtime());
                                    int i592 = (-1441772052) + (((~(i582 | 802051948)) | (-1070497645)) * (-160)) + (((~(i582 | (-1011367457))) | 802051948) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
                                    int i602 = (i592 & 16) + (16 | i592);
                                    int iKWHzl2 = AbstractC31905mIg.KWHzl();
                                    int i612 = i602 * 1773;
                                    int i622 = -(-(i3 * (-885)));
                                    int i632 = ((i612 | i622) << 1) - (i612 ^ i622);
                                    int i642 = ~i602;
                                    int i652 = ~i3;
                                    int i662 = ~((i642 & i652) | (i642 ^ i652));
                                    int i672 = ~((i652 & iKWHzl2) | (i652 ^ iKWHzl2));
                                    int i682 = (i662 & i672) | (i662 ^ i672);
                                    int i692 = ~iKWHzl2;
                                    int i702 = (i692 ^ i602) | (i692 & i602);
                                    int i712 = -(-((i682 | (~((i702 & i3) | (i702 ^ i3)))) * 886));
                                    int i722 = (i632 & i712) + (i712 | i632);
                                    int i732 = ~((i692 ^ i3) | (i3 & i692));
                                    int i742 = ~iKWHzl2;
                                    int i752 = ((i722 + (((i732 & i602) | (i602 ^ i732)) * (-1772))) - (~(-(-((~((i602 & i742) | (i742 ^ i602))) * 886))))) - 1;
                                    int i762 = (i752 << 13) ^ i752;
                                    int i772 = i762 >>> 17;
                                    int i782 = (i762 | i772) & (~(i762 & i772));
                                    int i792 = i782 << 5;
                                    ((int[]) objArr262[2])[0] = ((~i782) & i792) | ((~i792) & i782);
                                    return objArr262;
                                }
                            }
                        }
                    } else {
                        j4 = j17;
                        obj2 = objInvoke2;
                    }
                    if (objInvoke3 != null) {
                        java.lang.Object[] objArr31 = {objInvoke3, 42};
                        java.lang.Object objEZpvd10 = YY.EZpvd(1485637403);
                        if (objEZpvd10 == null) {
                            byte b6 = (byte) 49;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            b((byte) 3, b6, (byte) (b6 & 7), objArr32);
                            objEZpvd10 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr32[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long jLongValue5 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd10).invoke(null, objArr31)).longValue();
                        int i80 = djBIcL;
                        int i81 = (i80 & 33) + (i80 | 33);
                        AEQbTJ = i81 % 128;
                        if (i81 % 2 != 0) {
                            long j31 = 806681035;
                            long j32 = 503;
                            long j33 = (j32 * j31) + (j32 * jLongValue5);
                            long j34 = -502;
                            long j35 = j31 | jLongValue5;
                            long j36 = j31 ^ j10;
                            long j37 = (j36 | (jLongValue5 ^ j10)) ^ j10;
                            i26 = i46;
                            long jMyPid = android.os.Process.myPid();
                            long j38 = j36 | (jMyPid ^ j10);
                            long j39 = (j35 | jMyPid) ^ j10;
                            j7 = j33 + (j34 * j35) + (j34 * (j37 | (j38 ^ j10) | j39)) + (((long) 502) * (((jLongValue5 | j38) ^ j10) | j39)) + ((long) 521272495);
                        } else {
                            i26 = i46;
                            long j40 = 984897551;
                            long j41 = -167;
                            long j42 = jLongValue5 ^ j10;
                            j7 = (j41 * j40) + (j41 * jLongValue5) + (((long) 336) * ((((j40 ^ j10) | j42) ^ j10) | ((j42 | j4) ^ j10))) + (((long) (-168)) * (((jLongValue5 | j40) ^ j10) | ((j40 | j4) ^ j10))) + (((long) CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256) * (j42 | ((j18 | j40) ^ j10))) + ((long) 343055979);
                        }
                        int i82 = (int) (j7 >> 32);
                        int i83 = ~((int) android.os.SystemClock.elapsedRealtime());
                        if (((i82 & ((-802173004) + (((-747131670) | i83) * (-369)) + (((~(1036604213 | i83)) | (-1821136672)) * (-369)) + (((~(r3 | (-1036604214))) | 289472544 | (~(i83 | (-1074005003)))) * 369))) | (((int) j7) & ((-190086106) + (((~((-1613496918) | i)) | (-176270508)) * (-465)) + (((-1613496918) | (~((-176270508) | i))) * 930) + ((i | (-2)) * 465)))) != 477111747) {
                        }
                    } else {
                        i26 = i46;
                    }
                    if (obj2 != null) {
                        java.lang.Object[] objArr33 = {obj2, 42};
                        java.lang.Object objEZpvd11 = YY.EZpvd(1485637403);
                        if (objEZpvd11 == null) {
                            byte b7 = (byte) 49;
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            b((byte) 3, b7, (byte) (b7 & 7), objArr34);
                            objEZpvd11 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr34[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long jLongValue6 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd11).invoke(null, objArr33)).longValue();
                        long j43 = 305297690;
                        long j44 = -712;
                        long j45 = jLongValue6 ^ j10;
                        long startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
                        long j46 = startUptimeMillis ^ j10;
                        long j47 = (j46 | j43) ^ j10;
                        int i84 = ~android.os.Process.myTid();
                        int i85 = ((int) (((((((((long) (-711)) * j43) + (((long) 713) * jLongValue6)) + ((((j45 | j43) ^ j10) | j47) * j44)) + (j44 * ((((j45 | j46) | j43) ^ j10) | (((jLongValue6 | j43) | startUptimeMillis) ^ j10)))) + (((long) 712) * (j45 | j47))) + ((long) 1022655840)) >> 32)) & (145746503 + (((~(1527811327 | i84)) | 1329929557) * (-983)) + (((~(i84 | 1329929557)) | 269516970) * 983));
                        int iUptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                        if ((i85 | (((int) r10) & ((-635053948) + (((-335549570) | iUptimeMillis2) * (-627)) + (((~((-1274366847) | iUptimeMillis2)) | 1583374039) * (-627)) + (((~(iUptimeMillis2 | 1583374039)) | (~((~iUptimeMillis2) | 1274366846))) * 627)))) != -1032769152) {
                        }
                        if (Build.VERSION.SDK_INT > 33) {
                        }
                    }
                    if (objInvoke3 != null) {
                        java.lang.Object[] objArr35 = {objInvoke3, 42};
                        java.lang.Object objEZpvd12 = YY.EZpvd(1485637403);
                        if (objEZpvd12 == null) {
                            byte b8 = (byte) 49;
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            b((byte) 3, b8, (byte) (b8 & 7), objArr36);
                            objEZpvd12 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr36[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long jLongValue7 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd12).invoke(null, objArr35)).longValue();
                        int i86 = djBIcL + 105;
                        AEQbTJ = i86 % 128;
                        if (i86 % 2 != 0) {
                            long j48 = 290306951;
                            long j49 = -712;
                            long j50 = jLongValue7 ^ j10;
                            long jFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                            long j51 = jFreeMemory ^ j10;
                            long j52 = (j51 | j48) ^ j10;
                            j5 = (((long) (-711)) * j48) + (((long) 713) * jLongValue7) + ((((j50 | j48) ^ j10) | j52) * j49) + (j49 * ((((j50 | j51) | j48) ^ j10) | ((jFreeMemory | (j48 | jLongValue7)) ^ j10))) + (((long) 712) * (j50 | j52)) + ((long) 1037646579);
                            j6 = j5 >> 50;
                        } else {
                            long j53 = 300182498;
                            long j54 = jLongValue7 ^ j10;
                            long jMyUid = android.os.Process.myUid();
                            long j55 = j53 | jMyUid;
                            j5 = (((long) (-1335)) * j53) + (((long) (-667)) * jLongValue7) + (((long) (-668)) * (j54 | (j55 ^ j10))) + (((long) 1336) * (j53 | ((jMyUid | j54) ^ j10))) + (((long) 668) * (j55 | j54)) + ((long) 1027771032);
                            j6 = j5 >> 32;
                        }
                        i4 = i;
                        int i87 = ((int) j6) & ((-818884594) + ((i26 | 402675729) * 1324) + (((~(941652113 | i4)) | (~(495574297 | i4))) * (-1324)) + 1689390512);
                        int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                        int i88 = ~elapsedCpuTime;
                        int i89 = (-1905160647) + (((~((-1555309408) | i88)) | 1285554774 | (~((-1302431479) | i88)) | (~(1572186111 | elapsedCpuTime))) * (-84));
                        int i90 = (~(elapsedCpuTime | (-1302431479))) | 1555309407;
                        int i91 = ~(i88 | 1302431478);
                        int i92 = ((int) j5) & (i89 + ((i90 | i91) * (-84)) + (((-1572186112) | i91) * 84));
                        if (((i87 & i92) | (i87 ^ i92)) == 542074309) {
                            if (Build.VERSION.SDK_INT > 33) {
                            }
                        }
                    }
                    i4 = i;
                } else {
                    i4 = i;
                }
            } else {
                i4 = i;
            }
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            a(new char[]{7332, 11768, 7365, 45615, 8828, 52056, 32709, 38511, 34783, 44105, 56014, 27987}, 0, objArr37);
            java.lang.String str2 = (java.lang.String) objArr37[0];
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            c(new char[]{63387, 19207, 36500, 49726, 1448, 22870}, 48271, objArr38);
            java.lang.String str3 = (java.lang.String) objArr38[0];
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            c(new char[]{63390, 7228, 8409, 13448, 22835, 28127, 29084}, 60331, objArr39);
            java.lang.String str4 = (java.lang.String) objArr39[0];
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            c(new char[]{63389, 18223, 38650, 58778, 13659, 34045, 54186, 9032, 29184}, 45233, objArr40);
            java.lang.String str5 = (java.lang.String) objArr40[0];
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            c(new char[]{63379, 29583, 65460, 31658, 59346, 25542}, 33809, objArr41);
            java.lang.String str6 = (java.lang.String) objArr41[0];
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            c(new char[]{63379, 20825, 47625, 1001, 27875, 46495, 8017, 30723, 49639, 10920, 29654, 56647, 9733}, 42701, objArr42);
            java.lang.String str7 = (java.lang.String) objArr42[0];
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            c(new char[]{63379, 40992, 22756, 61578, 43358}, 22453, objArr43);
            java.lang.String str8 = (java.lang.String) objArr43[0];
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            a(new char[]{63354, 61763, 63251, 56181, 28116, 6135, 5784, 55786, 27660, 28836}, 0, objArr44);
            java.lang.String str9 = (java.lang.String) objArr44[0];
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            c(new char[]{63379, 12286}, 55411, objArr45);
            java.lang.String str10 = (java.lang.String) objArr45[0];
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            c(new char[]{63382, 43008, 18615, 59701, 35275, 10849, 51959, 27264, 2849, 43955, 19462, 60654, 36210, 11530, 52654, 28213}, 24469, objArr46);
            java.lang.String str11 = (java.lang.String) objArr46[0];
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            c(new char[]{63382, 47024, 30679, 14305, 63247, 46884, 30528, 14039, 63136, 46804}, 16421, objArr47);
            java.lang.String str12 = (java.lang.String) objArr47[0];
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            a(new char[]{58046, 32442, 58062, 15730, 1544, 38924, 61589, 45607, 31196, 65295, 21892, 18751}, 0, objArr48);
            java.lang.String str13 = (java.lang.String) objArr48[0];
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            c(new char[]{63370, 34891, 2067, 35029, 2197, 35162, 2308, 35267, 2439, 35394, 2576, 35583}, 32707, objArr49);
            java.lang.String str14 = (java.lang.String) objArr49[0];
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            a(new char[]{42703, 18198, 42687, 42141, 44545, 41376, 27002, 6699, 15804, 50861, 52329, 57649, 37002, 23441, 42817, 17422, 30603, 61582}, 0, objArr50);
            java.lang.String str15 = (java.lang.String) objArr50[0];
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            a(new char[]{43547, 4015, 43625, 64337, 61809, 59662, 14004, 17746, 12670, 36373, 37821}, 0, objArr51);
            java.lang.String str16 = (java.lang.String) objArr51[0];
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            a(new char[]{58034, 48721, 58049, 3844, 42077, 22781, 49891, 4198, 31183, 16356, 26604}, 0, objArr52);
            java.lang.String str17 = (java.lang.String) objArr52[0];
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            a(new char[]{54661, 58730, 54774, 65110, 23472, 991, 13234, 61333, 20193, 25819, 38653}, 0, objArr53);
            java.lang.String str18 = (java.lang.String) objArr53[0];
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            c(new char[]{63369, 17134}, 46439, objArr54);
            java.lang.String str19 = (java.lang.String) objArr54[0];
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            a(new char[]{57672, 39326, 57659, 39702, 61144, 32558, 22271, 23270, 31276, 6165, 62457, 41453, 55068, 34066, 39137, 1240, 12311, 11785, 1477, 27589, 36207, 51967, 41648, 52768}, 0, objArr55);
            java.lang.String str20 = (java.lang.String) objArr55[0];
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            c(new char[]{63369, 31365, 60830, 20666, 50101, 13992}, 36107, objArr56);
            java.lang.String str21 = (java.lang.String) objArr56[0];
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            a(new char[]{2197, 40815, 2278, 32198, 35058, 31198}, 0, objArr57);
            java.lang.String str22 = (java.lang.String) objArr57[0];
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            a(new char[]{10513, 11359, 10594, 42470, 44551, 51962, 26624, 6690, 45685, 44514, 52484, 57662, 8003, 12438, 42557, 17439, 63552, 39903, 15147, 11016}, 0, objArr58);
            java.lang.String str23 = (java.lang.String) objArr58[0];
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            c(new char[]{63374, 25527, 57317, 19236, 42851, 4785, 36577, 64055, 22122}, 37951, objArr59);
            java.lang.String str24 = (java.lang.String) objArr59[0];
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            a(new char[]{29031, 33680, 28947, 11568, 44187, 25894, 57561, 6324, 59922, 564, 17865, 58291, 18223, 40770}, 0, objArr60);
            java.lang.String str25 = (java.lang.String) objArr60[0];
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            c(new char[]{63374, 52187, 36669, 17248, 1747, 55831, 40551, 20938, 5398, 59764, 44274}, 15443, objArr61);
            java.lang.String str26 = (java.lang.String) objArr61[0];
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            c(new char[]{63375, 12099, 17955, 32022, 38088, 52141, 58031, 6770, 12588, 26643, 36851}, 55511, objArr62);
            java.lang.String str27 = (java.lang.String) objArr62[0];
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            a(new char[]{56698, 60101, 56591, 54735, 51896, 3183, 6192, 32413, 17924, 27509, 48392, 34198, 60223, 63046, 54840, 8381, 3108, 23895, 19224}, 0, objArr63);
            java.lang.String str28 = (java.lang.String) objArr63[0];
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            c(new char[]{63375, 48557, 25599, 10552, 57200, 33923, 19187, 61446, 42571, 27542, 4514, 51174, 36154, 13164}, 19001, objArr64);
            java.lang.String[] strArr2 = {str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, (java.lang.String) objArr64[0]};
            java.lang.Object[] objArr65 = new java.lang.Object[1];
            a(new char[]{41630, 8661, 41708, 22135, 34536, 51070, 39889, 13004, 14831, 41075, 16011, 51651, 38111, 15683, 21946}, 0, objArr65);
            java.lang.Object[] objArr66 = {(java.lang.String) objArr65[0]};
            java.lang.Object objEZpvd13 = YY.EZpvd(1845277648);
            if (objEZpvd13 == null) {
                java.lang.Object[] objArr67 = new java.lang.Object[1];
                b((byte) 5, (byte) 46, (byte) 0, objArr67);
                objEZpvd13 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr67[0], new java.lang.Class[]{java.lang.String.class});
            }
            java.lang.String str29 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd13).invoke(null, objArr66);
            if (str29 != null) {
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                c(new char[]{63368, 41902, 24574, 2822, 42822, 21126}, 21557, objArr68);
                java.lang.String str30 = (java.lang.String) objArr68[0];
                java.lang.Object[] objArr69 = new java.lang.Object[1];
                c(new char[]{63389, 31172, 60212, 23917, 52952, 12294, 41583, 5029}, 36433, objArr69);
                java.lang.String[] strArr3 = {str30, (java.lang.String) objArr69[0]};
                int i93 = 0;
                while (true) {
                    if (i93 >= 2) {
                        i24 = 1;
                        z3 = false;
                        break;
                    }
                    if (str29.contains(strArr3[i93])) {
                        i24 = 1;
                        z3 = true;
                        break;
                    }
                    int i94 = i93 - 58;
                    i93 = ((i94 | 59) << 1) - (i94 ^ 59);
                }
                if (!z3) {
                    i5 = i4;
                } else {
                    java.lang.Object[] objArr70 = new java.lang.Object[i24];
                    c(new char[]{63368, 53796, 48310, 34457, 24908, 19424, 5560, 61528, 55825, 42167, 36670, 26892, 13271, 7785, 63521, 49859, 44171, 30552, 20988, 15276, 1628, 57370, 51902}, 9649, objArr70);
                    java.lang.Object[] objArr71 = {(java.lang.String) objArr70[0]};
                    java.lang.Object objEZpvd14 = YY.EZpvd(1845277648);
                    if (objEZpvd14 == null) {
                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                        b((byte) 5, (byte) 46, (byte) 0, objArr72);
                        objEZpvd14 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr72[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.Object objInvoke5 = ((java.lang.reflect.Method) objEZpvd14).invoke(null, objArr71);
                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                    a(new char[]{43012, 18725, 43126, 35541, 18462, 44942, 18291, 64546, 13158, 51358, 57897, 1847, 40519, 21941, 35155, 41473, 31053, 65186, 5145, 52487, 50217, 6671, 45936, 26867, 44858, 42820, 24171, 62435, 2567, 49269, 58696, 7872, 38161, 28003}, 0, objArr73);
                    java.lang.Object[] objArr74 = {(java.lang.String) objArr73[0]};
                    java.lang.Object objEZpvd15 = YY.EZpvd(1845277648);
                    if (objEZpvd15 == null) {
                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                        b((byte) 5, (byte) 46, (byte) 0, objArr75);
                        objEZpvd15 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr75[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.Object objInvoke6 = ((java.lang.reflect.Method) objEZpvd15).invoke(null, objArr74);
                    if (objInvoke5 != null) {
                        java.lang.Object[] objArr76 = {objInvoke5, 42};
                        java.lang.Object objEZpvd16 = YY.EZpvd(1485637403);
                        if (objEZpvd16 == null) {
                            byte b9 = (byte) 49;
                            java.lang.Object[] objArr77 = new java.lang.Object[1];
                            b((byte) 3, b9, (byte) (b9 & 7), objArr77);
                            objEZpvd16 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr77[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long jLongValue8 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd16).invoke(null, objArr76)).longValue();
                        long j56 = 774043857;
                        long j57 = -560;
                        long startUptimeMillis2 = (int) android.os.Process.getStartUptimeMillis();
                        long j58 = startUptimeMillis2 ^ j10;
                        long j59 = (((long) (-559)) * j56) + (((long) 561) * jLongValue8) + (((j58 | j56) ^ j10) * j57) + (j57 * ((((jLongValue8 ^ j10) | j56) | startUptimeMillis2) ^ j10)) + (((long) 560) * ((((j56 ^ j10) | jLongValue8) ^ j10) | ((j58 | jLongValue8) ^ j10))) + ((long) 553909673);
                        i5 = i;
                        int i95 = (-484646000) + (((~(1652275170 | i5)) | (-1744566259)) * 345);
                        int i96 = ~i5;
                        if (((((int) (j59 >> 32)) & (i95 + (((~(1652275170 | i96)) | 539100544) * 345) + ((~(1744566258 | i5)) * 345))) | (((int) j59) & ((-2038855459) + (((~((-176695947) | i5)) | (~(2059058879 | i96))) * 920) + (((~((-445136524) | i96)) | 176695946) * 920) + (((~(i96 | (-176695947))) | (~((-268440578) | i5)) | (~(2059058879 | i5))) * 920)))) == 477111747) {
                            int i97 = 0;
                            int i98 = 0;
                            while (i97 < 28) {
                                java.lang.String str31 = strArr2[i97];
                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                a(new char[]{39930, 18402, 39893, 8613, 12764, 41301, 60500, 34275, 158, 50771, 18768, 32431, 44472, 23407, 8803, 56223}, 0, objArr78);
                                java.lang.Object[] objArr79 = {((java.lang.String) objArr78[0]).concat(java.lang.String.valueOf(str31))};
                                java.lang.Object objEZpvd17 = YY.EZpvd(-924280847);
                                if (objEZpvd17 == null) {
                                    byte b10 = (byte) 0;
                                    byte b11 = b10;
                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                    b(b10, b11, b11, objArr80);
                                    objEZpvd17 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr80[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long jLongValue9 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd17).invoke(null, objArr79)).longValue();
                                long j60 = -21754915;
                                long j61 = j60 ^ j10;
                                long j62 = jLongValue9 ^ j10;
                                int i99 = i97;
                                int i100 = i98;
                                long jMaxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                long j63 = (((long) 592) * j60) + (((long) (-590)) * jLongValue9) + (((long) (-1182)) * ((j61 | jLongValue9) ^ j10)) + (((long) (-591)) * ((((j61 | j62) | (jMaxMemory2 ^ j10)) ^ j10) | ((jLongValue9 | j60) ^ j10))) + (((long) 591) * (jMaxMemory2 | j61 | j62)) + ((long) (-289413179));
                                int iMyUid = android.os.Process.myUid();
                                int i101 = ~iMyUid;
                                int i102 = (~((-491745972) | i101)) | 407528115;
                                int i103 = ~(iMyUid | 1029698295);
                                int i104 = ((int) (j63 >> 32)) & (((i102 | i103) * (-252)) + 1055096286 + ((i103 | (~(i101 | (-84217857)))) * 252));
                                int iNextInt2 = new java.util.Random().nextInt();
                                int i105 = ~iNextInt2;
                                int i106 = (-1905160647) + (((~((-1229675216) | i105)) | 1091193478 | (~((-1628065671) | i105)) | (~(1766547407 | iNextInt2))) * (-84));
                                int i107 = (~(iNextInt2 | (-1628065671))) | 1229675215;
                                int i108 = ~(i105 | 1628065670);
                                int i109 = ((int) j63) & (i106 + ((i107 | i108) * (-84)) + (((-1766547408) | i108) * 84));
                                if (((i104 & i109) | (i104 ^ i109)) == 0) {
                                    int i110 = djBIcL;
                                    int i111 = ((i110 | 25) << 1) - (i110 ^ 25);
                                    AEQbTJ = i111 % 128;
                                    int i112 = i111 % 2;
                                    i25 = 0;
                                } else {
                                    i25 = 1;
                                }
                                int i113 = i25 * (-183);
                                int i114 = i100 * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384;
                                int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
                                int i116 = ~i25;
                                int i117 = -(-(((i100 ^ i116) | (i100 & i116)) * (-368)));
                                int i118 = (i115 ^ i117) + ((i117 & i115) << 1);
                                int i119 = ~i100;
                                int i120 = ~i5;
                                int i121 = i118 + (((i119 & i25) | (i25 ^ i119) | i120) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
                                int i122 = ~i100;
                                int i123 = ~((i116 & i122) | (i116 ^ i122));
                                int i124 = ~((i120 ^ i25) | (i120 & i25));
                                int i125 = (i123 & i124) | (i123 ^ i124);
                                int i126 = ~((i25 & i100) | (i25 ^ i100));
                                int i127 = ((i126 & i125) | (i125 ^ i126)) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
                                i98 = (i121 & i127) + (i127 | i121);
                                int i128 = (i99 ^ (-40)) + ((i99 & (-40)) << 1);
                                i97 = ((i128 & 41) << 1) + (i128 ^ 41);
                            }
                            if (i98 >= 25.2d) {
                                java.lang.Object[] objArr81 = {new int[]{i5 ^ 261}, new int[]{i5}, new int[1], null};
                                int i129 = ((956991010 + (((~((-337854998) | i5)) | (~(1475564407 | i5))) * 69)) + ((((~((-371413526) | i5)) | 33558528) | (~(i5 | 1442005879))) * (-69))) - 1123000454;
                                int iKWHzl3 = AbstractC31905mIg.KWHzl();
                                int i130 = i129 * (-167);
                                int i131 = -(-(i3 * (-167)));
                                int i132 = ((i130 | i131) << 1) - (i130 ^ i131);
                                int i133 = ~i129;
                                int i134 = ~i3;
                                int i135 = ~((i133 & i134) | (i133 ^ i134));
                                int i136 = ~((i134 & iKWHzl3) | (i134 ^ iKWHzl3));
                                int i137 = -(-(((i135 & i136) | (i135 ^ i136)) * 336));
                                int i138 = ((i132 | i137) << 1) - (i137 ^ i132);
                                int i139 = ~((i129 ^ i3) | (i129 & i3));
                                int i140 = ~((i129 ^ iKWHzl3) | (i129 & iKWHzl3));
                                int i141 = i138 + (((i139 & i140) | (i139 ^ i140)) * (-168));
                                int i142 = ~i3;
                                int i143 = ~iKWHzl3;
                                int i144 = ~((i143 & i129) | (i143 ^ i129));
                                int i145 = ((i144 & i142) | (i142 ^ i144)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256;
                                int i146 = (i141 & i145) + (i145 | i141);
                                int i147 = i146 << 13;
                                int i148 = (i147 | i146) & (~(i146 & i147));
                                int i149 = i148 >>> 17;
                                int i150 = AEQbTJ;
                                int i151 = ((i150 | 59) << 1) - (i150 ^ 59);
                                djBIcL = i151 % 128;
                                int i152 = i151 % 2;
                                int i153 = ((~i148) & i149) | ((~i149) & i148);
                                int i154 = i153 << 5;
                                ((int[]) objArr81[2])[0] = (i153 | i154) & (~(i153 & i154));
                                return objArr81;
                            }
                        }
                    } else {
                        i5 = i4;
                    }
                    if (objInvoke6 != null) {
                        java.lang.Object[] objArr82 = {objInvoke6, 42};
                        java.lang.Object objEZpvd18 = YY.EZpvd(1485637403);
                        if (objEZpvd18 == null) {
                            byte b12 = (byte) 49;
                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                            b((byte) 3, b12, (byte) (b12 & 7), objArr83);
                            objEZpvd18 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr83[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long jLongValue10 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd18).invoke(null, objArr82)).longValue();
                        long j64 = -125825302;
                        long j65 = 130;
                        long j66 = jLongValue10 ^ j10;
                        long j67 = i5;
                        long j68 = (((long) (-129)) * j64) + (((long) com.ibm.icu.text.DateFormat.RELATIVE_SHORT) * jLongValue10) + ((((j66 | (j67 ^ j10)) | j64) ^ j10) * j65);
                        long j69 = j66 | j64;
                        long j70 = j68 + (((long) (-260)) * (j69 ^ j10)) + (j65 * (((jLongValue10 | (j64 ^ j10)) ^ j10) | ((j69 | j67) ^ j10))) + ((long) 1453778832);
                        int i155 = ((int) (j70 >> 32)) & ((((-1771464918) + (((~((-1730188423) | i5)) | 1711308804) * 576)) + (((~((~i5) | (-18879619))) | (-2004270816)) * 576)) - 2128606976);
                        int i156 = djBIcL;
                        int i157 = (i156 & 79) + (i156 | 79);
                        AEQbTJ = i157 % 128;
                        if (i157 % 2 != 0) {
                            android.os.Process.getStartUptimeMillis();
                            throw null;
                        }
                        int iElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                        int i158 = ~iElapsedRealtime;
                        int i159 = ((int) j70) & (1453938690 + (((~(478502683 | i158)) | (-958723727)) * 519) + (((~(i158 | (-555786373))) | (~((-402937355) | iElapsedRealtime))) * (-519)) + (((~(iElapsedRealtime | (-958723727))) | (-478502684)) * 519));
                        if (((i155 & i159) | (i155 ^ i159)) == 477111747) {
                        }
                    }
                }
            }
            java.lang.Object[] objArr84 = new java.lang.Object[1];
            a(new char[]{7235, 27095, 7276, 48855, 37362, 36704, 29478, 9677, 34684, 59493, 54844, 56961, 10768, 30038, 48403, 31735, 52509, 56918, 8215, 5281, 28774, 15037, 34681, 45329, 7009, 34720, 27242}, 0, objArr84);
            java.lang.Object[] objArr85 = {(java.lang.String) objArr84[0]};
            java.lang.Object objEZpvd19 = YY.EZpvd(-1763027797);
            if (objEZpvd19 == null) {
                byte b13 = (byte) 49;
                java.lang.Object[] objArr86 = new java.lang.Object[1];
                b((byte) 3, b13, (byte) (b13 & 7), objArr86);
                objEZpvd19 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (java.lang.String) objArr86[0], new java.lang.Class[]{java.lang.String.class});
            }
            long jLongValue11 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd19).invoke(null, objArr85)).longValue();
            long j71 = -253770811;
            long j72 = (((long) 866) * j71) + (((long) (-864)) * jLongValue11);
            long j73 = jLongValue11 ^ j10;
            long j74 = (int) java.lang.Runtime.getRuntime().totalMemory();
            long j75 = j74 ^ j10;
            long j76 = 865;
            long j77 = j72 + (((long) (-865)) * (j73 | (((j71 ^ j10) | j75) ^ j10))) + (((j74 | j71) ^ j10) * j76) + (j76 * (((j73 | j75) ^ j10) | ((j75 | j71) ^ j10))) + ((long) 611269094);
            int iMyTid2 = android.os.Process.myTid();
            int i160 = ~iMyTid2;
            int i161 = ((int) (j77 >> 32)) & ((-802173004) + (((-43436634) | i160) * (-369)) + (((~(113172475 | i160)) | 1550398886) * (-369)) + (((~(iMyTid2 | (-113172476))) | 69735842 | (~(i160 | 1593835519))) * 369));
            int i162 = ~((~((int) android.os.SystemClock.uptimeMillis())) | (-1288225793));
            int i163 = ((int) j77) & (((2167209 | i162) * (-374)) + 943955351 + ((i162 | (-1290393002)) * 374));
            java.lang.Object[] objArr87 = new java.lang.Object[1];
            c(new char[]{63445, 60665, 49518, 42444, 39509, 32490, 21307, 14266, 11278, 151, 58795, 55928, 48874, 37708, 30660, 27698, 16569}, 7027, objArr87);
            java.lang.Object[] objArr88 = {(java.lang.String) objArr87[0]};
            java.lang.Object objEZpvd20 = YY.EZpvd(-1763027797);
            if (objEZpvd20 == null) {
                byte b14 = (byte) 49;
                java.lang.Object[] objArr89 = new java.lang.Object[1];
                b((byte) 3, b14, (byte) (b14 & 7), objArr89);
                objEZpvd20 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (java.lang.String) objArr89[0], new java.lang.Class[]{java.lang.String.class});
            }
            long jLongValue12 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd20).invoke(null, objArr88)).longValue();
            long j78 = -292128626;
            long j79 = -406;
            long j80 = jLongValue12 ^ j10;
            long elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
            long j81 = elapsedCpuTime2 ^ j10;
            long j82 = (((long) (-405)) * j78) + (((long) 407) * jLongValue12) + ((((j80 | elapsedCpuTime2) ^ j10) | (((j81 | j78) | jLongValue12) ^ j10)) * j79) + (j79 * (((j80 | j81) | j78) ^ j10)) + (((long) WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED) * (((elapsedCpuTime2 | (j78 ^ j10)) ^ j10) | ((j81 | jLongValue12) ^ j10))) + ((long) 649626909);
            int i164 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
            int i165 = ((int) (j82 >> 32)) & (1437662110 + (((-33882133) | i164) * 494) + (((~(i164 | (-906319125))) | (-1112866901)) * 494));
            int iFreeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i166 = 1695074639 + (((-1761032019) | iFreeMemory2) * (-50));
            int i167 = ~((-319340713) | iFreeMemory2);
            int i168 = ~iFreeMemory2;
            int i169 = ((int) j82) & (i166 + ((i167 | (~((-4464897) | i168))) * 50) + (((~(i168 | (-1761032019))) | (~((-323805609) | i168)) | 4464896) * 50));
            if (j > 0 && j > 0) {
                int i170 = AEQbTJ + 63;
                djBIcL = i170 % 128;
                int i171 = i170 % 2;
                if (j - 3 < j) {
                    java.lang.Object[] objArr90 = {new int[]{i5 ^ 247}, new int[]{i5}, new int[1], null};
                    int i172 = ~((~((int) android.os.Process.getStartUptimeMillis())) | 994310935);
                    int i173 = ((184639746 | i172) * (-970)) + 1123308430 + ((i172 | 809671189) * 970);
                    int i174 = -(-(((i173 | 16) << 1) - (i173 ^ 16)));
                    int i175 = (i3 & i174) + (i174 | i3);
                    int i176 = i175 << 13;
                    int i177 = (i176 & (~i175)) | ((~i176) & i175);
                    int i178 = i177 >>> 17;
                    int i179 = ((~i177) & i178) | ((~i178) & i177);
                    int i180 = i179 << 5;
                    ((int[]) objArr90[2])[0] = (i179 | i180) & (~(i179 & i180));
                    return objArr90;
                }
            }
            java.lang.Object[] objArr91 = new java.lang.Object[1];
            a(new char[]{7235, 27095, 7276, 48855, 37362, 36704, 29478, 9677, 34684, 59493, 54844, 56961, 10768, 30038, 48403, 31735, 52509, 56918, 8215, 5281, 28774, 15037, 34681, 45329, 7009, 34720, 27242}, 0, objArr91);
            java.lang.Object[] objArr92 = {(java.lang.String) objArr91[0]};
            java.lang.Object objEZpvd21 = YY.EZpvd(-1763027797);
            if (objEZpvd21 == null) {
                byte b15 = (byte) 49;
                java.lang.Object[] objArr93 = new java.lang.Object[1];
                b((byte) 3, b15, (byte) (b15 & 7), objArr93);
                objEZpvd21 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (java.lang.String) objArr93[0], new java.lang.Class[]{java.lang.String.class});
            }
            long jLongValue13 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd21).invoke(null, objArr92)).longValue();
            long j83 = -1467381965;
            long j84 = -445;
            long j85 = (j84 * j83) + (j84 * jLongValue13);
            long j86 = 446;
            long j87 = j83 ^ j10;
            long j88 = jLongValue13 ^ j10;
            long j89 = (j87 | j88) ^ j10;
            long jFreeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
            long j90 = j85 + ((j89 | ((j88 | (jFreeMemory2 ^ j10)) ^ j10)) * j86) + ((((j87 | jLongValue13) ^ j10) | (((j88 | j83) | jFreeMemory2) ^ j10)) * j86) + (j86 * j89) + ((long) 1824880248);
            int i181 = 8402378 + (((~(1713748443 | i5)) | (-276522033)) * 672);
            int i182 = ~i5;
            int i183 = ((int) (j90 >> 32)) & (i181 + (((~((-276522033) | i5)) | (~((-1713748444) | i182))) * (-672)) + (((~(276522032 | i182)) | (-1988099580)) * 672));
            int startUptimeMillis3 = (int) android.os.Process.getStartUptimeMillis();
            int i184 = ~startUptimeMillis3;
            int i185 = ((int) j90) & (1453938690 + (((~((-173171073) | i184)) | (-1610397483)) * 519) + (((~(i184 | (-173023489))) | (~((-1437373995) | startUptimeMillis3))) * (-519)) + (((~(startUptimeMillis3 | (-1610397483))) | 173171072) * 519));
            java.lang.Object[] objArr94 = new java.lang.Object[1];
            c(new char[]{63445, 8677, 23401, 29949}, 54907, objArr94);
            java.lang.Object[] objArr95 = {(java.lang.String) objArr94[0]};
            java.lang.Object objEZpvd22 = YY.EZpvd(-1763027797);
            if (objEZpvd22 == null) {
                byte b16 = (byte) 49;
                java.lang.Object[] objArr96 = new java.lang.Object[1];
                b((byte) 3, b16, (byte) (b16 & 7), objArr96);
                objEZpvd22 = YY.EZpvd(403, 5, (char) 0, -1832216105, false, (java.lang.String) objArr96[0], new java.lang.Class[]{java.lang.String.class});
            }
            long jLongValue14 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd22).invoke(null, objArr95)).longValue();
            long j91 = 287063601;
            long j92 = -919;
            long j93 = (j92 * j91) + (j92 * jLongValue14);
            long j94 = 920;
            long j95 = j91 ^ j10;
            long j96 = jLongValue14 ^ j10;
            long j97 = j95 | j96;
            long jMyPid2 = android.os.Process.myPid();
            long j98 = jMyPid2 ^ j10;
            long j99 = j93 + ((((j97 | jMyPid2) ^ j10) | (((j96 | j98) | j91) ^ j10)) * j94) + (((j97 ^ j10) | ((j95 | j98) ^ j10)) * j94) + (j94 * (((jMyPid2 | (j96 | j91)) ^ j10) | ((j97 | j98) ^ j10) | (((j95 | jLongValue14) | jMyPid2) ^ j10))) + ((long) 70434682);
            int i186 = ((int) (j99 >> 32)) & ((((~((-68505729) | i182)) * 130) - 2141920630) + (((~((-68505729) | i5)) | (-1858075376)) * 130));
            int i187 = ((int) j99) & (1004245573 + ((i5 | 1082146849) * 988) + (((~((-353832325) | i182)) | 352585088) * (-1976)) + ((1082146849 | (~(1083394085 | i5)) | (~((-1083394086) | i182))) * 988));
            if (j <= 0 || j <= 0 || j + 100 >= j) {
                java.lang.Object[] objArr97 = new java.lang.Object[1];
                a(new char[]{63879, 21218, 63912, 355, 19853, 46165, 52370, 63922, 25315, 54099, 27030}, 0, objArr97);
                java.lang.String str32 = (java.lang.String) objArr97[0];
                java.lang.Object[] objArr98 = new java.lang.Object[1];
                c(new char[]{63445, 21986, 45909, 4296, 32290, 56200, 14613, 34616, 58560, 16976, 44986}, 41579, objArr98);
                java.lang.String str33 = (java.lang.String) objArr98[0];
                java.lang.Object[] objArr99 = new java.lang.Object[1];
                a(new char[]{56780, 23685, 56803, 24393, 65514, 47666, 37560, 19413, 18088, 56628, 14268, 45209, 60319, 16387, 23688, 5608}, 0, objArr99);
                java.lang.String str34 = (java.lang.String) objArr99[0];
                java.lang.Object[] objArr100 = new java.lang.Object[1];
                c(new char[]{63445, 61084, 50601, 48310, 37850, 35574, 25065, 22598, 16170, 5669, 3393, 58483}, 6421, objArr100);
                java.lang.String str35 = (java.lang.String) objArr100[0];
                java.lang.Object[] objArr101 = new java.lang.Object[1];
                a(new char[]{25935, 5602, 25952, 56031, 7947, 62288, 5938, 43817, 65083, 37977, 45621, 20600, 21261, 2415, 55577}, 0, objArr101);
                java.lang.String str36 = (java.lang.String) objArr101[0];
                java.lang.Object[] objArr102 = new java.lang.Object[1];
                a(new char[]{16475, 57742, 16500, 54441, 1190, 1849, 6467, 45187, 56101}, 0, objArr102);
                java.lang.String str37 = (java.lang.String) objArr102[0];
                java.lang.Object[] objArr103 = new java.lang.Object[1];
                c(new char[]{63445, 2118, 2108, 2066}, 65497, objArr103);
                java.lang.String[] strArr4 = {str32, str33, str34, str35, str36, str37, (java.lang.String) objArr103[0]};
                if ((i2 & 2048) != 0) {
                    i6 = 0;
                    if (i6 == 0) {
                        int i188 = AEQbTJ + 29;
                        djBIcL = i188 % 128;
                        int i189 = i188 % 2;
                        objArr4 = new java.lang.Object[]{new int[]{(i6 & i182) | ((~i6) & i5)}, new int[]{i5}, new int[1], null};
                        int i190 = (((~((-959074745) | i182)) | 151130152 | (~(i182 | 854344660))) * (-397)) + 572461592 + ((197530220 | i5) * 397);
                        int i191 = (i190 & 16) + (i190 | 16);
                        int iKWHzl4 = AbstractC31905mIg.KWHzl();
                        int i192 = i191 * 465;
                        int i193 = i3 * (-463);
                        int i194 = ((i192 | i193) << 1) - (i192 ^ i193);
                        int i195 = ~i3;
                        int i196 = ~iKWHzl4;
                        int i197 = ~((i196 & i195) | (i195 ^ i196));
                        int i198 = ~((i195 ^ i191) | (i195 & i191));
                        int i199 = (i197 & i198) | (i197 ^ i198);
                        int i200 = ~iKWHzl4;
                        int i201 = ~((i200 & i191) | (i200 ^ i191));
                        int i202 = -(-(((i199 & i201) | (i199 ^ i201)) * 464));
                        int i203 = ((i194 | i202) << 1) - (i202 ^ i194);
                        int i204 = ~i191;
                        int i205 = (i204 & iKWHzl4) | (iKWHzl4 ^ i204);
                        int i206 = i203 + (((i195 & i205) | (i205 ^ i195)) * (-464));
                        int i207 = ~i3;
                        int i208 = ~((i207 & i191) | (i207 ^ i191));
                        int i209 = ~((iKWHzl4 & i191) | (i191 ^ iKWHzl4));
                        int i210 = -(-(((i209 & i208) | (i208 ^ i209)) * 464));
                        int i211 = (i206 & i210) + (i210 | i206);
                        int i212 = i211 << 13;
                        int i213 = (i212 & (~i211)) | ((~i212) & i211);
                        int i214 = i213 >>> 17;
                        int i215 = ((~i213) & i214) | ((~i214) & i213);
                        int i216 = i215 << 5;
                        ((int[]) objArr4[2])[0] = (i215 | i216) & (~(i215 & i216));
                    } else {
                        try {
                            objArr3 = new java.lang.Object[1];
                            a(new char[]{51111, 57446, 51157, 60250, 41985, 1741, 9980, 4143, 23746, 25051, 33710, 60217, 61865, 64746, 59549, 19998, 5859}, 0, objArr3);
                        } catch (java.lang.Exception unused) {
                        }
                        try {
                            java.lang.Object[] objArr104 = {(java.lang.String) objArr3[0]};
                            java.lang.Object objEZpvd23 = YY.EZpvd(1845277648);
                            if (objEZpvd23 == null) {
                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                b((byte) 5, (byte) 46, (byte) 0, objArr105);
                                objEZpvd23 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr105[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            java.lang.String str38 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd23).invoke(null, objArr104);
                            if (str38 != null) {
                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                c(new char[]{63385, 45984, 32733, 15357, 59161, 41778, 28493, 11105, 54927, 37550, 24256}, 17443, objArr106);
                                if (str38.contains((java.lang.String) objArr106[0])) {
                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                    c(new char[]{63379, 64191, 60869, 53263, 50040, 46686, 47246, 43956, 40588, 33034, 29729, 26492, 27034, 23732, 20421, 12818, 9509, 10319}, 3371, objArr107);
                                    try {
                                        java.lang.Object[] objArr108 = {(java.lang.String) objArr107[0]};
                                        java.lang.Object objEZpvd24 = YY.EZpvd(1845277648);
                                        if (objEZpvd24 == null) {
                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                            b((byte) 5, (byte) 46, (byte) 0, objArr109);
                                            objEZpvd24 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr109[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.Object objInvoke7 = ((java.lang.reflect.Method) objEZpvd24).invoke(null, objArr108);
                                        if (objInvoke7 != null) {
                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                            c(new char[]{63368, 2804, 3426, 4069, 639, 1267, 1919}, 64891, objArr110);
                                            if (objInvoke7.equals((java.lang.String) objArr110[0])) {
                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                a(new char[]{7615, 44319, 7631, 30041, 25447, 19390, 47267, 55128, 34502, 11448, 7605, 11285, 11244, 45442, 30338, 35109, 52477, 6788, 60302, 58991, 29088, 65146, 19698, 17288, 6794, 17272, 41458}, 0, objArr111);
                                                try {
                                                    java.lang.Object[] objArr112 = {(java.lang.String) objArr111[0]};
                                                    java.lang.Object objEZpvd25 = YY.EZpvd(1845277648);
                                                    if (objEZpvd25 == null) {
                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                        b((byte) 5, (byte) 46, (byte) 0, objArr113);
                                                        objEZpvd25 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr113[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    java.lang.String str39 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd25).invoke(null, objArr112);
                                                    if (str39 != null && (i23 = java.lang.Integer.parseInt(str39)) != 0) {
                                                        int i217 = (-19040) + (i23 * (-112));
                                                        int i218 = ~i23;
                                                        int i219 = ~((i218 ^ i182) | (i218 & i182));
                                                        int i220 = ((i219 & CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) | (i219 ^ CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256)) * 226;
                                                        int i221 = ((i217 | i220) << 1) - (i217 ^ i220);
                                                        int i222 = (~(((-171) & i5) | ((-171) ^ i5))) | (~(((-171) ^ i23) | ((-171) & i23)));
                                                        int i223 = ~i23;
                                                        int i224 = (i223 & i182) | (i223 ^ i182);
                                                        int i225 = ~((i224 & CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) | (i224 ^ CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256));
                                                        int i226 = ((i225 & i222) | (i222 ^ i225)) * (-113);
                                                        i7 = ((~((i218 ^ i5) | (i218 & i5))) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) + (i221 ^ i226) + ((i226 & i221) << 1);
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    java.lang.Throwable cause = th4.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th4;
                                                }
                                            }
                                            i7 = 0;
                                        } else {
                                            i7 = 0;
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        java.lang.Throwable cause2 = th5.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th5;
                                    }
                                }
                            }
                            if (i7 != 0) {
                                java.lang.Object[] objArr114 = {new int[]{(i7 | i5) & (~(i5 & i7))}, new int[]{i5}, new int[1], null};
                                int iElapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                int i227 = ~iElapsedRealtime2;
                                int i228 = 1977543444 + (((~(i227 | 1133253922)) | 680165482) * (-1042)) + ((1133253922 | iElapsedRealtime2) * 521) + (((~(iElapsedRealtime2 | (-680165483))) | 8912930 | (~(i227 | 1804506474))) * 521) + 16;
                                int i229 = (i3 ^ i228) + ((i3 & i228) << 1);
                                int i230 = i229 ^ (i229 << 13);
                                int i231 = i230 >>> 17;
                                int i232 = (i230 | i231) & (~(i230 & i231));
                                int i233 = i232 << 5;
                                ((int[]) objArr114[2])[0] = (i232 | i233) & (~(i232 & i233));
                                return objArr114;
                            }
                            if ((i2 & 64) != 0) {
                                i8 = i182;
                                i9 = 0;
                            } else {
                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                a(new char[]{51111, 57446, 51157, 60250, 41985, 1741, 9980, 4143, 23746, 25051, 33710, 60217, 61865, 64746, 59549, 19998, 5859}, 0, objArr115);
                                java.lang.Object[] objArr116 = {(java.lang.String) objArr115[0]};
                                java.lang.Object objEZpvd26 = YY.EZpvd(1845277648);
                                if (objEZpvd26 == null) {
                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                    b((byte) 5, (byte) 46, (byte) 0, objArr117);
                                    objEZpvd26 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr117[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                java.lang.Object objInvoke8 = ((java.lang.reflect.Method) objEZpvd26).invoke(null, objArr116);
                                if (objInvoke8 != null) {
                                    int i234 = djBIcL;
                                    int i235 = ((i234 | 81) << 1) - (i234 ^ 81);
                                    AEQbTJ = i235 % 128;
                                    if (i235 % 2 != 0) {
                                        strArr = new java.lang.String[1];
                                        cArr = new char[]{63385, 45984, 32733, 15357, 59161, 41778, 28493, 11105, 54927, 37550, 24256};
                                        c = 1;
                                    } else {
                                        strArr = new java.lang.String[1];
                                        cArr = new char[]{63385, 45984, 32733, 15357, 59161, 41778, 28493, 11105, 54927, 37550, 24256};
                                        c = 0;
                                    }
                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                    c(cArr, 17443, objArr118);
                                    strArr[c] = (java.lang.String) objArr118[0];
                                    java.lang.Object[] objArr119 = {objInvoke8, strArr};
                                    java.lang.Object objEZpvd27 = YY.EZpvd(-1100697334);
                                    if (objEZpvd27 == null) {
                                        byte b17 = (byte) 49;
                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                        b((byte) 3, b17, (byte) (b17 & 7), objArr120);
                                        objEZpvd27 = YY.EZpvd(449, 5, (char) 22140, -1169916810, false, (java.lang.String) objArr120[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                    }
                                    long jLongValue15 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd27).invoke(null, objArr119)).longValue();
                                    long j100 = -498979593;
                                    long j101 = 672;
                                    i8 = i182;
                                    long startUptimeMillis4 = (int) android.os.Process.getStartUptimeMillis();
                                    long j102 = startUptimeMillis4 ^ j10;
                                    long j103 = (((long) 673) * j100) + (((long) (-1343)) * jLongValue15) + ((jLongValue15 | ((j100 | startUptimeMillis4) ^ j10)) * j101) + (((long) (-672)) * ((((j100 ^ j10) | j102) ^ j10) | ((startUptimeMillis4 | jLongValue15) ^ j10)));
                                    long j104 = jLongValue15 ^ j10;
                                    long j105 = j103 + (j101 * (((j104 | j100) ^ j10) | ((j104 | j102) ^ j10))) + ((long) 1512986623);
                                    int i236 = ~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | 949046366);
                                    int i237 = ((int) (j105 >> 32)) & (((545276946 | i236) * (-970)) + 1260573158 + ((i236 | 403769420) * 970));
                                    int iMyPid = android.os.Process.myPid();
                                    int i238 = ((int) j105) & (1531045870 + ((~((-10518666) | iMyPid)) * 623) + (((~iMyPid) | 84223232) * (-623)) + (((~(iMyPid | (-681760922))) | (~(755465488 | iMyPid)) | 10518665) * 623));
                                    if (((i237 & i238) | (i237 ^ i238)) != 1) {
                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                        c(new char[]{63445, 34859, 2289, 34961, 2383, 35164, 2472, 35430, 2609, 35526, 2692, 35602}, 32693, objArr121);
                                        java.lang.String str40 = (java.lang.String) objArr121[0];
                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                        a(new char[]{19574, 62631, 19545, 57619, 9496, 4615, 11514, 37152, 55047, 30044, 35303, 27179, 31285, 59426, 58071, 53083, 40228, 17210, 32709, 41035}, 0, objArr122);
                                        java.lang.String str41 = (java.lang.String) objArr122[0];
                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                        c(new char[]{63445, 25895, 53993, 20389, 48511, 10824, 34752, 62618, 25169, 57114, 19628, 47654, 5934, 34045, 61837, 28483, 56389}, 37561, objArr123);
                                        java.lang.String str42 = (java.lang.String) objArr123[0];
                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                        a(new char[]{7049, 24123, 7078, 19744, 9688, 47244, 32970, 37373, 33015, 57280}, 0, objArr124);
                                        java.lang.String str43 = (java.lang.String) objArr124[0];
                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                        a(new char[]{39930, 18402, 39893, 8613, 12764, 41301, 60500, 34275, 158, 50771, 18768, 32431, 44472, 23407, 8803, 56223}, 0, objArr125);
                                        java.lang.String str44 = (java.lang.String) objArr125[0];
                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                        c(new char[]{63445, 36722, 1653, 40312, 5218, 43896, 8821, 47368, 12352, 46912, 20058, 50460, 23568, 54048, 27192, 57659, 30821}, 30971, objArr126);
                                        java.lang.String str45 = (java.lang.String) objArr126[0];
                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                        a(new char[]{30165, 39675, 30202, 15214, 55500, 31820, 63135, 27891, 61105, 6986, 21403, 38847, 17303, 34422, 14504, 12943, 42115, 11630, 42431, 24028, 6630, 51614, 704, 63525, 29354}, 0, objArr127);
                                        java.lang.String str46 = (java.lang.String) objArr127[0];
                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                        c(new char[]{63445, 51834, 35941, 20048, 'B', 49696, 33829, 18032, 6161, 55829, 40107, 24307, 4348, 53956, 38110, 22248}, 15859, objArr128);
                                        java.lang.String str47 = (java.lang.String) objArr128[0];
                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                        a(new char[]{17270, 19248, 17241, 37844, 26134, 44423, 24101, 53801, 55314, 51841, 64289, 10597, 29987, 22439, 36878, 35925, 37425, 64673, 3393, 58116, 12115, 6225, 43640, 18103, 17492, 42315, 18275, 56830, 57657}, 0, objArr129);
                                        java.lang.String str48 = (java.lang.String) objArr129[0];
                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                        c(new char[]{63445, 48458, 25093, 6080, 56450, 33360, 14085, 64640, 41370, 22339, 7181, 49653, 30449}, 19139, objArr130);
                                        java.lang.String str49 = (java.lang.String) objArr130[0];
                                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                                        c(new char[]{63445, 1672, 5511, 9373, 13257, 17083, 20921, 24741, 32749}, 61703, objArr131);
                                        java.lang.String str50 = (java.lang.String) objArr131[0];
                                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                                        a(new char[]{50449, 26182, 50494, 39768, 24859, 33009, 22181, 54648, 24163, 59387, 62382, 11880}, 0, objArr132);
                                        java.lang.String[] strArr5 = {str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, (java.lang.String) objArr132[0]};
                                        int i239 = 0;
                                        while (i239 < 12) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(strArr5[i239]);
                                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                                            a(new char[]{2197, 40815, 2278, 32198, 35058, 31198}, 0, objArr133);
                                            sb.append((java.lang.String) objArr133[0]);
                                            java.lang.Object[] objArr134 = {sb.toString()};
                                            java.lang.Object objEZpvd28 = YY.EZpvd(1704729038);
                                            if (objEZpvd28 == null) {
                                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                b((byte) 5, (byte) 46, (byte) 0, objArr135);
                                                objEZpvd28 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr135[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            long jLongValue16 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd28).invoke(null, objArr134)).longValue();
                                            long j106 = 1042874418;
                                            long j107 = jLongValue16 ^ j10;
                                            java.lang.String[] strArr6 = strArr5;
                                            int i240 = i239;
                                            long j108 = i5;
                                            long j109 = j108 ^ j10;
                                            long j110 = (j109 | jLongValue16) ^ j10;
                                            long j111 = (((long) (-515)) * j106) + (((long) 517) * jLongValue16) + (((long) (-516)) * (((j107 | j108) ^ j10) | ((j109 | j106) ^ j10) | j110));
                                            long j112 = 516;
                                            long j113 = j106 ^ j10;
                                            int i241 = ((int) ((((j111 + (((((j113 | j107) | j108) ^ j10) | (((j113 | j109) | jLongValue16) ^ j10)) * j112)) + (j112 * (((j113 | jLongValue16) ^ j10) | j110))) + ((long) (-1208471145))) >> 32)) & (((((~(1847707363 | i5)) | 1376920978) * 262) - 2119904630) + (((~(1847707363 | i8)) | 1376920978) * 262));
                                            int i242 = (-1294723834) + (((~((-1981371346) | i8)) | 1107362129) * (-245));
                                            int i243 = ~((-1981371346) | i5);
                                            if ((i241 | (((int) r11) & (i242 + (i243 * (-245)) + ((i243 | 876369540) * 245)))) != 0) {
                                                i9 = ((i240 | WalletImportError.ERROR_CODE_AA_CREATE_KEY) << 1) - (i240 ^ WalletImportError.ERROR_CODE_AA_CREATE_KEY);
                                                break;
                                            }
                                            i239 = (i240 ^ 1) + ((i240 & 1) << 1);
                                            strArr5 = strArr6;
                                        }
                                    }
                                } else {
                                    i8 = i182;
                                }
                                i9 = 0;
                            }
                            if (i9 != 0) {
                                java.lang.Object[] objArr136 = {new int[]{(i9 & i8) | ((~i9) & i5)}, new int[]{i5}, new int[1], null};
                                int iElapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                                int i244 = ~iElapsedRealtime3;
                                int i245 = 87984732 + (((~(1809215484 | i244)) | 4203920) * 220) + (((~(i244 | 1623205264)) | 190214140) * (-440)) + ((iElapsedRealtime3 | 1809215484) * 220);
                                int i246 = (i245 ^ 16) + ((16 & i245) << 1) + i3;
                                int i247 = i246 << 13;
                                int i248 = ((~i246) & i247) | ((~i247) & i246);
                                int i249 = i248 >>> 17;
                                int i250 = (i248 | i249) & (~(i248 & i249));
                                ((int[]) objArr136[2])[0] = i250 ^ (i250 << 5);
                                return objArr136;
                            }
                            long[] jArr = {472001035};
                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                            a(new char[]{6179, 30897, 6156, 53492, 29945, 40453, 7438, 49370, 33616, 63818, 47135, 15296, 11887, 25651, 54131, 40696, 51580, 53040, 20002, 61937, 29712}, 0, objArr137);
                            try {
                                bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr137[0]));
                                int i251 = AEQbTJ;
                                i22 = ((i251 | 39) << 1) - (i251 ^ 39);
                                djBIcL = i22 % 128;
                            } catch (java.io.IOException unused2) {
                                bufferedInputStream2 = null;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                bufferedInputStream = null;
                            }
                            try {
                            } catch (java.io.IOException unused3) {
                                if (bufferedInputStream2 != null) {
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                bufferedInputStream = bufferedInputStream2;
                                if (bufferedInputStream == null) {
                                    throw th;
                                }
                                try {
                                    bufferedInputStream.close();
                                    throw th;
                                } catch (java.lang.Exception unused4) {
                                    throw th;
                                }
                            }
                            if (i22 % 2 == 0) {
                                java.lang.Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            long j114 = 0;
                            while (true) {
                                int i252 = bufferedInputStream2.read();
                                if (i252 != -1) {
                                    j114 = ((j114 << 5) ^ ((long) i252)) & LockFreeTaskQueueCore.HEAD_MASK;
                                    for (int i253 = 0; i253 < 1; i253++) {
                                        if (j114 == jArr[i253]) {
                                            int i254 = i253 + 1;
                                            try {
                                                bufferedInputStream2.close();
                                            } catch (java.lang.Exception unused5) {
                                            }
                                            if (i254 != 0) {
                                                i10 = PsExtractor.VIDEO_STREAM_MASK;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        bufferedInputStream2.close();
                                        break;
                                    } catch (java.lang.Exception unused6) {
                                    }
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                i10 = 0;
                            } else {
                                java.lang.Object[] objArr138 = new java.lang.Object[1];
                                c(new char[]{63393, 52101, 36681, 17198, 1691, 55898}, 15439, objArr138);
                                Matcher matcher = Pattern.compile((java.lang.String) objArr138[0]).matcher("");
                                java.lang.Object[] objArr139 = new java.lang.Object[1];
                                a(new char[]{63748, 507, 63787, 60007, 41610, 59215, 10141, 5801, 25207, 32768}, 0, objArr139);
                                java.io.File[] fileArrListFiles = new java.io.File((java.lang.String) objArr139[0]).listFiles();
                                if (fileArrListFiles != null) {
                                    int i255 = AEQbTJ;
                                    int i256 = (i255 ^ 125) + ((i255 & 125) << 1);
                                    djBIcL = i256 % 128;
                                    int i257 = i256 % 2;
                                    int i258 = 0;
                                    int i259 = 0;
                                    while (i258 < fileArrListFiles.length && i259 < 3) {
                                        java.io.File file = fileArrListFiles[i258];
                                        if (file != null && file.isDirectory() && matcher.reset(fileArrListFiles[i258].getName()).matches()) {
                                            int i260 = (i259 & 1) + (i259 | 1);
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            sb2.append(fileArrListFiles[i258].getAbsolutePath());
                                            java.lang.Object[] objArr140 = new java.lang.Object[1];
                                            c(new char[]{63445, '\n', 6319, 4440, 10720, 8607, 14887}, 63389, objArr140);
                                            sb2.append((java.lang.String) objArr140[0]);
                                            try {
                                                java.io.BufferedInputStream bufferedInputStream7 = new java.io.BufferedInputStream(new java.io.FileInputStream(sb2.toString()));
                                                long j115 = 0;
                                                while (true) {
                                                    try {
                                                        int i261 = bufferedInputStream7.read();
                                                        if (i261 == -1) {
                                                            bufferedInputStream4 = bufferedInputStream7;
                                                            break;
                                                        }
                                                        bufferedInputStream4 = bufferedInputStream7;
                                                        j115 = (((long) i261) ^ (j115 << 5)) & LockFreeTaskQueueCore.HEAD_MASK;
                                                        int i262 = 0;
                                                        while (i262 < 1) {
                                                            try {
                                                                if (j115 == jArr[i262]) {
                                                                    int i263 = i262 + 1;
                                                                    try {
                                                                        bufferedInputStream4.close();
                                                                    } catch (java.lang.Exception unused7) {
                                                                    }
                                                                    if (i263 != 0) {
                                                                        i10 = 241;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    int i264 = (i262 & (-85)) + (i262 | (-85));
                                                                    i262 = ((i264 | 86) << 1) - (i264 ^ 86);
                                                                }
                                                            } catch (java.io.IOException unused8) {
                                                                if (bufferedInputStream4 != null) {
                                                                    try {
                                                                        bufferedInputStream4.close();
                                                                    } catch (java.lang.Exception unused9) {
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th8) {
                                                                th = th8;
                                                                th2 = th;
                                                                bufferedInputStream3 = bufferedInputStream4;
                                                                if (bufferedInputStream3 == null) {
                                                                    throw th2;
                                                                }
                                                                try {
                                                                    bufferedInputStream3.close();
                                                                    throw th2;
                                                                } catch (java.lang.Exception unused10) {
                                                                    throw th2;
                                                                }
                                                            }
                                                        }
                                                        bufferedInputStream7 = bufferedInputStream4;
                                                    } catch (java.io.IOException unused11) {
                                                        bufferedInputStream4 = bufferedInputStream7;
                                                    } catch (java.lang.Throwable th9) {
                                                        th = th9;
                                                        bufferedInputStream4 = bufferedInputStream7;
                                                    }
                                                }
                                            } catch (java.io.IOException unused12) {
                                                bufferedInputStream4 = null;
                                            } catch (java.lang.Throwable th10) {
                                                th2 = th10;
                                                bufferedInputStream3 = null;
                                            }
                                            i259 = i260;
                                        }
                                        int i265 = (i258 ^ (-117)) + ((i258 & (-117)) << 1);
                                        i258 = (i265 & 118) + (i265 | 118);
                                    }
                                    i10 = 0;
                                }
                            }
                            if (i10 != 0) {
                                java.lang.Object[] objArr141 = {new int[]{(i10 | i5) & (~(i5 & i10))}, new int[]{i5}, new int[]{i ^ (i << 5)}, null};
                                int i266 = -(-((-2083448892) + ((~(i8 | 1473639275)) * 52) + (((~(i8 | 366010915)) | (~((-1447408490) | i8)) | 1107628360) * (-52)) + (((~((-366010916) | i8)) | 26230786) * 52) + 16));
                                int i267 = ((i3 | i266) << 1) - (i266 ^ i3);
                                int i268 = i267 << 13;
                                int i269 = (i268 | i267) & (~(i267 & i268));
                                int i270 = i269 >>> 17;
                                int i271 = (i269 | i270) & (~(i269 & i270));
                                return objArr141;
                            }
                            long[] jArr2 = {472001035};
                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                            c(new char[]{63445, 14856, 27777, 40714, 49617, 62489, 9871, 26962, 39809, 52758, 61596, 8984, 21912, 38914, 51852, 64858, 12186, 20996, 33924, 46848, 63885, 11286}, 52609, objArr142);
                            try {
                                bufferedInputStream6 = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr142[0]));
                                j3 = 0;
                            } catch (java.io.IOException unused13) {
                                bufferedInputStream6 = null;
                            } catch (java.lang.Throwable th11) {
                                th3 = th11;
                                bufferedInputStream5 = null;
                            }
                            while (true) {
                                try {
                                    i21 = bufferedInputStream6.read();
                                } catch (java.io.IOException unused14) {
                                    if (bufferedInputStream6 != null) {
                                    }
                                } catch (java.lang.Throwable th12) {
                                    th3 = th12;
                                    bufferedInputStream5 = bufferedInputStream6;
                                    if (bufferedInputStream5 == null) {
                                        throw th3;
                                    }
                                    try {
                                        bufferedInputStream5.close();
                                        throw th3;
                                    } catch (java.lang.Exception unused15) {
                                        throw th3;
                                    }
                                }
                                if (i21 != -1) {
                                    j3 = ((j3 << 5) ^ ((long) i21)) & LockFreeTaskQueueCore.HEAD_MASK;
                                    for (int i272 = 0; i272 < 1; i272++) {
                                        if (j3 == jArr2[i272]) {
                                            int i273 = i272 + 1;
                                            try {
                                                bufferedInputStream6.close();
                                            } catch (java.lang.Exception unused16) {
                                            }
                                            if (i273 != 0) {
                                                i11 = 1;
                                                z2 = false;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        bufferedInputStream6.close();
                                        break;
                                    } catch (java.lang.Exception unused17) {
                                    }
                                }
                            }
                            i11 = 1;
                            z2 = true;
                            if (!z2) {
                                java.lang.Object[] objArr143 = new java.lang.Object[4];
                                int[] iArr5 = new int[i11];
                                objArr143[0] = iArr5;
                                int[] iArr6 = new int[i11];
                                objArr143[i11] = iArr6;
                                int[] iArr7 = new int[i11];
                                objArr143[2] = iArr7;
                                int i274 = (~(i5 & 242)) & (i5 | 242);
                                iArr6[0] = i5;
                                iArr5[0] = i274;
                                objArr143[3] = null;
                                int i275 = ~((-1671823401) | i5);
                                int i276 = 2062123420 + ((138428996 | i275) * (-476)) + (i275 * 952) + ((~(i8 | (-1671823401))) * 476) + 16;
                                int i277 = i276 * 370;
                                int i278 = i3 * 370;
                                int i279 = (i277 ^ i278) + ((i277 & i278) << 1);
                                int i280 = (i276 ^ i3) | (i276 & i3);
                                int i281 = ~i5;
                                int i282 = i279 + (((i280 & i281) | (i280 ^ i281)) * (-369));
                                int i283 = ~i276;
                                int i284 = ~((i281 & i283) | (i283 ^ i281));
                                int i285 = ((i284 & i3) | (i3 ^ i284)) * (-369);
                                int i286 = (i282 ^ i285) + ((i285 & i282) << 1);
                                int i287 = ~i3;
                                int i288 = ~((i287 & i276) | (i287 ^ i276));
                                int i289 = ~((i5 & i276) | (i276 ^ i5));
                                int i290 = (i289 & i288) | (i288 ^ i289);
                                int i291 = ~((i283 & i8) | (i283 ^ i8) | i3);
                                int i292 = (i286 - (~(((i291 & i290) | (i290 ^ i291)) * 369))) - 1;
                                int i293 = (i292 << 13) ^ i292;
                                int i294 = i293 >>> 17;
                                int i295 = (i293 | i294) & (~(i293 & i294));
                                int i296 = i295 << 5;
                                iArr7[0] = ((~i295) & i296) | ((~i296) & i295);
                                return objArr143;
                            }
                            java.lang.Object objEZpvd29 = YY.EZpvd(1600115010);
                            if (objEZpvd29 == null) {
                                byte b18 = (byte) 49;
                                java.lang.Object[] objArr144 = new java.lang.Object[1];
                                b((byte) 3, b18, (byte) (b18 & 7), objArr144);
                                objEZpvd29 = YY.EZpvd(TypedValues.PositionType.TYPE_PERCENT_X, 5, (char) 0, 1535056958, false, (java.lang.String) objArr144[0], new java.lang.Class[0]);
                            }
                            long jLongValue17 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd29).invoke(null, null)).longValue();
                            long j116 = 1174260544;
                            long j117 = 302;
                            long j118 = (((long) LuaValue.ERR_WRITE_FILE_ERROR) * j116) + (j117 * jLongValue17);
                            long j119 = LuaValue.ERR_CLOSE_FILE_ERROR;
                            long j120 = i5;
                            long j121 = j118 + ((((j116 | jLongValue17) | j120) ^ j10) * j119);
                            long j122 = jLongValue17 ^ j10;
                            long j123 = j120 ^ j10;
                            long j124 = j121 + ((((j122 | j120) ^ j10) | ((j123 | j116) ^ j10)) * j119) + (((long) 301) * (j122 | (((j116 ^ j10) | j120) ^ j10))) + ((long) 416760082);
                            int i297 = ((int) (j124 >> 32)) & (1253594456 + (((-1293978358) | i5) * (-859)) + (((~(i8 | (-1293978358))) | (~(1563795455 | i5))) * 859) + (((~(1563762527 | i8)) | 32928) * 859));
                            int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                            int i298 = ~elapsedCpuTime3;
                            int i299 = ((int) j124) & ((-1687905466) + (((~(715071920 | i298)) | (-722154490)) * (-90)) + (((~(715071920 | elapsedCpuTime3)) | 705372592) * (-45)) + (((~(elapsedCpuTime3 | 722154489)) | 715071920 | (~(i298 | (-722154490)))) * 45));
                            if (((i299 & i297) | (i297 ^ i299)) != 0) {
                                int i300 = i8;
                                objArr = new java.lang.Object[]{new int[]{(i5 & (-265)) | (i300 & 264)}, new int[]{i5}, new int[1], null};
                                int i301 = 972545856 + ((i5 | 33571338) * 988) + (((~(42527643 | i300)) | 1761935456) * (-1976)) + ((33571338 | (~((-1770891762) | i5)) | (~(1770891761 | i300))) * 988);
                                int i302 = ((i301 | 16) << 1) - (i301 ^ 16);
                                int iKWHzl5 = AbstractC31905mIg.KWHzl();
                                int i303 = i302 * (-830);
                                int i304 = -(-(i3 * 832));
                                int i305 = ((i303 | i304) << 1) - (i303 ^ i304);
                                int i306 = ~i3;
                                int i307 = ~iKWHzl5;
                                int i308 = ~((i306 & i307) | (i306 ^ i307));
                                int i309 = (i302 ^ i3) | (i302 & i3);
                                int i310 = (i305 - (~(-(-((i308 | (~((i309 & iKWHzl5) | (i309 ^ iKWHzl5)))) * (-831)))))) - 1;
                                int i311 = ~i3;
                                int i312 = i310 + ((~((i311 & i302) | (i311 ^ i302) | iKWHzl5)) * (-1662));
                                int i313 = ~i302;
                                int i314 = ~iKWHzl5;
                                int i315 = ~((i313 & i314) | (i313 ^ i314));
                                int i316 = ~((i302 & iKWHzl5) | (i302 ^ iKWHzl5));
                                int i317 = (i316 & i315) | (i315 ^ i316);
                                int i318 = ~((i3 ^ iKWHzl5) | (iKWHzl5 & i3));
                                int i319 = ((i317 & i318) | (i317 ^ i318)) * 831;
                                int i320 = (i312 ^ i319) + ((i319 & i312) << 1);
                                int i321 = i320 << 13;
                                int i322 = (i321 & (~i320)) | ((~i321) & i320);
                                int i323 = i322 >>> 17;
                                int i324 = (i322 | i323) & (~(i322 & i323));
                                int i325 = i324 << 5;
                                int i326 = (i324 | i325) & (~(i324 & i325));
                                c3 = 0;
                                ((int[]) objArr[2])[0] = i326;
                                j = j120;
                            } else {
                                int i327 = i8;
                                java.lang.Object objEZpvd30 = YY.EZpvd(-83222370);
                                if (objEZpvd30 == null) {
                                    byte b19 = (byte) 49;
                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                    b((byte) 3, b19, (byte) (b19 & 7), objArr145);
                                    objEZpvd30 = YY.EZpvd(348, 5, (char) 58632, -13963806, false, (java.lang.String) objArr145[0], new java.lang.Class[0]);
                                }
                                long jLongValue18 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd30).invoke(null, null)).longValue();
                                long j125 = -1322077865;
                                long j126 = -574;
                                long j127 = j125 ^ j10;
                                long j128 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                long j129 = j128 ^ j10;
                                long j130 = ((jLongValue18 ^ j10) | j128) ^ j10;
                                long j131 = (j126 * j125) + (j126 * jLongValue18) + (((long) 1150) * (((j127 | j129) ^ j10) | j130)) + (((long) (-575)) * (j130 | ((j129 | jLongValue18) ^ j10))) + (((long) 575) * (((j127 | j128) ^ j10) | ((j129 | j125) ^ j10))) + ((long) (-272214798));
                                int iNextInt3 = new java.util.Random().nextInt();
                                int i328 = ((int) (j131 >> 32)) & (1520786966 + (((~((~iNextInt3) | 139498893)) | (-1297733022)) * 529) + (((~(iNextInt3 | 139498893)) | (-1297727518)) * 529));
                                int iFreeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                int i329 = ~iFreeMemory3;
                                int i330 = 9860977 + (((~((-1230348135) | i329)) | 1090586916) * (-108)) + (((~(i329 | (-206878276))) | (~(206878275 | iFreeMemory3)) | 67117057) * 54) + ((iFreeMemory3 | 67117057) * 54);
                                int i331 = djBIcL;
                                int i332 = (i331 & 3) + (i331 | 3);
                                AEQbTJ = i332 % 128;
                                int i333 = ((int) j131) & i330;
                                if (i332 % 2 != 0) {
                                    int i334 = 5 / 0;
                                    i12 = ((int) ((long) ((i333 & i328) | (i328 ^ i333)))) != 0 ? i5 ^ 281 : i5;
                                } else if ((i333 | i328) != 0) {
                                }
                                if (i12 != i5) {
                                    java.lang.Object[] objArr146 = {new int[]{i12}, new int[]{i5}, new int[1], null};
                                    int iMyTid3 = android.os.Process.myTid();
                                    int i335 = 848629036 + (((~(744031755 | iMyTid3)) | 1069387649) * 672);
                                    int i336 = ~iMyTid3;
                                    int i337 = i335 + (((~(iMyTid3 | 1069387649)) | (~((-744031756) | i336))) * (-672)) + (((~((-1069387650) | i336)) | 329550208) * 672);
                                    int i338 = (i337 & 16) + (i337 | 16);
                                    int iKWHzl6 = AbstractC31905mIg.KWHzl();
                                    int i339 = (i338 * (-51)) + (i3 * 53);
                                    int i340 = ~iKWHzl6;
                                    int i341 = i340 | i338;
                                    int i342 = (~((i341 & i3) | (i341 ^ i3))) * 52;
                                    int i343 = ((i339 | i342) << 1) - (i339 ^ i342);
                                    int i344 = ~i3;
                                    int i345 = ~((i344 & i340) | (i344 ^ i340));
                                    int i346 = ~i3;
                                    int i347 = i343 + (((~((~iKWHzl6) | i338)) | i345 | (~((i346 ^ i338) | (i346 & i338)))) * (-52));
                                    int i348 = ~i338;
                                    int i349 = ((~((i348 & i3) | (i348 ^ i3))) | (~((i348 ^ i340) | (i348 & i340)))) * 52;
                                    int i350 = (i347 & i349) + (i349 | i347);
                                    int i351 = i350 << 13;
                                    int i352 = (i351 & (~i350)) | ((~i351) & i350);
                                    int i353 = i352 >>> 17;
                                    int i354 = (i352 | i353) & (~(i352 & i353));
                                    int i355 = i354 << 5;
                                    int i356 = (i354 | i355) & (~(i354 & i355));
                                    c3 = 0;
                                    ((int[]) objArr146[2])[0] = i356;
                                    objArr = objArr146;
                                    i8 = i327;
                                    j = j120;
                                } else {
                                    if ((i2 & 16384) == 0) {
                                        java.lang.Object objEZpvd31 = YY.EZpvd(-1381607426);
                                        if (objEZpvd31 == null) {
                                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                                            b((byte) 5, (byte) 46, (byte) 0, objArr147);
                                            objEZpvd31 = YY.EZpvd(363, 5, (char) 0, -1450796414, false, (java.lang.String) objArr147[0], new java.lang.Class[0]);
                                        }
                                        long jLongValue19 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd31).invoke(null, null)).longValue();
                                        long j132 = 1683808776;
                                        j = j120;
                                        long j133 = (((long) (-523)) * j132) + (((long) 263) * jLongValue19);
                                        long j134 = 262;
                                        long j135 = ((j132 ^ j10) | jLongValue19) ^ j10;
                                        long j136 = jLongValue19 ^ j10;
                                        long j137 = (j132 | j136) ^ j10;
                                        i8 = i327;
                                        long jMyPid3 = android.os.Process.myPid();
                                        long j138 = j133 + ((j135 | j137 | ((j136 | jMyPid3) ^ j10)) * j134) + (((long) (-786)) * j137) + (j134 * (((j136 | (jMyPid3 ^ j10)) ^ j10) | j135 | j137)) + ((long) 331362372);
                                        int iUptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                                        int i357 = ((int) (j138 >> 32)) & ((-2005432166) + (((~((-977153928) | iUptimeMillis3)) | 439100931) * 104) + ((~((~iUptimeMillis3) | 998125479)) * (-104)) + ((iUptimeMillis3 | 460072483) * 104));
                                        int iFreeMemory4 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                        int i358 = ((int) j138) & (489067930 + ((~((-100672017) | iFreeMemory4)) * LuaValue.ERR_CLOSE_FILE_ERROR) + (((~(251671064 | iFreeMemory4)) | (~((~iFreeMemory4) | (-1185555346)))) * LuaValue.ERR_CLOSE_FILE_ERROR) + (((~(iFreeMemory4 | 1185555345)) | 251671064) * 301));
                                        if (((i358 & i357) | (i357 ^ i358)) != 0) {
                                            objArr = new java.lang.Object[]{new int[]{(i5 & (-269)) | (i8 & 268)}, new int[]{i5}, new int[1], null};
                                            int iNextInt4 = new java.util.Random().nextInt();
                                            int i359 = ((135767458 + (((~((-807048854) | iNextInt4)) | (~(1006370551 | iNextInt4))) * 69)) + (((~(iNextInt4 | 981112503)) | ((~((-832306902) | iNextInt4)) | 25258048)) * (-69))) - 874510038;
                                            int i360 = (-8289) - (~(-(-(i359 * (-518)))));
                                            int i361 = ~((-17) | i8);
                                            int i362 = ((i361 & i359) | (i359 ^ i361)) * 519;
                                            int i363 = (i360 & i362) + (i360 | i362);
                                            int i364 = ~(((-17) & i8) | ((-17) ^ i8) | i359);
                                            int i365 = ~((i359 ^ 16) | (i359 & 16) | i5);
                                            int i366 = i363 + (((i364 & i365) | (i364 ^ i365)) * (-519));
                                            int i367 = ~((i359 ^ i5) | (i359 & i5));
                                            int i368 = ((i367 & 16) | (i367 ^ 16)) * 519;
                                            int i369 = -(-((i366 & i368) + (i368 | i366)));
                                            int i370 = ((i3 | i369) << 1) - (i369 ^ i3);
                                            int i371 = i370 << 13;
                                            int i372 = (i371 | i370) & (~(i370 & i371));
                                            int i373 = i372 >>> 17;
                                            int i374 = ((~i372) & i373) | ((~i373) & i372);
                                            int i375 = i374 << 5;
                                            int i376 = (i374 | i375) & (~(i374 & i375));
                                            c3 = 0;
                                            ((int[]) objArr[2])[0] = i376;
                                        } else {
                                            i13 = i8;
                                        }
                                    } else {
                                        i13 = i327;
                                        j = j120;
                                    }
                                    java.lang.Object objEZpvd32 = YY.EZpvd(40894713);
                                    if (objEZpvd32 == null) {
                                        byte b20 = (byte) 49;
                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                        b((byte) 3, b20, (byte) (b20 & 7), objArr148);
                                        objEZpvd32 = YY.EZpvd(363, 5, (char) 0, 105958789, false, (java.lang.String) objArr148[0], new java.lang.Class[0]);
                                    }
                                    long jLongValue20 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd32).invoke(null, null)).longValue();
                                    long j139 = 657035823;
                                    long j140 = 614;
                                    long j141 = j139 ^ j10;
                                    long j142 = (j141 | jLongValue20) ^ j10;
                                    long j143 = jLongValue20 ^ j10;
                                    i8 = i13;
                                    long j144 = (((long) 615) * j139) + (((long) (-613)) * jLongValue20) + ((j | j142 | ((j143 | j139) ^ j10)) * j140) + (((long) (-1228)) * (((j141 | j123) ^ j10) | j142 | ((j123 | jLongValue20) ^ j10))) + (j140 * (((jLongValue20 | (j123 | j139)) ^ j10) | (((j141 | j143) | j123) ^ j10))) + ((long) (-2104818400));
                                    int iMyPid2 = android.os.Process.myPid();
                                    int i377 = ((int) (j144 >> 32)) & (1587634074 + (((~(1547458042 | iMyPid2)) | 42074117 | (~((-110231632) | iMyPid2))) * (-744)) + (((~iMyPid2) | 1479300528) * 744) + ((iMyPid2 | (-42074118)) * 744));
                                    int iMyPid3 = android.os.Process.myPid();
                                    int i378 = ((int) j144) & (424311987 + (((~((-1276721754) | iMyPid3)) | (-1581088766)) * (-502)) + ((~((~iMyPid3) | (-69634))) * (-502)) + (((~(iMyPid3 | (-1581019133))) | (-1276721754)) * 502));
                                    if (((i377 & i378) | (i377 ^ i378)) != 0) {
                                        objArr = new java.lang.Object[]{new int[]{(i5 & (-267)) | (i8 & 266)}, new int[]{i5}, new int[1], null};
                                        int iElapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
                                        int i379 = (-1166859540) + (((~(iElapsedRealtime4 | 537843084)) | (-1275576321)) * (-668)) + ((537843084 | (~((-1275576321) | iElapsedRealtime4))) * 1336) + ((iElapsedRealtime4 | (-1275133953)) * 668);
                                        int iKWHzl7 = AbstractC31905mIg.KWHzl();
                                        int i380 = i379 * (-756);
                                        int i381 = (12128 & i380) + (i380 | 12128);
                                        int i382 = ~iKWHzl7;
                                        int i383 = -(-(((i382 ^ 16) | (i382 & 16)) * (-757)));
                                        int i384 = (i381 & i383) + (i383 | i381);
                                        int i385 = ~i379;
                                        int i386 = (i385 ^ 16) | (i385 & 16);
                                        int i387 = (~((i386 & iKWHzl7) | (i386 ^ iKWHzl7))) * 1514;
                                        int i388 = ((i384 | i387) << 1) - (i387 ^ i384);
                                        int i389 = ~(((-17) & i385) | ((-17) ^ i385));
                                        int i390 = ~(i382 | i385);
                                        int i391 = (i390 & i389) | (i389 ^ i390);
                                        int i392 = i379 | 16;
                                        int i393 = ~((iKWHzl7 & i392) | (i392 ^ iKWHzl7));
                                        int i394 = -(-(((i393 & i391) | (i391 ^ i393)) * 757));
                                        int i395 = -(-(((i388 | i394) << 1) - (i394 ^ i388)));
                                        int i396 = (i3 ^ i395) + ((i395 & i3) << 1);
                                        int i397 = i396 << 13;
                                        int i398 = (i397 & (~i396)) | ((~i397) & i396);
                                        int i399 = i398 >>> 17;
                                        int i400 = ((~i398) & i399) | ((~i399) & i398);
                                        c3 = 0;
                                        ((int[]) objArr[2])[0] = i400 ^ (i400 << 5);
                                    } else {
                                        if ((524288 & i2) == 0) {
                                            java.lang.Object objEZpvd33 = YY.EZpvd(602007173);
                                            if (objEZpvd33 == null) {
                                                byte b21 = (byte) 49;
                                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                b((byte) 3, b21, (byte) (b21 & 7), objArr149);
                                                objEZpvd33 = YY.EZpvd(235, 5, (char) 49179, 666971129, false, (java.lang.String) objArr149[0], new java.lang.Class[0]);
                                            }
                                            long jLongValue21 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd33).invoke(null, null)).longValue();
                                            long j145 = 490215129;
                                            i8 = i8;
                                            long j146 = j145 ^ j10;
                                            long j147 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                            long j148 = (((long) 303) * j145) + (j119 * jLongValue21) + (((long) (-302)) * ((((j146 | (j147 ^ j10)) | jLongValue21) ^ j10) | (((j145 | jLongValue21) | j147) ^ j10))) + (((long) (-604)) * (((j146 | jLongValue21) | j147) ^ j10)) + (j117 * (((j147 | jLongValue21) ^ j10) | (((jLongValue21 ^ j10) | j145) ^ j10))) + ((long) 547346268);
                                            int i401 = ((int) (j148 >> 32)) & ((((1410705938 | r2) * (-658)) - 781937238) + (((~(((int) java.lang.Runtime.getRuntime().totalMemory()) | (-2065795636))) | 1342278162) * 658));
                                            int iMaxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                            int i402 = ((int) j148) & (1771465493 + (((~((-2132860296) | iMaxMemory)) | 723569798) * 576) + (((~((~iMaxMemory) | (-1409290498))) | 1310792) * 576) + 164375936);
                                            if (i == 0 || (i == 3 && (268435456 & i2) != 0)) {
                                                i14 = i3;
                                            } else {
                                                objArr = new java.lang.Object[]{new int[]{i5 ^ 280}, new int[]{i5}, new int[1], null};
                                                int iUptimeMillis4 = (int) android.os.SystemClock.uptimeMillis();
                                                int i403 = ~((-617977659) | iUptimeMillis4);
                                                int i404 = ~iUptimeMillis4;
                                                int i405 = (-523073332) + ((i403 | (~(1195441746 | i404))) * (-1808)) + (((~((-71341587) | iUptimeMillis4)) | (~(i404 | 1742077818))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iUptimeMillis4 | (-1195441747))) | 546636072 | (~(617977658 | i404))) * TypedValues.Custom.TYPE_BOOLEAN);
                                                int i406 = (i405 & 16) + (i405 | 16);
                                                int i407 = ((i406 * 465) - (~(i3 * (-463)))) - 1;
                                                int i408 = ~((~i3) | i8);
                                                int i409 = ~i3;
                                                int i410 = i408 | (~(i409 | i406));
                                                int i411 = ~((~i5) | i406);
                                                int i412 = -(-(((i410 & i411) | (i410 ^ i411)) * 464));
                                                int i413 = (i407 & i412) + (i407 | i412);
                                                int i414 = ~i406;
                                                int i415 = (i413 - (~((((i414 & i5) | (i5 ^ i414)) | i409) * (-464)))) - 1;
                                                int i416 = ~((i409 ^ i406) | (i409 & i406));
                                                int i417 = ~((i406 & i5) | (i406 ^ i5));
                                                int i418 = -(-(((i417 & i416) | (i416 ^ i417)) * 464));
                                                int i419 = ((i415 | i418) << 1) - (i418 ^ i415);
                                                int i420 = i419 << 13;
                                                int i421 = (i420 & (~i419)) | ((~i420) & i419);
                                                int i422 = i421 >>> 17;
                                                int i423 = (i421 | i422) & (~(i421 & i422));
                                                int i424 = i423 << 5;
                                                int i425 = ((~i423) & i424) | ((~i424) & i423);
                                                c2 = 0;
                                                ((int[]) objArr[2])[0] = i425;
                                                if (((int[]) objArr[1])[c2] != ((int[]) objArr[c2])[c2]) {
                                                    return objArr;
                                                }
                                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                objArr150[c2] = 2;
                                                java.lang.Object objEZpvd34 = YY.EZpvd(140339483);
                                                if (objEZpvd34 == null) {
                                                    byte b22 = (byte) 49;
                                                    java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                    b((byte) 3, b22, (byte) (b22 & 7), objArr151);
                                                    objEZpvd34 = YY.EZpvd(393, 5, (char) 5431, 209560679, false, (java.lang.String) objArr151[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                                }
                                                long jLongValue22 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd34).invoke(null, objArr150)).longValue();
                                                long j149 = 215694967;
                                                long j150 = jLongValue22 ^ j10;
                                                long elapsedCpuTime4 = (int) android.os.Process.getElapsedCpuTime();
                                                long j151 = elapsedCpuTime4 ^ j10;
                                                long j152 = (((long) 50) * j149) + (((long) (-97)) * jLongValue22) + (((long) 98) * (((j150 | j151) ^ j10) | ((j150 | j149) ^ j10))) + (((long) (-49)) * (j150 | (((j149 ^ j10) | j151) ^ j10) | ((j149 | elapsedCpuTime4) ^ j10))) + (((long) 49) * (((j150 | elapsedCpuTime4) ^ j10) | ((jLongValue22 | j149) ^ j10))) + ((long) 1674236656);
                                                int elapsedCpuTime5 = (int) android.os.Process.getElapsedCpuTime();
                                                int i426 = ~elapsedCpuTime5;
                                                int i427 = 1905160562 + (((~(778907276 | i426)) | (-2146271181) | (~(2078833608 | i426)) | (~((-711469705) | elapsedCpuTime5))) * (-84));
                                                int i428 = (~(elapsedCpuTime5 | 2078833608)) | (-778907277);
                                                int i429 = ~(i426 | (-2078833609));
                                                int i430 = ((int) (j152 >> 32)) & (i427 + ((i428 | i429) * (-84)) + ((711469704 | i429) * 84));
                                                int startUptimeMillis5 = (int) android.os.Process.getStartUptimeMillis();
                                                int i431 = ~startUptimeMillis5;
                                                int i432 = ((int) j152) & (149140404 + (((-337692719) | startUptimeMillis5) * (-859)) + (((~(startUptimeMillis5 | 1437191551)) | (~((-337692719) | i431))) * 859) + (((~(1099533691 | i431)) | 337657860) * 859));
                                                if (((i430 & i432) | (i430 ^ i432)) == 2) {
                                                    java.lang.Object[] objArr152 = {new int[]{(~(i & SubsamplingScaleImageView.ORIENTATION_270)) & (i | SubsamplingScaleImageView.ORIENTATION_270)}, new int[]{i}, new int[1], null};
                                                    int iUptimeMillis5 = (int) android.os.SystemClock.uptimeMillis();
                                                    int i433 = (-42184558) + (((~((-929984440) | iUptimeMillis5)) | 883434965) * (-366)) + (((~(iUptimeMillis5 | (-54938147))) | 8388672) * 366);
                                                    int i434 = (i433 & 16) + (16 | i433);
                                                    int i435 = (i3 ^ i434) + ((i434 & i3) << 1);
                                                    int i436 = (i435 << 13) ^ i435;
                                                    int i437 = i436 >>> 17;
                                                    int i438 = (i436 | i437) & (~(i436 & i437));
                                                    ((int[]) objArr152[2])[0] = i438 ^ (i438 << 5);
                                                    return objArr152;
                                                }
                                                if ((i2 & 4096) != 0) {
                                                    java.lang.Object objEZpvd35 = YY.EZpvd(-1453681456);
                                                    if (objEZpvd35 == null) {
                                                        byte b23 = (byte) 49;
                                                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                        b((byte) 3, b23, (byte) (b23 & 7), objArr153);
                                                        objEZpvd35 = YY.EZpvd(454, 5, (char) 39479, -1384490580, false, (java.lang.String) objArr153[0], new java.lang.Class[0]);
                                                    }
                                                    long jLongValue23 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd35).invoke(null, null)).longValue();
                                                    int i439 = AEQbTJ;
                                                    int i440 = (i439 ^ 13) + ((i439 & 13) << 1);
                                                    djBIcL = i440 % 128;
                                                    if (i440 % 2 == 0) {
                                                        long j153 = 1407205163;
                                                        long j154 = -661;
                                                        long j155 = j153 ^ j10;
                                                        long j156 = jLongValue23 ^ j10;
                                                        j2 = (j154 * j153) + (j154 * jLongValue23) + (((long) 1324) * (j123 | ((j155 | j156) ^ j10))) + (((long) (-1324)) * (((j153 | j) ^ j10) | ((jLongValue23 | j) ^ j10))) + (((long) 662) * (((j155 | jLongValue23) ^ j10) | ((j156 | j153) ^ j10))) + ((long) 605552518);
                                                        i20 = ((int) (j2 >>> 28)) & (1704617878 + (((~((-1404071409) | i)) | 1386228832) * 305) + (((~(i8 | (-1404071409))) | 1453669476) * 305));
                                                        i17 = i;
                                                        i16 = i8;
                                                    } else {
                                                        long j157 = 249369955;
                                                        int iFreeMemory5 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                        long j158 = (((long) WebIndicator.MAX_DECELERATE_SPEED_DURATION) * j157) + (((long) (-448)) * jLongValue23);
                                                        long j159 = 449;
                                                        long j160 = ((j157 ^ j10) | jLongValue23) ^ j10;
                                                        long j161 = jLongValue23 ^ j10;
                                                        long j162 = iFreeMemory5;
                                                        j2 = j158 + ((j160 | (((j161 | j157) | j162) ^ j10)) * j159) + (((long) (-1347)) * j160) + (j159 * (j160 | ((((j162 ^ j10) | j161) | j157) ^ j10))) + ((long) 1763387726);
                                                        i17 = i;
                                                        i16 = i8;
                                                        i20 = ((-1716495254) + (((-1073860603) | i17) * (-50)) + (((~(1783881722 | i17)) | (~(i16 | (-1441)))) * 50) + (((~((-1073860603) | i16)) | (~(1783880282 | i8)) | 1440) * 50)) & ((int) (j2 >> 32));
                                                    }
                                                    int i441 = ~((-435787334) | i17);
                                                    if (((((int) j2) & (((575220001 | i441) * (-658)) + 247422613 + ((i441 | 4784129) * 658))) | i20) != 0) {
                                                        int i442 = djBIcL;
                                                        int i443 = ((i442 | 59) << 1) - (i442 ^ 59);
                                                        AEQbTJ = i443 % 128;
                                                        if (i443 % 2 != 0) {
                                                            objArr2 = new java.lang.Object[2];
                                                            objArr2[1] = new int[1];
                                                            objArr2[1] = new int[1];
                                                            c6 = 4;
                                                        } else {
                                                            java.lang.Object[] objArr154 = new java.lang.Object[4];
                                                            objArr154[0] = new int[1];
                                                            objArr154[1] = new int[1];
                                                            objArr2 = objArr154;
                                                            c6 = 2;
                                                        }
                                                        objArr2[c6] = new int[1];
                                                        int i444 = (~(i17 & 265)) & (i17 | 265);
                                                        ((int[]) objArr2[1])[0] = i17;
                                                        ((int[]) objArr2[0])[0] = i444;
                                                        objArr2[3] = null;
                                                        int i445 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                                                        int i446 = 448562588 + (((-1275068493) | i445) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) + (((~(i445 | 269843232)) | (-1276404045)) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
                                                        int i447 = -(-(((i446 | 16) << 1) - (i446 ^ 16)));
                                                        int i448 = (i3 ^ i447) + ((i447 & i3) << 1);
                                                        int i449 = (i448 << 13) ^ i448;
                                                        int i450 = i449 >>> 17;
                                                        int i451 = ((~i449) & i450) | ((~i450) & i449);
                                                        int i452 = i451 << 5;
                                                        ((int[]) objArr2[2])[0] = (i451 | i452) & (~(i451 & i452));
                                                        return objArr2;
                                                    }
                                                    i15 = i3;
                                                } else {
                                                    i15 = i3;
                                                    i16 = i8;
                                                    i17 = i;
                                                }
                                                java.lang.Object objEZpvd36 = YY.EZpvd(-1389037328);
                                                if (objEZpvd36 == null) {
                                                    byte b24 = (byte) 49;
                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                    b((byte) 3, b24, (byte) (b24 & 7), objArr155);
                                                    objEZpvd36 = YY.EZpvd(625, 5, (char) 0, -1458293364, false, (java.lang.String) objArr155[0], new java.lang.Class[0]);
                                                }
                                                long jLongValue24 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd36).invoke(null, null)).longValue();
                                                long j163 = -789260086;
                                                long j164 = j163 ^ j10;
                                                long jMyUid2 = android.os.Process.myUid();
                                                long j165 = (((long) 567) * j163) + (((long) (-565)) * jLongValue24) + (((long) (-566)) * (((j164 | jLongValue24) ^ j10) | ((j164 | jMyUid2) ^ j10)));
                                                long j166 = 566;
                                                long j167 = jLongValue24 ^ j10;
                                                long j168 = j165 + (((j163 | j167) ^ j10) * j166) + (j166 * ((jMyUid2 | (j164 | j167)) ^ j10)) + ((long) (-130360889));
                                                int iNextInt5 = new java.util.Random().nextInt(851134367);
                                                int i453 = ~iNextInt5;
                                                int i454 = ((int) (j168 >> 32)) & (501358106 + (((~(1691143201 | i453)) | (-1707925044)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256) + ((~(1707925043 | iNextInt5)) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256) + (((~(iNextInt5 | (-16781843))) | (~(i453 | 1166597683)) | 541327360) * CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256));
                                                int i455 = ((int) j168) & ((((~((-1878874576) | r5)) * TypedValues.CycleType.TYPE_EASING) - 1419801031) + (((~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | (-1878874576))) | 268567584) * TypedValues.CycleType.TYPE_EASING));
                                                if (((i454 & i455) | (i454 ^ i455)) != 0) {
                                                    java.lang.Object[] objArr156 = {new int[]{(i17 & (-273)) | (i16 & 272)}, new int[]{i17}, new int[1], null};
                                                    int i456 = ((~((-8724737) | i16)) * 130) + 1637556940 + (((~(i17 | (-8724737))) | 190857312) * 130);
                                                    int iKWHzl8 = AbstractC31905mIg.KWHzl();
                                                    int i457 = i456 * TypedValues.MotionType.TYPE_EASING;
                                                    int i458 = (4832 & i457) + (i457 | 4832);
                                                    int i459 = ~iKWHzl8;
                                                    int i460 = ~(((-17) ^ i459) | ((-17) & i459));
                                                    int i461 = (i458 - (~(-(-(((i460 & i456) | (i456 ^ i460)) * (-602)))))) - 1;
                                                    int i462 = ~i456;
                                                    int i463 = ~((i462 & (-17)) | ((-17) ^ i462));
                                                    int i464 = ~((iKWHzl8 & (-17)) | ((-17) ^ iKWHzl8));
                                                    int i465 = (i459 ^ 16) | (i459 & 16);
                                                    int i466 = ((i464 & i463) | (i463 ^ i464) | (~((i465 & i456) | (i465 ^ i456)))) * LuaValue.ERR_CLOSE_FILE_ERROR;
                                                    int i467 = ((i461 | i466) << 1) - (i466 ^ i461);
                                                    int i468 = -(-((~(i456 | i459)) * 301));
                                                    int i469 = (i15 - (~((i467 ^ i468) + ((i468 & i467) << 1)))) - 1;
                                                    int i470 = i469 << 13;
                                                    int i471 = (i469 | i470) & (~(i469 & i470));
                                                    int i472 = i471 >>> 17;
                                                    int i473 = (i471 | i472) & (~(i471 & i472));
                                                    int i474 = i473 << 5;
                                                    ((int[]) objArr156[2])[0] = ((~i473) & i474) | ((~i474) & i473);
                                                    return objArr156;
                                                }
                                                if ((i2 & 65536) != 0) {
                                                    java.lang.Object objEZpvd37 = YY.EZpvd(-319355609);
                                                    if (objEZpvd37 == null) {
                                                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                        b((byte) 5, (byte) 46, (byte) 0, objArr157);
                                                        objEZpvd37 = YY.EZpvd(625, 5, (char) 0, -388511653, false, (java.lang.String) objArr157[0], new java.lang.Class[0]);
                                                    }
                                                    long jLongValue25 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd37).invoke(null, null)).longValue();
                                                    long j169 = -1558639323;
                                                    long j170 = -183;
                                                    long j171 = j169 ^ j10;
                                                    long j172 = j171 | j123;
                                                    long j173 = jLongValue25 ^ j10;
                                                    long j174 = j173 | j123;
                                                    long j175 = (j170 * j169) + (j170 * jLongValue25) + (((long) (-184)) * (((j172 | jLongValue25) ^ j10) | ((j174 | j169) ^ j10)));
                                                    long j176 = CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
                                                    long j177 = j175 + ((((j171 | j173) ^ j10) | (j172 ^ j10) | (j174 ^ j10)) * j176) + (j176 * (jLongValue25 | j169)) + ((long) 1922646851);
                                                    int i475 = ((int) (j177 >> 32)) & (635053320 + (((-17891337) | i17) * (-627)) + (((~((-1049424851) | i17)) | 387801560) * (-627)) + (((~(1049424850 | i16)) | (~(387801560 | i17))) * 627));
                                                    int iUptimeMillis6 = (int) android.os.SystemClock.uptimeMillis();
                                                    int i476 = ((int) j177) & ((((-1237711375) + (((~((-810554749) | iUptimeMillis6)) | (-2047186138)) * (-948))) + ((~((~iUptimeMillis6) | (-805311577))) * (-948))) - 675560708);
                                                    if (((i475 & i476) | (i475 ^ i476)) != 0) {
                                                        java.lang.Object[] objArr158 = {new int[]{(i17 & (-275)) | (i16 & 274)}, new int[]{i17}, new int[]{(i | i) & (~(i & i))}, null};
                                                        int i477 = 86132316 + (((~(1805012204 | i16)) | 8407200) * (-828)) + ((1805012204 | i16) * (-828)) + 98513268;
                                                        int i478 = (i477 & 16) + (i477 | 16);
                                                        int i479 = i478 * 503;
                                                        int i480 = -(-(i15 * 503));
                                                        int i481 = (i479 & i480) + (i479 | i480);
                                                        int i482 = i478 | i15;
                                                        int i483 = -(-(i482 * (-502)));
                                                        int i484 = (i481 ^ i483) + ((i483 & i481) << 1);
                                                        int i485 = ~i478;
                                                        int i486 = ~i15;
                                                        int i487 = ~((i486 & i485) | (i485 ^ i486));
                                                        int i488 = ~i478;
                                                        int i489 = ~((i488 & i16) | (i488 ^ i16));
                                                        int i490 = -(-(((i489 & i487) | (i487 ^ i489) | (~((i482 ^ i17) | (i482 & i17)))) * (-502)));
                                                        int i491 = ((i484 | i490) << 1) - (i490 ^ i484);
                                                        int i492 = (i485 ^ i16) | (i485 & i16);
                                                        int i493 = ~((i492 & i15) | (i492 ^ i15));
                                                        int i494 = ~(i17 | i482);
                                                        int i495 = i491 + (((i493 & i494) | (i493 ^ i494)) * 502);
                                                        int i496 = i495 << 13;
                                                        int i497 = (i496 & (~i495)) | ((~i496) & i495);
                                                        int i498 = i497 >>> 17;
                                                        int i499 = (i497 | i498) & (~(i497 & i498));
                                                        int i500 = i499 << 5;
                                                        return objArr158;
                                                    }
                                                }
                                                long[] jArr3 = {624887784092251L};
                                                java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                a(new char[]{6179, 30897, 6156, 53492, 29945, 40453, 7438, 49370, 33616, 63818, 47135, 15296, 11887, 25651, 54131, 40696, 51580, 53040, 20002, 61937, 29712}, 0, objArr159);
                                                java.lang.Object[] objArr160 = {(java.lang.String) objArr159[0], 3, 2251799813685247L, jArr3};
                                                java.lang.Object objEZpvd38 = YY.EZpvd(-976659337);
                                                if (objEZpvd38 == null) {
                                                    byte b25 = (byte) 49;
                                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                    b((byte) 3, b25, (byte) (b25 & 7), objArr161);
                                                    objEZpvd38 = YY.EZpvd(192, 4, (char) 32350, -1041657589, false, (java.lang.String) objArr161[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class});
                                                }
                                                long jLongValue26 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd38).invoke(null, objArr160)).longValue();
                                                long j178 = -628777705;
                                                long j179 = -502;
                                                long j180 = jLongValue26 ^ j10;
                                                long jFreeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                long j181 = (((long) (-501)) * j178) + (((long) 503) * jLongValue26) + ((((j180 | jFreeMemory3) ^ j10) | ((jLongValue26 | j178) ^ j10)) * j179) + (j179 * (((j180 | (jFreeMemory3 ^ j10)) | j178) ^ j10)) + (((long) 502) * (j180 | ((jFreeMemory3 | (j178 ^ j10)) ^ j10))) + ((long) (-15518198));
                                                int i501 = ((int) (j181 >> 32)) & ((((-339317608) + (((-289407491) | i17) * (-381))) + (((~(1144651224 | i16)) | (-1430891019)) * 381)) - 1404896006);
                                                int iNextInt6 = new java.util.Random().nextInt();
                                                int i502 = ~iNextInt6;
                                                int i503 = ((int) j181) & ((-1871736089) + (((~(72240734 | i502)) | (~(1364985675 | iNextInt6))) * 1900) + (((~(i502 | (-1364985676))) | (~((-72240735) | iNextInt6))) * (-950)) + (((~(iNextInt6 | (-1364985676))) | (~(i502 | (-72240735)))) * 950));
                                                if (((i501 & i503) | (i501 ^ i503)) != 0) {
                                                    java.lang.Object[] objArr162 = {new int[]{(i17 & (-276)) | (i16 & 275)}, new int[]{i17}, new int[]{(i | i) & (~(i & i))}, null};
                                                    int i504 = 1846280404 + ((i17 | 163648520) * 988) + (((~(165401626 | i16)) | 1646264672) * (-1976)) + ((163648520 | (~((-1648017779) | i17)) | (~(1648017778 | i16))) * 988);
                                                    int i505 = i504 * (-575);
                                                    int i506 = (((-9200) | i505) << 1) - (i505 ^ (-9200));
                                                    int i507 = ~i504;
                                                    int i508 = ~(((-17) & i507) | ((-17) ^ i507));
                                                    int i509 = ~((i17 & i507) | (i507 ^ i17));
                                                    int i510 = ((i509 & i508) | (i508 ^ i509)) * 576;
                                                    int i511 = (i506 & i510) + (i510 | i506);
                                                    int i512 = ~((-17) | i504);
                                                    int i513 = ~i504;
                                                    int i514 = (i513 & i16) | (i513 ^ i16);
                                                    int i515 = ~((i514 & 16) | (i514 ^ 16));
                                                    int i516 = ((i515 & i512) | (i512 ^ i515)) * 576;
                                                    int i517 = -(-((((i511 | i516) << 1) - (i511 ^ i516)) + ((~((i507 & (-17)) | ((-17) ^ i507))) * 576)));
                                                    int i518 = (i15 ^ i517) + ((i517 & i15) << 1);
                                                    int i519 = (i518 << 13) ^ i518;
                                                    int i520 = i519 >>> 17;
                                                    int i521 = ((~i519) & i520) | ((~i520) & i519);
                                                    int i522 = i521 << 5;
                                                    return objArr162;
                                                }
                                                java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                a(new char[]{20607, 42953, 20560, 42183, 19877, 16745, 26922, 63903, 52032, 9831, 52262, 670, 26166, 47966, 42756}, 0, objArr163);
                                                java.lang.Object[] objArr164 = {(java.lang.String) objArr163[0]};
                                                java.lang.Object objEZpvd39 = YY.EZpvd(1704729038);
                                                if (objEZpvd39 == null) {
                                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                    b((byte) 5, (byte) 46, (byte) 0, objArr165);
                                                    objEZpvd39 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr165[0], new java.lang.Class[]{java.lang.String.class});
                                                }
                                                long jLongValue27 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd39).invoke(null, objArr164)).longValue();
                                                long j182 = 1867245130;
                                                long j183 = 521;
                                                long j184 = j182 ^ j10;
                                                long j185 = (((long) (-520)) * j182) + (((long) 522) * jLongValue27) + ((((j184 | jLongValue27) | j) ^ j10) * j183);
                                                long j186 = ((jLongValue27 ^ j10) | j182) ^ j10;
                                                long j187 = j185 + (((long) (-1042)) * j186) + (j183 * ((((j184 | j123) | jLongValue27) ^ j10) | j186)) + ((long) (-2032841857));
                                                int i523 = ((int) (j187 >> 32)) & ((-802173004) + (((-341836378) | i16) * (-369)) + (((~(359998331 | i16)) | 1797224742) * (-369)) + (((~((-359998332) | i17)) | 18161954 | (~(2139061119 | i16))) * 369));
                                                int i524 = ((int) j187) & (((1019428157 + (((~((-67381257) | i16)) | (~(2145386238 | i16))) * (-184))) + ((((~((-387770543) | i16)) | 320389286) | (~(1824996952 | i16))) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256)) - 1278741048);
                                                if (((i523 & i524) | (i523 ^ i524)) != 0) {
                                                    int i525 = (i17 & (-277)) | (i16 & 276);
                                                    int i526 = AEQbTJ;
                                                    int i527 = ((i526 | 97) << 1) - (i526 ^ 97);
                                                    djBIcL = i527 % 128;
                                                    int i528 = i527 % 2;
                                                    java.lang.Object[] objArr166 = {new int[]{i525}, new int[]{i17}, new int[1], null};
                                                    int iMyUid2 = android.os.Process.myUid();
                                                    int i529 = (-1805332300) + (((~iMyUid2) | (-1809925227)) * 1444) + (((~(iMyUid2 | 1757063379)) | (~(56356025 | iMyUid2)) | (-1811672316)) * (-1444)) + 1095955188;
                                                    int i530 = (i15 - (~((i529 ^ 16) + ((16 & i529) << 1)))) - 1;
                                                    int i531 = i530 ^ (i530 << 13);
                                                    int i532 = i531 >>> 17;
                                                    int i533 = ((~i531) & i532) | ((~i532) & i531);
                                                    int i534 = i533 << 5;
                                                    ((int[]) objArr166[2])[0] = (i533 | i534) & (~(i533 & i534));
                                                    return objArr166;
                                                }
                                                if (Build.VERSION.SDK_INT >= 21 && (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
                                                    java.lang.Object objEZpvd40 = YY.EZpvd(-579690702);
                                                    if (objEZpvd40 == null) {
                                                        byte b26 = (byte) 49;
                                                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                        b((byte) 3, b26, (byte) (b26 & 7), objArr167);
                                                        objEZpvd40 = YY.EZpvd(630, 5, (char) 0, -648916402, false, (java.lang.String) objArr167[0], new java.lang.Class[0]);
                                                    }
                                                    long jLongValue28 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd40).invoke(null, null)).longValue();
                                                    long j188 = 963896122;
                                                    long j189 = j188 ^ j10;
                                                    long jMaxMemory3 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                    long j190 = (((long) 236) * j188) + (((long) 471) * jLongValue28) + (((long) (-235)) * (jLongValue28 | ((j189 | (jMaxMemory3 ^ j10)) ^ j10))) + (((long) (-470)) * (jLongValue28 | ((j189 | jMaxMemory3) ^ j10))) + (((long) 235) * (((jMaxMemory3 | (j189 | jLongValue28)) ^ j10) | (((jLongValue28 ^ j10) | j188) ^ j10))) + ((long) (-1930663706));
                                                    int i535 = ((int) (j190 >> 32)) & (((~((-268451841) | i16)) * 130) + 208904214 + (((~((-268451841) | i17)) | 38340682) * 130));
                                                    int i536 = ~(382051753 | i16);
                                                    int i537 = ~(1055174656 | i17);
                                                    int i538 = ((int) j190) & (334239082 + ((i536 | i537) * 1150) + (((~((-1055174657) | i16)) | i537) * (-575)) + (((~(382051753 | i17)) | (~((-382051754) | i16))) * 575));
                                                    if (((i535 & i538) | (i535 ^ i538)) != 0) {
                                                        java.lang.Object[] objArr168 = new java.lang.Object[4];
                                                        int[] iArr8 = new int[1];
                                                        objArr168[0] = iArr8;
                                                        int[] iArr9 = new int[1];
                                                        objArr168[1] = iArr9;
                                                        objArr168[2] = new int[1];
                                                        int i539 = (~(i17 & 273)) & (i17 | 273);
                                                        int i540 = djBIcL;
                                                        int i541 = (i540 & 49) + (i540 | 49);
                                                        AEQbTJ = i541 % 128;
                                                        if (i541 % 2 != 0) {
                                                            c5 = 0;
                                                            int i542 = 34 / 0;
                                                        } else {
                                                            c5 = 0;
                                                        }
                                                        iArr9[c5] = i17;
                                                        iArr8[c5] = i539;
                                                        objArr168[3] = null;
                                                        int iMyTid4 = android.os.Process.myTid();
                                                        int i543 = ~iMyTid4;
                                                        int i544 = (-1712463000) + (((~(1454840346 | i543)) | 21520736) * (-1188));
                                                        int i545 = (~(iMyTid4 | (-1454840347))) | 21520736;
                                                        int i546 = ~(358579058 | i543);
                                                        int i547 = -(-(i544 + ((i545 | i546) * 594) + (((~((-1454840347) | i543)) | 1117782024 | i546) * 594) + 16));
                                                        int i548 = (i15 ^ i547) + ((i547 & i15) << 1);
                                                        int i549 = i548 << 13;
                                                        int i550 = (i549 | i548) & (~(i548 & i549));
                                                        int i551 = i550 >>> 17;
                                                        int i552 = (i550 | i551) & (~(i550 & i551));
                                                        int i553 = i552 << 5;
                                                        ((int[]) objArr168[2])[0] = (i552 | i553) & (~(i552 & i553));
                                                        return objArr168;
                                                    }
                                                }
                                                if ((i2 & 2097152) == 0) {
                                                    java.lang.Object objEZpvd41 = YY.EZpvd(-331456536);
                                                    if (objEZpvd41 == null) {
                                                        byte b27 = (byte) 49;
                                                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                        b((byte) 3, b27, (byte) (b27 & 7), objArr169);
                                                        objEZpvd41 = YY.EZpvd(208, 5, (char) 0, -400649580, false, (java.lang.String) objArr169[0], new java.lang.Class[0]);
                                                    }
                                                    long jLongValue29 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd41).invoke(null, null)).longValue();
                                                    long j191 = -704826445;
                                                    long j192 = -574;
                                                    long j193 = j191 ^ j10;
                                                    long j194 = ((jLongValue29 ^ j10) | j) ^ j10;
                                                    long j195 = (j192 * j191) + (j192 * jLongValue29) + (((long) 1150) * (((j193 | j123) ^ j10) | j194)) + (((long) (-575)) * (j194 | ((j123 | jLongValue29) ^ j10))) + (((long) 575) * ((j10 ^ (j123 | j191)) | ((j193 | j) ^ j10))) + ((long) 1814745138);
                                                    int i554 = ((int) (j195 >> 32)) & (((((68162688 | r5) | (~(1229955367 | i17))) * (-338)) - 1293588822) + (((~((-1229955368) | i16)) | (~(1298118055 | i17))) * 338));
                                                    int i555 = ((int) j195) & (401717099 + ((1233753417 | i17) * 614) + (((~((-954703824) | i16)) | 142710089 | (~(1903037062 | i16))) * (-1228)) + (((~((-811993735) | i16)) | (~(2045747151 | i16))) * 614));
                                                    if (((i554 & i555) | (i554 ^ i555)) != 0) {
                                                        int i556 = AEQbTJ;
                                                        int i557 = (i556 ^ 65) + ((i556 & 65) << 1);
                                                        djBIcL = i557 % 128;
                                                        int i558 = i557 % 2;
                                                        java.lang.Object[] objArr170 = {new int[]{(i17 & (-280)) | (i16 & 279)}, new int[]{i17}, new int[1], null};
                                                        int i559 = (((~((-160432193) | r1)) * 521) - 653443612) + (((~((~android.os.Process.myUid()) | (-160432193))) | 33907752) * 521) + 16;
                                                        int iKWHzl9 = AbstractC31905mIg.KWHzl();
                                                        int i560 = i559 * 765;
                                                        int i561 = -(-(i15 * (-1527)));
                                                        int i563 = (i560 & i561) + (i560 | i561);
                                                        int i564 = ~iKWHzl9;
                                                        int i565 = i563 + (((~((i564 ^ i559) | (i564 & i559))) | i15) * 764);
                                                        int i566 = ~i559;
                                                        int i567 = ~(i566 | i15);
                                                        int i568 = ~iKWHzl9;
                                                        int i569 = (i565 - (~(((~((i568 & i15) | (i568 ^ i15))) | i567) * (-1528)))) - 1;
                                                        int i570 = ~((i566 ^ i15) | (i566 & i15));
                                                        int i571 = ~i15;
                                                        int i573 = ~((i571 & i559) | (i571 ^ i559));
                                                        int i574 = (i570 & i573) | (i570 ^ i573);
                                                        int i575 = ~((i559 & i564) | (i564 ^ i559));
                                                        int i576 = ((i574 & i575) | (i574 ^ i575)) * 764;
                                                        int i577 = (i569 & i576) + (i576 | i569);
                                                        int i578 = i577 << 13;
                                                        int i579 = (i578 | i577) & (~(i577 & i578));
                                                        int i580 = i579 >>> 17;
                                                        int i581 = ((~i579) & i580) | ((~i580) & i579);
                                                        int i583 = i581 << 5;
                                                        ((int[]) objArr170[2])[0] = ((~i581) & i583) | ((~i583) & i581);
                                                        return objArr170;
                                                    }
                                                }
                                                java.lang.Object[] objArr171 = {java.lang.Integer.valueOf(i), obj, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2)};
                                                java.lang.Object objEZpvd42 = YY.EZpvd(1399480618);
                                                if (objEZpvd42 == null) {
                                                    objEZpvd42 = YY.EZpvd(383, 5, (char) 35536, 1464511574, false, null, new java.lang.Class[]{java.lang.Integer.TYPE, (java.lang.Class) YY.AEQbTJ(388, 5, (char) 0), java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                                }
                                                java.lang.Object objNewInstance = ((java.lang.reflect.Constructor) objEZpvd42).newInstance(objArr171);
                                                try {
                                                    if (!z) {
                                                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                        a(new char[]{46664, 35582, 46626, 2328, 32050, 27739, 50406, 51487, 11638, 2886, 25057, 12800, 32783, 38452, 2788, 38710, 26378, 15727, 38849, 63530}, 0, objArr172);
                                                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr172[0]);
                                                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                        c(new char[]{63369, 1997, 5917, 10049, 13954}, 61507, objArr173);
                                                        java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr173[0], null);
                                                        int i584 = djBIcL;
                                                        int i585 = (i584 & 71) + (i584 | 71);
                                                        AEQbTJ = i585 % 128;
                                                        java.lang.Object obj4 = null;
                                                        if (i585 % 2 != 0) {
                                                            method.invoke(objNewInstance, null);
                                                            obj4.hashCode();
                                                            throw null;
                                                        }
                                                        method.invoke(objNewInstance, null);
                                                    } else {
                                                        int i586 = ~(((-342242882) ^ i16) | ((-342242882) & i16));
                                                        int i587 = ((i586 & (-1031122494)) | ((-1031122494) ^ i586)) * (-235);
                                                        int i588 = ~(((-342242882) & i17) | ((-342242882) ^ i17));
                                                        int i589 = ((-1162448934) ^ i587) + ((i587 & (-1162448934)) << 1) + (((i588 & (-1031122494)) | ((-1031122494) ^ i588)) * (-470));
                                                        int i590 = ~(((-342107650) & i17) | ((-342107650) ^ i17));
                                                        int i591 = ((i590 & (-1031257726)) | ((-1031257726) ^ i590)) * 235;
                                                        int i593 = ((i589 | i591) << 1) - (i591 ^ i589);
                                                        int i594 = (162601057 ^ i17) | (162601057 & i17);
                                                        int i595 = 1409905836 - (~(((i594 & (-402784841)) | (i594 ^ (-402784841))) * (-676)));
                                                        int i596 = ((~((162601057 & i16) | (i16 ^ 162601057))) | 268567048) * 676;
                                                        int i597 = ((i595 | i596) << 1) - (i596 ^ i595);
                                                        int i598 = ~((-402784841) | i16);
                                                        int i599 = (i598 & 134217792) | (134217792 ^ i598);
                                                        int i600 = ~((431168105 & i17) | (431168105 ^ i17));
                                                        int i601 = -(-(((i599 & i600) | (i599 ^ i600)) * 676));
                                                        if (i593 <= ((i597 | i601) << 1) - (i601 ^ i597)) {
                                                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                            a(new char[]{46664, 35582, 46626, 2328, 32050, 27739, 50406, 51487, 11638, 2886, 25057, 12800, 32783, 38452, 2788, 38710, 26378, 15727, 38849, 63530}, 0, objArr174);
                                                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr174[0]);
                                                            java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                            c(new char[]{63368, 40200, 8858}, 27271, objArr175);
                                                            c4 = 0;
                                                            cls2.getMethod((java.lang.String) objArr175[0], null).invoke(objNewInstance, null);
                                                            i18 = 4;
                                                            java.lang.Object[] objArr176 = new java.lang.Object[i18];
                                                            int[] iArr10 = new int[1];
                                                            objArr176[c4] = iArr10;
                                                            int[] iArr11 = new int[1];
                                                            objArr176[1] = iArr11;
                                                            objArr176[2] = new int[1];
                                                            iArr11[c4] = i17;
                                                            iArr10[c4] = i17;
                                                            objArr176[3] = null;
                                                            int i603 = AEQbTJ;
                                                            i19 = ((i603 | 73) << 1) - (i603 ^ 73);
                                                            djBIcL = i19 % 128;
                                                            if (i19 % 2 != 0) {
                                                                AbstractC31905mIg.KWHzl();
                                                                java.lang.Object obj5 = null;
                                                                obj5.hashCode();
                                                                throw null;
                                                            }
                                                            int i604 = 1425861132 + (((~((-1197147687) | i17)) | (~(1744539494 | i16))) * (-406)) + ((~((-1128267777) | i16)) * (-406)) + (((~((-616271719) | i17)) | (~(1197147686 | i16))) * WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED);
                                                            int iKWHzl10 = AbstractC31905mIg.KWHzl();
                                                            int i605 = (-1) - (~(i604 * (-163)));
                                                            int i606 = ~iKWHzl10;
                                                            int i607 = (~((i606 ^ i604) | (i606 & i604))) * (-328);
                                                            int i608 = (i605 ^ i607) + ((i607 & i605) << 1);
                                                            int i609 = iKWHzl10 * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256;
                                                            int i610 = (i608 & i609) + (i609 | i608);
                                                            int i611 = ~i604;
                                                            int i613 = ~((iKWHzl10 & i611) | (i611 ^ iKWHzl10));
                                                            int i614 = ~(i606 | i604);
                                                            int i615 = -(-(((i613 & i614) | (i613 ^ i614)) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256));
                                                            int i616 = -(-(((i610 | i615) << 1) - (i615 ^ i610)));
                                                            int i617 = (i15 ^ i616) + ((i616 & i15) << 1);
                                                            int i618 = (i617 << 13) ^ i617;
                                                            int i619 = AEQbTJ;
                                                            int i620 = (i619 & 45) + (i619 | 45);
                                                            djBIcL = i620 % 128;
                                                            if (i620 % 2 == 0) {
                                                                int i621 = i618 ^ (i618 >>> 123);
                                                                int i623 = i621 << 3;
                                                                ((int[]) objArr176[4])[1] = (i621 | i623) & (~(i621 & i623));
                                                                return objArr176;
                                                            }
                                                            int i624 = i618 >>> 17;
                                                            int i625 = (i618 | i624) & (~(i618 & i624));
                                                            int i626 = i625 << 5;
                                                            ((int[]) objArr176[2])[0] = (i625 | i626) & (~(i625 & i626));
                                                            return objArr176;
                                                        }
                                                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                        a(new char[]{46664, 35582, 46626, 2328, 32050, 27739, 50406, 51487, 11638, 2886, 25057, 12800, 32783, 38452, 2788, 38710, 26378, 15727, 38849, 63530}, 0, objArr177);
                                                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr177[0]);
                                                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                        c(new char[]{63368, 40200, 8858}, 22516, objArr178);
                                                        cls3.getMethod((java.lang.String) objArr178[0], null).invoke(objNewInstance, null);
                                                    }
                                                    i18 = 4;
                                                    c4 = 0;
                                                    java.lang.Object[] objArr1762 = new java.lang.Object[i18];
                                                    int[] iArr102 = new int[1];
                                                    objArr1762[c4] = iArr102;
                                                    int[] iArr112 = new int[1];
                                                    objArr1762[1] = iArr112;
                                                    objArr1762[2] = new int[1];
                                                    iArr112[c4] = i17;
                                                    iArr102[c4] = i17;
                                                    objArr1762[3] = null;
                                                    int i6032 = AEQbTJ;
                                                    i19 = ((i6032 | 73) << 1) - (i6032 ^ 73);
                                                    djBIcL = i19 % 128;
                                                    if (i19 % 2 != 0) {
                                                    }
                                                } catch (java.lang.Throwable th13) {
                                                    java.lang.Throwable cause3 = th13.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th13;
                                                }
                                            }
                                        } else {
                                            i8 = i8;
                                            i14 = i3;
                                        }
                                        java.lang.Object[] objArr179 = {new int[]{i5}, new int[]{i5}, new int[1], null};
                                        int i627 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                        int i628 = 649524400 + (((~(i627 | 1615820944)) | (-197598461)) * (-465)) + ((1615820944 | (~((-197598461) | i627))) * 930) + ((i627 | (-192939117)) * 465);
                                        int iKWHzl11 = AbstractC31905mIg.KWHzl();
                                        int i629 = i628 * 434;
                                        int i630 = ~iKWHzl11;
                                        int i631 = -(-((~(i630 | ((-1) ^ i630) | i628)) * 433));
                                        int i633 = ((i629 | i631) << 1) - (i629 ^ i631);
                                        int i634 = ~i628;
                                        int i635 = ~((iKWHzl11 & i634) | (i634 ^ iKWHzl11));
                                        int i636 = i633 + ((i635 | ((-1) ^ i635)) * (-433));
                                        int i637 = (~i628) * 433;
                                        int i638 = (i14 - (~(-(-((i636 & i637) + (i637 | i636)))))) - 1;
                                        int i639 = i638 << 13;
                                        int i640 = ((~i638) & i639) | ((~i639) & i638);
                                        int i641 = i640 ^ (i640 >>> 17);
                                        int i643 = i641 << 5;
                                        int i644 = (i641 | i643) & (~(i641 & i643));
                                        c2 = 0;
                                        ((int[]) objArr179[2])[0] = i644;
                                        objArr = objArr179;
                                        if (((int[]) objArr[1])[c2] != ((int[]) objArr[c2])[c2]) {
                                        }
                                    }
                                }
                            }
                            c2 = c3;
                            if (((int[]) objArr[1])[c2] != ((int[]) objArr[c2])[c2]) {
                            }
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause4 = th14.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th14;
                        }
                    }
                } else {
                    int i645 = 0;
                    while (i645 < 7) {
                        java.lang.Object[] objArr180 = {strArr4[i645]};
                        java.lang.Object objEZpvd43 = YY.EZpvd(1042988763);
                        if (objEZpvd43 == null) {
                            byte b28 = (byte) 49;
                            java.lang.Object[] objArr181 = new java.lang.Object[1];
                            b((byte) 3, b28, (byte) (b28 & 7), objArr181);
                            objEZpvd43 = YY.EZpvd(464, 5, (char) 18355, 973763495, false, (java.lang.String) objArr181[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long jLongValue30 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd43).invoke(null, objArr180)).longValue();
                        long j196 = -873071833;
                        long j197 = -721;
                        int i646 = i645;
                        long jMaxMemory4 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        long j198 = j196 ^ j10;
                        long j199 = jLongValue30 ^ j10;
                        long j200 = (j196 | jLongValue30) ^ j10;
                        long j201 = (j197 * j196) + (j197 * jLongValue30) + (((long) 1444) * ((jMaxMemory4 ^ j10) | ((j198 | j199) ^ j10) | j200)) + (((long) (-1444)) * (j200 | ((j196 | jMaxMemory4) ^ j10) | ((jMaxMemory4 | jLongValue30) ^ j10))) + (((long) 722) * (((j198 | jLongValue30) ^ j10) | ((j199 | j196) ^ j10))) + ((long) (-247112311));
                        int iMyUid3 = android.os.Process.myUid();
                        int i647 = ((int) (j201 >> 32)) & ((-1120055885) + (((~((~iMyUid3) | 1135485574)) | (-1722255311)) * (-235)) + (((~(1135485574 | iMyUid3)) | (-1722255311)) * (-470)) + (((~(iMyUid3 | (-604079433))) | 17309696) * 235));
                        int i648 = (~(2006221427 | i5)) | (~(568995017 | i182));
                        int i649 = ~((-2006221428) | i182);
                        int i650 = ((int) j201) & (1190949729 + ((i648 | i649) * (-516)) + (((~((-6958217) | i5)) | (~((-562036802) | i182))) * 516) + ((562036801 | i649) * 516));
                        if (((i650 & i647) | (i647 ^ i650)) != 0) {
                            int i651 = -(-(i646 * (-159)));
                            int i653 = (((-14310) | i651) << 1) - (i651 ^ (-14310));
                            int i654 = -(-(((i646 ^ (-91)) | (i646 & (-91))) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256));
                            int i655 = ((i653 | i654) << 1) - (i654 ^ i653);
                            int i656 = AEQbTJ - (-1);
                            djBIcL = i656 % 128;
                            int i657 = i656 % 2;
                            int i658 = ~(i182 | 90);
                            int i659 = ~((90 ^ i646) | (90 & i646));
                            int i660 = (-160) * ((i658 & i659) | (i658 ^ i659));
                            int i661 = (i655 & i660) + (i655 | i660);
                            int i663 = ~i646;
                            int i664 = ~((i663 & i182) | (i663 ^ i182));
                            int i665 = -(-(((i664 & 90) | (i664 ^ 90)) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256));
                            i6 = (i661 | i665) + (i661 & i665);
                            break;
                        }
                        i645 = i646 + 1;
                    }
                    i6 = 0;
                    if (i6 == 0) {
                    }
                }
            } else {
                int i666 = AEQbTJ;
                int i667 = ((i666 | 71) << 1) - (i666 ^ 71);
                djBIcL = i667 % 128;
                int i668 = i667 % 2;
                objArr4 = new java.lang.Object[]{new int[]{(i5 & (-249)) | (i182 & 248)}, new int[]{i5}, new int[]{(i | i) & (~(i & i))}, null};
                int i669 = 1246586552 + (((~((-252197097) | i182)) | 1561222308) * 519) + (((~((-33562697) | i182)) | (~(1594785004 | i5))) * (-519)) + (((~(i5 | 1561222308)) | 252197096) * 519);
                int i670 = (i669 ^ 16) + ((16 & i669) << 1);
                int i671 = (i670 * 714) + (i3 * (-712));
                int i673 = ~((~i670) | (~i5));
                int i674 = ~i670;
                int i675 = ~((i674 & i3) | (i674 ^ i3));
                int i676 = (i673 & i675) | (i673 ^ i675);
                int i677 = ~i3;
                int i678 = (i670 & i677) | (i677 ^ i670);
                int i679 = ~((i678 & i5) | (i678 ^ i5));
                int i680 = ((i676 ^ i679) | (i676 & i679)) * (-713);
                int i681 = (i671 ^ i680) + ((i680 & i671) << 1);
                int i683 = -(-(i679 * 1426));
                int i684 = (i681 ^ i683) + ((i683 & i681) << 1);
                int i685 = -(-((~((i677 ^ i182) | (i182 & i677))) * 713));
                int i686 = (i684 ^ i685) + ((i685 & i684) << 1);
                int i687 = (i686 << 13) ^ i686;
                int i688 = i687 >>> 17;
                int i689 = ((~i687) & i688) | ((~i688) & i687);
                int i690 = i689 << 5;
            }
            return objArr4;
        } catch (java.lang.Throwable th15) {
            java.lang.Throwable cause5 = th15.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th15;
        }
    }
}

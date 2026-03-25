package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Ux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5521Ux {
    public static final byte[] AEQbTJ;
    public static final int[] AYXKKw;
    public static final int[] AhwBna;
    public static final int[] DbNXlk;
    public static final char[] EZpvd;
    public static final int[] KWHzl;
    public static final byte[] OLrzqt;
    public static final char[] copydefault;
    public static final int[] djBIcL;
    public static final int[] gEmmrt;
    public static final int[] valueOf;
    public static final int[] values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int[] AEQbTJ() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int[] AhwBna() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int[] EZpvd() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int[] KWHzl() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int[] OLrzqt() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int[] copydefault() {
        return djBIcL;
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        EZpvd = charArray;
        copydefault = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        OLrzqt = new byte[length];
        AEQbTJ = new byte[length];
        for (int i = 0; i < length; i++) {
            OLrzqt[i] = (byte) EZpvd[i];
            AEQbTJ[i] = (byte) copydefault[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        gEmmrt = iArr;
        int[] iArr2 = new int[256];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i3 = 128; i3 < 256; i3++) {
            iArr2[i3] = (i3 & 224) == 192 ? 2 : (i3 & PsExtractor.VIDEO_STREAM_MASK) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
        }
        AhwBna = iArr2;
        int[] iArr3 = new int[256];
        java.util.Arrays.fill(iArr3, -1);
        for (int i4 = 33; i4 < 256; i4++) {
            if (java.lang.Character.isJavaIdentifierPart((char) i4)) {
                iArr3[i4] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        djBIcL = iArr3;
        int[] iArr4 = new int[256];
        java.lang.System.arraycopy(iArr3, 0, iArr4, 0, 256);
        java.util.Arrays.fill(iArr4, 128, 128, 0);
        valueOf = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = AhwBna;
        java.lang.System.arraycopy(iArr6, 128, iArr5, 128, 128);
        java.util.Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        AYXKKw = iArr5;
        int[] iArr7 = new int[256];
        java.lang.System.arraycopy(iArr6, 128, iArr7, 128, 128);
        java.util.Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        DbNXlk = iArr7;
        int[] iArr8 = new int[128];
        for (int i5 = 0; i5 < 32; i5++) {
            iArr8[i5] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        values = iArr8;
        int[] iArr9 = new int[256];
        KWHzl = iArr9;
        java.util.Arrays.fill(iArr9, -1);
        for (int i6 = 0; i6 < 10; i6++) {
            KWHzl[i6 + 48] = i6;
        }
        for (int i7 = 0; i7 < 6; i7++) {
            int[] iArr10 = KWHzl;
            int i8 = i7 + 10;
            iArr10[i7 + 97] = i8;
            iArr10[i7 + 65] = i8;
        }
    }

    public static int[] copydefault(int i) {
        return i == 34 ? values : TaskDescription.OLrzqt.EZpvd(i);
    }

    public static int KWHzl(int i) {
        return KWHzl[i & 255];
    }

    public static char OLrzqt(int i) {
        return EZpvd[i];
    }

    public static void OLrzqt(java.lang.StringBuilder sb, java.lang.String str) {
        int[] iArr = values;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb.append(cCharAt);
            } else {
                sb.append(AbstractJsonLexerKt.STRING_ESC);
                int i2 = iArr[cCharAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = EZpvd;
                    sb.append(cArr[cCharAt >> 4]);
                    sb.append(cArr[cCharAt & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    public static char[] AEQbTJ(boolean z) {
        return (char[]) (z ? EZpvd.clone() : copydefault.clone());
    }

    public static byte[] EZpvd(boolean z) {
        return (byte[]) (z ? OLrzqt.clone() : AEQbTJ.clone());
    }

    /* JADX INFO: renamed from: o.Ux$TaskDescription */
    public static class TaskDescription {
        public static final TaskDescription OLrzqt = new TaskDescription();
        public int[][] copydefault = new int[128][];

        private TaskDescription() {
        }

        public int[] EZpvd(int i) {
            int[] iArrCopyOf = this.copydefault[i];
            if (iArrCopyOf == null) {
                iArrCopyOf = java.util.Arrays.copyOf(C5521Ux.values, 128);
                if (iArrCopyOf[i] == 0) {
                    iArrCopyOf[i] = -1;
                }
                this.copydefault[i] = iArrCopyOf;
            }
            return iArrCopyOf;
        }
    }
}

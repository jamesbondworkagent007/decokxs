package o;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ICUException;
import o.C7024abY;
import okio.Utf8;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.acX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7050acX {
    public static final StateListAnimator AEQbTJ = new StateListAnimator();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    public static void EZpvd(C7108adc c7108adc, java.nio.ByteBuffer byteBuffer, C7108adc c7108adc2) throws java.io.IOException {
        int i;
        int[] iArrEZpvd;
        int i2;
        byte[] bArr;
        int[] iArr;
        int i3;
        C7048acV c7048acV;
        boolean z;
        int[] iArr2;
        int[] iArr3;
        c7108adc2.AYXKKw = C7024abY.OLrzqt(byteBuffer, 1430482796, AEQbTJ);
        if (c7108adc != null && c7108adc.OLrzqt() != c7108adc2.OLrzqt()) {
            throw new ICUException("Tailoring UCA version differs from base data UCA version");
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < 8) {
            throw new ICUException("not enough bytes");
        }
        int i4 = byteBuffer.getInt();
        if (i4 < 2 || iRemaining < i4 * 4) {
            throw new ICUException("not enough indexes");
        }
        int[] iArr4 = new int[20];
        iArr4[0] = i4;
        for (int i5 = 1; i5 < i4 && i5 < 20; i5++) {
            iArr4[i5] = byteBuffer.getInt();
        }
        for (int i6 = i4; i6 < 20; i6++) {
            iArr4[i6] = -1;
        }
        if (i4 > 20) {
            C7024abY.EZpvd(byteBuffer, (i4 - 20) * 4);
        }
        if (i4 > 19) {
            i = iArr4[19];
        } else {
            i = i4 > 5 ? iArr4[i4 - 1] : 0;
        }
        if (iRemaining < i) {
            throw new ICUException("not enough bytes");
        }
        C7048acV c7048acV2 = c7108adc == null ? null : c7108adc.KWHzl;
        int i7 = iArr4[6] - iArr4[5];
        if (i7 >= 4) {
            if (c7048acV2 == null) {
                throw new ICUException("Collation base data must not reorder scripts");
            }
            int i8 = i7 / 4;
            iArrEZpvd = C7024abY.EZpvd(byteBuffer, i8, i7 & 3);
            int i9 = 0;
            while (i9 < i8 && (iArrEZpvd[(i8 - i9) - 1] & SupportMenu.CATEGORY_MASK) != 0) {
                i9++;
            }
            i2 = i8 - i9;
        } else {
            C7024abY.EZpvd(byteBuffer, i7);
            iArrEZpvd = new int[0];
            i2 = 0;
        }
        int i10 = iArr4[7] - iArr4[6];
        if (i10 < 256) {
            bArr = null;
        } else {
            if (i2 == 0) {
                throw new ICUException("Reordering table without reordering codes");
            }
            bArr = new byte[256];
            byteBuffer.get(bArr);
            i10 += InputDeviceCompat.SOURCE_ANY;
        }
        C7024abY.EZpvd(byteBuffer, i10);
        if (c7048acV2 != null) {
            i3 = i2;
            iArr = iArrEZpvd;
            if (c7048acV2.AkhnZx != (((long) iArr4[1]) & 4278190080L)) {
                throw new ICUException("Tailoring numeric primary weight differs from base data");
            }
        } else {
            iArr = iArrEZpvd;
            i3 = i2;
        }
        int i11 = iArr4[8] - iArr4[7];
        if (i11 >= 8) {
            c7108adc2.EZpvd();
            c7048acV = c7108adc2.OLrzqt;
            c7048acV.OLrzqt = c7048acV2;
            c7048acV.AkhnZx = ((long) iArr4[1]) & 4278190080L;
            C7033acG c7033acGCopydefault = C7033acG.copydefault(byteBuffer);
            c7108adc2.djBIcL = c7033acGCopydefault;
            c7048acV.fIwbmz = c7033acGCopydefault;
            int iOLrzqt = c7033acGCopydefault.OLrzqt();
            if (iOLrzqt > i11) {
                throw new ICUException("Not enough bytes for the mappings trie");
            }
            i11 -= iOLrzqt;
        } else if (c7048acV2 != null) {
            c7108adc2.KWHzl = c7048acV2;
            c7048acV = null;
        } else {
            throw new ICUException("Missing collation data mappings");
        }
        C7024abY.EZpvd(byteBuffer, i11);
        C7024abY.EZpvd(byteBuffer, iArr4[9] - iArr4[8]);
        int i12 = iArr4[10] - iArr4[9];
        if (i12 >= 8) {
            if (c7048acV == null) {
                throw new ICUException("Tailored ces without tailored trie");
            }
            c7048acV.AEQbTJ = C7024abY.KWHzl(byteBuffer, i12 / 8, i12 & 7);
        } else {
            C7024abY.EZpvd(byteBuffer, i12);
        }
        C7024abY.EZpvd(byteBuffer, iArr4[11] - iArr4[10]);
        int i13 = iArr4[12] - iArr4[11];
        if (i13 >= 4) {
            if (c7048acV == null) {
                throw new ICUException("Tailored ce32s without tailored trie");
            }
            c7048acV.copydefault = C7024abY.EZpvd(byteBuffer, i13 / 4, i13 & 3);
        } else {
            C7024abY.EZpvd(byteBuffer, i13);
        }
        int i14 = iArr4[4];
        if (i14 >= 0) {
            if (c7048acV == null || (iArr3 = c7048acV.copydefault) == null) {
                throw new ICUException("JamoCE32sStart index into non-existent ce32s[]");
            }
            int[] iArr5 = new int[67];
            c7048acV.gEmmrt = iArr5;
            java.lang.System.arraycopy(iArr3, i14, iArr5, 0, 67);
        } else if (c7048acV != null) {
            if (c7048acV2 != null) {
                c7048acV.gEmmrt = c7048acV2.gEmmrt;
            } else {
                throw new ICUException("Missing Jamo CE32s for Hangul processing");
            }
        }
        int i15 = iArr4[13] - iArr4[12];
        if (i15 >= 4) {
            int i16 = i15 / 4;
            if (c7048acV == null) {
                throw new ICUException("Root elements but no mappings");
            }
            if (i16 <= 4) {
                throw new ICUException("Root elements array too short");
            }
            c7048acV.values = new long[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                c7048acV.values[i17] = ((long) byteBuffer.getInt()) & BodyPartID.bodyIdMax;
            }
            long[] jArr = c7048acV.values;
            if (jArr[3] != 83887360) {
                throw new ICUException("Common sec/ter weights in base data differ from the hardcoded value");
            }
            if ((jArr[4] >>> 24) < 69) {
                throw new ICUException("[fixed last secondary common byte] is too low");
            }
            i15 &= 3;
        }
        C7024abY.EZpvd(byteBuffer, i15);
        int i18 = iArr4[14] - iArr4[13];
        if (i18 >= 2) {
            if (c7048acV == null) {
                throw new ICUException("Tailored contexts without tailored trie");
            }
            c7048acV.valueOf = C7024abY.AEQbTJ(byteBuffer, i18 / 2, i18 & 1);
        } else {
            C7024abY.EZpvd(byteBuffer, i18);
        }
        int i19 = iArr4[15] - iArr4[14];
        if (i19 >= 2) {
            if (c7048acV == null) {
                throw new ICUException("Unsafe-backward-set but no mappings");
            }
            if (c7048acV2 == null) {
                UnicodeSet unicodeSet = new UnicodeSet(Utf8.LOG_SURROGATE_HEADER, 57343);
                c7108adc2.gEmmrt = unicodeSet;
                c7048acV.AYXKKw.KWHzl(unicodeSet);
            } else {
                c7108adc2.gEmmrt = c7048acV2.ejfBZ.OLrzqt();
            }
            C7039acM c7039acM = new C7039acM();
            char c = 0;
            c7039acM.EZpvd(C7024abY.OLrzqt(byteBuffer, i19 / 2, i19 & 1), 0);
            int iKWHzl = c7039acM.KWHzl();
            int[] iArr6 = new int[2];
            int i20 = 0;
            while (i20 < iKWHzl) {
                c7039acM.EZpvd(i20, iArr6);
                c7108adc2.gEmmrt.EZpvd(iArr6[c], iArr6[1]);
                i20++;
                c = 0;
            }
            int i21 = 65536;
            int i22 = 55296;
            while (i22 < 56320) {
                if (!c7108adc2.gEmmrt.valueOf(i21, i21 + 1023)) {
                    c7108adc2.gEmmrt.KWHzl(i22);
                }
                i22++;
                i21 += 1024;
            }
            c7108adc2.gEmmrt.AYXKKw();
            c7048acV.ejfBZ = c7108adc2.gEmmrt;
            i19 = 0;
        } else if (c7048acV != null) {
            if (c7048acV2 != null) {
                c7048acV.ejfBZ = c7048acV2.ejfBZ;
            } else {
                throw new ICUException("Missing unsafe-backward-set");
            }
        }
        C7024abY.EZpvd(byteBuffer, i19);
        int i23 = iArr4[16] - iArr4[15];
        if (c7048acV != null) {
            c7048acV.AhwBna = null;
            c7048acV.djBIcL = null;
            if (((iArr4[1] >> 16) & 255) == 2) {
                if (i23 >= 2) {
                    char c2 = byteBuffer.getChar();
                    int i24 = c2 & 255;
                    char[] cArr = new char[i24];
                    c7048acV.djBIcL = cArr;
                    cArr[0] = c2;
                    for (int i25 = 1; i25 < i24; i25++) {
                        c7048acV.djBIcL[i25] = byteBuffer.getChar();
                    }
                    c7048acV.AhwBna = C7024abY.OLrzqt(byteBuffer, (i23 / 2) - i24, i23 & 1);
                    if ((c2 >> '\b') != 2) {
                        throw new ICUException("Fast-Latin table version differs from version in data header");
                    }
                    i23 = 0;
                } else if (c7048acV2 != null) {
                    c7048acV.AhwBna = c7048acV2.AhwBna;
                    c7048acV.djBIcL = c7048acV2.djBIcL;
                }
            }
        }
        C7024abY.EZpvd(byteBuffer, i23);
        int i26 = iArr4[17] - iArr4[16];
        if (i26 < 2) {
            z = false;
            if (c7048acV != null && c7048acV2 != null) {
                c7048acV.DbNXlk = c7048acV2.DbNXlk;
                c7048acV.isConnected = c7048acV2.isConnected;
                c7048acV.fetchVPNInfo = c7048acV2.fetchVPNInfo;
            }
        } else {
            if (c7048acV == null) {
                throw new ICUException("Script order data but no mappings");
            }
            java.nio.CharBuffer charBufferAsCharBuffer = byteBuffer.asCharBuffer();
            char c3 = charBufferAsCharBuffer.get();
            c7048acV.DbNXlk = c3;
            int i27 = (i26 / 2) - (c3 + 17);
            if (i27 <= 2) {
                throw new ICUException("Script order data too short");
            }
            char[] cArr2 = new char[c3 + 16];
            c7048acV.isConnected = cArr2;
            charBufferAsCharBuffer.get(cArr2);
            char[] cArr3 = new char[i27];
            c7048acV.fetchVPNInfo = cArr3;
            charBufferAsCharBuffer.get(cArr3);
            char[] cArr4 = c7048acV.fetchVPNInfo;
            z = false;
            if (cArr4[0] != 0 || cArr4[1] != 768 || cArr4[i27 - 1] != 65280) {
                throw new ICUException("Script order data not valid");
            }
        }
        C7024abY.EZpvd(byteBuffer, i26);
        int i28 = iArr4[18] - iArr4[17];
        if (i28 >= 256) {
            if (c7048acV == null) {
                throw new ICUException("Data for compressible primary lead bytes but no mappings");
            }
            c7048acV.EZpvd = new boolean[256];
            for (?? r8 = z; r8 < 256; r8++) {
                c7048acV.EZpvd[r8] = byteBuffer.get() != 0 ? true : z;
            }
            i28 += InputDeviceCompat.SOURCE_ANY;
        } else if (c7048acV != null) {
            if (c7048acV2 != null) {
                c7048acV.EZpvd = c7048acV2.EZpvd;
            } else {
                throw new ICUException("Missing data for compressible primary lead bytes");
            }
        }
        C7024abY.EZpvd(byteBuffer, i28);
        C7024abY.EZpvd(byteBuffer, iArr4[19] - iArr4[18]);
        C7110ade c7110ade = (C7110ade) c7108adc2.AhwBna.OLrzqt();
        int i29 = iArr4[1] & 65535;
        char[] cArr5 = new char[MLKEMEngine.KyberPolyBytes];
        int iAEQbTJ = C7049acW.AEQbTJ(c7108adc2.KWHzl, c7110ade, cArr5);
        if (i29 != c7110ade.OLrzqt || c7110ade.AYXKKw == 0) {
            iArr2 = iArr;
        } else {
            iArr2 = iArr;
            if (java.util.Arrays.equals(iArr2, c7110ade.valueOf) && iAEQbTJ == c7110ade.AEQbTJ && (iAEQbTJ < 0 || java.util.Arrays.equals(cArr5, c7110ade.KWHzl))) {
                return;
            }
        }
        C7110ade c7110ade2 = (C7110ade) c7108adc2.AhwBna.KWHzl();
        c7110ade2.OLrzqt = i29;
        long jAYXKKw = c7108adc2.KWHzl.AYXKKw(c7110ade2.gEmmrt() + 4096);
        c7110ade2.AYXKKw = jAYXKKw;
        if (jAYXKKw == 0) {
            throw new ICUException("The maxVariable could not be mapped to a variableTop");
        }
        if (i3 != 0) {
            c7110ade2.KWHzl(c7048acV2, iArr2, i3, bArr);
        }
        c7110ade2.AEQbTJ = C7049acW.AEQbTJ(c7108adc2.KWHzl, c7110ade2, c7110ade2.KWHzl);
    }

    /* JADX INFO: renamed from: o.acX$StateListAnimator */
    public static final class StateListAnimator implements C7024abY.ActionBar {
        private StateListAnimator() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            return bArr[0] == 5;
        }
    }

    private C7050acX() {
    }
}

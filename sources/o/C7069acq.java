package o;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.CodePointMap;
import com.ibm.icu.util.CodePointTrie;
import com.ibm.icu.util.ICUUncheckedIOException;
import o.C7024abY;

/* JADX INFO: renamed from: o.acq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7069acq {
    public int AEQbTJ;
    public int AYXKKw;
    public java.lang.String AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public CodePointTrie KWHzl;
    public java.util.ArrayList<UnicodeSet> copydefault;
    public C7258agT djBIcL;
    public int ejfBZ;
    public CodePointTrie.FragmentManager fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public byte[] getNewProxyInstance;
    public int isConnected;
    public java.lang.String valueOf;
    public int values;
    public static final Application OLrzqt = new Application();
    public static final CodePointMap.ActionBar EZpvd = new CodePointMap.ActionBar() { // from class: o.acq.4
        @Override // com.ibm.icu.util.CodePointMap.ActionBar
        public int OLrzqt(int i) {
            return i & Integer.MIN_VALUE;
        }
    };

    public static int AEQbTJ(int i) {
        return (i >> 1) & 255;
    }

    public static boolean OLrzqt(int i) {
        return i == 65024;
    }

    public static boolean copydefault(int i) {
        return i == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna(int i) {
        if (i < this.DbNXlk || 65026 <= i) {
            return 1;
        }
        return this.values <= i ? 2 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel(int i) {
        return i < this.fJNWhG || i == 65024 || (this.values <= i && i <= 64512);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AubY(int i) {
        return i < this.fJNWhG || this.values <= i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY(int i) {
        return this.values <= i && i <= 65024;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.fIwbmz | 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault(int i, int i2) {
        return (i + (i2 >> 3)) - this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN(int i) {
        return this.gEmmrt <= i && i < this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt(int i) {
        if (i < 2 || 64512 <= i) {
            return -1;
        }
        int i2 = i - this.values;
        if (i2 < 0) {
            i2 += 64512;
        }
        return i2 >> 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf(int i) {
        return i >= this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance(int i) {
        return i < this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hDKMBd(int i) {
        return this.DbNXlk <= i && i < this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean sSMYrx(int i) {
        return i < this.fJNWhG || i == 64512 || i == 65024;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean uzCIH(int i) {
        return i >= this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph(int i) {
        return i == this.fJNWhG;
    }

    /* JADX INFO: renamed from: o.acq$Activity */
    public static final class Activity {
        public static boolean OLrzqt(int i) {
            int i2 = i - 44032;
            return i2 >= 0 && i2 < 11172 && i2 % 28 == 0;
        }

        public static int EZpvd(int i, java.lang.Appendable appendable) {
            int i2 = i - 44032;
            try {
                int i3 = i2 % 28;
                int i4 = i2 / 28;
                appendable.append((char) ((i4 / 21) + 4352));
                appendable.append((char) ((i4 % 21) + 4449));
                if (i3 == 0) {
                    return 2;
                }
                appendable.append((char) (i3 + 4519));
                return 3;
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: o.acq$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Appendable {
        public final C7069acq AEQbTJ;
        public int AhwBna;
        public int EZpvd;
        public int KWHzl;
        public final boolean OLrzqt;
        public final java.lang.Appendable copydefault;
        public int djBIcL;
        public final java.lang.StringBuilder gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.StringBuilder KWHzl() {
            return this.gEmmrt;
        }

        public StateListAnimator(C7069acq c7069acq, java.lang.Appendable appendable, int i) {
            this.AEQbTJ = c7069acq;
            this.copydefault = appendable;
            if (appendable instanceof java.lang.StringBuilder) {
                this.OLrzqt = true;
                java.lang.StringBuilder sb = (java.lang.StringBuilder) appendable;
                this.gEmmrt = sb;
                sb.ensureCapacity(i);
                this.djBIcL = 0;
                if (sb.length() == 0) {
                    this.AhwBna = 0;
                    return;
                }
                djBIcL();
                int iCopydefault = copydefault();
                this.AhwBna = iCopydefault;
                if (iCopydefault > 1) {
                    while (copydefault() > 1) {
                    }
                }
                this.djBIcL = this.EZpvd;
                return;
            }
            this.OLrzqt = false;
            this.gEmmrt = new java.lang.StringBuilder();
            this.djBIcL = 0;
            this.AhwBna = 0;
        }

        public boolean AEQbTJ() {
            return this.gEmmrt.length() == 0;
        }

        public int OLrzqt() {
            return this.gEmmrt.length();
        }

        public boolean EZpvd(java.lang.CharSequence charSequence, int i, int i2) {
            java.lang.StringBuilder sb = this.gEmmrt;
            return ActionBar.EZpvd(sb, 0, sb.length(), charSequence, i, i2);
        }

        public void OLrzqt(int i, int i2) {
            if (this.AhwBna <= i2 || i2 == 0) {
                this.gEmmrt.appendCodePoint(i);
                this.AhwBna = i2;
                if (i2 <= 1) {
                    this.djBIcL = this.gEmmrt.length();
                    return;
                }
                return;
            }
            KWHzl(i, i2);
        }

        public void AEQbTJ(java.lang.CharSequence charSequence, int i, int i2, boolean z, int i3, int i4) {
            int iEZpvd;
            if (i == i2) {
                return;
            }
            if (this.AhwBna <= i3 || i3 == 0) {
                if (i4 <= 1) {
                    this.djBIcL = this.gEmmrt.length() + (i2 - i);
                } else if (i3 <= 1) {
                    this.djBIcL = this.gEmmrt.length() + 1;
                }
                this.gEmmrt.append(charSequence, i, i2);
                this.AhwBna = i4;
                return;
            }
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, i);
            int iCharCount = i + java.lang.Character.charCount(iCodePointAt);
            KWHzl(iCodePointAt, i3);
            while (iCharCount < i2) {
                int iCodePointAt2 = java.lang.Character.codePointAt(charSequence, iCharCount);
                iCharCount += java.lang.Character.charCount(iCodePointAt2);
                if (iCharCount >= i2) {
                    iEZpvd = i4;
                } else if (z) {
                    iEZpvd = C7069acq.KWHzl(this.AEQbTJ.AkhnZx(iCodePointAt2));
                } else {
                    C7069acq c7069acq = this.AEQbTJ;
                    iEZpvd = c7069acq.EZpvd(c7069acq.AkhnZx(iCodePointAt2));
                }
                OLrzqt(iCodePointAt2, iEZpvd);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: append(C)Ljava/lang/Appendable; */
        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public StateListAnimator append(char c) {
            this.gEmmrt.append(c);
            this.AhwBna = 0;
            this.djBIcL = this.gEmmrt.length();
            return this;
        }

        public void EZpvd(int i) {
            this.gEmmrt.appendCodePoint(i);
            this.AhwBna = 0;
            this.djBIcL = this.gEmmrt.length();
        }

        /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Ljava/lang/Appendable; */
        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator append(java.lang.CharSequence charSequence) {
            if (charSequence.length() != 0) {
                this.gEmmrt.append(charSequence);
                this.AhwBna = 0;
                this.djBIcL = this.gEmmrt.length();
            }
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable; */
        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator append(java.lang.CharSequence charSequence, int i, int i2) {
            if (i != i2) {
                this.gEmmrt.append(charSequence, i, i2);
                this.AhwBna = 0;
                this.djBIcL = this.gEmmrt.length();
            }
            return this;
        }

        public void EZpvd() {
            if (this.OLrzqt) {
                this.djBIcL = this.gEmmrt.length();
            } else {
                try {
                    this.copydefault.append(this.gEmmrt);
                    this.gEmmrt.setLength(0);
                    this.djBIcL = 0;
                } catch (java.io.IOException e) {
                    throw new ICUUncheckedIOException(e);
                }
            }
            this.AhwBna = 0;
        }

        public StateListAnimator OLrzqt(java.lang.CharSequence charSequence, int i, int i2) {
            if (this.OLrzqt) {
                this.gEmmrt.append(charSequence, i, i2);
                this.djBIcL = this.gEmmrt.length();
            } else {
                try {
                    this.copydefault.append(this.gEmmrt).append(charSequence, i, i2);
                    this.gEmmrt.setLength(0);
                    this.djBIcL = 0;
                } catch (java.io.IOException e) {
                    throw new ICUUncheckedIOException(e);
                }
            }
            this.AhwBna = 0;
            return this;
        }

        public void gEmmrt() {
            this.gEmmrt.setLength(0);
            this.AhwBna = 0;
            this.djBIcL = 0;
        }

        public void copydefault(int i) {
            int length = this.gEmmrt.length();
            this.gEmmrt.delete(length - i, length);
            this.AhwBna = 0;
            this.djBIcL = this.gEmmrt.length();
        }

        public final void KWHzl(int i, int i2) {
            djBIcL();
            valueOf();
            while (copydefault() > i2) {
            }
            if (i <= 65535) {
                this.gEmmrt.insert(this.EZpvd, (char) i);
                if (i2 <= 1) {
                    this.djBIcL = this.EZpvd + 1;
                    return;
                }
                return;
            }
            this.gEmmrt.insert(this.EZpvd, java.lang.Character.toChars(i));
            if (i2 <= 1) {
                this.djBIcL = this.EZpvd + 2;
            }
        }

        public final void djBIcL() {
            this.KWHzl = this.gEmmrt.length();
        }

        public final void valueOf() {
            int i = this.KWHzl;
            this.EZpvd = i;
            this.KWHzl = this.gEmmrt.offsetByCodePoints(i, -1);
        }

        public final int copydefault() {
            int i = this.KWHzl;
            this.EZpvd = i;
            if (this.djBIcL >= i) {
                return 0;
            }
            int iCodePointBefore = this.gEmmrt.codePointBefore(i);
            this.KWHzl -= java.lang.Character.charCount(iCodePointBefore);
            return this.AEQbTJ.valueOf(iCodePointBefore);
        }
    }

    /* JADX INFO: renamed from: o.acq$ActionBar */
    public static final class ActionBar {
        public static boolean EZpvd(int i) {
            return (i & 1024) == 0;
        }

        public static boolean copydefault(int i) {
            return (i & (-1024)) == 55296;
        }

        public static boolean OLrzqt(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            if (charSequence == charSequence2) {
                return true;
            }
            int length = charSequence.length();
            if (length != charSequence2.length()) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean EZpvd(java.lang.CharSequence charSequence, int i, int i2, java.lang.CharSequence charSequence2, int i3, int i4) {
            if (i2 - i != i4 - i3) {
                return false;
            }
            if (charSequence == charSequence2 && i == i3) {
                return true;
            }
            while (i < i2) {
                if (charSequence.charAt(i) != charSequence2.charAt(i3)) {
                    return false;
                }
                i++;
                i3++;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o.acq$Application */
    public static final class Application implements C7024abY.ActionBar {
        private Application() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            return bArr[0] == 4;
        }
    }

    public C7069acq AEQbTJ(java.nio.ByteBuffer byteBuffer) {
        try {
            this.djBIcL = C7024abY.EZpvd(byteBuffer, 1316121906, OLrzqt);
            int i = byteBuffer.getInt() / 4;
            if (i <= 18) {
                throw new ICUUncheckedIOException("Normalizer2 data: not enough indexes");
            }
            int[] iArr = new int[i];
            iArr[0] = i * 4;
            for (int i2 = 1; i2 < i; i2++) {
                iArr[i2] = byteBuffer.getInt();
            }
            this.AkhnZx = iArr[8];
            this.AYXKKw = iArr[9];
            this.isConnected = iArr[18];
            this.fJNWhG = iArr[10];
            this.fIwbmz = iArr[14];
            this.DbNXlk = iArr[11];
            this.fetchVPNInfo = iArr[15];
            this.AuCTel = iArr[16];
            this.ejfBZ = iArr[17];
            this.gEmmrt = iArr[12];
            this.values = iArr[13];
            this.AEQbTJ = (r0 >> 3) - 65;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int iPosition = byteBuffer.position();
            this.fARcdN = CodePointTrie.FragmentManager.AEQbTJ(byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            int i5 = i4 - i3;
            if (iPosition2 > i5) {
                throw new ICUUncheckedIOException("Normalizer2 data: not enough bytes for normTrie");
            }
            C7024abY.EZpvd(byteBuffer, i5 - iPosition2);
            int i6 = (iArr[2] - i4) / 2;
            if (i6 != 0) {
                java.lang.String strAEQbTJ = C7024abY.AEQbTJ(byteBuffer, i6, 0);
                this.valueOf = strAEQbTJ;
                this.AhwBna = strAEQbTJ.substring((64512 - this.values) >> 1);
            }
            byte[] bArr = new byte[256];
            this.getNewProxyInstance = bArr;
            byteBuffer.get(bArr);
            return this;
        } catch (java.io.IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public C7069acq copydefault(java.lang.String str) {
        return AEQbTJ(C7024abY.copydefault(str));
    }

    public void KWHzl(UnicodeSet unicodeSet) {
        CodePointMap.StateListAnimator stateListAnimator = new CodePointMap.StateListAnimator();
        int i = 0;
        while (this.fARcdN.OLrzqt(i, CodePointMap.RangeOption.FIXED_LEAD_SURROGATES, 1, null, stateListAnimator)) {
            int iKWHzl = stateListAnimator.KWHzl();
            int iEZpvd = stateListAnimator.EZpvd();
            if (iEZpvd > 64512 && iEZpvd != 65024) {
                unicodeSet.EZpvd(i, iKWHzl);
            } else if (this.AuCTel <= iEZpvd && iEZpvd < this.gEmmrt && isConnected(i) > 255) {
                unicodeSet.EZpvd(i, iKWHzl);
            }
            i = iKWHzl + 1;
        }
    }

    public void copydefault(UnicodeSet unicodeSet) {
        CodePointMap.StateListAnimator stateListAnimator = new CodePointMap.StateListAnimator();
        int i = 0;
        while (this.fARcdN.OLrzqt(i, CodePointMap.RangeOption.FIXED_LEAD_SURROGATES, 1, null, stateListAnimator)) {
            int iKWHzl = stateListAnimator.KWHzl();
            int iEZpvd = stateListAnimator.EZpvd();
            unicodeSet.KWHzl(i);
            if (i != iKWHzl && fARcdN(iEZpvd) && (iEZpvd & 6) > 2) {
                int iIsConnected = isConnected(i);
                while (true) {
                    i++;
                    if (i <= iKWHzl) {
                        int iIsConnected2 = isConnected(i);
                        if (iIsConnected2 != iIsConnected) {
                            unicodeSet.KWHzl(i);
                            iIsConnected = iIsConnected2;
                        }
                    }
                }
            }
            i = iKWHzl + 1;
        }
        for (int i2 = 44032; i2 < 55204; i2 += 28) {
            unicodeSet.KWHzl(i2);
            unicodeSet.KWHzl(i2 + 1);
        }
        unicodeSet.KWHzl(55204);
    }

    public void AEQbTJ(UnicodeSet unicodeSet) {
        AEQbTJ();
        CodePointMap.StateListAnimator stateListAnimator = new CodePointMap.StateListAnimator();
        for (int iKWHzl = 0; this.KWHzl.AEQbTJ(iKWHzl, EZpvd, stateListAnimator); iKWHzl = stateListAnimator.KWHzl() + 1) {
            unicodeSet.KWHzl(iKWHzl);
        }
    }

    public C7069acq AEQbTJ() {
        int iCopydefault;
        int iValues;
        int i;
        int i2;
        synchronized (this) {
            if (this.KWHzl == null) {
                int i3 = 0;
                C7256agR c7256agR = new C7256agR(0, 0);
                this.copydefault = new java.util.ArrayList<>();
                CodePointMap.StateListAnimator stateListAnimator = new CodePointMap.StateListAnimator();
                while (this.fARcdN.OLrzqt(i3, CodePointMap.RangeOption.FIXED_LEAD_SURROGATES, 1, null, stateListAnimator)) {
                    int iKWHzl = stateListAnimator.KWHzl();
                    int iEZpvd = stateListAnimator.EZpvd();
                    if (!copydefault(iEZpvd) && (this.fJNWhG > iEZpvd || iEZpvd >= this.DbNXlk)) {
                        while (i3 <= iKWHzl) {
                            int iAEQbTJ = c7256agR.AEQbTJ(i3);
                            if (gHZMYf(iEZpvd)) {
                                i = iAEQbTJ | Integer.MIN_VALUE;
                                if (iEZpvd < 64512) {
                                    i2 = -1073741824;
                                    i = i2 | iAEQbTJ;
                                }
                            } else if (iEZpvd < this.fJNWhG) {
                                i2 = 1073741824;
                                i = i2 | iAEQbTJ;
                            } else {
                                if (uzCIH(iEZpvd)) {
                                    iCopydefault = copydefault(i3, iEZpvd);
                                    iValues = values(iCopydefault);
                                } else {
                                    iCopydefault = i3;
                                    iValues = iEZpvd;
                                }
                                if (iValues > this.fJNWhG) {
                                    int i4 = iValues >> 1;
                                    char cCharAt = this.AhwBna.charAt(i4);
                                    int i5 = cCharAt & 31;
                                    i = ((cCharAt & 128) == 0 || i3 != iCopydefault || (this.AhwBna.charAt(i4 + (-1)) & 255) == 0) ? iAEQbTJ : iAEQbTJ | Integer.MIN_VALUE;
                                    if (i5 != 0) {
                                        int i6 = i4 + 1;
                                        int iCodePointAt = this.AhwBna.codePointAt(i6);
                                        copydefault(c7256agR, i3, iCodePointAt);
                                        if (iValues >= this.DbNXlk) {
                                            int iCharCount = i6;
                                            while (true) {
                                                iCharCount += java.lang.Character.charCount(iCodePointAt);
                                                if (iCharCount >= i5 + i6) {
                                                    break;
                                                }
                                                iCodePointAt = this.AhwBna.codePointAt(iCharCount);
                                                int iAEQbTJ2 = c7256agR.AEQbTJ(iCodePointAt);
                                                if ((iAEQbTJ2 & Integer.MIN_VALUE) == 0) {
                                                    c7256agR.OLrzqt(iCodePointAt, iAEQbTJ2 | Integer.MIN_VALUE);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    copydefault(c7256agR, i3, iCopydefault);
                                    i = iAEQbTJ;
                                }
                            }
                            if (i != iAEQbTJ) {
                                c7256agR.OLrzqt(i3, i);
                            }
                            i3++;
                        }
                    }
                    i3 = iKWHzl + 1;
                }
                this.KWHzl = c7256agR.OLrzqt(CodePointTrie.Type.SMALL, CodePointTrie.ValueWidth.BITS_32);
            }
        }
        return this;
    }

    public int AkhnZx(int i) {
        if (ActionBar.copydefault(i)) {
            return 1;
        }
        return this.fARcdN.copydefault(i);
    }

    public int values(int i) {
        return this.fARcdN.copydefault(i);
    }

    public int EZpvd(int i) {
        if (i >= 64512) {
            return AEQbTJ(i);
        }
        if (i < this.DbNXlk || this.gEmmrt <= i) {
            return 0;
        }
        return djBIcL(i);
    }

    public static int KWHzl(int i) {
        if (i >= 64512) {
            return AEQbTJ(i);
        }
        return 0;
    }

    public int valueOf(int i) {
        if (i < this.AYXKKw) {
            return 0;
        }
        return KWHzl(AkhnZx(i));
    }

    public int isConnected(int i) {
        if (i < this.AkhnZx) {
            return 0;
        }
        if (i > 65535 || QOLQEE(i)) {
            return DbNXlk(i);
        }
        return 0;
    }

    public boolean QOLQEE(int i) {
        byte b = this.getNewProxyInstance[i >> 8];
        return (b == 0 || ((b >> ((i >> 5) & 7)) & 1) == 0) ? false : true;
    }

    public int DbNXlk(int i) {
        int iAkhnZx = AkhnZx(i);
        if (iAkhnZx >= this.gEmmrt) {
            if (iAkhnZx >= 64512) {
                int iAEQbTJ = AEQbTJ(iAkhnZx);
                return iAEQbTJ | (iAEQbTJ << 8);
            }
            if (iAkhnZx >= this.values) {
                return 0;
            }
            int i2 = iAkhnZx & 6;
            if (i2 <= 2) {
                return i2 >> 1;
            }
            iAkhnZx = values(copydefault(i, iAkhnZx));
        }
        if (iAkhnZx <= this.fJNWhG || zLjUOn(iAkhnZx)) {
            return 0;
        }
        int i3 = iAkhnZx >> 1;
        char cCharAt = this.AhwBna.charAt(i3);
        int i4 = cCharAt >> '\b';
        return (cCharAt & 128) != 0 ? i4 | (this.AhwBna.charAt(i3 - 1) & 65280) : i4;
    }

    public java.lang.String fetchVPNInfo(int i) {
        int i2;
        int iCopydefault;
        int iValues;
        if (i >= this.AkhnZx) {
            int iAkhnZx = AkhnZx(i);
            if (!gHZMYf(iAkhnZx)) {
                if (uzCIH(iAkhnZx)) {
                    iCopydefault = copydefault(i, iAkhnZx);
                    iValues = values(iCopydefault);
                    i2 = iCopydefault;
                } else {
                    i2 = i;
                    iCopydefault = -1;
                    iValues = iAkhnZx;
                }
                if (iValues < this.fJNWhG) {
                    if (iCopydefault < 0) {
                        return null;
                    }
                    return C7242agD.KWHzl(iCopydefault);
                }
                if (zsXlph(iValues) || zLjUOn(iValues)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    Activity.EZpvd(i2, sb);
                    return sb.toString();
                }
                int i3 = iValues >> 1;
                int i4 = i3 + 1;
                return this.AhwBna.substring(i4, (this.AhwBna.charAt(i3) & 31) + i4);
            }
        }
        return null;
    }

    public boolean iwGUEr(int i) {
        return this.KWHzl.copydefault(i) >= 0;
    }

    public java.lang.Appendable copydefault(java.lang.CharSequence charSequence, java.lang.StringBuilder sb) {
        OLrzqt(charSequence, 0, charSequence.length(), sb, charSequence.length());
        return sb;
    }

    public void OLrzqt(java.lang.CharSequence charSequence, int i, int i2, java.lang.StringBuilder sb, int i3) {
        if (i3 < 0) {
            i3 = i2 - i;
        }
        sb.setLength(0);
        copydefault(charSequence, i, i2, new StateListAnimator(this, sb, i3));
    }

    public int copydefault(java.lang.CharSequence charSequence, int i, int i2, StateListAnimator stateListAnimator) {
        int iKWHzl;
        int i3 = this.AkhnZx;
        int i4 = i;
        int iEZpvd = 0;
        int iCharAt = 0;
        int i5 = 0;
        while (true) {
            int i6 = i;
            while (i6 != i2) {
                iCharAt = charSequence.charAt(i6);
                if (iCharAt >= i3) {
                    iEZpvd = this.fARcdN.EZpvd(iCharAt);
                    if (!sSMYrx(iEZpvd)) {
                        if (!ActionBar.copydefault(iCharAt)) {
                            break;
                        }
                        int i7 = i6 + 1;
                        if (i7 != i2) {
                            char cCharAt = charSequence.charAt(i7);
                            if (java.lang.Character.isLowSurrogate(cCharAt)) {
                                iCharAt = java.lang.Character.toCodePoint((char) iCharAt, cCharAt);
                                iEZpvd = this.fARcdN.AEQbTJ(iCharAt);
                                if (!sSMYrx(iEZpvd)) {
                                    break;
                                }
                                i6 += 2;
                            }
                        }
                        i6 = i7;
                    }
                }
                i6++;
            }
            if (i6 != i) {
                if (stateListAnimator != null) {
                    stateListAnimator.OLrzqt(charSequence, i, i6);
                } else {
                    i5 = 0;
                    i4 = i6;
                }
            }
            if (i6 == i2) {
                return i6;
            }
            i = java.lang.Character.charCount(iCharAt) + i6;
            if (stateListAnimator != null) {
                AEQbTJ(iCharAt, iEZpvd, stateListAnimator);
            } else {
                if (!AubY(iEZpvd) || (i5 > (iKWHzl = KWHzl(iEZpvd)) && iKWHzl != 0)) {
                    break;
                }
                if (iKWHzl <= 1) {
                    i4 = i;
                }
                i5 = iKWHzl;
            }
        }
        return i4;
    }

    public void copydefault(java.lang.CharSequence charSequence, boolean z, StateListAnimator stateListAnimator) {
        int i;
        int length = charSequence.length();
        if (length == 0) {
            return;
        }
        int iCharCount = 0;
        if (z) {
            copydefault(charSequence, 0, length, stateListAnimator);
            return;
        }
        int iCodePointAt = java.lang.Character.codePointAt(charSequence, 0);
        int iEZpvd = EZpvd(AkhnZx(iCodePointAt));
        int iEZpvd2 = iEZpvd;
        int i2 = iEZpvd2;
        while (true) {
            if (iEZpvd2 == 0) {
                i = i2;
                break;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
            if (iCharCount >= length) {
                i = iEZpvd2;
                break;
            }
            iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount);
            i2 = iEZpvd2;
            iEZpvd2 = EZpvd(AkhnZx(iCodePointAt));
        }
        stateListAnimator.AEQbTJ(charSequence, 0, iCharCount, false, iEZpvd, i);
        stateListAnimator.append(charSequence, iCharCount, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r3 r4 r5
  0x0056: PHI (r3v1 int) = (r3v0 int), (r3v14 int) binds: [B:16:0x0034, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v2 int) = (r4v1 int), (r4v7 int) binds: [B:16:0x0034, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r5v2 int) = (r5v1 int), (r5v11 int) binds: [B:16:0x0034, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean copydefault(java.lang.CharSequence charSequence, int i, int i2, boolean z, boolean z2, StateListAnimator stateListAnimator) {
        int i3;
        int iCodePointBefore;
        int iCharAt;
        int i4 = this.AYXKKw;
        int iCharCount = i;
        while (true) {
            int iAEQbTJ = iCharCount;
            while (iCharCount != i2) {
                int iCharAt2 = charSequence.charAt(iCharCount);
                if (iCharAt2 >= i4) {
                    int iEZpvd = this.fARcdN.EZpvd(iCharAt2);
                    if (!getNewProxyInstance(iEZpvd)) {
                        int iCharCount2 = iCharCount + 1;
                        if (ActionBar.copydefault(iCharAt2)) {
                            if (iCharCount2 != i2) {
                                char cCharAt = charSequence.charAt(iCharCount2);
                                if (java.lang.Character.isLowSurrogate(cCharAt)) {
                                    iCharCount2 = iCharCount + 2;
                                    iCharAt2 = java.lang.Character.toCodePoint((char) iCharAt2, cCharAt);
                                    iEZpvd = this.fARcdN.AEQbTJ(iCharAt2);
                                    if (!getNewProxyInstance(iEZpvd)) {
                                        if (gHZMYf(iEZpvd)) {
                                            if (OLrzqt(iEZpvd) && iAEQbTJ != iCharCount) {
                                                char cCharAt2 = charSequence.charAt(iCharCount - 1);
                                                if (iCharAt2 < 4519) {
                                                    char c = (char) (cCharAt2 - 4352);
                                                    if (c < 19) {
                                                        if (!z2) {
                                                            return false;
                                                        }
                                                        if (iCharCount2 == i2 || (iCharAt = charSequence.charAt(iCharCount2) - 4519) <= 0 || iCharAt >= 28) {
                                                            iCharAt = EZpvd(charSequence, iCharCount2, i2) ? 0 : -1;
                                                        } else {
                                                            iCharCount2++;
                                                        }
                                                        if (iCharAt >= 0) {
                                                            int i5 = iCharCount - 1;
                                                            if (iAEQbTJ != i5) {
                                                                stateListAnimator.append(charSequence, iAEQbTJ, i5);
                                                            }
                                                            stateListAnimator.append((char) ((((c * 21) + (iCharAt2 - 4449)) * 28) + 44032 + iCharAt));
                                                            iCharCount = iCharCount2;
                                                        }
                                                    }
                                                } else if (Activity.OLrzqt(cCharAt2)) {
                                                    if (!z2) {
                                                        return false;
                                                    }
                                                    int i6 = iCharCount - 1;
                                                    if (iAEQbTJ != i6) {
                                                        stateListAnimator.append(charSequence, iAEQbTJ, i6);
                                                    }
                                                    stateListAnimator.append((char) ((cCharAt2 + iCharAt2) - 4519));
                                                    iCharCount = iCharCount2;
                                                }
                                            } else if (iEZpvd > 65024) {
                                                int iAEQbTJ2 = AEQbTJ(iEZpvd);
                                                if (!z || AEQbTJ(charSequence, iAEQbTJ, iCharCount) <= iAEQbTJ2) {
                                                    while (iCharCount2 != i2) {
                                                        int iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount2);
                                                        int iCopydefault = this.fARcdN.copydefault(iCodePointAt);
                                                        if (iCopydefault >= 65026) {
                                                            int iAEQbTJ3 = AEQbTJ(iCopydefault);
                                                            if (iAEQbTJ2 <= iAEQbTJ3) {
                                                                iCharCount2 += java.lang.Character.charCount(iCodePointAt);
                                                                iAEQbTJ2 = iAEQbTJ3;
                                                            } else if (!z2) {
                                                                return false;
                                                            }
                                                        }
                                                        if (AwvSrB(iCopydefault)) {
                                                            if (getNewProxyInstance(iCopydefault)) {
                                                                iCharCount = java.lang.Character.charCount(iCodePointAt) + iCharCount2;
                                                            }
                                                        }
                                                    }
                                                    if (z2) {
                                                        stateListAnimator.append(charSequence, iAEQbTJ, i2);
                                                    }
                                                    return true;
                                                }
                                                if (!z2) {
                                                    return false;
                                                }
                                            }
                                            int i7 = iCharCount2;
                                            if (iAEQbTJ != iCharCount) {
                                            }
                                            i3 = iCharCount;
                                            if (z2) {
                                            }
                                            int iOLrzqt = stateListAnimator.OLrzqt();
                                            AEQbTJ(charSequence, i3, i7, false, z, stateListAnimator);
                                            iAEQbTJ = AEQbTJ(charSequence, i7, i2, true, z, stateListAnimator);
                                            OLrzqt(stateListAnimator, iOLrzqt, z);
                                            if (!z2) {
                                            }
                                            iCharCount = iAEQbTJ;
                                        } else {
                                            if (!z2) {
                                                return false;
                                            }
                                            if (uzCIH(iEZpvd)) {
                                                if (OLrzqt(iEZpvd, z) || EZpvd(charSequence, iCharCount2, i2)) {
                                                    if (iAEQbTJ != iCharCount) {
                                                        stateListAnimator.append(charSequence, iAEQbTJ, iCharCount);
                                                    }
                                                    stateListAnimator.OLrzqt(copydefault(iCharAt2, iEZpvd), 0);
                                                    iCharCount = iCharCount2;
                                                }
                                                int i72 = iCharCount2;
                                                if (iAEQbTJ != iCharCount && !AwvSrB(iEZpvd)) {
                                                    iCodePointBefore = java.lang.Character.codePointBefore(charSequence, iCharCount);
                                                    if (!OLrzqt(this.fARcdN.copydefault(iCodePointBefore), z)) {
                                                        iCharCount -= java.lang.Character.charCount(iCodePointBefore);
                                                    }
                                                }
                                                i3 = iCharCount;
                                                if (z2 && iAEQbTJ != i3) {
                                                    stateListAnimator.append(charSequence, iAEQbTJ, i3);
                                                }
                                                int iOLrzqt2 = stateListAnimator.OLrzqt();
                                                AEQbTJ(charSequence, i3, i72, false, z, stateListAnimator);
                                                iAEQbTJ = AEQbTJ(charSequence, i72, i2, true, z, stateListAnimator);
                                                OLrzqt(stateListAnimator, iOLrzqt2, z);
                                                if (!z2) {
                                                    if (!stateListAnimator.EZpvd(charSequence, i3, iAEQbTJ)) {
                                                        return false;
                                                    }
                                                    stateListAnimator.gEmmrt();
                                                }
                                                iCharCount = iAEQbTJ;
                                            } else if (iEZpvd < this.fetchVPNInfo) {
                                                if (OLrzqt(iEZpvd, z) || EZpvd(charSequence, iCharCount2, i2)) {
                                                    if (iAEQbTJ != iCharCount) {
                                                        stateListAnimator.append(charSequence, iAEQbTJ, iCharCount);
                                                    }
                                                    int i8 = iEZpvd >> 1;
                                                    int i9 = i8 + 1;
                                                    stateListAnimator.append(this.AhwBna, i9, (this.AhwBna.charAt(i8) & 31) + i9);
                                                    iCharCount = iCharCount2;
                                                }
                                                int i722 = iCharCount2;
                                                if (iAEQbTJ != iCharCount) {
                                                    iCodePointBefore = java.lang.Character.codePointBefore(charSequence, iCharCount);
                                                    if (!OLrzqt(this.fARcdN.copydefault(iCodePointBefore), z)) {
                                                    }
                                                }
                                                i3 = iCharCount;
                                                if (z2) {
                                                    stateListAnimator.append(charSequence, iAEQbTJ, i3);
                                                }
                                                int iOLrzqt22 = stateListAnimator.OLrzqt();
                                                AEQbTJ(charSequence, i3, i722, false, z, stateListAnimator);
                                                iAEQbTJ = AEQbTJ(charSequence, i722, i2, true, z, stateListAnimator);
                                                OLrzqt(stateListAnimator, iOLrzqt22, z);
                                                if (!z2) {
                                                }
                                                iCharCount = iAEQbTJ;
                                            } else {
                                                if (iEZpvd >= this.ejfBZ && (EZpvd(charSequence, iCharCount2, i2) || KWHzl(charSequence, iAEQbTJ, iCharCount, z))) {
                                                    if (iAEQbTJ != iCharCount) {
                                                        stateListAnimator.append(charSequence, iAEQbTJ, iCharCount);
                                                    }
                                                    iCharCount = iCharCount2;
                                                }
                                                int i7222 = iCharCount2;
                                                if (iAEQbTJ != iCharCount) {
                                                }
                                                i3 = iCharCount;
                                                if (z2) {
                                                }
                                                int iOLrzqt222 = stateListAnimator.OLrzqt();
                                                AEQbTJ(charSequence, i3, i7222, false, z, stateListAnimator);
                                                iAEQbTJ = AEQbTJ(charSequence, i7222, i2, true, z, stateListAnimator);
                                                OLrzqt(stateListAnimator, iOLrzqt222, z);
                                                if (!z2) {
                                                }
                                                iCharCount = iAEQbTJ;
                                            }
                                        }
                                    }
                                }
                            }
                            iCharCount = iCharCount2;
                        }
                    }
                }
                iCharCount++;
            }
            if (iAEQbTJ != i2 && z2) {
                stateListAnimator.append(charSequence, iAEQbTJ, i2);
            }
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        return r9 | r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be A[EDGE_INSN: B:68:0x00be->B:56:0x00be BREAK  A[LOOP:0: B:3:0x0005->B:74:0x0005], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int OLrzqt(java.lang.CharSequence charSequence, int i, int i2, boolean z, boolean z2) {
        int i3;
        int iAkhnZx;
        int iCodePointAt;
        int iAkhnZx2;
        int iKWHzl;
        int i4 = this.AYXKKw;
        int i5 = 0;
        int iCharCount = i;
        loop0: while (true) {
            if (i == i2) {
                i3 = i << 1;
                break;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= i4) {
                int iEZpvd = this.fARcdN.EZpvd(cCharAt);
                if (!getNewProxyInstance(iEZpvd)) {
                    int i6 = i + 1;
                    if (ActionBar.copydefault(cCharAt)) {
                        if (i6 != i2) {
                            char cCharAt2 = charSequence.charAt(i6);
                            if (java.lang.Character.isLowSurrogate(cCharAt2)) {
                                i6 = i + 2;
                                iEZpvd = this.fARcdN.AEQbTJ(java.lang.Character.toCodePoint(cCharAt, cCharAt2));
                                if (!getNewProxyInstance(iEZpvd)) {
                                }
                            }
                        }
                        i = i6;
                    }
                    if (iCharCount == i) {
                        i = iCharCount;
                    } else if (!AwvSrB(iEZpvd)) {
                        int iCodePointBefore = java.lang.Character.codePointBefore(charSequence, i);
                        iAkhnZx = AkhnZx(iCodePointBefore);
                        if (!OLrzqt(iAkhnZx, z)) {
                            i -= java.lang.Character.charCount(iCodePointBefore);
                        }
                        if (!gHZMYf(iEZpvd)) {
                            int iKWHzl2 = KWHzl(iEZpvd);
                            if (z && iKWHzl2 != 0 && fJNWhG(iAkhnZx) > iKWHzl2) {
                                break;
                            }
                            int i7 = i5;
                            int i8 = iKWHzl2;
                            iCharCount = i6;
                            while (true) {
                                if (iEZpvd < 65026) {
                                    if (z2) {
                                        return i << 1;
                                    }
                                    i7 = 1;
                                }
                                if (iCharCount == i2) {
                                    i3 = iCharCount << 1;
                                    i5 = i7;
                                    break loop0;
                                }
                                iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount);
                                iAkhnZx2 = AkhnZx(iCodePointAt);
                                if (!gHZMYf(iAkhnZx2) || (i8 > (iKWHzl = KWHzl(iAkhnZx2)) && iKWHzl != 0)) {
                                    break;
                                }
                                iCharCount += java.lang.Character.charCount(iCodePointAt);
                                iEZpvd = iAkhnZx2;
                                i8 = iKWHzl;
                            }
                            if (!getNewProxyInstance(iAkhnZx2)) {
                                break;
                            }
                            i = java.lang.Character.charCount(iCodePointAt) + iCharCount;
                            i5 = i7;
                        } else {
                            break;
                        }
                    }
                    iAkhnZx = 1;
                    if (!gHZMYf(iEZpvd)) {
                    }
                }
            }
            i++;
        }
        return i << 1;
    }

    public void KWHzl(java.lang.CharSequence charSequence, boolean z, boolean z2, StateListAnimator stateListAnimator) {
        int i;
        int iAEQbTJ;
        int length = charSequence.length();
        if (stateListAnimator.AEQbTJ() || (iAEQbTJ = AEQbTJ(charSequence, 0, length, z2)) == 0) {
            i = 0;
        } else {
            int iCopydefault = copydefault(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt(), z2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder((stateListAnimator.OLrzqt() - iCopydefault) + iAEQbTJ + 16);
            sb.append((java.lang.CharSequence) stateListAnimator.KWHzl(), iCopydefault, stateListAnimator.OLrzqt());
            stateListAnimator.copydefault(stateListAnimator.OLrzqt() - iCopydefault);
            sb.append(charSequence, 0, iAEQbTJ);
            copydefault(sb, 0, sb.length(), z2, true, stateListAnimator);
            i = iAEQbTJ;
        }
        if (z) {
            copydefault(charSequence, i, length, z2, true, stateListAnimator);
        } else {
            stateListAnimator.append(charSequence, i, length);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int EZpvd(java.lang.CharSequence charSequence, int i, int i2, StateListAnimator stateListAnimator) {
        int i3;
        int iDbNXlk;
        int i4;
        int i5 = i;
        int i6 = i5;
        int iDbNXlk2 = 0;
        int iDbNXlk3 = 0;
        int iCharAt = 0;
        while (true) {
            int iCharCount = i5;
            while (iCharCount != i2) {
                iCharAt = charSequence.charAt(iCharCount);
                if (iCharAt >= this.isConnected) {
                    if (QOLQEE(iCharAt)) {
                        if (ActionBar.copydefault(iCharAt) && (i4 = iCharCount + 1) != i2) {
                            char cCharAt = charSequence.charAt(i4);
                            if (java.lang.Character.isLowSurrogate(cCharAt)) {
                                iCharAt = java.lang.Character.toCodePoint((char) iCharAt, cCharAt);
                            }
                        }
                        iDbNXlk2 = DbNXlk(iCharAt);
                        if (iDbNXlk2 > 255) {
                            break;
                        }
                        iCharCount += java.lang.Character.charCount(iCharAt);
                        iDbNXlk3 = iDbNXlk2;
                    } else {
                        iCharCount++;
                        iDbNXlk3 = 0;
                    }
                } else {
                    iDbNXlk3 = ~iCharAt;
                    iCharCount++;
                }
            }
            int i7 = iDbNXlk2;
            int i8 = iCharAt;
            if (iCharCount != i5) {
                if (iCharCount != i2) {
                    if (iDbNXlk3 < 0) {
                        int i9 = ~iDbNXlk3;
                        if (i9 < this.AkhnZx) {
                            i3 = iCharCount;
                            iDbNXlk = 0;
                        } else {
                            iDbNXlk = DbNXlk(i9);
                            i3 = iDbNXlk > 1 ? iCharCount - 1 : iCharCount;
                        }
                        if (stateListAnimator != null) {
                            stateListAnimator.OLrzqt(charSequence, i5, i3);
                            stateListAnimator.append(charSequence, i3, iCharCount);
                        }
                        i5 = iCharCount;
                    } else {
                        int i10 = iCharCount - 1;
                        if (java.lang.Character.isLowSurrogate(charSequence.charAt(i10)) && i5 < i10) {
                            int i11 = iCharCount - 2;
                            if (java.lang.Character.isHighSurrogate(charSequence.charAt(i11))) {
                                iDbNXlk3 = DbNXlk(java.lang.Character.toCodePoint(charSequence.charAt(i11), charSequence.charAt(i10)));
                                i10 = i11;
                            }
                        }
                        if (iDbNXlk3 > 1) {
                            int i12 = iDbNXlk3;
                            i3 = i10;
                            iDbNXlk = i12;
                            if (stateListAnimator != null) {
                            }
                            i5 = iCharCount;
                        } else {
                            iDbNXlk = iDbNXlk3;
                            if (stateListAnimator != null) {
                            }
                            i5 = iCharCount;
                        }
                    }
                    int iCharCount2 = java.lang.Character.charCount(i8) + iCharCount;
                    if ((iDbNXlk & 255) > (i7 >> 8)) {
                        i6 = (i7 & 255) <= 1 ? iCharCount2 : i3;
                        if (stateListAnimator != null) {
                            stateListAnimator.EZpvd(i8);
                        }
                        i5 = iCharCount2;
                        iDbNXlk2 = i7;
                        iDbNXlk3 = iDbNXlk2;
                        iCharAt = i8;
                    } else {
                        if (stateListAnimator == null) {
                            return i3;
                        }
                        stateListAnimator.copydefault(i5 - i3);
                        int iOLrzqt = OLrzqt(charSequence, iCharCount2, i2);
                        AEQbTJ(charSequence, i3, iOLrzqt, false, false, stateListAnimator);
                        iDbNXlk3 = 0;
                        iDbNXlk2 = i7;
                        iCharAt = i8;
                        i5 = iOLrzqt;
                        i6 = i5;
                    }
                } else if (stateListAnimator != null) {
                    stateListAnimator.OLrzqt(charSequence, i5, iCharCount);
                }
            } else {
                if (iCharCount == i2) {
                    break;
                }
                int i13 = iDbNXlk3;
                i3 = i6;
                iDbNXlk = i13;
                int iCharCount22 = java.lang.Character.charCount(i8) + iCharCount;
                if ((iDbNXlk & 255) > (i7 >> 8)) {
                }
            }
        }
    }

    public void KWHzl(java.lang.CharSequence charSequence, boolean z, StateListAnimator stateListAnimator) {
        int iOLrzqt;
        int length = charSequence.length();
        int i = 0;
        if (!stateListAnimator.AEQbTJ() && (iOLrzqt = OLrzqt(charSequence, 0, length)) != 0) {
            int iOLrzqt2 = OLrzqt(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt());
            java.lang.StringBuilder sb = new java.lang.StringBuilder((stateListAnimator.OLrzqt() - iOLrzqt2) + iOLrzqt + 16);
            sb.append((java.lang.CharSequence) stateListAnimator.KWHzl(), iOLrzqt2, stateListAnimator.OLrzqt());
            stateListAnimator.copydefault(stateListAnimator.OLrzqt() - iOLrzqt2);
            sb.append(charSequence, 0, iOLrzqt);
            EZpvd(sb, 0, sb.length(), stateListAnimator);
            i = iOLrzqt;
        }
        if (z) {
            EZpvd(charSequence, i, length, stateListAnimator);
        } else {
            stateListAnimator.append(charSequence, i, length);
        }
    }

    public boolean fIwbmz(int i) {
        return i < this.isConnected || (i <= 65535 && !QOLQEE(i)) || ORxRYg(AkhnZx(i));
    }

    public boolean ORxRYg(int i) {
        if (i < this.AuCTel) {
            return true;
        }
        if (i >= this.gEmmrt) {
            return i <= 64512 || i == 65024;
        }
        int i2 = i >> 1;
        return (this.AhwBna.charAt(i2) & 128) == 0 || (this.AhwBna.charAt(i2 - 1) & 65280) == 0;
    }

    public boolean DTwDnp(int i) {
        if (i <= this.fJNWhG || zLjUOn(i)) {
            return true;
        }
        if (i >= this.gEmmrt) {
            return gHZMYf(i) ? i <= 64512 || i == 65024 : (i & 6) <= 2;
        }
        int i2 = i >> 1;
        char cCharAt = this.AhwBna.charAt(i2);
        if (cCharAt > 511) {
            return false;
        }
        return cCharAt <= 255 || (cCharAt & 128) == 0 || (this.AhwBna.charAt(i2 - 1) & 65280) == 0;
    }

    public boolean getFieldNames(int i) {
        return AuCTelauCTel(AkhnZx(i));
    }

    public boolean AuCTel(int i) {
        return i < this.AYXKKw || AwvSrB(AkhnZx(i));
    }

    public boolean AEQbTJ(int i, boolean z) {
        return OLrzqt(AkhnZx(i), z);
    }

    public boolean copydefault(int i, boolean z) {
        int iAkhnZx = AkhnZx(i);
        return getNewProxyInstance(iAkhnZx) && (iAkhnZx & 1) != 0 && (!z || copydefault(iAkhnZx) || this.AhwBna.charAt(iAkhnZx >> 1) <= 511);
    }

    public boolean ejfBZ(int i) {
        return fIwbmz(i);
    }

    public boolean wlaJM(int i) {
        return isConnected(i) <= 1;
    }

    public final boolean zLjUOn(int i) {
        return i == OLrzqt();
    }

    public final int djBIcL(int i) {
        int i2 = i >> 1;
        if ((this.AhwBna.charAt(i2) & 128) != 0) {
            return this.AhwBna.charAt(i2 - 1) & 255;
        }
        return 0;
    }

    public int fJNWhG(int i) {
        if (i <= this.fJNWhG) {
            return 0;
        }
        return this.AhwBna.charAt(i >> 1) >> '\b';
    }

    public final int AYXKKw(int i) {
        int i2 = ((64512 - this.values) + i) >> 1;
        return i2 + 1 + (this.valueOf.charAt(i2) & 31);
    }

    public final int AEQbTJ(java.lang.CharSequence charSequence, int i, int i2, boolean z, boolean z2, StateListAnimator stateListAnimator) {
        while (i < i2) {
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, i);
            if (z && iCodePointAt < this.AYXKKw) {
                return i;
            }
            int iAkhnZx = AkhnZx(iCodePointAt);
            if (!z || !AwvSrB(iAkhnZx)) {
                i += java.lang.Character.charCount(iCodePointAt);
                AEQbTJ(iCodePointAt, iAkhnZx, stateListAnimator);
                if (z && OLrzqt(iAkhnZx, z2)) {
                    break;
                }
            } else {
                return i;
            }
        }
        return i;
    }

    public final void AEQbTJ(int i, int i2, StateListAnimator stateListAnimator) {
        if (i2 >= this.gEmmrt) {
            if (gHZMYf(i2)) {
                stateListAnimator.OLrzqt(i, KWHzl(i2));
                return;
            } else {
                i = copydefault(i, i2);
                i2 = values(i);
            }
        }
        if (i2 < this.fJNWhG) {
            stateListAnimator.OLrzqt(i, 0);
            return;
        }
        if (zsXlph(i2) || zLjUOn(i2)) {
            Activity.EZpvd(i, stateListAnimator);
            return;
        }
        int i3 = i2 >> 1;
        char cCharAt = this.AhwBna.charAt(i3);
        int i4 = i3 + 1;
        stateListAnimator.AEQbTJ(this.AhwBna, i4, i4 + (cCharAt & 31), true, (cCharAt & 128) != 0 ? this.AhwBna.charAt(i3 - 1) >> '\b' : 0, cCharAt >> '\b');
    }

    public static int KWHzl(java.lang.String str, int i, int i2) {
        char cCharAt;
        if (i2 < 13312) {
            int i3 = i2 << 1;
            while (true) {
                cCharAt = str.charAt(i);
                if (i3 <= cCharAt) {
                    break;
                }
                i += (cCharAt & 1) + 2;
            }
            if (i3 != (cCharAt & 32766)) {
                return -1;
            }
            if ((cCharAt & 1) != 0) {
                return str.charAt(i + 2) | (str.charAt(i + 1) << 16);
            }
            return str.charAt(i + 1);
        }
        int i4 = ((i2 >> 9) & (-2)) + 13312;
        int i5 = (i2 << 6) & 65535;
        while (true) {
            char cCharAt2 = str.charAt(i);
            if (i4 > cCharAt2) {
                i += (cCharAt2 & 1) + 2;
            } else {
                if (i4 != (cCharAt2 & 32766)) {
                    return -1;
                }
                char cCharAt3 = str.charAt(i + 1);
                if (i5 <= cCharAt3) {
                    if (i5 == (65472 & cCharAt3)) {
                        return str.charAt(i + 2) | (('?' & cCharAt3) << 16);
                    }
                    return -1;
                }
                if ((cCharAt2 & 32768) != 0) {
                    return -1;
                }
                i += 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9 A[EDGE_INSN: B:62:0x00e9->B:46:0x00e9 BREAK  A[LOOP:0: B:6:0x0014->B:72:0x0014], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(StateListAnimator stateListAnimator, int i, boolean z) {
        char cCharAt;
        char cCharAt2;
        java.lang.StringBuilder sbKWHzl = stateListAnimator.KWHzl();
        int iCharCount = i;
        if (iCharCount == sbKWHzl.length()) {
            return;
        }
        int i2 = 0;
        boolean z2 = false;
        int iGEmmrt = -1;
        int i3 = -1;
        while (true) {
            int iCodePointAt = sbKWHzl.codePointAt(iCharCount);
            iCharCount += java.lang.Character.charCount(iCodePointAt);
            int iAkhnZx = AkhnZx(iCodePointAt);
            int iKWHzl = KWHzl(iAkhnZx);
            if (AxsJAY(iAkhnZx) && iGEmmrt >= 0 && (i2 < iKWHzl || i2 == 0)) {
                if (OLrzqt(iAkhnZx)) {
                    if (iCodePointAt < 4519 && (cCharAt = (char) (sbKWHzl.charAt(i3) - 4352)) < 19) {
                        int i4 = iCharCount - 1;
                        char c = (char) ((((cCharAt * 21) + (iCodePointAt - 4449)) * 28) + 44032);
                        if (iCharCount != sbKWHzl.length() && (cCharAt2 = (char) (sbKWHzl.charAt(iCharCount) - 4519)) < 28) {
                            iCharCount++;
                            c = (char) (c + cCharAt2);
                        }
                        sbKWHzl.setCharAt(i3, c);
                        sbKWHzl.delete(i4, iCharCount);
                        iCharCount = i4;
                    }
                    if (iCharCount == sbKWHzl.length()) {
                        break;
                    }
                } else {
                    int iKWHzl2 = KWHzl(this.valueOf, iGEmmrt, iCodePointAt);
                    if (iKWHzl2 >= 0) {
                        int i5 = iKWHzl2 >> 1;
                        int iCharCount2 = iCharCount - java.lang.Character.charCount(iCodePointAt);
                        sbKWHzl.delete(iCharCount2, iCharCount);
                        if (z2) {
                            if (i5 > 65535) {
                                sbKWHzl.setCharAt(i3, C7242agD.OLrzqt(i5));
                                sbKWHzl.setCharAt(i3 + 1, C7242agD.EZpvd(i5));
                            } else {
                                sbKWHzl.setCharAt(i3, (char) iCodePointAt);
                                sbKWHzl.deleteCharAt(i3 + 1);
                                iCharCount2--;
                                z2 = false;
                            }
                        } else if (i5 > 65535) {
                            sbKWHzl.setCharAt(i3, C7242agD.OLrzqt(i5));
                            sbKWHzl.insert(i3 + 1, C7242agD.EZpvd(i5));
                            iCharCount = iCharCount2 + 1;
                            z2 = true;
                            if (iCharCount != sbKWHzl.length()) {
                                break;
                            } else {
                                iGEmmrt = (iKWHzl2 & 1) != 0 ? AYXKKw(values(i5)) : -1;
                            }
                        } else {
                            sbKWHzl.setCharAt(i3, (char) i5);
                        }
                        iCharCount = iCharCount2;
                        if (iCharCount != sbKWHzl.length()) {
                        }
                    }
                }
            }
            if (iCharCount == sbKWHzl.length()) {
                break;
            }
            if (iKWHzl == 0) {
                iGEmmrt = gEmmrt(iAkhnZx);
                if (iGEmmrt >= 0) {
                    if (iCodePointAt <= 65535) {
                        i3 = iCharCount - 1;
                        z2 = false;
                    } else {
                        i3 = iCharCount - 2;
                        i2 = iKWHzl;
                        z2 = true;
                    }
                }
            } else if (z) {
                iGEmmrt = -1;
            }
            i2 = iKWHzl;
        }
        stateListAnimator.EZpvd();
    }

    public final boolean EZpvd(int i, int i2) {
        return i < this.AYXKKw || AwvSrB(i2);
    }

    public final boolean AwvSrB(int i) {
        return i < this.AuCTel || fARcdN(i);
    }

    public final boolean EZpvd(java.lang.CharSequence charSequence, int i, int i2) {
        return i == i2 || AuCTel(java.lang.Character.codePointAt(charSequence, i));
    }

    public final boolean OLrzqt(int i, boolean z) {
        return (i & 1) != 0 && (!z || zuBGHE(i));
    }

    public final boolean KWHzl(java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        return i == i2 || AEQbTJ(java.lang.Character.codePointBefore(charSequence, i2), z);
    }

    public final boolean zuBGHE(int i) {
        if (copydefault(i)) {
            return true;
        }
        if (uzCIH(i)) {
            if ((i & 6) <= 2) {
                return true;
            }
        } else if (this.AhwBna.charAt(i >> 1) <= 511) {
            return true;
        }
        return false;
    }

    public final int copydefault(java.lang.CharSequence charSequence, int i, boolean z) {
        while (i > 0) {
            int iCodePointBefore = java.lang.Character.codePointBefore(charSequence, i);
            int iAkhnZx = AkhnZx(iCodePointBefore);
            if (OLrzqt(iAkhnZx, z)) {
                break;
            }
            i -= java.lang.Character.charCount(iCodePointBefore);
            if (EZpvd(iCodePointBefore, iAkhnZx)) {
                break;
            }
        }
        return i;
    }

    public final int AEQbTJ(java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        while (i < i2) {
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, i);
            int iCopydefault = this.fARcdN.copydefault(iCodePointAt);
            if (EZpvd(iCodePointAt, iCopydefault)) {
                break;
            }
            i += java.lang.Character.charCount(iCodePointAt);
            if (OLrzqt(iCopydefault, z)) {
                break;
            }
        }
        return i;
    }

    public final int OLrzqt(java.lang.CharSequence charSequence, int i) {
        while (i > 0) {
            int iCodePointBefore = java.lang.Character.codePointBefore(charSequence, i);
            if (iCodePointBefore < this.AkhnZx) {
                break;
            }
            int iAkhnZx = AkhnZx(iCodePointBefore);
            if (DTwDnp(iAkhnZx)) {
                break;
            }
            i -= java.lang.Character.charCount(iCodePointBefore);
            if (ORxRYg(iAkhnZx)) {
                break;
            }
        }
        return i;
    }

    public final int OLrzqt(java.lang.CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, i);
            if (iCodePointAt < this.isConnected) {
                break;
            }
            int iAkhnZx = AkhnZx(iCodePointAt);
            if (ORxRYg(iAkhnZx)) {
                break;
            }
            i += java.lang.Character.charCount(iCodePointAt);
            if (DTwDnp(iAkhnZx)) {
                break;
            }
        }
        return i;
    }

    public final int AEQbTJ(java.lang.CharSequence charSequence, int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return isConnected(java.lang.Character.codePointBefore(charSequence, i2));
    }

    public final void copydefault(C7256agR c7256agR, int i, int i2) {
        UnicodeSet unicodeSet;
        int iAEQbTJ = c7256agR.AEQbTJ(i2);
        if ((4194303 & iAEQbTJ) == 0 && i != 0) {
            c7256agR.OLrzqt(i2, i | iAEQbTJ);
            return;
        }
        if ((iAEQbTJ & 2097152) == 0) {
            int i3 = iAEQbTJ & 2097151;
            c7256agR.OLrzqt(i2, (iAEQbTJ & (-2097152)) | 2097152 | this.copydefault.size());
            java.util.ArrayList<UnicodeSet> arrayList = this.copydefault;
            unicodeSet = new UnicodeSet();
            arrayList.add(unicodeSet);
            if (i3 != 0) {
                unicodeSet.KWHzl(i3);
            }
        } else {
            unicodeSet = this.copydefault.get(iAEQbTJ & 2097151);
        }
        unicodeSet.KWHzl(i);
    }
}

package com.ibm.icu.text;

import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.lang.UScript;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC7192afG;
import o.AbstractC7247agI;
import o.C7010abK;
import o.C7018abS;
import o.C7034acH;
import o.C7041acO;
import o.C7042acP;
import o.C7045acS;
import o.C7070acr;
import o.C7075acw;
import o.C7077acy;
import o.C7219afh;
import o.C7221afj;
import o.C7223afl;
import o.C7242agD;
import o.C7253agO;
import o.C7258agT;
import o.InterfaceC7245agG;
import o.InterfaceC7248agJ;
import o.InterfaceC7290agz;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public class UnicodeSet extends AbstractC7247agI implements Iterable<String>, Comparable<UnicodeSet>, InterfaceC7248agJ<UnicodeSet> {
    public int[] AYXKKw;
    public String AhwBna;
    public int[] DbNXlk;
    public volatile C7010abK djBIcL;
    public int gEmmrt;
    public volatile C7042acP isConnected;
    public int[] valueOf;
    public SortedSet<String> values;
    public static final SortedSet<String> AEQbTJ = Collections.unmodifiableSortedSet(new TreeSet());
    public static final UnicodeSet OLrzqt = new UnicodeSet().AYXKKw();
    public static final UnicodeSet EZpvd = new UnicodeSet(0, 1114111).AYXKKw();
    public static PendingIntent copydefault = null;
    public static final C7258agT KWHzl = C7258agT.AEQbTJ(0, 0, 0, 0);

    public enum ComparisonStyle {
        SHORTER_FIRST,
        LEXICOGRAPHIC,
        LONGER_FIRST
    }

    public static abstract class PendingIntent implements InterfaceC7290agz {
        public boolean OLrzqt(String str, String str2, UnicodeSet unicodeSet) {
            return false;
        }
    }

    public enum SpanCondition {
        NOT_CONTAINED,
        CONTAINED,
        SIMPLE,
        CONDITION_COUNT
    }

    public interface TaskDescription {
        boolean AEQbTJ(int i);
    }

    public static final int copydefault(int i, int i2) {
        return i > i2 ? i : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return (this.djBIcL == null && this.isConnected == null) ? false : true;
    }

    public final int valueOf(int i) {
        if (i < 25) {
            return i + 25;
        }
        if (i <= 2500) {
            return i * 5;
        }
        int i2 = i * 2;
        if (i2 > 1114113) {
            return 1114113;
        }
        return i2;
    }

    public UnicodeSet() {
        this.values = AEQbTJ;
        this.AhwBna = null;
        int[] iArr = new int[25];
        this.AYXKKw = iArr;
        iArr[0] = 1114112;
        this.gEmmrt = 1;
    }

    public UnicodeSet(UnicodeSet unicodeSet) {
        this.values = AEQbTJ;
        this.AhwBna = null;
        djBIcL(unicodeSet);
    }

    public UnicodeSet(int i, int i2) {
        this();
        EZpvd(i, i2);
    }

    public UnicodeSet(int... iArr) {
        this.values = AEQbTJ;
        this.AhwBna = null;
        if ((iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Must have even number of integers");
        }
        int length = iArr.length + 1;
        this.AYXKKw = new int[length];
        this.gEmmrt = length;
        int i = -1;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i >= i3) {
                throw new IllegalArgumentException("Must be monotonically increasing.");
            }
            int[] iArr2 = this.AYXKKw;
            int i4 = i2 + 1;
            iArr2[i2] = i3;
            int i5 = iArr[i4] + 1;
            if (i3 >= i5) {
                throw new IllegalArgumentException("Must be monotonically increasing.");
            }
            i2 += 2;
            iArr2[i4] = i5;
            i = i5;
        }
        this.AYXKKw[i2] = 1114112;
    }

    public UnicodeSet(String str) {
        this();
        KWHzl(str, null, null, 1);
    }

    public Object clone() {
        return gEmmrt() ? this : new UnicodeSet(this);
    }

    public UnicodeSet AYXKKw(int i, int i2) {
        AkhnZx();
        copydefault();
        KWHzl(i, i2);
        return this;
    }

    public UnicodeSet djBIcL(UnicodeSet unicodeSet) {
        AkhnZx();
        this.AYXKKw = Arrays.copyOf(unicodeSet.AYXKKw, unicodeSet.gEmmrt);
        this.gEmmrt = unicodeSet.gEmmrt;
        this.AhwBna = unicodeSet.AhwBna;
        if (unicodeSet.AhwBna()) {
            this.values = new TreeSet((SortedSet) unicodeSet.values);
        } else {
            this.values = AEQbTJ;
        }
        return this;
    }

    public final UnicodeSet OLrzqt(String str) {
        AkhnZx();
        return KWHzl(str, null, null, 1);
    }

    public static void AEQbTJ(Appendable appendable, int i) {
        try {
            if (i <= 65535) {
                appendable.append((char) i);
            } else {
                appendable.append(C7242agD.OLrzqt(i)).append(C7242agD.EZpvd(i));
            }
        } catch (IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public static void KWHzl(Appendable appendable, CharSequence charSequence) {
        try {
            appendable.append(charSequence);
        } catch (IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public static <T extends Appendable> T KWHzl(T t, String str, boolean z) {
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            EZpvd(t, iCodePointAt, z);
            iCharCount += Character.charCount(iCodePointAt);
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[Catch: IOException -> 0x000f, TryCatch #0 {IOException -> 0x000f, blocks: (B:3:0x0002, B:5:0x0008, B:22:0x002b, B:23:0x002e, B:25:0x0034, B:27:0x003b, B:26:0x0038), top: B:31:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T extends Appendable> T EZpvd(T t, int i, boolean z) {
        if (z) {
            try {
                if (C7045acS.OLrzqt(i) && C7045acS.KWHzl(t, i)) {
                    return t;
                }
            } catch (IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }
        if (i == 36 || i == 38 || i == 45 || i == 58 || i == 123 || i == 125) {
            t.append(AbstractJsonLexerKt.STRING_ESC);
        } else {
            switch (i) {
                case 91:
                case 92:
                case 93:
                case 94:
                    break;
                default:
                    if (C7070acr.AEQbTJ(i)) {
                        t.append(AbstractJsonLexerKt.STRING_ESC);
                    }
                    break;
            }
        }
        AEQbTJ(t, i);
        return t;
    }

    public String KWHzl(boolean z) {
        String str = this.AhwBna;
        return (str == null || z) ? ((StringBuilder) KWHzl(new StringBuilder(), z)).toString() : str;
    }

    public final <T extends Appendable> T KWHzl(T t, boolean z) {
        String str = this.AhwBna;
        if (str == null) {
            return (T) AEQbTJ((Appendable) t, z, true);
        }
        try {
            if (!z) {
                t.append(str);
                return t;
            }
            int iCharCount = 0;
            boolean z2 = false;
            while (iCharCount < this.AhwBna.length()) {
                int iCodePointAt = this.AhwBna.codePointAt(iCharCount);
                iCharCount += Character.charCount(iCodePointAt);
                if (C7045acS.OLrzqt(iCodePointAt)) {
                    C7045acS.KWHzl(t, iCodePointAt);
                } else if (z2 || iCodePointAt != 92) {
                    if (z2) {
                        t.append(AbstractJsonLexerKt.STRING_ESC);
                    }
                    AEQbTJ(t, iCodePointAt);
                } else {
                    z2 = true;
                }
                z2 = false;
            }
            if (z2) {
                t.append(AbstractJsonLexerKt.STRING_ESC);
            }
            return t;
        } catch (IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public final <T extends Appendable> T AEQbTJ(T t, boolean z, boolean z2) {
        try {
            t.append(AbstractJsonLexerKt.BEGIN_LIST);
            int iDjBIcL = djBIcL();
            if (iDjBIcL > 1 && AYXKKw(0) == 0 && djBIcL(iDjBIcL - 1) == 1114111) {
                t.append('^');
                for (int i = 1; i < iDjBIcL; i++) {
                    int iDjBIcL2 = djBIcL(i - 1);
                    int i2 = iDjBIcL2 + 1;
                    int iAYXKKw = AYXKKw(i) - 1;
                    EZpvd(t, i2, z);
                    if (i2 != iAYXKKw) {
                        if (iDjBIcL2 + 2 != iAYXKKw) {
                            t.append('-');
                        }
                        EZpvd(t, iAYXKKw, z);
                    }
                }
            } else {
                for (int i3 = 0; i3 < iDjBIcL; i3++) {
                    int iAYXKKw2 = AYXKKw(i3);
                    int iDjBIcL3 = djBIcL(i3);
                    EZpvd(t, iAYXKKw2, z);
                    if (iAYXKKw2 != iDjBIcL3) {
                        if (iAYXKKw2 + 1 != iDjBIcL3) {
                            t.append('-');
                        }
                        EZpvd(t, iDjBIcL3, z);
                    }
                }
            }
            if (z2 && AhwBna()) {
                for (String str : this.values) {
                    t.append(AbstractJsonLexerKt.BEGIN_OBJ);
                    KWHzl(t, str, z);
                    t.append(AbstractJsonLexerKt.END_OBJ);
                }
            }
            t.append(AbstractJsonLexerKt.END_LIST);
            return t;
        } catch (IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public boolean AhwBna() {
        return !this.values.isEmpty();
    }

    public int valueOf() {
        int iDjBIcL = djBIcL();
        int iDjBIcL2 = 0;
        for (int i = 0; i < iDjBIcL; i++) {
            iDjBIcL2 += (djBIcL(i) - AYXKKw(i)) + 1;
        }
        return iDjBIcL2 + this.values.size();
    }

    public UnicodeSet EZpvd(int i, int i2) {
        AkhnZx();
        return AEQbTJ(i, i2);
    }

    public final UnicodeSet AEQbTJ(int i, int i2) {
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i, 6));
        }
        if (i2 < 0 || i2 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i2, 6));
        }
        if (i < i2) {
            int i3 = i2 + 1;
            int i4 = this.gEmmrt;
            if ((i4 & 1) != 0) {
                int i5 = i4 == 1 ? -2 : this.AYXKKw[i4 - 2];
                if (i5 <= i) {
                    AkhnZx();
                    if (i5 == i) {
                        int[] iArr = this.AYXKKw;
                        int i6 = this.gEmmrt;
                        iArr[i6 - 2] = i3;
                        if (i3 == 1114112) {
                            this.gEmmrt = i6 - 1;
                        }
                    } else {
                        int[] iArr2 = this.AYXKKw;
                        int i7 = this.gEmmrt;
                        iArr2[i7 - 1] = i;
                        if (i3 < 1114112) {
                            gEmmrt(i7 + 2);
                            int[] iArr3 = this.AYXKKw;
                            int i8 = this.gEmmrt;
                            iArr3[i8] = i3;
                            this.gEmmrt = i8 + 2;
                            iArr3[i8 + 1] = 1114112;
                        } else {
                            gEmmrt(i7 + 1);
                            int[] iArr4 = this.AYXKKw;
                            int i9 = this.gEmmrt;
                            this.gEmmrt = i9 + 1;
                            iArr4[i9] = 1114112;
                        }
                    }
                    this.AhwBna = null;
                    return this;
                }
            }
            OLrzqt(AhwBna(i, i2), 2, 0);
        } else if (i == i2) {
            KWHzl(i);
        }
        return this;
    }

    public final UnicodeSet KWHzl(int i) {
        AkhnZx();
        return EZpvd(i);
    }

    public final UnicodeSet EZpvd(int i) {
        int i2;
        int i3;
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i, 6));
        }
        int iAhwBna = AhwBna(i);
        if ((iAhwBna & 1) != 0) {
            return this;
        }
        int[] iArr = this.AYXKKw;
        if (i == iArr[iAhwBna] - 1) {
            iArr[iAhwBna] = i;
            if (i == 1114111) {
                gEmmrt(this.gEmmrt + 1);
                int[] iArr2 = this.AYXKKw;
                int i4 = this.gEmmrt;
                this.gEmmrt = i4 + 1;
                iArr2[i4] = 1114112;
            }
            if (iAhwBna > 0) {
                int[] iArr3 = this.AYXKKw;
                int i5 = iAhwBna - 1;
                if (i == iArr3[i5]) {
                    System.arraycopy(iArr3, iAhwBna + 1, iArr3, i5, (this.gEmmrt - iAhwBna) - 1);
                    this.gEmmrt -= 2;
                }
            }
        } else if (iAhwBna > 0 && i == (i3 = iArr[iAhwBna - 1])) {
            iArr[i2] = i3 + 1;
        } else {
            int i6 = this.gEmmrt;
            int i7 = i6 + 2;
            if (i7 > iArr.length) {
                int[] iArr4 = new int[valueOf(i7)];
                if (iAhwBna != 0) {
                    System.arraycopy(this.AYXKKw, 0, iArr4, 0, iAhwBna);
                }
                System.arraycopy(this.AYXKKw, iAhwBna, iArr4, iAhwBna + 2, this.gEmmrt - iAhwBna);
                this.AYXKKw = iArr4;
            } else {
                System.arraycopy(iArr, iAhwBna, iArr, iAhwBna + 2, i6 - iAhwBna);
            }
            int[] iArr5 = this.AYXKKw;
            iArr5[iAhwBna] = i;
            iArr5[iAhwBna + 1] = i + 1;
            this.gEmmrt += 2;
        }
        this.AhwBna = null;
        return this;
    }

    public final UnicodeSet AEQbTJ(CharSequence charSequence) {
        AkhnZx();
        int iEZpvd = EZpvd(charSequence);
        if (iEZpvd < 0) {
            String string = charSequence.toString();
            if (!this.values.contains(string)) {
                copydefault(string);
                this.AhwBna = null;
            }
        } else {
            AEQbTJ(iEZpvd, iEZpvd);
        }
        return this;
    }

    public final void copydefault(CharSequence charSequence) {
        if (this.values == AEQbTJ) {
            this.values = new TreeSet();
        }
        this.values.add(charSequence.toString());
    }

    public static int EZpvd(CharSequence charSequence) {
        if (charSequence.length() < 1) {
            throw new IllegalArgumentException("Can't use zero-length strings in UnicodeSet");
        }
        if (charSequence.length() > 2) {
            return -1;
        }
        if (charSequence.length() == 1) {
            return charSequence.charAt(0);
        }
        int iOLrzqt = C7242agD.OLrzqt(charSequence, 0);
        if (iOLrzqt > 65535) {
            return iOLrzqt;
        }
        return -1;
    }

    public UnicodeSet gEmmrt(int i, int i2) {
        AkhnZx();
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i, 6));
        }
        if (i2 >= 0 && i2 <= 1114111) {
            if (i <= i2) {
                KWHzl(AhwBna(i, i2), 2, 2);
            }
            return this;
        }
        throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i2, 6));
    }

    public final UnicodeSet fetchVPNInfo(int i) {
        return gEmmrt(i, i);
    }

    public UnicodeSet KWHzl(int i, int i2) {
        AkhnZx();
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i, 6));
        }
        if (i2 < 0 || i2 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i2, 6));
        }
        if (i <= i2) {
            AEQbTJ(AhwBna(i, i2), 2, 0);
        }
        this.AhwBna = null;
        return this;
    }

    public UnicodeSet EZpvd() {
        AkhnZx();
        int[] iArr = this.AYXKKw;
        if (iArr[0] == 0) {
            System.arraycopy(iArr, 1, iArr, 0, this.gEmmrt - 1);
            this.gEmmrt--;
        } else {
            gEmmrt(this.gEmmrt + 1);
            int[] iArr2 = this.AYXKKw;
            System.arraycopy(iArr2, 0, iArr2, 1, this.gEmmrt);
            this.AYXKKw[0] = 0;
            this.gEmmrt++;
        }
        this.AhwBna = null;
        return this;
    }

    public boolean AEQbTJ(int i) {
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i, 6));
        }
        if (this.djBIcL != null) {
            return this.djBIcL.EZpvd(i);
        }
        if (this.isConnected != null) {
            return this.isConnected.EZpvd(i);
        }
        return (AhwBna(i) & 1) != 0;
    }

    public final int AhwBna(int i) {
        int[] iArr = this.AYXKKw;
        int i2 = 0;
        if (i < iArr[0]) {
            return 0;
        }
        int i3 = this.gEmmrt;
        if (i3 >= 2 && i >= iArr[i3 - 2]) {
            return i3 - 1;
        }
        int i4 = i3 - 1;
        while (true) {
            int i5 = (i2 + i4) >>> 1;
            if (i5 == i2) {
                return i4;
            }
            if (i < this.AYXKKw[i5]) {
                i4 = i5;
            } else {
                i2 = i5;
            }
        }
    }

    public final boolean OLrzqt(CharSequence charSequence) {
        int iEZpvd = EZpvd(charSequence);
        if (iEZpvd < 0) {
            return this.values.contains(charSequence.toString());
        }
        return AEQbTJ(iEZpvd);
    }

    public boolean EZpvd(String str) {
        int iCopydefault = 0;
        while (iCopydefault < str.length()) {
            int iAEQbTJ = C7242agD.AEQbTJ(str, iCopydefault);
            if (AEQbTJ(iAEQbTJ)) {
                iCopydefault += C7242agD.copydefault(iAEQbTJ);
            } else {
                if (AhwBna()) {
                    return EZpvd(str, 0);
                }
                return false;
            }
        }
        return true;
    }

    public final boolean EZpvd(String str, int i) {
        if (i >= str.length()) {
            return true;
        }
        int iAEQbTJ = C7242agD.AEQbTJ(str, i);
        if (AEQbTJ(iAEQbTJ) && EZpvd(str, C7242agD.copydefault(iAEQbTJ) + i)) {
            return true;
        }
        for (String str2 : this.values) {
            if (str.startsWith(str2, i) && EZpvd(str, str2.length() + i)) {
                return true;
            }
        }
        return false;
    }

    public boolean valueOf(int i, int i2) {
        int i3;
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i, 6));
        }
        if (i2 < 0 || i2 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + C7045acS.AEQbTJ(i2, 6));
        }
        int i4 = -1;
        do {
            i4++;
            i3 = this.AYXKKw[i4];
        } while (i >= i3);
        return (i4 & 1) == 0 && i2 < i3;
    }

    public final boolean djBIcL(int i, int i2) {
        return !valueOf(i, i2);
    }

    public UnicodeSet OLrzqt(UnicodeSet unicodeSet) {
        AkhnZx();
        OLrzqt(unicodeSet.AYXKKw, unicodeSet.gEmmrt, 0);
        if (unicodeSet.AhwBna()) {
            SortedSet<String> sortedSet = this.values;
            if (sortedSet == AEQbTJ) {
                this.values = new TreeSet((SortedSet) unicodeSet.values);
            } else {
                sortedSet.addAll(unicodeSet.values);
            }
        }
        return this;
    }

    public UnicodeSet AhwBna(UnicodeSet unicodeSet) {
        AkhnZx();
        KWHzl(unicodeSet.AYXKKw, unicodeSet.gEmmrt, 0);
        if (AhwBna()) {
            if (!unicodeSet.AhwBna()) {
                this.values.clear();
            } else {
                this.values.retainAll(unicodeSet.values);
            }
        }
        return this;
    }

    public UnicodeSet AEQbTJ(UnicodeSet unicodeSet) {
        AkhnZx();
        KWHzl(unicodeSet.AYXKKw, unicodeSet.gEmmrt, 2);
        if (AhwBna() && unicodeSet.AhwBna()) {
            this.values.removeAll(unicodeSet.values);
        }
        return this;
    }

    public UnicodeSet copydefault() {
        AkhnZx();
        this.AYXKKw[0] = 1114112;
        this.gEmmrt = 1;
        this.AhwBna = null;
        if (AhwBna()) {
            this.values.clear();
        }
        return this;
    }

    public int djBIcL() {
        return this.gEmmrt / 2;
    }

    public int AYXKKw(int i) {
        return this.AYXKKw[i * 2];
    }

    public int djBIcL(int i) {
        return this.AYXKKw[(i * 2) + 1] - 1;
    }

    public UnicodeSet KWHzl() {
        AkhnZx();
        int i = this.gEmmrt;
        int[] iArr = this.AYXKKw;
        if (i + 7 < iArr.length) {
            this.AYXKKw = Arrays.copyOf(iArr, i);
        }
        this.DbNXlk = null;
        this.valueOf = null;
        SortedSet<String> sortedSet = this.values;
        SortedSet<String> sortedSet2 = AEQbTJ;
        if (sortedSet != sortedSet2 && sortedSet.isEmpty()) {
            this.values = sortedSet2;
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        try {
            UnicodeSet unicodeSet = (UnicodeSet) obj;
            if (this.gEmmrt != unicodeSet.gEmmrt) {
                return false;
            }
            for (int i = 0; i < this.gEmmrt; i++) {
                if (this.AYXKKw[i] != unicodeSet.AYXKKw[i]) {
                    return false;
                }
            }
            return this.values.equals(unicodeSet.values);
        } catch (Exception unused) {
            return false;
        }
    }

    public int hashCode() {
        int i = this.gEmmrt;
        for (int i2 = 0; i2 < this.gEmmrt; i2++) {
            i = (i * 1000003) + this.AYXKKw[i2];
        }
        return i;
    }

    public String toString() {
        return KWHzl(true);
    }

    @Deprecated
    public UnicodeSet KWHzl(String str, ParsePosition parsePosition, InterfaceC7290agz interfaceC7290agz, int i) {
        boolean z = parsePosition == null;
        if (z) {
            parsePosition = new ParsePosition(0);
        }
        StringBuilder sb = new StringBuilder();
        C7075acw c7075acw = new C7075acw(str, interfaceC7290agz, parsePosition);
        EZpvd(c7075acw, interfaceC7290agz, sb, i, 0);
        if (c7075acw.AEQbTJ()) {
            copydefault(c7075acw, "Extra chars in variable value");
        }
        this.AhwBna = sb.toString();
        if (z) {
            int index = parsePosition.getIndex();
            if ((i & 1) != 0) {
                index = C7070acr.KWHzl(str, index);
            }
            if (index != str.length()) {
                throw new IllegalArgumentException("Parse of \"" + str + "\" failed at " + index);
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(C7075acw c7075acw, InterfaceC7290agz interfaceC7290agz, Appendable appendable, int i, int i2) {
        boolean z;
        char c;
        Object obj;
        UnicodeSet unicodeSet;
        int iKWHzl;
        char c2;
        boolean zKWHzl;
        char c3;
        char c4;
        UnicodeSet unicodeSet2;
        int i3;
        Object obj2;
        char c5;
        StringBuilder sb;
        Object objKWHzl;
        char c6;
        int i4;
        boolean z2;
        String str;
        InterfaceC7245agG interfaceC7245agGKWHzl;
        int i5;
        InterfaceC7290agz interfaceC7290agz2 = interfaceC7290agz;
        int i6 = i2;
        if (i6 > 100) {
            copydefault(c7075acw, "Pattern nested too deeply");
        }
        int i7 = (i & 1) != 0 ? 7 : 3;
        StringBuilder sb2 = new StringBuilder();
        copydefault();
        char c7 = 0;
        Object obj3 = null;
        char c8 = 0;
        char c9 = 0;
        UnicodeSet unicodeSet3 = null;
        int i8 = 0;
        String str2 = null;
        boolean z3 = false;
        boolean z4 = false;
        StringBuilder sb3 = null;
        while (c7 != 2 && !c7075acw.OLrzqt()) {
            if (EZpvd(c7075acw, i7)) {
                c = c7;
                obj = obj3;
                unicodeSet = null;
                iKWHzl = 0;
                c2 = 2;
                zKWHzl = false;
            } else {
                Object objKWHzl2 = c7075acw.KWHzl(obj3);
                int iKWHzl2 = c7075acw.KWHzl(i7);
                zKWHzl = c7075acw.KWHzl();
                if (iKWHzl2 != 91 || zKWHzl) {
                    if (interfaceC7290agz2 != null && (interfaceC7245agGKWHzl = interfaceC7290agz2.KWHzl(iKWHzl2)) != null) {
                        try {
                            obj = objKWHzl2;
                            iKWHzl = iKWHzl2;
                            c = c7;
                            unicodeSet = (UnicodeSet) interfaceC7245agGKWHzl;
                            c2 = 3;
                        } catch (ClassCastException unused) {
                            copydefault(c7075acw, "Syntax error");
                            c2 = 0;
                            obj = objKWHzl2;
                            iKWHzl = iKWHzl2;
                            c = c7;
                            unicodeSet = null;
                        }
                    }
                    c2 = 0;
                    obj = objKWHzl2;
                    iKWHzl = iKWHzl2;
                    c = c7;
                    unicodeSet = null;
                } else {
                    if (c7 == 1) {
                        c7075acw.copydefault(objKWHzl2);
                        c2 = 1;
                    } else {
                        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                        Object objKWHzl3 = c7075acw.KWHzl(objKWHzl2);
                        int iKWHzl3 = c7075acw.KWHzl(i7);
                        boolean zKWHzl2 = c7075acw.KWHzl();
                        if (iKWHzl3 != 94 || zKWHzl2) {
                            i5 = 45;
                        } else {
                            sb2.append('^');
                            objKWHzl3 = c7075acw.KWHzl(objKWHzl3);
                            iKWHzl3 = c7075acw.KWHzl(i7);
                            c7075acw.KWHzl();
                            i5 = 45;
                            z4 = true;
                        }
                        if (iKWHzl3 == i5) {
                            iKWHzl2 = iKWHzl3;
                            c2 = 0;
                            zKWHzl = true;
                            objKWHzl2 = objKWHzl3;
                            c7 = 1;
                        } else {
                            c7075acw.copydefault(objKWHzl3);
                            obj3 = objKWHzl3;
                            c7 = 1;
                        }
                    }
                    obj = objKWHzl2;
                    iKWHzl = iKWHzl2;
                    c = c7;
                    unicodeSet = null;
                }
            }
            if (c2 != 0) {
                if (c9 == 1) {
                    if (c8 != 0) {
                        copydefault(c7075acw, "Char expected after operator");
                    }
                    AEQbTJ(i8, i8);
                    EZpvd(sb2, i8, false);
                    c4 = '-';
                    c3 = 0;
                } else {
                    c3 = c8;
                    c4 = '-';
                }
                if (c3 == c4 || c3 == '&') {
                    sb2.append(c3);
                }
                if (unicodeSet == null) {
                    if (unicodeSet3 == null) {
                        unicodeSet3 = new UnicodeSet();
                    }
                    unicodeSet = unicodeSet3;
                    unicodeSet2 = unicodeSet;
                } else {
                    unicodeSet2 = unicodeSet3;
                }
                if (c2 != 1) {
                    if (c2 != 2) {
                        c5 = 3;
                        if (c2 == 3) {
                            unicodeSet.KWHzl(sb2, false);
                        }
                    } else {
                        c5 = 3;
                        c7075acw.copydefault(i7);
                        unicodeSet.EZpvd(c7075acw, sb2, interfaceC7290agz2);
                    }
                    z = true;
                    i3 = i8;
                    obj2 = obj;
                } else {
                    int i9 = i6 + 1;
                    i3 = i8;
                    z = true;
                    obj2 = obj;
                    unicodeSet.EZpvd(c7075acw, interfaceC7290agz, sb2, i, i9);
                }
                if (c == 0) {
                    djBIcL(unicodeSet);
                    z3 = z;
                    c7 = 2;
                    break;
                }
                if (c3 == 0) {
                    OLrzqt(unicodeSet);
                } else if (c3 == '&') {
                    AhwBna(unicodeSet);
                } else if (c3 == '-') {
                    AEQbTJ(unicodeSet);
                }
                i8 = i3;
                c7 = c;
                unicodeSet3 = unicodeSet2;
                obj3 = obj2;
                c8 = 0;
                c9 = 2;
                i6 = i2;
                z3 = z;
                interfaceC7290agz2 = interfaceC7290agz;
            } else {
                int i10 = i8;
                Object obj4 = obj;
                if (c == 0) {
                    copydefault(c7075acw, "Missing '['");
                }
                if (!zKWHzl) {
                    if (iKWHzl != 36) {
                        if (iKWHzl == 38) {
                            sb = sb3;
                            if (c9 != 2 || c8 != 0) {
                                copydefault(c7075acw, "'&' not after set");
                                objKWHzl = obj4;
                                if (c9 != 0) {
                                }
                                interfaceC7290agz2 = interfaceC7290agz;
                                i6 = i2;
                                obj3 = objKWHzl;
                                sb3 = sb;
                                c7 = c;
                            }
                        } else if (iKWHzl == 45) {
                            sb = sb3;
                            if (c8 == 0) {
                                if (c9 == 0 && str2 == null) {
                                    AEQbTJ(iKWHzl, iKWHzl);
                                    int iKWHzl4 = c7075acw.KWHzl(i7);
                                    boolean zKWHzl3 = c7075acw.KWHzl();
                                    if (iKWHzl4 != 93 || zKWHzl3) {
                                        iKWHzl = iKWHzl4;
                                    } else {
                                        sb2.append("-]");
                                        sb3 = sb;
                                        objKWHzl = obj4;
                                        c = 2;
                                        obj3 = objKWHzl;
                                        c7 = c;
                                    }
                                }
                            }
                            copydefault(c7075acw, "'-' not after char, string, or set");
                            objKWHzl = obj4;
                            if (c9 != 0) {
                                if (c8 == '-' && str2 != null) {
                                    copydefault(c7075acw, "Invalid range");
                                }
                                i8 = iKWHzl;
                                c9 = 1;
                                str2 = null;
                            } else if (c9 != 1) {
                                if (c9 != 2) {
                                    i8 = i10;
                                } else {
                                    if (c8 != 0) {
                                        copydefault(c7075acw, "Set expected after operator");
                                    }
                                    i8 = iKWHzl;
                                    c9 = 1;
                                }
                            } else if (c8 == '-') {
                                if (str2 != null) {
                                    copydefault(c7075acw, "Invalid range");
                                }
                                if (i10 >= iKWHzl) {
                                    copydefault(c7075acw, "Invalid range");
                                }
                                AEQbTJ(i10, iKWHzl);
                                EZpvd(sb2, i10, false);
                                sb2.append(c8);
                                EZpvd(sb2, iKWHzl, false);
                                c8 = 0;
                                c9 = 0;
                                i8 = i10;
                            } else {
                                AEQbTJ(i10, i10);
                                EZpvd(sb2, i10, false);
                                i8 = iKWHzl;
                            }
                            interfaceC7290agz2 = interfaceC7290agz;
                            i6 = i2;
                            obj3 = objKWHzl;
                            sb3 = sb;
                            c7 = c;
                        } else if (iKWHzl == 123) {
                            if (c8 != 0 && c8 != '-') {
                                copydefault(c7075acw, "Missing operand after operator");
                            }
                            if (c9 == 1) {
                                AEQbTJ(i10, i10);
                                i4 = 0;
                                EZpvd(sb2, i10, false);
                            } else {
                                i4 = 0;
                            }
                            StringBuilder sb4 = sb3;
                            if (sb4 == null) {
                                sb4 = new StringBuilder();
                            } else {
                                sb4.setLength(i4);
                            }
                            while (true) {
                                if (!c7075acw.OLrzqt()) {
                                    int iKWHzl5 = c7075acw.KWHzl(i7);
                                    boolean zKWHzl4 = c7075acw.KWHzl();
                                    if (iKWHzl5 == 125 && !zKWHzl4) {
                                        z2 = true;
                                        break;
                                    }
                                    AEQbTJ((Appendable) sb4, iKWHzl5);
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (sb4.length() < 1 || !z2) {
                                copydefault(c7075acw, "Invalid multicharacter string");
                            }
                            String string = sb4.toString();
                            if (c8 == '-') {
                                int iEZpvd = C7219afh.EZpvd(str2 == null ? "" : str2);
                                int iEZpvd2 = C7219afh.EZpvd(string);
                                if (iEZpvd != Integer.MAX_VALUE && iEZpvd2 != Integer.MAX_VALUE) {
                                    EZpvd(iEZpvd, iEZpvd2);
                                } else {
                                    if (this.values == AEQbTJ) {
                                        this.values = new TreeSet();
                                    }
                                    try {
                                        C7077acy.AEQbTJ(str2, string, true, this.values);
                                    } catch (Exception e) {
                                        copydefault(c7075acw, e.getMessage());
                                    }
                                }
                                str = null;
                                c8 = 0;
                            } else {
                                AEQbTJ(string);
                                str = string;
                            }
                            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
                            KWHzl(sb2, string, false);
                            sb2.append(AbstractJsonLexerKt.END_OBJ);
                            str2 = str;
                            sb3 = sb4;
                            c6 = 0;
                            c9 = c6;
                            objKWHzl = obj4;
                            obj3 = objKWHzl;
                            c7 = c;
                        } else if (iKWHzl == 93) {
                            if (c9 == 1) {
                                AEQbTJ(i10, i10);
                                EZpvd(sb2, i10, false);
                            }
                            if (c8 == '-') {
                                AEQbTJ(c8, c8);
                                sb2.append(c8);
                            } else if (c8 == '&') {
                                copydefault(c7075acw, "Trailing '&'");
                            }
                            sb2.append(AbstractJsonLexerKt.END_LIST);
                            obj3 = obj4;
                            c7 = 2;
                        } else if (iKWHzl == 94) {
                            copydefault(c7075acw, "'^' not after '['");
                        }
                        c8 = (char) iKWHzl;
                        c6 = c9;
                        sb3 = sb;
                        c9 = c6;
                        objKWHzl = obj4;
                        obj3 = objKWHzl;
                        c7 = c;
                    } else {
                        sb = sb3;
                        objKWHzl = c7075acw.KWHzl(obj4);
                        iKWHzl = c7075acw.KWHzl(i7);
                        boolean z5 = iKWHzl == 93 && !c7075acw.KWHzl();
                        if (interfaceC7290agz == null && !z5) {
                            c7075acw.copydefault(objKWHzl);
                            iKWHzl = 36;
                        } else if (z5 && c8 == 0) {
                            if (c9 == 1) {
                                AEQbTJ(i10, i10);
                                EZpvd(sb2, i10, false);
                            }
                            EZpvd(65535);
                            sb2.append('$');
                            sb2.append(AbstractJsonLexerKt.END_LIST);
                            z3 = true;
                            sb3 = sb;
                            c = 2;
                            obj3 = objKWHzl;
                            c7 = c;
                        } else {
                            copydefault(c7075acw, "Unquoted '$'");
                        }
                        if (c9 != 0) {
                        }
                        interfaceC7290agz2 = interfaceC7290agz;
                        i6 = i2;
                        obj3 = objKWHzl;
                        sb3 = sb;
                        c7 = c;
                    }
                    interfaceC7290agz2 = interfaceC7290agz;
                    i8 = i10;
                    i6 = i2;
                }
                sb = sb3;
                objKWHzl = obj4;
                if (c9 != 0) {
                }
                interfaceC7290agz2 = interfaceC7290agz;
                i6 = i2;
                obj3 = objKWHzl;
                sb3 = sb;
                c7 = c;
            }
        }
        z = true;
        if (c7 != 2) {
            copydefault(c7075acw, "Missing ']'");
        }
        c7075acw.copydefault(i7);
        if ((i & 2) != 0) {
            OLrzqt(2);
        }
        if (z4) {
            EZpvd();
        }
        if (z3) {
            KWHzl(appendable, sb2.toString());
        } else {
            AEQbTJ(appendable, false, z);
        }
    }

    public static void copydefault(C7075acw c7075acw, String str) {
        throw new IllegalArgumentException("Error: " + str + " at \"" + C7045acS.copydefault(c7075acw.toString()) + '\"');
    }

    public final void gEmmrt(int i) {
        if (i > 1114113) {
            i = 1114113;
        }
        if (i <= this.AYXKKw.length) {
            return;
        }
        int[] iArr = new int[valueOf(i)];
        System.arraycopy(this.AYXKKw, 0, iArr, 0, this.gEmmrt);
        this.AYXKKw = iArr;
    }

    public final void copydefault(int i) {
        if (i > 1114113) {
            i = 1114113;
        }
        int[] iArr = this.valueOf;
        if (iArr == null || i > iArr.length) {
            this.valueOf = new int[valueOf(i)];
        }
    }

    public final int[] AhwBna(int i, int i2) {
        int[] iArr = this.DbNXlk;
        if (iArr == null) {
            this.DbNXlk = new int[]{i, i2 + 1, 1114112};
        } else {
            iArr[0] = i;
            iArr[1] = i2 + 1;
        }
        return this.DbNXlk;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UnicodeSet AEQbTJ(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        copydefault(this.gEmmrt + i);
        int i8 = 0;
        int i9 = this.AYXKKw[0];
        if (i2 == 1 || i2 == 2) {
            if (iArr[0] == 0) {
                i6 = iArr[1];
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 1;
                while (true) {
                    if (i9 >= i8) {
                        i7 = i3 + 1;
                        this.valueOf[i3] = i9;
                        i9 = this.AYXKKw[i5];
                        i5++;
                    } else if (i8 < i9) {
                        i7 = i3 + 1;
                        this.valueOf[i3] = i8;
                        int i10 = iArr[i4];
                        i4++;
                        i8 = i10;
                    } else if (i9 != 1114112) {
                        i9 = this.AYXKKw[i5];
                        i8 = iArr[i4];
                        i5++;
                        i4++;
                    } else {
                        int[] iArr2 = this.valueOf;
                        iArr2[i3] = 1114112;
                        this.gEmmrt = i3 + 1;
                        int[] iArr3 = this.AYXKKw;
                        this.AYXKKw = iArr2;
                        this.valueOf = iArr3;
                        this.AhwBna = null;
                        return this;
                    }
                    i3 = i7;
                }
            }
        } else {
            i6 = iArr[0];
        }
        i4 = 1;
        i5 = 1;
        i8 = i6;
        i3 = 0;
        while (true) {
            if (i9 >= i8) {
            }
            i3 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UnicodeSet OLrzqt(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        copydefault(this.gEmmrt + i);
        int i10 = 0;
        int iCopydefault = this.AYXKKw[0];
        int iCopydefault2 = iArr[0];
        int i11 = 1;
        int i12 = 1;
        while (true) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (iCopydefault2 <= iCopydefault) {
                                if (iCopydefault == 1114112) {
                                    break;
                                }
                                i3 = i10 + 1;
                                this.valueOf[i10] = iCopydefault;
                                i10 = i3;
                                iCopydefault = this.AYXKKw[i11];
                                iCopydefault2 = iArr[i12];
                                i2 ^= 3;
                                i12++;
                            } else {
                                if (iCopydefault2 == 1114112) {
                                    break;
                                }
                                i3 = i10 + 1;
                                this.valueOf[i10] = iCopydefault2;
                                i10 = i3;
                                iCopydefault = this.AYXKKw[i11];
                                iCopydefault2 = iArr[i12];
                                i2 ^= 3;
                                i12++;
                            }
                            i11++;
                        } else {
                            continue;
                        }
                    } else if (iCopydefault2 < iCopydefault) {
                        i7 = i10 + 1;
                        this.valueOf[i10] = iCopydefault2;
                        int i13 = iArr[i12];
                        i2 ^= 2;
                        i12++;
                        iCopydefault2 = i13;
                        i10 = i7;
                    } else if (iCopydefault < iCopydefault2) {
                        iCopydefault = this.AYXKKw[i11];
                        i2 ^= 1;
                        i11++;
                    } else {
                        if (iCopydefault == 1114112) {
                            break;
                        }
                        i4 = i11 + 1;
                        iCopydefault = this.AYXKKw[i11];
                        i5 = i12 + 1;
                        i6 = iArr[i12];
                        int i14 = i5;
                        i11 = i4;
                        iCopydefault2 = i6;
                        i12 = i14;
                        i2 ^= 3;
                    }
                } else if (iCopydefault < iCopydefault2) {
                    i7 = i10 + 1;
                    this.valueOf[i10] = iCopydefault;
                    iCopydefault = this.AYXKKw[i11];
                    i2 ^= 1;
                    i11++;
                    i10 = i7;
                } else if (iCopydefault2 < iCopydefault) {
                    i8 = i12 + 1;
                    i9 = iArr[i12];
                    i2 ^= 2;
                    int i15 = i9;
                    i12 = i8;
                    iCopydefault2 = i15;
                } else {
                    if (iCopydefault == 1114112) {
                        break;
                    }
                    i4 = i11 + 1;
                    iCopydefault = this.AYXKKw[i11];
                    i5 = i12 + 1;
                    i6 = iArr[i12];
                    int i142 = i5;
                    i11 = i4;
                    iCopydefault2 = i6;
                    i12 = i142;
                    i2 ^= 3;
                }
            } else if (iCopydefault < iCopydefault2) {
                if (i10 > 0) {
                    int[] iArr2 = this.valueOf;
                    if (iCopydefault <= iArr2[i10 - 1]) {
                        i10--;
                        iCopydefault = copydefault(this.AYXKKw[i11], iArr2[i10]);
                    } else {
                        this.valueOf[i10] = iCopydefault;
                        iCopydefault = this.AYXKKw[i11];
                        i10++;
                    }
                    i11++;
                    i2 ^= 1;
                }
            } else if (iCopydefault2 < iCopydefault) {
                if (i10 > 0) {
                    int[] iArr3 = this.valueOf;
                    if (iCopydefault2 <= iArr3[i10 - 1]) {
                        i10--;
                        iCopydefault2 = copydefault(iArr[i12], iArr3[i10]);
                    } else {
                        this.valueOf[i10] = iCopydefault2;
                        iCopydefault2 = iArr[i12];
                        i10++;
                    }
                    i12++;
                    i2 ^= 2;
                }
            } else {
                if (iCopydefault == 1114112) {
                    break;
                }
                if (i10 > 0) {
                    int[] iArr4 = this.valueOf;
                    if (iCopydefault <= iArr4[i10 - 1]) {
                        i10--;
                        iCopydefault = copydefault(this.AYXKKw[i11], iArr4[i10]);
                    } else {
                        this.valueOf[i10] = iCopydefault;
                        iCopydefault = this.AYXKKw[i11];
                        i10++;
                    }
                    i11++;
                    i8 = i12 + 1;
                    i9 = iArr[i12];
                    i2 ^= 3;
                    int i152 = i9;
                    i12 = i8;
                    iCopydefault2 = i152;
                }
            }
        }
        int[] iArr5 = this.valueOf;
        iArr5[i10] = 1114112;
        this.gEmmrt = i10 + 1;
        int[] iArr6 = this.AYXKKw;
        this.AYXKKw = iArr5;
        this.valueOf = iArr6;
        this.AhwBna = null;
        return this;
    }

    public final UnicodeSet KWHzl(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        copydefault(this.gEmmrt + i);
        int i16 = 0;
        int i17 = this.AYXKKw[0];
        int i18 = iArr[0];
        int i19 = 1;
        int i20 = 1;
        while (true) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            continue;
                        } else if (i17 < i18) {
                            i10 = i16 + 1;
                            this.valueOf[i16] = i17;
                            i11 = i19 + 1;
                            i17 = this.AYXKKw[i19];
                            i2 ^= 1;
                            i19 = i11;
                        } else if (i18 < i17) {
                            i10 = i16 + 1;
                            this.valueOf[i16] = i18;
                            i12 = i20 + 1;
                            i18 = iArr[i20];
                            i2 ^= 2;
                            i20 = i12;
                        } else {
                            if (i17 == 1114112) {
                                break;
                            }
                            i3 = i16 + 1;
                            this.valueOf[i16] = i17;
                            i4 = i19 + 1;
                            i17 = this.AYXKKw[i19];
                            i5 = i20 + 1;
                            i6 = iArr[i20];
                            i20 = i5;
                            i18 = i6;
                            i19 = i4;
                            i16 = i3;
                            i2 ^= 3;
                        }
                    } else if (i18 < i17) {
                        i7 = i20 + 1;
                        i8 = iArr[i20];
                        int i21 = i8;
                        i20 = i7;
                        i18 = i21;
                        i2 ^= 2;
                    } else if (i17 < i18) {
                        i10 = i16 + 1;
                        this.valueOf[i16] = i17;
                        i11 = i19 + 1;
                        i17 = this.AYXKKw[i19];
                        i2 ^= 1;
                        i19 = i11;
                    } else {
                        if (i17 == 1114112) {
                            break;
                        }
                        i13 = i19 + 1;
                        i17 = this.AYXKKw[i19];
                        i14 = i20 + 1;
                        i15 = iArr[i20];
                        int i22 = i14;
                        i19 = i13;
                        i18 = i15;
                        i20 = i22;
                        i2 ^= 3;
                    }
                    i16 = i10;
                } else if (i17 < i18) {
                    i9 = i19 + 1;
                    i17 = this.AYXKKw[i19];
                    i19 = i9;
                    i2 ^= 1;
                } else if (i18 < i17) {
                    i10 = i16 + 1;
                    this.valueOf[i16] = i18;
                    i12 = i20 + 1;
                    i18 = iArr[i20];
                    i2 ^= 2;
                    i20 = i12;
                    i16 = i10;
                } else {
                    if (i17 == 1114112) {
                        break;
                    }
                    i13 = i19 + 1;
                    i17 = this.AYXKKw[i19];
                    i14 = i20 + 1;
                    i15 = iArr[i20];
                    int i222 = i14;
                    i19 = i13;
                    i18 = i15;
                    i20 = i222;
                    i2 ^= 3;
                }
            } else if (i17 < i18) {
                i9 = i19 + 1;
                i17 = this.AYXKKw[i19];
                i19 = i9;
                i2 ^= 1;
            } else if (i18 < i17) {
                i7 = i20 + 1;
                i8 = iArr[i20];
                int i212 = i8;
                i20 = i7;
                i18 = i212;
                i2 ^= 2;
            } else {
                if (i17 == 1114112) {
                    break;
                }
                i3 = i16 + 1;
                this.valueOf[i16] = i17;
                i4 = i19 + 1;
                i17 = this.AYXKKw[i19];
                i5 = i20 + 1;
                i6 = iArr[i20];
                i20 = i5;
                i18 = i6;
                i19 = i4;
                i16 = i3;
                i2 ^= 3;
            }
        }
        int[] iArr2 = this.valueOf;
        iArr2[i16] = 1114112;
        this.gEmmrt = i16 + 1;
        int[] iArr3 = this.AYXKKw;
        this.AYXKKw = iArr2;
        this.valueOf = iArr3;
        this.AhwBna = null;
        return this;
    }

    public static final class ActionBar implements TaskDescription {
        public double AEQbTJ;

        public ActionBar(double d) {
            this.AEQbTJ = d;
        }

        @Override // com.ibm.icu.text.UnicodeSet.TaskDescription
        public boolean AEQbTJ(int i) {
            return C7223afl.AYXKKw(i) == this.AEQbTJ;
        }
    }

    public static final class Activity implements TaskDescription {
        public int KWHzl;

        public Activity(int i) {
            this.KWHzl = i;
        }

        @Override // com.ibm.icu.text.UnicodeSet.TaskDescription
        public boolean AEQbTJ(int i) {
            return ((1 << C7223afl.djBIcL(i)) & this.KWHzl) != 0;
        }
    }

    public static final class StateListAnimator implements TaskDescription {
        public int OLrzqt;
        public int copydefault;

        public StateListAnimator(int i, int i2) {
            this.OLrzqt = i;
            this.copydefault = i2;
        }

        @Override // com.ibm.icu.text.UnicodeSet.TaskDescription
        public boolean AEQbTJ(int i) {
            return C7223afl.copydefault(i, this.OLrzqt) == this.copydefault;
        }
    }

    public static final class Application implements TaskDescription {
        public int KWHzl;

        public Application(int i) {
            this.KWHzl = i;
        }

        @Override // com.ibm.icu.text.UnicodeSet.TaskDescription
        public boolean AEQbTJ(int i) {
            return UScript.KWHzl(i, this.KWHzl);
        }
    }

    public static final class LoaderManager implements TaskDescription {
        public C7258agT copydefault;

        public LoaderManager(C7258agT c7258agT) {
            this.copydefault = c7258agT;
        }

        @Override // com.ibm.icu.text.UnicodeSet.TaskDescription
        public boolean AEQbTJ(int i) {
            C7258agT c7258agTEZpvd = C7223afl.EZpvd(i);
            return !C7045acS.AEQbTJ(c7258agTEZpvd, UnicodeSet.KWHzl) && c7258agTEZpvd.compareTo(this.copydefault) <= 0;
        }
    }

    public final void AEQbTJ(TaskDescription taskDescription, UnicodeSet unicodeSet) {
        copydefault();
        int iDjBIcL = unicodeSet.djBIcL();
        int i = -1;
        for (int i2 = 0; i2 < iDjBIcL; i2++) {
            int iDjBIcL2 = unicodeSet.djBIcL(i2);
            for (int iAYXKKw = unicodeSet.AYXKKw(i2); iAYXKKw <= iDjBIcL2; iAYXKKw++) {
                if (taskDescription.AEQbTJ(iAYXKKw)) {
                    if (i < 0) {
                        i = iAYXKKw;
                    }
                } else if (i >= 0) {
                    AEQbTJ(i, iAYXKKw - 1);
                    i = -1;
                }
            }
        }
        if (i >= 0) {
            AEQbTJ(i, 1114111);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String KWHzl(String str) {
        String strCopydefault = C7070acr.copydefault(str);
        StringBuilder sb = null;
        for (int i = 0; i < strCopydefault.length(); i++) {
            char cCharAt = strCopydefault.charAt(i);
            if (C7070acr.AEQbTJ(cCharAt)) {
                cCharAt = ' ';
                if (sb == null) {
                    sb = new StringBuilder();
                    sb.append((CharSequence) strCopydefault, 0, i);
                } else if (sb.charAt(sb.length() - 1) == ' ') {
                }
                if (sb == null) {
                    sb.append(cCharAt);
                }
            } else if (sb == null) {
            }
        }
        return sb == null ? strCopydefault : sb.toString();
    }

    public UnicodeSet OLrzqt(int i, int i2) {
        if (i == 8192) {
            AEQbTJ(new Activity(i2), C7018abS.OLrzqt(i));
        } else if (i == 28672) {
            AEQbTJ(new Application(i2), C7018abS.OLrzqt(i));
        } else if (i < 0 || i >= 65) {
            if (4096 <= i && i < 4121) {
                AEQbTJ(new StateListAnimator(i, i2), C7018abS.OLrzqt(i));
            } else {
                throw new IllegalArgumentException("unsupported property " + i);
            }
        } else if (i2 == 0 || i2 == 1) {
            djBIcL(C7221afj.copydefault(i));
            if (i2 == 0) {
                EZpvd();
            }
        } else {
            copydefault();
        }
        return this;
    }

    public UnicodeSet KWHzl(String str, String str2, InterfaceC7290agz interfaceC7290agz) {
        int iKWHzl;
        AkhnZx();
        if (interfaceC7290agz != null && (interfaceC7290agz instanceof PendingIntent) && ((PendingIntent) interfaceC7290agz).OLrzqt(str, str2, this)) {
            return this;
        }
        PendingIntent pendingIntent = copydefault;
        if (pendingIntent != null && pendingIntent.OLrzqt(str, str2, this)) {
            return this;
        }
        boolean z = false;
        int i = 4106;
        int i2 = 8192;
        if (str2.length() > 0) {
            int iEZpvd = C7223afl.EZpvd((CharSequence) str);
            if (iEZpvd == 4101) {
                iEZpvd = 8192;
            }
            if ((iEZpvd >= 0 && iEZpvd < 65) || ((iEZpvd >= 4096 && iEZpvd < 4121) || (iEZpvd >= 8192 && iEZpvd < 8193))) {
                try {
                    iKWHzl = C7223afl.KWHzl(iEZpvd, str2);
                } catch (IllegalArgumentException e) {
                    if ((iEZpvd != 4098 && iEZpvd != 4112 && iEZpvd != 4113) || (iKWHzl = Integer.parseInt(C7070acr.copydefault(str2))) < 0 || iKWHzl > 255) {
                        throw e;
                    }
                }
            } else {
                if (iEZpvd == 12288) {
                    AEQbTJ(new ActionBar(Double.parseDouble(C7070acr.copydefault(str2))), C7018abS.OLrzqt(iEZpvd));
                    return this;
                }
                if (iEZpvd == 16384) {
                    AEQbTJ(new LoaderManager(C7258agT.OLrzqt(KWHzl(str2))), C7018abS.OLrzqt(iEZpvd));
                    return this;
                }
                if (iEZpvd == 16389) {
                    int iEZpvd2 = C7223afl.EZpvd(KWHzl(str2));
                    if (iEZpvd2 == -1) {
                        throw new IllegalArgumentException("Invalid character name");
                    }
                    copydefault();
                    EZpvd(iEZpvd2);
                    return this;
                }
                if (iEZpvd == 16395) {
                    throw new IllegalArgumentException("Unicode_1_Name (na1) not supported");
                }
                if (iEZpvd == 28672) {
                    iKWHzl = C7223afl.KWHzl(4106, str2);
                } else {
                    throw new IllegalArgumentException("Unsupported property");
                }
            }
            i2 = iEZpvd;
        } else {
            C7041acO c7041acO = C7041acO.EZpvd;
            int iCopydefault = c7041acO.copydefault(8192, str);
            if (iCopydefault == -1) {
                iCopydefault = c7041acO.copydefault(4106, str);
                if (iCopydefault == -1) {
                    int iAEQbTJ = c7041acO.AEQbTJ(str);
                    if (iAEQbTJ == -1) {
                        iAEQbTJ = -1;
                    }
                    if (iAEQbTJ >= 0 && iAEQbTJ < 65) {
                        i2 = iAEQbTJ;
                        iKWHzl = 1;
                    } else if (iAEQbTJ == -1) {
                        if (C7041acO.EZpvd("ANY", str) == 0) {
                            AYXKKw(0, 1114111);
                            return this;
                        }
                        if (C7041acO.EZpvd("ASCII", str) == 0) {
                            AYXKKw(0, 127);
                            return this;
                        }
                        if (C7041acO.EZpvd("Assigned", str) != 0) {
                            throw new IllegalArgumentException("Invalid property alias: " + str + ContainerUtils.KEY_VALUE_DELIMITER + str2);
                        }
                        iKWHzl = 1;
                        z = true;
                    } else {
                        throw new IllegalArgumentException("Missing property value");
                    }
                }
            } else {
                i = 8192;
            }
            iKWHzl = iCopydefault;
            i2 = i;
        }
        OLrzqt(i2, iKWHzl);
        if (z) {
            EZpvd();
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean EZpvd(C7075acw c7075acw, int i) {
        boolean z;
        Object objKWHzl = c7075acw.KWHzl((Object) null);
        int iKWHzl = c7075acw.KWHzl(i & (-3));
        if (iKWHzl == 91 || iKWHzl == 92) {
            int iKWHzl2 = c7075acw.KWHzl(i & (-7));
            z = iKWHzl != 91 ? iKWHzl2 == 78 || iKWHzl2 == 112 || iKWHzl2 == 80 : iKWHzl2 == 58;
        }
        c7075acw.copydefault(objKWHzl);
        return z;
    }

    public final UnicodeSet AEQbTJ(String str, ParsePosition parsePosition, InterfaceC7290agz interfaceC7290agz) {
        boolean z;
        int iKWHzl;
        boolean z2;
        String strSubstring;
        String strSubstring2;
        int index = parsePosition.getIndex();
        if (index + 5 > str.length()) {
            return null;
        }
        boolean z3 = false;
        if (str.regionMatches(index, "[:", 0, 2)) {
            iKWHzl = C7070acr.KWHzl(str, index + 2);
            if (iKWHzl >= str.length() || str.charAt(iKWHzl) != '^') {
                z = false;
                z2 = false;
                z3 = true;
            } else {
                iKWHzl++;
                z = false;
                z2 = true;
                z3 = true;
            }
        } else {
            if (!str.regionMatches(true, index, "\\p", 0, 2) && !str.regionMatches(index, "\\N", 0, 2)) {
                return null;
            }
            char cCharAt = str.charAt(index + 1);
            boolean z4 = cCharAt == 'P';
            boolean z5 = cCharAt == 'N';
            int iKWHzl2 = C7070acr.KWHzl(str, index + 2);
            if (iKWHzl2 == str.length() || str.charAt(iKWHzl2) != '{') {
                return null;
            }
            boolean z6 = z4;
            z = z5;
            iKWHzl = iKWHzl2 + 1;
            z2 = z6;
        }
        int iIndexOf = str.indexOf(z3 ? ":]" : "}", iKWHzl);
        if (iIndexOf < 0) {
            return null;
        }
        int iIndexOf2 = str.indexOf(61, iKWHzl);
        if (iIndexOf2 >= 0 && iIndexOf2 < iIndexOf && !z) {
            strSubstring = str.substring(iKWHzl, iIndexOf2);
            strSubstring2 = str.substring(iIndexOf2 + 1, iIndexOf);
        } else {
            strSubstring = str.substring(iKWHzl, iIndexOf);
            if (z) {
                strSubstring = "na";
                strSubstring2 = strSubstring;
            } else {
                strSubstring2 = "";
            }
        }
        KWHzl(strSubstring, strSubstring2, interfaceC7290agz);
        if (z2) {
            EZpvd();
        }
        parsePosition.setIndex(iIndexOf + (z3 ? 2 : 1));
        return this;
    }

    public final void EZpvd(C7075acw c7075acw, Appendable appendable, InterfaceC7290agz interfaceC7290agz) {
        String strCopydefault = c7075acw.copydefault();
        ParsePosition parsePosition = new ParsePosition(0);
        AEQbTJ(strCopydefault, parsePosition, interfaceC7290agz);
        if (parsePosition.getIndex() == 0) {
            copydefault(c7075acw, "Invalid property pattern");
        }
        c7075acw.EZpvd(parsePosition.getIndex());
        KWHzl(appendable, strCopydefault.substring(0, parsePosition.getIndex()));
    }

    public static final void OLrzqt(UnicodeSet unicodeSet, int i, StringBuilder sb) {
        if (i >= 0) {
            if (i > 31) {
                unicodeSet.KWHzl(i);
            } else {
                unicodeSet.AEQbTJ(sb.toString());
                sb.setLength(0);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public UnicodeSet OLrzqt(int i) {
        AkhnZx();
        if ((i & 6) != 0) {
            C7034acH c7034acH = C7034acH.OLrzqt;
            UnicodeSet unicodeSet = new UnicodeSet(this);
            ULocale uLocale = ULocale.ROOT;
            int i2 = i & 2;
            if (i2 != 0 && unicodeSet.AhwBna()) {
                unicodeSet.values.clear();
            }
            int iDjBIcL = djBIcL();
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < iDjBIcL; i3++) {
                int iAYXKKw = AYXKKw(i3);
                int iDjBIcL2 = djBIcL(i3);
                if (i2 != 0) {
                    while (iAYXKKw <= iDjBIcL2) {
                        c7034acH.KWHzl(iAYXKKw, unicodeSet);
                        iAYXKKw++;
                    }
                } else {
                    while (iAYXKKw <= iDjBIcL2) {
                        OLrzqt(unicodeSet, c7034acH.KWHzl(iAYXKKw, null, sb, 1), sb);
                        OLrzqt(unicodeSet, c7034acH.OLrzqt(iAYXKKw, null, sb, 1), sb);
                        OLrzqt(unicodeSet, c7034acH.copydefault(iAYXKKw, null, sb, 1), sb);
                        OLrzqt(unicodeSet, c7034acH.copydefault(iAYXKKw, sb, 0), sb);
                        iAYXKKw++;
                    }
                }
            }
            if (AhwBna()) {
                if (i2 != 0) {
                    Iterator<String> it = this.values.iterator();
                    while (it.hasNext()) {
                        String strKWHzl = C7223afl.KWHzl(it.next(), 0);
                        if (!c7034acH.OLrzqt(strKWHzl, unicodeSet)) {
                            unicodeSet.AEQbTJ(strKWHzl);
                        }
                    }
                } else {
                    AbstractC7192afG abstractC7192afGKWHzl = AbstractC7192afG.KWHzl(uLocale);
                    for (String str : this.values) {
                        unicodeSet.AEQbTJ(C7223afl.EZpvd(uLocale, str));
                        unicodeSet.AEQbTJ(C7223afl.OLrzqt(uLocale, str, abstractC7192afGKWHzl));
                        unicodeSet.AEQbTJ(C7223afl.AEQbTJ(uLocale, str));
                        unicodeSet.AEQbTJ(C7223afl.KWHzl(str, 0));
                    }
                }
            }
            djBIcL(unicodeSet);
        }
        return this;
    }

    public UnicodeSet AYXKKw() {
        if (!gEmmrt()) {
            KWHzl();
            if (AhwBna()) {
                this.isConnected = new C7042acP(this, new ArrayList(this.values), 127);
            }
            if (this.isConnected == null || !this.isConnected.OLrzqt()) {
                this.djBIcL = new C7010abK(this.AYXKKw, this.gEmmrt);
            }
        }
        return this;
    }

    public int OLrzqt(CharSequence charSequence, SpanCondition spanCondition) {
        return AEQbTJ(charSequence, 0, spanCondition);
    }

    public int AEQbTJ(CharSequence charSequence, int i, SpanCondition spanCondition) {
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        } else if (i >= length) {
            return length;
        }
        if (this.djBIcL != null) {
            return this.djBIcL.OLrzqt(charSequence, i, spanCondition, null);
        }
        if (this.isConnected != null) {
            return this.isConnected.OLrzqt(charSequence, i, spanCondition);
        }
        if (AhwBna()) {
            C7042acP c7042acP = new C7042acP(this, new ArrayList(this.values), spanCondition == SpanCondition.NOT_CONTAINED ? 33 : 34);
            if (c7042acP.OLrzqt()) {
                return c7042acP.OLrzqt(charSequence, i, spanCondition);
            }
        }
        return EZpvd(charSequence, i, spanCondition, null);
    }

    @Deprecated
    public int copydefault(CharSequence charSequence, int i, SpanCondition spanCondition, C7253agO c7253agO) {
        if (c7253agO == null) {
            throw new IllegalArgumentException("outCount must not be null");
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        } else if (i >= length) {
            return length;
        }
        if (this.isConnected != null) {
            return this.isConnected.AEQbTJ(charSequence, i, spanCondition, c7253agO);
        }
        if (this.djBIcL != null) {
            return this.djBIcL.OLrzqt(charSequence, i, spanCondition, c7253agO);
        }
        if (AhwBna()) {
            return new C7042acP(this, new ArrayList(this.values), (spanCondition == SpanCondition.NOT_CONTAINED ? 33 : 34) | 64).AEQbTJ(charSequence, i, spanCondition, c7253agO);
        }
        return EZpvd(charSequence, i, spanCondition, c7253agO);
    }

    public final int EZpvd(CharSequence charSequence, int i, SpanCondition spanCondition, C7253agO c7253agO) {
        int i2 = 0;
        boolean z = spanCondition != SpanCondition.NOT_CONTAINED;
        int length = charSequence.length();
        do {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (z != AEQbTJ(iCodePointAt)) {
                break;
            }
            i2++;
            i += Character.charCount(iCodePointAt);
        } while (i < length);
        if (c7253agO != null) {
            c7253agO.OLrzqt = i2;
        }
        return i;
    }

    public int copydefault(CharSequence charSequence, int i, SpanCondition spanCondition) {
        if (i <= 0) {
            return 0;
        }
        if (i > charSequence.length()) {
            i = charSequence.length();
        }
        if (this.djBIcL != null) {
            return this.djBIcL.AEQbTJ(charSequence, i, spanCondition);
        }
        if (this.isConnected != null) {
            return this.isConnected.copydefault(charSequence, i, spanCondition);
        }
        if (AhwBna()) {
            C7042acP c7042acP = new C7042acP(this, new ArrayList(this.values), spanCondition == SpanCondition.NOT_CONTAINED ? 17 : 18);
            if (c7042acP.OLrzqt()) {
                return c7042acP.copydefault(charSequence, i, spanCondition);
            }
        }
        boolean z = spanCondition != SpanCondition.NOT_CONTAINED;
        do {
            int iCodePointBefore = Character.codePointBefore(charSequence, i);
            if (z != AEQbTJ(iCodePointBefore)) {
                break;
            }
            i -= Character.charCount(iCodePointBefore);
        } while (i > 0);
        return i;
    }

    public UnicodeSet OLrzqt() {
        return new UnicodeSet(this);
    }

    private void AkhnZx() {
        if (gEmmrt()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return new Fragment(this);
    }

    public static class Fragment implements Iterator<String> {
        public int AEQbTJ;
        public int[] AYXKKw;
        public int EZpvd;
        public char[] KWHzl;
        public int OLrzqt;
        public int copydefault;
        public SortedSet<String> djBIcL;
        public Iterator<String> valueOf;

        public Fragment(UnicodeSet unicodeSet) {
            int i = unicodeSet.gEmmrt - 1;
            this.AEQbTJ = i;
            if (i > 0) {
                this.djBIcL = unicodeSet.values;
                int[] iArr = unicodeSet.AYXKKw;
                this.AYXKKw = iArr;
                int i2 = this.copydefault;
                this.OLrzqt = iArr[i2];
                this.copydefault = i2 + 2;
                this.EZpvd = iArr[i2 + 1];
                return;
            }
            this.valueOf = unicodeSet.values.iterator();
            this.AYXKKw = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.AYXKKw != null || this.valueOf.hasNext();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public String next() {
            int[] iArr = this.AYXKKw;
            if (iArr == null) {
                return this.valueOf.next();
            }
            int i = this.OLrzqt;
            int i2 = i + 1;
            this.OLrzqt = i2;
            if (i2 >= this.EZpvd) {
                int i3 = this.copydefault;
                if (i3 >= this.AEQbTJ) {
                    this.valueOf = this.djBIcL.iterator();
                    this.AYXKKw = null;
                } else {
                    this.OLrzqt = iArr[i3];
                    this.copydefault = i3 + 2;
                    this.EZpvd = iArr[i3 + 1];
                }
            }
            if (i <= 65535) {
                return String.valueOf((char) i);
            }
            if (this.KWHzl == null) {
                this.KWHzl = new char[2];
            }
            int i4 = i - 65536;
            char[] cArr = this.KWHzl;
            cArr[0] = (char) ((i4 >>> 10) + 55296);
            cArr[1] = (char) ((i4 & 1023) + Utf8.LOG_SURROGATE_HEADER);
            return String.valueOf(cArr);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public int compareTo(UnicodeSet unicodeSet) {
        return OLrzqt(unicodeSet, ComparisonStyle.SHORTER_FIRST);
    }

    public int OLrzqt(UnicodeSet unicodeSet, ComparisonStyle comparisonStyle) {
        int iAEQbTJ;
        int iValueOf;
        if (comparisonStyle != ComparisonStyle.LEXICOGRAPHIC && (iValueOf = valueOf() - unicodeSet.valueOf()) != 0) {
            return (iValueOf < 0) == (comparisonStyle == ComparisonStyle.SHORTER_FIRST) ? -1 : 1;
        }
        int i = 0;
        while (true) {
            int i2 = this.AYXKKw[i];
            int i3 = unicodeSet.AYXKKw[i];
            int i4 = i2 - i3;
            if (i4 != 0) {
                if (i2 == 1114112) {
                    if (AhwBna()) {
                        return AEQbTJ(this.values.first(), unicodeSet.AYXKKw[i]);
                    }
                    return 1;
                }
                if (i3 != 1114112) {
                    return (i & 1) == 0 ? i4 : -i4;
                }
                if (unicodeSet.AhwBna() && (iAEQbTJ = AEQbTJ(unicodeSet.values.first(), this.AYXKKw[i])) <= 0) {
                    return iAEQbTJ < 0 ? 1 : 0;
                }
                return -1;
            }
            if (i2 == 1114112) {
                return OLrzqt(this.values, unicodeSet.values);
            }
            i++;
        }
    }

    public static int AEQbTJ(CharSequence charSequence, int i) {
        return C7219afh.KWHzl(charSequence, i);
    }

    public static <T extends Comparable<T>> int OLrzqt(Iterable<T> iterable, Iterable<T> iterable2) {
        return EZpvd(iterable.iterator(), iterable2.iterator());
    }

    @Deprecated
    public static <T extends Comparable<T>> int EZpvd(Iterator<T> it, Iterator<T> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompareTo = it.next().compareTo(it2.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}

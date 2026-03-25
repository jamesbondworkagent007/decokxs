package com.ibm.icu.text;

import androidx.camera.video.AudioStats;
import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import java.util.ArrayList;
import java.util.Locale;
import o.C7053aca;
import o.C7070acr;
import o.InterfaceC7248agJ;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagePattern implements Cloneable, InterfaceC7248agJ<MessagePattern> {
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public ArrayList<Double> AhwBna;
    public volatile boolean KWHzl;
    public ApostropheMode copydefault;
    public ArrayList<Part> djBIcL;
    public boolean gEmmrt;
    public String valueOf;
    public static final ApostropheMode OLrzqt = ApostropheMode.valueOf(C7053aca.AEQbTJ("com.ibm.icu.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL"));
    public static final ArgType[] EZpvd = ArgType.values();

    public enum ApostropheMode {
        DOUBLE_OPTIONAL,
        DOUBLE_REQUIRED
    }

    public enum ArgType {
        NONE,
        SIMPLE,
        CHOICE,
        PLURAL,
        SELECT,
        SELECTORDINAL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean hasPluralStyle() {
            return this == PLURAL || this == SELECTORDINAL;
        }
    }

    public static boolean OLrzqt(int i) {
        return (97 <= i && i <= 122) || (65 <= i && i <= 90);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApostropheMode AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.KWHzl;
    }

    public final void AhwBna() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return this.valueOf;
    }

    public MessagePattern() {
        this.djBIcL = new ArrayList<>();
        this.copydefault = OLrzqt;
    }

    public MessagePattern(ApostropheMode apostropheMode) {
        this.djBIcL = new ArrayList<>();
        this.copydefault = apostropheMode;
    }

    public MessagePattern(String str) {
        this.djBIcL = new ArrayList<>();
        this.copydefault = OLrzqt;
        AEQbTJ(str);
    }

    public MessagePattern AEQbTJ(String str) {
        AYXKKw(str);
        AEQbTJ(0, 0, 0, ArgType.NONE);
        AhwBna();
        return this;
    }

    public MessagePattern OLrzqt(String str) {
        AYXKKw(str);
        AEQbTJ(ArgType.PLURAL, 0, 0);
        AhwBna();
        return this;
    }

    public MessagePattern EZpvd(String str) {
        AYXKKw(str);
        AEQbTJ(ArgType.SELECT, 0, 0);
        AhwBna();
        return this;
    }

    public void EZpvd() {
        if (AYXKKw()) {
            throw new UnsupportedOperationException("Attempt to clear() a frozen MessagePattern instance.");
        }
        this.valueOf = null;
        this.gEmmrt = false;
        this.AEQbTJ = false;
        this.AYXKKw = false;
        this.djBIcL.clear();
        ArrayList<Double> arrayList = this.AhwBna;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void copydefault(ApostropheMode apostropheMode) {
        EZpvd();
        this.copydefault = apostropheMode;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || MessagePattern.class != obj.getClass()) {
            return false;
        }
        MessagePattern messagePattern = (MessagePattern) obj;
        return this.copydefault.equals(messagePattern.copydefault) && ((str = this.valueOf) != null ? str.equals(messagePattern.valueOf) : messagePattern.valueOf == null) && this.djBIcL.equals(messagePattern.djBIcL);
    }

    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        String str = this.valueOf;
        return (((iHashCode * 37) + (str != null ? str.hashCode() : 0)) * 37) + this.djBIcL.hashCode();
    }

    public boolean valueOf() {
        return this.copydefault == ApostropheMode.DOUBLE_REQUIRED;
    }

    public static int copydefault(String str) {
        if (C7070acr.KWHzl(str)) {
            return KWHzl(str, 0, str.length());
        }
        return -2;
    }

    public int OLrzqt() {
        return this.djBIcL.size();
    }

    public Part EZpvd(int i) {
        return this.djBIcL.get(i);
    }

    public Part.Type AEQbTJ(int i) {
        return this.djBIcL.get(i).copydefault;
    }

    public int copydefault(int i) {
        return this.djBIcL.get(i).EZpvd;
    }

    public String copydefault(Part part) {
        int i = part.EZpvd;
        return this.valueOf.substring(i, part.KWHzl + i);
    }

    public boolean copydefault(Part part, String str) {
        return part.KWHzl == str.length() && this.valueOf.regionMatches(part.EZpvd, str, 0, part.KWHzl);
    }

    public double KWHzl(Part part) {
        Part.Type type = part.copydefault;
        if (type != Part.Type.ARG_INT) {
            if (type == Part.Type.ARG_DOUBLE) {
                return this.AhwBna.get(part.OLrzqt).doubleValue();
            }
            return -1.23456789E8d;
        }
        return part.OLrzqt;
    }

    public double AhwBna(int i) {
        Part part = this.djBIcL.get(i);
        return part.copydefault.hasNumericValue() ? KWHzl(part) : AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public int KWHzl(int i) {
        int i2 = this.djBIcL.get(i).AEQbTJ;
        return i2 < i ? i : i2;
    }

    public static final class Part {
        public int AEQbTJ;
        public final int EZpvd;
        public final char KWHzl;
        public short OLrzqt;
        public final Type copydefault;

        public enum Type {
            MSG_START,
            MSG_LIMIT,
            SKIP_SYNTAX,
            INSERT_CHAR,
            REPLACE_NUMBER,
            ARG_START,
            ARG_LIMIT,
            ARG_NUMBER,
            ARG_NAME,
            ARG_TYPE,
            ARG_STYLE,
            ARG_SELECTOR,
            ARG_INT,
            ARG_DOUBLE;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean hasNumericValue() {
                return this == ARG_INT || this == ARG_DOUBLE;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.EZpvd + this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Type copydefault() {
            return this.copydefault;
        }

        public Part(Type type, int i, int i2, int i3) {
            this.copydefault = type;
            this.EZpvd = i;
            this.KWHzl = (char) i2;
            this.OLrzqt = (short) i3;
        }

        public ArgType AEQbTJ() {
            Type typeCopydefault = copydefault();
            if (typeCopydefault == Type.ARG_START || typeCopydefault == Type.ARG_LIMIT) {
                return MessagePattern.EZpvd[this.OLrzqt];
            }
            return ArgType.NONE;
        }

        public String toString() {
            Type type = this.copydefault;
            return this.copydefault.name() + "(" + ((type == Type.ARG_START || type == Type.ARG_LIMIT) ? AEQbTJ().name() : Integer.toString(this.OLrzqt)) + ")@" + this.EZpvd;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Part.class != obj.getClass()) {
                return false;
            }
            Part part = (Part) obj;
            return this.copydefault.equals(part.copydefault) && this.EZpvd == part.EZpvd && this.KWHzl == part.KWHzl && this.OLrzqt == part.OLrzqt && this.AEQbTJ == part.AEQbTJ;
        }

        public int hashCode() {
            return (((((this.copydefault.hashCode() * 37) + this.EZpvd) * 37) + this.KWHzl) * 37) + this.OLrzqt;
        }
    }

    public Object clone() {
        return AYXKKw() ? this : copydefault();
    }

    public MessagePattern copydefault() {
        try {
            MessagePattern messagePattern = (MessagePattern) super.clone();
            messagePattern.djBIcL = (ArrayList) this.djBIcL.clone();
            ArrayList<Double> arrayList = this.AhwBna;
            if (arrayList != null) {
                messagePattern.AhwBna = (ArrayList) arrayList.clone();
            }
            messagePattern.KWHzl = false;
            return messagePattern;
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    public final void AYXKKw(String str) {
        if (AYXKKw()) {
            throw new UnsupportedOperationException("Attempt to parse(" + KWHzl(str) + ") on frozen MessagePattern instance.");
        }
        this.valueOf = str;
        this.gEmmrt = false;
        this.AEQbTJ = false;
        this.AYXKKw = false;
        this.djBIcL.clear();
        ArrayList<Double> arrayList = this.AhwBna;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final int AEQbTJ(int i, int i2, int i3, ArgType argType) {
        int iIndexOf;
        if (i3 > 32767) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.djBIcL.size();
        AEQbTJ(Part.Type.MSG_START, i, i2, i3);
        int length = i + i2;
        while (length < this.valueOf.length()) {
            int i4 = length + 1;
            char cCharAt = this.valueOf.charAt(length);
            if (cCharAt == '\'') {
                if (i4 == this.valueOf.length()) {
                    AEQbTJ(Part.Type.INSERT_CHAR, i4, 0, 39);
                    this.AYXKKw = true;
                } else {
                    char cCharAt2 = this.valueOf.charAt(i4);
                    if (cCharAt2 == '\'') {
                        length += 2;
                        AEQbTJ(Part.Type.SKIP_SYNTAX, i4, 1, 0);
                    } else if (this.copydefault == ApostropheMode.DOUBLE_REQUIRED || cCharAt2 == '{' || cCharAt2 == '}' || ((argType == ArgType.CHOICE && cCharAt2 == '|') || (argType.hasPluralStyle() && cCharAt2 == '#'))) {
                        AEQbTJ(Part.Type.SKIP_SYNTAX, length, 1, 0);
                        while (true) {
                            iIndexOf = this.valueOf.indexOf(39, i4 + 1);
                            if (iIndexOf >= 0) {
                                i4 = iIndexOf + 1;
                                if (i4 >= this.valueOf.length() || this.valueOf.charAt(i4) != '\'') {
                                    break;
                                }
                                AEQbTJ(Part.Type.SKIP_SYNTAX, i4, 1, 0);
                            } else {
                                length = this.valueOf.length();
                                AEQbTJ(Part.Type.INSERT_CHAR, length, 0, 39);
                                this.AYXKKw = true;
                                break;
                            }
                        }
                        AEQbTJ(Part.Type.SKIP_SYNTAX, iIndexOf, 1, 0);
                    } else {
                        AEQbTJ(Part.Type.INSERT_CHAR, i4, 0, 39);
                        this.AYXKKw = true;
                    }
                }
                length = i4;
            } else {
                if (argType.hasPluralStyle() && cCharAt == '#') {
                    AEQbTJ(Part.Type.REPLACE_NUMBER, length, 1, 0);
                } else if (cCharAt == '{') {
                    length = AEQbTJ(length, 1, i3);
                } else if ((i3 > 0 && cCharAt == '}') || (argType == ArgType.CHOICE && cCharAt == '|')) {
                    ArgType argType2 = ArgType.CHOICE;
                    copydefault(size, Part.Type.MSG_LIMIT, length, (argType == argType2 && cCharAt == '}') ? 0 : 1, i3);
                    return argType == argType2 ? length : i4;
                }
                length = i4;
            }
        }
        if (i3 > 0 && !AEQbTJ(i3, argType)) {
            throw new IllegalArgumentException("Unmatched '{' braces in message " + values());
        }
        copydefault(size, Part.Type.MSG_LIMIT, length, 0, i3);
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(int i, int i2, int i3) {
        char cCharAt;
        ArgType argType;
        int iAEQbTJ;
        int size = this.djBIcL.size();
        ArgType argType2 = ArgType.NONE;
        AEQbTJ(Part.Type.ARG_START, i, i2, argType2.ordinal());
        int iFARcdN = fARcdN(i + i2);
        if (iFARcdN == this.valueOf.length()) {
            throw new IllegalArgumentException("Unmatched '{' braces in message " + values());
        }
        int iDbNXlk = DbNXlk(iFARcdN);
        int iEZpvd = EZpvd(iFARcdN, iDbNXlk);
        if (iEZpvd >= 0) {
            int i4 = iDbNXlk - iFARcdN;
            if (i4 > 65535 || iEZpvd > 32767) {
                throw new IndexOutOfBoundsException("Argument number too large: " + AkhnZx(iFARcdN));
            }
            this.gEmmrt = true;
            AEQbTJ(Part.Type.ARG_NUMBER, iFARcdN, i4, iEZpvd);
        } else {
            if (iEZpvd != -1) {
                throw new IllegalArgumentException("Bad argument syntax: " + AkhnZx(iFARcdN));
            }
            int i5 = iDbNXlk - iFARcdN;
            if (i5 > 65535) {
                throw new IndexOutOfBoundsException("Argument name too long: " + AkhnZx(iFARcdN));
            }
            this.AEQbTJ = true;
            AEQbTJ(Part.Type.ARG_NAME, iFARcdN, i5, 0);
        }
        int iFARcdN2 = fARcdN(iDbNXlk);
        if (iFARcdN2 == this.valueOf.length()) {
            throw new IllegalArgumentException("Unmatched '{' braces in message " + values());
        }
        char cCharAt2 = this.valueOf.charAt(iFARcdN2);
        if (cCharAt2 != '}') {
            if (cCharAt2 != ',') {
                throw new IllegalArgumentException("Bad argument syntax: " + AkhnZx(iFARcdN));
            }
            int iFARcdN3 = fARcdN(iFARcdN2 + 1);
            int i6 = iFARcdN3;
            while (i6 < this.valueOf.length() && OLrzqt(this.valueOf.charAt(i6))) {
                i6++;
            }
            int i7 = i6 - iFARcdN3;
            int iFARcdN4 = fARcdN(i6);
            if (iFARcdN4 == this.valueOf.length()) {
                throw new IllegalArgumentException("Unmatched '{' braces in message " + values());
            }
            if (i7 == 0 || !((cCharAt = this.valueOf.charAt(iFARcdN4)) == ',' || cCharAt == '}')) {
                throw new IllegalArgumentException("Bad argument syntax: " + AkhnZx(iFARcdN));
            }
            if (i7 > 65535) {
                throw new IndexOutOfBoundsException("Argument type name too long: " + AkhnZx(iFARcdN));
            }
            ArgType argType3 = ArgType.SIMPLE;
            if (i7 == 6) {
                if (djBIcL(iFARcdN3)) {
                    argType = ArgType.CHOICE;
                } else if (valueOf(iFARcdN3)) {
                    argType = ArgType.PLURAL;
                } else {
                    argType = isConnected(iFARcdN3) ? ArgType.SELECT : argType3;
                }
                this.djBIcL.get(size).OLrzqt = (short) argType.ordinal();
                if (argType == argType3) {
                    AEQbTJ(Part.Type.ARG_TYPE, iFARcdN3, i7, 0);
                }
                if (cCharAt == '}') {
                    int i8 = iFARcdN4 + 1;
                    if (argType == argType3) {
                        iAEQbTJ = values(i8);
                    } else if (argType == ArgType.CHOICE) {
                        iAEQbTJ = KWHzl(i8, i3);
                    } else {
                        iAEQbTJ = AEQbTJ(argType, i8, i3);
                    }
                    iFARcdN2 = iAEQbTJ;
                } else {
                    if (argType != argType3) {
                        throw new IllegalArgumentException("No style field for complex argument: " + AkhnZx(iFARcdN));
                    }
                    iFARcdN2 = iFARcdN4;
                }
                argType2 = argType;
            } else {
                if (i7 == 13 && isConnected(iFARcdN3) && gEmmrt(iFARcdN3 + 6)) {
                    argType = ArgType.SELECTORDINAL;
                }
                this.djBIcL.get(size).OLrzqt = (short) argType.ordinal();
                if (argType == argType3) {
                }
                if (cCharAt == '}') {
                }
                argType2 = argType;
            }
        }
        copydefault(size, Part.Type.ARG_LIMIT, iFARcdN2, 1, argType2.ordinal());
        return iFARcdN2 + 1;
    }

    public final int values(int i) {
        int i2 = i;
        int i3 = 0;
        while (i2 < this.valueOf.length()) {
            int i4 = i2 + 1;
            char cCharAt = this.valueOf.charAt(i2);
            if (cCharAt == '\'') {
                int iIndexOf = this.valueOf.indexOf(39, i4);
                if (iIndexOf < 0) {
                    throw new IllegalArgumentException("Quoted literal argument style text reaches to the end of the message: " + AkhnZx(i));
                }
                i2 = iIndexOf + 1;
            } else {
                if (cCharAt == '{') {
                    i3++;
                } else if (cCharAt == '}') {
                    if (i3 <= 0) {
                        int i5 = i2 - i;
                        if (i5 > 65535) {
                            throw new IndexOutOfBoundsException("Argument style text too long: " + AkhnZx(i));
                        }
                        AEQbTJ(Part.Type.ARG_STYLE, i, i5, 0);
                        return i2;
                    }
                    i3--;
                }
                i2 = i4;
            }
        }
        throw new IllegalArgumentException("Unmatched '{' braces in message " + values());
    }

    public final int KWHzl(int i, int i2) {
        int iFARcdN = fARcdN(i);
        if (iFARcdN == this.valueOf.length() || this.valueOf.charAt(iFARcdN) == '}') {
            throw new IllegalArgumentException("Missing choice argument pattern in " + values());
        }
        while (true) {
            int iFetchVPNInfo = fetchVPNInfo(iFARcdN);
            int i3 = iFetchVPNInfo - iFARcdN;
            if (i3 == 0) {
                throw new IllegalArgumentException("Bad choice pattern syntax: " + AkhnZx(i));
            }
            if (i3 > 65535) {
                throw new IndexOutOfBoundsException("Choice number too long: " + AkhnZx(iFARcdN));
            }
            KWHzl(iFARcdN, iFetchVPNInfo, true);
            int iFARcdN2 = fARcdN(iFetchVPNInfo);
            if (iFARcdN2 == this.valueOf.length()) {
                throw new IllegalArgumentException("Bad choice pattern syntax: " + AkhnZx(i));
            }
            char cCharAt = this.valueOf.charAt(iFARcdN2);
            if (cCharAt != '#' && cCharAt != '<' && cCharAt != 8804) {
                throw new IllegalArgumentException("Expected choice separator (#<≤) instead of '" + cCharAt + "' in choice pattern " + AkhnZx(i));
            }
            AEQbTJ(Part.Type.ARG_SELECTOR, iFARcdN2, 1, 0);
            int iAEQbTJ = AEQbTJ(iFARcdN2 + 1, 0, i2 + 1, ArgType.CHOICE);
            if (iAEQbTJ == this.valueOf.length()) {
                return iAEQbTJ;
            }
            if (this.valueOf.charAt(iAEQbTJ) == '}') {
                if (AYXKKw(i2)) {
                    return iAEQbTJ;
                }
                throw new IllegalArgumentException("Bad choice pattern syntax: " + AkhnZx(i));
            }
            iFARcdN = fARcdN(iAEQbTJ + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c4, code lost:
    
        if (r5 == AYXKKw(r15)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c6, code lost:
    
        if (r3 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f5, code lost:
    
        throw new java.lang.IllegalArgumentException("Missing 'other' keyword in " + r13.toString().toLowerCase(java.util.Locale.ENGLISH) + " pattern in " + values());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021e, code lost:
    
        throw new java.lang.IllegalArgumentException("Bad " + r13.toString().toLowerCase(java.util.Locale.ENGLISH) + " pattern syntax: " + AkhnZx(r14));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(ArgType argType, int i, int i2) {
        int iFARcdN;
        int iDbNXlk;
        int iAEQbTJ = i;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            iFARcdN = fARcdN(iAEQbTJ);
            boolean z3 = iFARcdN == this.valueOf.length();
            if (z3 || this.valueOf.charAt(iFARcdN) == '}') {
                break;
            }
            if (argType.hasPluralStyle() && this.valueOf.charAt(iFARcdN) == '=') {
                int i3 = iFARcdN + 1;
                iDbNXlk = fetchVPNInfo(i3);
                int i4 = iDbNXlk - iFARcdN;
                if (i4 == 1) {
                    throw new IllegalArgumentException("Bad " + argType.toString().toLowerCase(Locale.ENGLISH) + " pattern syntax: " + AkhnZx(i));
                }
                if (i4 > 65535) {
                    throw new IndexOutOfBoundsException("Argument selector too long: " + AkhnZx(iFARcdN));
                }
                AEQbTJ(Part.Type.ARG_SELECTOR, iFARcdN, i4, 0);
                KWHzl(i3, iDbNXlk, false);
            } else {
                iDbNXlk = DbNXlk(iFARcdN);
                int i5 = iDbNXlk - iFARcdN;
                if (i5 == 0) {
                    throw new IllegalArgumentException("Bad " + argType.toString().toLowerCase(Locale.ENGLISH) + " pattern syntax: " + AkhnZx(i));
                }
                if (argType.hasPluralStyle() && i5 == 6 && iDbNXlk < this.valueOf.length() && this.valueOf.regionMatches(iFARcdN, "offset:", 0, 7)) {
                    if (!z) {
                        throw new IllegalArgumentException("Plural argument 'offset:' (if present) must precede key-message pairs: " + AkhnZx(i));
                    }
                    int iFARcdN2 = fARcdN(iDbNXlk + 1);
                    int iFetchVPNInfo = fetchVPNInfo(iFARcdN2);
                    if (iFetchVPNInfo == iFARcdN2) {
                        throw new IllegalArgumentException("Missing value for plural 'offset:' " + AkhnZx(i));
                    }
                    if (iFetchVPNInfo - iFARcdN2 > 65535) {
                        throw new IndexOutOfBoundsException("Plural offset value too long: " + AkhnZx(iFARcdN2));
                    }
                    KWHzl(iFARcdN2, iFetchVPNInfo, false);
                    iAEQbTJ = iFetchVPNInfo;
                    z = false;
                } else {
                    if (i5 > 65535) {
                        throw new IndexOutOfBoundsException("Argument selector too long: " + AkhnZx(iFARcdN));
                    }
                    AEQbTJ(Part.Type.ARG_SELECTOR, iFARcdN, i5, 0);
                    if (this.valueOf.regionMatches(iFARcdN, "other", 0, i5)) {
                        z2 = true;
                    }
                }
            }
            int iFARcdN3 = fARcdN(iDbNXlk);
            if (iFARcdN3 == this.valueOf.length() || this.valueOf.charAt(iFARcdN3) != '{') {
                break;
            }
            iAEQbTJ = AEQbTJ(iFARcdN3, 1, i2 + 1, argType);
            z = false;
        }
        throw new IllegalArgumentException("No message fragment after " + argType.toString().toLowerCase(Locale.ENGLISH) + " selector: " + AkhnZx(iFARcdN));
    }

    public static int KWHzl(CharSequence charSequence, int i, int i2) {
        int i3;
        if (i >= i2) {
            return -2;
        }
        int i4 = i + 1;
        char cCharAt = charSequence.charAt(i);
        boolean z = false;
        if (cCharAt == '0') {
            if (i4 == i2) {
                return 0;
            }
            i3 = 0;
            z = true;
        } else {
            if ('1' > cCharAt || cCharAt > '9') {
                return -1;
            }
            i3 = cCharAt - '0';
        }
        while (i4 < i2) {
            char cCharAt2 = charSequence.charAt(i4);
            if ('0' > cCharAt2 || cCharAt2 > '9') {
                return -1;
            }
            if (i3 >= 214748364) {
                z = true;
            }
            i3 = (i3 * 10) + (cCharAt2 - '0');
            i4++;
        }
        if (z) {
            return -2;
        }
        return i3;
    }

    public final int EZpvd(int i, int i2) {
        return KWHzl(this.valueOf, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[LOOP:0: B:22:0x0059->B:35:0x0077, LOOP_START, PHI: r0 r1 r3
  0x0059: PHI (r0v8 char) = (r0v7 char), (r0v11 char) binds: [B:12:0x002a, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r1v4 int) = (r1v3 int), (r1v5 int) binds: [B:12:0x002a, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:12:0x002a, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(int i, int i2, boolean z) {
        int i3;
        int i4 = i + 1;
        char cCharAt = this.valueOf.charAt(i);
        int i5 = 0;
        if (cCharAt != '-') {
            if (cCharAt == '+') {
                if (i4 != i2) {
                    cCharAt = this.valueOf.charAt(i4);
                    i4 = i + 2;
                }
            }
            i3 = 0;
            if (cCharAt == 8734) {
            }
        } else if (i4 != i2) {
            cCharAt = this.valueOf.charAt(i4);
            i4 = i + 2;
            i3 = 1;
            if (cCharAt == 8734) {
                while ('0' <= cCharAt && cCharAt <= '9' && (i5 = (i5 * 10) + (cCharAt - '0')) <= i3 + 32767) {
                    if (i4 == i2) {
                        Part.Type type = Part.Type.ARG_INT;
                        if (i3 != 0) {
                            i5 = -i5;
                        }
                        AEQbTJ(type, i, i2 - i, i5);
                        return;
                    }
                    cCharAt = this.valueOf.charAt(i4);
                    i4++;
                }
                AEQbTJ(Double.parseDouble(this.valueOf.substring(i, i2)), i, i2 - i);
                return;
            }
            if (z && i4 == i2) {
                AEQbTJ(i3 != 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY, i, i2 - i);
                return;
            }
        }
        throw new NumberFormatException("Bad syntax for numeric value: " + this.valueOf.substring(i, i2));
    }

    public static void OLrzqt(String str, int i, int i2, StringBuilder sb) {
        loop0: while (true) {
            int i3 = -1;
            while (true) {
                int iIndexOf = str.indexOf(39, i);
                if (iIndexOf < 0 || iIndexOf >= i2) {
                    break loop0;
                }
                if (iIndexOf == i3) {
                    break;
                }
                sb.append((CharSequence) str, i, iIndexOf);
                i3 = iIndexOf + 1;
                i = i3;
            }
            sb.append('\'');
            i++;
        }
        sb.append((CharSequence) str, i, i2);
    }

    public final int fARcdN(int i) {
        return C7070acr.KWHzl(this.valueOf, i);
    }

    public final int DbNXlk(int i) {
        return C7070acr.AEQbTJ(this.valueOf, i);
    }

    public final int fetchVPNInfo(int i) {
        char cCharAt;
        while (i < this.valueOf.length() && (((cCharAt = this.valueOf.charAt(i)) >= '0' || "+-.".indexOf(cCharAt) >= 0) && (cCharAt <= '9' || cCharAt == 'e' || cCharAt == 'E' || cCharAt == 8734))) {
            i++;
        }
        return i;
    }

    public final boolean djBIcL(int i) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6 = this.valueOf.charAt(i);
        return (cCharAt6 == 'c' || cCharAt6 == 'C') && ((cCharAt = this.valueOf.charAt(i + 1)) == 'h' || cCharAt == 'H') && (((cCharAt2 = this.valueOf.charAt(i + 2)) == 'o' || cCharAt2 == 'O') && (((cCharAt3 = this.valueOf.charAt(i + 3)) == 'i' || cCharAt3 == 'I') && (((cCharAt4 = this.valueOf.charAt(i + 4)) == 'c' || cCharAt4 == 'C') && ((cCharAt5 = this.valueOf.charAt(i + 5)) == 'e' || cCharAt5 == 'E'))));
    }

    public final boolean valueOf(int i) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6 = this.valueOf.charAt(i);
        return (cCharAt6 == 'p' || cCharAt6 == 'P') && ((cCharAt = this.valueOf.charAt(i + 1)) == 'l' || cCharAt == 'L') && (((cCharAt2 = this.valueOf.charAt(i + 2)) == 'u' || cCharAt2 == 'U') && (((cCharAt3 = this.valueOf.charAt(i + 3)) == 'r' || cCharAt3 == 'R') && (((cCharAt4 = this.valueOf.charAt(i + 4)) == 'a' || cCharAt4 == 'A') && ((cCharAt5 = this.valueOf.charAt(i + 5)) == 'l' || cCharAt5 == 'L'))));
    }

    public final boolean isConnected(int i) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6 = this.valueOf.charAt(i);
        return (cCharAt6 == 's' || cCharAt6 == 'S') && ((cCharAt = this.valueOf.charAt(i + 1)) == 'e' || cCharAt == 'E') && (((cCharAt2 = this.valueOf.charAt(i + 2)) == 'l' || cCharAt2 == 'L') && (((cCharAt3 = this.valueOf.charAt(i + 3)) == 'e' || cCharAt3 == 'E') && (((cCharAt4 = this.valueOf.charAt(i + 4)) == 'c' || cCharAt4 == 'C') && ((cCharAt5 = this.valueOf.charAt(i + 5)) == 't' || cCharAt5 == 'T'))));
    }

    public final boolean gEmmrt(int i) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        char cCharAt7 = this.valueOf.charAt(i);
        return (cCharAt7 == 'o' || cCharAt7 == 'O') && ((cCharAt = this.valueOf.charAt(i + 1)) == 'r' || cCharAt == 'R') && (((cCharAt2 = this.valueOf.charAt(i + 2)) == 'd' || cCharAt2 == 'D') && (((cCharAt3 = this.valueOf.charAt(i + 3)) == 'i' || cCharAt3 == 'I') && (((cCharAt4 = this.valueOf.charAt(i + 4)) == 'n' || cCharAt4 == 'N') && (((cCharAt5 = this.valueOf.charAt(i + 5)) == 'a' || cCharAt5 == 'A') && ((cCharAt6 = this.valueOf.charAt(i + 6)) == 'l' || cCharAt6 == 'L')))));
    }

    public final boolean AYXKKw(int i) {
        return i > 0 || this.djBIcL.get(0).copydefault == Part.Type.MSG_START;
    }

    public final boolean AEQbTJ(int i, ArgType argType) {
        return i == 1 && argType == ArgType.CHOICE && this.djBIcL.get(0).copydefault != Part.Type.MSG_START;
    }

    public final void AEQbTJ(Part.Type type, int i, int i2, int i3) {
        this.djBIcL.add(new Part(type, i, i2, i3));
    }

    public final void copydefault(int i, Part.Type type, int i2, int i3, int i4) {
        this.djBIcL.get(i).AEQbTJ = this.djBIcL.size();
        AEQbTJ(type, i2, i3, i4);
    }

    public final void AEQbTJ(double d, int i, int i2) {
        int size;
        ArrayList<Double> arrayList = this.AhwBna;
        if (arrayList == null) {
            this.AhwBna = new ArrayList<>();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.AhwBna.add(Double.valueOf(d));
        AEQbTJ(Part.Type.ARG_DOUBLE, i, i2, size);
    }

    public static String copydefault(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i + 19;
            if (Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        return sb.toString();
    }

    public static String KWHzl(String str) {
        return copydefault(str, 0);
    }

    public final String AkhnZx(int i) {
        return copydefault(this.valueOf, i);
    }

    public final String values() {
        return copydefault(this.valueOf, 0);
    }
}

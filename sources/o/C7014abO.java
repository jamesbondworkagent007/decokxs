package o;

import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import java.text.CharacterIterator;
import o.C7034acH;
import o.C7208afW;
import okio.Utf8;

/* JADX INFO: renamed from: o.abO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7014abO {
    public static final C7032acF OLrzqt = C7034acH.KWHzl();

    /* JADX INFO: renamed from: o.abO$Application */
    public static final class Application implements C7034acH.StateListAnimator {
        public int AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;
        public java.lang.CharSequence gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C7034acH.StateListAnimator
        public void AEQbTJ(int i) {
            int i2;
            if (i > 0) {
                this.copydefault = 1;
                i2 = this.OLrzqt;
            } else if (i < 0) {
                this.copydefault = -1;
                i2 = this.AEQbTJ;
            } else {
                i2 = 0;
                this.copydefault = 0;
            }
            this.KWHzl = i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.OLrzqt - this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(int i, int i2) {
            this.AEQbTJ = i;
            this.OLrzqt = i2;
            this.copydefault = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault() {
            int i = this.EZpvd;
            this.OLrzqt = i;
            this.AEQbTJ = i;
        }

        public Application(java.lang.CharSequence charSequence) {
            this.gEmmrt = charSequence;
            this.EZpvd = charSequence.length();
            this.KWHzl = 0;
            this.OLrzqt = 0;
            this.AEQbTJ = 0;
            this.copydefault = 0;
        }

        public Application(java.lang.CharSequence charSequence, int i, int i2) {
            this.gEmmrt = charSequence;
            this.KWHzl = 0;
            this.EZpvd = charSequence.length();
            this.AEQbTJ = i;
            this.OLrzqt = i2;
            this.copydefault = 0;
        }

        public void EZpvd(int i) {
            if (i < 0 || i > this.gEmmrt.length()) {
                this.EZpvd = this.gEmmrt.length();
            } else {
                this.EZpvd = i;
            }
        }

        public int djBIcL() {
            int i = this.OLrzqt;
            this.AEQbTJ = i;
            if (i >= this.EZpvd) {
                return -1;
            }
            int iCodePointAt = java.lang.Character.codePointAt(this.gEmmrt, i);
            this.OLrzqt += java.lang.Character.charCount(iCodePointAt);
            return iCodePointAt;
        }

        @Override // o.C7034acH.StateListAnimator
        public int OLrzqt() {
            int i;
            if (this.copydefault > 0 && this.KWHzl < this.gEmmrt.length()) {
                int iCodePointAt = java.lang.Character.codePointAt(this.gEmmrt, this.KWHzl);
                this.KWHzl += java.lang.Character.charCount(iCodePointAt);
                return iCodePointAt;
            }
            if (this.copydefault >= 0 || (i = this.KWHzl) <= 0) {
                return -1;
            }
            int iCodePointBefore = java.lang.Character.codePointBefore(this.gEmmrt, i);
            this.KWHzl -= java.lang.Character.charCount(iCodePointBefore);
            return iCodePointBefore;
        }
    }

    public static boolean EZpvd(int i) {
        int iFARcdN = C7038acL.AhwBna.fARcdN(i);
        if (((1 << iFARcdN) & 251792942) == 0) {
            return iFARcdN == 4 && C7034acH.OLrzqt.valueOf(i) != 0;
        }
        return true;
    }

    public static int AEQbTJ(int i, int i2) {
        int i3 = i & 224;
        if (i3 == 0 || i3 == i2) {
            return i | i2;
        }
        throw new java.lang.IllegalArgumentException("multiple titlecasing iterator options");
    }

    public static AbstractC7192afG copydefault(ULocale uLocale, int i, AbstractC7192afG abstractC7192afG) {
        int i2 = i & 224;
        if (i2 != 0 && abstractC7192afG != null) {
            throw new java.lang.IllegalArgumentException("titlecasing iterator option together with an explicit iterator");
        }
        if (abstractC7192afG != null) {
            return abstractC7192afG;
        }
        if (i2 == 0) {
            return AbstractC7192afG.KWHzl(uLocale);
        }
        if (i2 == 32) {
            return new TaskDescription();
        }
        if (i2 == 64) {
            return AbstractC7192afG.copydefault(uLocale);
        }
        throw new java.lang.IllegalArgumentException("unknown titlecasing iterator option");
    }

    /* JADX INFO: renamed from: o.abO$TaskDescription */
    public static final class TaskDescription extends AbstractC7192afG {
        public int EZpvd;

        @Override // o.AbstractC7192afG
        public int EZpvd() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC7192afG
        public int KWHzl() {
            return this.EZpvd;
        }

        private TaskDescription() {
        }

        public static void AEQbTJ() {
            throw new java.lang.UnsupportedOperationException("should not occur");
        }

        @Override // o.AbstractC7192afG
        public CharacterIterator copydefault() {
            AEQbTJ();
            return null;
        }

        @Override // o.AbstractC7192afG
        public void OLrzqt(CharacterIterator characterIterator) {
            this.EZpvd = characterIterator.getEndIndex();
        }

        @Override // o.AbstractC7192afG
        public void AEQbTJ(java.lang.String str) {
            this.EZpvd = str.length();
        }
    }

    public static int EZpvd(java.lang.Appendable appendable, int i) throws java.io.IOException {
        if (i <= 65535) {
            appendable.append((char) i);
            return 1;
        }
        appendable.append((char) ((i >> 10) + Utf8.HIGH_SURROGATE_HEADER));
        appendable.append((char) ((i & 1023) + Utf8.LOG_SURROGATE_HEADER));
        return 2;
    }

    public static void AEQbTJ(int i, java.lang.Appendable appendable, int i2, int i3, C7208afW c7208afW) throws java.io.IOException {
        if (i < 0) {
            if (c7208afW != null) {
                c7208afW.AEQbTJ(i2);
            }
            if ((i3 & 16384) != 0) {
                return;
            }
            EZpvd(appendable, ~i);
            return;
        }
        if (i <= 31) {
            if (c7208afW != null) {
                c7208afW.AEQbTJ(i2, i);
            }
        } else {
            int iEZpvd = EZpvd(appendable, i);
            if (c7208afW != null) {
                c7208afW.AEQbTJ(i2, iEZpvd);
            }
        }
    }

    public static final void KWHzl(java.lang.CharSequence charSequence, int i, int i2, java.lang.Appendable appendable, int i3, C7208afW c7208afW) throws java.io.IOException {
        if (i2 > 0) {
            if (c7208afW != null) {
                c7208afW.AEQbTJ(i2);
            }
            if ((i3 & 16384) != 0) {
                return;
            }
            appendable.append(charSequence, i, i2 + i);
        }
    }

    public static java.lang.String OLrzqt(java.lang.CharSequence charSequence, java.lang.StringBuilder sb, C7208afW c7208afW) {
        if (!c7208afW.copydefault()) {
            return charSequence.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(charSequence.length() + c7208afW.EZpvd());
        C7208afW.TaskDescription taskDescriptionKWHzl = c7208afW.KWHzl();
        while (taskDescriptionKWHzl.copydefault()) {
            if (taskDescriptionKWHzl.EZpvd()) {
                int iAhwBna = taskDescriptionKWHzl.AhwBna();
                sb2.append((java.lang.CharSequence) sb, iAhwBna, taskDescriptionKWHzl.KWHzl() + iAhwBna);
            } else {
                int iValueOf = taskDescriptionKWHzl.valueOf();
                sb2.append(charSequence, iValueOf, taskDescriptionKWHzl.AEQbTJ() + iValueOf);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void KWHzl(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4, Application application, java.lang.Appendable appendable, C7208afW c7208afW) throws java.io.IOException {
        byte[] bArr;
        int iKWHzl;
        int i5;
        boolean zIsHighSurrogate;
        int codePoint;
        int iCopydefault;
        char cCharAt;
        int i6 = i4;
        if (i == 1 || (i < 0 ? (i2 & 7) == 0 : !(i == 2 || i == 3))) {
            bArr = C7034acH.TaskDescription.copydefault;
        } else {
            bArr = C7034acH.TaskDescription.KWHzl;
        }
        byte[] bArr2 = bArr;
        int i7 = i3;
        int i8 = i7;
        Application application2 = application;
        while (i8 < i6) {
            char cCharAt2 = charSequence.charAt(i8);
            if (cCharAt2 < 383) {
                iKWHzl = bArr2[cCharAt2];
                if (iKWHzl == -128) {
                    i5 = i8 + 1;
                    zIsHighSurrogate = java.lang.Character.isHighSurrogate(cCharAt2);
                    codePoint = cCharAt2;
                    codePoint = cCharAt2;
                    if (zIsHighSurrogate && i5 < i6) {
                        cCharAt = charSequence.charAt(i5);
                        codePoint = cCharAt2;
                        if (java.lang.Character.isLowSurrogate(cCharAt)) {
                            i5 = i8 + 2;
                            codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt);
                        }
                    }
                    int i9 = codePoint;
                    int i10 = i5;
                    KWHzl(charSequence, i7, i8 - i7, appendable, i2, c7208afW);
                    if (i < 0) {
                        if (application2 == null) {
                            application2 = new Application(charSequence, i8, i10);
                        } else {
                            application2.OLrzqt(i8, i10);
                        }
                        iCopydefault = C7034acH.OLrzqt.KWHzl(i9 == true ? 1 : 0, application2, appendable, i);
                    } else {
                        iCopydefault = C7034acH.OLrzqt.copydefault(i9 == true ? 1 : 0, appendable, i2);
                    }
                    if (iCopydefault < 0) {
                        AEQbTJ(iCopydefault, appendable, i10 - i8, i2, c7208afW);
                        i7 = i10;
                    } else {
                        i7 = i8;
                    }
                    i8 = i10;
                    i6 = i4;
                } else {
                    i8++;
                    if (iKWHzl != 0) {
                        KWHzl(charSequence, i7, (i8 - 1) - i7, appendable, i2, c7208afW);
                        appendable.append((char) (cCharAt2 + iKWHzl));
                        if (c7208afW != null) {
                            c7208afW.AEQbTJ(1, 1);
                        }
                        i6 = i4;
                        i7 = i8;
                    }
                }
            } else {
                if (cCharAt2 < 55296) {
                    int iEZpvd = OLrzqt.EZpvd(cCharAt2);
                    if (!C7034acH.AhwBna(iEZpvd)) {
                        i8++;
                        if (!C7034acH.AEQbTJ(iEZpvd) || (iKWHzl = C7034acH.KWHzl(iEZpvd)) == 0) {
                            i6 = i4;
                        } else {
                            KWHzl(charSequence, i7, (i8 - 1) - i7, appendable, i2, c7208afW);
                            appendable.append((char) (cCharAt2 + iKWHzl));
                            if (c7208afW != null) {
                            }
                            i6 = i4;
                            i7 = i8;
                        }
                    }
                }
                i5 = i8 + 1;
                zIsHighSurrogate = java.lang.Character.isHighSurrogate(cCharAt2);
                codePoint = cCharAt2;
                codePoint = cCharAt2;
                if (zIsHighSurrogate) {
                    cCharAt = charSequence.charAt(i5);
                    codePoint = cCharAt2;
                    if (java.lang.Character.isLowSurrogate(cCharAt)) {
                    }
                }
                int i92 = codePoint;
                int i102 = i5;
                KWHzl(charSequence, i7, i8 - i7, appendable, i2, c7208afW);
                if (i < 0) {
                }
                if (iCopydefault < 0) {
                }
                i8 = i102;
                i6 = i4;
            }
        }
        KWHzl(charSequence, i7, i8 - i7, appendable, i2, c7208afW);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[SYNTHETIC] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void AEQbTJ(int i, int i2, java.lang.CharSequence charSequence, java.lang.Appendable appendable, C7208afW c7208afW) throws java.io.IOException {
        byte[] bArr;
        int iKWHzl;
        int i3;
        boolean zIsHighSurrogate;
        int codePoint;
        int iCopydefault;
        char cCharAt;
        if (i == 2) {
            bArr = C7034acH.TaskDescription.OLrzqt;
        } else {
            bArr = C7034acH.TaskDescription.AEQbTJ;
        }
        byte[] bArr2 = bArr;
        int length = charSequence.length();
        int i4 = 0;
        Application application = null;
        while (true) {
            int i5 = i4;
            Application application2 = application;
            int i6 = i5;
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 < 383) {
                    iKWHzl = bArr2[cCharAt2];
                    if (iKWHzl == -128) {
                        i3 = i5 + 1;
                        zIsHighSurrogate = java.lang.Character.isHighSurrogate(cCharAt2);
                        codePoint = cCharAt2;
                        codePoint = cCharAt2;
                        if (zIsHighSurrogate && i3 < length) {
                            cCharAt = charSequence.charAt(i3);
                            codePoint = cCharAt2;
                            if (java.lang.Character.isLowSurrogate(cCharAt)) {
                                i3 = i5 + 2;
                                codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt);
                            }
                        }
                        int i7 = codePoint;
                        int i8 = i3;
                        if (application2 != null) {
                            application2 = new Application(charSequence, i5, i8);
                        } else {
                            application2.OLrzqt(i5, i8);
                        }
                        KWHzl(charSequence, i6, i5 - i6, appendable, i2, c7208afW);
                        iCopydefault = C7034acH.OLrzqt.copydefault(i7 == true ? 1 : 0, application2, appendable, i);
                        if (iCopydefault < 0) {
                            AEQbTJ(iCopydefault, appendable, i8 - i5, i2, c7208afW);
                            i6 = i8;
                        } else {
                            i6 = i5;
                        }
                        i5 = i8;
                    } else {
                        i5++;
                        if (iKWHzl != 0) {
                            KWHzl(charSequence, i6, (i5 - 1) - i6, appendable, i2, c7208afW);
                            appendable.append((char) (cCharAt2 + iKWHzl));
                            if (c7208afW == null) {
                                c7208afW.AEQbTJ(1, 1);
                            }
                            i4 = i5;
                            application = application2;
                        }
                    }
                } else {
                    if (cCharAt2 < 55296) {
                        int iEZpvd = OLrzqt.EZpvd(cCharAt2);
                        if (!C7034acH.AhwBna(iEZpvd)) {
                            i5++;
                            if (C7034acH.OLrzqt(iEZpvd) == 1 && (iKWHzl = C7034acH.KWHzl(iEZpvd)) != 0) {
                                KWHzl(charSequence, i6, (i5 - 1) - i6, appendable, i2, c7208afW);
                                appendable.append((char) (cCharAt2 + iKWHzl));
                                if (c7208afW == null) {
                                }
                                i4 = i5;
                                application = application2;
                            }
                        }
                    }
                    i3 = i5 + 1;
                    zIsHighSurrogate = java.lang.Character.isHighSurrogate(cCharAt2);
                    codePoint = cCharAt2;
                    codePoint = cCharAt2;
                    if (zIsHighSurrogate) {
                        cCharAt = charSequence.charAt(i3);
                        codePoint = cCharAt2;
                        if (java.lang.Character.isLowSurrogate(cCharAt)) {
                        }
                    }
                    int i72 = codePoint;
                    int i82 = i3;
                    if (application2 != null) {
                    }
                    KWHzl(charSequence, i6, i5 - i6, appendable, i2, c7208afW);
                    iCopydefault = C7034acH.OLrzqt.copydefault(i72 == true ? 1 : 0, application2, appendable, i);
                    if (iCopydefault < 0) {
                    }
                    i5 = i82;
                }
            }
            KWHzl(charSequence, i6, i5 - i6, appendable, i2, c7208afW);
            return;
        }
    }

    public static java.lang.String KWHzl(int i, int i2, java.lang.CharSequence charSequence) {
        if (charSequence.length() <= 100 && (i2 & 16384) == 0) {
            if (charSequence.length() == 0) {
                return charSequence.toString();
            }
            C7208afW c7208afW = new C7208afW();
            return OLrzqt(charSequence, (java.lang.StringBuilder) KWHzl(i, i2 | 16384, charSequence, new java.lang.StringBuilder(), c7208afW), c7208afW);
        }
        return ((java.lang.StringBuilder) KWHzl(i, i2, charSequence, new java.lang.StringBuilder(charSequence.length()), null)).toString();
    }

    public static <A extends java.lang.Appendable> A KWHzl(int i, int i2, java.lang.CharSequence charSequence, A a2, C7208afW c7208afW) {
        if (c7208afW != null) {
            try {
                c7208afW.AYXKKw();
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }
        KWHzl(i, i2, charSequence, 0, charSequence.length(), null, a2, c7208afW);
        return a2;
    }

    public static java.lang.String OLrzqt(int i, int i2, java.lang.CharSequence charSequence) {
        if (charSequence.length() <= 100 && (i2 & 16384) == 0) {
            if (charSequence.length() == 0) {
                return charSequence.toString();
            }
            C7208afW c7208afW = new C7208afW();
            return OLrzqt(charSequence, (java.lang.StringBuilder) EZpvd(i, i2 | 16384, charSequence, new java.lang.StringBuilder(), c7208afW), c7208afW);
        }
        return ((java.lang.StringBuilder) EZpvd(i, i2, charSequence, new java.lang.StringBuilder(charSequence.length()), null)).toString();
    }

    public static <A extends java.lang.Appendable> A EZpvd(int i, int i2, java.lang.CharSequence charSequence, A a2, C7208afW c7208afW) {
        if (c7208afW != null) {
            try {
                c7208afW.AYXKKw();
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }
        if (i != 4) {
            AEQbTJ(i, i2, charSequence, a2, c7208afW);
            return a2;
        }
        return (A) StateListAnimator.EZpvd(i2, charSequence, a2, c7208afW);
    }

    public static java.lang.String KWHzl(int i, int i2, AbstractC7192afG abstractC7192afG, java.lang.CharSequence charSequence) {
        if (charSequence.length() <= 100 && (i2 & 16384) == 0) {
            if (charSequence.length() == 0) {
                return charSequence.toString();
            }
            C7208afW c7208afW = new C7208afW();
            return OLrzqt(charSequence, (java.lang.StringBuilder) copydefault(i, i2 | 16384, abstractC7192afG, charSequence, new java.lang.StringBuilder(), c7208afW), c7208afW);
        }
        return ((java.lang.StringBuilder) copydefault(i, i2, abstractC7192afG, charSequence, new java.lang.StringBuilder(charSequence.length()), null)).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <A extends java.lang.Appendable> A copydefault(int i, int i2, AbstractC7192afG abstractC7192afG, java.lang.CharSequence charSequence, A a2, C7208afW c7208afW) {
        boolean z;
        int iKWHzl;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        if (c7208afW != null) {
            try {
                c7208afW.AYXKKw();
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }
        Application application = new Application(charSequence);
        int length = charSequence.length();
        int i6 = 1;
        boolean z2 = true;
        int i7 = 0;
        while (i7 < length) {
            if (z2) {
                iKWHzl = abstractC7192afG.EZpvd();
                z = false;
            } else {
                z = z2;
                iKWHzl = abstractC7192afG.KWHzl();
            }
            int i8 = (iKWHzl == -1 || iKWHzl > length) ? length : iKWHzl;
            if (i7 < i8) {
                application.EZpvd(i8);
                int iDjBIcL = application.djBIcL();
                if ((i2 & 512) == 0) {
                    int i9 = (i2 & 1024) != 0 ? i6 : 0;
                    do {
                        if (i9 != 0) {
                            if (C7034acH.OLrzqt.valueOf(iDjBIcL) != 0) {
                                break;
                            }
                            iDjBIcL = application.djBIcL();
                        } else {
                            if (EZpvd(iDjBIcL)) {
                                break;
                            }
                            iDjBIcL = application.djBIcL();
                        }
                    } while (iDjBIcL >= 0);
                    int i10 = iDjBIcL;
                    int iKWHzl2 = application.KWHzl();
                    if (i7 < iKWHzl2) {
                        i5 = iKWHzl2;
                        KWHzl(charSequence, i7, iKWHzl2 - i7, a2, i2, c7208afW);
                    } else {
                        i5 = iKWHzl2;
                    }
                    iDjBIcL = i10;
                    i7 = i5;
                }
                if (i7 < i8) {
                    int iAEQbTJ = application.AEQbTJ();
                    AEQbTJ(C7034acH.OLrzqt.OLrzqt(iDjBIcL, application, a2, i), a2, application.EZpvd(), i2, c7208afW);
                    int i11 = i7 + 1;
                    if (i11 < i8 && i == 5 && ((cCharAt = charSequence.charAt(i7)) == 'i' || cCharAt == 'I')) {
                        char cCharAt2 = charSequence.charAt(i11);
                        if (cCharAt2 == 'j') {
                            a2.append('J');
                            if (c7208afW != null) {
                                c7208afW.AEQbTJ(i6, i6);
                            }
                            application.djBIcL();
                        } else if (cCharAt2 == 'J') {
                            KWHzl(charSequence, i11, 1, a2, i2, c7208afW);
                            application.djBIcL();
                        }
                        iAEQbTJ++;
                    }
                    int i12 = iAEQbTJ;
                    if (i12 < i8) {
                        if ((i2 & 256) == 0) {
                            i3 = i8;
                            i4 = i6;
                            KWHzl(i, i2, charSequence, i12, i8, application, a2, c7208afW);
                        } else {
                            i3 = i8;
                            i4 = i6;
                            KWHzl(charSequence, i12, i3 - i12, a2, i2, c7208afW);
                        }
                        application.copydefault();
                    } else {
                        i3 = i8;
                        i4 = i6;
                    }
                }
            }
            z2 = z;
            i7 = i3;
            i6 = i4;
        }
        return a2;
    }

    public static java.lang.String AEQbTJ(int i, java.lang.CharSequence charSequence) {
        if (charSequence.length() <= 100 && (i & 16384) == 0) {
            if (charSequence.length() == 0) {
                return charSequence.toString();
            }
            C7208afW c7208afW = new C7208afW();
            return OLrzqt(charSequence, (java.lang.StringBuilder) copydefault(i | 16384, charSequence, new java.lang.StringBuilder(), c7208afW), c7208afW);
        }
        return ((java.lang.StringBuilder) copydefault(i, charSequence, new java.lang.StringBuilder(charSequence.length()), null)).toString();
    }

    public static <A extends java.lang.Appendable> A copydefault(int i, java.lang.CharSequence charSequence, A a2, C7208afW c7208afW) {
        if (c7208afW != null) {
            try {
                c7208afW.AYXKKw();
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }
        KWHzl(-1, i, charSequence, 0, charSequence.length(), null, a2, c7208afW);
        return a2;
    }

    /* JADX INFO: renamed from: o.abO$StateListAnimator */
    public static final class StateListAnimator {
        public static final char[] EZpvd = {880, 880, 882, 882, 0, 0, 886, 886, 0, 0, 890, 1021, 1022, 1023, 0, 895, 0, 0, 0, 0, 0, 0, 21393, 0, 21397, 21399, 21401, 0, 21407, 0, 21413, 21417, 54169, 5009, 914, 915, 916, 5013, 918, 5015, 920, 5017, 922, 923, 924, 925, 926, 5023, 928, 929, 0, 931, 932, 5029, 934, 935, 936, 5033, 37785, 37797, 21393, 21397, 21399, 21401, 54181, 5009, 914, 915, 916, 5013, 918, 5015, 920, 5017, 922, 923, 924, 925, 926, 5023, 928, 929, 931, 931, 932, 5029, 934, 935, 936, 5033, 37785, 37797, 21407, 21413, 21417, 975, 914, 920, 978, 17362, 33746, 934, 928, 975, 984, 984, 986, 986, 988, 988, 990, 990, 992, 992, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 922, 929, 1017, 895, 1012, 5013, 0, 1015, 1015, 1017, 1018, 1018, 1020, 1021, 1022, 1023};
        public static final char[] KWHzl = {5009, 5009, 21393, 21393, 21393, 21393, 21393, 21393, 5009, 5009, 21393, 21393, 21393, 21393, 21393, 21393, 5013, 5013, 21397, 21397, 21397, 21397, 0, 0, 5013, 5013, 21397, 21397, 21397, 21397, 0, 0, 5015, 5015, 21399, 21399, 21399, 21399, 21399, 21399, 5015, 5015, 21399, 21399, 21399, 21399, 21399, 21399, 5017, 5017, 21401, 21401, 21401, 21401, 21401, 21401, 5017, 5017, 21401, 21401, 21401, 21401, 21401, 21401, 5023, 5023, 21407, 21407, 21407, 21407, 0, 0, 5023, 5023, 21407, 21407, 21407, 21407, 0, 0, 5029, 5029, 21413, 21413, 21413, 21413, 21413, 21413, 0, 5029, 0, 21413, 0, 21413, 0, 21413, 5033, 5033, 21417, 21417, 21417, 21417, 21417, 21417, 5033, 5033, 21417, 21417, 21417, 21417, 21417, 21417, 21393, 21393, 21397, 21397, 21399, 21399, 21401, 21401, 21407, 21407, 21413, 21413, 21417, 21417, 0, 0, 13201, 13201, 29585, 29585, 29585, 29585, 29585, 29585, 13201, 13201, 29585, 29585, 29585, 29585, 29585, 29585, 13207, 13207, 29591, 29591, 29591, 29591, 29591, 29591, 13207, 13207, 29591, 29591, 29591, 29591, 29591, 29591, 13225, 13225, 29609, 29609, 29609, 29609, 29609, 29609, 13225, 13225, 29609, 29609, 29609, 29609, 29609, 29609, 5009, 5009, 29585, 13201, 29585, 0, 21393, 29585, 5009, 5009, 21393, 21393, 13201, 0, 5017, 0, 0, 0, 29591, 13207, 29591, 0, 21399, 29591, 21397, 21397, 21399, 21399, 13207, 0, 0, 0, 5017, 5017, 54169, 54169, 0, 0, 21401, 54169, 5017, 5017, 21401, 21401, 0, 0, 0, 0, 5029, 5029, 54181, 54181, 929, 929, 21413, 54181, 5029, 5029, 21413, 21413, 929, 0, 0, 0, 0, 0, 29609, 13225, 29609, 0, 21417, 29609, 21407, 21407, 21417, 21417, 13225, 0, 0, 0};

        public static final int EZpvd(int i) {
            if (i == 774) {
                return 131072;
            }
            if (i == 776) {
                return 65536;
            }
            if (i == 785) {
                return 16384;
            }
            if (i == 787 || i == 788) {
                return 131072;
            }
            switch (i) {
                case 768:
                case 769:
                case 770:
                case 771:
                    return 16384;
                case 772:
                    return 131072;
                default:
                    switch (i) {
                        case 834:
                            return 16384;
                        case 835:
                            return 131072;
                        case 836:
                            return 81920;
                        case 837:
                            return 8192;
                        default:
                            return 0;
                    }
            }
        }

        private StateListAnimator() {
        }

        public static final int OLrzqt(int i) {
            if (i < 880 || 8486 < i) {
                return 0;
            }
            if (1023 < i && i < 7936) {
                return 0;
            }
            if (i <= 1023) {
                return EZpvd[i - 880];
            }
            if (i <= 8191) {
                return KWHzl[i - 7936];
            }
            return i == 8486 ? 5033 : 0;
        }

        public static boolean EZpvd(java.lang.CharSequence charSequence, int i) {
            while (i < charSequence.length()) {
                int iCodePointAt = java.lang.Character.codePointAt(charSequence, i);
                int iGEmmrt = C7034acH.OLrzqt.gEmmrt(iCodePointAt);
                if ((iGEmmrt & 4) == 0) {
                    return iGEmmrt != 0;
                }
                i += java.lang.Character.charCount(iCodePointAt);
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <A extends java.lang.Appendable> A EZpvd(int i, java.lang.CharSequence charSequence, A a2, C7208afW c7208afW) throws java.io.IOException {
            int i2;
            int i3;
            boolean z;
            boolean z2;
            int iEZpvd;
            int i4 = 0;
            int i5 = 0;
            while (i4 < charSequence.length()) {
                int iCodePointAt = java.lang.Character.codePointAt(charSequence, i4);
                int iCharCount = java.lang.Character.charCount(iCodePointAt) + i4;
                C7034acH c7034acH = C7034acH.OLrzqt;
                int iGEmmrt = c7034acH.gEmmrt(iCodePointAt);
                int i6 = (iGEmmrt & 4) != 0 ? i5 & 1 : iGEmmrt != 0 ? 1 : 0;
                int iOLrzqt = OLrzqt(iCodePointAt);
                if (iOLrzqt <= 0) {
                    C7014abO.AEQbTJ(c7034acH.copydefault(iCodePointAt, null, a2, 4), a2, iCharCount - i4, i, c7208afW);
                } else {
                    int i7 = iOLrzqt & 1023;
                    if ((iOLrzqt & 4096) != 0 && (i5 & 2) != 0 && (i7 == 921 || i7 == 933)) {
                        iOLrzqt |= 32768;
                    }
                    int i8 = (iOLrzqt & 8192) != 0 ? 1 : 0;
                    while (iCharCount < charSequence.length() && (iEZpvd = EZpvd(charSequence.charAt(iCharCount))) != 0) {
                        iOLrzqt |= iEZpvd;
                        if ((iEZpvd & 8192) != 0) {
                            i8++;
                        }
                        iCharCount++;
                    }
                    if ((53248 & iOLrzqt) == 20480) {
                        i6 |= 2;
                    }
                    if (i7 == 919 && (iOLrzqt & 16384) != 0 && i8 == 0 && (i5 & 1) == 0 && !EZpvd(charSequence, iCharCount)) {
                        if (i4 == iCharCount) {
                            i7 = 905;
                        } else {
                            z = true;
                            if (c7208afW == null || (i & 16384) != 0) {
                                boolean z3 = charSequence.charAt(i4) == i7 || i8 > 0;
                                int i9 = i4 + 1;
                                if ((iOLrzqt & 98304) != 0) {
                                    z3 |= i9 >= iCharCount || charSequence.charAt(i9) != 776;
                                    i9 = i4 + 2;
                                }
                                if (z) {
                                    z3 |= i9 >= iCharCount || charSequence.charAt(i9) != 769;
                                    i9++;
                                }
                                int i10 = iCharCount - i4;
                                int i11 = (i9 - i4) + i8;
                                z2 = z3 | (i10 == i11);
                                if (z2) {
                                    if (c7208afW != null) {
                                        c7208afW.AEQbTJ(i10);
                                    }
                                    if ((i & 16384) == 0) {
                                    }
                                } else {
                                    if (c7208afW != null) {
                                        c7208afW.AEQbTJ(i10, i11);
                                    }
                                    if (z2) {
                                        a2.append((char) i7);
                                        if ((iOLrzqt & 98304) != 0) {
                                            a2.append((char) 776);
                                        }
                                        if (z) {
                                            a2.append((char) 769);
                                        }
                                        while (i8 > 0) {
                                            a2.append((char) 921);
                                            i8--;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((iOLrzqt & 32768) != 0) {
                        if (i7 == 921) {
                            i2 = (-98305) & iOLrzqt;
                            i3 = 938;
                        } else if (i7 == 933) {
                            i2 = (-98305) & iOLrzqt;
                            i3 = 939;
                        }
                        iOLrzqt = i2;
                        i7 = i3;
                    }
                    z = false;
                    if (c7208afW == null) {
                        if (charSequence.charAt(i4) == i7) {
                            int i92 = i4 + 1;
                            if ((iOLrzqt & 98304) != 0) {
                            }
                            if (z) {
                            }
                            int i102 = iCharCount - i4;
                            int i112 = (i92 - i4) + i8;
                            z2 = z3 | (i102 == i112);
                            if (z2) {
                            }
                        }
                    }
                }
                i4 = iCharCount;
                i5 = i6;
            }
            return a2;
        }
    }
}

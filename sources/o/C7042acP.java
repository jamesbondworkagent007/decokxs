package o;

import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.acP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7042acP {
    public boolean AEQbTJ;
    public java.util.ArrayList<java.lang.String> AhwBna;
    public final int EZpvd;
    public Activity KWHzl;
    public short[] OLrzqt;
    public boolean copydefault;
    public UnicodeSet djBIcL;
    public UnicodeSet valueOf;

    public static short AEQbTJ(int i) {
        if (i < 254) {
            return (short) i;
        }
        return (short) 254;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.copydefault;
    }

    public C7042acP(UnicodeSet unicodeSet, java.util.ArrayList<java.lang.String> arrayList, int i) {
        UnicodeSet unicodeSet2 = new UnicodeSet(0, 1114111);
        this.djBIcL = unicodeSet2;
        this.AhwBna = arrayList;
        this.AEQbTJ = i == 127;
        unicodeSet2.AhwBna(unicodeSet);
        int i2 = i & 1;
        if (i2 != 0) {
            this.valueOf = this.djBIcL;
        }
        this.KWHzl = new Activity();
        int size = this.AhwBna.size();
        this.copydefault = false;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            java.lang.String str = this.AhwBna.get(i4);
            int length = str.length();
            if (this.djBIcL.OLrzqt(str, UnicodeSet.SpanCondition.CONTAINED) < length) {
                this.copydefault = true;
            }
            if (length > i3) {
                i3 = length;
            }
        }
        this.EZpvd = i3;
        if (this.copydefault || (i & 64) != 0) {
            if (this.AEQbTJ) {
                this.djBIcL.AYXKKw();
            }
            boolean z = this.AEQbTJ;
            this.OLrzqt = new short[z ? size * 2 : size];
            int i5 = z ? size : 0;
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.String str2 = this.AhwBna.get(i6);
                int length2 = str2.length();
                UnicodeSet unicodeSet3 = this.djBIcL;
                UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.CONTAINED;
                int iOLrzqt = unicodeSet3.OLrzqt(str2, spanCondition);
                if (iOLrzqt < length2) {
                    if ((i & 2) != 0) {
                        if ((i & 32) != 0) {
                            this.OLrzqt[i6] = AEQbTJ(iOLrzqt);
                        }
                        if ((i & 16) != 0) {
                            this.OLrzqt[i5 + i6] = AEQbTJ(length2 - this.djBIcL.copydefault(str2, length2, spanCondition));
                        }
                    } else {
                        short[] sArr = this.OLrzqt;
                        sArr[i5 + i6] = 0;
                        sArr[i6] = 0;
                    }
                    if (i2 != 0) {
                        if ((i & 32) != 0) {
                            KWHzl(str2.codePointAt(0));
                        }
                        if ((i & 16) != 0) {
                            KWHzl(str2.codePointBefore(length2));
                        }
                    }
                } else if (this.AEQbTJ) {
                    short[] sArr2 = this.OLrzqt;
                    sArr2[i5 + i6] = 255;
                    sArr2[i6] = 255;
                } else {
                    this.OLrzqt[i6] = 255;
                }
            }
            if (this.AEQbTJ) {
                this.valueOf.AYXKKw();
            }
        }
    }

    public boolean EZpvd(int i) {
        return this.djBIcL.AEQbTJ(i);
    }

    public final void KWHzl(int i) {
        if (C7045acS.AEQbTJ(this.valueOf, (java.lang.Object) null) || C7045acS.AEQbTJ(this.valueOf, this.djBIcL)) {
            if (this.djBIcL.AEQbTJ(i)) {
                return;
            } else {
                this.valueOf = this.djBIcL.OLrzqt();
            }
        }
        this.valueOf.KWHzl(i);
    }

    public int OLrzqt(java.lang.CharSequence charSequence, int i, UnicodeSet.SpanCondition spanCondition) {
        if (spanCondition == UnicodeSet.SpanCondition.NOT_CONTAINED) {
            return AEQbTJ(charSequence, i, (C7253agO) null);
        }
        int iAEQbTJ = this.djBIcL.AEQbTJ(charSequence, i, UnicodeSet.SpanCondition.CONTAINED);
        return iAEQbTJ == charSequence.length() ? iAEQbTJ : AEQbTJ(charSequence, i, iAEQbTJ, spanCondition);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x00b0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x004b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x008e */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00db, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(java.lang.CharSequence charSequence, int i, int i2, UnicodeSet.SpanCondition spanCondition) {
        synchronized (this) {
            this.KWHzl.OLrzqt(spanCondition == UnicodeSet.SpanCondition.CONTAINED ? this.EZpvd : 0);
            int length = charSequence.length();
            int size = this.AhwBna.size();
            int i3 = length - i2;
            int i4 = i2 - i;
            int i5 = i2;
            while (true) {
                short s = 254;
                if (spanCondition == UnicodeSet.SpanCondition.CONTAINED) {
                    for (int i6 = 0; i6 < size; i6++) {
                        short s2 = this.OLrzqt[i6];
                        if (s2 != 255) {
                            java.lang.String str = this.AhwBna.get(i6);
                            int length2 = str.length();
                            int iOffsetByCodePoints = s2;
                            if (s2 >= 254) {
                                iOffsetByCodePoints = str.offsetByCodePoints(length2, -1);
                            }
                            if (iOffsetByCodePoints > i4) {
                                iOffsetByCodePoints = i4;
                            }
                            int i7 = length2 - iOffsetByCodePoints;
                            int i8 = iOffsetByCodePoints;
                            while (i7 <= i3) {
                                if (!this.KWHzl.copydefault(i7) && EZpvd(charSequence, i5 - i8, length, str, length2)) {
                                    if (i7 == i3) {
                                        return length;
                                    }
                                    this.KWHzl.KWHzl(i7);
                                }
                                if (i8 == 0) {
                                    break;
                                }
                                i7++;
                                i8--;
                            }
                        }
                    }
                } else {
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (i9 < size) {
                        short s3 = this.OLrzqt[i9];
                        java.lang.String str2 = this.AhwBna.get(i9);
                        int length3 = str2.length();
                        int i12 = s3;
                        if (s3 >= s) {
                            i12 = length3;
                        }
                        if (i12 > i4) {
                            i12 = i4;
                        }
                        int i13 = length3 - i12;
                        int i14 = i12;
                        while (true) {
                            if (i13 <= i3 && i14 >= i11) {
                                if ((i14 > i11 || i13 > i10) && EZpvd(charSequence, i5 - i14, length, str2, length3)) {
                                    i10 = i13;
                                    i11 = i14;
                                    break;
                                }
                                i13++;
                                i14--;
                            }
                        }
                        i9++;
                        s = 254;
                        i11 = i11;
                    }
                    if (i10 != 0 || i11 != 0) {
                        i5 += i10;
                        i3 -= i10;
                        if (i3 == 0) {
                            return length;
                        }
                    }
                    i4 = 0;
                }
                if (i4 != 0 || i5 == 0) {
                    if (this.KWHzl.copydefault()) {
                        return i5;
                    }
                } else if (this.KWHzl.copydefault()) {
                    int iAEQbTJ = this.djBIcL.AEQbTJ(charSequence, i5, UnicodeSet.SpanCondition.CONTAINED);
                    i4 = iAEQbTJ - i5;
                    if (i4 == i3 || i4 == 0) {
                        break;
                    }
                    i5 += i4;
                    i3 -= i4;
                } else {
                    int iAEQbTJ2 = AEQbTJ(this.djBIcL, charSequence, i5, i3);
                    if (iAEQbTJ2 > 0) {
                        if (iAEQbTJ2 == i3) {
                            return length;
                        }
                        i5 += iAEQbTJ2;
                        i3 -= iAEQbTJ2;
                        this.KWHzl.AEQbTJ(iAEQbTJ2);
                    }
                    i4 = 0;
                }
                int iAEQbTJ3 = this.KWHzl.AEQbTJ((C7253agO) null);
                i5 += iAEQbTJ3;
                i3 -= iAEQbTJ3;
                i4 = 0;
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public int AEQbTJ(java.lang.CharSequence r9, int r10, com.ibm.icu.text.UnicodeSet.SpanCondition r11, o.C7253agO r12) {
        /*
            r8 = this;
            com.ibm.icu.text.UnicodeSet$SpanCondition r0 = com.ibm.icu.text.UnicodeSet.SpanCondition.NOT_CONTAINED
            if (r11 != r0) goto L9
            int r9 = r8.AEQbTJ(r9, r10, r12)
            return r9
        L9:
            com.ibm.icu.text.UnicodeSet$SpanCondition r0 = com.ibm.icu.text.UnicodeSet.SpanCondition.CONTAINED
            if (r11 != r0) goto L12
            int r9 = r8.EZpvd(r9, r10, r12)
            return r9
        L12:
            java.util.ArrayList<java.lang.String> r11 = r8.AhwBna
            int r11 = r11.size()
            int r0 = r9.length()
            int r1 = r0 - r10
            r2 = 0
            r3 = r2
        L20:
            if (r1 == 0) goto L53
            com.ibm.icu.text.UnicodeSet r4 = r8.djBIcL
            int r4 = AEQbTJ(r4, r9, r10, r1)
            if (r4 <= 0) goto L2b
            goto L2c
        L2b:
            r4 = r2
        L2c:
            r5 = r2
        L2d:
            if (r5 >= r11) goto L49
            java.util.ArrayList<java.lang.String> r6 = r8.AhwBna
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.length()
            if (r4 >= r7) goto L46
            if (r7 > r1) goto L46
            boolean r6 = EZpvd(r9, r10, r0, r6, r7)
            if (r6 == 0) goto L46
            r4 = r7
        L46:
            int r5 = r5 + 1
            goto L2d
        L49:
            if (r4 != 0) goto L4e
            r12.OLrzqt = r3
            return r10
        L4e:
            int r3 = r3 + 1
            int r10 = r10 + r4
            int r1 = r1 - r4
            goto L20
        L53:
            r12.OLrzqt = r3
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7042acP.AEQbTJ(java.lang.CharSequence, int, com.ibm.icu.text.UnicodeSet$SpanCondition, o.agO):int");
    }

    public final int EZpvd(java.lang.CharSequence charSequence, int i, C7253agO c7253agO) {
        synchronized (this) {
            this.KWHzl.OLrzqt(this.EZpvd);
            int size = this.AhwBna.size();
            int length = charSequence.length();
            int i2 = length - i;
            int i3 = 0;
            while (i2 != 0) {
                int iAEQbTJ = AEQbTJ(this.djBIcL, charSequence, i, i2);
                if (iAEQbTJ > 0) {
                    this.KWHzl.copydefault(iAEQbTJ, i3 + 1);
                }
                for (int i4 = 0; i4 < size; i4++) {
                    java.lang.String str = this.AhwBna.get(i4);
                    int length2 = str.length();
                    if (length2 <= i2) {
                        int i5 = i3 + 1;
                        if (!this.KWHzl.OLrzqt(length2, i5) && EZpvd(charSequence, i, length, str, length2)) {
                            this.KWHzl.copydefault(length2, i5);
                        }
                    }
                }
                if (this.KWHzl.copydefault()) {
                    c7253agO.OLrzqt = i3;
                    return i;
                }
                int iAEQbTJ2 = this.KWHzl.AEQbTJ(c7253agO);
                i += iAEQbTJ2;
                i2 -= iAEQbTJ2;
                i3 = c7253agO.OLrzqt;
            }
            c7253agO.OLrzqt = i3;
            return i;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:127:0x00c9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0063 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x00a8 */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f5, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int copydefault(java.lang.CharSequence charSequence, int i, UnicodeSet.SpanCondition spanCondition) {
        synchronized (this) {
            if (spanCondition == UnicodeSet.SpanCondition.NOT_CONTAINED) {
                return OLrzqt(charSequence, i);
            }
            UnicodeSet unicodeSet = this.djBIcL;
            UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.CONTAINED;
            int iCopydefault = unicodeSet.copydefault(charSequence, i, spanCondition2);
            int i2 = 0;
            if (iCopydefault == 0) {
                return 0;
            }
            int i3 = i - iCopydefault;
            this.KWHzl.OLrzqt(spanCondition == spanCondition2 ? this.EZpvd : 0);
            int size = this.AhwBna.size();
            int i4 = this.AEQbTJ ? size : 0;
            while (true) {
                short s = 254;
                if (spanCondition == UnicodeSet.SpanCondition.CONTAINED) {
                    for (int i5 = i2; i5 < size; i5++) {
                        short s2 = this.OLrzqt[i4 + i5];
                        if (s2 != 255) {
                            java.lang.String str = this.AhwBna.get(i5);
                            int length = str.length();
                            int iOffsetByCodePoints = s2;
                            if (s2 >= 254) {
                                iOffsetByCodePoints = length - str.offsetByCodePoints(i2, 1);
                            }
                            if (iOffsetByCodePoints > i3) {
                                iOffsetByCodePoints = i3;
                            }
                            int i6 = length - iOffsetByCodePoints;
                            int i7 = iOffsetByCodePoints;
                            while (i6 <= iCopydefault) {
                                if (!this.KWHzl.copydefault(i6) && EZpvd(charSequence, iCopydefault - i6, i, str, length)) {
                                    if (i6 == iCopydefault) {
                                        return i2;
                                    }
                                    this.KWHzl.KWHzl(i6);
                                }
                                if (i7 == 0) {
                                    break;
                                }
                                i6++;
                                i7--;
                            }
                        }
                    }
                } else {
                    int i8 = i2;
                    int i9 = i8;
                    int i10 = i9;
                    while (i8 < size) {
                        short s3 = this.OLrzqt[i4 + i8];
                        java.lang.String str2 = this.AhwBna.get(i8);
                        int length2 = str2.length();
                        int i11 = s3;
                        if (s3 >= s) {
                            i11 = length2;
                        }
                        if (i11 > i3) {
                            i11 = i3;
                        }
                        int i12 = length2 - i11;
                        int i13 = i11;
                        while (true) {
                            if (i12 <= iCopydefault && i13 >= i10) {
                                if ((i13 > i10 || i12 > i9) && EZpvd(charSequence, iCopydefault - i12, i, str2, length2)) {
                                    i9 = i12;
                                    i10 = i13;
                                    break;
                                }
                                i12++;
                                i13--;
                            }
                        }
                        i8++;
                        s = 254;
                        i10 = i10;
                    }
                    if (i9 == 0 && i10 == 0) {
                    }
                    iCopydefault -= i9;
                    if (iCopydefault == 0) {
                        return 0;
                    }
                    i2 = 0;
                    i3 = 0;
                }
                if (i3 != 0 || iCopydefault == i) {
                    if (this.KWHzl.copydefault()) {
                        return iCopydefault;
                    }
                } else if (this.KWHzl.copydefault()) {
                    int iCopydefault2 = this.djBIcL.copydefault(charSequence, iCopydefault, UnicodeSet.SpanCondition.CONTAINED);
                    i3 = iCopydefault - iCopydefault2;
                    if (iCopydefault2 == 0 || i3 == 0) {
                        break;
                    }
                    iCopydefault = iCopydefault2;
                    i2 = 0;
                } else {
                    int iAEQbTJ = AEQbTJ(this.djBIcL, charSequence, iCopydefault);
                    if (iAEQbTJ > 0) {
                        if (iAEQbTJ == iCopydefault) {
                            return 0;
                        }
                        iCopydefault -= iAEQbTJ;
                        this.KWHzl.AEQbTJ(iAEQbTJ);
                    }
                    i2 = 0;
                    i3 = 0;
                }
                iCopydefault -= this.KWHzl.AEQbTJ((C7253agO) null);
                i2 = 0;
                i3 = 0;
            }
        }
    }

    public final int AEQbTJ(java.lang.CharSequence charSequence, int i, C7253agO c7253agO) {
        int iCopydefault;
        int i2;
        int iAEQbTJ;
        java.lang.String str;
        int length;
        int length2 = charSequence.length();
        int size = this.AhwBna.size();
        int i3 = 0;
        do {
            if (c7253agO == null) {
                iCopydefault = this.valueOf.AEQbTJ(charSequence, i, UnicodeSet.SpanCondition.NOT_CONTAINED);
            } else {
                iCopydefault = this.valueOf.copydefault(charSequence, i, UnicodeSet.SpanCondition.NOT_CONTAINED, c7253agO);
                i3 += c7253agO.OLrzqt;
                c7253agO.OLrzqt = i3;
            }
            if (iCopydefault == length2) {
                return length2;
            }
            i2 = length2 - iCopydefault;
            iAEQbTJ = AEQbTJ(this.djBIcL, charSequence, iCopydefault, i2);
            if (iAEQbTJ > 0) {
                return iCopydefault;
            }
            for (int i4 = 0; i4 < size; i4++) {
                if (this.OLrzqt[i4] != 255 && (length = (str = this.AhwBna.get(i4)).length()) <= i2 && EZpvd(charSequence, iCopydefault, length2, str, length)) {
                    return iCopydefault;
                }
            }
            i = iCopydefault - iAEQbTJ;
            i3++;
        } while (i2 + iAEQbTJ != 0);
        if (c7253agO != null) {
            c7253agO.OLrzqt = i3;
        }
        return length2;
    }

    public final int OLrzqt(java.lang.CharSequence charSequence, int i) {
        java.lang.String str;
        int length;
        int size = this.AhwBna.size();
        int i2 = i;
        do {
            int iCopydefault = this.valueOf.copydefault(charSequence, i2, UnicodeSet.SpanCondition.NOT_CONTAINED);
            if (iCopydefault == 0) {
                return 0;
            }
            int iAEQbTJ = AEQbTJ(this.djBIcL, charSequence, iCopydefault);
            if (iAEQbTJ > 0) {
                return iCopydefault;
            }
            for (int i3 = 0; i3 < size; i3++) {
                if (this.OLrzqt[i3] != 255 && (length = (str = this.AhwBna.get(i3)).length()) <= iCopydefault && EZpvd(charSequence, iCopydefault - length, i, str, length)) {
                    return iCopydefault;
                }
            }
            i2 = iCopydefault + iAEQbTJ;
        } while (i2 != 0);
        return 0;
    }

    public static boolean EZpvd(java.lang.CharSequence charSequence, int i, java.lang.String str, int i2) {
        int i3 = i + i2;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return true;
            }
            i3--;
            if (charSequence.charAt(i3) != str.charAt(i4)) {
                return false;
            }
            i2 = i4;
        }
    }

    public static boolean EZpvd(java.lang.CharSequence charSequence, int i, int i2, java.lang.String str, int i3) {
        int i4;
        return EZpvd(charSequence, i, str, i3) && !((i > 0 && java.lang.Character.isHighSurrogate(charSequence.charAt(i + (-1))) && java.lang.Character.isLowSurrogate(charSequence.charAt(i))) || ((i4 = i + i3) < i2 && java.lang.Character.isHighSurrogate(charSequence.charAt(i4 + (-1))) && java.lang.Character.isLowSurrogate(charSequence.charAt(i4))));
    }

    public static int AEQbTJ(UnicodeSet unicodeSet, java.lang.CharSequence charSequence, int i, int i2) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt >= 55296 && cCharAt <= 56319 && i2 >= 2) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (C7242agD.OLrzqt(cCharAt2)) {
                return unicodeSet.AEQbTJ(java.lang.Character.toCodePoint(cCharAt, cCharAt2)) ? 2 : -2;
            }
        }
        return unicodeSet.AEQbTJ(cCharAt) ? 1 : -1;
    }

    public static int AEQbTJ(UnicodeSet unicodeSet, java.lang.CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i - 1);
        if (cCharAt >= 56320 && cCharAt <= 57343 && i >= 2) {
            char cCharAt2 = charSequence.charAt(i - 2);
            if (C7242agD.AEQbTJ(cCharAt2)) {
                return unicodeSet.AEQbTJ(java.lang.Character.toCodePoint(cCharAt2, cCharAt)) ? 2 : -2;
            }
        }
        return unicodeSet.AEQbTJ(cCharAt) ? 1 : -1;
    }

    /* JADX INFO: renamed from: o.acP$Activity */
    public static final class Activity {
        public int[] AEQbTJ = new int[16];
        public int OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault() {
            return this.copydefault == 0;
        }

        public void OLrzqt(int i) {
            if (i > this.AEQbTJ.length) {
                this.AEQbTJ = new int[i];
            }
            EZpvd();
        }

        public void EZpvd() {
            int length = this.AEQbTJ.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    this.copydefault = 0;
                    this.OLrzqt = 0;
                    return;
                } else {
                    this.AEQbTJ[i] = 0;
                    length = i;
                }
            }
        }

        public void AEQbTJ(int i) {
            int length = this.OLrzqt + i;
            int[] iArr = this.AEQbTJ;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
            if (iArr[length] != 0) {
                iArr[length] = 0;
                this.copydefault--;
            }
            this.OLrzqt = length;
        }

        public void KWHzl(int i) {
            int length = this.OLrzqt + i;
            int[] iArr = this.AEQbTJ;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
            iArr[length] = 1;
            this.copydefault++;
        }

        public void copydefault(int i, int i2) {
            int length = this.OLrzqt + i;
            int[] iArr = this.AEQbTJ;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
            int i3 = iArr[length];
            if (i3 == 0) {
                iArr[length] = i2;
                this.copydefault++;
            } else if (i2 < i3) {
                iArr[length] = i2;
            }
        }

        public boolean copydefault(int i) {
            int length = this.OLrzqt + i;
            int[] iArr = this.AEQbTJ;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
            return iArr[length] != 0;
        }

        public boolean OLrzqt(int i, int i2) {
            int length = this.OLrzqt + i;
            int[] iArr = this.AEQbTJ;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
            int i3 = iArr[length];
            return i3 != 0 && i3 <= i2;
        }

        public int AEQbTJ(C7253agO c7253agO) {
            int[] iArr;
            int[] iArr2;
            int i;
            int i2;
            int i3 = this.OLrzqt;
            do {
                i3++;
                iArr = this.AEQbTJ;
                if (i3 < iArr.length) {
                    i2 = iArr[i3];
                } else {
                    int length = iArr.length;
                    int i4 = this.OLrzqt;
                    int i5 = 0;
                    while (true) {
                        iArr2 = this.AEQbTJ;
                        i = iArr2[i5];
                        if (i != 0) {
                            break;
                        }
                        i5++;
                    }
                    iArr2[i5] = 0;
                    this.copydefault--;
                    this.OLrzqt = i5;
                    if (c7253agO != null) {
                        c7253agO.OLrzqt = i;
                    }
                    return (length - i4) + i5;
                }
            } while (i2 == 0);
            iArr[i3] = 0;
            this.copydefault--;
            int i6 = this.OLrzqt;
            this.OLrzqt = i3;
            if (c7253agO != null) {
                c7253agO.OLrzqt = i2;
            }
            return i3 - i6;
        }
    }
}

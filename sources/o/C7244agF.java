package o;

import com.ibm.icu.util.BytesTrie;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.agF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7244agF implements java.lang.Cloneable, java.lang.Iterable<StateListAnimator> {
    public static BytesTrie.Result[] OLrzqt = {BytesTrie.Result.INTERMEDIATE_VALUE, BytesTrie.Result.FINAL_VALUE};
    public int AEQbTJ;
    public int EZpvd;
    public java.lang.CharSequence KWHzl;
    public int copydefault = -1;

    public static int EZpvd(int i, int i2) {
        return i2 >= 16448 ? i2 < 32704 ? i + 1 : i + 2 : i;
    }

    public static int KWHzl(int i, int i2) {
        return i2 >= 16384 ? i2 < 32767 ? i + 1 : i + 2 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna() {
        this.AEQbTJ = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7244agF OLrzqt() {
        this.AEQbTJ = this.EZpvd;
        this.copydefault = -1;
        return this;
    }

    public C7244agF(java.lang.CharSequence charSequence, int i) {
        this.KWHzl = charSequence;
        this.EZpvd = i;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C7244agF clone() throws java.lang.CloneNotSupportedException {
        return (C7244agF) super.clone();
    }

    /* JADX INFO: renamed from: o.agF$Application */
    public static final class Application {
        public int AEQbTJ;
        public int KWHzl;
        public java.lang.CharSequence OLrzqt;
        public int copydefault;
    }

    public C7244agF copydefault(Application application) {
        application.OLrzqt = this.KWHzl;
        application.AEQbTJ = this.EZpvd;
        application.copydefault = this.AEQbTJ;
        application.KWHzl = this.copydefault;
        return this;
    }

    public C7244agF AEQbTJ(Application application) {
        if (this.KWHzl == application.OLrzqt && this.KWHzl != null && this.EZpvd == application.AEQbTJ) {
            this.AEQbTJ = application.copydefault;
            this.copydefault = application.KWHzl;
            return this;
        }
        throw new java.lang.IllegalArgumentException("incompatible trie state");
    }

    public BytesTrie.Result KWHzl() {
        char cCharAt;
        int i = this.AEQbTJ;
        if (i < 0) {
            return BytesTrie.Result.NO_MATCH;
        }
        return (this.copydefault >= 0 || (cCharAt = this.KWHzl.charAt(i)) < '@') ? BytesTrie.Result.NO_VALUE : OLrzqt[cCharAt >> 15];
    }

    public BytesTrie.Result EZpvd(int i) {
        this.copydefault = -1;
        return AEQbTJ(this.EZpvd, i);
    }

    public BytesTrie.Result KWHzl(int i) {
        if (i <= 65535) {
            return EZpvd(i);
        }
        return EZpvd(C7242agD.OLrzqt(i)).hasNext() ? copydefault(C7242agD.EZpvd(i)) : BytesTrie.Result.NO_MATCH;
    }

    public BytesTrie.Result copydefault(int i) {
        char cCharAt;
        int i2 = this.AEQbTJ;
        if (i2 < 0) {
            return BytesTrie.Result.NO_MATCH;
        }
        int i3 = this.copydefault;
        if (i3 >= 0) {
            int i4 = i2 + 1;
            if (i != this.KWHzl.charAt(i2)) {
                AhwBna();
                return BytesTrie.Result.NO_MATCH;
            }
            int i5 = i3 - 1;
            this.copydefault = i5;
            this.AEQbTJ = i4;
            return (i5 >= 0 || (cCharAt = this.KWHzl.charAt(i4)) < '@') ? BytesTrie.Result.NO_VALUE : OLrzqt[cCharAt >> 15];
        }
        return AEQbTJ(i2, i);
    }

    public BytesTrie.Result AEQbTJ(int i) {
        if (i <= 65535) {
            return copydefault(i);
        }
        return copydefault(C7242agD.OLrzqt(i)).hasNext() ? copydefault(C7242agD.EZpvd(i)) : BytesTrie.Result.NO_MATCH;
    }

    public BytesTrie.Result OLrzqt(java.lang.CharSequence charSequence, int i, int i2) {
        char cCharAt;
        if (i >= i2) {
            return KWHzl();
        }
        int i3 = this.AEQbTJ;
        if (i3 < 0) {
            return BytesTrie.Result.NO_MATCH;
        }
        int i4 = this.copydefault;
        while (i != i2) {
            int i5 = i + 1;
            char cCharAt2 = charSequence.charAt(i);
            if (i4 >= 0) {
                if (cCharAt2 != this.KWHzl.charAt(i3)) {
                    AhwBna();
                    return BytesTrie.Result.NO_MATCH;
                }
                i3++;
                i4--;
                i = i5;
            } else {
                this.copydefault = i4;
                int iEZpvd = i3 + 1;
                int iCharAt = this.KWHzl.charAt(i3);
                while (true) {
                    if (iCharAt < 48) {
                        BytesTrie.Result resultKWHzl = KWHzl(iEZpvd, iCharAt, cCharAt2);
                        BytesTrie.Result result = BytesTrie.Result.NO_MATCH;
                        if (resultKWHzl == result) {
                            return result;
                        }
                        if (i5 == i2) {
                            return resultKWHzl;
                        }
                        if (resultKWHzl == BytesTrie.Result.FINAL_VALUE) {
                            AhwBna();
                            return result;
                        }
                        cCharAt2 = charSequence.charAt(i5);
                        int i6 = this.AEQbTJ;
                        iEZpvd = i6 + 1;
                        iCharAt = this.KWHzl.charAt(i6);
                        i5++;
                    } else if (iCharAt < 64) {
                        if (cCharAt2 != this.KWHzl.charAt(iEZpvd)) {
                            AhwBna();
                            return BytesTrie.Result.NO_MATCH;
                        }
                        i4 = iCharAt - 49;
                        i = i5;
                        i3 = iEZpvd + 1;
                    } else {
                        if ((32768 & iCharAt) != 0) {
                            AhwBna();
                            return BytesTrie.Result.NO_MATCH;
                        }
                        iEZpvd = EZpvd(iEZpvd, iCharAt);
                        iCharAt &= 63;
                    }
                }
            }
        }
        this.copydefault = i4;
        this.AEQbTJ = i3;
        return (i4 >= 0 || (cCharAt = this.KWHzl.charAt(i3)) < '@') ? BytesTrie.Result.NO_VALUE : OLrzqt[cCharAt >> 15];
    }

    public int EZpvd() {
        int i = this.AEQbTJ;
        int i2 = i + 1;
        char cCharAt = this.KWHzl.charAt(i);
        return (32768 & cCharAt) != 0 ? KWHzl(this.KWHzl, i2, cCharAt & 32767) : EZpvd(this.KWHzl, i2, cCharAt);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity iterator() {
        return new Activity(this.KWHzl, this.AEQbTJ, this.copydefault, 0);
    }

    /* JADX INFO: renamed from: o.agF$StateListAnimator */
    public static final class StateListAnimator {
        public int AEQbTJ;
        public java.lang.CharSequence copydefault;

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.agF$Activity */
    public static final class Activity implements java.util.Iterator<StateListAnimator> {
        public java.lang.CharSequence AEQbTJ;
        public boolean AYXKKw;
        public java.lang.StringBuilder AhwBna;
        public int EZpvd;
        public int KWHzl;
        public StateListAnimator OLrzqt;
        public int copydefault;
        public int djBIcL;
        public int gEmmrt;
        public java.util.ArrayList<java.lang.Long> valueOf;

        public Activity(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.AhwBna = new java.lang.StringBuilder();
            this.OLrzqt = new StateListAnimator();
            this.valueOf = new java.util.ArrayList<>();
            this.AEQbTJ = charSequence;
            this.KWHzl = i;
            this.djBIcL = i;
            this.copydefault = i2;
            this.gEmmrt = i2;
            this.EZpvd = i3;
            if (i2 >= 0) {
                int i4 = i2 + 1;
                i3 = (i3 <= 0 || i4 <= i3) ? i4 : i3;
                this.AhwBna.append(charSequence, i, i + i3);
                this.djBIcL += i3;
                this.gEmmrt -= i3;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.djBIcL >= 0 || !this.valueOf.isEmpty();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator next() {
            int iEZpvd = this.djBIcL;
            if (iEZpvd < 0) {
                if (this.valueOf.isEmpty()) {
                    throw new NoSuchElementException();
                }
                java.util.ArrayList<java.lang.Long> arrayList = this.valueOf;
                long jLongValue = arrayList.remove(arrayList.size() - 1).longValue();
                int i = (int) jLongValue;
                int i2 = (int) (jLongValue >> 32);
                this.AhwBna.setLength(65535 & i);
                int i3 = i >>> 16;
                if (i3 > 1) {
                    iEZpvd = EZpvd(i2, i3);
                    if (iEZpvd < 0) {
                        return this.OLrzqt;
                    }
                } else {
                    this.AhwBna.append(this.AEQbTJ.charAt(i2));
                    iEZpvd = i2 + 1;
                }
            }
            if (this.gEmmrt >= 0) {
                return OLrzqt();
            }
            while (true) {
                int iEZpvd2 = iEZpvd + 1;
                int iCharAt = this.AEQbTJ.charAt(iEZpvd);
                if (iCharAt >= 64) {
                    if (this.AYXKKw) {
                        iEZpvd2 = C7244agF.EZpvd(iEZpvd2, iCharAt);
                        iCharAt &= 63;
                        this.AYXKKw = false;
                    } else {
                        boolean z = (32768 & iCharAt) != 0;
                        if (z) {
                            this.OLrzqt.AEQbTJ = C7244agF.KWHzl(this.AEQbTJ, iEZpvd2, iCharAt & 32767);
                        } else {
                            this.OLrzqt.AEQbTJ = C7244agF.EZpvd(this.AEQbTJ, iEZpvd2, iCharAt);
                        }
                        if (z || (this.EZpvd > 0 && this.AhwBna.length() == this.EZpvd)) {
                            this.djBIcL = -1;
                        } else {
                            this.djBIcL = iEZpvd;
                            this.AYXKKw = true;
                        }
                        StateListAnimator stateListAnimator = this.OLrzqt;
                        stateListAnimator.copydefault = this.AhwBna;
                        return stateListAnimator;
                    }
                }
                if (this.EZpvd > 0 && this.AhwBna.length() == this.EZpvd) {
                    return OLrzqt();
                }
                if (iCharAt < 48) {
                    if (iCharAt == 0) {
                        iCharAt = this.AEQbTJ.charAt(iEZpvd2);
                        iEZpvd2++;
                    }
                    iEZpvd = EZpvd(iEZpvd2, iCharAt + 1);
                    if (iEZpvd < 0) {
                        return this.OLrzqt;
                    }
                } else {
                    int i4 = iCharAt - 47;
                    if (this.EZpvd > 0) {
                        int length = this.AhwBna.length();
                        int i5 = this.EZpvd;
                        if (length + i4 > i5) {
                            java.lang.StringBuilder sb = this.AhwBna;
                            sb.append(this.AEQbTJ, iEZpvd2, (i5 + iEZpvd2) - sb.length());
                            return OLrzqt();
                        }
                    }
                    int i6 = i4 + iEZpvd2;
                    this.AhwBna.append(this.AEQbTJ, iEZpvd2, i6);
                    iEZpvd = i6;
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        public final StateListAnimator OLrzqt() {
            this.djBIcL = -1;
            StateListAnimator stateListAnimator = this.OLrzqt;
            stateListAnimator.copydefault = this.AhwBna;
            stateListAnimator.AEQbTJ = -1;
            return stateListAnimator;
        }

        public final int EZpvd(int i, int i2) {
            while (i2 > 5) {
                int i3 = i + 1;
                int i4 = i2 >> 1;
                this.valueOf.add(java.lang.Long.valueOf((((long) C7244agF.AEQbTJ(this.AEQbTJ, i3)) << 32) | ((long) ((i2 - i4) << 16)) | ((long) this.AhwBna.length())));
                i = C7244agF.KWHzl(this.AEQbTJ, i3);
                i2 = i4;
            }
            char cCharAt = this.AEQbTJ.charAt(i);
            int i5 = i + 2;
            char cCharAt2 = this.AEQbTJ.charAt(i + 1);
            boolean z = (32768 & cCharAt2) != 0;
            int i6 = cCharAt2 & 32767;
            int iKWHzl = C7244agF.KWHzl(this.AEQbTJ, i5, i6);
            int iKWHzl2 = C7244agF.KWHzl(i5, i6);
            this.valueOf.add(java.lang.Long.valueOf((((long) iKWHzl2) << 32) | ((long) ((i2 - 1) << 16)) | ((long) this.AhwBna.length())));
            this.AhwBna.append(cCharAt);
            if (!z) {
                return iKWHzl2 + iKWHzl;
            }
            this.djBIcL = -1;
            StateListAnimator stateListAnimator = this.OLrzqt;
            stateListAnimator.copydefault = this.AhwBna;
            stateListAnimator.AEQbTJ = iKWHzl;
            return -1;
        }
    }

    public static int KWHzl(java.lang.CharSequence charSequence, int i, int i2) {
        int iCharAt;
        char cCharAt;
        if (i2 < 16384) {
            return i2;
        }
        if (i2 < 32767) {
            iCharAt = (i2 - 16384) << 16;
            cCharAt = charSequence.charAt(i);
        } else {
            iCharAt = charSequence.charAt(i) << 16;
            cCharAt = charSequence.charAt(i + 1);
        }
        return iCharAt | cCharAt;
    }

    public static int copydefault(java.lang.CharSequence charSequence, int i) {
        return KWHzl(i + 1, charSequence.charAt(i) & 32767);
    }

    public static int EZpvd(java.lang.CharSequence charSequence, int i, int i2) {
        int iCharAt;
        char cCharAt;
        if (i2 < 16448) {
            return (i2 >> 6) - 1;
        }
        if (i2 < 32704) {
            iCharAt = ((i2 & 32704) - 16448) << 10;
            cCharAt = charSequence.charAt(i);
        } else {
            iCharAt = charSequence.charAt(i) << 16;
            cCharAt = charSequence.charAt(i + 1);
        }
        return cCharAt | iCharAt;
    }

    public static int KWHzl(java.lang.CharSequence charSequence, int i) {
        int i2 = i + 1;
        int iCharAt = charSequence.charAt(i);
        if (iCharAt >= 64512) {
            if (iCharAt == 65535) {
                iCharAt = (charSequence.charAt(i2) << 16) | charSequence.charAt(i + 2);
                i2 = i + 3;
            } else {
                iCharAt = ((iCharAt - 64512) << 16) | charSequence.charAt(i2);
                i2 = i + 2;
            }
        }
        return i2 + iCharAt;
    }

    public static int AEQbTJ(java.lang.CharSequence charSequence, int i) {
        int i2 = i + 1;
        char cCharAt = charSequence.charAt(i);
        return cCharAt >= 64512 ? cCharAt == 65535 ? i + 3 : i + 2 : i2;
    }

    public final BytesTrie.Result KWHzl(int i, int i2, int i3) {
        BytesTrie.Result result;
        if (i2 == 0) {
            i2 = this.KWHzl.charAt(i);
            i++;
        }
        int i4 = i2 + 1;
        while (i4 > 5) {
            int i5 = i + 1;
            if (i3 < this.KWHzl.charAt(i)) {
                i4 >>= 1;
                i = KWHzl(this.KWHzl, i5);
            } else {
                i4 -= i4 >> 1;
                i = AEQbTJ(this.KWHzl, i5);
            }
        }
        do {
            int i6 = i + 1;
            if (i3 == this.KWHzl.charAt(i)) {
                int iCharAt = this.KWHzl.charAt(i6);
                if ((32768 & iCharAt) != 0) {
                    result = BytesTrie.Result.FINAL_VALUE;
                } else {
                    int i7 = i + 2;
                    if (iCharAt >= 16384) {
                        if (iCharAt < 32767) {
                            iCharAt = ((iCharAt - 16384) << 16) | this.KWHzl.charAt(i7);
                            i7 = i + 3;
                        } else {
                            iCharAt = (this.KWHzl.charAt(i7) << 16) | this.KWHzl.charAt(i + 3);
                            i7 = i + 4;
                        }
                    }
                    i6 = i7 + iCharAt;
                    char cCharAt = this.KWHzl.charAt(i6);
                    result = cCharAt >= '@' ? OLrzqt[cCharAt >> 15] : BytesTrie.Result.NO_VALUE;
                }
                this.AEQbTJ = i6;
                return result;
            }
            i4--;
            i = copydefault(this.KWHzl, i6);
        } while (i4 > 1);
        int i8 = i + 1;
        if (i3 == this.KWHzl.charAt(i)) {
            this.AEQbTJ = i8;
            char cCharAt2 = this.KWHzl.charAt(i8);
            return cCharAt2 >= '@' ? OLrzqt[cCharAt2 >> 15] : BytesTrie.Result.NO_VALUE;
        }
        AhwBna();
        return BytesTrie.Result.NO_MATCH;
    }

    public final BytesTrie.Result AEQbTJ(int i, int i2) {
        char cCharAt;
        int iEZpvd = i + 1;
        int iCharAt = this.KWHzl.charAt(i);
        while (iCharAt >= 48) {
            if (iCharAt < 64) {
                int i3 = iEZpvd + 1;
                if (i2 == this.KWHzl.charAt(iEZpvd)) {
                    int i4 = iCharAt - 49;
                    this.copydefault = i4;
                    this.AEQbTJ = i3;
                    return (i4 >= 0 || (cCharAt = this.KWHzl.charAt(i3)) < '@') ? BytesTrie.Result.NO_VALUE : OLrzqt[cCharAt >> 15];
                }
            } else if ((32768 & iCharAt) == 0) {
                iEZpvd = EZpvd(iEZpvd, iCharAt);
                iCharAt &= 63;
            }
            AhwBna();
            return BytesTrie.Result.NO_MATCH;
        }
        return KWHzl(iEZpvd, iCharAt, i2);
    }
}

package o;

import com.ibm.icu.impl.IllegalIcuArgumentException;
import com.ibm.icu.util.BytesTrie;
import java.util.MissingResourceException;
import o.C7024abY;

/* JADX INFO: renamed from: o.acO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7041acO {
    public static final C7041acO EZpvd;
    public static final StateListAnimator copydefault = new StateListAnimator();
    public byte[] AEQbTJ;
    public java.lang.String KWHzl;
    public int[] OLrzqt;

    public static int AEQbTJ(int i) {
        return (65 > i || i > 90) ? i : i + 32;
    }

    /* JADX INFO: renamed from: o.acO$StateListAnimator */
    public static final class StateListAnimator implements C7024abY.ActionBar {
        private StateListAnimator() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            return bArr[0] == 2;
        }
    }

    static {
        try {
            EZpvd = new C7041acO();
        } catch (java.io.IOException e) {
            MissingResourceException missingResourceException = new MissingResourceException("Could not construct UPropertyAliases. Missing pnames.icu", "", "");
            missingResourceException.initCause(e);
            throw missingResourceException;
        }
    }

    public final void copydefault(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        C7024abY.OLrzqt(byteBuffer, 1886282093, copydefault);
        int i = byteBuffer.getInt() / 4;
        if (i < 8) {
            throw new java.io.IOException("pnames.icu: not enough indexes");
        }
        int[] iArr = new int[i];
        iArr[0] = i * 4;
        for (int i2 = 1; i2 < i; i2++) {
            iArr[i2] = byteBuffer.getInt();
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        this.OLrzqt = C7024abY.EZpvd(byteBuffer, (i4 - i3) / 4, 0);
        int i5 = iArr[2];
        byte[] bArr = new byte[i5 - i4];
        this.AEQbTJ = bArr;
        byteBuffer.get(bArr);
        int i6 = iArr[3] - i5;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i6);
        for (int i7 = 0; i7 < i6; i7++) {
            sb.append((char) byteBuffer.get());
        }
        this.KWHzl = sb.toString();
    }

    private C7041acO() throws java.io.IOException {
        copydefault(C7024abY.copydefault("pnames.icu"));
    }

    public final int copydefault(int i) {
        int i2 = 1;
        for (int i3 = this.OLrzqt[0]; i3 > 0; i3--) {
            int[] iArr = this.OLrzqt;
            int i4 = iArr[i2];
            int i5 = iArr[i2 + 1];
            int i6 = i2 + 2;
            if (i < i4) {
                break;
            }
            if (i < i5) {
                return i6 + ((i - i4) * 2);
            }
            i2 = i6 + ((i5 - i4) * 2);
        }
        return 0;
    }

    public final int AEQbTJ(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        int i3 = i + 2;
        int i4 = this.OLrzqt[i + 1];
        if (i4 >= 16) {
            int i5 = (i4 + i3) - 16;
            int i6 = i3;
            do {
                int[] iArr = this.OLrzqt;
                int i7 = iArr[i6];
                if (i2 < i7) {
                    break;
                }
                if (i2 == i7) {
                    return iArr[(i5 + i6) - i3];
                }
                i6++;
            } while (i6 < i5);
        } else {
            while (i4 > 0) {
                int[] iArr2 = this.OLrzqt;
                int i8 = iArr2[i3];
                int i9 = iArr2[i3 + 1];
                int i10 = i3 + 2;
                if (i2 < i8) {
                    break;
                }
                if (i2 < i9) {
                    return iArr2[(i10 + i2) - i8];
                }
                i3 = i10 + (i9 - i8);
                i4--;
            }
        }
        return 0;
    }

    public final java.lang.String copydefault(int i, int i2) {
        int i3;
        int i4 = i + 1;
        char cCharAt = this.KWHzl.charAt(i);
        if (i2 < 0 || cCharAt <= i2) {
            throw new IllegalIcuArgumentException("Invalid property (value) name choice");
        }
        while (i2 > 0) {
            while (true) {
                i3 = i4 + 1;
                if (this.KWHzl.charAt(i4) != 0) {
                    i4 = i3;
                }
            }
            i2--;
            i4 = i3;
        }
        int i5 = i4;
        while (this.KWHzl.charAt(i5) != 0) {
            i5++;
        }
        if (i4 == i5) {
            return null;
        }
        return this.KWHzl.substring(i4, i5);
    }

    public final boolean AEQbTJ(BytesTrie bytesTrie, java.lang.CharSequence charSequence) {
        BytesTrie.Result resultAEQbTJ = BytesTrie.Result.NO_VALUE;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '-' && cCharAt != '_' && cCharAt != ' ' && ('\t' > cCharAt || cCharAt > '\r')) {
                if (!resultAEQbTJ.hasNext()) {
                    return false;
                }
                resultAEQbTJ = bytesTrie.AEQbTJ(AEQbTJ(cCharAt));
            }
        }
        return resultAEQbTJ.hasValue();
    }

    public java.lang.String AEQbTJ(int i, int i2, int i3) {
        int iCopydefault = copydefault(i);
        if (iCopydefault == 0) {
            throw new java.lang.IllegalArgumentException("Invalid property enum " + i + " (0x" + java.lang.Integer.toHexString(i) + ")");
        }
        int iAEQbTJ = AEQbTJ(this.OLrzqt[iCopydefault + 1], i2);
        if (iAEQbTJ == 0) {
            throw new java.lang.IllegalArgumentException("Property " + i + " (0x" + java.lang.Integer.toHexString(i) + ") does not have named values");
        }
        return copydefault(iAEQbTJ, i3);
    }

    public final int EZpvd(int i, java.lang.CharSequence charSequence) {
        BytesTrie bytesTrie = new BytesTrie(this.AEQbTJ, i);
        if (AEQbTJ(bytesTrie, charSequence)) {
            return bytesTrie.EZpvd();
        }
        return -1;
    }

    public int AEQbTJ(java.lang.CharSequence charSequence) {
        return EZpvd(0, charSequence);
    }

    public int copydefault(int i, java.lang.CharSequence charSequence) {
        int iCopydefault = copydefault(i);
        if (iCopydefault == 0) {
            throw new java.lang.IllegalArgumentException("Invalid property enum " + i + " (0x" + java.lang.Integer.toHexString(i) + ")");
        }
        int[] iArr = this.OLrzqt;
        int i2 = iArr[iCopydefault + 1];
        if (i2 == 0) {
            throw new java.lang.IllegalArgumentException("Property " + i + " (0x" + java.lang.Integer.toHexString(i) + ") does not have named values");
        }
        return EZpvd(iArr[i2], charSequence);
    }

    public int OLrzqt(int i, java.lang.CharSequence charSequence) {
        int[] iArr;
        int i2;
        int iCopydefault = copydefault(i);
        if (iCopydefault == 0 || (i2 = (iArr = this.OLrzqt)[iCopydefault + 1]) == 0) {
            return -1;
        }
        return EZpvd(iArr[i2], charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int EZpvd(java.lang.String str, java.lang.String str2) {
        boolean z;
        int iAEQbTJ;
        int i = 0;
        char cCharAt = 0;
        int i2 = 0;
        char cCharAt2 = 0;
        while (true) {
            if (i2 < str.length()) {
                cCharAt2 = str.charAt(i2);
                if (cCharAt2 != ' ' && cCharAt2 != '-' && cCharAt2 != '_') {
                    switch (cCharAt2) {
                    }
                }
                i2++;
            }
            while (i < str2.length()) {
                cCharAt = str2.charAt(i);
                if (cCharAt != ' ' && cCharAt != '-' && cCharAt != '_') {
                    switch (cCharAt) {
                    }
                    z = i2 != str.length();
                    boolean z2 = i == str2.length();
                    if (z) {
                        if (z2) {
                            cCharAt = 0;
                        }
                    } else {
                        if (z2) {
                            return 0;
                        }
                        cCharAt2 = 0;
                    }
                    iAEQbTJ = AEQbTJ(cCharAt2) - AEQbTJ(cCharAt);
                    if (iAEQbTJ == 0) {
                        return iAEQbTJ;
                    }
                    i2++;
                    i++;
                }
                i++;
            }
            if (i2 != str.length()) {
            }
            if (i == str2.length()) {
            }
            if (z) {
            }
            iAEQbTJ = AEQbTJ(cCharAt2) - AEQbTJ(cCharAt);
            if (iAEQbTJ == 0) {
            }
        }
    }
}

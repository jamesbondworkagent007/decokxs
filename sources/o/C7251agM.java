package o;

import com.ibm.icu.util.StringTrieBuilder;

/* JADX INFO: renamed from: o.agM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7251agM extends StringTrieBuilder {
    public int KWHzl;
    public final char[] OLrzqt = new char[3];
    public char[] copydefault;

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int EZpvd() {
        return 5;
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int KWHzl() {
        return 16;
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public boolean OLrzqt() {
        return true;
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int copydefault() {
        return 48;
    }

    public C7251agM EZpvd(java.lang.CharSequence charSequence, int i) {
        OLrzqt(charSequence, i);
        return this;
    }

    public C7244agF copydefault(StringTrieBuilder.Option option) {
        return new C7244agF(KWHzl(option), 0);
    }

    public java.lang.CharSequence KWHzl(StringTrieBuilder.Option option) {
        EZpvd(option);
        char[] cArr = this.copydefault;
        int length = cArr.length;
        int i = this.KWHzl;
        return java.nio.CharBuffer.wrap(cArr, length - i, i);
    }

    public final void EZpvd(StringTrieBuilder.Option option) {
        if (this.copydefault == null) {
            this.copydefault = new char[1024];
        }
        OLrzqt(option);
    }

    private void AEQbTJ(int i) {
        char[] cArr = this.copydefault;
        if (i > cArr.length) {
            int length = cArr.length;
            do {
                length *= 2;
            } while (length <= i);
            char[] cArr2 = new char[length];
            char[] cArr3 = this.copydefault;
            int length2 = cArr3.length;
            int i2 = this.KWHzl;
            java.lang.System.arraycopy(cArr3, length2 - i2, cArr2, length - i2, i2);
            this.copydefault = cArr2;
        }
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int copydefault(int i) {
        int i2 = this.KWHzl + 1;
        AEQbTJ(i2);
        this.KWHzl = i2;
        char[] cArr = this.copydefault;
        cArr[cArr.length - i2] = (char) i;
        return i2;
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int EZpvd(int i, int i2) {
        int i3 = this.KWHzl + i2;
        AEQbTJ(i3);
        this.KWHzl = i3;
        int length = this.copydefault.length - i3;
        while (i2 > 0) {
            this.copydefault[length] = this.djBIcL.charAt(i);
            i2--;
            length++;
            i++;
        }
        return this.KWHzl;
    }

    public final int AEQbTJ(char[] cArr, int i) {
        int i2 = this.KWHzl + i;
        AEQbTJ(i2);
        this.KWHzl = i2;
        char[] cArr2 = this.copydefault;
        java.lang.System.arraycopy(cArr, 0, cArr2, cArr2.length - i2, i);
        return this.KWHzl;
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int copydefault(int i, boolean z) {
        if (i >= 0 && i <= 16383) {
            return copydefault(i | (z ? 32768 : 0));
        }
        int i2 = 2;
        if (i < 0 || i > 1073676287) {
            char[] cArr = this.OLrzqt;
            cArr[0] = 32767;
            cArr[1] = (char) (i >> 16);
            cArr[2] = (char) i;
            i2 = 3;
        } else {
            char[] cArr2 = this.OLrzqt;
            cArr2[0] = (char) ((i >> 16) + 16384);
            cArr2[1] = (char) i;
        }
        char[] cArr3 = this.OLrzqt;
        cArr3[0] = (char) (cArr3[0] | (z ? (char) 32768 : (char) 0));
        return AEQbTJ(cArr3, i2);
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int EZpvd(boolean z, int i, int i2) {
        if (!z) {
            return copydefault(i2);
        }
        int i3 = 2;
        if (i < 0 || i > 16646143) {
            char[] cArr = this.OLrzqt;
            cArr[0] = 32704;
            cArr[1] = (char) (i >> 16);
            cArr[2] = (char) i;
            i3 = 3;
        } else if (i <= 255) {
            this.OLrzqt[0] = (char) ((i + 1) << 6);
            i3 = 1;
        } else {
            char[] cArr2 = this.OLrzqt;
            cArr2[0] = (char) ((32704 & (i >> 10)) + 16448);
            cArr2[1] = (char) i;
        }
        char[] cArr3 = this.OLrzqt;
        cArr3[0] = (char) (cArr3[0] | ((char) i2));
        return AEQbTJ(cArr3, i3);
    }

    @Override // com.ibm.icu.util.StringTrieBuilder
    @java.lang.Deprecated
    public int KWHzl(int i) {
        int i2;
        int i3 = this.KWHzl - i;
        if (i3 <= 64511) {
            return copydefault(i3);
        }
        if (i3 <= 67043327) {
            this.OLrzqt[0] = (char) ((i3 >> 16) + 64512);
            i2 = 1;
        } else {
            char[] cArr = this.OLrzqt;
            cArr[0] = 65535;
            cArr[1] = (char) (i3 >> 16);
            i2 = 2;
        }
        char[] cArr2 = this.OLrzqt;
        cArr2[i2] = (char) i3;
        return AEQbTJ(cArr2, i2 + 1);
    }
}

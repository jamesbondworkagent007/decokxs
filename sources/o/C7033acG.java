package o;

import com.ibm.icu.impl.Trie2;

/* JADX INFO: renamed from: o.acG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7033acG extends Trie2 {
    public static C7033acG copydefault(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        return (C7033acG) Trie2.OLrzqt(byteBuffer);
    }

    @Override // com.ibm.icu.impl.Trie2
    public final int OLrzqt(int i) {
        if (i >= 0) {
            if (i < 55296 || (i > 56319 && i <= 65535)) {
                return this.AEQbTJ[(this.fetchVPNInfo[i >> 5] << 2) + (i & 31)];
            }
            if (i <= 65535) {
                return this.AEQbTJ[(this.fetchVPNInfo[((i - 55296) >> 5) + 2048] << 2) + (i & 31)];
            }
            if (i < this.valueOf) {
                char[] cArr = this.fetchVPNInfo;
                return this.AEQbTJ[(cArr[cArr[(i >> 11) + 2080] + ((i >> 5) & 63)] << 2) + (i & 31)];
            }
            if (i <= 1114111) {
                return this.AEQbTJ[this.gEmmrt];
            }
        }
        return this.djBIcL;
    }

    @Override // com.ibm.icu.impl.Trie2
    public int EZpvd(char c) {
        return this.AEQbTJ[(this.fetchVPNInfo[c >> 5] << 2) + (c & 31)];
    }

    public int OLrzqt() {
        return (this.AhwBna.OLrzqt * 2) + 16 + (this.KWHzl * 4);
    }

    @Override // com.ibm.icu.impl.Trie2
    public int EZpvd(int i, int i2, int i3) {
        int i4;
        char c;
        char c2;
        loop0: while (true) {
            if (i >= i2) {
                break;
            }
            if (i < 55296 || (i > 56319 && i <= 65535)) {
                i4 = this.fetchVPNInfo[i >> 5] << 2;
                c = 0;
            } else {
                if (i < 65535) {
                    c = 2048;
                    c2 = this.fetchVPNInfo[((i - 55296) >> 5) + 2048];
                } else if (i < this.valueOf) {
                    char[] cArr = this.fetchVPNInfo;
                    c = cArr[(i >> 11) + 2080];
                    c2 = cArr[((i >> 5) & 63) + c];
                } else if (i3 == this.AEQbTJ[this.gEmmrt]) {
                    i = i2;
                }
                i4 = c2 << 2;
            }
            if (c == this.values) {
                if (i3 != this.DbNXlk) {
                    break;
                }
                i += 2048;
            } else if (i4 != this.OLrzqt) {
                int i5 = (i & 31) + i4;
                int i6 = i4 + 32;
                for (int i7 = i5; i7 < i6; i7++) {
                    if (this.AEQbTJ[i7] != i3) {
                        i += i7 - i5;
                        break loop0;
                    }
                }
                i += i6 - i5;
            } else {
                if (i3 != this.DbNXlk) {
                    break;
                }
                i += 32;
            }
        }
        if (i <= i2) {
            i2 = i;
        }
        return i2 - 1;
    }
}

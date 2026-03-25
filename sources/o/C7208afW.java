package o;

import androidx.core.app.FrameMetricsAggregator;
import java.nio.BufferOverflowException;

/* JADX INFO: renamed from: o.afW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7208afW {
    public char[] EZpvd = new char[100];
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw() {
        this.OLrzqt = 0;
        this.copydefault = 0;
        this.KWHzl = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.OLrzqt != 0;
    }

    public final void KWHzl(int i) {
        this.EZpvd[this.KWHzl - 1] = (char) i;
    }

    public final int AEQbTJ() {
        int i = this.KWHzl;
        if (i > 0) {
            return this.EZpvd[i - 1];
        }
        return 65535;
    }

    public void AEQbTJ(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("addUnchanged(" + i + "): length must not be negative");
        }
        int iAEQbTJ = AEQbTJ();
        if (iAEQbTJ < 4095) {
            int i2 = 4095 - iAEQbTJ;
            if (i2 >= i) {
                KWHzl(iAEQbTJ + i);
                return;
            } else {
                KWHzl(4095);
                i -= i2;
            }
        }
        while (i >= 4096) {
            EZpvd(4095);
            i -= 4096;
        }
        if (i > 0) {
            EZpvd(i - 1);
        }
    }

    public void AEQbTJ(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (i < 0 || i2 < 0) {
            throw new java.lang.IllegalArgumentException("addReplace(" + i + ", " + i2 + "): both lengths must be non-negative");
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.OLrzqt++;
        int i7 = i2 - i;
        if (i7 != 0) {
            if ((i7 > 0 && (i6 = this.copydefault) >= 0 && i7 > Integer.MAX_VALUE - i6) || (i7 < 0 && (i5 = this.copydefault) < 0 && i7 < Integer.MIN_VALUE - i5)) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            this.copydefault += i7;
        }
        if (i > 0 && i <= 6 && i2 <= 7) {
            int i8 = (i << 12) | (i2 << 9);
            int iAEQbTJ = AEQbTJ();
            if (4095 < iAEQbTJ && iAEQbTJ < 28671 && (iAEQbTJ & (-512)) == i8 && (iAEQbTJ & FrameMetricsAggregator.EVERY_DURATION) < 511) {
                KWHzl(iAEQbTJ + 1);
                return;
            } else {
                EZpvd(i8);
                return;
            }
        }
        if (i < 61 && i2 < 61) {
            EZpvd((i << 6) | 28672 | i2);
            return;
        }
        if (this.EZpvd.length - this.KWHzl >= 5 || OLrzqt()) {
            int i9 = this.KWHzl;
            int i10 = i9 + 1;
            if (i < 61) {
                i3 = (i << 6) | 28672;
            } else if (i <= 32767) {
                this.EZpvd[i10] = (char) (i | 32768);
                i10 = i9 + 2;
                i3 = 32576;
            } else {
                char[] cArr = this.EZpvd;
                cArr[i10] = (char) ((i >> 15) | 32768);
                i10 = i9 + 3;
                cArr[i9 + 2] = (char) (i | 32768);
                i = (i >> 30) + 62;
                i3 = (i << 6) | 28672;
            }
            if (i2 < 61) {
                i4 = i3 | i2;
            } else if (i2 <= 32767) {
                i4 = i3 | 61;
                this.EZpvd[i10] = (char) (i2 | 32768);
                i10++;
            } else {
                i4 = i3 | ((i2 >> 30) + 62);
                char[] cArr2 = this.EZpvd;
                cArr2[i10] = (char) ((i2 >> 15) | 32768);
                cArr2[i10 + 1] = (char) (i2 | 32768);
                i10 += 2;
            }
            this.EZpvd[i9] = (char) i4;
            this.KWHzl = i10;
        }
    }

    public final void EZpvd(int i) {
        if (this.KWHzl < this.EZpvd.length || OLrzqt()) {
            char[] cArr = this.EZpvd;
            int i2 = this.KWHzl;
            this.KWHzl = i2 + 1;
            cArr[i2] = (char) i;
        }
    }

    public final boolean OLrzqt() {
        int length;
        char[] cArr = this.EZpvd;
        if (cArr.length == 100) {
            length = 2000;
        } else {
            if (cArr.length == Integer.MAX_VALUE) {
                throw new BufferOverflowException();
            }
            length = cArr.length >= 1073741823 ? Integer.MAX_VALUE : cArr.length * 2;
        }
        if (length - cArr.length < 5) {
            throw new BufferOverflowException();
        }
        this.EZpvd = java.util.Arrays.copyOf(cArr, length);
        return true;
    }

    /* JADX INFO: renamed from: o.afW$TaskDescription */
    public static final class TaskDescription {
        public boolean AEQbTJ;
        public final boolean AYXKKw;
        public final int AhwBna;
        public final char[] EZpvd;
        public int KWHzl;
        public final boolean OLrzqt;
        public int copydefault;
        public int djBIcL;
        public int fetchVPNInfo;
        public int gEmmrt;
        public int isConnected;
        public int valueOf;
        public int values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw() {
            this.values += this.djBIcL;
            if (this.AEQbTJ) {
                this.fetchVPNInfo += this.gEmmrt;
            }
            this.copydefault += this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AhwBna() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            this.KWHzl = 0;
            this.AEQbTJ = false;
            this.gEmmrt = 0;
            this.djBIcL = 0;
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int valueOf() {
            return this.values;
        }

        public TaskDescription(char[] cArr, int i, boolean z, boolean z2) {
            this.EZpvd = cArr;
            this.AhwBna = i;
            this.AYXKKw = z;
            this.OLrzqt = z2;
        }

        public final int copydefault(int i) {
            if (i < 61) {
                return i;
            }
            if (i < 62) {
                char[] cArr = this.EZpvd;
                int i2 = this.valueOf;
                this.valueOf = i2 + 1;
                return cArr[i2] & 32767;
            }
            char[] cArr2 = this.EZpvd;
            int i3 = this.valueOf;
            char c = cArr2[i3];
            char c2 = cArr2[i3 + 1];
            this.valueOf = i3 + 2;
            return ((i & 1) << 30) | ((c & 32767) << 15) | (c2 & 32767);
        }

        public boolean copydefault() {
            return OLrzqt(this.AYXKKw);
        }

        public final boolean OLrzqt(boolean z) {
            char c;
            int i = this.KWHzl;
            if (i > 0) {
                AYXKKw();
            } else {
                if (i < 0 && this.isConnected > 0) {
                    this.valueOf++;
                    this.KWHzl = 1;
                    return true;
                }
                this.KWHzl = 1;
            }
            int i2 = this.isConnected;
            if (i2 >= 1) {
                if (i2 > 1) {
                    this.isConnected = i2 - 1;
                    return true;
                }
                this.isConnected = 0;
            }
            int i3 = this.valueOf;
            if (i3 >= this.AhwBna) {
                return OLrzqt();
            }
            char[] cArr = this.EZpvd;
            this.valueOf = i3 + 1;
            char c2 = cArr[i3];
            if (c2 <= 4095) {
                this.AEQbTJ = false;
                this.djBIcL = c2 + 1;
                while (true) {
                    int i4 = this.valueOf;
                    if (i4 >= this.AhwBna || (c2 = this.EZpvd[i4]) > 4095) {
                        break;
                    }
                    this.valueOf = i4 + 1;
                    this.djBIcL += c2 + 1;
                }
                this.gEmmrt = this.djBIcL;
                if (!z) {
                    return true;
                }
                AYXKKw();
                int i5 = this.valueOf;
                if (i5 >= this.AhwBna) {
                    return OLrzqt();
                }
                this.valueOf = i5 + 1;
            }
            this.AEQbTJ = true;
            if (c2 <= 28671) {
                int i6 = c2 >> '\f';
                int i7 = (c2 >> '\t') & 7;
                int i8 = (c2 & 511) + 1;
                if (!this.OLrzqt) {
                    this.djBIcL = i6;
                    this.gEmmrt = i7;
                    if (i8 > 1) {
                        this.isConnected = i8;
                    }
                    return true;
                }
                this.djBIcL = i6 * i8;
                this.gEmmrt = i8 * i7;
            } else {
                this.djBIcL = copydefault((c2 >> 6) & 63);
                this.gEmmrt = copydefault(c2 & '?');
                if (!this.OLrzqt) {
                    return true;
                }
            }
            while (true) {
                int i9 = this.valueOf;
                if (i9 >= this.AhwBna || (c = this.EZpvd[i9]) <= 4095) {
                    break;
                }
                this.valueOf = i9 + 1;
                if (c <= 28671) {
                    int i10 = (c & 511) + 1;
                    this.djBIcL += (c >> '\f') * i10;
                    this.gEmmrt += ((c >> '\t') & 7) * i10;
                } else {
                    this.djBIcL += copydefault((c >> 6) & 63);
                    this.gEmmrt += copydefault(c & '?');
                }
            }
            return true;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            sb.append("{ src[");
            sb.append(this.values);
            sb.append("..");
            sb.append(this.values + this.djBIcL);
            if (this.AEQbTJ) {
                sb.append("] ⇝ dest[");
            } else {
                sb.append("] ≡ dest[");
            }
            sb.append(this.copydefault);
            sb.append("..");
            sb.append(this.copydefault + this.gEmmrt);
            if (this.AEQbTJ) {
                sb.append("], repl[");
                sb.append(this.fetchVPNInfo);
                sb.append("..");
                sb.append(this.fetchVPNInfo + this.gEmmrt);
                sb.append("] }");
            } else {
                sb.append("] (no-change) }");
            }
            return sb.toString();
        }
    }

    public TaskDescription KWHzl() {
        return new TaskDescription(this.EZpvd, this.KWHzl, false, true);
    }
}

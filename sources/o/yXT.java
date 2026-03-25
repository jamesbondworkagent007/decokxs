package o;

import com.google.common.primitives.UnsignedBytes;
import java.util.NoSuchElementException;
import java.util.Stack;
import o.yXD;

/* JADX INFO: loaded from: classes13.dex */
public class yXT extends yXD {
    public static final int[] EZpvd;
    public int AEQbTJ;
    public final yXD AYXKKw;
    public final int AhwBna;
    public final int KWHzl;
    public final yXD copydefault;
    public final int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yXD
    public int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yXD
    public int EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yXD
    public int gEmmrt() {
        return this.AEQbTJ;
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        int i2 = 1;
        while (i2 > 0) {
            arrayList.add(java.lang.Integer.valueOf(i2));
            int i3 = i2;
            i2 = i + i2;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        EZpvd = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = EZpvd;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((java.lang.Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public yXT(yXD yxd, yXD yxd2) {
        this.AEQbTJ = 0;
        this.copydefault = yxd;
        this.AYXKKw = yxd2;
        int iEZpvd = yxd.EZpvd();
        this.KWHzl = iEZpvd;
        this.gEmmrt = iEZpvd + yxd2.EZpvd();
        this.AhwBna = java.lang.Math.max(yxd.AEQbTJ(), yxd2.AEQbTJ()) + 1;
    }

    public static yXD EZpvd(yXD yxd, yXD yxd2) {
        yXT yxt = yxd instanceof yXT ? (yXT) yxd : null;
        if (yxd2.EZpvd() == 0) {
            return yxd;
        }
        if (yxd.EZpvd() != 0) {
            int iEZpvd = yxd.EZpvd() + yxd2.EZpvd();
            if (iEZpvd < 128) {
                return OLrzqt(yxd, yxd2);
            }
            if (yxt != null && yxt.AYXKKw.EZpvd() + yxd2.EZpvd() < 128) {
                yxd2 = new yXT(yxt.copydefault, OLrzqt(yxt.AYXKKw, yxd2));
            } else if (yxt != null && yxt.copydefault.AEQbTJ() > yxt.AYXKKw.AEQbTJ() && yxt.AEQbTJ() > yxd2.AEQbTJ()) {
                yxd2 = new yXT(yxt.copydefault, new yXT(yxt.AYXKKw, yxd2));
            } else {
                if (iEZpvd >= EZpvd[java.lang.Math.max(yxd.AEQbTJ(), yxd2.AEQbTJ()) + 1]) {
                    return new yXT(yxd, yxd2);
                }
                return new ActionBar().KWHzl(yxd, yxd2);
            }
        }
        return yxd2;
    }

    public static yXR OLrzqt(yXD yxd, yXD yxd2) {
        int iEZpvd = yxd.EZpvd();
        int iEZpvd2 = yxd2.EZpvd();
        byte[] bArr = new byte[iEZpvd + iEZpvd2];
        yxd.AEQbTJ(bArr, 0, 0, iEZpvd);
        yxd2.AEQbTJ(bArr, 0, iEZpvd, iEZpvd2);
        return new yXR(bArr);
    }

    @Override // o.yXD
    public boolean AhwBna() {
        return this.gEmmrt >= EZpvd[this.AhwBna];
    }

    @Override // o.yXD
    public void copydefault(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.KWHzl;
        if (i + i3 <= i4) {
            this.copydefault.copydefault(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.AYXKKw.copydefault(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.copydefault.copydefault(bArr, i, i2, i5);
            this.AYXKKw.copydefault(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // o.yXD
    public void OLrzqt(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        int i3 = this.KWHzl;
        if (i + i2 <= i3) {
            this.copydefault.OLrzqt(outputStream, i, i2);
        } else {
            if (i >= i3) {
                this.AYXKKw.OLrzqt(outputStream, i - i3, i2);
                return;
            }
            int i4 = i3 - i;
            this.copydefault.OLrzqt(outputStream, i, i4);
            this.AYXKKw.OLrzqt(outputStream, 0, i2 - i4);
        }
    }

    @Override // o.yXD
    public java.lang.String AEQbTJ(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(DbNXlk(), str);
    }

    @Override // o.yXD
    public boolean djBIcL() {
        int iOLrzqt = this.copydefault.OLrzqt(0, 0, this.KWHzl);
        yXD yxd = this.AYXKKw;
        return yxd.OLrzqt(iOLrzqt, 0, yxd.EZpvd()) == 0;
    }

    @Override // o.yXD
    public int OLrzqt(int i, int i2, int i3) {
        int i4 = this.KWHzl;
        if (i2 + i3 <= i4) {
            return this.copydefault.OLrzqt(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.AYXKKw.OLrzqt(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.AYXKKw.OLrzqt(this.copydefault.OLrzqt(i, i2, i5), 0, i3 - i5);
    }

    public boolean equals(java.lang.Object obj) {
        int iGEmmrt;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yXD)) {
            return false;
        }
        yXD yxd = (yXD) obj;
        if (this.gEmmrt != yxd.EZpvd()) {
            return false;
        }
        if (this.gEmmrt == 0) {
            return true;
        }
        if (this.AEQbTJ == 0 || (iGEmmrt = yxd.gEmmrt()) == 0 || this.AEQbTJ == iGEmmrt) {
            return EZpvd(yxd);
        }
        return false;
    }

    public final boolean EZpvd(yXD yxd) {
        Application application = new Application(this);
        yXR next = application.next();
        Application application2 = new Application(yxd);
        yXR next2 = application2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iEZpvd = next.EZpvd() - i;
            int iEZpvd2 = next2.EZpvd() - i2;
            int iMin = java.lang.Math.min(iEZpvd, iEZpvd2);
            if (!(i == 0 ? next.AEQbTJ(next2, i2, iMin) : next2.AEQbTJ(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.gEmmrt;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == iEZpvd) {
                next = application.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iEZpvd2) {
                next2 = application2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    public int hashCode() {
        int iCopydefault = this.AEQbTJ;
        if (iCopydefault == 0) {
            int i = this.gEmmrt;
            iCopydefault = copydefault(i, 0, i);
            if (iCopydefault == 0) {
                iCopydefault = 1;
            }
            this.AEQbTJ = iCopydefault;
        }
        return iCopydefault;
    }

    @Override // o.yXD
    public int copydefault(int i, int i2, int i3) {
        int i4 = this.KWHzl;
        if (i2 + i3 <= i4) {
            return this.copydefault.copydefault(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.AYXKKw.copydefault(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.AYXKKw.copydefault(this.copydefault.copydefault(i, i2, i5), 0, i3 - i5);
    }

    @Override // o.yXD
    public yXG AYXKKw() {
        return yXG.copydefault(new TaskDescription());
    }

    public static class ActionBar {
        public final Stack<yXD> copydefault;

        private ActionBar() {
            this.copydefault = new Stack<>();
        }

        public final yXD KWHzl(yXD yxd, yXD yxd2) {
            copydefault(yxd);
            copydefault(yxd2);
            yXD yxdPop = this.copydefault.pop();
            while (!this.copydefault.isEmpty()) {
                yxdPop = new yXT(this.copydefault.pop(), yxdPop);
            }
            return yxdPop;
        }

        public final void copydefault(yXD yxd) {
            if (yxd.AhwBna()) {
                EZpvd(yxd);
                return;
            }
            if (yxd instanceof yXT) {
                yXT yxt = (yXT) yxd;
                copydefault(yxt.copydefault);
                copydefault(yxt.AYXKKw);
            } else {
                java.lang.String strValueOf = java.lang.String.valueOf(yxd.getClass());
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }

        public final void EZpvd(yXD yxd) {
            int iAEQbTJ = AEQbTJ(yxd.EZpvd());
            int i = yXT.EZpvd[iAEQbTJ + 1];
            if (this.copydefault.isEmpty() || this.copydefault.peek().EZpvd() >= i) {
                this.copydefault.push(yxd);
                return;
            }
            int i2 = yXT.EZpvd[iAEQbTJ];
            yXD yxdPop = this.copydefault.pop();
            while (true) {
                if (this.copydefault.isEmpty() || this.copydefault.peek().EZpvd() >= i2) {
                    break;
                } else {
                    yxdPop = new yXT(this.copydefault.pop(), yxdPop);
                }
            }
            yXT yxt = new yXT(yxdPop, yxd);
            while (!this.copydefault.isEmpty()) {
                if (this.copydefault.peek().EZpvd() >= yXT.EZpvd[AEQbTJ(yxt.EZpvd()) + 1]) {
                    break;
                } else {
                    yxt = new yXT(this.copydefault.pop(), yxt);
                }
            }
            this.copydefault.push(yxt);
        }

        public final int AEQbTJ(int i) {
            int iBinarySearch = java.util.Arrays.binarySearch(yXT.EZpvd, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }
    }

    public static class Application implements java.util.Iterator<yXR> {
        public yXR EZpvd;
        public final Stack<yXT> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.EZpvd != null;
        }

        public Application(yXD yxd) {
            this.OLrzqt = new Stack<>();
            this.EZpvd = copydefault(yxd);
        }

        public final yXR copydefault(yXD yxd) {
            while (yxd instanceof yXT) {
                yXT yxt = (yXT) yxd;
                this.OLrzqt.push(yxt);
                yxd = yxt.copydefault;
            }
            return (yXR) yxd;
        }

        public final yXR OLrzqt() {
            while (!this.OLrzqt.isEmpty()) {
                yXR yxrCopydefault = copydefault(this.OLrzqt.pop().AYXKKw);
                if (!yxrCopydefault.valueOf()) {
                    return yxrCopydefault;
                }
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public yXR next() {
            yXR yxr = this.EZpvd;
            if (yxr == null) {
                throw new NoSuchElementException();
            }
            this.EZpvd = OLrzqt();
            return yxr;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // o.yXD, java.lang.Iterable
    /* JADX INFO: renamed from: KWHzl */
    public yXD.StateListAnimator iterator() {
        return new StateListAnimator();
    }

    public class StateListAnimator implements yXD.StateListAnimator {
        public yXD.StateListAnimator AEQbTJ;
        public int OLrzqt;
        public final Application copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt > 0;
        }

        public StateListAnimator() {
            Application application = new Application(yXT.this);
            this.copydefault = application;
            this.AEQbTJ = application.next().iterator();
            this.OLrzqt = yXT.this.EZpvd();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(copydefault());
        }

        @Override // o.yXD.StateListAnimator
        public byte copydefault() {
            if (!this.AEQbTJ.hasNext()) {
                this.AEQbTJ = this.copydefault.next().iterator();
            }
            this.OLrzqt--;
            return this.AEQbTJ.copydefault();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public class TaskDescription extends java.io.InputStream {
        public yXR AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;
        public Application valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.io.InputStream
        public void mark(int i) {
            this.KWHzl = this.copydefault + this.EZpvd;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public TaskDescription() {
            EZpvd();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return AEQbTJ(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return AEQbTJ(null, 0, (int) j);
        }

        public final int AEQbTJ(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                KWHzl();
                if (this.AEQbTJ != null) {
                    int iMin = java.lang.Math.min(this.OLrzqt - this.EZpvd, i3);
                    if (bArr != null) {
                        this.AEQbTJ.AEQbTJ(bArr, this.EZpvd, i, iMin);
                        i += iMin;
                    }
                    this.EZpvd += iMin;
                    i3 -= iMin;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            KWHzl();
            yXR yxr = this.AEQbTJ;
            if (yxr == null) {
                return -1;
            }
            int i = this.EZpvd;
            this.EZpvd = i + 1;
            return yxr.copydefault(i) & UnsignedBytes.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return yXT.this.EZpvd() - (this.copydefault + this.EZpvd);
        }

        @Override // java.io.InputStream
        public void reset() {
            synchronized (this) {
                EZpvd();
                AEQbTJ(null, 0, this.KWHzl);
            }
        }

        public final void EZpvd() {
            Application application = new Application(yXT.this);
            this.valueOf = application;
            yXR next = application.next();
            this.AEQbTJ = next;
            this.OLrzqt = next.EZpvd();
            this.EZpvd = 0;
            this.copydefault = 0;
        }

        public final void KWHzl() {
            if (this.AEQbTJ != null) {
                int i = this.EZpvd;
                int i2 = this.OLrzqt;
                if (i == i2) {
                    this.copydefault += i2;
                    int iEZpvd = 0;
                    this.EZpvd = 0;
                    if (this.valueOf.hasNext()) {
                        yXR next = this.valueOf.next();
                        this.AEQbTJ = next;
                        iEZpvd = next.EZpvd();
                    } else {
                        this.AEQbTJ = null;
                    }
                    this.OLrzqt = iEZpvd;
                }
            }
        }
    }
}

package o;

import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yXD implements java.lang.Iterable<java.lang.Byte> {
    public static final yXD OLrzqt = new yXR(new byte[0]);

    public interface StateListAnimator extends java.util.Iterator<java.lang.Byte> {
        byte copydefault();
    }

    public abstract int AEQbTJ();

    public abstract java.lang.String AEQbTJ(java.lang.String str) throws java.io.UnsupportedEncodingException;

    public abstract yXG AYXKKw();

    public abstract boolean AhwBna();

    public abstract int EZpvd();

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: KWHzl */
    public abstract StateListAnimator iterator();

    public abstract int OLrzqt(int i, int i2, int i3);

    public abstract void OLrzqt(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException;

    public abstract int copydefault(int i, int i2, int i3);

    public abstract void copydefault(byte[] bArr, int i, int i2, int i3);

    public abstract boolean djBIcL();

    public abstract int gEmmrt();

    public boolean valueOf() {
        return EZpvd() == 0;
    }

    public static yXD OLrzqt(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new yXR(bArr2);
    }

    public static yXD OLrzqt(byte[] bArr) {
        return OLrzqt(bArr, 0, bArr.length);
    }

    public static yXD KWHzl(java.lang.String str) {
        try {
            return new yXR(str.getBytes(com.google.android.exoplayer2.C.UTF8_NAME));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public yXD AEQbTJ(yXD yxd) {
        int iEZpvd = EZpvd();
        int iEZpvd2 = yxd.EZpvd();
        if (((long) iEZpvd) + ((long) iEZpvd2) >= 2147483647L) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(iEZpvd);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(iEZpvd2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return yXT.EZpvd(this, yxd);
    }

    public static yXD EZpvd(java.lang.Iterable<yXD> iterable) {
        java.util.Collection arrayList;
        if (!(iterable instanceof java.util.Collection)) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<yXD> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList = (java.util.Collection) iterable;
        }
        return arrayList.isEmpty() ? OLrzqt : KWHzl(arrayList.iterator(), arrayList.size());
    }

    public static yXD KWHzl(java.util.Iterator<yXD> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return KWHzl(it, i2).AEQbTJ(KWHzl(it, i - i2));
    }

    public void AEQbTJ(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > EZpvd()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new java.lang.IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                copydefault(bArr, i, i2, i3);
            }
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new java.lang.IndexOutOfBoundsException(sb5.toString());
        }
    }

    public byte[] DbNXlk() {
        int iEZpvd = EZpvd();
        if (iEZpvd == 0) {
            return yXJ.EZpvd;
        }
        byte[] bArr = new byte[iEZpvd];
        copydefault(bArr, 0, 0, iEZpvd);
        return bArr;
    }

    public void copydefault(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        int i3 = i + i2;
        if (i3 <= EZpvd()) {
            if (i2 > 0) {
                OLrzqt(outputStream, i, i2);
            }
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
    }

    public java.lang.String fetchVPNInfo() {
        try {
            return AEQbTJ(com.google.android.exoplayer2.C.UTF8_NAME);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static TaskDescription OLrzqt() {
        return new TaskDescription(128);
    }

    public static final class TaskDescription extends java.io.OutputStream {
        public static final byte[] EZpvd = new byte[0];
        public int AEQbTJ;
        public final int AYXKKw;
        public int KWHzl;
        public byte[] OLrzqt;
        public final java.util.ArrayList<yXD> copydefault;

        public TaskDescription(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Buffer size < 0");
            }
            this.AYXKKw = i;
            this.copydefault = new java.util.ArrayList<>();
            this.OLrzqt = new byte[i];
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            synchronized (this) {
                if (this.AEQbTJ == this.OLrzqt.length) {
                    copydefault(1);
                }
                byte[] bArr = this.OLrzqt;
                int i2 = this.AEQbTJ;
                this.AEQbTJ = i2 + 1;
                bArr[i2] = (byte) i;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            synchronized (this) {
                byte[] bArr2 = this.OLrzqt;
                int length = bArr2.length;
                int i3 = this.AEQbTJ;
                if (i2 <= length - i3) {
                    java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.AEQbTJ += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    java.lang.System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    copydefault(i4);
                    java.lang.System.arraycopy(bArr, i + length2, this.OLrzqt, 0, i4);
                    this.AEQbTJ = i4;
                }
            }
        }

        public yXD AEQbTJ() {
            yXD yxdEZpvd;
            synchronized (this) {
                KWHzl();
                yxdEZpvd = yXD.EZpvd(this.copydefault);
            }
            return yxdEZpvd;
        }

        public final byte[] copydefault(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, java.lang.Math.min(bArr.length, i));
            return bArr2;
        }

        public int OLrzqt() {
            int i;
            int i2;
            synchronized (this) {
                i = this.KWHzl;
                i2 = this.AEQbTJ;
            }
            return i + i2;
        }

        public java.lang.String toString() {
            return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(OLrzqt()));
        }

        public final void copydefault(int i) {
            this.copydefault.add(new yXR(this.OLrzqt));
            int length = this.KWHzl + this.OLrzqt.length;
            this.KWHzl = length;
            this.OLrzqt = new byte[java.lang.Math.max(this.AYXKKw, java.lang.Math.max(i, length >>> 1))];
            this.AEQbTJ = 0;
        }

        public final void KWHzl() {
            int i = this.AEQbTJ;
            byte[] bArr = this.OLrzqt;
            if (i >= bArr.length) {
                this.copydefault.add(new yXR(this.OLrzqt));
                this.OLrzqt = EZpvd;
            } else if (i > 0) {
                this.copydefault.add(new yXR(copydefault(bArr, i)));
            }
            this.KWHzl += this.AEQbTJ;
            this.AEQbTJ = 0;
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(EZpvd()));
    }
}

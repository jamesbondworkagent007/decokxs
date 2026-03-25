package o;

import java.util.NoSuchElementException;
import o.yXD;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public class yXF extends yXR {
    public final int EZpvd;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yXR, o.yXD
    public int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yXR
    public int copydefault() {
        return this.copydefault;
    }

    public yXF(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (((long) i) + ((long) i2) <= bArr.length) {
            this.copydefault = i;
            this.EZpvd = i2;
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i);
        sb3.append(Marker.ANY_NON_NULL_MARKER);
        sb3.append(i2);
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    @Override // o.yXR
    public byte copydefault(int i) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i >= EZpvd()) {
            int iEZpvd = EZpvd();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(iEZpvd);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.AEQbTJ[this.copydefault + i];
    }

    @Override // o.yXR, o.yXD
    public void copydefault(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.AEQbTJ, copydefault() + i, bArr, i2, i3);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // o.yXR, o.yXD, java.lang.Iterable
    /* JADX INFO: renamed from: KWHzl */
    public yXD.StateListAnimator iterator() {
        return new Application();
    }

    public class Application implements yXD.StateListAnimator {
        public int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.KWHzl < this.copydefault;
        }

        public Application() {
            int iCopydefault = yXF.this.copydefault();
            this.KWHzl = iCopydefault;
            this.copydefault = iCopydefault + yXF.this.EZpvd();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(copydefault());
        }

        @Override // o.yXD.StateListAnimator
        public byte copydefault() {
            int i = this.KWHzl;
            if (i >= this.copydefault) {
                throw new NoSuchElementException();
            }
            byte[] bArr = yXF.this.AEQbTJ;
            this.KWHzl = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}

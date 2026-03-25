package o;

/* JADX INFO: renamed from: o.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5513Uq {
    boolean KWHzl() throws java.io.IOException;

    byte copydefault() throws java.io.IOException;

    /* JADX INFO: renamed from: o.Uq$TaskDescription */
    public static class TaskDescription implements InterfaceC5513Uq {
        public int AEQbTJ;
        public final int EZpvd;
        public final byte[] KWHzl;
        public final java.io.InputStream OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ() {
            this.AEQbTJ = this.EZpvd;
        }

        public TaskDescription(java.io.InputStream inputStream, byte[] bArr) {
            this.OLrzqt = inputStream;
            this.KWHzl = bArr;
            this.EZpvd = 0;
            this.AEQbTJ = 0;
            this.copydefault = 0;
        }

        public TaskDescription(byte[] bArr, int i, int i2) {
            this.OLrzqt = null;
            this.KWHzl = bArr;
            this.AEQbTJ = i;
            this.EZpvd = i;
            this.copydefault = i + i2;
        }

        @Override // o.InterfaceC5513Uq
        public boolean KWHzl() throws java.io.IOException {
            int i;
            int i2 = this.AEQbTJ;
            if (i2 < this.copydefault) {
                return true;
            }
            java.io.InputStream inputStream = this.OLrzqt;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.KWHzl;
            int length = bArr.length - i2;
            if (length < 1 || (i = inputStream.read(bArr, i2, length)) <= 0) {
                return false;
            }
            this.copydefault += i;
            return true;
        }

        @Override // o.InterfaceC5513Uq
        public byte copydefault() throws java.io.IOException {
            if (this.AEQbTJ >= this.copydefault && !KWHzl()) {
                throw new java.io.EOFException("Failed auto-detect: could not read more than " + this.AEQbTJ + " bytes (max buffer size: " + this.KWHzl.length + ")");
            }
            byte[] bArr = this.KWHzl;
            int i = this.AEQbTJ;
            this.AEQbTJ = i + 1;
            return bArr[i];
        }
    }
}

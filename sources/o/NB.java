package o;

import androidx.core.view.ViewCompat;
import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class NB {
    public java.nio.ByteBuffer AEQbTJ;
    public NA OLrzqt;
    public final byte[] copydefault = new byte[256];
    public int KWHzl = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.AEQbTJ = null;
        this.OLrzqt = null;
    }

    public NB EZpvd(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer) {
        isConnected();
        java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.AEQbTJ = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.AEQbTJ.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void isConnected() {
        this.AEQbTJ = null;
        java.util.Arrays.fill(this.copydefault, (byte) 0);
        this.OLrzqt = new NA();
        this.KWHzl = 0;
    }

    public NA KWHzl() {
        if (this.AEQbTJ == null) {
            throw new java.lang.IllegalStateException("You must call setData() before parseHeader()");
        }
        if (copydefault()) {
            return this.OLrzqt;
        }
        valueOf();
        if (!copydefault()) {
            AhwBna();
            NA na = this.OLrzqt;
            if (na.KWHzl < 0) {
                na.isConnected = 1;
            }
        }
        return this.OLrzqt;
    }

    public final void AhwBna() {
        copydefault(Integer.MAX_VALUE);
    }

    public final void copydefault(int i) {
        boolean z = false;
        while (!z && !copydefault() && this.OLrzqt.KWHzl <= i) {
            int iEZpvd = EZpvd();
            if (iEZpvd == 33) {
                int iEZpvd2 = EZpvd();
                if (iEZpvd2 == 1) {
                    AkhnZx();
                } else if (iEZpvd2 == 249) {
                    this.OLrzqt.OLrzqt = new C5340Ny();
                    djBIcL();
                } else if (iEZpvd2 == 254) {
                    AkhnZx();
                } else if (iEZpvd2 == 255) {
                    AYXKKw();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.copydefault[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        fetchVPNInfo();
                    } else {
                        AkhnZx();
                    }
                } else {
                    AkhnZx();
                }
            } else if (iEZpvd == 44) {
                NA na = this.OLrzqt;
                if (na.OLrzqt == null) {
                    na.OLrzqt = new C5340Ny();
                }
                AEQbTJ();
            } else if (iEZpvd != 59) {
                this.OLrzqt.isConnected = 1;
            } else {
                z = true;
            }
        }
    }

    public final void djBIcL() {
        EZpvd();
        int iEZpvd = EZpvd();
        C5340Ny c5340Ny = this.OLrzqt.OLrzqt;
        int i = (iEZpvd & 28) >> 2;
        c5340Ny.OLrzqt = i;
        if (i == 0) {
            c5340Ny.OLrzqt = 1;
        }
        c5340Ny.DbNXlk = (iEZpvd & 1) != 0;
        int iValues = values();
        if (iValues < 2) {
            iValues = 10;
        }
        C5340Ny c5340Ny2 = this.OLrzqt.OLrzqt;
        c5340Ny2.KWHzl = iValues * 10;
        c5340Ny2.AYXKKw = EZpvd();
        EZpvd();
    }

    public final void AEQbTJ() {
        this.OLrzqt.OLrzqt.djBIcL = values();
        this.OLrzqt.OLrzqt.gEmmrt = values();
        this.OLrzqt.OLrzqt.valueOf = values();
        this.OLrzqt.OLrzqt.copydefault = values();
        int iEZpvd = EZpvd();
        boolean z = (iEZpvd & 128) != 0;
        int iPow = (int) java.lang.Math.pow(2.0d, (iEZpvd & 7) + 1);
        C5340Ny c5340Ny = this.OLrzqt.OLrzqt;
        c5340Ny.EZpvd = (iEZpvd & 64) != 0;
        if (z) {
            c5340Ny.AhwBna = AEQbTJ(iPow);
        } else {
            c5340Ny.AhwBna = null;
        }
        this.OLrzqt.OLrzqt.AEQbTJ = this.AEQbTJ.position();
        DbNXlk();
        if (copydefault()) {
            return;
        }
        NA na = this.OLrzqt;
        na.KWHzl++;
        na.AEQbTJ.add(na.OLrzqt);
    }

    public final void fetchVPNInfo() {
        do {
            AYXKKw();
            byte[] bArr = this.copydefault;
            if (bArr[0] == 1) {
                byte b = bArr[1];
                byte b2 = bArr[2];
                this.OLrzqt.gEmmrt = ((b2 & UnsignedBytes.MAX_VALUE) << 8) | (b & UnsignedBytes.MAX_VALUE);
            }
            if (this.KWHzl <= 0) {
                return;
            }
        } while (!copydefault());
    }

    public final void valueOf() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) EZpvd());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.OLrzqt.isConnected = 1;
            return;
        }
        gEmmrt();
        if (!this.OLrzqt.valueOf || copydefault()) {
            return;
        }
        NA na = this.OLrzqt;
        na.djBIcL = AEQbTJ(na.AYXKKw);
        NA na2 = this.OLrzqt;
        na2.EZpvd = na2.djBIcL[na2.copydefault];
    }

    public final void gEmmrt() {
        this.OLrzqt.DbNXlk = values();
        this.OLrzqt.AhwBna = values();
        int iEZpvd = EZpvd();
        NA na = this.OLrzqt;
        na.valueOf = (iEZpvd & 128) != 0;
        na.AYXKKw = (int) java.lang.Math.pow(2.0d, (iEZpvd & 7) + 1);
        this.OLrzqt.copydefault = EZpvd();
        this.OLrzqt.fetchVPNInfo = EZpvd();
    }

    public final int[] AEQbTJ(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.AEQbTJ.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                byte b = bArr[i2];
                byte b2 = bArr[i2 + 1];
                int i4 = i2 + 3;
                iArr[i3] = (bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) | ((b & UnsignedBytes.MAX_VALUE) << 16) | ViewCompat.MEASURED_STATE_MASK | ((b2 & UnsignedBytes.MAX_VALUE) << 8);
                i3++;
                i2 = i4;
            }
        } catch (BufferUnderflowException unused) {
            this.OLrzqt.isConnected = 1;
        }
        return iArr;
    }

    public final void DbNXlk() {
        EZpvd();
        AkhnZx();
    }

    public final void AkhnZx() {
        int iEZpvd;
        do {
            iEZpvd = EZpvd();
            this.AEQbTJ.position(java.lang.Math.min(this.AEQbTJ.position() + iEZpvd, this.AEQbTJ.limit()));
        } while (iEZpvd > 0);
    }

    public final void AYXKKw() {
        int iEZpvd = EZpvd();
        this.KWHzl = iEZpvd;
        if (iEZpvd <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.KWHzl;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.AEQbTJ.get(this.copydefault, i, i3);
                i += i3;
            } catch (java.lang.Exception unused) {
                android.util.Log.isLoggable("GifHeaderParser", 3);
                this.OLrzqt.isConnected = 1;
                return;
            }
        }
    }

    public final int EZpvd() {
        try {
            return this.AEQbTJ.get() & UnsignedBytes.MAX_VALUE;
        } catch (java.lang.Exception unused) {
            this.OLrzqt.isConnected = 1;
            return 0;
        }
    }

    public final int values() {
        return this.AEQbTJ.getShort();
    }

    public final boolean copydefault() {
        return this.OLrzqt.isConnected != 0;
    }
}

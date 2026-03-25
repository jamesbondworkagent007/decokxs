package o;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.util.ByteArrayBuffer;

/* JADX INFO: renamed from: o.zne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59788zne implements InterfaceC59758znA, InterfaceC59801znr {
    public int AEQbTJ;
    public int AYXKKw;
    public java.nio.charset.CharsetDecoder AhwBna;
    public CodingErrorAction DbNXlk;
    public java.nio.CharBuffer EZpvd;
    public byte[] KWHzl;
    public int OLrzqt;
    public boolean copydefault;
    public ByteArrayBuffer djBIcL;
    public C59798zno fetchVPNInfo;
    public java.nio.charset.Charset gEmmrt;
    public int isConnected;
    public java.io.InputStream valueOf;
    public CodingErrorAction values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59758znA
    public InterfaceC59809znz AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.AEQbTJ < this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59801znr
    public int valueOf() {
        return this.OLrzqt - this.AEQbTJ;
    }

    public void OLrzqt(java.io.InputStream inputStream, int i, InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(inputStream, "Input stream");
        C59851zoo.KWHzl(i, "Buffer size");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        this.valueOf = inputStream;
        this.KWHzl = new byte[i];
        this.AEQbTJ = 0;
        this.OLrzqt = 0;
        this.djBIcL = new ByteArrayBuffer(i);
        java.lang.String str = (java.lang.String) interfaceC59779znV.getParameter("http.protocol.element-charset");
        java.nio.charset.Charset charsetForName = str != null ? java.nio.charset.Charset.forName(str) : C59514ziV.EZpvd;
        this.gEmmrt = charsetForName;
        this.copydefault = charsetForName.equals(C59514ziV.EZpvd);
        this.AhwBna = null;
        this.AYXKKw = interfaceC59779znV.getIntParameter("http.connection.max-line-length", -1);
        this.isConnected = interfaceC59779znV.getIntParameter("http.connection.min-chunk-limit", 512);
        this.fetchVPNInfo = OLrzqt();
        CodingErrorAction codingErrorAction = (CodingErrorAction) interfaceC59779znV.getParameter("http.malformed.input.action");
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.DbNXlk = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) interfaceC59779znV.getParameter("http.unmappable.input.action");
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.values = codingErrorAction2;
    }

    public C59798zno OLrzqt() {
        return new C59798zno();
    }

    public int EZpvd() throws java.io.IOException {
        int i = this.AEQbTJ;
        if (i > 0) {
            int i2 = this.OLrzqt - i;
            if (i2 > 0) {
                byte[] bArr = this.KWHzl;
                java.lang.System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.AEQbTJ = 0;
            this.OLrzqt = i2;
        }
        int i3 = this.OLrzqt;
        byte[] bArr2 = this.KWHzl;
        int i4 = this.valueOf.read(bArr2, i3, bArr2.length - i3);
        if (i4 == -1) {
            return -1;
        }
        this.OLrzqt = i3 + i4;
        this.fetchVPNInfo.EZpvd(i4);
        return i4;
    }

    @Override // o.InterfaceC59758znA
    public int KWHzl() throws java.io.IOException {
        while (!djBIcL()) {
            if (EZpvd() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.KWHzl;
        int i = this.AEQbTJ;
        this.AEQbTJ = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    @Override // o.InterfaceC59758znA
    public int EZpvd(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (bArr == null) {
            return 0;
        }
        if (djBIcL()) {
            int iMin = java.lang.Math.min(i2, this.OLrzqt - this.AEQbTJ);
            java.lang.System.arraycopy(this.KWHzl, this.AEQbTJ, bArr, i, iMin);
            this.AEQbTJ += iMin;
            return iMin;
        }
        if (i2 > this.isConnected) {
            int i3 = this.valueOf.read(bArr, i, i2);
            if (i3 > 0) {
                this.fetchVPNInfo.EZpvd(i3);
            }
            return i3;
        }
        while (!djBIcL()) {
            if (EZpvd() == -1) {
                return -1;
            }
        }
        int iMin2 = java.lang.Math.min(i2, this.OLrzqt - this.AEQbTJ);
        java.lang.System.arraycopy(this.KWHzl, this.AEQbTJ, bArr, i, iMin2);
        this.AEQbTJ += iMin2;
        return iMin2;
    }

    public final int AYXKKw() {
        for (int i = this.AEQbTJ; i < this.OLrzqt; i++) {
            if (this.KWHzl[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.InterfaceC59758znA
    public int EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer) throws java.io.IOException {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        boolean z = true;
        int iEZpvd = 0;
        while (z) {
            int iAYXKKw = AYXKKw();
            if (iAYXKKw != -1) {
                if (this.djBIcL.isEmpty()) {
                    return AEQbTJ(charArrayBuffer, iAYXKKw);
                }
                int i = iAYXKKw + 1;
                int i2 = this.AEQbTJ;
                this.djBIcL.append(this.KWHzl, i2, i - i2);
                this.AEQbTJ = i;
            } else {
                if (djBIcL()) {
                    int i3 = this.OLrzqt;
                    int i4 = this.AEQbTJ;
                    this.djBIcL.append(this.KWHzl, i4, i3 - i4);
                    this.AEQbTJ = this.OLrzqt;
                }
                iEZpvd = EZpvd();
                if (iEZpvd == -1) {
                }
                if (this.AYXKKw <= 0 && this.djBIcL.length() >= this.AYXKKw) {
                    throw new java.io.IOException("Maximum line length limit exceeded");
                }
            }
            z = false;
            if (this.AYXKKw <= 0) {
            }
        }
        if (iEZpvd == -1 && this.djBIcL.isEmpty()) {
            return -1;
        }
        return AEQbTJ(charArrayBuffer);
    }

    public final int AEQbTJ(org.apache.http.util.CharArrayBuffer charArrayBuffer) throws java.io.IOException {
        int length = this.djBIcL.length();
        if (length > 0) {
            int i = length - 1;
            if (this.djBIcL.byteAt(i) == 10) {
                length = i;
            }
            if (length > 0) {
                int i2 = length - 1;
                if (this.djBIcL.byteAt(i2) == 13) {
                    length = i2;
                }
            }
        }
        if (this.copydefault) {
            charArrayBuffer.append(this.djBIcL, 0, length);
        } else {
            length = copydefault(charArrayBuffer, java.nio.ByteBuffer.wrap(this.djBIcL.buffer(), 0, length));
        }
        this.djBIcL.clear();
        return length;
    }

    public final int AEQbTJ(org.apache.http.util.CharArrayBuffer charArrayBuffer, int i) throws java.io.IOException {
        int i2 = this.AEQbTJ;
        this.AEQbTJ = i + 1;
        if (i > i2) {
            int i3 = i - 1;
            if (this.KWHzl[i3] == 13) {
                i = i3;
            }
        }
        int i4 = i - i2;
        if (this.copydefault) {
            charArrayBuffer.append(this.KWHzl, i2, i4);
            return i4;
        }
        return copydefault(charArrayBuffer, java.nio.ByteBuffer.wrap(this.KWHzl, i2, i4));
    }

    public final int copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int iCopydefault = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.AhwBna == null) {
            java.nio.charset.CharsetDecoder charsetDecoderNewDecoder = this.gEmmrt.newDecoder();
            this.AhwBna = charsetDecoderNewDecoder;
            charsetDecoderNewDecoder.onMalformedInput(this.DbNXlk);
            this.AhwBna.onUnmappableCharacter(this.values);
        }
        if (this.EZpvd == null) {
            this.EZpvd = java.nio.CharBuffer.allocate(1024);
        }
        this.AhwBna.reset();
        while (byteBuffer.hasRemaining()) {
            iCopydefault += copydefault(this.AhwBna.decode(byteBuffer, this.EZpvd, true), charArrayBuffer, byteBuffer);
        }
        int iCopydefault2 = copydefault(this.AhwBna.flush(this.EZpvd), charArrayBuffer, byteBuffer);
        this.EZpvd.clear();
        return iCopydefault + iCopydefault2;
    }

    public final int copydefault(CoderResult coderResult, org.apache.http.util.CharArrayBuffer charArrayBuffer, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.EZpvd.flip();
        int iRemaining = this.EZpvd.remaining();
        while (this.EZpvd.hasRemaining()) {
            charArrayBuffer.append(this.EZpvd.get());
        }
        this.EZpvd.compact();
        return iRemaining;
    }
}

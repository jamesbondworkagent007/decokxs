package o;

import com.google.common.base.Ascii;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.util.ByteArrayBuffer;

/* JADX INFO: renamed from: o.znh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public abstract class AbstractC59791znh implements InterfaceC59808zny, InterfaceC59801znr {
    public static final byte[] AEQbTJ = {Ascii.CR, 10};
    public CodingErrorAction AYXKKw;
    public java.nio.charset.CharsetEncoder AhwBna;
    public ByteArrayBuffer EZpvd;
    public java.nio.charset.Charset KWHzl;
    public boolean OLrzqt;
    public java.nio.ByteBuffer copydefault;
    public int djBIcL;
    public java.io.OutputStream fetchVPNInfo;
    public C59798zno gEmmrt;
    public CodingErrorAction valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59808zny
    public InterfaceC59809znz EZpvd() {
        return this.gEmmrt;
    }

    public void AEQbTJ(java.io.OutputStream outputStream, int i, InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(outputStream, "Input stream");
        C59851zoo.KWHzl(i, "Buffer size");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        this.fetchVPNInfo = outputStream;
        this.EZpvd = new ByteArrayBuffer(i);
        java.lang.String str = (java.lang.String) interfaceC59779znV.getParameter("http.protocol.element-charset");
        java.nio.charset.Charset charsetForName = str != null ? java.nio.charset.Charset.forName(str) : C59514ziV.EZpvd;
        this.KWHzl = charsetForName;
        this.OLrzqt = charsetForName.equals(C59514ziV.EZpvd);
        this.AhwBna = null;
        this.djBIcL = interfaceC59779znV.getIntParameter("http.connection.min-chunk-limit", 512);
        this.gEmmrt = KWHzl();
        CodingErrorAction codingErrorAction = (CodingErrorAction) interfaceC59779znV.getParameter("http.malformed.input.action");
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.AYXKKw = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) interfaceC59779znV.getParameter("http.unmappable.input.action");
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.valueOf = codingErrorAction2;
    }

    public C59798zno KWHzl() {
        return new C59798zno();
    }

    @Override // o.InterfaceC59801znr
    public int valueOf() {
        return this.EZpvd.length();
    }

    public void AEQbTJ() throws java.io.IOException {
        int length = this.EZpvd.length();
        if (length > 0) {
            this.fetchVPNInfo.write(this.EZpvd.buffer(), 0, length);
            this.EZpvd.clear();
            this.gEmmrt.EZpvd(length);
        }
    }

    @Override // o.InterfaceC59808zny
    public void OLrzqt() throws java.io.IOException {
        AEQbTJ();
        this.fetchVPNInfo.flush();
    }

    @Override // o.InterfaceC59808zny
    public void OLrzqt(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (bArr == null) {
            return;
        }
        if (i2 > this.djBIcL || i2 > this.EZpvd.capacity()) {
            AEQbTJ();
            this.fetchVPNInfo.write(bArr, i, i2);
            this.gEmmrt.EZpvd(i2);
        } else {
            if (i2 > this.EZpvd.capacity() - this.EZpvd.length()) {
                AEQbTJ();
            }
            this.EZpvd.append(bArr, i, i2);
        }
    }

    public void copydefault(byte[] bArr) throws java.io.IOException {
        if (bArr == null) {
            return;
        }
        OLrzqt(bArr, 0, bArr.length);
    }

    @Override // o.InterfaceC59808zny
    public void AEQbTJ(int i) throws java.io.IOException {
        if (this.EZpvd.isFull()) {
            AEQbTJ();
        }
        this.EZpvd.append(i);
    }

    @Override // o.InterfaceC59808zny
    public void KWHzl(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.OLrzqt) {
                for (int i = 0; i < str.length(); i++) {
                    AEQbTJ(str.charAt(i));
                }
            } else {
                KWHzl(java.nio.CharBuffer.wrap(str));
            }
        }
        copydefault(AEQbTJ);
    }

    @Override // o.InterfaceC59808zny
    public void copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer) throws java.io.IOException {
        if (charArrayBuffer == null) {
            return;
        }
        int i = 0;
        if (this.OLrzqt) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int iMin = java.lang.Math.min(this.EZpvd.capacity() - this.EZpvd.length(), length);
                if (iMin > 0) {
                    this.EZpvd.append(charArrayBuffer, i, iMin);
                }
                if (this.EZpvd.isFull()) {
                    AEQbTJ();
                }
                i += iMin;
                length -= iMin;
            }
        } else {
            KWHzl(java.nio.CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        copydefault(AEQbTJ);
    }

    public final void KWHzl(java.nio.CharBuffer charBuffer) throws java.io.IOException {
        if (charBuffer.hasRemaining()) {
            if (this.AhwBna == null) {
                java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = this.KWHzl.newEncoder();
                this.AhwBna = charsetEncoderNewEncoder;
                charsetEncoderNewEncoder.onMalformedInput(this.AYXKKw);
                this.AhwBna.onUnmappableCharacter(this.valueOf);
            }
            if (this.copydefault == null) {
                this.copydefault = java.nio.ByteBuffer.allocate(1024);
            }
            this.AhwBna.reset();
            while (charBuffer.hasRemaining()) {
                copydefault(this.AhwBna.encode(charBuffer, this.copydefault, true));
            }
            copydefault(this.AhwBna.flush(this.copydefault));
            this.copydefault.clear();
        }
    }

    public final void copydefault(CoderResult coderResult) throws java.io.IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.copydefault.flip();
        while (this.copydefault.hasRemaining()) {
            AEQbTJ(this.copydefault.get());
        }
        this.copydefault.compact();
    }
}

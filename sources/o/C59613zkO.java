package o;

import org.apache.http.entity.ContentType;

/* JADX INFO: renamed from: o.zkO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59613zkO extends AbstractC59615zkQ implements java.lang.Cloneable {
    public final int AEQbTJ;
    public final int EZpvd;
    public final byte[] KWHzl;

    @java.lang.Deprecated
    public final byte[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public long getContentLength() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC59576zje
    public boolean isRepeatable() {
        return true;
    }

    @Override // o.InterfaceC59576zje
    public boolean isStreaming() {
        return false;
    }

    public C59613zkO(byte[] bArr, ContentType contentType) {
        C59851zoo.AEQbTJ(bArr, "Source byte array");
        this.copydefault = bArr;
        this.KWHzl = bArr;
        this.EZpvd = 0;
        this.AEQbTJ = bArr.length;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    @Override // o.InterfaceC59576zje
    public java.io.InputStream getContent() {
        return new java.io.ByteArrayInputStream(this.KWHzl, this.EZpvd, this.AEQbTJ);
    }

    @Override // o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        outputStream.write(this.KWHzl, this.EZpvd, this.AEQbTJ);
        outputStream.flush();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}

package o;

/* JADX INFO: renamed from: o.zkR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59616zkR extends AbstractC59615zkQ {
    public byte[] KWHzl;
    public java.io.Serializable copydefault;

    @Override // o.InterfaceC59576zje
    public boolean isRepeatable() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public boolean isStreaming() {
        return this.KWHzl == null;
    }

    public C59616zkR(java.io.Serializable serializable) {
        C59851zoo.AEQbTJ(serializable, "Source object");
        this.copydefault = serializable;
    }

    public final void KWHzl(java.io.Serializable serializable) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.KWHzl = byteArrayOutputStream.toByteArray();
    }

    @Override // o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.lang.IllegalStateException, java.io.IOException {
        if (this.KWHzl == null) {
            KWHzl(this.copydefault);
        }
        return new java.io.ByteArrayInputStream(this.KWHzl);
    }

    @Override // o.InterfaceC59576zje
    public long getContentLength() {
        if (this.KWHzl == null) {
            return -1L;
        }
        return r0.length;
    }

    @Override // o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        byte[] bArr = this.KWHzl;
        if (bArr == null) {
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.copydefault);
            objectOutputStream.flush();
        } else {
            outputStream.write(bArr);
            outputStream.flush();
        }
    }
}

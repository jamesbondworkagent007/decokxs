package o;

/* JADX INFO: renamed from: o.zkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59611zkM extends C59620zkV {
    public final byte[] AEQbTJ;

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public boolean isRepeatable() {
        return true;
    }

    public C59611zkM(InterfaceC59576zje interfaceC59576zje) throws java.io.IOException {
        super(interfaceC59576zje);
        if (interfaceC59576zje.isRepeatable() && interfaceC59576zje.getContentLength() >= 0) {
            this.AEQbTJ = null;
            return;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        interfaceC59576zje.writeTo(byteArrayOutputStream);
        byteArrayOutputStream.flush();
        this.AEQbTJ = byteArrayOutputStream.toByteArray();
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public long getContentLength() {
        if (this.AEQbTJ != null) {
            return r0.length;
        }
        return super.getContentLength();
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.io.IOException {
        if (this.AEQbTJ != null) {
            return new java.io.ByteArrayInputStream(this.AEQbTJ);
        }
        return super.getContent();
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public boolean isChunked() {
        return this.AEQbTJ == null && super.isChunked();
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        byte[] bArr = this.AEQbTJ;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.writeTo(outputStream);
        }
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public boolean isStreaming() {
        return this.AEQbTJ == null && super.isStreaming();
    }
}

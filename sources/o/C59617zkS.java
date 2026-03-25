package o;

import org.apache.http.entity.ContentType;

/* JADX INFO: renamed from: o.zkS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59617zkS extends AbstractC59615zkQ implements java.lang.Cloneable {
    public final java.io.File OLrzqt;

    @Override // o.InterfaceC59576zje
    public boolean isRepeatable() {
        return true;
    }

    @Override // o.InterfaceC59576zje
    public boolean isStreaming() {
        return false;
    }

    public C59617zkS(java.io.File file, ContentType contentType) {
        this.OLrzqt = (java.io.File) C59851zoo.AEQbTJ(file, "File");
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    @Override // o.InterfaceC59576zje
    public long getContentLength() {
        return this.OLrzqt.length();
    }

    @Override // o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.io.IOException {
        return new java.io.FileInputStream(this.OLrzqt);
    }

    @Override // o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.OLrzqt);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i != -1) {
                    outputStream.write(bArr, 0, i);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            fileInputStream.close();
        }
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}

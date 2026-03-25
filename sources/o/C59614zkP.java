package o;

/* JADX INFO: renamed from: o.zkP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59614zkP extends AbstractC59615zkQ {
    public long AEQbTJ = -1;
    public java.io.InputStream OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(long j) {
        this.AEQbTJ = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.io.InputStream inputStream) {
        this.OLrzqt = inputStream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public long getContentLength() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC59576zje
    public boolean isRepeatable() {
        return false;
    }

    @Override // o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.lang.IllegalStateException {
        C59849zom.EZpvd(this.OLrzqt != null, "Content has not been provided");
        return this.OLrzqt;
    }

    @Override // o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        java.io.InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = content.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            }
        } finally {
            content.close();
        }
    }

    @Override // o.InterfaceC59576zje
    public boolean isStreaming() {
        java.io.InputStream inputStream = this.OLrzqt;
        return (inputStream == null || inputStream == C59799znp.OLrzqt) ? false : true;
    }
}

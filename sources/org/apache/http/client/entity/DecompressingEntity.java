package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.C59620zkV;
import o.C59851zoo;
import o.InterfaceC59518ziZ;
import o.InterfaceC59576zje;

/* JADX INFO: loaded from: classes24.dex */
public class DecompressingEntity extends C59620zkV {
    private static final int BUFFER_SIZE = 2048;
    private InputStream content;
    private final InputStreamFactory inputStreamFactory;

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public InterfaceC59518ziZ getContentEncoding() {
        return null;
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public long getContentLength() {
        return -1L;
    }

    public DecompressingEntity(InterfaceC59576zje interfaceC59576zje, InputStreamFactory inputStreamFactory) {
        super(interfaceC59576zje);
        this.inputStreamFactory = inputStreamFactory;
    }

    private InputStream getDecompressingStream() throws IOException {
        return new LazyDecompressingInputStream(this.wrappedEntity.getContent(), this.inputStreamFactory);
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public InputStream getContent() throws IOException {
        if (!this.wrappedEntity.isStreaming()) {
            return getDecompressingStream();
        }
        if (this.content == null) {
            this.content = getDecompressingStream();
        }
        return this.content;
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public void writeTo(OutputStream outputStream) throws IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[2048];
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
}

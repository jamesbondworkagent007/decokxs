package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import o.C59620zkV;
import o.C59851zoo;
import o.InterfaceC59518ziZ;
import o.InterfaceC59576zje;
import org.apache.http.message.BasicHeader;

/* JADX INFO: loaded from: classes24.dex */
public class GzipCompressingEntity extends C59620zkV {
    private static final String GZIP_CODEC = "gzip";

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public long getContentLength() {
        return -1L;
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public boolean isChunked() {
        return true;
    }

    public GzipCompressingEntity(InterfaceC59576zje interfaceC59576zje) {
        super(interfaceC59576zje);
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public InterfaceC59518ziZ getContentEncoding() {
        return new BasicHeader("Content-Encoding", GZIP_CODEC);
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public InputStream getContent() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // o.C59620zkV, o.InterfaceC59576zje
    public void writeTo(OutputStream outputStream) throws IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        this.wrappedEntity.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}

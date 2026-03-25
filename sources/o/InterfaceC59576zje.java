package o;

/* JADX INFO: renamed from: o.zje, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59576zje {
    @java.lang.Deprecated
    void consumeContent() throws java.io.IOException;

    java.io.InputStream getContent() throws java.lang.UnsupportedOperationException, java.io.IOException;

    InterfaceC59518ziZ getContentEncoding();

    long getContentLength();

    InterfaceC59518ziZ getContentType();

    boolean isChunked();

    boolean isRepeatable();

    boolean isStreaming();

    void writeTo(java.io.OutputStream outputStream) throws java.io.IOException;
}

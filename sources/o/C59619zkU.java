package o;

import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.entity.ContentType;

/* JADX INFO: renamed from: o.zkU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59619zkU extends AbstractC59615zkQ implements java.lang.Cloneable {
    protected final byte[] content;

    @Override // o.InterfaceC59576zje
    public boolean isRepeatable() {
        return true;
    }

    @Override // o.InterfaceC59576zje
    public boolean isStreaming() {
        return false;
    }

    public C59619zkU(java.lang.String str, ContentType contentType) throws UnsupportedCharsetException {
        C59851zoo.AEQbTJ(str, "Source string");
        java.nio.charset.Charset charset = contentType != null ? contentType.getCharset() : null;
        this.content = str.getBytes(charset == null ? C59841zoe.OLrzqt : charset);
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    @java.lang.Deprecated
    public C59619zkU(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.io.UnsupportedEncodingException {
        C59851zoo.AEQbTJ(str, "Source string");
        str2 = str2 == null ? "text/plain" : str2;
        str3 = str3 == null ? "ISO-8859-1" : str3;
        this.content = str.getBytes(str3);
        setContentType(str2 + "; charset=" + str3);
    }

    public C59619zkU(java.lang.String str, java.lang.String str2) throws UnsupportedCharsetException {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), str2));
    }

    public C59619zkU(java.lang.String str, java.nio.charset.Charset charset) {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), charset));
    }

    public C59619zkU(java.lang.String str) throws java.io.UnsupportedEncodingException {
        this(str, ContentType.DEFAULT_TEXT);
    }

    @Override // o.InterfaceC59576zje
    public long getContentLength() {
        return this.content.length;
    }

    @Override // o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.io.IOException {
        return new java.io.ByteArrayInputStream(this.content);
    }

    @Override // o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        outputStream.write(this.content);
        outputStream.flush();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}

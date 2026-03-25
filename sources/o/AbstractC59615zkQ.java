package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.BasicHeader;

/* JADX INFO: renamed from: o.zkQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59615zkQ implements InterfaceC59576zje {
    protected static final int OUTPUT_BUFFER_SIZE = 4096;
    protected boolean chunked;
    protected InterfaceC59518ziZ contentEncoding;
    protected InterfaceC59518ziZ contentType;

    @Override // o.InterfaceC59576zje
    @java.lang.Deprecated
    public void consumeContent() throws java.io.IOException {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public InterfaceC59518ziZ getContentEncoding() {
        return this.contentEncoding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public InterfaceC59518ziZ getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public boolean isChunked() {
        return this.chunked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setChunked(boolean z) {
        this.chunked = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setContentEncoding(InterfaceC59518ziZ interfaceC59518ziZ) {
        this.contentEncoding = interfaceC59518ziZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setContentType(InterfaceC59518ziZ interfaceC59518ziZ) {
        this.contentType = interfaceC59518ziZ;
    }

    public void setContentType(java.lang.String str) {
        setContentType(str != null ? new BasicHeader("Content-Type", str) : null);
    }

    public void setContentEncoding(java.lang.String str) {
        setContentEncoding(str != null ? new BasicHeader("Content-Encoding", str) : null);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        if (this.contentType != null) {
            sb.append("Content-Type: ");
            sb.append(this.contentType.getValue());
            sb.append(AbstractJsonLexerKt.COMMA);
        }
        if (this.contentEncoding != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.contentEncoding.getValue());
            sb.append(AbstractJsonLexerKt.COMMA);
        }
        long contentLength = getContentLength();
        if (contentLength >= 0) {
            sb.append("Content-Length: ");
            sb.append(contentLength);
            sb.append(AbstractJsonLexerKt.COMMA);
        }
        sb.append("Chunked: ");
        sb.append(this.chunked);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}

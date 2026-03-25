package o;

import android.support.v4.media.session.PlaybackStateCompat;
import org.apache.http.entity.ContentType;

/* JADX INFO: renamed from: o.zkT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59618zkT extends AbstractC59615zkQ {
    public final java.io.InputStream AEQbTJ;
    public final long EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public java.io.InputStream getContent() throws java.io.IOException {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59576zje
    public long getContentLength() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC59576zje
    public boolean isRepeatable() {
        return false;
    }

    @Override // o.InterfaceC59576zje
    public boolean isStreaming() {
        return true;
    }

    public C59618zkT(java.io.InputStream inputStream, long j, ContentType contentType) {
        this.AEQbTJ = (java.io.InputStream) C59851zoo.AEQbTJ(inputStream, "Source input stream");
        this.EZpvd = j;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    @Override // o.InterfaceC59576zje
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int i;
        C59851zoo.AEQbTJ(outputStream, "Output stream");
        java.io.InputStream inputStream = this.AEQbTJ;
        try {
            byte[] bArr = new byte[4096];
            long j = this.EZpvd;
            if (j < 0) {
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, i2);
                    }
                }
            } else {
                while (j > 0 && (i = inputStream.read(bArr, 0, (int) java.lang.Math.min(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, j))) != -1) {
                    outputStream.write(bArr, 0, i);
                    j -= (long) i;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}

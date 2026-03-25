package o;

import com.airbnb.lottie.network.LottieFetchResult;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55362xiX implements LottieFetchResult, java.io.Closeable {
    public final Response AEQbTJ;
    public byte[] EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.lang.String contentType() {
        return this.OLrzqt;
    }

    public C55362xiX(@NotNull Response response) {
        MediaType mediaTypeContentType;
        Intrinsics.checkNotNullParameter(response, "");
        this.AEQbTJ = response;
        ResponseBody responseBodyBody = response.body();
        this.OLrzqt = (responseBodyBody == null || (mediaTypeContentType = responseBodyBody.contentType()) == null) ? null : mediaTypeContentType.toString();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public boolean isSuccessful() {
        return this.AEQbTJ.isSuccessful();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.io.InputStream bodyByteStream() throws java.io.IOException {
        if (this.EZpvd == null) {
            ResponseBody responseBodyBody = this.AEQbTJ.body();
            if (responseBodyBody == null) {
                throw new java.io.IOException("Response body is null");
            }
            this.EZpvd = responseBodyBody.bytes();
        }
        return new java.io.ByteArrayInputStream(this.EZpvd);
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.lang.String error() {
        if (this.AEQbTJ.isSuccessful()) {
            return null;
        }
        return "Url: " + this.AEQbTJ.request().url() + ", HTTP " + this.AEQbTJ.code() + ": " + this.AEQbTJ.message();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.EZpvd = null;
        this.AEQbTJ.close();
    }
}

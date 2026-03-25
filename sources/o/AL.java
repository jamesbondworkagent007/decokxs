package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AL extends RequestBody {
    public final GI EZpvd;
    public final RequestBody KWHzl;
    public final InterfaceC57843yq copydefault;

    public AL(@NotNull RequestBody requestBody, @NotNull GI gi, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(requestBody, "");
        Intrinsics.checkNotNullParameter(gi, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.KWHzl = requestBody;
        this.EZpvd = gi;
        this.copydefault = interfaceC57843yq;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.KWHzl.contentType();
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return this.KWHzl.isOneShot();
    }

    @Override // okhttp3.RequestBody
    public boolean isDuplex() {
        return this.KWHzl.isDuplex();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.KWHzl.contentLength();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink bufferedSink) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "");
        BufferedSink bufferedSinkBuffer = Okio.buffer(new AQ(bufferedSink, this.EZpvd, this.copydefault));
        this.KWHzl.writeTo(bufferedSinkBuffer);
        if (bufferedSinkBuffer.isOpen()) {
            bufferedSinkBuffer.emit();
        }
    }
}

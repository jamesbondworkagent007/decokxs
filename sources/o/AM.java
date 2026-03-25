package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AM extends ResponseBody {
    public final InterfaceC57843yq AEQbTJ;
    public final ResponseBody EZpvd;
    public final GI copydefault;

    public AM(@NotNull ResponseBody responseBody, @NotNull GI gi, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        Intrinsics.checkNotNullParameter(gi, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.EZpvd = responseBody;
        this.copydefault = gi;
        this.AEQbTJ = interfaceC57843yq;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.EZpvd.contentType();
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.EZpvd.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return Okio.buffer(new AN(this.EZpvd.source(), this.copydefault, this.AEQbTJ));
    }
}

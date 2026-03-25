package o;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/* JADX INFO: renamed from: o.ajz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7449ajz<T> extends RequestBody {
    public RequestBody EZpvd;
    public AbstractC7398ajA<T> KWHzl;

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return true;
    }

    public C7449ajz(RequestBody requestBody, AbstractC7398ajA<T> abstractC7398ajA) {
        this.EZpvd = requestBody;
        this.KWHzl = abstractC7398ajA;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws java.io.IOException {
        return this.EZpvd.contentLength();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.EZpvd.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws java.io.IOException {
        if ((bufferedSink instanceof okio.Buffer) || bufferedSink.toString().contains("com.android.tools.profiler.support.network.HttpTracker$OutputStreamTracker")) {
            this.EZpvd.writeTo(bufferedSink);
            return;
        }
        BufferedSink bufferedSinkBuffer = Okio.buffer(OLrzqt(bufferedSink));
        this.EZpvd.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }

    public final Sink OLrzqt(Sink sink) {
        return new ForwardingSink(sink) { // from class: o.ajz.1
            public long AEQbTJ = 0;
            public long KWHzl = 0;

            @Override // okio.ForwardingSink, okio.Sink
            public void write(okio.Buffer buffer, long j) throws java.io.IOException {
                super.write(buffer, j);
                if (this.KWHzl == 0) {
                    this.KWHzl = C7449ajz.this.contentLength();
                }
                this.AEQbTJ += j;
                C7449ajz.this.KWHzl.copydefault(this.KWHzl, this.AEQbTJ);
            }
        };
    }
}

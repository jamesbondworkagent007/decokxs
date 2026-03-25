package o;

import okhttp3.OKCache;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: renamed from: o.rmI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43276rmI extends OKCache {
    public static volatile C43276rmI AEQbTJ;

    public boolean AEQbTJ(CacheRequest cacheRequest) {
        return cacheRequest != null;
    }

    public C43276rmI(java.io.File file) {
        this(new java.io.File(file, "/okCache/"), 52428800L);
    }

    public C43276rmI(java.io.File file, long j) {
        super(file, j, 201106);
    }

    public static C43276rmI AEQbTJ() {
        if (AEQbTJ == null) {
            synchronized (C43276rmI.class) {
                if (AEQbTJ == null) {
                    AEQbTJ = OLrzqt();
                }
            }
        }
        return AEQbTJ;
    }

    public static C43276rmI OLrzqt() {
        return new C43276rmI(C32979mnm.EZpvd.OLrzqt().getCacheDir());
    }

    @Override // okhttp3.OKCache
    public java.lang.String key(Request request) {
        return C43273rmF.AEQbTJ(request);
    }

    public Response KWHzl(CacheRequest cacheRequest, Response response) throws java.io.IOException {
        Sink sinkBody;
        return (AEQbTJ(cacheRequest) && (sinkBody = cacheRequest.body()) != null) ? KWHzl(response, cacheRequest, sinkBody) : response;
    }

    public Response KWHzl(Response response, CacheRequest cacheRequest, Sink sink) throws java.io.IOException {
        Source sourceKWHzl = KWHzl(response.body().source(), cacheRequest, Okio.buffer(sink));
        return response.newBuilder().body(new RealResponseBody(response.header("Content-Type"), response.body().contentLength(), Okio.buffer(sourceKWHzl))).build();
    }

    public Source KWHzl(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        return new ActionBar(bufferedSource, cacheRequest, bufferedSink);
    }

    /* JADX INFO: renamed from: o.rmI$ActionBar */
    public static class ActionBar implements Source {
        public final BufferedSource AEQbTJ;
        public boolean KWHzl;
        public final CacheRequest OLrzqt;
        public final BufferedSink copydefault;

        public ActionBar(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
            this.AEQbTJ = bufferedSource;
            this.OLrzqt = cacheRequest;
            this.copydefault = bufferedSink;
        }

        @Override // okio.Source
        public long read(okio.Buffer buffer, long j) throws java.io.IOException {
            try {
                long j2 = this.AEQbTJ.read(buffer, j);
                if (j2 == -1) {
                    KWHzl();
                    return -1L;
                }
                EZpvd(buffer, j2);
                return j2;
            } catch (java.io.IOException e) {
                copydefault();
                throw e;
            }
        }

        public void copydefault() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.OLrzqt.abort();
        }

        public void KWHzl() throws java.io.IOException {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.copydefault.close();
        }

        public void EZpvd(okio.Buffer buffer, long j) throws java.io.IOException {
            buffer.copyTo(this.copydefault.buffer(), buffer.size() - j, j);
            this.copydefault.emitCompleteSegments();
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.AEQbTJ.timeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            if (!this.KWHzl && !Util.discard(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                this.KWHzl = true;
                this.OLrzqt.abort();
            }
            this.AEQbTJ.close();
        }
    }
}

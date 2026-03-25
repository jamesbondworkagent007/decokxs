package o;

import aws.smithy.kotlin.runtime.http.engine.internal.HttpClientMetrics$connectionUsageHandle$1;
import aws.smithy.kotlin.runtime.http.engine.internal.HttpClientMetrics$requestsHandle$1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.GD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AK implements java.io.Closeable {
    public volatile /* synthetic */ long AYXKKw;
    public volatile /* synthetic */ long AhwBna;
    public volatile /* synthetic */ long AkhnZx;
    public final GE AuCTel;
    public final GI DbNXlk;
    public volatile /* synthetic */ long djBIcL;
    public final FZ ejfBZ;
    public final GG fARcdN;
    public final GB<java.lang.Double> fIwbmz;
    public final GE fJNWhG;
    public volatile /* synthetic */ long fetchVPNInfo;
    public final GB<java.lang.Double> getFieldNames;
    public final GE getNewProxyInstance;
    public final GI isConnected;
    public final GB<java.lang.Double> iwGUEr;
    public final GE uzCIH;
    public volatile /* synthetic */ long valueOf;
    public final GB<java.lang.Double> values;
    public static final /* synthetic */ AtomicLongFieldUpdater KWHzl = AtomicLongFieldUpdater.newUpdater(AK.class, "valueOf");
    public static final /* synthetic */ AtomicLongFieldUpdater AEQbTJ = AtomicLongFieldUpdater.newUpdater(AK.class, "AhwBna");
    public static final /* synthetic */ AtomicLongFieldUpdater EZpvd = AtomicLongFieldUpdater.newUpdater(AK.class, "AYXKKw");
    public static final /* synthetic */ AtomicLongFieldUpdater gEmmrt = AtomicLongFieldUpdater.newUpdater(AK.class, "AkhnZx");
    public static final /* synthetic */ AtomicLongFieldUpdater OLrzqt = AtomicLongFieldUpdater.newUpdater(AK.class, "fetchVPNInfo");
    public static final /* synthetic */ AtomicLongFieldUpdater copydefault = AtomicLongFieldUpdater.newUpdater(AK.class, "djBIcL");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GI EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GI OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> djBIcL() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> gEmmrt() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.fetchVPNInfo;
    }

    public AK(@NotNull java.lang.String str, @NotNull FZ fz) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fz, "");
        this.ejfBZ = fz;
        GG ggEZpvd = fz.EZpvd().EZpvd(str);
        this.fARcdN = ggEZpvd;
        this.valueOf = 0L;
        this.AhwBna = 0L;
        this.AYXKKw = 0L;
        this.AkhnZx = 0L;
        this.fetchVPNInfo = 0L;
        this.djBIcL = 0L;
        this.values = ggEZpvd.AEQbTJ("smithy.client.http.connections.acquire_duration", com.ibm.icu.text.DateFormat.SECOND, "The amount of time requests take to acquire a connection from the pool");
        this.iwGUEr = ggEZpvd.AEQbTJ("smithy.client.http.requests.queued_duration", com.ibm.icu.text.DateFormat.SECOND, "The amount of time a request spent queued waiting to be executed by the HTTP client");
        this.fIwbmz = ggEZpvd.AEQbTJ("smithy.client.http.connections.uptime", com.ibm.icu.text.DateFormat.SECOND, "The amount of time a connection has been open");
        this.fJNWhG = ggEZpvd.AEQbTJ("smithy.client.http.connections.limit", new Function1<GD<java.lang.Long>, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.internal.HttpClientMetrics$connectionLimitHandle$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GD<Long> gd) {
                invoke2(gd);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GD<Long> gd) {
                Intrinsics.checkNotNullParameter(gd, "");
                GD.Activity.record$default(gd, Long.valueOf(this.this$0.valueOf), null, null, 6, null);
            }
        }, "{connection}", "Max connections configured for the HTTP client");
        this.AuCTel = ggEZpvd.AEQbTJ("smithy.client.http.connections.usage", new HttpClientMetrics$connectionUsageHandle$1(this), "{connection}", "Current state of connections (idle, acquired)");
        this.getNewProxyInstance = ggEZpvd.AEQbTJ("smithy.client.http.requests.limit", new Function1<GD<java.lang.Long>, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.internal.HttpClientMetrics$requestsConcurrencyLimitHandle$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GD<Long> gd) {
                invoke2(gd);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GD<Long> gd) {
                Intrinsics.checkNotNullParameter(gd, "");
                GD.Activity.record$default(gd, Long.valueOf(this.this$0.AkhnZx), null, null, 6, null);
            }
        }, "{request}", "Max concurrent requests configured for the HTTP client");
        this.uzCIH = ggEZpvd.AEQbTJ("smithy.client.http.requests.usage", new HttpClientMetrics$requestsHandle$1(this), "{request}", "The current state of HTTP client request concurrency (queued, in-flight)");
        this.isConnected = ggEZpvd.EZpvd("smithy.client.http.bytes_sent", "By", "The total number of bytes sent by the HTTP client");
        this.DbNXlk = ggEZpvd.EZpvd("smithy.client.http.bytes_received", "By", "The total number of bytes received by the HTTP client");
        this.getFieldNames = ggEZpvd.AEQbTJ("smithy.client.http.time_to_first_byte", com.ibm.icu.text.DateFormat.SECOND, "The amount of time after a request has been sent spent waiting on a response from the remote server");
    }

    public final void EZpvd(GD<java.lang.Long> gd) {
        long jAhwBna = AhwBna();
        AG ag = AG.OLrzqt;
        GD.Activity.record$default(gd, java.lang.Long.valueOf(jAhwBna), ag.copydefault(), null, 4, null);
        GD.Activity.record$default(gd, java.lang.Long.valueOf(valueOf()), ag.EZpvd(), null, 4, null);
    }

    public final void OLrzqt(GD<java.lang.Long> gd) {
        long jCopydefault = copydefault();
        AG ag = AG.OLrzqt;
        GD.Activity.record$default(gd, java.lang.Long.valueOf(jCopydefault), ag.OLrzqt(), null, 4, null);
        GD.Activity.record$default(gd, java.lang.Long.valueOf(KWHzl()), ag.KWHzl(), null, 4, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objM7377constructorimpl3;
        java.lang.Object objM7377constructorimpl4;
        Result[] resultArr = new Result[4];
        GE ge = this.fJNWhG;
        try {
            Result.Application application = Result.Companion;
            ge.OLrzqt();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        resultArr[0] = Result.m7376boximpl(objM7377constructorimpl);
        GE ge2 = this.AuCTel;
        try {
            Result.Application application3 = Result.Companion;
            ge2.OLrzqt();
            objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        resultArr[1] = Result.m7376boximpl(objM7377constructorimpl2);
        GE ge3 = this.uzCIH;
        try {
            Result.Application application5 = Result.Companion;
            ge3.OLrzqt();
            objM7377constructorimpl3 = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th3) {
            Result.Application application6 = Result.Companion;
            objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        resultArr[2] = Result.m7376boximpl(objM7377constructorimpl3);
        GE ge4 = this.getNewProxyInstance;
        try {
            Result.Application application7 = Result.Companion;
            ge4.OLrzqt();
            objM7377constructorimpl4 = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th4) {
            Result.Application application8 = Result.Companion;
            objM7377constructorimpl4 = Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
        }
        resultArr[3] = Result.m7376boximpl(objM7377constructorimpl4);
        java.util.List listGEmmrt = yDY.gEmmrt(resultArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(((Result) it.next()).m7386unboximpl());
            if (thM7380exceptionOrNullimpl != null) {
                arrayList.add(thM7380exceptionOrNullimpl);
            }
        }
        java.lang.Throwable th5 = (java.lang.Throwable) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (th5 != null) {
            java.util.Iterator it2 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) arrayList, 1).iterator();
            while (it2.hasNext()) {
                C56379yDe.EZpvd(th5, (java.lang.Throwable) it2.next());
            }
            throw th5;
        }
    }

    public final void KWHzl(long j) {
        do {
        } while (!AEQbTJ.compareAndSet(this, this.AhwBna, j));
    }

    public final void AEQbTJ(long j) {
        do {
        } while (!EZpvd.compareAndSet(this, this.AYXKKw, j));
    }

    public final void OLrzqt(long j) {
        do {
        } while (!OLrzqt.compareAndSet(this, this.fetchVPNInfo, j));
    }

    public final void copydefault(long j) {
        do {
        } while (!copydefault.compareAndSet(this, this.djBIcL, j));
    }
}

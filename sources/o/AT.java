package o;

import aws.smithy.kotlin.runtime.http.engine.AlpnId;
import aws.smithy.kotlin.runtime.net.TlsVersion;
import j$.time.Duration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class AT {

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AlpnId.values().length];
            try {
                iArr[AlpnId.HTTP1_1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AlpnId.HTTP2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AlpnId.H2_PRIOR_KNOWLEDGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[TlsVersion.values().length];
            try {
                iArr2[TlsVersion.TLS_1_0.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TlsVersion.TLS_1_1.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TlsVersion.TLS_1_2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[TlsVersion.TLS_1_3.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr2;
        }
    }

    public static final OkHttpClient OLrzqt(final AS as, final AK ak, java.util.function.Consumer<OkHttpClient.Builder> consumer) {
        Protocol protocol;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.followRedirects(false);
        builder.followSslRedirects(false);
        builder.connectionSpecs(yDY.gEmmrt(copydefault(as.DbNXlk()), ConnectionSpec.CLEARTEXT));
        builder.retryOnConnectionFailure(false);
        Duration durationOfSeconds = Duration.ofSeconds(C59462zhW.DbNXlk(as.KWHzl()), C59462zhW.values(r1));
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "");
        builder.connectTimeout(durationOfSeconds);
        Duration durationOfSeconds2 = Duration.ofSeconds(C59462zhW.DbNXlk(as.valueOf()), C59462zhW.values(r3));
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "");
        builder.readTimeout(durationOfSeconds2);
        Duration durationOfSeconds3 = Duration.ofSeconds(C59462zhW.DbNXlk(as.djBIcL()), C59462zhW.values(r3));
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds3, "");
        builder.writeTimeout(durationOfSeconds3);
        final ConnectionPool connectionPool = new ConnectionPool(5, C59462zhW.gEmmrt(as.EZpvd()), java.util.concurrent.TimeUnit.MILLISECONDS);
        builder.connectionPool(connectionPool);
        final Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(as.AYXKKw());
        dispatcher.setMaxRequestsPerHost(as.isConnected());
        builder.dispatcher(dispatcher);
        builder.eventListenerFactory(new EventListener.Factory() { // from class: o.AW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return AT.AEQbTJ(connectionPool, as, dispatcher, ak, call);
            }
        });
        if (!as.DbNXlk().AEQbTJ().isEmpty()) {
            java.util.List<AlpnId> listAEQbTJ = as.DbNXlk().AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                int i = TaskDescription.copydefault[((AlpnId) it.next()).ordinal()];
                if (i == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else if (i == 2) {
                    protocol = Protocol.HTTP_2;
                } else {
                    protocol = i != 3 ? null : Protocol.H2_PRIOR_KNOWLEDGE;
                }
                if (protocol != null) {
                    arrayList.add(protocol);
                }
            }
            builder.protocols(arrayList);
        }
        builder.proxySelector(new C4250Ba(as.gEmmrt()));
        builder.proxyAuthenticator(new AX(as.gEmmrt()));
        if (consumer == null) {
            builder.dns(new AV(as.copydefault()));
        } else {
            consumer.accept(builder);
        }
        builder.addInterceptor(AP.copydefault);
        return builder.build();
    }

    public static final EventListener AEQbTJ(ConnectionPool connectionPool, AS as, Dispatcher dispatcher, AK ak, Call call) {
        Intrinsics.checkNotNullParameter(connectionPool, "");
        Intrinsics.checkNotNullParameter(as, "");
        Intrinsics.checkNotNullParameter(dispatcher, "");
        Intrinsics.checkNotNullParameter(ak, "");
        Intrinsics.checkNotNullParameter(call, "");
        return new AJ(connectionPool, as.copydefault(), dispatcher, ak, call);
    }

    public static final ConnectionSpec copydefault(AC ac) {
        TlsVersion tlsVersionEZpvd = ac.EZpvd();
        if (tlsVersionEZpvd == null) {
            tlsVersionEZpvd = TlsVersion.TLS_1_2;
        }
        TlsVersion[] tlsVersionArrValues = TlsVersion.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (TlsVersion tlsVersion : tlsVersionArrValues) {
            if (tlsVersion.compareTo(tlsVersionEZpvd) >= 0) {
                arrayList.add(tlsVersion);
            }
        }
        java.util.List listIZzfmt = CollectionsKt___CollectionsKt.iZzfmt(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listIZzfmt, 10));
        java.util.Iterator it = listIZzfmt.iterator();
        while (it.hasNext()) {
            arrayList2.add(OLrzqt((TlsVersion) it.next()));
        }
        okhttp3.TlsVersion[] tlsVersionArr = (okhttp3.TlsVersion[]) arrayList2.toArray(new okhttp3.TlsVersion[0]);
        return new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions((okhttp3.TlsVersion[]) java.util.Arrays.copyOf(tlsVersionArr, tlsVersionArr.length)).build();
    }

    public static final okhttp3.TlsVersion OLrzqt(TlsVersion tlsVersion) {
        int i = TaskDescription.OLrzqt[tlsVersion.ordinal()];
        if (i == 1) {
            return okhttp3.TlsVersion.TLS_1_0;
        }
        if (i == 2) {
            return okhttp3.TlsVersion.TLS_1_1;
        }
        if (i == 3) {
            return okhttp3.TlsVersion.TLS_1_2;
        }
        if (i == 4) {
            return okhttp3.TlsVersion.TLS_1_3;
        }
        throw new NoWhenBranchMatchedException();
    }
}

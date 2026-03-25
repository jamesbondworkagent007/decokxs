package o;

import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.log.NetEventLogListener;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46436tUg {
    public static final C46436tUg OLrzqt = new C46436tUg();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tUj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46436tUg.OLrzqt();
        }
    });
    public static final int KWHzl = 8;

    private C46436tUg() {
    }

    public final OkHttpClient EZpvd() {
        return (OkHttpClient) EZpvd.getValue();
    }

    public static final OkHttpClient OLrzqt() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        builder.readTimeout(30L, timeUnit);
        builder.connectTimeout(30L, timeUnit);
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        builder.retryOnConnectionFailure(!c43292rmY.AuCTel());
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        builder.dns(new C43337rnQ(dohTypeEnum));
        builder.eventListenerFactory(NetEventLogListener.Companion.OLrzqt(c43292rmY.DbNXlk(), NetEventLogListener.Companion.RequestType.NATIVE));
        builder.addInterceptor(new C43334rnN(dohTypeEnum));
        builder.addInterceptor(new C6881aXj());
        builder.dispatcher(C43357rnk.KWHzl.copydefault(ThreadPoolType.HTTP));
        return builder.build();
    }

    public final AbstractC58185ywX<java.lang.Boolean> AEQbTJ(@NotNull final java.lang.String str, @NotNull final kotlin.Pair<? extends java.io.File, byte[]> pair) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pair, "");
        return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.tUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C46436tUg.AEQbTJ(pair, str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C43357rnk.KWHzl.EZpvd(ThreadPoolType.OTHER)).KWHzl(C58266yxz.OLrzqt());
    }

    public static final void AEQbTJ(kotlin.Pair pair, java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        RequestBody requestBodyCreate$default;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            pUU.valueOf("FileUpload", "uploadFile: " + java.lang.Thread.currentThread());
            if (pair.getSecond() != null) {
                RequestBody.Companion companion = RequestBody.Companion;
                java.lang.Object second = pair.getSecond();
                Intrinsics.copydefault(second);
                requestBodyCreate$default = RequestBody.Companion.create$default(companion, (byte[]) second, (MediaType) null, 0, 0, 6, (java.lang.Object) null);
            } else {
                RequestBody.Companion companion2 = RequestBody.Companion;
                java.lang.Object first = pair.getFirst();
                Intrinsics.copydefault(first);
                requestBodyCreate$default = RequestBody.Companion.create$default(companion2, (java.io.File) first, (MediaType) null, 1, (java.lang.Object) null);
            }
            OLrzqt.EZpvd().newCall(new Request.Builder().url(str).put(requestBodyCreate$default).build()).enqueue(new Application(interfaceC58184ywW));
        } catch (java.lang.Exception e) {
            interfaceC58184ywW.onError(e);
            pUU.AEQbTJ("FileUpload", e);
        }
    }

    /* JADX INFO: renamed from: o.tUg$Application */
    public static final class Application implements okhttp3.Callback {
        public final /* synthetic */ InterfaceC58184ywW<java.lang.Boolean> EZpvd;

        public Application(InterfaceC58184ywW<java.lang.Boolean> interfaceC58184ywW) {
            this.EZpvd = interfaceC58184ywW;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, java.io.IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            iOException.printStackTrace();
            this.EZpvd.onError(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            try {
                try {
                    if (response.isSuccessful()) {
                        pUU.valueOf("FileUpload", "uploadFile success: " + response.code());
                        this.EZpvd.onNext(java.lang.Boolean.TRUE);
                        this.EZpvd.onComplete();
                    } else {
                        pUU.copydefault("FileUpload", "Upload failed: " + response.code() + " " + response.message());
                        this.EZpvd.onNext(java.lang.Boolean.FALSE);
                        this.EZpvd.onComplete();
                    }
                } catch (java.lang.Exception e) {
                    this.EZpvd.onError(e);
                    pUU.AEQbTJ("FileUpload", e);
                }
            } finally {
                response.close();
            }
        }
    }
}

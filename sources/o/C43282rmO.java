package o;

import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.log.NetEventLogListener;
import com.okinc.network.proxy.SafeProxySelector;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43282rmO {
    public static final C43286rmS AEQbTJ;
    public static final int EZpvd;
    public static final OkHttpClient.Builder KWHzl;
    public static final C43282rmO OLrzqt;
    public static final ReentrantLock copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43286rmS EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkHttpClient.Builder OLrzqt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReentrantLock copydefault() {
        return copydefault;
    }

    private C43282rmO() {
    }

    static {
        C43282rmO c43282rmO = new C43282rmO();
        OLrzqt = c43282rmO;
        copydefault = new ReentrantLock();
        AEQbTJ = new C43286rmS();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        builder.readTimeout(20L, timeUnit);
        builder.connectTimeout(20L, timeUnit);
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        builder.retryOnConnectionFailure(!c43292rmY.AuCTel());
        builder.dns(new C43337rnQ(DohTypeEnum.HTTP));
        builder.eventListenerFactory(NetEventLogListener.Companion.OLrzqt(c43292rmY.DbNXlk(), NetEventLogListener.Companion.RequestType.NATIVE));
        builder.dispatcher(c43282rmO.AEQbTJ());
        builder.proxySelector(new SafeProxySelector(null, 1, null));
        KWHzl = builder;
        EZpvd = 8;
    }

    public final void EZpvd(@NotNull final Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "");
        KWHzl(new Function1() { // from class: o.rmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43282rmO.AEQbTJ(interceptor, (C43286rmS) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Interceptor interceptor, C43286rmS c43286rmS) {
        Intrinsics.checkNotNullParameter(c43286rmS, "");
        c43286rmS.KWHzl(interceptor);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull Function1<? super C43286rmS, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ReentrantLock reentrantLock = copydefault;
        reentrantLock.lock();
        try {
            function1.invoke(AEQbTJ);
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            copydefault.unlock();
            throw th;
        }
    }

    public final Dispatcher AEQbTJ() {
        Dispatcher dispatcherCopydefault = C43357rnk.KWHzl.copydefault(ThreadPoolType.HTTP);
        if (C43292rmY.OLrzqt.ejfBZ()) {
            dispatcherCopydefault.setMaxRequestsPerHost(20);
        } else {
            dispatcherCopydefault.setMaxRequestsPerHost(40);
        }
        return dispatcherCopydefault;
    }
}

package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class qUV {
    public WeakReference<ConcurrentHashMap<java.lang.String, TickersData>> KWHzl;
    public final ConcurrentHashMap<java.lang.String, SoftReference<TickersData>> OLrzqt = new ConcurrentHashMap<>();

    @yCM
    public qUV() {
    }

    public final TickersData AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        TickersData tickersData;
        ConcurrentHashMap<java.lang.String, TickersData> concurrentHashMap;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            WeakReference<ConcurrentHashMap<java.lang.String, TickersData>> weakReference = this.KWHzl;
            if (weakReference == null || (concurrentHashMap = weakReference.get()) == null || (tickersData = concurrentHashMap.get(str)) == null) {
                SoftReference<TickersData> softReference = this.OLrzqt.get(str);
                tickersData = softReference != null ? softReference.get() : null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(tickersData);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (TickersData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull TickersData tickersData) {
        ConcurrentHashMap<java.lang.String, TickersData> concurrentHashMap;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tickersData, "");
        try {
            Result.Application application = Result.Companion;
            WeakReference<ConcurrentHashMap<java.lang.String, TickersData>> weakReference = this.KWHzl;
            if (weakReference != null && (concurrentHashMap = weakReference.get()) != null) {
                concurrentHashMap.put(str, tickersData);
            }
            this.OLrzqt.put(str, new SoftReference<>(tickersData));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void AEQbTJ(@NotNull ConcurrentHashMap<java.lang.String, TickersData> concurrentHashMap) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(concurrentHashMap, "");
            this.KWHzl = new WeakReference<>(concurrentHashMap);
        }
    }
}

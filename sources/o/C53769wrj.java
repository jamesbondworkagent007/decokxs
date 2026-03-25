package o;

import com.google.android.exoplayer2.database.ExoDatabaseProvider;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.okinc.tradingbot.impl.share.BotVideoPreloader$prefetchUrl$1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53769wrj {
    public static volatile SimpleCache EZpvd;
    public static final C53769wrj AEQbTJ = new C53769wrj();
    public static final CoroutineScope KWHzl = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
    public static final ConcurrentHashMap<java.lang.String, java.lang.Boolean> copydefault = new ConcurrentHashMap<>();
    public static final int OLrzqt = 8;

    private C53769wrj() {
    }

    public final java.lang.String copydefault() {
        return C33492mxV.OLrzqt() ? "https://static.coinall.ltd/cdn/assets/files/261/407E909C7EAE94A1.mp4" : "https://static.coinall.ltd/cdn/assets/files/261/E25575E24F5F2B80.mp4";
    }

    public final CacheDataSource.Factory copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        SimpleCache simpleCacheOLrzqt = EZpvd;
        if (simpleCacheOLrzqt == null) {
            simpleCacheOLrzqt = OLrzqt(context);
        }
        if (simpleCacheOLrzqt == null) {
            return null;
        }
        return new CacheDataSource.Factory().setCache(simpleCacheOLrzqt).setUpstreamDataSourceFactory(new DefaultDataSourceFactory(context, "OKX")).setFlags(2);
    }

    public final void AEQbTJ() {
        EZpvd(C43246rlf.OLrzqt.valueOf(), copydefault());
    }

    public final SimpleCache OLrzqt(android.content.Context context) {
        SimpleCache simpleCache;
        if (EZpvd != null) {
            return EZpvd;
        }
        synchronized (this) {
            if (EZpvd != null) {
                return EZpvd;
            }
            try {
                EZpvd = new SimpleCache(new java.io.File(context.getCacheDir(), "bot_video_cache"), new LeastRecentlyUsedCacheEvictor(307200L), new ExoDatabaseProvider(context));
                simpleCache = EZpvd;
            } catch (java.lang.Exception unused) {
                simpleCache = null;
            }
            return simpleCache;
        }
    }

    public final void EZpvd(android.content.Context context, java.lang.String str) {
        SimpleCache simpleCacheOLrzqt;
        if (copydefault.putIfAbsent(str, java.lang.Boolean.TRUE) == null && (simpleCacheOLrzqt = OLrzqt(context)) != null) {
            BuildersKt__Builders_commonKt.launch$default(KWHzl, null, null, new BotVideoPreloader$prefetchUrl$1(context, simpleCacheOLrzqt, str, null), 3, null);
        }
    }
}

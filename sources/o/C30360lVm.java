package o;

import androidx.compose.material3.CalendarModelKt;
import com.okinc.cache.CacheConfig;
import com.okinc.cache.CacheManager$clearCache$1;
import com.okinc.cache.CacheManager$getCacheSize$1;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30360lVm {
    public static Job AEQbTJ;
    public static final java.util.List<StateListAnimator> EZpvd;
    public static final C30360lVm KWHzl;
    public static Job OLrzqt;
    public static final int copydefault;

    /* JADX INFO: renamed from: o.lVm$StateListAnimator */
    public interface StateListAnimator {
        long OLrzqt(@NotNull android.content.Context context);

        void copydefault(@NotNull android.content.Context context);
    }

    private C30360lVm() {
    }

    static {
        C30360lVm c30360lVm = new C30360lVm();
        KWHzl = c30360lVm;
        EZpvd = new java.util.ArrayList();
        c30360lVm.AEQbTJ(new TaskDescription());
        copydefault = 8;
    }

    public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            EZpvd.add(stateListAnimator);
        }
    }

    public static /* synthetic */ void getCacheSize$default(C30360lVm c30360lVm, android.content.Context context, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        if ((i & 4) != 0) {
            coroutineDispatcher2 = Dispatchers.getMain();
        }
        c30360lVm.copydefault(context, coroutineDispatcher, coroutineDispatcher2, function1);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull Function1<? super java.lang.Long, Unit> function1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
            Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            KWHzl();
            OLrzqt();
            OLrzqt = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new CacheManager$getCacheSize$1(coroutineDispatcher2, context, function1, null), 3, null);
        }
    }

    public final void KWHzl() {
        C43296rmc.AEQbTJ("CacheManager", "cancelGetCacheSize");
        Job job = OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        OLrzqt = null;
    }

    public static /* synthetic */ void clearCache$default(C30360lVm c30360lVm, android.content.Context context, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c30360lVm.KWHzl(context, z, function1);
    }

    public final void KWHzl(@NotNull android.content.Context context, boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function1, "");
            KWHzl(context, z, Dispatchers.getIO(), Dispatchers.getMain(), function1);
        }
    }

    public static /* synthetic */ void clearCache$default(C30360lVm c30360lVm, android.content.Context context, boolean z, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcher;
        if ((i & 8) != 0) {
            coroutineDispatcher2 = Dispatchers.getMain();
        }
        c30360lVm.KWHzl(context, z2, coroutineDispatcher3, coroutineDispatcher2, function1);
    }

    public final void KWHzl(@NotNull android.content.Context context, boolean z, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
            Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (!z) {
                CacheConfig cacheConfig = (CacheConfig) C48787ucK.AEQbTJ.EZpvd("cacheConfig", CacheConfig.class);
                long clearInterval = (cacheConfig != null ? cacheConfig.getClearInterval() : 0L) * CalendarModelKt.MillisecondsIn24Hours;
                C43296rmc.AEQbTJ("CacheManager", "cacheClearGap: " + clearInterval);
                if (clearInterval <= 0) {
                    function1.invoke(java.lang.Boolean.FALSE);
                    return;
                } else {
                    if (java.lang.System.currentTimeMillis() - clearInterval < SPUtils.getLong("app_cache_clear_time", 0L).longValue()) {
                        function1.invoke(java.lang.Boolean.FALSE);
                        return;
                    }
                }
            }
            SPUtils.put("app_cache_clear_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            KWHzl();
            OLrzqt();
            AEQbTJ = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new CacheManager$clearCache$1(coroutineDispatcher2, context, function1, null), 3, null);
        }
    }

    public final void OLrzqt() {
        Job job = AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        AEQbTJ = null;
    }

    public final long AEQbTJ(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        long length = 0;
        for (java.io.File file2 : yFJ.djBIcL(file)) {
            length += file2.isFile() ? file2.length() : 0L;
        }
        return length;
    }

    /* JADX INFO: renamed from: o.lVm$TaskDescription */
    public static final class TaskDescription implements StateListAnimator {
        @Override // o.C30360lVm.StateListAnimator
        public long OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C30360lVm c30360lVm = C30360lVm.KWHzl;
            java.io.File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "");
            long jAEQbTJ = c30360lVm.AEQbTJ(cacheDir);
            java.io.File externalCacheDir = context.getExternalCacheDir();
            return externalCacheDir != null ? jAEQbTJ + c30360lVm.AEQbTJ(externalCacheDir) : jAEQbTJ;
        }

        @Override // o.C30360lVm.StateListAnimator
        public void copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.io.File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "");
            yFL.AkhnZx(cacheDir);
            java.io.File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                yFL.AkhnZx(externalCacheDir);
            }
        }
    }
}

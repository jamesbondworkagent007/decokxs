package o;

import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home_token_list.repo.TokenListFilterCacheRepo$get$2;
import com.okinc.business.market.features.home_token_list.repo.TokenListFilterCacheRepo$getInterval$2;
import com.okinc.business.market.features.home_token_list.repo.TokenListFilterCacheRepo$put$2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28548kcp {
    public final ConcurrentHashMap<java.lang.String, AdvancedFilter> AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C28548kcp(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = new ConcurrentHashMap<>();
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull AdvancedFilter advancedFilter, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new TokenListFilterCacheRepo$put$2(this, str, advancedFilter, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull AdvancedFilter advancedFilter, @NotNull Continuation<? super AdvancedFilter> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new TokenListFilterCacheRepo$get$2(this, str, advancedFilter, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super TimeIntervalType> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new TokenListFilterCacheRepo$getInterval$2(null), continuation);
    }
}

package o;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.usecase.relationlist.ObserveServerSuggestedFriendRelationsUseCase$execute$1;
import com.okinc.im.usecase.relationlist.ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1;
import com.okinc.im.usecase.relationlist.ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2;
import com.okinc.im.usecase.relationlist.ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3;
import com.okinc.network.okg.cache.CacheStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35873oGw {
    public final oCG AEQbTJ;
    public final C35867oGq KWHzl;
    public final sKN copydefault;

    /* JADX INFO: renamed from: o.oGw$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChatOrigin.values().length];
            try {
                iArr[ChatOrigin.P2P.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C35873oGw(@NotNull C35867oGq c35867oGq, @NotNull oCG ocg, @NotNull sKN skn) {
        Intrinsics.checkNotNullParameter(c35867oGq, "");
        Intrinsics.checkNotNullParameter(ocg, "");
        Intrinsics.checkNotNullParameter(skn, "");
        this.KWHzl = c35867oGq;
        this.AEQbTJ = ocg;
        this.copydefault = skn;
    }

    public final Flow<java.util.List<C37248oqJ>> OLrzqt(ChatOrigin chatOrigin) {
        CacheStrategy cacheStrategy;
        if (C33129mqd.AhwBna(sGG.copydefault.copydefault()) < sEI.KWHzl.copydefault()) {
            cacheStrategy = CacheStrategy.NO_CACHE;
        } else {
            cacheStrategy = CacheStrategy.FIRST_CACHE;
        }
        Flow flowOnEach = FlowKt.onEach(FlowKt.flatMapConcat(FlowKt.flow(new ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1(this, cacheStrategy, null)), new ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$2(this, null)), new ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$3(null));
        if (chatOrigin != null && StateListAnimator.OLrzqt[chatOrigin.ordinal()] == 1) {
            return FlowKt.flowOf(yDY.AhwBna());
        }
        return FlowKt.combine(flowOnEach, this.AEQbTJ.OLrzqt(), new ObserveServerSuggestedFriendRelationsUseCase$execute$1(null));
    }
}

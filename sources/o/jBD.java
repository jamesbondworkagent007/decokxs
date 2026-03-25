package o;

import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$fetchConfiguration$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$getLeaderBoardData$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$getLeaderBoardData0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$getLeaderBoardKolStrategy$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$getLeaderBoardKolStrategygIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$getRecommendedAddress$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$getRecommendedAddress0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$getUserSortSelection$2;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$saveUserSortSelection$2;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardUseCase$subscribeLeaderBoardCards$2;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBD {
    public final C28586kda EZpvd;
    public final jBZ KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public jBD(@NotNull C28586kda c28586kda, @NotNull jBZ jbz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jbz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c28586kda;
        this.KWHzl = jbz;
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jBD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: getLeaderBoardData-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8632getLeaderBoardData0E7RQCE$default(jBD jbd, jBH jbh, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return jbd.EZpvd(jbh, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull jBH jbh, @NotNull java.lang.String str, @NotNull Continuation<? super Result<jBB>> continuation) throws java.lang.Throwable {
        LeaderBoardUseCase$getLeaderBoardData$1 leaderBoardUseCase$getLeaderBoardData$1;
        if (continuation instanceof LeaderBoardUseCase$getLeaderBoardData$1) {
            leaderBoardUseCase$getLeaderBoardData$1 = (LeaderBoardUseCase$getLeaderBoardData$1) continuation;
            int i = leaderBoardUseCase$getLeaderBoardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardUseCase$getLeaderBoardData$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardUseCase$getLeaderBoardData$1 = new LeaderBoardUseCase$getLeaderBoardData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = leaderBoardUseCase$getLeaderBoardData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardUseCase$getLeaderBoardData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            LeaderBoardUseCase$getLeaderBoardData0E7RQCE$$inlined$dexRunCatching$1 leaderBoardUseCase$getLeaderBoardData0E7RQCE$$inlined$dexRunCatching$1 = new LeaderBoardUseCase$getLeaderBoardData0E7RQCE$$inlined$dexRunCatching$1(null, this, jbh, str);
            leaderBoardUseCase$getLeaderBoardData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, leaderBoardUseCase$getLeaderBoardData0E7RQCE$$inlined$dexRunCatching$1, leaderBoardUseCase$getLeaderBoardData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, int i2, @NotNull Continuation<? super Result<jBB>> continuation) throws java.lang.Throwable {
        LeaderBoardUseCase$getRecommendedAddress$1 leaderBoardUseCase$getRecommendedAddress$1;
        int i3;
        int i4;
        java.lang.Object objOLrzqt;
        jBD jbd;
        java.lang.String strEZpvd;
        if (continuation instanceof LeaderBoardUseCase$getRecommendedAddress$1) {
            leaderBoardUseCase$getRecommendedAddress$1 = (LeaderBoardUseCase$getRecommendedAddress$1) continuation;
            int i5 = leaderBoardUseCase$getRecommendedAddress$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                leaderBoardUseCase$getRecommendedAddress$1.label = i5 - Integer.MIN_VALUE;
            } else {
                leaderBoardUseCase$getRecommendedAddress$1 = new LeaderBoardUseCase$getRecommendedAddress$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = leaderBoardUseCase$getRecommendedAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = leaderBoardUseCase$getRecommendedAddress$1.label;
        if (i6 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            C28586kda c28586kda = this.EZpvd;
            leaderBoardUseCase$getRecommendedAddress$1.L$0 = this;
            i3 = i;
            leaderBoardUseCase$getRecommendedAddress$1.I$0 = i3;
            i4 = i2;
            leaderBoardUseCase$getRecommendedAddress$1.I$1 = i4;
            leaderBoardUseCase$getRecommendedAddress$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(leaderBoardUseCase$getRecommendedAddress$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            jbd = this;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return ((Result) objWithContext).m7386unboximpl();
            }
            int i7 = leaderBoardUseCase$getRecommendedAddress$1.I$1;
            int i8 = leaderBoardUseCase$getRecommendedAddress$1.I$0;
            jBD jbd2 = (jBD) leaderBoardUseCase$getRecommendedAddress$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            objOLrzqt = ((Result) objWithContext).m7386unboximpl();
            i4 = i7;
            i3 = i8;
            jbd = jbd2;
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity == null || (strEZpvd = dexUserIdentity.EZpvd()) == null) {
            strEZpvd = "";
        }
        jBH jbh = new jBH("501", null, null, null, null, new jBI(i3, i4), 30, null);
        CoroutineDispatcher coroutineDispatcher = jbd.OLrzqt;
        LeaderBoardUseCase$getRecommendedAddress0E7RQCE$$inlined$dexRunCatching$1 leaderBoardUseCase$getRecommendedAddress0E7RQCE$$inlined$dexRunCatching$1 = new LeaderBoardUseCase$getRecommendedAddress0E7RQCE$$inlined$dexRunCatching$1(null, jbd, jbh, strEZpvd);
        leaderBoardUseCase$getRecommendedAddress$1.L$0 = null;
        leaderBoardUseCase$getRecommendedAddress$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, leaderBoardUseCase$getRecommendedAddress0E7RQCE$$inlined$dexRunCatching$1, leaderBoardUseCase$getRecommendedAddress$1);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("SP_KEY_LEADERBOARD_DISPLAY_TOKEN", java.lang.Boolean.valueOf(z));
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("SP_KEY_LEADERBOARD_DISPLAY_TOKEN", false);
    }

    public final java.lang.Object OLrzqt(@NotNull RankingSortType rankingSortType, @NotNull Continuation<? super LeaderBoardSortModel> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new LeaderBoardUseCase$getUserSortSelection$2(rankingSortType, this, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull LeaderBoardSortModel leaderBoardSortModel, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new LeaderBoardUseCase$saveUserSortSelection$2(leaderBoardSortModel, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends java.util.List<jBF>>> continuation) throws java.lang.Throwable {
        LeaderBoardUseCase$fetchConfiguration$1 leaderBoardUseCase$fetchConfiguration$1;
        if (continuation instanceof LeaderBoardUseCase$fetchConfiguration$1) {
            leaderBoardUseCase$fetchConfiguration$1 = (LeaderBoardUseCase$fetchConfiguration$1) continuation;
            int i = leaderBoardUseCase$fetchConfiguration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardUseCase$fetchConfiguration$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardUseCase$fetchConfiguration$1 = new LeaderBoardUseCase$fetchConfiguration$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = leaderBoardUseCase$fetchConfiguration$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardUseCase$fetchConfiguration$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            LeaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1 leaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1 = new LeaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1(null, this);
            leaderBoardUseCase$fetchConfiguration$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, leaderBoardUseCase$fetchConfigurationIoAF18A$$inlined$dexRunCatching$1, leaderBoardUseCase$fetchConfiguration$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<TopTradersItem>>> continuation) throws java.lang.Throwable {
        LeaderBoardUseCase$getLeaderBoardKolStrategy$1 leaderBoardUseCase$getLeaderBoardKolStrategy$1;
        if (continuation instanceof LeaderBoardUseCase$getLeaderBoardKolStrategy$1) {
            leaderBoardUseCase$getLeaderBoardKolStrategy$1 = (LeaderBoardUseCase$getLeaderBoardKolStrategy$1) continuation;
            int i = leaderBoardUseCase$getLeaderBoardKolStrategy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardUseCase$getLeaderBoardKolStrategy$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardUseCase$getLeaderBoardKolStrategy$1 = new LeaderBoardUseCase$getLeaderBoardKolStrategy$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = leaderBoardUseCase$getLeaderBoardKolStrategy$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardUseCase$getLeaderBoardKolStrategy$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            LeaderBoardUseCase$getLeaderBoardKolStrategygIAlus$$inlined$dexRunCatching$1 leaderBoardUseCase$getLeaderBoardKolStrategygIAlus$$inlined$dexRunCatching$1 = new LeaderBoardUseCase$getLeaderBoardKolStrategygIAlus$$inlined$dexRunCatching$1(null, this, str);
            leaderBoardUseCase$getLeaderBoardKolStrategy$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, leaderBoardUseCase$getLeaderBoardKolStrategygIAlus$$inlined$dexRunCatching$1, leaderBoardUseCase$getLeaderBoardKolStrategy$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull jBH jbh, @NotNull Continuation<? super Flow<jBB>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new LeaderBoardUseCase$subscribeLeaderBoardCards$2(this, jbh, str, null), continuation);
    }

    public final void copydefault() {
        this.KWHzl.EZpvd();
    }
}

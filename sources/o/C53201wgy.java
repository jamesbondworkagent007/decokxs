package o;

import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AvailableBalanceBody;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AvailableBalanceResponse;
import com.okinc.tradingbot.impl.order.strategy.spotdca.domain.FetchManualAddOrderUseCase$execute$2;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53201wgy extends vNH<Activity, Application> {
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53201wgy(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC50055vAf;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.wgy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wgy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull Activity activity, @NotNull Continuation<? super Application> continuation) {
        return SupervisorKt.supervisorScope(new FetchManualAddOrderUseCase$execute$2(this, activity, null), continuation);
    }

    /* JADX INFO: renamed from: o.wgy$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final AvailableBalanceBody OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, AvailableBalanceBody availableBalanceBody, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                availableBalanceBody = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str2 = activity.copydefault;
            }
            return activity.AEQbTJ(availableBalanceBody, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull AvailableBalanceBody availableBalanceBody, @NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(availableBalanceBody, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(availableBalanceBody, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AvailableBalanceBody OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            java.lang.String str = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(availableBalanceBody=" + this.OLrzqt + ", instId=" + this.AEQbTJ + ", tradeQuoteCcy=" + this.copydefault + ")";
        }

        public Activity(@NotNull AvailableBalanceBody availableBalanceBody, @NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(availableBalanceBody, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = availableBalanceBody;
            this.AEQbTJ = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: renamed from: o.wgy$Application */
    public static final class Application {
        public static final int copydefault = ((LimitPriceData.$stable | StrategyConfigInfo.$stable) | TickersData.$stable) | MaxAvailableResp.$stable;
        public final AvailableBalanceResponse AEQbTJ;
        public final TickersData AYXKKw;
        public final MaxAvailableResp EZpvd;
        public final StrategyConfigInfo KWHzl;
        public final LimitPriceData OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, AvailableBalanceResponse availableBalanceResponse, MaxAvailableResp maxAvailableResp, TickersData tickersData, StrategyConfigInfo strategyConfigInfo, LimitPriceData limitPriceData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                availableBalanceResponse = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                maxAvailableResp = application.EZpvd;
            }
            MaxAvailableResp maxAvailableResp2 = maxAvailableResp;
            if ((i & 4) != 0) {
                tickersData = application.AYXKKw;
            }
            TickersData tickersData2 = tickersData;
            if ((i & 8) != 0) {
                strategyConfigInfo = application.KWHzl;
            }
            StrategyConfigInfo strategyConfigInfo2 = strategyConfigInfo;
            if ((i & 16) != 0) {
                limitPriceData = application.OLrzqt;
            }
            return application.KWHzl(availableBalanceResponse, maxAvailableResp2, tickersData2, strategyConfigInfo2, limitPriceData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StrategyConfigInfo AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LimitPriceData EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AvailableBalanceResponse KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull AvailableBalanceResponse availableBalanceResponse, @NotNull MaxAvailableResp maxAvailableResp, @NotNull TickersData tickersData, @NotNull StrategyConfigInfo strategyConfigInfo, @NotNull LimitPriceData limitPriceData) {
            Intrinsics.checkNotNullParameter(availableBalanceResponse, "");
            Intrinsics.checkNotNullParameter(maxAvailableResp, "");
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
            Intrinsics.checkNotNullParameter(limitPriceData, "");
            return new Application(availableBalanceResponse, maxAvailableResp, tickersData, strategyConfigInfo, limitPriceData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TickersData OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MaxAvailableResp copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, application.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(availableBalanceResponse=" + this.AEQbTJ + ", maxAvailableBalance=" + this.EZpvd + ", tickerData=" + this.AYXKKw + ", config=" + this.KWHzl + ", limitPrice=" + this.OLrzqt + ")";
        }

        public Application(@NotNull AvailableBalanceResponse availableBalanceResponse, @NotNull MaxAvailableResp maxAvailableResp, @NotNull TickersData tickersData, @NotNull StrategyConfigInfo strategyConfigInfo, @NotNull LimitPriceData limitPriceData) {
            Intrinsics.checkNotNullParameter(availableBalanceResponse, "");
            Intrinsics.checkNotNullParameter(maxAvailableResp, "");
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
            Intrinsics.checkNotNullParameter(limitPriceData, "");
            this.AEQbTJ = availableBalanceResponse;
            this.EZpvd = maxAvailableResp;
            this.AYXKKw = tickersData;
            this.KWHzl = strategyConfigInfo;
            this.OLrzqt = limitPriceData;
        }
    }
}

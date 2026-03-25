package o;

import com.okinc.tradingbot.impl.aiBot.domain.usecase.GetBacktestRerunConfigUseCase$execute$2;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCN extends vNH<java.lang.String, StateListAnimator> {
    public final uCK EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final uCJ OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCN(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uCK uck, @NotNull uCJ ucj) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(uck, "");
        Intrinsics.checkNotNullParameter(ucj, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = uck;
        this.OLrzqt = ucj;
    }

    public static final class StateListAnimator {
        public static final int AEQbTJ = AiOrderReq.$stable;
        public final java.lang.String EZpvd;
        public final AiOrderReq OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, AiOrderReq aiOrderReq, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aiOrderReq = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(aiOrderReq, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull AiOrderReq aiOrderReq, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(aiOrderReq, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(aiOrderReq, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AiOrderReq copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(orderReq=" + this.OLrzqt + ", backtestIntervals=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull AiOrderReq aiOrderReq, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(aiOrderReq, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = aiOrderReq;
            this.EZpvd = str;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super StateListAnimator> continuation) {
        return CoroutineScopeKt.coroutineScope(new GetBacktestRerunConfigUseCase$execute$2(this, str, null), continuation);
    }
}

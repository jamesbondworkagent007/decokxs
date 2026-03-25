package o;

import androidx.lifecycle.ViewModel;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.planet_api.PlanetFutureTypeEnum;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tBY extends ViewModel {
    public final SharedFlow<Application> AEQbTJ;
    public final MutableSharedFlow<Application> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Application> AEQbTJ() {
        return this.AEQbTJ;
    }

    public tBY() {
        MutableSharedFlow<Application> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tBY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final class StateListAnimator extends Application {
            public final FutureHistoryBean AEQbTJ;
            public final FuturePositionBean KWHzl;
            public final PlanetFutureTypeEnum copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, FuturePositionBean futurePositionBean, FutureHistoryBean futureHistoryBean, PlanetFutureTypeEnum planetFutureTypeEnum, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    futurePositionBean = stateListAnimator.KWHzl;
                }
                if ((i & 2) != 0) {
                    futureHistoryBean = stateListAnimator.AEQbTJ;
                }
                if ((i & 4) != 0) {
                    planetFutureTypeEnum = stateListAnimator.copydefault;
                }
                return stateListAnimator.KWHzl(futurePositionBean, futureHistoryBean, planetFutureTypeEnum);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FutureHistoryBean EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PlanetFutureTypeEnum KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(FuturePositionBean futurePositionBean, FutureHistoryBean futureHistoryBean, @NotNull PlanetFutureTypeEnum planetFutureTypeEnum) {
                Intrinsics.checkNotNullParameter(planetFutureTypeEnum, "");
                return new StateListAnimator(futurePositionBean, futureHistoryBean, planetFutureTypeEnum);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FuturePositionBean copydefault() {
                return this.KWHzl;
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
                return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.copydefault == stateListAnimator.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                FuturePositionBean futurePositionBean = this.KWHzl;
                int iHashCode = futurePositionBean == null ? 0 : futurePositionBean.hashCode();
                FutureHistoryBean futureHistoryBean = this.AEQbTJ;
                return (((iHashCode * 31) + (futureHistoryBean != null ? futureHistoryBean.hashCode() : 0)) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "PositionSelected(position=" + this.KWHzl + ", historyBean=" + this.AEQbTJ + ", futuresType=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(FuturePositionBean futurePositionBean, FutureHistoryBean futureHistoryBean, @NotNull PlanetFutureTypeEnum planetFutureTypeEnum) {
                super(null);
                Intrinsics.checkNotNullParameter(planetFutureTypeEnum, "");
                this.KWHzl = futurePositionBean;
                this.AEQbTJ = futureHistoryBean;
                this.copydefault = planetFutureTypeEnum;
            }
        }
    }

    public final java.lang.Object copydefault(@NotNull FuturePositionBean futurePositionBean, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEmit = this.EZpvd.emit(new Application.StateListAnimator(futurePositionBean, null, PlanetFutureTypeEnum.CURRENT), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(@NotNull FutureHistoryBean futureHistoryBean, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEmit = this.EZpvd.emit(new Application.StateListAnimator(null, futureHistoryBean, PlanetFutureTypeEnum.HISTORY), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }
}

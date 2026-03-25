package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC27161jpv {

    /* JADX INFO: renamed from: o.jpv$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC27161jpv {
        public final InvestTokenWithAmount AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InvestTokenWithAmount investTokenWithAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investTokenWithAmount = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.AEQbTJ(investTokenWithAmount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull InvestTokenWithAmount investTokenWithAmount) {
            Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
            return new StateListAnimator(investTokenWithAmount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.AEQbTJ, ((StateListAnimator) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SwapOrReceive(tokenInfo=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull InvestTokenWithAmount investTokenWithAmount) {
            Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
            this.AEQbTJ = investTokenWithAmount;
        }
    }

    /* JADX INFO: renamed from: o.jpv$ActionBar */
    public static final class ActionBar implements InterfaceC27161jpv {
        public final java.lang.String EZpvd;
        public final long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, long j, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.EZpvd(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(long j, java.lang.String str) {
            return new ActionBar(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Long.hashCode(this.KWHzl);
            java.lang.String str = this.EZpvd;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PoolProduct(poolInvestmentId=" + this.KWHzl + ", displayProductType=" + this.EZpvd + ")";
        }

        public ActionBar(long j, java.lang.String str) {
            this.KWHzl = j;
            this.EZpvd = str;
        }
    }
}

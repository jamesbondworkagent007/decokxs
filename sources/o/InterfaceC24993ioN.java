package o;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ioN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC24993ioN {

    /* JADX INFO: renamed from: o.ioN$TaskDescription */
    public static final class TaskDescription implements InterfaceC24993ioN {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ioN$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements InterfaceC24993ioN {
        public static final Application copydefault = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.ioN$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements InterfaceC24993ioN {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.ioN$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements InterfaceC24993ioN {
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(int i) {
            return new StateListAnimator(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.OLrzqt == ((StateListAnimator) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoOKXDexLiquidityError(selectedPoolsCount=" + this.OLrzqt + ")";
        }

        public StateListAnimator(int i) {
            this.OLrzqt = i;
        }
    }

    /* JADX INFO: renamed from: o.ioN$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar implements InterfaceC24993ioN {
        public final V6BaseQuoteResponse AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, V6BaseQuoteResponse v6BaseQuoteResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                v6BaseQuoteResponse = actionBar.AEQbTJ;
            }
            return actionBar.OLrzqt(v6BaseQuoteResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6BaseQuoteResponse KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
            return new ActionBar(v6BaseQuoteResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(data=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
            this.AEQbTJ = v6BaseQuoteResponse;
        }
    }
}

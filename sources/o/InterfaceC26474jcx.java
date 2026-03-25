package o;

import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26474jcx {

    /* JADX INFO: renamed from: o.jcx$TaskDescription */
    public static final class TaskDescription implements InterfaceC26474jcx {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jcx$ActionBar */
    public static final class ActionBar implements InterfaceC26474jcx {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jcx$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26474jcx {
        public final HomeTokensResponse KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, HomeTokensResponse homeTokensResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                homeTokensResponse = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(homeTokensResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull HomeTokensResponse homeTokensResponse) {
            Intrinsics.checkNotNullParameter(homeTokensResponse, "");
            return new StateListAnimator(homeTokensResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HomeTokensResponse EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tokensData=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull HomeTokensResponse homeTokensResponse) {
            Intrinsics.checkNotNullParameter(homeTokensResponse, "");
            this.KWHzl = homeTokensResponse;
        }
    }
}

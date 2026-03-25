package o;

import com.immomo.mls.fun.lt.SILoading;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kif, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28856kif {

    /* JADX INFO: renamed from: o.kif$Application */
    public static final class Application implements InterfaceC28856kif {
        public static final Application AEQbTJ = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1809563719;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kif$ActionBar */
    public static final class ActionBar implements InterfaceC28856kif {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 138541011;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error";
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kif$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28856kif {
        public final java.util.List<jNX> EZpvd;
        public final jNU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kif$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, jNU jnu, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jnu = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                list = stateListAnimator.EZpvd;
            }
            return stateListAnimator.copydefault(jnu, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final jNU EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<jNX> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull jNU jnu, @NotNull java.util.List<jNX> list) {
            Intrinsics.checkNotNullParameter(jnu, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(jnu, list);
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
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(headerData=" + this.copydefault + ", tokenList=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull jNU jnu, @NotNull java.util.List<jNX> list) {
            Intrinsics.checkNotNullParameter(jnu, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = jnu;
            this.EZpvd = list;
        }
    }
}

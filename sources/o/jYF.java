package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface jYF {

    public static final class Activity implements jYF {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    public static final class ActionBar implements jYF {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class StateListAnimator implements jYF {
        public final java.util.List<C26211jWa> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jYF$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.EZpvd;
            }
            return stateListAnimator.copydefault(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C26211jWa> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.util.List<C26211jWa> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(filterTags=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.util.List<C26211jWa> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }
}

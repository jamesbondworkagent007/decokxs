package o;

import com.okinc.business.market.features.tag.domain.TagMeta;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28706kfo {

    /* JADX INFO: renamed from: o.kfo$ActionBar */
    public static final class ActionBar implements InterfaceC28706kfo {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kfo$Application */
    public static final class Application implements InterfaceC28706kfo {
        public static final Application EZpvd = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kfo$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28706kfo {
        public final java.util.List<TagMeta> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kfo$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TagMeta> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.util.List<TagMeta> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tags=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.util.List<TagMeta> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }
    }
}

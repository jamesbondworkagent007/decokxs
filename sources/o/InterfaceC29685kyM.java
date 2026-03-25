package o;

import com.okinc.business.market.features.tag.domain.TagAttribute;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29685kyM {

    /* JADX INFO: renamed from: o.kyM$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC29685kyM {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kyM$Application */
    public static final class Application implements InterfaceC29685kyM {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kyM$ActionBar */
    public static final class ActionBar implements InterfaceC29685kyM {
        public final java.util.List<TagAttribute> AEQbTJ;
        public final java.util.List<TagWrapper> EZpvd;
        public final java.util.List<TagWrapper> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kyM$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list2 = actionBar.copydefault;
            }
            if ((i & 4) != 0) {
                list3 = actionBar.EZpvd;
            }
            return actionBar.KWHzl(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TagAttribute> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TagWrapper> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.util.List<TagAttribute> list, @NotNull java.util.List<TagWrapper> list2, @NotNull java.util.List<TagWrapper> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new ActionBar(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TagWrapper> OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(attributes=" + this.AEQbTJ + ", wrappers=" + this.copydefault + ", staticTags=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.util.List<TagAttribute> list, @NotNull java.util.List<TagWrapper> list2, @NotNull java.util.List<TagWrapper> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.AEQbTJ = list;
            this.copydefault = list2;
            this.EZpvd = list3;
        }
    }
}

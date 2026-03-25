package o;

import com.okinc.okimcore.model.im.GroupActionFailReason;
import kotlin.jvm.internal.Intrinsics;
import o.sOA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public interface sOE {

    public static final class StateListAnimator implements sOE {
        public final java.util.Map<GroupActionFailReason, java.util.List<java.lang.String>> AEQbTJ;
        public final java.util.List<sOA.Application> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sOE$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                map = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(list, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<GroupActionFailReason, java.util.List<java.lang.String>> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<sOA.Application> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.util.List<sOA.Application> list, @NotNull java.util.Map<GroupActionFailReason, ? extends java.util.List<java.lang.String>> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new StateListAnimator(list, map);
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
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(successfulApplications=" + this.EZpvd + ", failedReasons=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<com.okinc.okimcore.model.im.GroupActionFailReason, ? extends java.util.List<java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull java.util.List<sOA.Application> list, @NotNull java.util.Map<GroupActionFailReason, ? extends java.util.List<java.lang.String>> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.EZpvd = list;
            this.AEQbTJ = map;
        }
    }

    public static final class Application implements sOE {
        public final int KWHzl;
        public final java.lang.Throwable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = application.KWHzl;
            }
            if ((i2 & 2) != 0) {
                th = application.copydefault;
            }
            return application.copydefault(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Application(i, th);
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
            return this.KWHzl == application.KWHzl && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.KWHzl + ", error=" + this.copydefault + ")";
        }

        public Application(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl = i;
            this.copydefault = th;
        }
    }
}

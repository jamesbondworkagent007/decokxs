package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20070gZu {

    /* JADX INFO: renamed from: o.gZu$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC20070gZu {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.gZu$Application */
    public static final class Application implements InterfaceC20070gZu {
        public final boolean AEQbTJ;
        public final boolean KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                z = application.AEQbTJ;
            }
            if ((i & 4) != 0) {
                z2 = application.KWHzl;
            }
            return application.AEQbTJ(str, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && this.AEQbTJ == application.AEQbTJ && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SingleChain(chainId=" + this.copydefault + ", supportBridge=" + this.AEQbTJ + ", supportSingle=" + this.KWHzl + ")";
        }

        public Application(@NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.AEQbTJ = z;
            this.KWHzl = z2;
        }
    }
}

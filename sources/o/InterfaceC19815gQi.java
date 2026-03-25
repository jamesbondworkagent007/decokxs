package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gQi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19815gQi {

    /* JADX INFO: renamed from: o.gQi$ActionBar */
    public static final class ActionBar implements InterfaceC19815gQi {
        public static final ActionBar copydefault = new ActionBar();

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
            return -2023439242;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "None";
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.gQi$Application */
    public static final class Application implements InterfaceC19815gQi {
        public final DefiChainInfo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, DefiChainInfo defiChainInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                defiChainInfo = application.KWHzl;
            }
            return application.AEQbTJ(defiChainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull DefiChainInfo defiChainInfo) {
            Intrinsics.checkNotNullParameter(defiChainInfo, "");
            return new Application(defiChainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DefiChainInfo KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.KWHzl, ((Application) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Chain(chainInfo=" + this.KWHzl + ")";
        }

        public Application(@NotNull DefiChainInfo defiChainInfo) {
            Intrinsics.checkNotNullParameter(defiChainInfo, "");
            this.KWHzl = defiChainInfo;
        }
    }
}

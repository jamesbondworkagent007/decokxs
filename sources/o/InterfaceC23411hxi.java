package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23411hxi {

    /* JADX INFO: renamed from: o.hxi$Activity */
    public static final class Activity implements InterfaceC23411hxi {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.hxi$Application */
    public static final class Application implements InterfaceC23411hxi {
        public final java.util.List<MarketChainBean> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hxi$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.copydefault;
            }
            return application.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.util.List<MarketChainBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<MarketChainBean> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(chains=" + this.copydefault + ")";
        }

        public Application(@NotNull java.util.List<MarketChainBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }
    }
}

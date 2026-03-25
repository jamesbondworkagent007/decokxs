package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28377kZd {

    /* JADX INFO: renamed from: o.kZd$Application */
    public static final class Application implements InterfaceC28377kZd {
        public static final Application copydefault = new Application();

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
            return 1652777816;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "None";
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kZd$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28377kZd {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -311713304;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error";
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kZd$TaskDescription */
    public static final class TaskDescription implements InterfaceC28377kZd {
        public final DefiChainInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, DefiChainInfo defiChainInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                defiChainInfo = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(defiChainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DefiChainInfo OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull DefiChainInfo defiChainInfo) {
            Intrinsics.checkNotNullParameter(defiChainInfo, "");
            return new TaskDescription(defiChainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SingleChain(defiChainInfo=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull DefiChainInfo defiChainInfo) {
            Intrinsics.checkNotNullParameter(defiChainInfo, "");
            this.copydefault = defiChainInfo;
        }
    }

    /* JADX INFO: renamed from: o.kZd$Activity */
    public static final class Activity implements InterfaceC28377kZd {
        public final java.lang.String EZpvd;
        public final java.util.List<DefiChainInfo> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DefiChainInfo> copydefault() {
            return this.copydefault;
        }

        public Activity(@NotNull java.util.List<DefiChainInfo> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = list;
            this.EZpvd = str;
        }
    }
}

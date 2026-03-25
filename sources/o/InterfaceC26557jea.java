package o;

import com.okinc.business.invest_biz.data.models.ChainInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26557jea {

    /* JADX INFO: renamed from: o.jea$TaskDescription */
    public static final class TaskDescription implements InterfaceC26557jea {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jea$ActionBar */
    public static final class ActionBar implements InterfaceC26557jea {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jea$Activity */
    public static final class Activity implements InterfaceC26557jea {
        public final InterfaceC9738bbJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC9738bbJ = activity.copydefault;
            }
            return activity.OLrzqt(interfaceC9738bbJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC9738bbJ KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            return new Activity(interfaceC9738bbJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.copydefault, ((Activity) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BackupWallet(wallet=" + this.copydefault + ")";
        }

        public Activity(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            this.copydefault = interfaceC9738bbJ;
        }
    }

    /* JADX INFO: renamed from: o.jea$Dialog */
    public static final class Dialog implements InterfaceC26557jea {
        public final long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = dialog.KWHzl;
            }
            return dialog.KWHzl(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(long j) {
            return new Dialog(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && this.KWHzl == ((Dialog) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UpgradeAppToSupportChain(chainId=" + this.KWHzl + ")";
        }

        public Dialog(long j) {
            this.KWHzl = j;
        }
    }

    /* JADX INFO: renamed from: o.jea$Fragment */
    public static final class Fragment implements InterfaceC26557jea {
        public final int EZpvd;
        public final ChainInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, int i, ChainInfo chainInfo, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = fragment.EZpvd;
            }
            if ((i2 & 2) != 0) {
                chainInfo = fragment.copydefault;
            }
            return fragment.KWHzl(i, chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment KWHzl(int i, @NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(chainInfo, "");
            return new Fragment(i, chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainInfo OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return this.EZpvd == fragment.EZpvd && Intrinsics.EZpvd(this.copydefault, fragment.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowSupportedWalletPicker(walletType=" + this.EZpvd + ", chainInfo=" + this.copydefault + ")";
        }

        public Fragment(int i, @NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(chainInfo, "");
            this.EZpvd = i;
            this.copydefault = chainInfo;
        }
    }

    /* JADX INFO: renamed from: o.jea$FragmentManager */
    public static final class FragmentManager implements InterfaceC26557jea {
        public final ChainInfo AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, ChainInfo chainInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                chainInfo = fragmentManager.AEQbTJ;
            }
            return fragmentManager.EZpvd(chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager EZpvd(@NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(chainInfo, "");
            return new FragmentManager(chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd(this.AEQbTJ, ((FragmentManager) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowSwitchWalletPicker(chainInfo=" + this.AEQbTJ + ")";
        }

        public FragmentManager(@NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(chainInfo, "");
            this.AEQbTJ = chainInfo;
        }
    }

    /* JADX INFO: renamed from: o.jea$Application */
    public static final class Application implements InterfaceC26557jea {
        public final ChainInfo EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, ChainInfo chainInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                chainInfo = application.EZpvd;
            }
            return application.KWHzl(z, chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainInfo KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(boolean z, @NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(chainInfo, "");
            return new Application(z, chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
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
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HandleIneligibleWallet(isHardwareWallet=" + this.OLrzqt + ", chainInfo=" + this.EZpvd + ")";
        }

        public Application(boolean z, @NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(chainInfo, "");
            this.OLrzqt = z;
            this.EZpvd = chainInfo;
        }
    }

    /* JADX INFO: renamed from: o.jea$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26557jea {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}

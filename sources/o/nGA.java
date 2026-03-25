package o;

import com.okinc.im.imui.relationlist.model.ReferralData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class nGA {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGA.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ nGA(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Fragment extends nGA {
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = fragment.KWHzl;
            }
            return fragment.EZpvd(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd(boolean z) {
            return new Fragment(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && this.KWHzl == ((Fragment) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowLoading(isShow=" + this.KWHzl + ")";
        }

        public Fragment(boolean z) {
            super(null);
            this.KWHzl = z;
        }
    }

    private nGA() {
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Dialog extends nGA {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.copydefault;
            }
            return dialog.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Dialog) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowToast(msg=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    public static final class ActionBar extends nGA {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    public static final class FragmentManager extends nGA {
        public static final FragmentManager copydefault = new FragmentManager();

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends nGA {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class AssistContent extends nGA {
        public static final AssistContent AEQbTJ = new AssistContent();

        private AssistContent() {
            super(null);
        }
    }

    public static final class StateListAnimator extends nGA {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class PendingIntent extends nGA {
        public static final PendingIntent EZpvd = new PendingIntent();

        private PendingIntent() {
            super(null);
        }
    }

    public static final class LoaderManager extends nGA {
        public final C37246oqH KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, C37246oqH c37246oqH, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c37246oqH = loaderManager.KWHzl;
            }
            return loaderManager.OLrzqt(c37246oqH);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37246oqH KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager OLrzqt(@NotNull C37246oqH c37246oqH) {
            Intrinsics.checkNotNullParameter(c37246oqH, "");
            return new LoaderManager(c37246oqH);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.KWHzl, ((LoaderManager) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowLocalRelationSelectionBottomSheet(groupedLocalRelation=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull C37246oqH c37246oqH) {
            super(null);
            Intrinsics.checkNotNullParameter(c37246oqH, "");
            this.KWHzl = c37246oqH;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends nGA {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = application.AEQbTJ;
            }
            return application.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NavigateChatScreen(relationId=" + this.KWHzl + ", channelId=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity extends nGA {
        public final ReferralData OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, ReferralData referralData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                referralData = activity.OLrzqt;
            }
            return activity.OLrzqt(referralData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReferralData KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull ReferralData referralData) {
            Intrinsics.checkNotNullParameter(referralData, "");
            return new Activity(referralData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.OLrzqt, ((Activity) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InviteUser(referralData=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ReferralData referralData) {
            super(null);
            Intrinsics.checkNotNullParameter(referralData, "");
            this.OLrzqt = referralData;
        }
    }
}

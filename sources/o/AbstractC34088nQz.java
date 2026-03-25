package o;

import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC34088nQz {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nQz.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC34088nQz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.nQz$AssistContent */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class AssistContent extends AbstractC34088nQz {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assistContent.AEQbTJ;
            }
            return assistContent.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AssistContent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssistContent) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((AssistContent) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowToast(message=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssistContent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    private AbstractC34088nQz() {
    }

    /* JADX INFO: renamed from: o.nQz$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator extends AbstractC34088nQz {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((StateListAnimator) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NavigateToCreateAnnouncement(groupId=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: renamed from: o.nQz$Dialog */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Dialog extends AbstractC34088nQz {
        public static final int OLrzqt = GroupAnnouncementInfo.$stable;
        public final GroupAnnouncementInfo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, GroupAnnouncementInfo groupAnnouncementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                groupAnnouncementInfo = dialog.KWHzl;
            }
            return dialog.EZpvd(groupAnnouncementInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog EZpvd(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            return new Dialog(groupAnnouncementInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupAnnouncementInfo KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd(this.KWHzl, ((Dialog) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NavigateToEditAnnouncement(announcement=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            this.KWHzl = groupAnnouncementInfo;
        }
    }

    /* JADX INFO: renamed from: o.nQz$PictureInPictureParams */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class PictureInPictureParams extends AbstractC34088nQz {
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PictureInPictureParams copy$default(PictureInPictureParams pictureInPictureParams, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = pictureInPictureParams.OLrzqt;
            }
            return pictureInPictureParams.copydefault(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams copydefault(int i) {
            return new PictureInPictureParams(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PictureInPictureParams) && this.OLrzqt == ((PictureInPictureParams) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowOverLimitDialog(maxLimit=" + this.OLrzqt + ")";
        }

        public PictureInPictureParams(int i) {
            super(null);
            this.OLrzqt = i;
        }
    }

    /* JADX INFO: renamed from: o.nQz$PendingIntent */
    public static final class PendingIntent extends AbstractC34088nQz {
        public static final int OLrzqt = GroupAnnouncementInfo.$stable;
        public final GroupAnnouncementInfo EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, GroupAnnouncementInfo groupAnnouncementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                groupAnnouncementInfo = pendingIntent.EZpvd;
            }
            return pendingIntent.AEQbTJ(groupAnnouncementInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent AEQbTJ(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            return new PendingIntent(groupAnnouncementInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupAnnouncementInfo copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.EZpvd, ((PendingIntent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowAnnouncementDetail(announcement=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            this.EZpvd = groupAnnouncementInfo;
        }
    }

    /* JADX INFO: renamed from: o.nQz$FragmentManager */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class FragmentManager extends AbstractC34088nQz {
        public static final int copydefault = GroupAnnouncementInfo.$stable;
        public final GroupAnnouncementInfo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, GroupAnnouncementInfo groupAnnouncementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                groupAnnouncementInfo = fragmentManager.KWHzl;
            }
            return fragmentManager.KWHzl(groupAnnouncementInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager KWHzl(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            return new FragmentManager(groupAnnouncementInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupAnnouncementInfo OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd(this.KWHzl, ((FragmentManager) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowAnnouncementMenu(announcement=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            this.KWHzl = groupAnnouncementInfo;
        }
    }

    /* JADX INFO: renamed from: o.nQz$Fragment */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Fragment extends AbstractC34088nQz {
        public static final Fragment AEQbTJ = new Fragment();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 570994166;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RefreshComplete";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nQz$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity extends AbstractC34088nQz {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1440358741;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EnterSelectionMode";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nQz$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application extends AbstractC34088nQz {
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
            return 1152358675;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExitSelectionMode";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nQz$LoaderManager */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class LoaderManager extends AbstractC34088nQz {
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = loaderManager.EZpvd;
            }
            return loaderManager.OLrzqt(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager OLrzqt(int i) {
            return new LoaderManager(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && this.EZpvd == ((LoaderManager) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowBulkDeleteConfirmation(selectedCount=" + this.EZpvd + ")";
        }

        public LoaderManager(int i) {
            super(null);
            this.EZpvd = i;
        }
    }

    /* JADX INFO: renamed from: o.nQz$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription extends AbstractC34088nQz {
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(int i) {
            return new TaskDescription(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.OLrzqt == ((TaskDescription) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AnnouncementsRemoved(count=" + this.OLrzqt + ")";
        }

        public TaskDescription(int i) {
            super(null);
            this.OLrzqt = i;
        }
    }

    /* JADX INFO: renamed from: o.nQz$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar extends AbstractC34088nQz {
        public static final ActionBar EZpvd = new ActionBar();

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
            return -1798005763;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AnnouncementPinned";
        }

        private ActionBar() {
            super(null);
        }
    }
}

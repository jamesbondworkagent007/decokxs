package o;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallType;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35238nrZ {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrZ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC35238nrZ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35238nrZ() {
    }

    /* JADX INFO: renamed from: o.nrZ$Fragment */
    public static final class Fragment extends AbstractC35238nrZ {
        public final java.lang.String EZpvd;
        public final CallType KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, java.lang.String str2, java.lang.String str3, CallType callType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = fragment.OLrzqt;
            }
            if ((i & 4) != 0) {
                str3 = fragment.copydefault;
            }
            if ((i & 8) != 0) {
                callType = fragment.KWHzl;
            }
            return fragment.OLrzqt(str, str2, str3, callType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull CallType callType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(callType, "");
            return new Fragment(str, str2, str3, callType);
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) fragment.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fragment.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fragment.copydefault) && this.KWHzl == fragment.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Incoming(conversationId=" + this.EZpvd + ", callerUserId=" + this.OLrzqt + ", calleeUserId=" + this.copydefault + ", callType=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull CallType callType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(callType, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.copydefault = str3;
            this.KWHzl = callType;
        }

        public final CallSessionV2 copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            CallSessionV2 callSessionV2Copydefault = CallSessionV2.Companion.copydefault(this.EZpvd, this.OLrzqt, this.copydefault, this.KWHzl);
            return callSessionV2Copydefault.KWHzl((131055 & 1) != 0 ? callSessionV2Copydefault.callId : null, (131055 & 2) != 0 ? callSessionV2Copydefault.conversationId : null, (131055 & 4) != 0 ? callSessionV2Copydefault.calleeUserId : null, (131055 & 8) != 0 ? callSessionV2Copydefault.callerUserId : null, (131055 & 16) != 0 ? callSessionV2Copydefault.selfUserId : str, (131055 & 32) != 0 ? callSessionV2Copydefault.agoraToken : null, (131055 & 64) != 0 ? callSessionV2Copydefault.agoraAppId : null, (131055 & 128) != 0 ? callSessionV2Copydefault.agoraUid : 0, (131055 & 256) != 0 ? callSessionV2Copydefault.callType : null, (131055 & 512) != 0 ? callSessionV2Copydefault.mediaType : null, (131055 & 1024) != 0 ? callSessionV2Copydefault.meetingId : null, (131055 & 2048) != 0 ? callSessionV2Copydefault.nonLoginUserId : null, (131055 & 4096) != 0 ? callSessionV2Copydefault.nonLoginUUID : null, (131055 & 8192) != 0 ? callSessionV2Copydefault.createdAt : 0L, (131055 & 16384) != 0 ? callSessionV2Copydefault.agoraGroupChannelName : null, (32768 & 131055) != 0 ? callSessionV2Copydefault.groupId : null, (131055 & 65536) != 0 ? callSessionV2Copydefault.isGroupCallInitiator : false);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$StateListAnimator */
    public static final class StateListAnimator extends AbstractC35238nrZ {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC35238nrZ {
        public static final VoiceInteractor EZpvd = new VoiceInteractor();

        private VoiceInteractor() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$ActionBar */
    public static final class ActionBar extends AbstractC35238nrZ {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$Application */
    public static final class Application extends AbstractC35238nrZ {
        public final java.lang.Long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = application.OLrzqt;
            }
            return application.EZpvd(l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(java.lang.Long l) {
            return new Application(l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Long l = this.OLrzqt;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Completed(duration=" + this.OLrzqt + ")";
        }

        public Application(java.lang.Long l) {
            super(null);
            this.OLrzqt = l;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$ComponentName */
    public static final class ComponentName extends AbstractC35238nrZ {
        public static final ComponentName AEQbTJ = new ComponentName();

        private ComponentName() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC35238nrZ {
        public static final PictureInPictureParams AEQbTJ = new PictureInPictureParams();

        private PictureInPictureParams() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$TaskDescription */
    public static final class TaskDescription extends AbstractC35238nrZ {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC35238nrZ {
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SharedElementCallback copy$default(SharedElementCallback sharedElementCallback, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = sharedElementCallback.copydefault;
            }
            return sharedElementCallback.AEQbTJ(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback AEQbTJ(int i) {
            return new SharedElementCallback(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SharedElementCallback) && this.copydefault == ((SharedElementCallback) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LocalJoined(uid=" + this.copydefault + ")";
        }

        public SharedElementCallback(int i) {
            super(null);
            this.copydefault = i;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC35238nrZ {
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskStackBuilder.OLrzqt;
            }
            return taskStackBuilder.AEQbTJ(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder AEQbTJ(int i) {
            return new TaskStackBuilder(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskStackBuilder) && this.OLrzqt == ((TaskStackBuilder) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LocalLeft(uid=" + this.OLrzqt + ")";
        }

        public TaskStackBuilder(int i) {
            super(null);
            this.OLrzqt = i;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$BroadcastReceiver */
    public static final class BroadcastReceiver extends AbstractC35238nrZ {
        public final int AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BroadcastReceiver copy$default(BroadcastReceiver broadcastReceiver, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = broadcastReceiver.AEQbTJ;
            }
            return broadcastReceiver.copydefault(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BroadcastReceiver copydefault(int i) {
            return new BroadcastReceiver(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BroadcastReceiver) && this.AEQbTJ == ((BroadcastReceiver) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RemoteJoined(uid=" + this.AEQbTJ + ")";
        }

        public BroadcastReceiver(int i) {
            super(null);
            this.AEQbTJ = i;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$ClipData */
    public static final class ClipData extends AbstractC35238nrZ {
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ClipData copy$default(ClipData clipData, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = clipData.EZpvd;
            }
            return clipData.EZpvd(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClipData EZpvd(int i) {
            return new ClipData(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClipData) && this.EZpvd == ((ClipData) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RemoteLeft(uid=" + this.EZpvd + ")";
        }

        public ClipData(int i) {
            super(null);
            this.EZpvd = i;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$LoaderManager */
    public static final class LoaderManager extends AbstractC35238nrZ {
        public static final LoaderManager EZpvd = new LoaderManager();

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrZ$Activity */
    public static final class Activity extends AbstractC35238nrZ {
        public final int AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                str = activity.KWHzl;
            }
            return activity.KWHzl(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(int i, java.lang.String str) {
            return new Activity(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
            java.lang.String str = this.KWHzl;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AgoraError(errorCode=" + this.AEQbTJ + ", description=" + this.KWHzl + ")";
        }

        public Activity(int i, java.lang.String str) {
            super(null);
            this.AEQbTJ = i;
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$AssistContent */
    public static final class AssistContent extends AbstractC35238nrZ {
        public final int AEQbTJ;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = assistContent.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                z = assistContent.KWHzl;
            }
            return assistContent.OLrzqt(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent OLrzqt(int i, boolean z) {
            return new AssistContent(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssistContent)) {
                return false;
            }
            AssistContent assistContent = (AssistContent) obj;
            return this.AEQbTJ == assistContent.AEQbTJ && this.KWHzl == assistContent.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RemoteAudioMuteChanged(uid=" + this.AEQbTJ + ", isMuted=" + this.KWHzl + ")";
        }

        public AssistContent(int i, boolean z) {
            super(null);
            this.AEQbTJ = i;
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$PendingIntent */
    public static final class PendingIntent extends AbstractC35238nrZ {
        public final java.util.List<java.lang.String> AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.util.List<GroupVoiceCallUser> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nrZ$PendingIntent */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = pendingIntent.EZpvd;
            }
            if ((i & 4) != 0) {
                list = pendingIntent.copydefault;
            }
            if ((i & 8) != 0) {
                list2 = pendingIntent.AEQbTJ;
            }
            return pendingIntent.KWHzl(str, str2, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<GroupVoiceCallUser> list, @NotNull java.util.List<java.lang.String> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new PendingIntent(str, str2, list, list2);
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
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) pendingIntent.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) pendingIntent.EZpvd) && Intrinsics.EZpvd(this.copydefault, pendingIntent.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, pendingIntent.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.String str = this.EZpvd;
            return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupCallIncoming(groupId=" + this.KWHzl + ", initiatorUid=" + this.EZpvd + ", activeUsers=" + this.copydefault + ", targetUids=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<GroupVoiceCallUser> list, @NotNull java.util.List<java.lang.String> list2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.copydefault = list;
            this.AEQbTJ = list2;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$Dialog */
    public static final class Dialog extends AbstractC35238nrZ {
        public final java.util.List<GroupVoiceCallUser> AEQbTJ;
        public final java.util.List<java.lang.String> EZpvd;
        public final java.lang.String KWHzl;
        public final java.util.List<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nrZ$Dialog */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.KWHzl;
            }
            if ((i & 2) != 0) {
                list = dialog.AEQbTJ;
            }
            if ((i & 4) != 0) {
                list2 = dialog.EZpvd;
            }
            if ((i & 8) != 0) {
                list3 = dialog.OLrzqt;
            }
            return dialog.EZpvd(str, list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<GroupVoiceCallUser> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<GroupVoiceCallUser> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.util.List<java.lang.String> list3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new Dialog(str, list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.OLrzqt;
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
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dialog.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, dialog.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, dialog.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, dialog.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupCallParticipantsUpdated(groupId=" + this.KWHzl + ", activeUsers=" + this.AEQbTJ + ", historicalUids=" + this.EZpvd + ", targetUids=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str, @NotNull java.util.List<GroupVoiceCallUser> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.util.List<java.lang.String> list3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.KWHzl = str;
            this.AEQbTJ = list;
            this.EZpvd = list2;
            this.OLrzqt = list3;
        }
    }

    /* JADX INFO: renamed from: o.nrZ$FragmentManager */
    public static final class FragmentManager extends AbstractC35238nrZ {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.KWHzl;
            }
            return fragmentManager.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FragmentManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((FragmentManager) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupCallEnded(groupId=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }
}

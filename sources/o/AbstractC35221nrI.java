package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35221nrI {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.nrI.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC35221nrI(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    public AbstractC35221nrI(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX INFO: renamed from: o.nrI$Fragment */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Fragment extends AbstractC35221nrI {
        public static final Fragment OLrzqt = new Fragment();

        private Fragment() {
            super("Network is unavailable", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription extends AbstractC35221nrI {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
            super("Already in a call", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$FragmentManager */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class FragmentManager extends AbstractC35221nrI {
        public static final FragmentManager EZpvd = new FragmentManager();

        private FragmentManager() {
            super("Microphone permission not granted", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$Dialog */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Dialog extends AbstractC35221nrI {
        public static final Dialog OLrzqt = new Dialog();

        private Dialog() {
            super("Microphone is in use by another application", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$LoaderManager */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class LoaderManager extends AbstractC35221nrI {
        public static final LoaderManager EZpvd = new LoaderManager();

        private LoaderManager() {
            super("Cannot call yourself", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$ComponentCallbacks */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ComponentCallbacks extends AbstractC35221nrI {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ComponentCallbacks copy$default(ComponentCallbacks componentCallbacks, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = componentCallbacks.KWHzl;
            }
            return componentCallbacks.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ComponentCallbacks OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ComponentCallbacks(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComponentCallbacks) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((ComponentCallbacks) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserBlocked(displayName=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentCallbacks(@NotNull java.lang.String str) {
            super("User is blocked: " + str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.nrI$SharedElementCallback */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class SharedElementCallback extends AbstractC35221nrI {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SharedElementCallback copy$default(SharedElementCallback sharedElementCallback, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sharedElementCallback.KWHzl;
            }
            return sharedElementCallback.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC35221nrI
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SharedElementCallback(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SharedElementCallback) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((SharedElementCallback) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TokenError(message=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedElementCallback(@NotNull java.lang.String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.nrI$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar extends AbstractC35221nrI {
        public final int KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.KWHzl;
            }
            if ((i2 & 2) != 0) {
                str = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC35221nrI
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(i, str);
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
            return this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.KWHzl) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AgoraError(code=" + this.KWHzl + ", message=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(int i, @NotNull java.lang.String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = i;
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: renamed from: o.nrI$AssistContent */
    public static final class AssistContent extends AbstractC35221nrI {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assistContent.EZpvd;
            }
            return assistContent.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC35221nrI
        public java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AssistContent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssistContent) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((AssistContent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignallingError(message=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssistContent(@NotNull java.lang.String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.nrI$PendingIntent */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class PendingIntent extends AbstractC35221nrI {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.EZpvd;
            }
            return pendingIntent.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC35221nrI
        public java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((PendingIntent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvalidState(message=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.nrI$VoiceInteractor */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class VoiceInteractor extends AbstractC35221nrI {
        public final java.lang.String AEQbTJ;
        public final java.lang.Throwable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = voiceInteractor.AEQbTJ;
            }
            if ((i & 2) != 0) {
                th = voiceInteractor.OLrzqt;
            }
            return voiceInteractor.EZpvd(str, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC35221nrI
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor EZpvd(@NotNull java.lang.String str, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            return new VoiceInteractor(str, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoiceInteractor)) {
                return false;
            }
            VoiceInteractor voiceInteractor = (VoiceInteractor) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) voiceInteractor.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, voiceInteractor.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            java.lang.Throwable th = this.OLrzqt;
            return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Unknown(message=" + this.AEQbTJ + ", cause=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceInteractor(@NotNull java.lang.String str, java.lang.Throwable th) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.OLrzqt = th;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:170) call: o.nrI.VoiceInteractor.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
        public /* synthetic */ VoiceInteractor(java.lang.String str, java.lang.Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    /* JADX INFO: renamed from: o.nrI$TaskStackBuilder */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskStackBuilder extends AbstractC35221nrI {
        public static final TaskStackBuilder EZpvd = new TaskStackBuilder();

        private TaskStackBuilder() {
            super("No permission to start group call", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity extends AbstractC35221nrI {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
            super("Group call already in progress", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application extends AbstractC35221nrI {
        public static final Application AEQbTJ = new Application();

        private Application() {
            super("Group call does not exist", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator extends AbstractC35221nrI {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
            super("Group call at full capacity", null);
        }
    }

    /* JADX INFO: renamed from: o.nrI$PictureInPictureParams */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class PictureInPictureParams extends AbstractC35221nrI {
        public static final PictureInPictureParams OLrzqt = new PictureInPictureParams();

        private PictureInPictureParams() {
            super("Not currently in a group call", null);
        }
    }
}

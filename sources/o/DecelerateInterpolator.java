package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DecelerateInterpolator {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public static final java.util.List<DecelerateInterpolator> OLrzqt = yDY.gEmmrt(ActionBar.KWHzl, Activity.EZpvd, Application.copydefault, TaskDescription.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DecelerateInterpolator.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DecelerateInterpolator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private DecelerateInterpolator() {
    }

    public static final class ActionBar extends DecelerateInterpolator {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String copydefault = MTPushConstants.Analysis.KEY_JSON;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DecelerateInterpolator
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Json";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends DecelerateInterpolator {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String copydefault = "mp3";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DecelerateInterpolator
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Mp3";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Application extends DecelerateInterpolator {
        public static final Application copydefault = new Application();
        public static final java.lang.String KWHzl = "ogg_vorbis";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DecelerateInterpolator
        public java.lang.String copydefault() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OggVorbis";
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends DecelerateInterpolator {
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final java.lang.String copydefault = "pcm";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DecelerateInterpolator
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Pcm";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class PendingIntent extends DecelerateInterpolator {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.EZpvd;
            }
            return pendingIntent.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DecelerateInterpolator
        public java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent copydefault(@NotNull java.lang.String str) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DecelerateInterpolator.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final DecelerateInterpolator OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -803792317:
                    if (str.equals("ogg_vorbis")) {
                        return Application.copydefault;
                    }
                    break;
                case 108272:
                    if (str.equals("mp3")) {
                        return Activity.EZpvd;
                    }
                    break;
                case 110810:
                    if (str.equals("pcm")) {
                        return TaskDescription.KWHzl;
                    }
                    break;
                case 3271912:
                    if (str.equals(MTPushConstants.Analysis.KEY_JSON)) {
                        return ActionBar.KWHzl;
                    }
                    break;
            }
            return new PendingIntent(str);
        }
    }
}

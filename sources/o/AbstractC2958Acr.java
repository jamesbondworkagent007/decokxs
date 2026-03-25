package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Acr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC2958Acr {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Acr.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC2958Acr(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2958Acr() {
    }

    /* JADX INFO: renamed from: o.Acr$TaskDescription */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class TaskDescription extends AbstractC2958Acr {
        public static final int $stable = 0;
        public final AbstractC3252AiT KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, AbstractC3252AiT abstractC3252AiT, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC3252AiT = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(abstractC3252AiT);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC3252AiT OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull AbstractC3252AiT abstractC3252AiT) {
            Intrinsics.checkNotNullParameter(abstractC3252AiT, "");
            return new TaskDescription(abstractC3252AiT);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((TaskDescription) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "VerifyCodeStatus(state=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC3252AiT abstractC3252AiT) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC3252AiT, "");
            this.KWHzl = abstractC3252AiT;
        }
    }

    /* JADX INFO: renamed from: o.Acr$ActionBar */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class ActionBar extends AbstractC2958Acr {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Acr$Activity */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class Activity extends AbstractC2958Acr {
        public static final int $stable = 0;
        public final int AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.AEQbTJ;
            }
            return activity.copydefault(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(int i) {
            return new Activity(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && this.AEQbTJ == ((Activity) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StartCountDown(seconds=" + this.AEQbTJ + ")";
        }

        public Activity(int i) {
            super(null);
            this.AEQbTJ = i;
        }
    }

    /* JADX INFO: renamed from: o.Acr$StateListAnimator */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends AbstractC2958Acr {
        public static final int $stable = 0;
        public final boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.EZpvd;
            }
            return stateListAnimator.AEQbTJ(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(boolean z) {
            return new StateListAnimator(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.EZpvd == ((StateListAnimator) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowReCaptchaCheckBox(isResend=" + this.EZpvd + ")";
        }

        public StateListAnimator(boolean z) {
            super(null);
            this.EZpvd = z;
        }
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC9728bb {
    public static final Application OLrzqt = new Application(null);
    public static final java.util.List<AbstractC9728bb> EZpvd = yDY.gEmmrt(TaskDescription.AEQbTJ, StateListAnimator.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bb.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC9728bb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private AbstractC9728bb() {
    }

    /* JADX INFO: renamed from: o.bb$TaskDescription */
    public static final class TaskDescription extends AbstractC9728bb {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String copydefault = "SHOT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC9728bb
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Shot";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bb$StateListAnimator */
    public static final class StateListAnimator extends AbstractC9728bb {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "TECHNICAL_CUE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC9728bb
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TechnicalCue";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bb$ActionBar */
    public static final class ActionBar extends AbstractC9728bb {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            return actionBar.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC9728bb
        public java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    /* JADX INFO: renamed from: o.bb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AbstractC9728bb AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SHOT") ? TaskDescription.AEQbTJ : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TECHNICAL_CUE") ? StateListAnimator.KWHzl : new ActionBar(str);
        }
    }
}

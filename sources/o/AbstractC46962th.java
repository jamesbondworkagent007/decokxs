package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC46962th {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final java.util.List<AbstractC46962th> AEQbTJ = yDY.gEmmrt(ActionBar.EZpvd, Application.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.th.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC46962th(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private AbstractC46962th() {
    }

    /* JADX INFO: renamed from: o.th$ActionBar */
    public static final class ActionBar extends AbstractC46962th {
        public static final ActionBar EZpvd = new ActionBar();
        public static final java.lang.String copydefault = "FORMAL";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46962th
        public java.lang.String EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Formal";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.th$Application */
    public static final class Application extends AbstractC46962th {
        public static final Application KWHzl = new Application();
        public static final java.lang.String EZpvd = "INFORMAL";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46962th
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Informal";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.th$StateListAnimator */
    public static final class StateListAnimator extends AbstractC46962th {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46962th
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    /* JADX INFO: renamed from: o.th$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.th.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC46962th AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FORMAL") ? ActionBar.EZpvd : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "INFORMAL") ? Application.KWHzl : new StateListAnimator(str);
        }
    }
}

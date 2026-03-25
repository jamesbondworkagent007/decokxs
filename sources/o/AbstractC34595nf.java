package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC34595nf {
    public static final Application EZpvd = new Application(null);
    public static final java.util.List<AbstractC34595nf> copydefault = yDY.gEmmrt(StateListAnimator.AEQbTJ, ActionBar.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nf.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC34595nf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String KWHzl();

    private AbstractC34595nf() {
    }

    /* JADX INFO: renamed from: o.nf$StateListAnimator */
    public static final class StateListAnimator extends AbstractC34595nf {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String KWHzl = "DISABLED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC34595nf
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Disabled";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nf$ActionBar */
    public static final class ActionBar extends AbstractC34595nf {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String KWHzl = "ENABLED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC34595nf
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Enabled";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nf$Activity */
    public static final class Activity extends AbstractC34595nf {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            return activity.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC34595nf
        public java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    /* JADX INFO: renamed from: o.nf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AbstractC34595nf copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "DISABLED") ? StateListAnimator.AEQbTJ : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ENABLED") ? ActionBar.OLrzqt : new Activity(str);
        }
    }
}

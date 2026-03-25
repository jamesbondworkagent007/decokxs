package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AuthenticatorException {
    public static final Application OLrzqt = new Application(null);
    public static final java.util.List<AuthenticatorException> AEQbTJ = yDY.gEmmrt(StateListAnimator.copydefault, Activity.EZpvd, TaskDescription.copydefault, FragmentManager.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AuthenticatorException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AuthenticatorException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private AuthenticatorException() {
    }

    public static final class StateListAnimator extends AuthenticatorException {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String EZpvd = "Boolean";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AuthenticatorException
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Boolean";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends AuthenticatorException {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String KWHzl = ExifInterface.TAG_DATETIME;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AuthenticatorException
        public java.lang.String copydefault() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Datetime";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class TaskDescription extends AuthenticatorException {
        public static final TaskDescription copydefault = new TaskDescription();
        public static final java.lang.String KWHzl = "Number";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AuthenticatorException
        public java.lang.String copydefault() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Number";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class FragmentManager extends AuthenticatorException {
        public static final FragmentManager KWHzl = new FragmentManager();
        public static final java.lang.String EZpvd = "String";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AuthenticatorException
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "String";
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class ActionBar extends AuthenticatorException {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            return actionBar.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AuthenticatorException
        public java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AuthenticatorException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AuthenticatorException EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1950496919:
                    if (str.equals("Number")) {
                        return TaskDescription.copydefault;
                    }
                    break;
                case -1808118735:
                    if (str.equals("String")) {
                        return FragmentManager.KWHzl;
                    }
                    break;
                case 1729365000:
                    if (str.equals("Boolean")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
                case 1857393595:
                    if (str.equals(ExifInterface.TAG_DATETIME)) {
                        return Activity.EZpvd;
                    }
                    break;
            }
            return new ActionBar(str);
        }
    }
}

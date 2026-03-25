package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class RawRes {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public static final java.util.List<RawRes> copydefault = yDY.gEmmrt(Application.EZpvd, ActionBar.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RawRes.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RawRes(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String EZpvd();

    private RawRes() {
    }

    public static final class Application extends RawRes {
        public static final Application EZpvd = new Application();
        public static final java.lang.String KWHzl = "COGNITO_DEFAULT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RawRes
        public java.lang.String EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CognitoDefault";
        }

        private Application() {
            super(null);
        }
    }

    public static final class ActionBar extends RawRes {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String EZpvd = "DEVELOPER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RawRes
        public java.lang.String EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Developer";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class TaskDescription extends RawRes {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RawRes
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RawRes.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final RawRes AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COGNITO_DEFAULT") ? Application.EZpvd : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "DEVELOPER") ? ActionBar.KWHzl : new TaskDescription(str);
        }
    }
}

package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FA {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FA.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FA(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int copydefault();

    private FA() {
    }

    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            return taskDescription.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            java.lang.String str = this.OLrzqt;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Namespace(uri=" + this.AEQbTJ + ", prefix=" + this.OLrzqt + ')';
        }

        public TaskDescription(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
        }
    }

    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            return application.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            java.lang.String str = this.KWHzl;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public Application(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:30) call: o.FA.Application.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public java.lang.String toString() {
            return OLrzqt();
        }

        public final java.lang.String OLrzqt() {
            if (this.KWHzl == null) {
                return this.AEQbTJ;
            }
            return this.KWHzl + AbstractJsonLexerKt.COLON + this.AEQbTJ;
        }
    }

    public static final class ActionBar extends FA {
        public final java.util.Map<Application, java.lang.String> AEQbTJ;
        public final java.util.List<TaskDescription> KWHzl;
        public final int OLrzqt;
        public final Application copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.FA$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, Application application, java.util.Map map, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                application = actionBar.copydefault;
            }
            if ((i2 & 4) != 0) {
                map = actionBar.AEQbTJ;
            }
            if ((i2 & 8) != 0) {
                list = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(i, application, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<Application, java.lang.String> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(int i, @NotNull Application application, @NotNull java.util.Map<Application, java.lang.String> map, @NotNull java.util.List<TaskDescription> list) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(i, application, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FA
        public int copydefault() {
            return this.OLrzqt;
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
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(int i, @NotNull Application application, @NotNull java.util.Map<Application, java.lang.String> map, @NotNull java.util.List<TaskDescription> list) {
            super(null);
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = i;
            this.copydefault = application;
            this.AEQbTJ = map;
            this.KWHzl = list;
        }

        @Override // o.FA
        public java.lang.String toString() {
            return '<' + this.copydefault + " (" + copydefault() + ")>";
        }
    }

    public static final class StateListAnimator extends FA {
        public final int AEQbTJ;
        public final Application KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, Application application, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                application = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(i, application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(int i, @NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return new StateListAnimator(i, application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FA
        public int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(int i, @NotNull Application application) {
            super(null);
            Intrinsics.checkNotNullParameter(application, "");
            this.AEQbTJ = i;
            this.KWHzl = application;
        }

        @Override // o.FA
        public java.lang.String toString() {
            return "</" + this.KWHzl + "> (" + copydefault() + ')';
        }
    }

    public static final class Dialog extends FA {
        public final int EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = dialog.EZpvd;
            }
            if ((i2 & 2) != 0) {
                str = dialog.OLrzqt;
            }
            return dialog.copydefault(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FA
        public int copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog copydefault(int i, java.lang.String str) {
            return new Dialog(i, str);
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
            return this.EZpvd == dialog.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dialog.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
            java.lang.String str = this.OLrzqt;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public Dialog(int i, java.lang.String str) {
            super(null);
            this.EZpvd = i;
            this.OLrzqt = str;
        }

        @Override // o.FA
        public java.lang.String toString() {
            return this.OLrzqt + " (" + copydefault() + ')';
        }
    }

    public static final class PendingIntent extends FA {
        public static final int AEQbTJ = 0;
        public static final PendingIntent OLrzqt = new PendingIntent();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FA
        public int copydefault() {
            return AEQbTJ;
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class Activity extends FA {
        public static final Activity AEQbTJ = new Activity();

        @Override // o.FA
        public int copydefault() {
            return 0;
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 60, (wrap:o.FA$Application:INVOKE), 62 */
    public java.lang.String toString() {
        if (this instanceof ActionBar) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('<');
            sb.append(((ActionBar) this).OLrzqt());
            sb.append('>');
            return sb.toString();
        }
        if (this instanceof StateListAnimator) {
            return "</" + ((StateListAnimator) this).AEQbTJ() + '>';
        }
        if (this instanceof Dialog) {
            return java.lang.String.valueOf(((Dialog) this).OLrzqt());
        }
        if (Intrinsics.EZpvd(this, PendingIntent.OLrzqt)) {
            return "[StartDocument]";
        }
        if (Intrinsics.EZpvd(this, Activity.AEQbTJ)) {
            return "[EndDocument]";
        }
        throw new NoWhenBranchMatchedException();
    }
}

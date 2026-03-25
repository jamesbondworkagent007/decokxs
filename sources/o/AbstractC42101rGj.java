package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.rGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC42101rGj {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rGj.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC42101rGj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.rGj$TaskDescription */
    public static final class TaskDescription extends AbstractC42101rGj {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(java.lang.String str) {
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DynamicString(value=" + this.OLrzqt + ")";
        }

        public TaskDescription(java.lang.String str) {
            super(null);
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:8) call: o.rGj.TaskDescription.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private AbstractC42101rGj() {
    }

    /* JADX INFO: renamed from: o.rGj$ActionBar */
    public static final class ActionBar extends AbstractC42101rGj {
        public final int EZpvd;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rGj$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, java.util.Map map, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.EZpvd;
            }
            if ((i2 & 2) != 0) {
                map = actionBar.OLrzqt;
            }
            return actionBar.copydefault(i, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@androidx.annotation.StringRes int i, java.util.Map<java.lang.String, java.lang.String> map) {
            return new ActionBar(i, map);
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
            return this.EZpvd == actionBar.EZpvd && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
            java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
            return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StringResource(resId=" + this.EZpvd + ", args=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r2v0 java.util.Map))
 A[MD:(int, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:9) call: o.rGj.ActionBar.<init>(int, java.util.Map):void type: THIS */
        public /* synthetic */ ActionBar(int i, java.util.Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : map);
        }

        public ActionBar(@androidx.annotation.StringRes int i, java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            this.EZpvd = i;
            this.OLrzqt = map;
        }
    }

    public final java.lang.String copydefault() {
        if (this instanceof TaskDescription) {
            java.lang.String strOLrzqt = ((TaskDescription) this).OLrzqt();
            if (strOLrzqt != null) {
                return strOLrzqt;
            }
        } else {
            if (!(this instanceof ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            ActionBar actionBar = (ActionBar) this;
            if (actionBar.EZpvd() != 0) {
                java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ = actionBar.AEQbTJ();
                if (mapAEQbTJ == null || mapAEQbTJ.isEmpty()) {
                    return C33070mpX.AYXKKw(actionBar.EZpvd());
                }
                int iEZpvd = actionBar.EZpvd();
                java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ2 = actionBar.AEQbTJ();
                Intrinsics.copydefault(mapAEQbTJ2);
                return C33069mpW.copydefault(iEZpvd, mapAEQbTJ2);
            }
        }
        return "";
    }
}

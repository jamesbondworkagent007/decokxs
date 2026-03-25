package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5109Fb {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Fb.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC5109Fb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int OLrzqt();

    private AbstractC5109Fb() {
    }

    /* JADX INFO: renamed from: o.Fb$TaskDescription */
    public static final class TaskDescription extends AbstractC5109Fb {
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(int i) {
            return new TaskDescription(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5109Fb
        public int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.EZpvd == ((TaskDescription) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Text(fieldIndex=" + this.EZpvd + ')';
        }

        public TaskDescription(int i) {
            super(null);
            this.EZpvd = i;
        }
    }

    /* JADX INFO: renamed from: o.Fb$ActionBar */
    public static final class ActionBar extends AbstractC5109Fb {
        public final int OLrzqt;
        public final java.util.Set<FA.Application> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Fb$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, java.util.Set set, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                set = actionBar.copydefault;
            }
            return actionBar.EZpvd(i, set);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(int i, @NotNull java.util.Set<FA.Application> set) {
            Intrinsics.checkNotNullParameter(set, "");
            return new ActionBar(i, set);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Set<FA.Application> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5109Fb
        public int OLrzqt() {
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
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Attribute(fieldIndex=" + this.OLrzqt + ", names=" + this.copydefault + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(int i, @NotNull java.util.Set<FA.Application> set) {
            super(null);
            Intrinsics.checkNotNullParameter(set, "");
            this.OLrzqt = i;
            this.copydefault = set;
        }
    }
}

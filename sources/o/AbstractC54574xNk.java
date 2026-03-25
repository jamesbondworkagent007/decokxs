package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC54574xNk {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xNk.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC54574xNk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.xNk$ActionBar */
    public static final class ActionBar extends AbstractC54574xNk {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private AbstractC54574xNk() {
    }

    /* JADX INFO: renamed from: o.xNk$TaskDescription */
    public static final class TaskDescription extends AbstractC54574xNk {
        public final AbstractC54531xLw KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, AbstractC54531xLw abstractC54531xLw, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC54531xLw = taskDescription.KWHzl;
            }
            return taskDescription.KWHzl(abstractC54531xLw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(AbstractC54531xLw abstractC54531xLw) {
            return new TaskDescription(abstractC54531xLw);
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
            AbstractC54531xLw abstractC54531xLw = this.KWHzl;
            if (abstractC54531xLw == null) {
                return 0;
            }
            return abstractC54531xLw.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(biz=" + this.KWHzl + ")";
        }

        public TaskDescription(AbstractC54531xLw abstractC54531xLw) {
            super(null);
            this.KWHzl = abstractC54531xLw;
        }
    }
}

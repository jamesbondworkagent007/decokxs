package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55750xpo extends C55748xpm {
    public static Function0<java.lang.String> AEQbTJ;
    public static Function0<java.lang.String> KWHzl;
    public static final C55750xpo EZpvd = new C55750xpo();
    public static TaskDescription copydefault = new TaskDescription(0, "");
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<java.lang.String> function0) {
        KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<java.lang.String> function0) {
        AEQbTJ = function0;
    }

    private C55750xpo() {
    }

    /* JADX INFO: renamed from: o.xpo$TaskDescription */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                str = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(i, str);
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
            return this.OLrzqt == taskDescription.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ErrorInfo(time=" + this.OLrzqt + ", info=" + this.AEQbTJ + ")";
        }

        public TaskDescription(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = i;
            this.AEQbTJ = str;
        }
    }
}

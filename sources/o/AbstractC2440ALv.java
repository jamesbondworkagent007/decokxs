package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ALv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC2440ALv {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ALv.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC2440ALv(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2440ALv() {
    }

    /* JADX INFO: renamed from: o.ALv$Application */
    public static final class Application extends AbstractC2440ALv {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ALv$TaskDescription */
    public static final class TaskDescription extends AbstractC2440ALv {
        public static final int $stable = 8;
        public final C2436ALr EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C2436ALr c2436ALr, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c2436ALr = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(c2436ALr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C2436ALr AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull C2436ALr c2436ALr) {
            Intrinsics.checkNotNullParameter(c2436ALr, "");
            return new TaskDescription(c2436ALr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FeatureDiff(diffSet=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C2436ALr c2436ALr) {
            super(null);
            Intrinsics.checkNotNullParameter(c2436ALr, "");
            this.EZpvd = c2436ALr;
        }
    }
}

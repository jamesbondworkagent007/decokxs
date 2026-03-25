package o;

import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC35121npO {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.npO.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC35121npO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.npO$TaskDescription */
    public static final class TaskDescription extends AbstractC35121npO {
        public final P2PTradeSide KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, P2PTradeSide p2PTradeSide, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                p2PTradeSide = taskDescription.KWHzl;
            }
            return taskDescription.AEQbTJ(p2PTradeSide);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull P2PTradeSide p2PTradeSide) {
            Intrinsics.checkNotNullParameter(p2PTradeSide, "");
            return new TaskDescription(p2PTradeSide);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final P2PTradeSide copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.KWHzl == ((TaskDescription) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SwitchTradeSide(tradeSide=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull P2PTradeSide p2PTradeSide) {
            super(null);
            Intrinsics.checkNotNullParameter(p2PTradeSide, "");
            this.KWHzl = p2PTradeSide;
        }
    }

    private AbstractC35121npO() {
    }
}

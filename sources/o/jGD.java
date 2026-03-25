package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jGD extends RecyclerView.ViewHolder {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C22331hdO AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22331hdO KWHzl() {
        return this.AEQbTJ;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final jGD EZpvd(@NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C22331hdO c22331hdOCopydefault = C22331hdO.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c22331hdOCopydefault, "");
            return new jGD(c22331hdOCopydefault);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jGD(@NotNull C22331hdO c22331hdO) {
        super(c22331hdO.getRoot());
        Intrinsics.checkNotNullParameter(c22331hdO, "");
        this.AEQbTJ = c22331hdO;
    }
}

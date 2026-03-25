package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19613gIw extends RecyclerView.ViewHolder {
    public final C16475ekd KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16475ekd AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.gIw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gIw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C19613gIw KWHzl(@NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16475ekd c16475ekdKWHzl = C16475ekd.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16475ekdKWHzl, "");
            return new C19613gIw(c16475ekdKWHzl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19613gIw(@NotNull C16475ekd c16475ekd) {
        super(c16475ekd.getRoot());
        Intrinsics.checkNotNullParameter(c16475ekd, "");
        this.KWHzl = c16475ekd;
    }
}

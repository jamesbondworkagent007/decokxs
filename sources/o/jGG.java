package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jGG extends RecyclerView.ViewHolder {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final C22330hdN EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22330hdN copydefault() {
        return this.EZpvd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final jGG AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C22330hdN c22330hdNEZpvd = C22330hdN.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c22330hdNEZpvd, "");
            return new jGG(c22330hdNEZpvd);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jGG(@NotNull C22330hdN c22330hdN) {
        super(c22330hdN.getRoot());
        Intrinsics.checkNotNullParameter(c22330hdN, "");
        this.EZpvd = c22330hdN;
    }
}

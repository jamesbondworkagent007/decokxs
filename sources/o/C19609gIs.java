package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19609gIs extends RecyclerView.ViewHolder {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final C16474ekc AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16474ekc OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.gIs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gIs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C19609gIs OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16474ekc c16474ekcEZpvd = C16474ekc.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16474ekcEZpvd, "");
            return new C19609gIs(c16474ekcEZpvd);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19609gIs(@NotNull C16474ekc c16474ekc) {
        super(c16474ekc.getRoot());
        Intrinsics.checkNotNullParameter(c16474ekc, "");
        this.AEQbTJ = c16474ekc;
    }
}

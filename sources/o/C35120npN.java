package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35120npN extends RecyclerView.ViewHolder {
    public final android.widget.CheckBox AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.CheckBox KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35120npN(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.getUriFromString);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.copydefault = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(qZH.StateListAnimator.INotificationSideChannelStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(qZH.StateListAnimator.igXuih);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.AEQbTJ = (android.widget.CheckBox) viewFindViewById3;
    }
}

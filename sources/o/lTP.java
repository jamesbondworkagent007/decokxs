package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.ui.transaction.convert.view.LiteStatusBadge;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lTP extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView OLrzqt;
    public final LiteStatusBadge copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteStatusBadge AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lTP(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C31351lsQ.Application.fbC);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C31351lsQ.Application.DcMfJKfNUfqk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (LiteStatusBadge) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C31351lsQ.Application.DcMfJKRKUgwx);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.OLrzqt = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C31351lsQ.Application.getStatusCode);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById4;
    }
}

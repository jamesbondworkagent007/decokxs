package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51271vjq extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View AEQbTJ() {
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
    public final android.widget.TextView copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51271vjq(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.LayoutIncludeDetector);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.OLrzqt = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.isParserOutdated);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.mapNightMode);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.updateStateFromTypedArray);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.copydefault = viewFindViewById4;
    }
}

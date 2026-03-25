package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52544wPi extends RecyclerView.ViewHolder {
    public android.view.View AEQbTJ;
    public RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52544wPi(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.IResultReceiverDefault);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.OLrzqt = (RecyclerView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.finish);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AEQbTJ = viewFindViewById2;
    }
}

package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51247vjS extends RecyclerView.ViewHolder {
    public final android.widget.TextView AEQbTJ;
    public final C51347vlM EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55173xeu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51347vlM AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55173xeu OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51247vjS(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.createIntentFilterForBroadcastReceiver);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AEQbTJ = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.createConfigurationContext);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.DcMfJKffREWX);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.EZpvd = (C51347vlM) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.OKSWiw);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.copydefault = (C55173xeu) viewFindViewById4;
    }
}

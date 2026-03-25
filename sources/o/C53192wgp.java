package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53192wgp extends RecyclerView.ViewHolder {
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C49774uur copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49774uur OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53192wgp(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.dlRikr);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.PipHintTrackerKttrackPipAnimationHintViewflow11);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.OLrzqt = (android.widget.ImageView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.GCXiNH);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.copydefault = (C49774uur) viewFindViewById3;
    }
}

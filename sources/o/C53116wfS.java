package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53116wfS extends RecyclerView.ViewHolder {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatImageView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatTextView AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatTextView EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatTextView OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatImageView copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53116wfS(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.asInterface);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (AppCompatImageView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.onMessageChannelReady);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AEQbTJ = (AppCompatTextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.getElevation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.copydefault = (AppCompatTextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.onNavigationEvent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.OLrzqt = (AppCompatTextView) viewFindViewById4;
    }
}

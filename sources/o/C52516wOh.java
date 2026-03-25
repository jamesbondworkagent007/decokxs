package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52516wOh extends RecyclerView.ViewHolder {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55320xhi EZpvd;
    public final C55258xgZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.LinearLayout EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55320xhi KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52516wOh(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.DrawableRes);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AEQbTJ = (android.widget.LinearLayout) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.onApplyWindowInsets);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.EZpvd = (C55320xhi) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.EmptySuper);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        C55258xgZ c55258xgZ = (C55258xgZ) viewFindViewById3;
        this.copydefault = c55258xgZ;
        c55258xgZ.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
    }
}

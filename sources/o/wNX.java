package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wNX extends RecyclerView.ViewHolder {
    public final C55258xgZ AEQbTJ;
    public final C55258xgZ EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.view.ViewGroup OLrzqt;
    public final C55258xgZ copydefault;
    public final android.view.ViewGroup djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.ViewGroup copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.ViewGroup gEmmrt() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wNX(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.getCallingPackage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById;
        this.OLrzqt = viewGroup;
        android.view.View viewFindViewById2 = viewGroup.findViewById(C48033uCm.Application.from);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.EZpvd = (C55258xgZ) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.getLastKnownLocationForProvider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.djBIcL = (android.view.ViewGroup) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.FloatRange);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.copydefault = (C55258xgZ) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.EmptySuper);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.AEQbTJ = (C55258xgZ) viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.AudioAttributesImplApi21Parcelizer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.KWHzl = (android.widget.ImageView) viewFindViewById6;
    }
}

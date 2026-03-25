package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52486wNe extends RecyclerView.ViewHolder {
    public final C51601vqB EZpvd;
    public final C55258xgZ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51601vqB OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52486wNe(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.setCursor);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.Dfv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.EZpvd = (C51601vqB) viewFindViewById2;
    }
}

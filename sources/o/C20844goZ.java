package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20844goZ extends RecyclerView.ViewHolder {
    public static final int AEQbTJ = C55173xeu.EZpvd;
    public final C55173xeu KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55173xeu OLrzqt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20844goZ(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.aChkwz);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (C55173xeu) viewFindViewById;
    }
}

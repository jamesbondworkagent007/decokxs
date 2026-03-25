package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51251vjW extends RecyclerView.ViewHolder {
    public static final int copydefault = wYK.copydefault;
    public final wYK KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wYK KWHzl() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51251vjW(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.OgHfcT);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (wYK) viewFindViewById;
    }
}

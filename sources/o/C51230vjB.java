package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51230vjB extends RecyclerView.ViewHolder {
    public final AppCompatTextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatTextView KWHzl() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51230vjB(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.OLrzqt = (AppCompatTextView) viewFindViewById;
    }
}

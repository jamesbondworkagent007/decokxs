package o;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pjc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38977pjc extends RecyclerView.ViewHolder {
    public final FlexboxLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FlexboxLayout copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38977pjc(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.onNavigationEvent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.KWHzl = (FlexboxLayout) viewFindViewById;
    }
}

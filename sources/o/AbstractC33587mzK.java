package o;

import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC33587mzK {
    public final int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract AbstractViewOnClickListenerC33585mzI<C33583mzG> EZpvd(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup, boolean z);

    public AbstractC33587mzK(@androidx.annotation.ColorInt int i) {
        this.AEQbTJ = i;
    }

    public final AbstractViewOnClickListenerC33585mzI<C33583mzG> copydefault(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C32113mPz.Fragment.AubY, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C33591mzO(viewInflate, z);
    }
}

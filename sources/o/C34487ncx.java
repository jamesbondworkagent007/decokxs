package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34487ncx extends DiffUtil.ItemCallback<C34462ncY> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C34462ncY c34462ncY, @NotNull C34462ncY c34462ncY2) {
        Intrinsics.checkNotNullParameter(c34462ncY, "");
        Intrinsics.checkNotNullParameter(c34462ncY2, "");
        return c34462ncY.OLrzqt() == c34462ncY2.OLrzqt();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C34462ncY c34462ncY, @NotNull C34462ncY c34462ncY2) {
        Intrinsics.checkNotNullParameter(c34462ncY, "");
        Intrinsics.checkNotNullParameter(c34462ncY2, "");
        return Intrinsics.EZpvd(c34462ncY, c34462ncY2);
    }
}

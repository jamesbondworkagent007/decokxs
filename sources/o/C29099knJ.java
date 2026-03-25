package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29099knJ extends DiffUtil.ItemCallback<C29182kon> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C29182kon c29182kon, @NotNull C29182kon c29182kon2) {
        Intrinsics.checkNotNullParameter(c29182kon, "");
        Intrinsics.checkNotNullParameter(c29182kon2, "");
        return c29182kon.KWHzl() == c29182kon2.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C29182kon c29182kon, @NotNull C29182kon c29182kon2) {
        Intrinsics.checkNotNullParameter(c29182kon, "");
        Intrinsics.checkNotNullParameter(c29182kon2, "");
        return Intrinsics.EZpvd(c29182kon, c29182kon2);
    }
}

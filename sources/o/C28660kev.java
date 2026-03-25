package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28660kev extends DiffUtil.ItemCallback<C28653keo> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C28653keo c28653keo, @NotNull C28653keo c28653keo2) {
        Intrinsics.checkNotNullParameter(c28653keo, "");
        Intrinsics.checkNotNullParameter(c28653keo2, "");
        return Intrinsics.EZpvd(c28653keo, c28653keo2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C28653keo c28653keo, @NotNull C28653keo c28653keo2) {
        Intrinsics.checkNotNullParameter(c28653keo, "");
        Intrinsics.checkNotNullParameter(c28653keo2, "");
        return Intrinsics.EZpvd(c28653keo, c28653keo2);
    }
}

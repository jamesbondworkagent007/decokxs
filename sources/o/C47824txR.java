package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47828txV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47824txR<Vo extends InterfaceC47828txV> extends DiffUtil.ItemCallback<Vo> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull Vo vo, @NotNull Vo vo2) {
        Intrinsics.checkNotNullParameter(vo, "");
        Intrinsics.checkNotNullParameter(vo2, "");
        return vo.copydefault(vo2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull Vo vo, @NotNull Vo vo2) {
        Intrinsics.checkNotNullParameter(vo, "");
        Intrinsics.checkNotNullParameter(vo2, "");
        return vo.KWHzl(vo2);
    }
}

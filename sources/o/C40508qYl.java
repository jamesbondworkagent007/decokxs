package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40508qYl<Vo extends InterfaceC40516qYt> extends DiffUtil.ItemCallback<Vo> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull Vo vo, @NotNull Vo vo2) {
        Intrinsics.checkNotNullParameter(vo, "");
        Intrinsics.checkNotNullParameter(vo2, "");
        return vo.onCompareItems(vo2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull Vo vo, @NotNull Vo vo2) {
        Intrinsics.checkNotNullParameter(vo, "");
        Intrinsics.checkNotNullParameter(vo2, "");
        return vo.onCompareContents(vo2);
    }
}

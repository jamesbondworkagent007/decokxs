package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jRV extends DiffUtil.ItemCallback<jRP> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull jRP jrp, @NotNull jRP jrp2) {
        Intrinsics.checkNotNullParameter(jrp, "");
        Intrinsics.checkNotNullParameter(jrp2, "");
        return Intrinsics.EZpvd((java.lang.Object) jrp.valueOf(), (java.lang.Object) jrp2.valueOf());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull jRP jrp, @NotNull jRP jrp2) {
        Intrinsics.checkNotNullParameter(jrp, "");
        Intrinsics.checkNotNullParameter(jrp2, "");
        return Intrinsics.EZpvd(jrp, jrp2);
    }
}

package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uJP extends DiffUtil.ItemCallback<uJO> {
    public static final uJP OLrzqt = new uJP();

    private uJP() {
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull uJO ujo, @NotNull uJO ujo2) {
        Intrinsics.checkNotNullParameter(ujo, "");
        Intrinsics.checkNotNullParameter(ujo2, "");
        return Intrinsics.EZpvd((java.lang.Object) ujo.AkhnZx(), (java.lang.Object) ujo2.AkhnZx());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull uJO ujo, @NotNull uJO ujo2) {
        Intrinsics.checkNotNullParameter(ujo, "");
        Intrinsics.checkNotNullParameter(ujo2, "");
        return Intrinsics.EZpvd(ujo, ujo2);
    }
}

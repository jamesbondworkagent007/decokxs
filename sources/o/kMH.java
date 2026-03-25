package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kMH extends DiffUtil.ItemCallback<kMU> {
    public static final kMH OLrzqt = new kMH();

    private kMH() {
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull kMU kmu, @NotNull kMU kmu2) {
        Intrinsics.checkNotNullParameter(kmu, "");
        Intrinsics.checkNotNullParameter(kmu2, "");
        return kmu.compareId(kmu2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull kMU kmu, @NotNull kMU kmu2) {
        Intrinsics.checkNotNullParameter(kmu, "");
        Intrinsics.checkNotNullParameter(kmu2, "");
        return kmu.compareContent(kmu2);
    }

    /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Object getChangePayload(@NotNull kMU kmu, @NotNull kMU kmu2) {
        Intrinsics.checkNotNullParameter(kmu, "");
        Intrinsics.checkNotNullParameter(kmu2, "");
        return kmu.getChangePayload(kmu2);
    }
}

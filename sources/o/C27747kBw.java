package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.market.features.vibes.ui.VibesKolUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kBw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27747kBw extends DiffUtil.ItemCallback<VibesKolUiModel> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull VibesKolUiModel vibesKolUiModel, @NotNull VibesKolUiModel vibesKolUiModel2) {
        Intrinsics.checkNotNullParameter(vibesKolUiModel, "");
        Intrinsics.checkNotNullParameter(vibesKolUiModel2, "");
        return Intrinsics.EZpvd(vibesKolUiModel, vibesKolUiModel2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull VibesKolUiModel vibesKolUiModel, @NotNull VibesKolUiModel vibesKolUiModel2) {
        Intrinsics.checkNotNullParameter(vibesKolUiModel, "");
        Intrinsics.checkNotNullParameter(vibesKolUiModel2, "");
        return Intrinsics.EZpvd(vibesKolUiModel, vibesKolUiModel2);
    }
}

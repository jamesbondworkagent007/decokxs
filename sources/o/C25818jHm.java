package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25818jHm extends DiffUtil.ItemCallback<AlertUiItem> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull AlertUiItem alertUiItem, @NotNull AlertUiItem alertUiItem2) {
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        Intrinsics.checkNotNullParameter(alertUiItem2, "");
        return Intrinsics.EZpvd((java.lang.Object) alertUiItem.OLrzqt(), (java.lang.Object) alertUiItem2.OLrzqt());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull AlertUiItem alertUiItem, @NotNull AlertUiItem alertUiItem2) {
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        Intrinsics.checkNotNullParameter(alertUiItem2, "");
        return Intrinsics.EZpvd(alertUiItem, alertUiItem2);
    }
}

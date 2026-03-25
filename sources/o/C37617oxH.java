package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.im.imui.sticker.model.ListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37617oxH extends DiffUtil.ItemCallback<ListItem> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull ListItem listItem, @NotNull ListItem listItem2) {
        Intrinsics.checkNotNullParameter(listItem, "");
        Intrinsics.checkNotNullParameter(listItem2, "");
        if ((listItem instanceof ListItem.AddButton) && (listItem2 instanceof ListItem.AddButton)) {
            return true;
        }
        if ((listItem instanceof ListItem.StickerItem) && (listItem2 instanceof ListItem.StickerItem)) {
            return Intrinsics.EZpvd((java.lang.Object) ((ListItem.StickerItem) listItem2).OLrzqt().KWHzl(), (java.lang.Object) ((ListItem.StickerItem) listItem).OLrzqt().KWHzl());
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull ListItem listItem, @NotNull ListItem listItem2) {
        Intrinsics.checkNotNullParameter(listItem, "");
        Intrinsics.checkNotNullParameter(listItem2, "");
        if ((listItem instanceof ListItem.AddButton) && (listItem2 instanceof ListItem.AddButton)) {
            return true;
        }
        if ((listItem instanceof ListItem.StickerItem) && (listItem2 instanceof ListItem.StickerItem)) {
            return Intrinsics.EZpvd(listItem2, listItem);
        }
        return false;
    }
}

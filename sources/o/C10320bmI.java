package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.defi.assets.utxo.widget.UtxoAssetDisplayItem;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10320bmI extends C43316rmw {
    public final ActionBar EZpvd;
    public final AsyncListDiffer<UtxoAssetDisplayItem> KWHzl;

    public C10320bmI() {
        register(UtxoAssetDisplayItem.class, new C10328bmQ(new Function1() { // from class: o.bmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10320bmI.KWHzl(this.KWHzl, (UtxoAssetDisplayItem) obj));
            }
        }));
        ActionBar actionBar = new ActionBar();
        this.EZpvd = actionBar;
        this.KWHzl = new AsyncListDiffer<>(this, actionBar);
    }

    public static final boolean KWHzl(C10320bmI c10320bmI, UtxoAssetDisplayItem utxoAssetDisplayItem) {
        Intrinsics.checkNotNullParameter(utxoAssetDisplayItem, "");
        java.util.List<UtxoAssetDisplayItem> currentList = c10320bmI.KWHzl.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        UtxoAssetDisplayItem utxoAssetDisplayItem2 = (UtxoAssetDisplayItem) CollectionsKt___CollectionsKt.wlaJM(currentList);
        return Intrinsics.EZpvd((java.lang.Object) (utxoAssetDisplayItem2 != null ? utxoAssetDisplayItem2.copydefault() : null), (java.lang.Object) utxoAssetDisplayItem.copydefault());
    }

    /* JADX INFO: renamed from: o.bmI$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<UtxoAssetDisplayItem> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(UtxoAssetDisplayItem utxoAssetDisplayItem, UtxoAssetDisplayItem utxoAssetDisplayItem2) {
            Intrinsics.checkNotNullParameter(utxoAssetDisplayItem, "");
            Intrinsics.checkNotNullParameter(utxoAssetDisplayItem2, "");
            return Intrinsics.EZpvd((java.lang.Object) utxoAssetDisplayItem.copydefault(), (java.lang.Object) utxoAssetDisplayItem2.copydefault());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(UtxoAssetDisplayItem utxoAssetDisplayItem, UtxoAssetDisplayItem utxoAssetDisplayItem2) {
            Intrinsics.checkNotNullParameter(utxoAssetDisplayItem, "");
            Intrinsics.checkNotNullParameter(utxoAssetDisplayItem2, "");
            return Intrinsics.EZpvd(utxoAssetDisplayItem, utxoAssetDisplayItem2);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<UtxoAssetDisplayItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.submitList(list, new java.lang.Runnable() { // from class: o.bmJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C10320bmI.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(C10320bmI c10320bmI) {
        super.setItems(c10320bmI.KWHzl.getCurrentList());
    }
}

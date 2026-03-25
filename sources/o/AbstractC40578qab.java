package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.market.bean.CoinQuote;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40578qab extends C59534zip {
    public final DiffUtil.ItemCallback<java.lang.Object> OLrzqt = new ActionBar();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qaa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC40578qab.OLrzqt(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.qab$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<java.lang.Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return false;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof CoinQuote) && (obj2 instanceof CoinQuote)) {
                CoinQuote coinQuote = (CoinQuote) obj;
                CoinQuote coinQuote2 = (CoinQuote) obj2;
                if (!Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstId(), (java.lang.Object) coinQuote2.getInstId()) || !Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) coinQuote2.getInstType())) {
                    return false;
                }
            }
            return true;
        }
    }

    private final AsyncListDiffer<java.lang.Object> AEQbTJ() {
        return (AsyncListDiffer) this.KWHzl.getValue();
    }

    public static final AsyncListDiffer OLrzqt(AbstractC40578qab abstractC40578qab) {
        return new AsyncListDiffer(abstractC40578qab, abstractC40578qab.OLrzqt);
    }

    public static /* synthetic */ void submitList$default(AbstractC40578qab abstractC40578qab, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        abstractC40578qab.copydefault(list, runnable);
    }

    public final void copydefault(java.util.List<? extends java.lang.Object> list, java.lang.Runnable runnable) {
        java.util.List<?> arrayList;
        if (list == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        setItems(arrayList);
        AEQbTJ().submitList(list, runnable);
    }
}

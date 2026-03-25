package o;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47831txY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC47840txh<T extends InterfaceC47831txY> extends FragmentStateAdapter {
    public final InterfaceC56387yDm KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC47840txh(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.txk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC47840txh.OLrzqt(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.txh$TaskDescription */
    public final class TaskDescription extends DiffUtil.ItemCallback<T> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull T t, @NotNull T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return t.onCompareItems(t2);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull T t, @NotNull T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return t.onCompareContents(t2);
        }
    }

    private final AsyncListDiffer<T> KWHzl() {
        return (AsyncListDiffer) this.KWHzl.getValue();
    }

    public static final AsyncListDiffer OLrzqt(AbstractC47840txh abstractC47840txh) {
        return new AsyncListDiffer(abstractC47840txh, new TaskDescription());
    }

    public static /* synthetic */ void submitList$default(AbstractC47840txh abstractC47840txh, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        abstractC47840txh.EZpvd(list, runnable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T extends o.txY> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.util.List<? extends T> list, java.lang.Runnable runnable) {
        KWHzl().submitList(list, runnable);
    }

    public final java.util.List<T> AEQbTJ() {
        java.util.List<T> currentList = KWHzl().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return currentList;
    }

    public final T KWHzl(int i) {
        java.util.List<T> currentList = KWHzl().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return (T) CollectionsKt___CollectionsKt.AkhnZx(currentList, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return KWHzl().getCurrentList().size();
    }
}

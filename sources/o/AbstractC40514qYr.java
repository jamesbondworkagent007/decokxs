package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40518qYv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40514qYr<T extends InterfaceC40518qYv> extends FragmentStateAdapter {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC40514qYr(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.qYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC40514qYr.valueOf();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC40514qYr.EZpvd(this.KWHzl);
            }
        });
    }

    public final android.util.LongSparseArray<java.lang.Integer> AhwBna() {
        return (android.util.LongSparseArray) this.valueOf.getValue();
    }

    public static final android.util.LongSparseArray valueOf() {
        return new android.util.LongSparseArray();
    }

    /* JADX INFO: renamed from: o.qYr$TaskDescription */
    public final class TaskDescription extends DiffUtil.ItemCallback<T> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull T t, @NotNull T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return t.onCompareItems(t2);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull T t, @NotNull T t2) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(t2, "");
            return t.onCompareContents(t2);
        }
    }

    private final AsyncListDiffer<T> AEQbTJ() {
        return (AsyncListDiffer) this.EZpvd.getValue();
    }

    public static final AsyncListDiffer EZpvd(AbstractC40514qYr abstractC40514qYr) {
        return new AsyncListDiffer(abstractC40514qYr, new TaskDescription());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qYr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(AbstractC40514qYr abstractC40514qYr, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        abstractC40514qYr.EZpvd(list, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T extends o.qYv> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(final java.util.List<? extends T> list, final Function0<Unit> function0) {
        AEQbTJ().submitList(list, new java.lang.Runnable() { // from class: o.qYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC40514qYr.AEQbTJ(this.KWHzl, list, function0);
            }
        });
    }

    public static final void AEQbTJ(AbstractC40514qYr abstractC40514qYr, java.util.List list, Function0 function0) {
        abstractC40514qYr.AhwBna().clear();
        if (list != null) {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                abstractC40514qYr.AhwBna().put(abstractC40514qYr.getItemId(i), java.lang.Integer.valueOf(i));
                i++;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final java.util.List<T> gEmmrt() {
        java.util.List<T> currentList = AEQbTJ().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return currentList;
    }

    public final T AhwBna(int i) {
        java.util.List<T> currentList = AEQbTJ().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return (T) CollectionsKt___CollectionsKt.AkhnZx(currentList, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return AEQbTJ().getCurrentList().size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        long jHashCode = AhwBna(i) != null ? r0.hashCode() : i;
        AhwBna().put(jHashCode, java.lang.Integer.valueOf(i));
        return jHashCode;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j) {
        return AhwBna().indexOfKey(j) >= 0;
    }
}

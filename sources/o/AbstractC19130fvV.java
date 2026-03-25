package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC19132fvX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19130fvV<T extends InterfaceC19132fvX> extends FragmentStateAdapter {
    public final InterfaceC56387yDm EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC19130fvV(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC19130fvV.EZpvd(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.fvV$TaskDescription */
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

    private final AsyncListDiffer<T> OLrzqt() {
        return (AsyncListDiffer) this.EZpvd.getValue();
    }

    public static final AsyncListDiffer EZpvd(AbstractC19130fvV abstractC19130fvV) {
        return new AsyncListDiffer(abstractC19130fvV, new TaskDescription());
    }

    public static /* synthetic */ void submitList$default(AbstractC19130fvV abstractC19130fvV, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        abstractC19130fvV.KWHzl(list, runnable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T extends o.fvX> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.util.List<? extends T> list, java.lang.Runnable runnable) {
        OLrzqt().submitList(list, runnable);
    }

    public final T EZpvd(int i) {
        java.util.List<T> currentList = OLrzqt().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return (T) CollectionsKt___CollectionsKt.AkhnZx(currentList, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return OLrzqt().getCurrentList().size();
    }
}

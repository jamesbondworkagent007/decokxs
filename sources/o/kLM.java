package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kLF;
import o.kLL;
import o.kLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kLM<T, VH extends kLN<T>, HVH extends kLF> extends androidx.recyclerview.widget.ListAdapter<kLL<? extends T>, RecyclerView.ViewHolder> {
    public static final TaskDescription Companion = new TaskDescription(null);

    public abstract HVH OLrzqt(@NotNull android.view.ViewGroup viewGroup);

    public abstract VH copydefault(@NotNull android.view.ViewGroup viewGroup);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kLM(@NotNull kLO<T> klo) {
        super(klo);
        Intrinsics.checkNotNullParameter(klo, "");
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kLM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        kLL kll = (kLL) getItem(i);
        if (kll instanceof kLL.Activity) {
            return 0;
        }
        if (kll instanceof kLL.FragmentManager) {
            return 1;
        }
        if (kll instanceof kLL.StateListAnimator) {
            return 2;
        }
        if (kll instanceof kLL.ActionBar) {
            return 3;
        }
        if (kll instanceof kLL.TaskDescription) {
            return 4;
        }
        throw new java.lang.IllegalArgumentException("Unknown view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 0) {
            return copydefault(viewGroup);
        }
        if (i == 1) {
            return AhwBna(viewGroup);
        }
        if (i == 2) {
            return OLrzqt(viewGroup);
        }
        if (i == 3) {
            return KWHzl(viewGroup);
        }
        if (i == 4) {
            return gEmmrt(viewGroup);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: o.kLN */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        kLL kll = (kLL) getItem(i);
        if (viewHolder instanceof kLN) {
            kLL.Activity activity = kll instanceof kLL.Activity ? (kLL.Activity) kll : null;
            if (activity == null) {
                return;
            }
            ((kLN) viewHolder).EZpvd(activity.AEQbTJ());
            return;
        }
        if (viewHolder instanceof kLF) {
            ((kLF) viewHolder).AEQbTJ();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kLM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateList$default(kLM klm, java.util.List list, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateList");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        klm.copydefault(list, z, function0);
    }

    public void copydefault(java.util.List<? extends T> list, boolean z, final Function0<Unit> function0) {
        java.util.List<T> arrayList = new java.util.ArrayList<>();
        arrayList.add(kLL.StateListAnimator.EZpvd);
        if (list != null) {
            if (list.isEmpty()) {
                arrayList.add(kLL.ActionBar.copydefault);
            } else {
                java.util.Collection<? extends T> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new kLL.Activity(it.next()));
                }
                arrayList.addAll(arrayList2);
            }
            if (z) {
                arrayList.add(kLL.FragmentManager.EZpvd);
            }
        }
        submitList(arrayList, new java.lang.Runnable() { // from class: o.kLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kLM.KWHzl(function0);
            }
        });
    }

    public static final void KWHzl(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return kLT.AEQbTJ(viewGroup);
    }

    public RecyclerView.ViewHolder AhwBna(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return kLT.OLrzqt(viewGroup);
    }

    public RecyclerView.ViewHolder gEmmrt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return kLT.EZpvd(viewGroup);
    }
}

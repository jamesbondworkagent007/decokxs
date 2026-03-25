package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.InterfaceC29022klm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C29018kli<T, V extends InterfaceC29022klm<T>> extends RecyclerView.Adapter<Application<T, V>> {
    public final java.util.List<T> AEQbTJ;
    public final Function1<T, Unit> EZpvd;
    public final Function1<android.content.Context, V> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, ? extends V extends o.klm<T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C29018kli(@NotNull java.util.List<? extends T> list, @NotNull Function1<? super android.content.Context, ? extends V> function1, Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = list;
        this.KWHzl = function1;
        this.EZpvd = function12;
    }

    /* JADX INFO: renamed from: o.kli$Application */
    public static final class Application<T, V extends InterfaceC29022klm<T>> extends RecyclerView.ViewHolder {
        public final V KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: V extends o.klm<T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull V v) {
            super((android.view.View) v);
            Intrinsics.checkNotNullParameter(v, "");
            this.KWHzl = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kli$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(Application application, java.lang.Object obj, Function1 function1, int i, java.lang.Object obj2) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            application.AEQbTJ(obj, function1);
        }

        public final void AEQbTJ(T t, Function1<? super T, Unit> function1) {
            this.KWHzl.setData(t, function1);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application<T, V> onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Function1<android.content.Context, V> function1 = this.KWHzl;
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new Application<>(function1.invoke(context));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.kli$Application<T, V extends o.klm<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application<T, V> application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        if (this.AEQbTJ.isEmpty()) {
            return;
        }
        java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, this.AEQbTJ.size() == 1 ? 0 : i % this.AEQbTJ.size());
        if (objAkhnZx == null) {
            return;
        }
        application.AEQbTJ(objAkhnZx, this.EZpvd);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.AEQbTJ.isEmpty()) {
            return 0;
        }
        return this.AEQbTJ.size() == 1 ? 1 : Integer.MAX_VALUE;
    }

    public final int OLrzqt() {
        if (this.AEQbTJ.isEmpty() || this.AEQbTJ.size() == 1) {
            return 0;
        }
        return LockFreeTaskQueueCore.MAX_CAPACITY_MASK - (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % this.AEQbTJ.size());
    }
}

package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.kLL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kLH<T, VH extends RecyclerView.ViewHolder> extends androidx.recyclerview.widget.ListAdapter<kLL<? extends T>, RecyclerView.ViewHolder> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int fetchVPNInfo = 8;
    public final androidx.fragment.app.FragmentManager AkhnZx;
    public final java.lang.String isConnected;
    public final androidx.fragment.app.Fragment values;

    public abstract kLN<T> OLrzqt(@NotNull android.view.ViewGroup viewGroup);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kLH(@NotNull kLO<T> klo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str) {
        super(klo);
        Intrinsics.checkNotNullParameter(klo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = fragmentManager;
        this.values = fragment;
        this.isConnected = str;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kLH.TaskDescription.<init>():void type: THIS */
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
        if (kll instanceof kLL.Application) {
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
            return OLrzqt(viewGroup);
        }
        if (i == 1) {
            return AhwBna(viewGroup);
        }
        if (i == 2) {
            return copydefault(viewGroup);
        }
        if (i == 3) {
            return KWHzl(viewGroup);
        }
        if (i == 4) {
            return EZpvd(viewGroup);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: o.kLN */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        android.view.ViewGroup viewGroup;
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
        if (!(viewHolder instanceof kLJ) || (viewGroup = (android.view.ViewGroup) viewHolder.itemView.findViewById(C23274hvD.Application.RFmUsE)) == null) {
            return;
        }
        if (ViewCompat.isAttachedToWindow(viewGroup)) {
            if (this.AkhnZx.isStateSaved() || this.AkhnZx.isDestroyed()) {
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.AkhnZx.findFragmentByTag(this.isConnected);
            if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded() || fragmentFindFragmentByTag.getView() == null) {
                androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = this.AkhnZx.beginTransaction().replace(C23274hvD.Application.RFmUsE, this.values, this.isConnected);
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
                copydefault(viewGroup, fragmentTransactionReplace);
                return;
            }
            android.view.View view = fragmentFindFragmentByTag.getView();
            if ((view != null ? view.getParent() : null) == null || viewGroup.getChildCount() == 0) {
                viewGroup.removeAllViews();
                android.view.View view2 = fragmentFindFragmentByTag.getView();
                if (view2 != null) {
                    android.view.ViewParent parent = view2.getParent();
                    android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view2);
                    }
                    viewGroup.addView(view2);
                    return;
                }
                return;
            }
            return;
        }
        viewGroup.addOnAttachStateChangeListener(new ActionBar(viewGroup, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        AYXKKw();
    }

    public static final class ActionBar implements View.OnAttachStateChangeListener {
        public final /* synthetic */ kLH EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public ActionBar(android.view.View view, kLH klh) {
            this.KWHzl = view;
            this.EZpvd = klh;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.removeOnAttachStateChangeListener(this);
            android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
            if (viewGroup == null || this.EZpvd.AkhnZx.isStateSaved() || this.EZpvd.AkhnZx.isDestroyed()) {
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.EZpvd.AkhnZx.findFragmentByTag(this.EZpvd.isConnected);
            if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded() || fragmentFindFragmentByTag.getView() == null) {
                androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = this.EZpvd.AkhnZx.beginTransaction().replace(C23274hvD.Application.RFmUsE, this.EZpvd.values, this.EZpvd.isConnected);
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
                this.EZpvd.copydefault(viewGroup, fragmentTransactionReplace);
                return;
            }
            android.view.View view2 = fragmentFindFragmentByTag.getView();
            if ((view2 != null ? view2.getParent() : null) == null || viewGroup.getChildCount() == 0) {
                viewGroup.removeAllViews();
                android.view.View view3 = fragmentFindFragmentByTag.getView();
                if (view3 != null) {
                    android.view.ViewParent parent = view3.getParent();
                    android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view3);
                    }
                    viewGroup.addView(view3);
                }
            }
        }
    }

    public final void copydefault(android.view.ViewGroup viewGroup, androidx.fragment.app.FragmentTransaction fragmentTransaction) {
        try {
            if (!this.AkhnZx.isDestroyed() && !this.AkhnZx.isStateSaved() && viewGroup.isAttachedToWindow() && viewGroup.getWindowToken() != null) {
                fragmentTransaction.commitAllowingStateLoss();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("DEX-OKTR", "Fragment transaction failed silently: " + e.getMessage());
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

    public RecyclerView.ViewHolder EZpvd(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return kLT.EZpvd(viewGroup);
    }

    public RecyclerView.ViewHolder copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C23274hvD.Activity.DGgnkA, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new kLJ(viewInflate);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kLH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateList$default(kLH klh, java.util.List list, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateList");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        klh.AEQbTJ(list, z, function0);
    }

    public void AEQbTJ(java.util.List<? extends T> list, boolean z, final Function0<Unit> function0) {
        java.util.List<T> arrayList = new java.util.ArrayList<>();
        arrayList.add(kLL.Application.KWHzl);
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
        submitList(arrayList, new java.lang.Runnable() { // from class: o.kLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kLH.OLrzqt(function0);
            }
        });
    }

    public static final void OLrzqt(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public void AhwBna() {
        java.util.List<T> arrayList = new java.util.ArrayList<>();
        arrayList.add(kLL.Application.KWHzl);
        arrayList.add(kLL.TaskDescription.EZpvd);
        submitList(arrayList);
    }

    public final java.util.List<T> djBIcL() {
        java.util.List<T> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : currentList) {
            if (t instanceof kLL.Activity) {
                arrayList.add(t);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kLL.Activity) it.next()).AEQbTJ());
        }
        return arrayList2;
    }

    public final void AYXKKw() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.AkhnZx.findFragmentByTag(this.isConnected);
        if (this.AkhnZx.isDestroyed() || this.AkhnZx.isStateSaved() || fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            return;
        }
        android.view.View view = fragmentFindFragmentByTag.getView();
        if ((view != null ? view.getParent() : null) != null) {
            this.AkhnZx.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
    }
}

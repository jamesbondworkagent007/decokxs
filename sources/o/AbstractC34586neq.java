package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.InterfaceC34593ney;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC34586neq<T, VH extends RecyclerView.ViewHolder> extends androidx.recyclerview.widget.ListAdapter<InterfaceC34593ney<? extends T>, RecyclerView.ViewHolder> {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final java.lang.String DbNXlk;
    public final androidx.fragment.app.Fragment fetchVPNInfo;
    public final androidx.fragment.app.FragmentManager values;

    public abstract AbstractC34591nev<T> OLrzqt(@NotNull android.view.ViewGroup viewGroup);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34586neq(@NotNull Cnew<T> cnew, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str) {
        super(cnew);
        Intrinsics.checkNotNullParameter(cnew, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.values = fragmentManager;
        this.fetchVPNInfo = fragment;
        this.DbNXlk = str;
    }

    /* JADX INFO: renamed from: o.neq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.neq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        InterfaceC34593ney interfaceC34593ney = (InterfaceC34593ney) getItem(i);
        if (interfaceC34593ney instanceof InterfaceC34593ney.Application) {
            return 0;
        }
        if (interfaceC34593ney instanceof InterfaceC34593ney.TaskDescription) {
            return 1;
        }
        if (interfaceC34593ney instanceof InterfaceC34593ney.StateListAnimator) {
            return 2;
        }
        if (interfaceC34593ney instanceof InterfaceC34593ney.Activity) {
            return 3;
        }
        if (interfaceC34593ney instanceof InterfaceC34593ney.ActionBar) {
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
            return AEQbTJ(viewGroup);
        }
        if (i == 4) {
            return KWHzl(viewGroup);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: o.nev */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        android.view.ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        InterfaceC34593ney interfaceC34593ney = (InterfaceC34593ney) getItem(i);
        if (viewHolder instanceof AbstractC34591nev) {
            InterfaceC34593ney.Application application = interfaceC34593ney instanceof InterfaceC34593ney.Application ? (InterfaceC34593ney.Application) interfaceC34593ney : null;
            if (application == null) {
                return;
            }
            ((AbstractC34591nev) viewHolder).EZpvd(application.copydefault());
            return;
        }
        if (!(viewHolder instanceof C34588nes) || (viewGroup = (android.view.ViewGroup) viewHolder.itemView.findViewById(C35964oKf.StateListAnimator.iCPUKe)) == null) {
            return;
        }
        if (ViewCompat.isAttachedToWindow(viewGroup)) {
            if (this.values.isStateSaved() || this.values.isDestroyed()) {
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.values.findFragmentByTag(this.DbNXlk);
            if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded() || fragmentFindFragmentByTag.getView() == null) {
                androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = this.values.beginTransaction().replace(C35964oKf.StateListAnimator.iCPUKe, this.fetchVPNInfo, this.DbNXlk);
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
                AEQbTJ(viewGroup, fragmentTransactionReplace);
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
        viewGroup.addOnAttachStateChangeListener(new TaskDescription(viewGroup, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        KWHzl();
    }

    /* JADX INFO: renamed from: o.neq$TaskDescription */
    public static final class TaskDescription implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ AbstractC34586neq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public TaskDescription(android.view.View view, AbstractC34586neq abstractC34586neq) {
            this.EZpvd = view;
            this.copydefault = abstractC34586neq;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.removeOnAttachStateChangeListener(this);
            android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
            if (viewGroup == null || this.copydefault.values.isStateSaved() || this.copydefault.values.isDestroyed()) {
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.copydefault.values.findFragmentByTag(this.copydefault.DbNXlk);
            if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded() || fragmentFindFragmentByTag.getView() == null) {
                androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = this.copydefault.values.beginTransaction().replace(C35964oKf.StateListAnimator.iCPUKe, this.copydefault.fetchVPNInfo, this.copydefault.DbNXlk);
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
                this.copydefault.AEQbTJ(viewGroup, fragmentTransactionReplace);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(android.view.ViewGroup viewGroup, androidx.fragment.app.FragmentTransaction fragmentTransaction) {
        try {
            if (!this.values.isDestroyed() && !this.values.isStateSaved() && viewGroup.isAttachedToWindow() && viewGroup.getWindowToken() != null) {
                fragmentTransaction.commitAllowingStateLoss();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("DEX-OKTR", "Fragment transaction failed silently: " + e.getMessage());
        }
    }

    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C34545neB.copydefault(viewGroup);
    }

    public RecyclerView.ViewHolder AhwBna(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C34545neB.AEQbTJ(viewGroup);
    }

    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C34545neB.EZpvd(viewGroup);
    }

    public RecyclerView.ViewHolder copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35964oKf.Application.DNMMPQ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C34588nes(viewInflate);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.neq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateList$default(AbstractC34586neq abstractC34586neq, java.util.List list, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateList");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        abstractC34586neq.AEQbTJ(list, z, (Function0<Unit>) function0);
    }

    public void AEQbTJ(java.util.List<? extends T> list, boolean z, final Function0<Unit> function0) {
        java.util.List<T> arrayList = new java.util.ArrayList<>();
        arrayList.add(InterfaceC34593ney.StateListAnimator.OLrzqt);
        if (list != null) {
            if (list.isEmpty()) {
                arrayList.add(InterfaceC34593ney.Activity.copydefault);
            } else {
                java.util.Collection<? extends T> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InterfaceC34593ney.Application(it.next()));
                }
                arrayList.addAll(arrayList2);
            }
            if (z) {
                arrayList.add(InterfaceC34593ney.TaskDescription.EZpvd);
            }
        }
        submitList(arrayList, new java.lang.Runnable() { // from class: o.nep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC34586neq.KWHzl(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final java.util.List<T> AYXKKw() {
        java.util.List<T> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : currentList) {
            if (t instanceof InterfaceC34593ney.Application) {
                arrayList.add(t);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC34593ney.Application) it.next()).copydefault());
        }
        return arrayList2;
    }

    public final void KWHzl() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.values.findFragmentByTag(this.DbNXlk);
        if (this.values.isDestroyed() || this.values.isStateSaved() || fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            return;
        }
        android.view.View view = fragmentFindFragmentByTag.getView();
        if ((view != null ? view.getParent() : null) != null) {
            this.values.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
    }
}

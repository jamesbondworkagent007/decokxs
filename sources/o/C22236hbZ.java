package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22236hbZ;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22236hbZ extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function1<java.lang.Object, Unit> AEQbTJ;
    public Function0<Unit> AhwBna;
    public C20054gZe<?> EZpvd;
    public final C43316rmw KWHzl = new C43316rmw();
    public final boolean copydefault = true;
    public java.lang.Object djBIcL;
    public C23492hzJ gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.hbZ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hbZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hbZ$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void show$default(StateListAnimator stateListAnimator, androidx.fragment.app.FragmentManager fragmentManager, C20054gZe c20054gZe, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function0 = null;
            }
            stateListAnimator.KWHzl(fragmentManager, c20054gZe, function1, function0);
        }

        public final <T> void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C20054gZe<T> c20054gZe, @NotNull final Function1<? super T, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(c20054gZe, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C22236hbZ c22236hbZ = new C22236hbZ();
            c22236hbZ.EZpvd = c20054gZe;
            c22236hbZ.AEQbTJ = new Function1() { // from class: o.hch
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22236hbZ.StateListAnimator.EZpvd(function1, obj);
                }
            };
            c22236hbZ.AhwBna = function0;
            c22236hbZ.show(fragmentManager);
        }

        public static final Unit EZpvd(Function1 function1, java.lang.Object obj) {
            if (obj == null) {
                obj = null;
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.EZpvd == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Function0<Unit> function0 = this.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
        view.setContentDescription("web3_dex_history_order_filter_sheet");
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        C20054gZe<?> c20054gZe = this.EZpvd;
        textViewAYXKKw.setText(c20054gZe != null ? c20054gZe.OLrzqt() : null);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.gEmmrt = C23492hzJ.EZpvd(getLayoutInflater(), constraintLayout, true);
        copydefault();
        C23492hzJ c23492hzJ = this.gEmmrt;
        if (c23492hzJ != null && (recyclerView3 = c23492hzJ.EZpvd) != null) {
            recyclerView3.setLayoutManager(new GridLayoutManager(requireActivity(), 2));
        }
        C23492hzJ c23492hzJ2 = this.gEmmrt;
        if (c23492hzJ2 != null && (recyclerView2 = c23492hzJ2.EZpvd) != null) {
            recyclerView2.setAdapter(this.KWHzl);
        }
        C23492hzJ c23492hzJ3 = this.gEmmrt;
        if (c23492hzJ3 != null && (recyclerView = c23492hzJ3.EZpvd) != null) {
            recyclerView.addItemDecoration(new C22292hcc());
        }
        this.KWHzl.register(C20073gZx.class, new C22295hcf(new Function1() { // from class: o.hcg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22236hbZ.KWHzl(this.copydefault, (C20073gZx) obj);
            }
        }));
        AEQbTJ();
    }

    public static final Unit KWHzl(C22236hbZ c22236hbZ, C20073gZx c20073gZx) {
        Intrinsics.checkNotNullParameter(c20073gZx, "");
        c22236hbZ.djBIcL = c20073gZx.EZpvd() ? null : c20073gZx.AEQbTJ();
        c22236hbZ.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.util.List<C20073gZx<?>> listCopydefault;
        java.lang.Object next;
        C20054gZe<?> c20054gZe = this.EZpvd;
        java.lang.Object objAEQbTJ = null;
        if (c20054gZe != null && (listCopydefault = c20054gZe.copydefault()) != null) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C20073gZx c20073gZx = (C20073gZx) next;
                if (c20073gZx.copydefault() && c20073gZx.KWHzl()) {
                    break;
                }
            }
            C20073gZx c20073gZx2 = (C20073gZx) next;
            if (c20073gZx2 != null) {
                objAEQbTJ = c20073gZx2.AEQbTJ();
            }
        }
        this.djBIcL = objAEQbTJ;
    }

    public final void AEQbTJ() {
        java.util.List<C20073gZx<?>> listCopydefault;
        C20054gZe<?> c20054gZe = this.EZpvd;
        if (c20054gZe == null || (listCopydefault = c20054gZe.copydefault()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            C20073gZx c20073gZx = (C20073gZx) it.next();
            arrayList.add(C20073gZx.copy$default(c20073gZx, null, Intrinsics.EZpvd(this.djBIcL, c20073gZx.AEQbTJ()), null, false, false, 29, null));
        }
        java.util.List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        if (listFJNWhG == null) {
            return;
        }
        listFJNWhG.add(0, new C20073gZx(C33070mpX.AYXKKw(C23274hvD.Fragment.KWHzl), this.djBIcL == null, new java.lang.Object(), false, true, 8, null));
        this.KWHzl.setItems(listFJNWhG);
        this.KWHzl.notifyDataSetChanged();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.QKVWgx));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setContentDescription("web3_dex_history_order_filter_confirm_button");
        }
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.copydefault(), 0L, new Function1() { // from class: o.hbY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22236hbZ.OLrzqt(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setContentDescription("web3_dex_history_order_filter_reset_button");
            c52794wYpAEQbTJ.setOKDSType(260);
            C25352ivB.setOnDoubleCheckClickListener$default(c52794wYpAEQbTJ, 0L, new Function1() { // from class: o.hcd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22236hbZ.copydefault(this.OLrzqt, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit OLrzqt(C22236hbZ c22236hbZ, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<java.lang.Object, Unit> function1 = c22236hbZ.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c22236hbZ.djBIcL);
        }
        c22236hbZ.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22236hbZ c22236hbZ, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c22236hbZ.copydefault();
        c22236hbZ.AEQbTJ();
        return Unit.INSTANCE;
    }
}

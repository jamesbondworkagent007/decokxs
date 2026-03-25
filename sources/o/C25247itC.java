package o;

import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.ImageViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25247itC extends AbstractC52797wYs {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public Function0<Unit> AEQbTJ;
    public final java.util.ArrayList<C55276xgr> EZpvd = new java.util.ArrayList<>();
    public Function1<? super C55276xgr, Unit> OLrzqt;

    @Override // o.AbstractC52797wYs, o.wXX
    public boolean getHasFooter() {
        return false;
    }

    private final java.lang.String EZpvd() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("title");
        }
        return null;
    }

    public final boolean OLrzqt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("showDragbar");
        }
        return false;
    }

    public final int AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("selectionActionColor");
        }
        return 0;
    }

    /* JADX INFO: renamed from: o.itC$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.itC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C25247itC newInstance$default(Application application, java.util.List list, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return application.copydefault(list, str, z, i);
        }

        public final C25247itC copydefault(@NotNull java.util.List<C55276xgr> list, java.lang.String str, boolean z, @androidx.annotation.ColorRes int i) {
            Intrinsics.checkNotNullParameter(list, "");
            C25247itC c25247itC = new C25247itC();
            c25247itC.EZpvd.clear();
            c25247itC.EZpvd.addAll(list);
            c25247itC.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("title", str), C56390yDp.OLrzqt("showDragbar", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("selectionActionColor", java.lang.Integer.valueOf(i))));
            return c25247itC;
        }
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull Function1<? super C55276xgr, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function1;
        this.AEQbTJ = function0;
        show(fragmentManager, str);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(OLrzqt() ? 0 : 8);
        wxq.AYXKKw().setText(EZpvd());
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        int iAEQbTJ = AEQbTJ();
        if (iAEQbTJ != 0) {
            c55198xfS.EZpvd(new StateListAnimator(iAEQbTJ));
        }
        c55198xfS.setSingleOneColumnData(this.EZpvd, new yHO() { // from class: o.itB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C25247itC.AEQbTJ(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: o.itC$StateListAnimator */
    public static final class StateListAnimator extends C55268xgj {
        public final /* synthetic */ int copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(int i) {
            super(null, 0, 3, 0 == true ? 1 : 0);
            this.copydefault = i;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.C55268xgj, o.InterfaceC55196xfQ
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public C55104xde<wZX> AEQbTJ(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C55104xde<wZX> c55104xdeAEQbTJ = super.AEQbTJ(layoutInflater, viewGroup);
            ImageViewCompat.setImageTintList(((wZX) c55104xdeAEQbTJ.OLrzqt()).copydefault, ContextCompat.getColorStateList(c55104xdeAEQbTJ.itemView.getContext(), this.copydefault));
            return c55104xdeAEQbTJ;
        }
    }

    public static final Unit AEQbTJ(C25247itC c25247itC, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super C55276xgr, Unit> function1 = c25247itC.OLrzqt;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        c25247itC.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

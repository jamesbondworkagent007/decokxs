package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52755wXd extends AbstractC52797wYs {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function1<? super C55276xgr, Unit> AEQbTJ;
    public Function2<? super android.widget.ImageView, java.lang.Object, Unit> AYXKKw;
    public java.lang.String KWHzl;
    public Function0<Unit> OLrzqt;
    public android.view.View copydefault;
    public java.util.List<C55276xgr> gEmmrt;

    @Override // o.AbstractC52797wYs, o.wXX
    public boolean getHasFooter() {
        return false;
    }

    /* JADX INFO: renamed from: o.wXd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull java.util.List<C55276xgr> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0, @NotNull Function1<? super C55276xgr, Unit> function1, android.view.View view, java.lang.String str, Function2<? super android.widget.ImageView, java.lang.Object, Unit> function2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C52755wXd c52755wXd = new C52755wXd();
            c52755wXd.gEmmrt = list;
            c52755wXd.AEQbTJ = function1;
            c52755wXd.OLrzqt = function0;
            c52755wXd.copydefault = view;
            c52755wXd.KWHzl = str;
            c52755wXd.AYXKKw = function2;
            c52755wXd.show(fragmentManager, C52755wXd.class.getSimpleName());
        }
    }

    @Override // o.AbstractC52797wYs, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        java.lang.String str = this.KWHzl;
        c52781wYc.setType((str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? 2 : 67);
        java.lang.String str2 = this.KWHzl;
        c52781wYc.setTitle(str2 != null ? str2 : "");
    }

    /* JADX INFO: renamed from: o.wXd$Activity */
    public static final class Activity extends C55268xgj {
        public Activity() {
            super(null, 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
        @Override // o.C55268xgj, o.InterfaceC55196xfQ
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C55104xde<wZX> c55104xde, C55276xgr c55276xgr, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(c55104xde, "");
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            super.EZpvd(c55104xde, c55276xgr, z, z2);
            Function2 function2 = C52755wXd.this.AYXKKw;
            if (function2 != null) {
                function2.invoke(((wZX) c55104xde.OLrzqt()).getRoot().OLrzqt(), c55276xgr.KWHzl());
            }
        }
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.EZpvd(new Activity());
        java.util.List<C55276xgr> listAhwBna = this.gEmmrt;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        c55198xfS.setSingleOneColumnData(listAhwBna, new yHO() { // from class: o.wXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52755wXd.OLrzqt(this.KWHzl, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit OLrzqt(C52755wXd c52755wXd, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (c55276xgr != null) {
            Function1<? super C55276xgr, Unit> function1 = c52755wXd.AEQbTJ;
            if (function1 != null) {
                function1.invoke(c55276xgr);
            }
            c52755wXd.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        android.view.View view = this.copydefault;
        if (view != null) {
            constraintLayout.addView(view);
        } else {
            super.onCreateFooter(constraintLayout);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        this.OLrzqt = null;
        this.AEQbTJ = null;
        this.AYXKKw = null;
        this.copydefault = null;
    }
}

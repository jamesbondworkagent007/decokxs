package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31176lpA;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31176lpA<T> extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public Function1<? super ActionBar<T>, Unit> AhwBna;
    public Function0<Unit> copydefault;
    public T gEmmrt;
    public final java.util.ArrayList<ActionBar<T>> OLrzqt = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.lpE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31176lpA.DbNXlk(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.lpC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31176lpA.valueOf(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lpD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C31176lpA.djBIcL(this.KWHzl));
        }
    });
    public final C43316rmw KWHzl = new C43316rmw();
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.lpG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31176lpA.fetchVPNInfo(this.AEQbTJ);
        }
    });

    private final java.lang.String OLrzqt() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String DbNXlk(C31176lpA c31176lpA) {
        android.os.Bundle arguments = c31176lpA.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("title") : null;
        return string == null ? "" : string;
    }

    public final java.lang.Integer AEQbTJ() {
        return (java.lang.Integer) this.djBIcL.getValue();
    }

    public static final java.lang.Integer valueOf(C31176lpA c31176lpA) {
        android.os.Bundle arguments = c31176lpA.getArguments();
        if (arguments != null) {
            return java.lang.Integer.valueOf(arguments.getInt("extra_universal_1", C52761wXj.Activity.fdOvFl));
        }
        return null;
    }

    public final int copydefault() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int djBIcL(C31176lpA c31176lpA) {
        android.os.Bundle arguments = c31176lpA.getArguments();
        if (arguments != null) {
            return arguments.getInt("key.header_style", 2);
        }
        return 2;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String fetchVPNInfo(C31176lpA c31176lpA) {
        android.os.Bundle arguments = c31176lpA.getArguments();
        if (arguments != null) {
            return arguments.getString("extra_universal_2");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.lpA$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lpA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final <T> void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Activity<T> activity, @NotNull Function1<? super ActionBar<T>, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function1, "");
            OLrzqt(fragmentManager, activity, function1, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lpA$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void show$default(StateListAnimator stateListAnimator, androidx.fragment.app.FragmentManager fragmentManager, Activity activity, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function0 = null;
            }
            stateListAnimator.OLrzqt(fragmentManager, activity, function1, function0);
        }

        public final <T> void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Activity<T> activity, @NotNull Function1<? super ActionBar<T>, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C31176lpA c31176lpA = new C31176lpA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", activity.AYXKKw());
            bundle.putInt("key.header_style", activity.OLrzqt());
            java.lang.Integer numAEQbTJ = activity.AEQbTJ();
            if (numAEQbTJ != null) {
                bundle.putInt("extra_universal_1", numAEQbTJ.intValue());
            }
            java.lang.String strKWHzl = activity.KWHzl();
            if (strKWHzl != null) {
                bundle.putString("extra_universal_2", strKWHzl);
            }
            c31176lpA.setArguments(bundle);
            c31176lpA.OLrzqt.addAll(activity.EZpvd());
            c31176lpA.gEmmrt = activity.copydefault();
            c31176lpA.AhwBna = function1;
            c31176lpA.copydefault = function0;
            c31176lpA.show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        if (OLrzqt().length() == 0) {
            wxq.setStyle(0);
        } else {
            wxq.setStyle(copydefault());
            wxq.AYXKKw().setText(OLrzqt());
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        constraintLayout.addView(recyclerView);
        recyclerView.setAdapter(this.KWHzl);
        this.KWHzl.register(ActionBar.class, new Application(this));
    }

    /* JADX INFO: renamed from: o.lpA$Application */
    public static final class Application extends AbstractC31189lpN<ActionBar<T>, C21538hDb> {
        public final /* synthetic */ C31176lpA<T> KWHzl;

        public Application(C31176lpA<T> c31176lpA) {
            this.KWHzl = c31176lpA;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
        @Override // o.AbstractC31189lpN
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public C21538hDb KWHzl(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C21538hDb c21538hDbCopydefault = C21538hDb.copydefault(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c21538hDbCopydefault, "");
            return c21538hDbCopydefault;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/lpN$Activity;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC31189lpN, o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(AbstractC31189lpN<ActionBar<T>, C21538hDb>.Activity activity, final ActionBar<T> actionBar) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            ((C21538hDb) activity.KWHzl()).KWHzl.setTitle(actionBar.copydefault());
            AppCompatImageView appCompatImageView = ((C21538hDb) activity.KWHzl()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(Intrinsics.EZpvd(actionBar.AEQbTJ(), this.KWHzl.gEmmrt) ? 0 : 8);
            java.lang.Integer numAEQbTJ = this.KWHzl.AEQbTJ();
            if (numAEQbTJ != null) {
                C31176lpA<T> c31176lpA = this.KWHzl;
                int iIntValue = numAEQbTJ.intValue();
                AppCompatImageView appCompatImageView2 = ((C21538hDb) activity.KWHzl()).EZpvd;
                FragmentActivity fragmentActivityRequireActivity = c31176lpA.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                appCompatImageView2.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.copydefault(iIntValue, fragmentActivityRequireActivity)));
            }
            OKRegularCell oKRegularCell = ((C21538hDb) activity.KWHzl()).KWHzl;
            final C31176lpA<T> c31176lpA2 = this.KWHzl;
            C25352ivB.setOnDoubleCheckClickListener$default(oKRegularCell, 0L, new Function1() { // from class: o.lpJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C31176lpA.Application.AEQbTJ(c31176lpA2, actionBar, (android.view.View) obj);
                }
            }, 1, null);
            ((C21538hDb) activity.KWHzl()).KWHzl.setContentDescription(actionBar.OLrzqt());
        }

        public static final Unit AEQbTJ(C31176lpA c31176lpA, ActionBar actionBar, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = c31176lpA.AhwBna;
            if (function1 != null) {
                function1.invoke(actionBar);
            }
            c31176lpA.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (KWHzl() != null) {
            view.setContentDescription(KWHzl());
        }
        this.KWHzl.AhwBna(this.OLrzqt);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Function0<Unit> function0 = this.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.lpA$ActionBar */
    public static final class ActionBar<T> {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public ActionBar(@NotNull java.lang.String str, T t, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.OLrzqt = t;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.Object)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, T, java.lang.String):void (m)] (LINE:137) call: o.lpA.ActionBar.<init>(java.lang.String, java.lang.Object, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, obj, (i & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: o.lpA$Activity */
    public static final class Activity<T> {
        public final java.lang.Integer AEQbTJ;
        public final int EZpvd;
        public final java.util.List<ActionBar<T>> KWHzl;
        public final java.lang.String OLrzqt;
        public final T copydefault;
        public final java.lang.String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionBar<T>> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T copydefault() {
            return this.copydefault;
        }

        public Activity(@NotNull java.util.List<ActionBar<T>> list, T t, @NotNull java.lang.String str, @androidx.annotation.ColorRes java.lang.Integer num, java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = list;
            this.copydefault = t;
            this.djBIcL = str;
            this.AEQbTJ = num;
            this.OLrzqt = str2;
            this.EZpvd = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.util.List)
  (r9v0 java.lang.Object)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r13v0 int))
 A[MD:(java.util.List<o.lpA$ActionBar<T>>, T, java.lang.String, java.lang.Integer, java.lang.String, int):void (m)] (LINE:143) call: o.lpA.Activity.<init>(java.util.List, java.lang.Object, java.lang.String, java.lang.Integer, java.lang.String, int):void type: THIS */
        public /* synthetic */ Activity(java.util.List list, java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, obj, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? 2 : i);
        }
    }
}

package o;

import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.immomo.mls.InitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC43071riP;
import o.C43084ric;
import o.InterfaceC7340ahw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.riP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ActivityC43071riP extends AbstractActivityC43060riE {
    public static java.lang.String AYXKKw;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;

    /* JADX INFO: renamed from: o.riP$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.riP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(java.lang.String str) {
            ActivityC43071riP.AYXKKw = str;
        }
    }

    @Override // o.AbstractActivityC43060riE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.gEmmrt == null) {
            this.gEmmrt = AYXKKw;
        }
        AYXKKw = null;
        java.lang.String str = this.gEmmrt;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dark")) {
            getDelegate().setLocalNightMode(2);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "light")) {
            getDelegate().setLocalNightMode(1);
        }
        super.attachBaseContext(context);
    }

    @Override // o.ActivityC52757wXf
    public int getBrandThemeId() {
        java.lang.Object obj;
        java.util.HashMap map;
        InitData initDataEZpvd = C7327ahj.EZpvd(getIntent().getExtras());
        if (initDataEZpvd == null || (map = initDataEZpvd.KWHzl) == null || (obj = map.get("brand")) == null) {
            obj = "";
        }
        java.lang.Integer numAEQbTJ = C43146rjl.AEQbTJ((java.lang.String) obj);
        return numAEQbTJ != null ? numAEQbTJ.intValue() : super.getBrandThemeId();
    }

    @Override // o.AbstractActivityC43060riE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Integer numKWHzl;
        InitData initDataEZpvd = C7327ahj.EZpvd(getIntent().getExtras());
        Intrinsics.copydefault(initDataEZpvd);
        java.lang.Object obj = initDataEZpvd.AEQbTJ(false).KWHzl.get("appearance");
        if (obj == null) {
            obj = "";
        }
        java.lang.String str = (java.lang.String) obj;
        this.djBIcL = str;
        android.util.SparseArray<C33510mxn> sparseArrayCopydefault = C43146rjl.copydefault(str);
        if (sparseArrayCopydefault != null && (numKWHzl = C33503mxg.KWHzl(sparseArrayCopydefault)) != null) {
            setTheme(numKWHzl.intValue());
        }
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ActionBar actionBarOLrzqt = ActionBar.Companion.OLrzqt(getIntent().getExtras());
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        actionBarOLrzqt.show(supportFragmentManager);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.ActivityC52757wXf, android.app.Activity, android.view.ContextThemeWrapper
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        super.onApplyThemeResource(theme, i, z);
        if (theme != null) {
            theme.applyStyle(C43084ric.ActionBar.AEQbTJ, true);
        }
    }

    @Override // o.AbstractActivityC33041mov
    public android.util.SparseArray<C33510mxn> getSwitchThemePairs() {
        android.util.SparseArray<C33510mxn> sparseArrayCopydefault = C43146rjl.copydefault(this.djBIcL);
        return sparseArrayCopydefault != null ? sparseArrayCopydefault : super.getSwitchThemePairs();
    }

    /* JADX INFO: renamed from: o.riP$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar extends wXX {
        public C7328ahk EZpvd;
        public InitData KWHzl;
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7328ahk AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C7328ahk c7328ahk) {
            this.EZpvd = c7328ahk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull InitData initData) {
            Intrinsics.checkNotNullParameter(initData, "");
            this.KWHzl = initData;
        }

        public final InitData KWHzl() {
            InitData initData = this.KWHzl;
            if (initData != null) {
                return initData;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            setStyle(0, C43084ric.ActionBar.OLrzqt);
            InitData initDataEZpvd = C7327ahj.EZpvd(getArguments());
            Intrinsics.copydefault(initDataEZpvd);
            KWHzl(initDataEZpvd.AEQbTJ(false).copydefault());
        }

        @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
        public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
            android.view.Window window;
            android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
            java.lang.Object obj = KWHzl().KWHzl.get("keyboardAdjustResize");
            if (Intrinsics.EZpvd(obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null, java.lang.Boolean.TRUE) && (window = dialogOnCreateDialog.getWindow()) != null) {
                window.setSoftInputMode(16);
            }
            java.lang.Object obj2 = KWHzl().KWHzl.get("bottomSheetIsDraggable");
            if (obj2 != null) {
                Intrinsics.copydefault(dialogOnCreateDialog, "");
                ((BottomSheetDialog) dialogOnCreateDialog).getBehavior().setDraggable(((java.lang.Boolean) obj2).booleanValue());
            }
            InitData initDataKWHzl = KWHzl();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            C43146rjl.EZpvd(initDataKWHzl, (AppCompatActivity) fragmentActivityRequireActivity, new Function1() { // from class: o.riW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return ActivityC43071riP.ActionBar.OLrzqt(this.copydefault, ((java.lang.Integer) obj3).intValue());
                }
            });
            return dialogOnCreateDialog;
        }

        public static final Unit OLrzqt(ActionBar actionBar, int i) {
            actionBar.setNavigationBarColor(i);
            return Unit.INSTANCE;
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            super.onCreateHeader(c52781wYc);
            java.lang.Object obj = KWHzl().KWHzl.get("bottomSheetType");
            if (obj == null) {
                obj = -1;
            }
            int iIntValue = ((java.lang.Integer) obj).intValue();
            if (iIntValue > 0) {
                c52781wYc.setType(iIntValue);
            }
        }

        @Override // o.wXX
        public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            super.onCreateContent(constraintLayout);
            java.lang.Object obj = KWHzl().KWHzl.get("bottomSheetHeight");
            if (obj == null) {
                obj = -1;
            }
            int iIntValue = ((java.lang.Integer) obj).intValue();
            if (iIntValue > 0) {
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.height = iIntValue;
                constraintLayout.setLayoutParams(layoutParams);
            }
            android.content.Context applicationContext = constraintLayout.getContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            C43082ria.copydefault(applicationContext, new Application(constraintLayout));
        }

        /* JADX INFO: renamed from: o.riP$ActionBar$Application */
        public static final class Application implements InterfaceC7340ahw {
            public final /* synthetic */ ConstraintLayout OLrzqt;

            public Application(ConstraintLayout constraintLayout) {
                this.OLrzqt = constraintLayout;
            }

            @Override // o.InterfaceC7340ahw
            public void EZpvd(java.lang.Throwable th) {
                InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
            }

            @Override // o.InterfaceC7340ahw
            public void OLrzqt() {
                C7328ahk c7328ahkAEQbTJ;
                ActionBar.this.EZpvd(new C7328ahk(ActionBar.this.requireContext()));
                C7328ahk c7328ahkAEQbTJ2 = ActionBar.this.AEQbTJ();
                if (c7328ahkAEQbTJ2 != null) {
                    c7328ahkAEQbTJ2.EZpvd(this.OLrzqt);
                }
                C7328ahk c7328ahkAEQbTJ3 = ActionBar.this.AEQbTJ();
                if (c7328ahkAEQbTJ3 != null) {
                    c7328ahkAEQbTJ3.AEQbTJ(ActionBar.this.KWHzl());
                }
                if (!ActionBar.this.isVisible() || (c7328ahkAEQbTJ = ActionBar.this.AEQbTJ()) == null) {
                    return;
                }
                c7328ahkAEQbTJ.zLjUOn();
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            C7328ahk c7328ahk = this.EZpvd;
            if (c7328ahk != null) {
                c7328ahk.AubY();
            }
            this.EZpvd = null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            super.onPause();
            C7328ahk c7328ahk = this.EZpvd;
            if (c7328ahk != null) {
                c7328ahk.zsXlph();
            }
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onStop() {
            super.onStop();
            C7328ahk c7328ahk = this.EZpvd;
            if (c7328ahk != null) {
                c7328ahk.gHZMYf();
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            C7328ahk c7328ahk = this.EZpvd;
            if (c7328ahk != null) {
                c7328ahk.zLjUOn();
            }
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            super.onDismiss(dialogInterface);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        /* JADX INFO: renamed from: o.riP$ActionBar$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.riP.ActionBar.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final ActionBar OLrzqt(android.os.Bundle bundle) {
                ActionBar actionBar = new ActionBar();
                actionBar.setArguments(bundle);
                return actionBar;
            }
        }
    }

    @Override // o.AbstractActivityC43060riE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC43060riE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC43060riE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package o;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.ViewGroup;
import cn.jzvd.Jzvd;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C43084ric;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.rjk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43145rjk extends androidx.fragment.app.DialogFragment {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public android.view.View AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.Boolean OLrzqt;
    public java.lang.Boolean copydefault;
    public java.lang.String djBIcL;
    public LuaFunction gEmmrt;
    public Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Boolean bool) {
        this.copydefault = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(android.view.View view) {
        this.AEQbTJ = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(LuaFunction luaFunction) {
        this.gEmmrt = luaFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Boolean bool) {
        this.OLrzqt = bool;
    }

    public C43145rjk() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.OLrzqt = bool;
        this.djBIcL = "";
        this.copydefault = bool;
    }

    /* JADX INFO: renamed from: o.rjk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rjk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C43145rjk AEQbTJ(@NotNull android.view.View view, LuaFunction luaFunction, @NotNull Function0<Unit> function0, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C43145rjk c43145rjk = new C43145rjk();
            c43145rjk.OLrzqt(view);
            c43145rjk.EZpvd(function0);
            c43145rjk.OLrzqt(luaFunction);
            c43145rjk.KWHzl(str2);
            c43145rjk.OLrzqt(str);
            c43145rjk.copydefault(bool);
            c43145rjk.EZpvd(bool2);
            java.lang.Object tag = view.getTag();
            if (tag != null && (tag instanceof java.lang.String)) {
                c43145rjk.AEQbTJ((java.lang.String) tag);
            }
            return c43145rjk;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.Window window;
        android.view.Window window2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        android.view.View view = this.AEQbTJ;
        if (view != null) {
            frameLayout.addView(view);
        }
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setSoftInputMode(32);
        }
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            if (Intrinsics.EZpvd(this.copydefault, java.lang.Boolean.TRUE)) {
                window.setBackgroundDrawableResource(C52761wXj.Activity.aBDePw);
                window.getAttributes().windowAnimations = C43084ric.ActionBar.KWHzl;
            } else {
                window.setBackgroundDrawableResource(C32113mPz.ActionBar.QKVWgx);
            }
            int color = getResources().getColor(C32113mPz.ActionBar.QKVWgx);
            if (!android.text.TextUtils.isEmpty(this.AhwBna)) {
                color = Color.parseColor(this.AhwBna);
            }
            boolean zAEQbTJ = C7911ask.AEQbTJ(requireContext());
            if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) "dark")) {
                zAEQbTJ = true;
            } else if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) "light")) {
                zAEQbTJ = false;
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33472mxB c33472mxB = new C33472mxB(contextRequireContext, window);
            c33472mxB.AEQbTJ();
            c33472mxB.AEQbTJ(frameLayout);
            c33472mxB.KWHzl(color, zAEQbTJ);
            c33472mxB.EZpvd(!zAEQbTJ);
        }
        android.app.Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o.rji
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                    return C43145rjk.AEQbTJ(this.EZpvd, dialogInterface, i, keyEvent);
                }
            });
        }
        return frameLayout;
    }

    public static final boolean AEQbTJ(C43145rjk c43145rjk, android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        LuaFunction luaFunction = c43145rjk.gEmmrt;
        if (luaFunction != null) {
            LuaValue[] luaValueArrInvoke = luaFunction != null ? luaFunction.invoke(LuaValue.rString("interceptBack")) : null;
            if (luaValueArrInvoke == null) {
                return false;
            }
            if (!(!(luaValueArrInvoke.length == 0)) || !luaValueArrInvoke[0].isBoolean() || !luaValueArrInvoke[0].toBoolean()) {
                return false;
            }
            LuaFunction luaFunction2 = c43145rjk.gEmmrt;
            if (luaFunction2 != null) {
                luaFunction2.copydefault("back");
            }
            return true;
        }
        return Jzvd.backPress();
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new android.app.Dialog(requireContext(), C43084ric.ActionBar.copydefault);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        super.onPause();
        Jzvd.goOnPlayOnPause();
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction != null) {
            luaFunction.copydefault(EopTrackEvent.ONPAUSE);
        }
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Function0<Unit> function0 = this.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.view.View view = getView();
        if (view != null) {
            C7830arI.Companion.KWHzl(view, this.OLrzqt);
        }
        android.view.View view2 = this.AEQbTJ;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.AEQbTJ);
        }
        this.AEQbTJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction != null) {
            luaFunction.copydefault("onResume");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction != null) {
            luaFunction.copydefault("viewDidAppear");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction != null) {
            luaFunction.copydefault("viewDisappear");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            dismiss();
        }
    }
}

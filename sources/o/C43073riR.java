package o;

import android.graphics.Color;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: renamed from: o.riR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43073riR extends C33005moL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public android.app.Dialog AYXKKw;
    public java.lang.String AhwBna;
    public Function0<Unit> DbNXlk;
    public android.view.View KWHzl;
    public java.lang.Boolean OLrzqt;
    public boolean copydefault;
    public java.lang.Float djBIcL = java.lang.Float.valueOf(1.0f);
    public java.lang.String gEmmrt;
    public boolean isConnected;
    public LuaFunction valueOf;
    public java.lang.Boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.Boolean bool) {
        this.values = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(LuaFunction luaFunction) {
        this.valueOf = luaFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C33005moL
    public boolean AhwBna() {
        return !this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Boolean bool) {
        this.OLrzqt = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(android.view.View view) {
        this.KWHzl = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Float f) {
        this.djBIcL = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.DbNXlk = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.isConnected = z;
    }

    public C43073riR() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.OLrzqt = bool;
        this.values = bool;
        this.gEmmrt = "";
    }

    /* JADX INFO: renamed from: o.riR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.riR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C43073riR copydefault(float f, @NotNull android.view.View view, @NotNull Function0<Unit> function0, boolean z, boolean z2, java.lang.String str, java.lang.String str2, LuaFunction luaFunction, java.lang.Boolean bool, java.lang.Boolean bool2) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C43073riR c43073riR = new C43073riR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("heightScale", f);
            c43073riR.setArguments(bundle);
            c43073riR.copydefault(java.lang.Float.valueOf(f));
            c43073riR.copydefault(view);
            c43073riR.copydefault(function0);
            c43073riR.copydefault(z2);
            c43073riR.EZpvd(z);
            c43073riR.copydefault(str2);
            c43073riR.KWHzl(str);
            c43073riR.AEQbTJ(luaFunction);
            c43073riR.EZpvd(bool);
            c43073riR.AEQbTJ(bool2);
            java.lang.Object tag = view.getTag();
            if (tag != null && (tag instanceof java.lang.String)) {
                c43073riR.EZpvd((java.lang.String) tag);
            }
            return c43073riR;
        }
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C32113mPz.Dialog.KWHzl);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.app.Dialog dialog;
        android.view.Window window;
        android.view.Window window2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View viewOLrzqt = OLrzqt(layoutInflater, viewGroup, bundle);
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setSoftInputMode(16);
        }
        if (Intrinsics.EZpvd(this.values, java.lang.Boolean.TRUE) && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.0f;
                window.setAttributes(attributes);
            }
            window.clearFlags(2);
        }
        return viewOLrzqt;
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        this.AYXKKw = dialogOnCreateDialog;
        return dialogOnCreateDialog;
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.ViewGroup viewGroup;
        android.view.Window window;
        super.onStart();
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.copydefault("viewDidAppear");
        }
        android.app.Dialog dialog = this.AYXKKw;
        if (dialog instanceof DialogC33577mzA) {
            Intrinsics.copydefault(dialog, "");
            BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault = ((DialogC33577mzA) dialog).copydefault();
            if (bottomSheetBehaviorCopydefault != null) {
                bottomSheetBehaviorCopydefault.setDraggable(AhwBna());
            }
            android.app.Dialog dialog2 = this.AYXKKw;
            Intrinsics.copydefault(dialog2, "");
            BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault2 = ((DialogC33577mzA) dialog2).copydefault();
            if (bottomSheetBehaviorCopydefault2 != null) {
                bottomSheetBehaviorCopydefault2.setSkipCollapsed(true);
            }
        }
        boolean zEZpvd = Intrinsics.EZpvd(this.djBIcL, 1.0f);
        int color = getResources().getColor(C32113mPz.ActionBar.QKVWgx);
        if (!android.text.TextUtils.isEmpty(this.AhwBna)) {
            color = Color.parseColor(this.AhwBna);
        }
        boolean zAEQbTJ = C7911ask.AEQbTJ(requireContext());
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "dark")) {
            zAEQbTJ = true;
        } else if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "light")) {
            zAEQbTJ = false;
        }
        android.app.Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33472mxB c33472mxB = new C33472mxB(contextRequireContext, window);
            c33472mxB.KWHzl(color, zAEQbTJ);
            c33472mxB.EZpvd(false, !zAEQbTJ);
        }
        if (zEZpvd) {
            android.view.View view = getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = -1;
                    view.setLayoutParams(marginLayoutParams);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            android.app.Dialog dialog4 = getDialog();
            if (dialog4 == null || (viewGroup = (android.view.ViewGroup) dialog4.findViewById(com.google.android.material.R.id.design_bottom_sheet)) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                viewGroup.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        if (this.isConnected) {
            setCancelable(false);
            KWHzl(false);
        }
        return this.KWHzl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.copydefault(EopTrackEvent.ONPAUSE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Function0<Unit> function0 = this.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.copydefault("didDealloc");
        }
        android.view.View view = getView();
        if (view != null) {
            C7830arI.Companion.KWHzl(view, this.OLrzqt);
        }
        android.view.View view2 = this.KWHzl;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.KWHzl);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.copydefault("onResume");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.copydefault("viewDisappear");
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: o.riO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C43073riR.OLrzqt(this.AEQbTJ);
            }
        }, 10L);
    }

    public static final void OLrzqt(C43073riR c43073riR) {
        LuaFunction luaFunction = c43073riR.valueOf;
        if (luaFunction == null || luaFunction == null) {
            return;
        }
        luaFunction.copydefault("onConfigurationChanged");
    }
}

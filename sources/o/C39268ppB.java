package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39272ppF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ppB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39268ppB implements InterfaceC39272ppF {
    public androidx.fragment.app.FragmentManager AEQbTJ;
    public int AhwBna;
    public Function0<Unit> AuCTel;
    public android.content.Context KWHzl;
    public C36109oPp copydefault;
    public boolean djBIcL;
    public android.view.View fJNWhG;
    public Function0<Unit> fetchVPNInfo;
    public int gEmmrt;
    public Function0<Unit> isConnected;
    public androidx.fragment.app.Fragment valueOf;
    public Function0<Unit> values;
    public KlineQuickOrderBottomSheetBehavior.States fIwbmz = KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED;
    public boolean AYXKKw = true;
    public final android.graphics.Rect fARcdN = new android.graphics.Rect();
    public ViewTreeObserver.OnGlobalLayoutListener AkhnZx = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.ppz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C39268ppB.AkhnZx(this.KWHzl);
        }
    };
    public final int OLrzqt;
    public final KlineQuickOrderBottomSheetBehavior<android.view.View> EZpvd = new KlineQuickOrderBottomSheetBehavior<>(this.OLrzqt);
    public final TaskDescription ejfBZ = new TaskDescription();
    public final View.OnLayoutChangeListener DbNXlk = new View.OnLayoutChangeListener() { // from class: o.ppC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C39268ppB.KWHzl(this.copydefault, view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39272ppF
    public boolean valueOf() {
        return this.AYXKKw;
    }

    public static final void AkhnZx(C39268ppB c39268ppB) {
        android.view.View view = c39268ppB.fJNWhG;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(c39268ppB.fARcdN);
            int height = view.getHeight();
            int i = height - c39268ppB.fARcdN.bottom;
            double d = i;
            double d2 = ((double) height) * 0.15d;
            if (d > d2 && !c39268ppB.djBIcL) {
                c39268ppB.djBIcL = true;
                c39268ppB.AEQbTJ(i);
                InterfaceC39272ppF.ActionBar.setState$default(c39268ppB, KlineQuickOrderBottomSheetBehavior.States.STATE_EXPANDED, false, 2, null);
            } else {
                if (d > d2 || !c39268ppB.djBIcL) {
                    return;
                }
                c39268ppB.djBIcL = false;
                c39268ppB.AEQbTJ(0);
                c39268ppB.EZpvd(0);
                if (c39268ppB.djBIcL() == KlineQuickOrderBottomSheetBehavior.States.STATE_EXPANDED) {
                    InterfaceC39272ppF.ActionBar.setState$default(c39268ppB, KlineQuickOrderBottomSheetBehavior.States.STATE_HALF_EXPANDED, false, 2, null);
                }
            }
        }
    }

    @Override // o.InterfaceC39272ppF
    public void EZpvd(@NotNull android.content.Context context, @NotNull android.view.View view, @NotNull C36109oPp c36109oPp, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c36109oPp, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl = context;
        this.fJNWhG = view;
        this.copydefault = c36109oPp;
        this.AuCTel = function0;
        this.values = function02;
        this.AEQbTJ = fragmentManager;
        isConnected();
    }

    public final void AEQbTJ() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = this.fJNWhG;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.AkhnZx);
    }

    public final void values() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = this.fJNWhG;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.AkhnZx);
    }

    /* JADX INFO: renamed from: o.ppB$TaskDescription */
    public static final class TaskDescription implements KlineQuickOrderBottomSheetBehavior.ActionBar {
        @Override // com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior.ActionBar
        public void OLrzqt(int i) {
        }

        public TaskDescription() {
        }

        @Override // com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior.ActionBar
        public void AEQbTJ(KlineQuickOrderBottomSheetBehavior.States states) {
            ConstraintLayout constraintLayout;
            Intrinsics.checkNotNullParameter(states, "");
            KlineQuickOrderBottomSheetBehavior.States states2 = KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED;
            if (states == states2) {
                C39268ppB.this.AhwBna();
                C39268ppB.this.fetchVPNInfo();
                Function0 function0 = C39268ppB.this.fetchVPNInfo;
                if (function0 != null) {
                    function0.invoke();
                }
                Function0 function02 = C39268ppB.this.values;
                if (function02 != null) {
                    function02.invoke();
                }
                C39268ppB.this.AYXKKw();
                C36109oPp c36109oPp = C39268ppB.this.copydefault;
                if (c36109oPp != null && (constraintLayout = c36109oPp.AEQbTJ) != null) {
                    constraintLayout.setVisibility(8);
                }
                C39268ppB.this.values();
            } else if (states == KlineQuickOrderBottomSheetBehavior.States.STATE_HALF_EXPANDED) {
                C39268ppB.this.AhwBna();
            } else if (C39268ppB.this.fIwbmz == states2) {
                Function0 function03 = C39268ppB.this.isConnected;
                if (function03 != null) {
                    function03.invoke();
                }
                Function0 function04 = C39268ppB.this.AuCTel;
                if (function04 != null) {
                    function04.invoke();
                }
                C39268ppB.this.AEQbTJ();
            }
            C39268ppB.this.fIwbmz = states;
        }
    }

    public static final void KWHzl(C39268ppB c39268ppB, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        c39268ppB.OLrzqt();
    }

    public final void isConnected() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C36109oPp c36109oPp = this.copydefault;
        ViewGroup.LayoutParams layoutParams = (c36109oPp == null || (constraintLayout2 = c36109oPp.AEQbTJ) == null) ? null : constraintLayout2.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(this.EZpvd);
        this.EZpvd.AEQbTJ(this.ejfBZ);
        InterfaceC39272ppF.ActionBar.setState$default(this, KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED, false, 2, null);
        C36109oPp c36109oPp2 = this.copydefault;
        if (c36109oPp2 == null || (constraintLayout = c36109oPp2.copydefault) == null) {
            return;
        }
        constraintLayout.addOnLayoutChangeListener(this.DbNXlk);
    }

    public final int copydefault() {
        android.content.Context context = this.KWHzl;
        if (context == null) {
            return 0;
        }
        int iCopydefault = C55298xhM.copydefault(7.0f, context);
        if (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) {
            iCopydefault += C55298xhM.dpInt$default(44, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        int iOLrzqt = C33570myu.OLrzqt();
        int iCopydefault2 = C33570myu.copydefault(context);
        C36109oPp c36109oPp = this.copydefault;
        ConstraintLayout constraintLayout = c36109oPp != null ? c36109oPp.copydefault : null;
        if (constraintLayout != null) {
            return constraintLayout.getHeight() + iOLrzqt + iCopydefault2 + iCopydefault;
        }
        return 0;
    }

    public final void fetchVPNInfo() {
        int iCopydefault = copydefault();
        this.EZpvd.AEQbTJ(iCopydefault);
        this.EZpvd.EZpvd(iCopydefault);
    }

    @Override // o.InterfaceC39272ppF
    public void AEQbTJ(@NotNull KlineQuickOrderBottomSheetBehavior.States states, boolean z) {
        ConstraintLayout constraintLayout;
        C36109oPp c36109oPp;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(states, "");
        this.AYXKKw = z;
        if (states == KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED) {
            fetchVPNInfo();
        } else {
            C36109oPp c36109oPp2 = this.copydefault;
            if (c36109oPp2 != null && (constraintLayout = c36109oPp2.AEQbTJ) != null && constraintLayout.getVisibility() == 8 && (c36109oPp = this.copydefault) != null && (constraintLayout2 = c36109oPp.AEQbTJ) != null) {
                constraintLayout2.setVisibility(0);
            }
        }
        this.EZpvd.AEQbTJ(states);
    }

    @Override // o.InterfaceC39272ppF
    public KlineQuickOrderBottomSheetBehavior.States djBIcL() {
        return this.EZpvd.copydefault();
    }

    @Override // o.InterfaceC39272ppF
    public void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, Function0<Unit> function0, Function0<Unit> function02) {
        android.widget.FrameLayout frameLayout;
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction;
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace;
        Intrinsics.checkNotNullParameter(fragment, "");
        this.valueOf = fragment;
        this.isConnected = function0;
        this.fetchVPNInfo = function02;
        C36109oPp c36109oPp = this.copydefault;
        if (c36109oPp == null || (frameLayout = c36109oPp.EZpvd) == null || (fragmentManager = this.AEQbTJ) == null || (fragmentTransactionBeginTransaction = fragmentManager.beginTransaction()) == null || (fragmentTransactionReplace = fragmentTransactionBeginTransaction.replace(frameLayout.getId(), fragment)) == null) {
            return;
        }
        fragmentTransactionReplace.commitAllowingStateLoss();
    }

    public void AEQbTJ(int i) {
        android.content.Context context = this.KWHzl;
        if (context != null) {
            if (i == 0) {
                this.gEmmrt = 0;
            } else {
                if (pFO.OLrzqt.EZpvd(context)) {
                    i -= C55302xhQ.copydefault(context);
                }
                this.gEmmrt = i;
            }
            OLrzqt();
        }
    }

    @Override // o.InterfaceC39272ppF
    public void EZpvd(int i) {
        this.AhwBna = i;
        OLrzqt();
    }

    public final void OLrzqt() {
        int iCopydefault = copydefault();
        int i = this.gEmmrt;
        int iValueOf = C56548yJl.valueOf(i + iCopydefault + this.AhwBna, gEmmrt());
        if (this.EZpvd.EZpvd() == iCopydefault && this.EZpvd.KWHzl() == iValueOf) {
            return;
        }
        this.EZpvd.AEQbTJ(iCopydefault);
        this.EZpvd.EZpvd(iValueOf);
        this.EZpvd.djBIcL();
    }

    public final int gEmmrt() {
        android.content.Context context = this.KWHzl;
        if (context == null) {
            return 0;
        }
        return C55302xhQ.AEQbTJ(context) - ((C33570myu.AEQbTJ(context) + C33570myu.copydefault(context)) + C55302xhQ.copydefault(context));
    }

    public final void KWHzl() {
        ConstraintLayout constraintLayout;
        C36109oPp c36109oPp = this.copydefault;
        if (c36109oPp == null || (constraintLayout = c36109oPp.copydefault) == null) {
            return;
        }
        constraintLayout.removeOnLayoutChangeListener(this.DbNXlk);
    }

    public final void AYXKKw() {
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction;
        androidx.fragment.app.FragmentTransaction fragmentTransactionRemove;
        try {
            androidx.fragment.app.Fragment fragment = this.valueOf;
            if (fragment == null || (fragmentManager = this.AEQbTJ) == null || (fragmentTransactionBeginTransaction = fragmentManager.beginTransaction()) == null || (fragmentTransactionRemove = fragmentTransactionBeginTransaction.remove(fragment)) == null) {
                return;
            }
            fragmentTransactionRemove.commitAllowingStateLoss();
        } catch (java.lang.Exception unused) {
        }
    }

    public final void AhwBna() {
        FragmentActivity activity;
        androidx.fragment.app.Fragment fragment = this.valueOf;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        java.lang.Object systemService = activity.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        android.view.View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // o.InterfaceC39272ppF
    public void EZpvd() {
        values();
        KWHzl();
        AYXKKw();
        this.valueOf = null;
        this.AEQbTJ = null;
        this.KWHzl = null;
        this.copydefault = null;
        this.fJNWhG = null;
    }
}

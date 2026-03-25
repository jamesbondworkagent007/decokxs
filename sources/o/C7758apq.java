package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.apq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7758apq extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public StateListAnimator copydefault;

    /* JADX INFO: renamed from: o.apq$StateListAnimator */
    public static final class StateListAnimator {
        public View.OnClickListener AEQbTJ;
        public android.view.View AYXKKw;
        public int AhwBna;
        public wYF EZpvd;
        public android.view.View KWHzl;
        public boolean OLrzqt = true;
        public boolean copydefault;
        public java.lang.String djBIcL;
        public boolean fetchVPNInfo;
        public int gEmmrt;
        public int isConnected;
        public Function0<Unit> valueOf;
        public boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(Function0<Unit> function0) {
            this.valueOf = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.AhwBna = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.fetchVPNInfo = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final wYF KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(int i) {
            this.isConnected = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(View.OnClickListener onClickListener) {
            this.AEQbTJ = onClickListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(android.view.View view) {
            this.AYXKKw = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(wYF wyf) {
            this.EZpvd = wyf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View.OnClickListener copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.gEmmrt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(android.view.View view) {
            this.KWHzl = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.values = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.fetchVPNInfo;
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C7758apq() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7758apq(@NotNull StateListAnimator stateListAnimator) {
        this();
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault = stateListAnimator;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.copydefault == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        LinearLayoutCompat linearLayoutCompatEZpvd;
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null || stateListAnimator.isConnected()) {
            return;
        }
        c52781wYc.setType(stateListAnimator.djBIcL());
        java.lang.String strValueOf = stateListAnimator.valueOf();
        if (strValueOf != null) {
            c52781wYc.setTitle(strValueOf);
        }
        android.view.View viewAhwBna = stateListAnimator.AhwBna();
        if (viewAhwBna != null && (linearLayoutCompatEZpvd = c52781wYc.EZpvd()) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.topMargin = C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
            Unit unit = Unit.INSTANCE;
            linearLayoutCompatEZpvd.addView(viewAhwBna, marginLayoutParams);
        }
        android.widget.ImageView imageViewKWHzl = c52781wYc.KWHzl();
        if (imageViewKWHzl != null) {
            imageViewKWHzl.setOnClickListener(stateListAnimator.copydefault());
        }
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.apt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C7758apq.AEQbTJ(this.KWHzl, view);
                }
            });
        }
        c52781wYc.setDividerVisibility(stateListAnimator.EZpvd());
        c52781wYc.setTitleAlignmentCenter(stateListAnimator.values());
    }

    public static final void AEQbTJ(C7758apq c7758apq, android.view.View view) {
        c7758apq.dismiss();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator != null && stateListAnimator.isConnected()) {
            wxq.gEmmrt();
            int iDbNXlk = stateListAnimator.DbNXlk();
            if (iDbNXlk == 0) {
                wxq.setStyle(stateListAnimator.AYXKKw() == 0 ? 0 : 4);
            } else if (iDbNXlk == 1) {
                wxq.setStyle(2);
            } else if (iDbNXlk == 2) {
                wxq.setStyle(1);
            } else if (iDbNXlk == 3) {
                wxq.setStyle(3);
            }
            int iAYXKKw = stateListAnimator.AYXKKw();
            if (iAYXKKw == 0) {
                wxq.AEQbTJ().setVisibility(0);
                wxq.EZpvd().setVisibility(8);
                wxq.setCloseVisibility(false);
            } else if (iAYXKKw == 1) {
                wxq.AEQbTJ().setVisibility(8);
                wxq.EZpvd().setVisibility(8);
                wxq.setCloseVisibility(true);
            } else if (iAYXKKw == 2) {
                wxq.AEQbTJ().setVisibility(8);
                wxq.EZpvd().setVisibility(0);
                wxq.setCloseVisibility(false);
            }
            java.lang.String strValueOf = stateListAnimator.valueOf();
            if (strValueOf != null) {
                wxq.setTitle(strValueOf);
            }
            wxq.setDividerVisibility(stateListAnimator.EZpvd());
            wxq.EZpvd().setOnClickListener(stateListAnimator.copydefault());
            wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.apu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C7758apq.KWHzl(this.EZpvd, view);
                }
            });
        }
    }

    public static final void KWHzl(C7758apq c7758apq, android.view.View view) {
        c7758apq.dismiss();
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        android.view.View viewKWHzl;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null || (viewKWHzl = stateListAnimator.KWHzl()) == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.bottomToBottom = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(viewKWHzl, layoutParams);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.view.View viewAEQbTJ;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null || (viewAEQbTJ = stateListAnimator.AEQbTJ()) == null) {
            return;
        }
        constraintLayout.addView(viewAEQbTJ, new ConstraintLayout.LayoutParams(-1, -2));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            return;
        }
        android.view.View viewAEQbTJ = stateListAnimator.AEQbTJ();
        if (viewAEQbTJ != null) {
            EZpvd(viewAEQbTJ);
        }
        wYF wyfKWHzl = stateListAnimator.KWHzl();
        if (wyfKWHzl != null) {
            EZpvd(wyfKWHzl);
        }
        Function0<Unit> function0GEmmrt = stateListAnimator.gEmmrt();
        if (function0GEmmrt != null) {
            function0GEmmrt.invoke();
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            return;
        }
        bottomSheetBehavior.setDraggable(stateListAnimator.OLrzqt());
    }

    public final void EZpvd(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    /* JADX INFO: renamed from: o.apq$Activity */
    /* JADX INFO: loaded from: classes22.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.apq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

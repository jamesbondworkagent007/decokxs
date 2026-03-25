package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42962rgM extends android.widget.PopupWindow {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final android.content.Context AEQbTJ;
    public StateListAnimator AYXKKw;
    public int AhwBna;
    public android.view.View DbNXlk;
    public boolean EZpvd;
    public android.view.View KWHzl;
    public android.view.View OLrzqt;
    public android.view.View djBIcL;
    public android.view.View gEmmrt;
    public android.view.View isConnected;
    public int valueOf;

    /* JADX INFO: renamed from: o.rgM$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
        void copydefault(int i, int i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(StateListAnimator stateListAnimator) {
        this.AYXKKw = stateListAnimator;
    }

    public C42962rgM(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.valueOf = 1;
        EZpvd();
        copydefault();
        AEQbTJ();
        KWHzl();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        this.valueOf = Intrinsics.EZpvd((java.lang.Object) C42955rgF.copydefault.OLrzqt(), (java.lang.Object) "Volume") ? 1 : 2;
        Intrinsics.copydefault(view);
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void EZpvd() {
        android.view.View viewInflate = android.view.LayoutInflater.from(this.AEQbTJ).inflate(qZH.ActionBar.DXXBbs, (android.view.ViewGroup) null);
        this.KWHzl = viewInflate;
        this.DbNXlk = viewInflate != null ? viewInflate.findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaItemFlags) : null;
        android.view.View view = this.KWHzl;
        this.isConnected = view != null ? view.findViewById(qZH.StateListAnimator.RjCdvpRjCdvp) : null;
        android.view.View view2 = this.KWHzl;
        this.djBIcL = view2 != null ? view2.findViewById(qZH.StateListAnimator.OWSZPf) : null;
        android.view.View view3 = this.KWHzl;
        this.gEmmrt = view3 != null ? view3.findViewById(qZH.StateListAnimator.gZKUVK) : null;
        android.view.View view4 = this.KWHzl;
        this.OLrzqt = view4 != null ? view4.findViewById(qZH.StateListAnimator.FF) : null;
    }

    public final void copydefault(android.view.View view, boolean z) {
        view.setSelected(z);
        if (z) {
            view.setBackgroundColor(ContextCompat.getColor(this.AEQbTJ, C32113mPz.ActionBar.fARcdN));
        } else {
            view.setBackgroundColor(ContextCompat.getColor(this.AEQbTJ, C32113mPz.ActionBar.RJOkX));
        }
    }

    public final void AEQbTJ() {
        android.view.View view = this.DbNXlk;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.rgT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C42962rgM.valueOf(this.EZpvd, view2);
                }
            });
        }
        android.view.View view2 = this.isConnected;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.rgV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    C42962rgM.AhwBna(this.KWHzl, view3);
                }
            });
        }
        android.view.View view3 = this.djBIcL;
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener() { // from class: o.rgR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    C42962rgM.gEmmrt(this.copydefault, view4);
                }
            });
        }
        android.view.View view4 = this.gEmmrt;
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener() { // from class: o.rgU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view5) {
                    C42962rgM.AYXKKw(this.OLrzqt, view5);
                }
            });
        }
        android.view.View view5 = this.OLrzqt;
        if (view5 != null) {
            view5.setOnClickListener(new View.OnClickListener() { // from class: o.rgS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    C42962rgM.djBIcL(this.AEQbTJ, view6);
                }
            });
        }
    }

    public static final void valueOf(C42962rgM c42962rgM, android.view.View view) {
        android.view.View view2 = c42962rgM.DbNXlk;
        if (view2 == null || !view2.isSelected()) {
            c42962rgM.valueOf = 1;
            C42955rgF.copydefault.EZpvd("Volume");
            c42962rgM.copydefault();
            c42962rgM.OLrzqt();
        }
    }

    public static final void AhwBna(C42962rgM c42962rgM, android.view.View view) {
        android.view.View view2 = c42962rgM.isConnected;
        if (view2 == null || !view2.isSelected()) {
            c42962rgM.valueOf = 2;
            C42955rgF.copydefault.EZpvd("Turnover");
            c42962rgM.copydefault();
            c42962rgM.OLrzqt();
        }
    }

    public static final void gEmmrt(C42962rgM c42962rgM, android.view.View view) {
        android.view.View view2 = c42962rgM.gEmmrt;
        if (view2 != null) {
            view2.setSelected(false);
        }
        android.view.View view3 = c42962rgM.OLrzqt;
        if (view3 != null) {
            view3.setSelected(false);
        }
        android.view.View view4 = c42962rgM.djBIcL;
        if (view4 != null) {
            view4.setSelected(true);
        }
        c42962rgM.OLrzqt();
        if (c42962rgM.EZpvd) {
            c42962rgM.dismiss();
        }
    }

    public static final void AYXKKw(C42962rgM c42962rgM, android.view.View view) {
        android.view.View view2 = c42962rgM.djBIcL;
        if (view2 != null) {
            view2.setSelected(false);
        }
        android.view.View view3 = c42962rgM.OLrzqt;
        if (view3 != null) {
            view3.setSelected(false);
        }
        android.view.View view4 = c42962rgM.gEmmrt;
        if (view4 != null) {
            view4.setSelected(true);
        }
        c42962rgM.OLrzqt();
        if (c42962rgM.EZpvd) {
            c42962rgM.dismiss();
        }
    }

    public static final void djBIcL(C42962rgM c42962rgM, android.view.View view) {
        android.view.View view2 = c42962rgM.djBIcL;
        if (view2 != null) {
            view2.setSelected(false);
        }
        android.view.View view3 = c42962rgM.gEmmrt;
        if (view3 != null) {
            view3.setSelected(false);
        }
        android.view.View view4 = c42962rgM.OLrzqt;
        if (view4 != null) {
            view4.setSelected(true);
        }
        c42962rgM.OLrzqt();
        if (c42962rgM.EZpvd) {
            c42962rgM.dismiss();
        }
    }

    public final void KWHzl() {
        android.view.View view = this.KWHzl;
        if (view == null) {
            return;
        }
        OLrzqt(view);
        setContentView(view);
        setWidth(view.getMeasuredWidth());
        setHeight(view.getMeasuredHeight());
        setElevation(C33052mpF.EZpvd(20.0f, this.AEQbTJ));
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void copydefault() {
        android.view.View view = this.DbNXlk;
        Intrinsics.copydefault(view);
        C42955rgF c42955rgF = C42955rgF.copydefault;
        copydefault(view, Intrinsics.EZpvd((java.lang.Object) c42955rgF.OLrzqt(), (java.lang.Object) "Volume"));
        android.view.View view2 = this.isConnected;
        Intrinsics.copydefault(view2);
        copydefault(view2, Intrinsics.EZpvd((java.lang.Object) c42955rgF.OLrzqt(), (java.lang.Object) "Turnover"));
        android.view.View view3 = this.djBIcL;
        if (view3 != null) {
            view3.setSelected(this.AhwBna == 0);
        }
        android.view.View view4 = this.OLrzqt;
        if (view4 != null) {
            view4.setSelected(this.AhwBna == 2);
        }
        android.view.View view5 = this.gEmmrt;
        if (view5 != null) {
            view5.setSelected(this.AhwBna == 1);
        }
    }

    public final void OLrzqt() {
        android.view.View view = this.djBIcL;
        int i = 1;
        if (view == null || !view.isSelected()) {
            android.view.View view2 = this.OLrzqt;
            if (view2 != null && view2.isSelected()) {
                i = 2;
            }
        } else {
            i = 0;
        }
        this.AhwBna = i;
        StateListAnimator stateListAnimator = this.AYXKKw;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault(this.valueOf, i);
        }
    }

    public final void OLrzqt(android.view.View view) {
        C8124awn c8124awn = C8124awn.EZpvd;
        view.measure(View.MeasureSpec.makeMeasureSpec(c8124awn.copydefault(this.AEQbTJ), 0), View.MeasureSpec.makeMeasureSpec(c8124awn.OLrzqt(this.AEQbTJ), 0));
    }

    /* JADX INFO: renamed from: o.rgM$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rgM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

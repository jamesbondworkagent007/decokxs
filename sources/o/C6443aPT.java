package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aPT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6443aPT extends AbstractC6448aPY {
    public final boolean AEQbTJ = true;
    public Function0<Unit> EZpvd;
    public C8255azL KWHzl;
    public Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.aPY.KWHzl()V */
    public final Function0<Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8255azL c8255azLAEQbTJ = C8255azL.AEQbTJ(getLayoutInflater(), constraintLayout, false);
        this.KWHzl = c8255azLAEQbTJ;
        constraintLayout.addView(c8255azLAEQbTJ != null ? c8255azLAEQbTJ.getRoot() : null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        android.widget.LinearLayout linearLayout;
        wYK wyk;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(getString(C8206ayP.Dialog.RAQtXZ));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
            c52794wYpCopydefault.setEnabled(false);
        }
        wyf.setType(7);
        wyf.setSecondaryText(getString(C8206ayP.Dialog.geLlBI));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.aPR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6443aPT.KWHzl(this.copydefault, view);
                }
            });
        }
        C8255azL c8255azL = this.KWHzl;
        if (c8255azL != null && (wyk = c8255azL.OLrzqt) != null) {
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.aPS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C6443aPT.AEQbTJ(wyf, compoundButton, z);
                }
            });
        }
        C8255azL c8255azL2 = this.KWHzl;
        if (c8255azL2 == null || (linearLayout = c8255azL2.copydefault) == null) {
            return;
        }
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
    }

    public static final void KWHzl(C6443aPT c6443aPT, android.view.View view) {
        c6443aPT.dismissAllowingStateLoss();
        Function0<Unit> function0 = c6443aPT.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(wYF wyf, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(z);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.aPT$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C6443aPT OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6443aPT c6443aPT) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c6443aPT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            wYK wyk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C8255azL c8255azL = this.OLrzqt.KWHzl;
                if (c8255azL == null || (wyk = c8255azL.OLrzqt) == null) {
                    return;
                }
                wyk.performClick();
            }
        }
    }

    /* JADX INFO: renamed from: o.aPT$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C6443aPT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6443aPT c6443aPT) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c6443aPT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                Function0<Unit> function0KWHzl = this.copydefault.KWHzl();
                if (function0KWHzl != null) {
                    function0KWHzl.invoke();
                }
            }
        }
    }
}

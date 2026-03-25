package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aPM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6436aPM extends AbstractC6445aPV {
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> KWHzl;
    public final boolean OLrzqt = true;
    public C8254azK copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.aPV.OLrzqt()V */
    public final Function0<Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
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
        C8254azK c8254azKOLrzqt = C8254azK.OLrzqt(getLayoutInflater(), constraintLayout, false);
        this.copydefault = c8254azKOLrzqt;
        constraintLayout.addView(c8254azKOLrzqt != null ? c8254azKOLrzqt.getRoot() : null);
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
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.aPO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6436aPM.AEQbTJ(this.EZpvd, view);
                }
            });
        }
        C8254azK c8254azK = this.copydefault;
        if (c8254azK != null && (wyk = c8254azK.KWHzl) != null) {
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.aPN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C6436aPM.EZpvd(wyf, compoundButton, z);
                }
            });
        }
        C8254azK c8254azK2 = this.copydefault;
        if (c8254azK2 == null || (linearLayout = c8254azK2.EZpvd) == null) {
            return;
        }
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
    }

    public static final void AEQbTJ(C6436aPM c6436aPM, android.view.View view) {
        c6436aPM.dismissAllowingStateLoss();
        Function0<Unit> function0 = c6436aPM.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void EZpvd(wYF wyf, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(z);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.aPM$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6436aPM KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6436aPM c6436aPM) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c6436aPM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            wYK wyk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C8254azK c8254azK = this.KWHzl.copydefault;
                if (c8254azK == null || (wyk = c8254azK.KWHzl) == null) {
                    return;
                }
                wyk.performClick();
            }
        }
    }

    /* JADX INFO: renamed from: o.aPM$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C6436aPM KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6436aPM c6436aPM) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c6436aPM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
                Function0<Unit> function0OLrzqt = this.KWHzl.OLrzqt();
                if (function0OLrzqt != null) {
                    function0OLrzqt.invoke();
                }
            }
        }
    }
}

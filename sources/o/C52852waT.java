package o;

import android.view.View;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52852waT extends AbstractC52780wYb {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.waT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.waT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final boolean KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            if (!KWHzl()) {
                return false;
            }
            new C52852waT().show(fragmentManager, C52852waT.class.getSimpleName());
            return true;
        }

        public final boolean KWHzl() {
            return SPUtils.getBoolean("sp_key_smart_arb_disclaimer-" + C55697xoo.OLrzqt.gEmmrt(), true);
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        return C33070mpX.AYXKKw(C48033uCm.Fragment.dlRikr);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setCloseVisibility(true);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
        wxq.setContentDescription("SmartArbDisclaimerDialogHeader");
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        c54953xam.KWHzl.setVisibility(8);
        c54953xam.OLrzqt.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sIqKDg));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKfwDlxl));
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.igXuih));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.waT$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C52852waT EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52852waT c52852waT) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c52852waT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.waT$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C52852waT KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52852waT c52852waT) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c52852waT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.waT$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C52852waT KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52852waT c52852waT) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c52852waT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                SPUtils.put("sp_key_smart_arb_disclaimer-" + C55697xoo.OLrzqt.gEmmrt(), java.lang.Boolean.FALSE);
                this.KWHzl.getParentFragmentManager().setFragmentResult("tag_confirm_callback", new android.os.Bundle());
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}

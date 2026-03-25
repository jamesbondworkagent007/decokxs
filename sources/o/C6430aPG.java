package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aPG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6430aPG extends AbstractC6446aPW {
    public Function0<Unit> KWHzl;
    public final boolean OLrzqt = true;
    public Function0<Unit> copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.aPW.AEQbTJ()V */
    public final Function0<Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.aPG$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aPG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C6430aPG OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C6430aPG c6430aPG = new C6430aPG();
            c6430aPG.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_TITLE", str), C56390yDp.OLrzqt("KEY_DESC", str2), C56390yDp.OLrzqt("KEY_DEX_REMINDER", str3)));
            return c6430aPG;
        }
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
        C8250azG c8250azGCopydefault = C8250azG.copydefault(getLayoutInflater(), constraintLayout);
        Intrinsics.checkNotNullExpressionValue(c8250azGCopydefault, "");
        AppCompatTextView appCompatTextView = c8250azGCopydefault.AEQbTJ;
        android.os.Bundle arguments = getArguments();
        appCompatTextView.setText(arguments != null ? arguments.getString("KEY_TITLE") : null);
        AppCompatTextView appCompatTextView2 = c8250azGCopydefault.OLrzqt;
        android.os.Bundle arguments2 = getArguments();
        appCompatTextView2.setText(arguments2 != null ? arguments2.getString("KEY_DESC") : null);
        OKReminder oKReminder = c8250azGCopydefault.KWHzl;
        android.os.Bundle arguments3 = getArguments();
        java.lang.String string = arguments3 != null ? arguments3.getString("KEY_DEX_REMINDER") : null;
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) string) ? 0 : 8);
        oKReminder.setMessage(string);
        oKReminder.setStyle(2);
        oKReminder.setCloseIconVisibility(false);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(getString(C8206ayP.Dialog.RAQtXZ));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setType(7);
        wyf.setSecondaryText(getString(C8206ayP.Dialog.getPostValueLengthLimit));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.aPP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6430aPG.EZpvd(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void EZpvd(C6430aPG c6430aPG, android.view.View view) {
        c6430aPG.dismissAllowingStateLoss();
        Function0<Unit> function0 = c6430aPG.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.aPG$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C6430aPG AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6430aPG c6430aPG) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c6430aPG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                Function0<Unit> function0AEQbTJ = this.AEQbTJ.AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                }
            }
        }
    }
}

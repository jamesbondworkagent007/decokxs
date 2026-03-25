package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46896tfn extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tfp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C46896tfn.KWHzl(this.OLrzqt));
        }
    });

    private final int copydefault() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int KWHzl(C46896tfn c46896tfn) {
        android.os.Bundle arguments = c46896tfn.getArguments();
        if (arguments != null) {
            return arguments.getInt("source_type");
        }
        return 1;
    }

    /* JADX INFO: renamed from: o.tfn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tfn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C46896tfn EZpvd(int i) {
            C46896tfn c46896tfn = new C46896tfn();
            c46896tfn.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("source_type", java.lang.Integer.valueOf(i))));
            return c46896tfn;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(qZH.PendingIntent.QOjuYg));
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.tfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46896tfn.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final void AEQbTJ(C46896tfn c46896tfn, android.view.View view) {
        c46896tfn.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        getChildFragmentManager().beginTransaction().add(constraintLayout.getId(), C46895tfm.Companion.OLrzqt(copydefault())).commitAllowingStateLoss();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}

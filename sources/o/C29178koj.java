package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29178koj extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public C23401hxY AhwBna;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kok
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C29178koj.AEQbTJ(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.koq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C29178koj.AhwBna(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kop
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C29178koj.EZpvd(this.AEQbTJ));
        }
    });
    public final boolean KWHzl = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public static final boolean AEQbTJ(C29178koj c29178koj) {
        android.os.Bundle arguments = c29178koj.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("is-native-token");
        }
        return false;
    }

    public final boolean OLrzqt() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean AhwBna(C29178koj c29178koj) {
        android.os.Bundle arguments = c29178koj.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show-pnl");
        }
        return false;
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean EZpvd(C29178koj c29178koj) {
        android.os.Bundle arguments = c29178koj.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show-limit");
        }
        return false;
    }

    public final boolean EZpvd() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setDividerVisibility(false);
        wxq.valueOf().setVisibility(8);
        wxq.EZpvd().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23401hxY c23401hxYOLrzqt = C23401hxY.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        this.AhwBna = c23401hxYOLrzqt;
        if (c23401hxYOLrzqt != null) {
            android.widget.TextView textView = c23401hxYOLrzqt.KWHzl;
            if (OLrzqt()) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.OqIZjC);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DYICSh);
            }
            textView.setText(strAYXKKw);
            if (OLrzqt() && EZpvd()) {
                Group group = c23401hxYOLrzqt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(0);
                Group group2 = c23401hxYOLrzqt.EZpvd;
                Intrinsics.checkNotNullExpressionValue(group2, "");
                group2.setVisibility(8);
                return;
            }
            Group group3 = c23401hxYOLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(group3, "");
            group3.setVisibility(EZpvd() ? 0 : 8);
            Group group4 = c23401hxYOLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(group4, "");
            group4.setVisibility(copydefault() ? 0 : 8);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.buildRccMetadata));
        wyf.setSecondaryButton(null);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.koi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29178koj.EZpvd(this.copydefault, view);
                }
            });
        }
    }

    public static final void EZpvd(C29178koj c29178koj, android.view.View view) {
        c29178koj.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.koj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.koj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C29178koj AEQbTJ(boolean z, boolean z2, boolean z3) {
            C29178koj c29178koj = new C29178koj();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("is-native-token", z);
            bundle.putBoolean("show-pnl", z2);
            bundle.putBoolean("show-limit", z3);
            c29178koj.setArguments(bundle);
            return c29178koj;
        }
    }
}

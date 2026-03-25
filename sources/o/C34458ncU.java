package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34458ncU extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public C36058oNs OLrzqt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ncW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C34458ncU.copydefault(this.copydefault));
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ncS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C34458ncU.AYXKKw(this.copydefault));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ncV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C34458ncU.OLrzqt(this.KWHzl));
        }
    });

    private final boolean AEQbTJ() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean copydefault(C34458ncU c34458ncU) {
        android.os.Bundle arguments = c34458ncU.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("is-native-token");
        }
        return false;
    }

    public static final boolean AYXKKw(C34458ncU c34458ncU) {
        android.os.Bundle arguments = c34458ncU.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show-pnl");
        }
        return false;
    }

    private final boolean KWHzl() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    private final boolean EZpvd() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(C34458ncU c34458ncU) {
        android.os.Bundle arguments = c34458ncU.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show-limit");
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.RzdrRQ));
        wxq.setStyle(1);
        wxq.setDividerVisibility(false);
        wxq.EZpvd().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C36058oNs c36058oNsCopydefault = C36058oNs.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        this.OLrzqt = c36058oNsCopydefault;
        if (c36058oNsCopydefault != null) {
            android.widget.TextView textView = c36058oNsCopydefault.OLrzqt;
            if (AEQbTJ()) {
                strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.UccSpe);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.iHkeWl);
            }
            textView.setText(strAYXKKw);
            if (AEQbTJ() && EZpvd()) {
                Group group = c36058oNsCopydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(0);
                Group group2 = c36058oNsCopydefault.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(group2, "");
                group2.setVisibility(8);
                return;
            }
            Group group3 = c36058oNsCopydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(group3, "");
            group3.setVisibility(EZpvd() ? 0 : 8);
            Group group4 = c36058oNsCopydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(group4, "");
            group4.setVisibility(KWHzl() ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: o.ncU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ncU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C34458ncU KWHzl(boolean z, boolean z2, boolean z3) {
            C34458ncU c34458ncU = new C34458ncU();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("is-native-token", z);
            bundle.putBoolean("show-pnl", z2);
            bundle.putBoolean("show-limit", z3);
            c34458ncU.setArguments(bundle);
            return c34458ncU;
        }
    }
}

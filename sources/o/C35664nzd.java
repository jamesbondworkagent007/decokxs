package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35664nzd extends AbstractC35529nxA {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nze
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C35664nzd.OLrzqt(this.OLrzqt));
        }
    });

    public final int KWHzl() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int OLrzqt(C35664nzd c35664nzd) {
        return c35664nzd.requireArguments().getInt("code");
    }

    /* JADX INFO: renamed from: o.nzd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C35664nzd copydefault(int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("code", i);
            C35664nzd c35664nzd = new C35664nzd();
            c35664nzd.setArguments(bundle);
            return c35664nzd;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        java.lang.String strAYXKKw;
        int iKWHzl = KWHzl();
        if (iKWHzl == 2019) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.QKDJJA);
        } else if (iKWHzl == 2020) {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.jNexW);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.AhwBna);
        }
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35399nuc.LoaderManager.QWpYiD);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C35399nuc.LoaderManager.getFieldNames);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.setTitle(strAYXKKw2);
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) strAYXKKw3, new View.OnClickListener() { // from class: o.nzb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35664nzd.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}

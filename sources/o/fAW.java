package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fAW extends AbstractC52785wYg {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public wYK AEQbTJ;
    public Function1<? super java.lang.Boolean, Unit> copydefault;

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fAW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final fAW AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            fAW faw = new fAW();
            faw.copydefault = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putString("description", str2);
            bundle.putString("tips", str3);
            bundle.putString("primaryText", str4);
            faw.setArguments(bundle);
            return faw;
        }
    }

    private final java.lang.String AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("title");
        }
        return null;
    }

    private final java.lang.String KWHzl() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("description");
        }
        return null;
    }

    public final java.lang.String OLrzqt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("tips");
        }
        return null;
    }

    public final java.lang.String copydefault() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("primaryText");
        }
        return null;
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C13754dXa.Activity.finit);
        c54954xan.AEQbTJ.setText(AEQbTJ());
        c54954xan.OLrzqt.setText(KWHzl());
        wYK wyk = c54954xan.EZpvd;
        this.AEQbTJ = wyk;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt()) ? 0 : 8);
        c54954xan.EZpvd.setText(OLrzqt());
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setPrimaryText(copydefault());
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fAX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    fAW.KWHzl(this.OLrzqt, view);
                }
            });
        }
        wyf.post(new java.lang.Runnable() { // from class: o.fAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fAW.copydefault(this.AEQbTJ);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(fAW faw, android.view.View view) {
        boolean z;
        faw.dismissAllowingStateLoss();
        Function1<? super java.lang.Boolean, Unit> function1 = faw.copydefault;
        if (function1 != null) {
            wYK wyk = faw.AEQbTJ;
            if (wyk != null) {
                z = wyk.isChecked();
            }
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    public static final void copydefault(fAW faw) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) faw, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}

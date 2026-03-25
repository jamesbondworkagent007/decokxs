package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gBV extends AbstractC52785wYg {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    private final java.lang.String AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("PARAM_TITLE") : null;
        return string == null ? "" : string;
    }

    private final java.lang.String EZpvd() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("PARAM_DESCRIPTION") : null;
        return string == null ? "" : string;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gBV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final gBV OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            gBV gbv = new gBV();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_TITLE", str);
            bundle.putString("PARAM_DESCRIPTION", str2);
            gbv.setArguments(bundle);
            return gbv;
        }
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.AEQbTJ.setText(AEQbTJ());
        c54954xan.OLrzqt.setText(EZpvd());
        c54954xan.KWHzl.setImageDrawable(ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.GGlJim));
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(getString(C13754dXa.FragmentManager.DXXBbs));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.gBX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gBV.AEQbTJ(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void AEQbTJ(gBV gbv, android.view.View view) {
        gbv.dismissAllowingStateLoss();
        Function0<Unit> function0 = gbv.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

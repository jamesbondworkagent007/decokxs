package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15518eLh extends AbstractC52780wYb {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        return "";
    }

    @Override // o.AbstractC52780wYb
    public boolean OLrzqt() {
        return false;
    }

    /* JADX INFO: renamed from: o.eLh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eLh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C15518eLh OLrzqt(long j) {
            C15518eLh c15518eLh = new C15518eLh();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("coinId", j);
            c15518eLh.setArguments(bundle);
            return c15518eLh;
        }
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        java.lang.String strDjBIcL;
        java.lang.String strFJNWhG;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c54953xam, "");
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        android.os.Bundle arguments = getArguments();
        C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(arguments != null ? java.lang.Long.valueOf(arguments.getLong("coinId")) : null);
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        int i = C13754dXa.FragmentManager.addCallback;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        if (c10854bwMKWHzl == null || (strDjBIcL = c10854bwMKWHzl.djBIcL()) == null) {
            strDjBIcL = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("network", strDjBIcL);
        if (c10854bwMKWHzl != null && (strFJNWhG = c10854bwMKWHzl.fJNWhG()) != null) {
            str = strFJNWhG;
        }
        pairArr[1] = C56390yDp.OLrzqt("token", str);
        appCompatTextView.setText(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr)));
        c54953xam.OLrzqt.setBreakStrategy(0);
        c54953xam.KWHzl.setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(getString(C13754dXa.FragmentManager.DCJXGO));
        wyf.setOnClickListener(new View.OnClickListener() { // from class: o.eLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15518eLh.copydefault(this.EZpvd, view);
            }
        });
    }

    public static final void copydefault(C15518eLh c15518eLh, android.view.View view) {
        c15518eLh.dismissAllowingStateLoss();
    }
}

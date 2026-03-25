package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tKN extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C46262tNv EZpvd;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final tKN OLrzqt() {
            return new tKN();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = C46262tNv.EZpvd(getLayoutInflater(), constraintLayout, true);
        OLrzqt();
    }

    private final void OLrzqt() {
        C46262tNv c46262tNv = this.EZpvd;
        if (c46262tNv == null) {
            Intrinsics.gEmmrt("");
            c46262tNv = null;
        }
        c46262tNv.valueOf.setText(C33070mpX.AYXKKw(C47501trL.Fragment.zOIQXb));
        c46262tNv.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.gUEfcq));
        OKRegularCell oKRegularCell = c46262tNv.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
        OLrzqt(oKRegularCell, C52761wXj.TaskDescription.vLaW, C33070mpX.AYXKKw(C47501trL.Fragment.zAEkPU));
        OKRegularCell oKRegularCell2 = c46262tNv.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell2, "");
        OLrzqt(oKRegularCell2, C52761wXj.TaskDescription.UlpNxW, C33070mpX.AYXKKw(C47501trL.Fragment.zKcAg));
        OKRegularCell oKRegularCell3 = c46262tNv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell3, "");
        OLrzqt(oKRegularCell3, C52761wXj.TaskDescription.hGuIrQ, C33070mpX.AYXKKw(C47501trL.Fragment.tIwhY));
    }

    public final void OLrzqt(OKRegularCell oKRegularCell, int i, java.lang.String str) {
        oKRegularCell.setTitle(str);
        if (i != 0) {
            oKRegularCell.setIcon(requireContext().getDrawable(i));
        }
        oKRegularCell.setClickable(false);
        oKRegularCell.setFocusable(false);
        oKRegularCell.setBackground(null);
    }
}

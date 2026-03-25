package o;

import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jMD extends wXX {
    public C42900rfD EZpvd;
    public final boolean KWHzl;
    public final Function1<java.lang.Boolean, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jMD(boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = z;
        this.copydefault = function1;
    }

    public final C42900rfD AEQbTJ() {
        C42900rfD c42900rfD = this.EZpvd;
        Intrinsics.copydefault(c42900rfD);
        return c42900rfD;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        EZpvd(constraintLayout);
        this.EZpvd = C42900rfD.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.RKcVTr));
        wxq.AEQbTJ().setVisibility(0);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        android.content.Context context = wxq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textViewAYXKKw.setTextSize(C55298xhM.EZpvd(16.0f, context));
        wxq.setStyle(2);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C55239xgG c55239xgG = AEQbTJ().KWHzl;
        c55239xgG.setChecked(this.KWHzl);
        c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.jMC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                jMD.KWHzl(this.EZpvd, compoundButton, z);
            }
        });
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(jMD jmd, android.widget.CompoundButton compoundButton, boolean z) {
        jmd.copydefault.invoke(java.lang.Boolean.valueOf(z));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.EZpvd = null;
    }

    public final void EZpvd(android.view.ViewGroup viewGroup) {
        viewGroup.setPaddingRelative(viewGroup.getPaddingStart(), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT), viewGroup.getPaddingEnd(), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX));
    }
}

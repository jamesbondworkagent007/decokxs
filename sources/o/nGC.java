package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nGC extends AbstractC52785wYg {
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> copydefault;

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.invokespecialgBtXYZ);
        c54954xan.AEQbTJ.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.setCurrentKeyboardTarget));
        c54954xan.OLrzqt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.PUZqN));
        ViewGroup.LayoutParams layoutParams = c54954xan.OLrzqt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
            c54954xan.OLrzqt.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fraLem));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nGB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nGC.EZpvd(this.copydefault, view);
                }
            });
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DjWNei));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nGD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nGC.AEQbTJ(this.copydefault, view);
                }
            });
        }
    }

    public static final void EZpvd(nGC ngc, android.view.View view) {
        Function0<Unit> function0 = ngc.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void AEQbTJ(nGC ngc, android.view.View view) {
        Function0<Unit> function0 = ngc.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setVisibility(8);
    }
}

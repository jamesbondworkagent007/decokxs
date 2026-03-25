package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tKL extends wXX {
    public C46266tNz copydefault;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.tKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tKL.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void OLrzqt(tKL tkl, android.view.View view) {
        tkl.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C46266tNz.OLrzqt(getLayoutInflater(), constraintLayout, true);
    }
}

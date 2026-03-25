package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52780wYb extends wXX {
    public final boolean isConnected = true;

    public abstract java.lang.CharSequence AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.isConnected;
    }

    public abstract void copydefault(@NotNull C54953xam c54953xam);

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (OLrzqt()) {
            wxq.setStyle(3);
        } else {
            wxq.setStyle(1);
        }
        wxq.setTitle(AEQbTJ());
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54953xam c54953xamOLrzqt = C54953xam.OLrzqt(getCustomLayoutInflater(), constraintLayout);
        Intrinsics.checkNotNullExpressionValue(c54953xamOLrzqt, "");
        OLrzqt(c54953xamOLrzqt);
    }

    public final void OLrzqt(C54953xam c54953xam) {
        if (OLrzqt()) {
            c54953xam.EZpvd.setVisibility(0);
        } else {
            c54953xam.EZpvd.setVisibility(8);
        }
        copydefault(c54953xam);
    }
}

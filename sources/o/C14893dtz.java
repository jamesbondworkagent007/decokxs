package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14893dtz extends wXX {
    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater.from(getContext()).inflate(dLX.Fragment.AYXKKw, (android.view.ViewGroup) constraintLayout, true);
        constraintLayout.findViewById(dLX.Application.AuCTelauCTel).setOnClickListener(new View.OnClickListener() { // from class: o.dtC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14893dtz.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(C14893dtz c14893dtz, android.view.View view) {
        c14893dtz.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(dLX.Dialog.QUSxYX);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.dtD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14893dtz.copydefault(this.copydefault, view);
                }
            });
        }
    }

    public static final void copydefault(C14893dtz c14893dtz, android.view.View view) {
        c14893dtz.dismissAllowingStateLoss();
    }
}

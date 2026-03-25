package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.planet.widget.SimpleLabelValuePairView;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46056tGe extends wXX {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    public C46056tGe(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.OLrzqt = true;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C46291tOx c46291tOxAEQbTJ = C46291tOx.AEQbTJ(android.view.LayoutInflater.from(requireContext()), constraintLayout, false);
        constraintLayout.addView(c46291tOxAEQbTJ.getRoot());
        Intrinsics.copydefault(c46291tOxAEQbTJ);
        KWHzl(c46291tOxAEQbTJ);
    }

    public final void KWHzl(C46291tOx c46291tOx) {
        SimpleLabelValuePairView simpleLabelValuePairView = c46291tOx.EZpvd;
        java.lang.String str = this.AEQbTJ;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        C55051xce c55051xce = C55051xce.OLrzqt;
        SimpleLabelValuePairView.setValueText$default(simpleLabelValuePairView, str, java.lang.Integer.valueOf(iCopydefault), 0.0f, c55051xce.OLrzqt(), 4, null);
        SimpleLabelValuePairView.setValueText$default(c46291tOx.copydefault, this.EZpvd, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0.0f, c55051xce.OLrzqt(), 4, null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C47501trL.Fragment.hfdhUn));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 300L, c52794wYpCopydefault, this));
        }
    }

    /* JADX INFO: renamed from: o.tGe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C46056tGe KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, android.view.View view2, C46056tGe c46056tGe) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = view2;
            this.KWHzl = c46056tGe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }
}

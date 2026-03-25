package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50354vLh extends AbstractC49945uyC<AbstractC48517uUi, EmptyPresenter> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.DsL;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (C33492mxV.OLrzqt()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.fGQ);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.iCPUKe);
        }
        Glide.EZpvd(this).EZpvd(strAYXKKw).KWHzl(C52761wXj.TaskDescription.DuR).fetchVPNInfo().EZpvd(values().OLrzqt);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.Rattr));
        wyf.setOnClickListener(new TaskDescription(wyf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vLh$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50354vLh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50354vLh c50354vLh) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c50354vLh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}

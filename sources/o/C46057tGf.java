package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.trade.manager.common.position.PosShowItem;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46057tGf extends wXX {
    public final C59534zip EZpvd;
    public final InterfaceC46069tGr KWHzl;
    public final boolean OLrzqt;
    public tOF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    public C46057tGf(@NotNull InterfaceC46069tGr interfaceC46069tGr) {
        Intrinsics.checkNotNullParameter(interfaceC46069tGr, "");
        this.KWHzl = interfaceC46069tGr;
        this.OLrzqt = true;
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(PosShowItem.class, new C46075tGx());
        this.EZpvd = c59534zip;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C33064mpR.OLrzqt(this.EZpvd, C46076tGy.copydefault(this.KWHzl));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        tOF tofKWHzl = tOF.KWHzl(android.view.LayoutInflater.from(requireContext()), constraintLayout, false);
        constraintLayout.addView(tofKWHzl.getRoot());
        Intrinsics.copydefault(tofKWHzl);
        AEQbTJ(tofKWHzl);
        this.copydefault = tofKWHzl;
    }

    public final void AEQbTJ(tOF tof) {
        RecyclerView recyclerView = tof.copydefault;
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
        recyclerView.setPadding(iOLrzqt, 8, iOLrzqt, 24);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.EZpvd);
        recyclerView.addItemDecoration(new C46470tVn(C52761wXj.StateListAnimator.zuBGHE));
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
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 300L, c52794wYpCopydefault, this));
        }
    }

    /* JADX INFO: renamed from: o.tGf$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C46057tGf OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.view.View view2, C46057tGf c46057tGf) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = view2;
            this.OLrzqt = c46057tGf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }
}

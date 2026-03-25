package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.data.KLineEventBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pfe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38767pfe extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public oMM AEQbTJ;
    public final C43316rmw OLrzqt = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.fvQaOB;
    }

    /* JADX INFO: renamed from: o.pfe$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pfe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C38767pfe OLrzqt() {
            return new C38767pfe();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55320xhi c55320xhi;
        Intrinsics.checkNotNullParameter(view, "");
        oMM ommCopydefault = oMM.copydefault(view);
        this.AEQbTJ = ommCopydefault;
        if (ommCopydefault != null && (c55320xhi = ommCopydefault.EZpvd) != null) {
            c55320xhi.setVisibility(8);
        }
        AEQbTJ();
        view.post(new java.lang.Runnable() { // from class: o.pfh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38767pfe.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(C38767pfe c38767pfe) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38767pfe, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C43316rmw c43316rmw = this.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43316rmw.register(KLineEventBean.class, new C39481ptE(contextRequireContext, false, null, 6, null));
        this.OLrzqt.register(oLR.class, new C39479ptC());
        oMM omm = this.AEQbTJ;
        if (omm != null && (recyclerView2 = omm.AEQbTJ) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        oMM omm2 = this.AEQbTJ;
        if (omm2 == null || (recyclerView = omm2.AEQbTJ) == null) {
            return;
        }
        recyclerView.setAdapter(this.OLrzqt);
    }

    public final void EZpvd(@NotNull java.util.List<? extends oLP> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.setItems(list);
        this.OLrzqt.notifyDataSetChanged();
    }
}

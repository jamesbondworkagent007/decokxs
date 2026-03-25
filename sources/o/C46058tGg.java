package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.widget.SimpleLabelValuePairView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46058tGg extends wXX {
    public final InterfaceC56387yDm AEQbTJ;
    public final boolean EZpvd;
    public final YieldDetails.Activity KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    public C46058tGg(@NotNull YieldDetails.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
        this.EZpvd = true;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46058tGg.KWHzl(this.copydefault);
            }
        });
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String KWHzl(C46058tGg c46058tGg) {
        return c46058tGg.KWHzl.KWHzl();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        tOD todAEQbTJ = tOD.AEQbTJ(android.view.LayoutInflater.from(requireContext()), constraintLayout, false);
        constraintLayout.addView(todAEQbTJ.getRoot());
        YieldDetails.Activity activity = this.KWHzl;
        if (activity instanceof YieldDetails.ContractCurrentYieldDetails) {
            Intrinsics.copydefault(todAEQbTJ);
            AEQbTJ(todAEQbTJ, (YieldDetails.ContractCurrentYieldDetails) this.KWHzl);
        } else {
            if (!(activity instanceof YieldDetails.ContractHistoryYieldDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.copydefault(todAEQbTJ);
            OLrzqt(todAEQbTJ, (YieldDetails.ContractHistoryYieldDetails) this.KWHzl);
        }
    }

    public final void OLrzqt(tOD tod, YieldDetails.ContractHistoryYieldDetails contractHistoryYieldDetails) {
        SimpleLabelValuePairView simpleLabelValuePairView = tod.copydefault;
        Intrinsics.checkNotNullExpressionValue(simpleLabelValuePairView, "");
        simpleLabelValuePairView.setVisibility(8);
        android.view.View view = tod.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        kotlin.Pair commonPNL$default = C46367tRs.formatCommonPNL$default(contractHistoryYieldDetails.AYXKKw(), EZpvd(), 0, false, 6, null);
        java.lang.String str = (java.lang.String) commonPNL$default.component1();
        int iIntValue = ((java.lang.Number) commonPNL$default.component2()).intValue();
        SimpleLabelValuePairView simpleLabelValuePairView2 = tod.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(simpleLabelValuePairView2, "");
        C55296xhK.margin$default(simpleLabelValuePairView2, null, java.lang.Float.valueOf(0.0f), null, null, 13, null);
        SimpleLabelValuePairView.setValueText$default(tod.AEQbTJ, str, java.lang.Integer.valueOf(iIntValue), 0.0f, C55051xce.OLrzqt.OLrzqt(), 4, null);
        kotlin.Pair commonPNL$default2 = C46367tRs.formatCommonPNL$default(contractHistoryYieldDetails.EZpvd(), EZpvd(), 0, false, 6, null);
        SimpleLabelValuePairView.Normal normal = new SimpleLabelValuePairView.Normal(C33070mpX.AYXKKw(C47501trL.Fragment.QbewEr), (java.lang.String) commonPNL$default2.component1(), ((java.lang.Number) commonPNL$default2.component2()).intValue(), 0, 0.0f, 0.0f, 56, null);
        SimpleLabelValuePairView.Normal normal2 = new SimpleLabelValuePairView.Normal(C33070mpX.AYXKKw(C47501trL.Fragment.QfsBiF), C46367tRs.OLrzqt(contractHistoryYieldDetails.copydefault(), EZpvd()), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0.0f, 0.0f, 56, null);
        SimpleLabelValuePairView.Normal normal3 = new SimpleLabelValuePairView.Normal(C33070mpX.AYXKKw(C47501trL.Fragment.RcXXUw), C46367tRs.OLrzqt(contractHistoryYieldDetails.AEQbTJ(), EZpvd()), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0.0f, 0.0f, 56, null);
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(normal);
        listOLrzqt.add(normal2);
        if (contractHistoryYieldDetails.OLrzqt()) {
            listOLrzqt.add(new SimpleLabelValuePairView.Normal(C33070mpX.AYXKKw(C47501trL.Fragment.QVAiDq), C46367tRs.OLrzqt(contractHistoryYieldDetails.djBIcL(), EZpvd()), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0.0f, 0.0f, 56, null));
        }
        listOLrzqt.add(normal3);
        tod.EZpvd.setLabelValuePairs(C56402yEa.fARcdN(listOLrzqt));
    }

    public final void AEQbTJ(tOD tod, YieldDetails.ContractCurrentYieldDetails contractCurrentYieldDetails) {
        kotlin.Pair commonPNL$default = C46367tRs.formatCommonPNL$default(contractCurrentYieldDetails.gEmmrt(), EZpvd(), 0, false, 6, null);
        java.lang.String str = (java.lang.String) commonPNL$default.component1();
        int iIntValue = ((java.lang.Number) commonPNL$default.component2()).intValue();
        SimpleLabelValuePairView simpleLabelValuePairView = tod.copydefault;
        C55051xce c55051xce = C55051xce.OLrzqt;
        SimpleLabelValuePairView.setValueText$default(simpleLabelValuePairView, str, java.lang.Integer.valueOf(iIntValue), 0.0f, c55051xce.OLrzqt(), 4, null);
        kotlin.Pair commonPNL$default2 = C46367tRs.formatCommonPNL$default(contractCurrentYieldDetails.AYXKKw(), EZpvd(), 0, false, 6, null);
        SimpleLabelValuePairView.setValueText$default(tod.AEQbTJ, (java.lang.String) commonPNL$default2.component1(), java.lang.Integer.valueOf(((java.lang.Number) commonPNL$default2.component2()).intValue()), 0.0f, c55051xce.OLrzqt(), 4, null);
        kotlin.Pair commonPNL$default3 = C46367tRs.formatCommonPNL$default(contractCurrentYieldDetails.EZpvd(), EZpvd(), 0, false, 6, null);
        tod.EZpvd.setLabelValuePairs(yDY.gEmmrt(new SimpleLabelValuePairView.Normal(C33070mpX.AYXKKw(C47501trL.Fragment.QbewEr), (java.lang.String) commonPNL$default3.component1(), ((java.lang.Number) commonPNL$default3.component2()).intValue(), 0, 0.0f, 0.0f, 56, null), new SimpleLabelValuePairView.Normal(C33070mpX.AYXKKw(C47501trL.Fragment.QfsBiF), C46367tRs.OLrzqt(contractCurrentYieldDetails.copydefault(), EZpvd()), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0.0f, 0.0f, 56, null), new SimpleLabelValuePairView.Normal(C33070mpX.AYXKKw(C47501trL.Fragment.RcXXUw), C46367tRs.OLrzqt(contractCurrentYieldDetails.AEQbTJ(), EZpvd()), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0.0f, 0.0f, 56, null)));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (this.KWHzl instanceof YieldDetails.TaskDescription) {
            wxq.setStyle(1);
            wxq.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.RJOkX));
        } else {
            wxq.setStyle(0);
        }
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
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 300L, c52794wYpCopydefault, this));
        }
    }

    /* JADX INFO: renamed from: o.tGg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C46058tGg EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.view.View view2, C46058tGg c46058tGg) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = view2;
            this.EZpvd = c46058tGg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }
}

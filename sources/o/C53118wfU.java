package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter.SmartInvestDetailPresenter;
import com.okinc.unify_trade.bot.data.SmartInvestData;
import com.okinc.unify_trade.bot.data.SmartInvestDetail;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53118wfU extends AbstractC49945uyC<uZM, SmartInvestDetailPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public android.app.Dialog gEmmrt;
    public final int copydefault = C48033uCm.Activity.putInt;
    public final boolean AEQbTJ = true;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wgb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53118wfU.isConnected();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    private final C43316rmw fARcdN() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.wfU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wfU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(SmartInvestDetail smartInvestDetail, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C53118wfU c53118wfU = new C53118wfU();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("invest_data", smartInvestDetail);
            c53118wfU.setArguments(bundle);
            c53118wfU.show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi26));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        this.gEmmrt = dialogOnCreateDialog;
        return dialogOnCreateDialog;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = this.gEmmrt;
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        fIwbmz();
        ejfBZ();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOKDSSize(52);
        wyf.setOnClickListener(new StateListAnimator(wyf, 1000L, this));
    }

    private final void AuCTel() {
        SmartInvestDetailPresenter smartInvestDetailPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        smartInvestDetailPresenterOLrzqt.KWHzl(arguments != null ? (SmartInvestDetail) arguments.getParcelable("invest_data") : null);
    }

    private final void fIwbmz() {
        values().AEQbTJ.setText(OLrzqt().OLrzqt());
    }

    private final void ejfBZ() {
        fARcdN().register(SmartInvestData.class, new C53113wfP());
        values().KWHzl.addItemDecoration(new C53115wfR(OLrzqt().copydefault().size()));
        values().KWHzl.setAdapter(fARcdN());
        values().KWHzl.setLayoutManager(new LinearLayoutManager(getContext()));
        C33064mpR.OLrzqt(fARcdN(), (java.util.List<? extends java.lang.Object>) OLrzqt().copydefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.wfU$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53118wfU OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53118wfU c53118wfU) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c53118wfU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.fJNWhG();
            }
        }
    }

    /* JADX INFO: renamed from: o.wfU$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C53118wfU EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53118wfU c53118wfU) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c53118wfU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.fJNWhG();
            }
        }
    }
}

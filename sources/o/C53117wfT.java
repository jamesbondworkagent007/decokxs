package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter.SmartIntroPresenter;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.bot.data.DistributeItem;
import com.okinc.unify_trade.bot.data.IntroItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53117wfT extends AbstractC49945uyC<uZK, SmartIntroPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public android.app.Dialog AYXKKw;
    public boolean OLrzqt;
    public final int gEmmrt = C48033uCm.Activity.dSJNDS;
    public final boolean KWHzl = true;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wfV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53117wfT.isConnected();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    private final C43316rmw fJNWhG() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.wfT$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wfT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(@NotNull IntroItemData introItemData, @NotNull SmartPortfolioReq smartPortfolioReq, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(introItemData, "");
            Intrinsics.checkNotNullParameter(smartPortfolioReq, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C53117wfT c53117wfT = new C53117wfT();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("smart_card_data", introItemData);
            bundle.putParcelable("smart_card_qreq", smartPortfolioReq);
            c53117wfT.setArguments(bundle);
            c53117wfT.show(fragmentManager, "SmartIntroDialog");
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi217));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        this.AYXKKw = dialogOnCreateDialog;
        return dialogOnCreateDialog;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi23));
        wyf.setOKDSSize(52);
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = this.AYXKKw;
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
        getNewProxyInstance();
        fARcdN();
        fIwbmz();
    }

    private final void AuCTel() {
        SmartIntroPresenter smartIntroPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        IntroItemData introItemData = arguments != null ? (IntroItemData) arguments.getParcelable("smart_card_data") : null;
        Intrinsics.copydefault(introItemData);
        smartIntroPresenterOLrzqt.OLrzqt(introItemData);
        SmartIntroPresenter smartIntroPresenterOLrzqt2 = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        SmartPortfolioReq smartPortfolioReq = arguments2 != null ? (SmartPortfolioReq) arguments2.getParcelable("smart_card_qreq") : null;
        Intrinsics.copydefault(smartPortfolioReq);
        smartIntroPresenterOLrzqt2.KWHzl(smartPortfolioReq);
    }

    private final void getNewProxyInstance() {
        IntroItemData introItemDataCopydefault = OLrzqt().copydefault();
        values().EZpvd.setText(introItemDataCopydefault.getTitle());
        AppCompatTextView appCompatTextView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(introItemDataCopydefault.getLabel1().length() > 0 ? 0 : 8);
        values().copydefault.setText(introItemDataCopydefault.getLabel1());
        AppCompatTextView appCompatTextView2 = values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(introItemDataCopydefault.getLabel2().length() > 0 ? 0 : 8);
        values().AhwBna.setText(introItemDataCopydefault.getLabel2());
        values().djBIcL.setText(introItemDataCopydefault.getUserCount());
        values().OLrzqt.setText(introItemDataCopydefault.getDescription());
    }

    private final void fARcdN() {
        fJNWhG().register(DistributeItem.class, new C53109wfL());
        values().KWHzl.addItemDecoration(new C53110wfM(OLrzqt().copydefault().getDistributeList().size()));
        values().KWHzl.setAdapter(fJNWhG());
        values().KWHzl.setLayoutManager(new LinearLayoutManager(getContext()));
        C33064mpR.OLrzqt(fJNWhG(), (java.util.List<? extends java.lang.Object>) OLrzqt().copydefault().getDistributeList());
    }

    private final void fIwbmz() {
        values().AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wfX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53117wfT.EZpvd(this.KWHzl, view);
            }
        });
    }

    public static final void EZpvd(C53117wfT c53117wfT, android.view.View view) {
        c53117wfT.OLrzqt = !c53117wfT.OLrzqt;
        c53117wfT.values().OLrzqt.setMaxLines(c53117wfT.OLrzqt ? Integer.MAX_VALUE : 3);
        c53117wfT.values().AEQbTJ.setText(C33070mpX.AYXKKw(c53117wfT.OLrzqt ? C55688xof.Application.invokeSuspendlambda1 : C55688xof.Application.r8lambdatX1ZAZ_6mxGyPSL59qbNSbD0n4g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.wfT$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53117wfT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53117wfT c53117wfT) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c53117wfT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.copydefault.getParentFragmentManager();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("bot_copy_req", this.copydefault.OLrzqt().AEQbTJ());
                Unit unit = Unit.INSTANCE;
                parentFragmentManager.setFragmentResult("smart_card_qreq", bundle);
            }
        }
    }

    /* JADX INFO: renamed from: o.wfT$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C53117wfT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53117wfT c53117wfT) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c53117wfT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.ejfBZ();
            }
        }
    }
}

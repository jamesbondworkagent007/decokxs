package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter.SmartRecommendPresenter;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.data.IntroItemData;
import com.okinc.unify_trade.bot.data.RecommendCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C53117wfT;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53179wgc extends AbstractC49945uyC<uZP, SmartRecommendPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public android.app.Dialog valueOf;
    public final int KWHzl = C48033uCm.Activity.hwkNQP;
    public final float copydefault = 0.98f;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wgk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53179wgc.isConnected();
        }
    });

    /* JADX INFO: renamed from: o.wgc$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    private final C43316rmw ejfBZ() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.wgc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wgc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C53179wgc c53179wgc = new C53179wgc();
            c53179wgc.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_id", str)));
            c53179wgc.show(fragmentManager, "SmartRecommendDialog");
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.dump));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        this.valueOf = dialogOnCreateDialog;
        return dialogOnCreateDialog;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = this.valueOf;
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
        fIwbmz();
        fARcdN();
    }

    private final void fIwbmz() {
        TradeLiveData<java.util.List<SmartRecommendResp>> tradeLiveDataAEQbTJ = OLrzqt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53179wgc.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        }));
        OLrzqt().copydefault().AkhnZx().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53179wgc.copydefault(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53179wgc.AEQbTJ(this.copydefault, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(final C53179wgc c53179wgc, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            android.widget.FrameLayout frameLayout = c53179wgc.values().EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            android.widget.FrameLayout frameLayout2 = c53179wgc.values().EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            C49952uyJ.EZpvd(c53179wgc, frameLayout2, "", C33070mpX.AYXKKw(C55688xof.Application.getFullyDrawnReporter), (16 & 8) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq), (16 & 16) != 0 ? C52761wXj.TaskDescription.gCNefq : 0, (16 & 32) != 0 ? null : new Function0() { // from class: o.wfZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C53179wgc.KWHzl(this.copydefault);
                }
            });
            return Unit.INSTANCE;
        }
        c53179wgc.EZpvd(c53179wgc.OLrzqt().AEQbTJ((java.util.List<SmartRecommendResp>) list));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53179wgc c53179wgc) {
        android.widget.FrameLayout frameLayout = c53179wgc.values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        c53179wgc.fARcdN();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53179wgc c53179wgc, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            AbstractC49945uyC.showLoading$default(c53179wgc, 0L, 1, null);
        } else {
            c53179wgc.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C53179wgc c53179wgc, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        android.widget.FrameLayout frameLayout = c53179wgc.values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        android.widget.FrameLayout frameLayout2 = c53179wgc.values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OeawrHRnVkix);
        java.lang.String message = exc.getMessage();
        C6980aZc.AEQbTJ(c53179wgc, frameLayout2, strAYXKKw, message == null ? "" : message, (16 & 8) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq), (16 & 16) != 0 ? C52761wXj.TaskDescription.getSerial : 0, (16 & 32) != 0 ? null : new Function0() { // from class: o.wfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53179wgc.EZpvd(this.AEQbTJ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53179wgc c53179wgc) {
        android.widget.FrameLayout frameLayout = c53179wgc.values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        c53179wgc.fARcdN();
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        java.lang.String string;
        SmartRecommendPresenter smartRecommendPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("bot_inst_id")) == null) {
            string = "";
        }
        SmartRecommendPresenter.queryRecommendList$default(smartRecommendPresenterOLrzqt, null, string, 1, null);
    }

    public final void EZpvd(java.util.List<RecommendCardData> list) {
        ejfBZ().register(RecommendCardData.class, new C53114wfQ(new Function1() { // from class: o.wga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53179wgc.OLrzqt(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, new Function1() { // from class: o.wgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53179wgc.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }));
        values().AEQbTJ.addItemDecoration(new C53112wfO());
        values().AEQbTJ.setAdapter(ejfBZ());
        values().AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        C33064mpR.OLrzqt(ejfBZ(), (java.util.List<? extends java.lang.Object>) list);
    }

    public static final Unit OLrzqt(C53179wgc c53179wgc, int i) {
        C53117wfT.Activity activity = C53117wfT.Companion;
        IntroItemData introItemDataKWHzl = c53179wgc.OLrzqt().KWHzl(i);
        SmartPortfolioReq smartPortfolioReqAEQbTJ = c53179wgc.OLrzqt().AEQbTJ(i);
        androidx.fragment.app.FragmentManager parentFragmentManager = c53179wgc.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        activity.copydefault(introItemDataKWHzl, smartPortfolioReqAEQbTJ, parentFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53179wgc c53179wgc, int i) {
        C32866mlf.onEvent$default("BotPlaceOrder_Recommended_BotCard_Click", (TrackChannel[]) null, new Function1() { // from class: o.wgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53179wgc.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        androidx.fragment.app.FragmentManager parentFragmentManager = c53179wgc.getParentFragmentManager();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("bot_copy_req", c53179wgc.OLrzqt().AEQbTJ(i));
        Unit unit = Unit.INSTANCE;
        parentFragmentManager.setFragmentResult("smart_card_qreq", bundle);
        return unit;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "source", "ai", false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", "smart_portfolio", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTel() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.wgc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53179wgc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53179wgc c53179wgc) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c53179wgc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AuCTel();
            }
        }
    }
}

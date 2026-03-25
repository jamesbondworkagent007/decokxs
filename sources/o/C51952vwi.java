package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.SignalProviderSignalBean;
import com.okinc.unify_trade.biz.SignalPublishInfo;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;

/* JADX INFO: renamed from: o.vwi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51952vwi extends AbstractC51880vvP {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ;

    public C51952vwi() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vwj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C51952vwi.EZpvd(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    public static final void EZpvd(final C51952vwi c51952vwi, ActivityResult activityResult) {
        android.content.Context context;
        if (activityResult.getResultCode() != -1 || (context = c51952vwi.getContext()) == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.zdxASf));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.icKaHr));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintViewpositionInWindow), new View.OnClickListener() { // from class: o.vwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51952vwi.copydefault(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(C51952vwi c51952vwi, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c51952vwi.dxcTrN().copydefault();
        c51952vwi.KWHzl();
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.vwi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vwi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final androidx.fragment.app.Fragment AEQbTJ() {
            return new C51952vwi();
        }
    }

    @Override // o.AbstractC51880vvP
    public void KWHzl() {
        dxcTrN().copydefault("waiting_publish");
    }

    @Override // o.AbstractC51880vvP
    public void copydefault() {
        AEQbTJ().register(SignalProviderSignalBean.class, new C51895vve(new Function1() { // from class: o.vwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51952vwi.OLrzqt(this.OLrzqt, (SignalProviderSignalBean) obj);
            }
        }));
        AEQbTJ().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vwh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51952vwi.EZpvd(this.AEQbTJ, (EmptyData) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51952vwi c51952vwi, SignalProviderSignalBean signalProviderSignalBean) {
        Intrinsics.checkNotNullParameter(signalProviderSignalBean, "");
        java.lang.String approvalStatus = signalProviderSignalBean.getApprovalStatus();
        if (Intrinsics.EZpvd((java.lang.Object) approvalStatus, (java.lang.Object) "init") || Intrinsics.EZpvd((java.lang.Object) approvalStatus, (java.lang.Object) "publish_rejected")) {
            ActivityResultLauncher<android.content.Intent> activityResultLauncher = c51952vwi.AEQbTJ;
            android.content.Intent intent = new android.content.Intent(c51952vwi.getContext(), (java.lang.Class<?>) ActivityC51762vtD.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("data", new SignalPublishInfo(signalProviderSignalBean.getSignalChanId(), signalProviderSignalBean.getSignalChanName(), signalProviderSignalBean.getSignalDescription(), signalProviderSignalBean.getSubscriptionType(), signalProviderSignalBean.getProfitSharingRatio(), signalProviderSignalBean.getSubscriptionFee(), signalProviderSignalBean.getInstIds(), signalProviderSignalBean.getApprovalStatus(), signalProviderSignalBean.getRecommendInvestAmount(), signalProviderSignalBean.getRecommendLeverage(), (java.lang.String) null, 1024, (DefaultConstructorMarker) null))));
            activityResultLauncher.launch(intent);
            c51952vwi.KWHzl(Intrinsics.EZpvd((java.lang.Object) signalProviderSignalBean.getApprovalStatus(), (java.lang.Object) "init") ? "Publish" : "Republish");
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51952vwi c51952vwi, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c51952vwi.KWHzl();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC51880vvP
    public void EZpvd() {
        C32866mlf.onEvent$default("OrderManagement_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.vwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51952vwi.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page", "unpublished", false, 4, null);
        return Unit.INSTANCE;
    }
}

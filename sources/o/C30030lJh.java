package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.ui.buysellconvert.transaction.buysell.view.UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ok_app.api.LitePortfolioSourceEnum;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.web.WebActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33240msi;
import o.AbstractC3718ArI;
import o.C31351lsQ;
import o.InterfaceC33171mrS;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BuySellTradeType;

/* JADX INFO: renamed from: o.lJh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30030lJh extends android.widget.FrameLayout {
    public boolean EZpvd;
    public final lxK KWHzl;
    public boolean copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.lJh$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BuySellTradeType.values().length];
            try {
                iArr[BuySellTradeType.SELL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[com.okinc.buysell.api.BuySellTradeType.values().length];
            try {
                iArr2[com.okinc.buysell.api.BuySellTradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.okinc.buysell.api.BuySellTradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30030lJh(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromResultScreen(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:57) call: o.lJh.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30030lJh(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30030lJh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = (lxK) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C31351lsQ.ActionBar.fdOvFl, this, true);
    }

    public final void setData(@NotNull final C3682AqZ c3682AqZ, boolean z) {
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        this.copydefault = z;
        this.EZpvd = C30041lJs.EZpvd.AEQbTJ(c3682AqZ);
        AbstractC3718ArI abstractC3718ArIZuBGHE = c3682AqZ.zuBGHE();
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.StateListAnimator.INSTANCE)) {
            EZpvd();
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.PendingIntent.INSTANCE)) {
            if (c3682AqZ.valueOf() == ChannelCategoryCode.THIRD_PARTY.getCode()) {
                if (c3682AqZ.AxsJAY() && c3682AqZ.values().length() > 0) {
                    lxK lxk = this.KWHzl;
                    lxk.AYXKKw.setVisibility(0);
                    lxk.AEQbTJ.setVisibility(8);
                    C52794wYp c52794wYp = lxk.valueOf;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c52794wYp.setText(C33069mpW.KWHzl(context, C31351lsQ.Activity.DSiOMJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("thirdparty", c3682AqZ.isConnected()))));
                    lxk.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lJj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30030lJh.setData$lambda$3$lambda$2$lambda$1(this.copydefault, c3682AqZ, view);
                        }
                    });
                    return;
                }
                EZpvd();
                return;
            }
            EZpvd();
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.ActionBar.INSTANCE)) {
            if (c3682AqZ.valueOf() == ChannelCategoryCode.THIRD_PARTY.getCode()) {
                if (!c3682AqZ.AxsJAY() || c3682AqZ.values().length() <= 0) {
                    return;
                }
                lxK lxk2 = this.KWHzl;
                lxk2.AYXKKw.setVisibility(0);
                lxk2.AEQbTJ.setVisibility(8);
                C52794wYp c52794wYp2 = lxk2.valueOf;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c52794wYp2.setText(C33069mpW.KWHzl(context2, C31351lsQ.Activity.DSiOMJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("thirdparty", c3682AqZ.isConnected()))));
                lxk2.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lJp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30030lJh.setData$lambda$5$lambda$4(this.KWHzl, c3682AqZ, view);
                    }
                });
                return;
            }
            if (c3682AqZ.valueOf() == ChannelCategoryCode.NATIVE.getCode()) {
                lxK lxk3 = this.KWHzl;
                final C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
                if (c3686AqdAkhnZx != null) {
                    lxk3.AYXKKw.setVisibility(8);
                    lxk3.AEQbTJ.setVisibility(8);
                    lxk3.AhwBna.setVisibility(0);
                    lxk3.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.lJn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30030lJh.setData$lambda$12$lambda$8$lambda$7(c3682AqZ, c3686AqdAkhnZx, view);
                        }
                    });
                    return;
                }
                lxk3.AYXKKw.setVisibility(0);
                lxk3.AEQbTJ.setVisibility(8);
                lxk3.AhwBna.setVisibility(8);
                lxk3.valueOf.setText(getContext().getString(C31351lsQ.Activity.OHqIaq));
                lxk3.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lJm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) throws java.io.IOException {
                        C30030lJh.setData$lambda$12$lambda$11$lambda$10(this.OLrzqt, view);
                    }
                });
                return;
            }
            EZpvd();
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.Activity.INSTANCE)) {
            if (c3682AqZ.DTwDnp()) {
                C3687Aqe c3687AqeGEmmrt = c3682AqZ.gEmmrt();
                java.lang.Integer numValueOf = c3687AqeGEmmrt != null ? java.lang.Integer.valueOf(c3687AqeGEmmrt.valueOf()) : null;
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    EZpvd();
                    return;
                }
                if ((numValueOf != null && numValueOf.intValue() == -1) || ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == -3) || (numValueOf != null && numValueOf.intValue() == -2)))) {
                    this.KWHzl.AEQbTJ.setVisibility(0);
                    this.KWHzl.AYXKKw.setVisibility(8);
                    this.KWHzl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lJl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            this.copydefault.KWHzl();
                        }
                    });
                    this.KWHzl.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.lJo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            this.copydefault.copydefault(c3682AqZ);
                        }
                    });
                    return;
                }
                EZpvd();
                return;
            }
            EZpvd();
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.LoaderManager.INSTANCE)) {
            EZpvd();
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.Application.INSTANCE)) {
            this.KWHzl.AEQbTJ.setVisibility(8);
            this.KWHzl.AYXKKw.setVisibility(8);
        } else if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.TaskDescription.INSTANCE)) {
            EZpvd();
        } else {
            if (!(abstractC3718ArIZuBGHE instanceof AbstractC3718ArI.Dialog)) {
                throw new NoWhenBranchMatchedException();
            }
            EZpvd();
        }
    }

    public static final void setData$lambda$3$lambda$2$lambda$1(C30030lJh c30030lJh, C3682AqZ c3682AqZ, android.view.View view) {
        c30030lJh.KWHzl(c3682AqZ.values());
    }

    public static final void setData$lambda$5$lambda$4(C30030lJh c30030lJh, C3682AqZ c3682AqZ, android.view.View view) {
        c30030lJh.KWHzl(c3682AqZ.values());
    }

    public static final void setData$lambda$12$lambda$8$lambda$7(C3682AqZ c3682AqZ, C3686Aqd c3686Aqd, android.view.View view) {
        TargetTab targetTab;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity != null) {
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
            OKPaymentSource oKPaymentSource = OKPaymentSource.PAYMENT_INTERNAL_FLOW;
            if (Application.KWHzl[c3682AqZ.ORxRYg().ordinal()] == 1) {
                targetTab = TargetTab.SELL;
            } else {
                targetTab = TargetTab.BUY;
            }
            InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default(interfaceC47251tmX, fragmentActivity, new BuySellConvertParameters(oKPaymentSource, targetTab, null, null, null, null, null, null, new DexTokenParameters("", c3686Aqd.AkhnZx()), 252, null), null, 4, null);
        }
    }

    public static final void setData$lambda$12$lambda$11$lambda$10(C30030lJh c30030lJh, android.view.View view) throws java.io.IOException {
        InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class);
        android.content.Context context = c30030lJh.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ChatBotRequest chatBotRequest = new ChatBotRequest();
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("buy_sell_start", "payments_buysell_help");
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        chatBotRequest.setGreetingAda("63f32047ec578d5fc52e55e1");
        chatBotRequest.setContextualBot(str);
        chatBotRequest.setOkaFrom(str2);
        chatBotRequest.setOkaChatbotMessage("payments_ogps");
        Unit unit = Unit.INSTANCE;
        interfaceC6804aWL.copydefault(context, chatBotRequest);
    }

    public final void KWHzl(@NotNull final android.content.Context context, @NotNull final CoroutineScope coroutineScope, @NotNull final SupportService supportService, @NotNull final C3682AqZ c3682AqZ, final com.okinc.buysell.api.BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(supportService, "");
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        this.KWHzl.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30030lJh.AEQbTJ(coroutineScope, c3682AqZ, buySellTradeType, supportService, context, view);
            }
        });
    }

    public static final void AEQbTJ(CoroutineScope coroutineScope, final C3682AqZ c3682AqZ, final com.okinc.buysell.api.BuySellTradeType buySellTradeType, SupportService supportService, android.content.Context context, android.view.View view) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FiatPayment_ContactSupport_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30030lJh.OLrzqt(c3682AqZ, buySellTradeType, (EventParamsList) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2(supportService, context, null), 3, null);
    }

    public static final Unit OLrzqt(C3682AqZ c3682AqZ, com.okinc.buysell.api.BuySellTradeType buySellTradeType, EventParamsList eventParamsList) {
        java.lang.String type = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", "transaction_details_page", false, 4, null);
        EventParamsList.put$default(eventParamsList, "deposit_platform_code", c3682AqZ.fetchVPNInfo(), false, 4, null);
        int i = buySellTradeType == null ? -1 : Application.AEQbTJ[buySellTradeType.ordinal()];
        if (i == 1) {
            type = TradeType.BUY.getType();
        } else if (i == 2) {
            type = TradeType.SELL.getType();
        }
        EventParamsList.put$default(eventParamsList, "trade_type", type, false, 4, null);
        EventParamsList.put$default(eventParamsList, "error_code", c3682AqZ.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", c3682AqZ.gHZMYf(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(C3682AqZ c3682AqZ) {
        java.lang.String strKWHzl;
        java.lang.String strEZpvd;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity != null) {
            C3687Aqe c3687AqeGEmmrt = c3682AqZ.gEmmrt();
            if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
                InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), fragmentActivity, new BuySellConvertParameters(OKPaymentSource.UNKNOWN_SOURCE, TargetTab.CONVERT, null, null, null, (c3687AqeGEmmrt == null || (strKWHzl = c3687AqeGEmmrt.KWHzl()) == null) ? "" : strKWHzl, null, (c3687AqeGEmmrt == null || (strEZpvd = c3687AqeGEmmrt.EZpvd()) == null) ? "" : strEZpvd, null, 348, null), null, 4, null);
                return;
            }
            ((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class)).KWHzl(fragmentActivity, BSCTargetTab.CONVERT);
        }
    }

    public final void KWHzl() {
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("portfolio_source", LitePortfolioSourceEnum.BUY_SUCCESS);
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            bundle.putParcelable("tab_type", LiteNavigationTabEnum.LITE_PORTFOLIO);
            Unit unit = Unit.INSTANCE;
            InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, 2, false, 0, bundle, null, 32, null);
            return;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("path", "main/account");
            bundle2.putString(OtcRouteConst.MAIN_ROUTE_NAV, "funding_account");
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(activityAEQbTJ, bundle2);
        }
    }

    public final void AEQbTJ() {
        LiteNavigationTabEnum liteNavigationTabEnum;
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
            if (Intrinsics.EZpvd(((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).KWHzl(), AbstractC33240msi.ActionBar.EZpvd)) {
                liteNavigationTabEnum = LiteNavigationTabEnum.ACTIVITY;
            } else {
                liteNavigationTabEnum = LiteNavigationTabEnum.LITE_SIMPLE_ACTIVITY;
            }
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tab_type", liteNavigationTabEnum);
            Unit unit = Unit.INSTANCE;
            InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, 2, false, 0, bundle, null, 32, null);
            return;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("path", "main/account");
            bundle2.putString(OtcRouteConst.MAIN_ROUTE_NAV, "funding_account");
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(activityAEQbTJ, bundle2);
        }
    }

    public final void KWHzl(java.lang.String str) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, C35334ntP.KWHzl(context), bundleBundleOf, null, 4, null);
    }

    public final void EZpvd() {
        lxK lxk = this.KWHzl;
        if (lxk != null) {
            lxk.AEQbTJ.setVisibility(8);
            lxk.AYXKKw.setVisibility(8);
        }
        if (this.EZpvd) {
            return;
        }
        copydefault();
    }

    public final void copydefault() {
        lxK lxk = this.KWHzl;
        if (lxk != null) {
            if (this.copydefault) {
                if (!((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).OLrzqt(OKComplianceRestrictionService.Feature.NEW_ONSHORE_IA)) {
                    lxk.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.zYHWMc));
                    lxk.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lJg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30030lJh.copydefault(this.EZpvd, view);
                        }
                    });
                } else {
                    lxk.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DarRvM));
                    lxk.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lJi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30030lJh.AhwBna(this.AEQbTJ, view);
                        }
                    });
                }
                lxk.OLrzqt.setVisibility(0);
                return;
            }
            lxk.OLrzqt.setVisibility(8);
        }
    }

    public static final void copydefault(C30030lJh c30030lJh, android.view.View view) {
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_ToActivity_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        c30030lJh.AEQbTJ();
    }

    public static final void AhwBna(C30030lJh c30030lJh, android.view.View view) {
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_ToPortfolio_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        c30030lJh.KWHzl();
    }

    /* JADX INFO: renamed from: o.lJh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lJh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}

package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.collection.ArrayMapKt;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SwapBottomParamsBean;
import com.okinc.business.dexui.main.dappredirect.DAppRedirectFrom;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment;
import com.okinc.business.dexui.main.swap.trade.TriggeredFrom;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet;
import com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC30561ldV;
import o.C23274hvD;
import o.InterfaceC30608leP;
import o.InterfaceC30639leu;
import o.InterfaceC54855xXv;
import o.xWO;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.les, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30637les implements InterfaceC30641lew {
    public final androidx.fragment.app.Fragment EZpvd;
    public final InterfaceC30608leP copydefault;

    /* JADX INFO: renamed from: o.les$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedOrderType.values().length];
            try {
                iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.Fragment EZpvd() {
        return this.EZpvd;
    }

    public C30637les(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC30608leP interfaceC30608leP) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC30608leP, "");
        this.EZpvd = fragment;
        this.copydefault = interfaceC30608leP;
    }

    @Override // o.InterfaceC30641lew
    public void KWHzl(@NotNull InterfaceC30639leu interfaceC30639leu) {
        Intrinsics.checkNotNullParameter(interfaceC30639leu, "");
        if (interfaceC30639leu instanceof InterfaceC30639leu.PictureInPictureParams) {
            InterfaceC30639leu.PictureInPictureParams pictureInPictureParams = (InterfaceC30639leu.PictureInPictureParams) interfaceC30639leu;
            copydefault(pictureInPictureParams.copydefault(), pictureInPictureParams.EZpvd());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.SharedElementCallback) {
            InterfaceC30639leu.SharedElementCallback sharedElementCallback = (InterfaceC30639leu.SharedElementCallback) interfaceC30639leu;
            KWHzl(sharedElementCallback.KWHzl(), sharedElementCallback.copydefault());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.TaskStackBuilder) {
            InterfaceC30639leu.TaskStackBuilder taskStackBuilder = (InterfaceC30639leu.TaskStackBuilder) interfaceC30639leu;
            KWHzl(taskStackBuilder.KWHzl(), taskStackBuilder.OLrzqt(), taskStackBuilder.AEQbTJ());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.ActionBar) {
            copydefault(((InterfaceC30639leu.ActionBar) interfaceC30639leu).copydefault());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.ComponentCallbacks) {
            AEQbTJ(((InterfaceC30639leu.ComponentCallbacks) interfaceC30639leu).KWHzl());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.AssistContent) {
            InterfaceC30639leu.AssistContent assistContent = (InterfaceC30639leu.AssistContent) interfaceC30639leu;
            KWHzl(assistContent.AEQbTJ(), assistContent.KWHzl(), assistContent.OLrzqt());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.VoiceInteractor) {
            OLrzqt(((InterfaceC30639leu.VoiceInteractor) interfaceC30639leu).AEQbTJ());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.StateListAnimator) {
            InterfaceC30639leu.StateListAnimator stateListAnimator = (InterfaceC30639leu.StateListAnimator) interfaceC30639leu;
            AEQbTJ(stateListAnimator.EZpvd(), stateListAnimator.copydefault(), stateListAnimator.KWHzl());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.Application) {
            copydefault(((InterfaceC30639leu.Application) interfaceC30639leu).AEQbTJ());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.Dialog) {
            InterfaceC30639leu.Dialog dialog = (InterfaceC30639leu.Dialog) interfaceC30639leu;
            AEQbTJ(dialog.KWHzl(), dialog.AEQbTJ(), dialog.copydefault());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.Activity) {
            InterfaceC30639leu.Activity activity = (InterfaceC30639leu.Activity) interfaceC30639leu;
            copydefault(activity.KWHzl(), activity.copydefault());
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.LoaderManager) {
            AhwBna();
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.Fragment) {
            AYXKKw();
            return;
        }
        if (interfaceC30639leu instanceof InterfaceC30639leu.BroadcastReceiver) {
            InterfaceC30639leu.BroadcastReceiver broadcastReceiver = (InterfaceC30639leu.BroadcastReceiver) interfaceC30639leu;
            EZpvd(broadcastReceiver.EZpvd(), broadcastReceiver.AEQbTJ());
        } else if (interfaceC30639leu instanceof InterfaceC30639leu.PendingIntent) {
            gEmmrt();
        } else if (interfaceC30639leu instanceof InterfaceC30639leu.FragmentManager) {
            djBIcL();
        } else if (interfaceC30639leu instanceof InterfaceC30639leu.TaskDescription) {
            valueOf();
        }
    }

    public final void gEmmrt() {
        C30783lhf c30783lhfCopydefault = C30783lhf.Companion.copydefault();
        androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30783lhfCopydefault.show(childFragmentManager);
        InterfaceC30608leP.ActionBar.trackEvent$default(this.copydefault, AbstractC30561ldV.FragmentManager.KWHzl, null, 2, null);
    }

    public final void djBIcL() {
        C30669lfX c30669lfXCopydefault = C30669lfX.Companion.copydefault();
        androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30669lfXCopydefault.show(childFragmentManager);
    }

    public final void valueOf() {
        C30660lfO c30660lfOAEQbTJ = C30660lfO.Companion.AEQbTJ();
        androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30660lfOAEQbTJ.show(childFragmentManager);
        InterfaceC30608leP.ActionBar.trackEvent$default(this.copydefault, AbstractC30561ldV.LoaderManager.copydefault, null, 2, null);
    }

    public final Unit AYXKKw() {
        Unit unit;
        android.content.Context context = this.EZpvd.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, C33070mpX.AYXKKw(C23274hvD.Fragment.SQPLEi), C33070mpX.AYXKKw(C23274hvD.Fragment.SFHvfSaKzXkR), C23274hvD.Fragment.OcIXYQ);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        InterfaceC30608leP.ActionBar.trackEvent$default(this.copydefault, AbstractC30561ldV.VoiceInteractor.copydefault, null, 2, null);
        return unit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.les */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleValueDiffDialog$default(C30637les c30637les, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c30637les.EZpvd(str, function0);
    }

    public final void EZpvd(java.lang.String str, final Function0<Unit> function0) {
        C24679iiQ c24679iiQKWHzl = C24679iiQ.Companion.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose2), C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnAfter1), (12 & 4) != 0 ? null : str, (12 & 8) != 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C23274hvD.Fragment.getMediaItem), C33070mpX.AYXKKw(C23274hvD.Fragment.ORxRYg), (12 & 64) != 0 ? "" : null, new Function0() { // from class: o.lez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30637les.AEQbTJ(function0);
            }
        }, null, (12 & 512) != 0 ? null : null);
        androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c24679iiQKWHzl.show(childFragmentManager);
    }

    public static final Unit AEQbTJ(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(StateFlow<C30457lbX> stateFlow, Function1<? super java.lang.String, Unit> function1, final Function0<Unit> function0) {
        TradeConfirmOrderSheet.Companion.copydefault(stateFlow, function1, new Function0() { // from class: o.leF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30637les.copydefault(function0);
            }
        }).show(this.EZpvd.getChildFragmentManager(), java.lang.String.valueOf(C56524yIo.AEQbTJ(TradeConfirmOrderSheet.class).valueOf()));
    }

    public static final Unit copydefault(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.les */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showTokensBottomSheet$default(C30637les c30637les, AdvancedTradeType advancedTradeType, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c30637les.copydefault(advancedTradeType, (Function1<? super UIPricingToken, Unit>) function1);
    }

    public static final Unit AEQbTJ(Function1 function1, UIPricingToken uIPricingToken) {
        Intrinsics.checkNotNullParameter(uIPricingToken, "");
        if (function1 != null) {
            function1.invoke(uIPricingToken);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(AdvancedTradeType advancedTradeType, final Function1<? super UIPricingToken, Unit> function1) {
        C30711lgM.Companion.EZpvd(advancedTradeType, new Function1() { // from class: o.leG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30637les.AEQbTJ(function1, (UIPricingToken) obj);
            }
        }).show(this.EZpvd.getChildFragmentManager(), java.lang.String.valueOf(C56524yIo.AEQbTJ(C30711lgM.class).valueOf()));
    }

    public final void KWHzl(java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null || dexMultiTokenInfoBean.getOriginContractAddress().length() == 0) {
            return;
        }
        android.content.Context context = this.EZpvd.getContext();
        if (context != null) {
            C25352ivB.openMarketDetailPage$default(context, str, new TokenBase(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getOriginContractAddress(), dexMultiTokenInfoBean.getTokenLogoUrl(), dexMultiTokenInfoBean.getChainLogoUrl(), dexMultiTokenInfoBean.getChainBWLogoUrl(), dexMultiTokenInfoBean.getTokenSymbol(), dexMultiTokenInfoBean.getTokenName(), -1, 0, 0, 0, null, "view_details", null, "type_cefi", dexMultiTokenInfoBean.getChainName(), null, 0, 0, false, null, null, false, true, null, null, null, 0, false, null, null, false, -8442112, null), "trade_cefi_mode", null, new int[0], 8, null);
        }
    }

    public final void KWHzl(java.lang.String str, boolean z, final Function2<? super DexMultiTokenInfoBean, ? super java.lang.String, Unit> function2) {
        C25632jAp c25632jAp = C25632jAp.KWHzl;
        androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c25632jAp.copydefault(childFragmentManager, new C28385kZl(TradingBizType.Advanced, str, str, !z, true, null, null, null, 224, null), new Function1() { // from class: o.leD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30637les.copydefault(function2, (DexMultiTokenInfoBean) obj);
            }
        });
    }

    public static final Unit copydefault(Function2 function2, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        function2.invoke(dexMultiTokenInfoBean, dexMultiTokenInfoBean.getChainId());
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, int i, AdvancedOrderType advancedOrderType) {
        TriggeredFrom triggeredFrom;
        int i2 = ActionBar.EZpvd[advancedOrderType.ordinal()];
        if (i2 != 1 && i2 == 2) {
            triggeredFrom = TriggeredFrom.AdvancedLimit;
        } else {
            triggeredFrom = TriggeredFrom.AdvancedMarket;
        }
        C24473ieW.Companion.AEQbTJ(str, new SwapBottomParamsBean(true, false, C24695iig.copydefault(str, C22380heK.OLrzqt.copydefault(str).EZpvd(false).gEmmrt().OLrzqt().getValue(), false), false, str, null, null, false, null, null, null, null, false, i, true, null, 40928, null), false, triggeredFrom).show(this.EZpvd.getChildFragmentManager(), C24473ieW.class.getName());
    }

    public final void OLrzqt(ServiceFeeInfo serviceFeeInfo) {
        InterfaceC30608leP.ActionBar.trackEvent$default(this.copydefault, AbstractC30561ldV.AssistContent.KWHzl, null, 2, null);
        if (serviceFeeInfo != null) {
            android.content.Context contextRequireContext = this.EZpvd.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C25404iwA.copydefault(serviceFeeInfo, contextRequireContext);
        }
    }

    public final void copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        android.content.Context context;
        if (dexMultiTokenInfoBean == null || dexMultiTokenInfoBean.getTokenContractAddress().length() == 0 || (context = this.EZpvd.getContext()) == null) {
            return;
        }
        C25352ivB.copydefault(dexMultiTokenInfoBean.getTokenContractAddress());
        C25281itk.Companion.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.playFromMediaId), dexMultiTokenInfoBean.getTokenContractAddress()).AEQbTJ(context);
    }

    public final void AhwBna() {
        android.content.Context context = this.EZpvd.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, C33070mpX.AYXKKw(C23274hvD.Fragment.dzkkkq), C33070mpX.AYXKKw(C23274hvD.Fragment.deregisterUser), C23274hvD.Fragment.QVAiDq);
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
        android.content.Context context;
        if (C23317hvu.values() || (context = this.EZpvd.getContext()) == null) {
            return;
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.DcqEDu, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C23274hvD.Application.setListNavigationCallbacks);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C23274hvD.Application.mutate);
        androidx.collection.ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", str), C56390yDp.OLrzqt("tokenSymbol", str2));
        androidx.collection.ArrayMap arrayMapArrayMapOf2 = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", str), C56390yDp.OLrzqt("symbol", str2));
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        int i = z ? C23274hvD.Fragment.requestExtraBinder : C23274hvD.Fragment.IResultReceiver2Stub;
        if (!z) {
            arrayMapArrayMapOf = arrayMapArrayMapOf2;
        }
        textView.setText(C33069mpW.KWHzl(applicationOLrzqt, i, arrayMapArrayMapOf));
        textView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatMediaControllerImplApi24));
        Intrinsics.copydefault(textView2);
        textView2.setVisibility(0);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) viewInflate.findViewById(C23274hvD.Application.hrjNmC);
        checkBox.setChecked(C23317hvu.values());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.lex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                C30637les.copydefault(compoundButton, z2);
            }
        });
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        Intrinsics.copydefault(viewInflate);
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, viewInflate, 0, 2, null);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(android.widget.CompoundButton compoundButton, boolean z) {
        C23317hvu.AkhnZx(z);
    }

    public final void copydefault(final DexMultiTokenInfoBean dexMultiTokenInfoBean, final DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        final java.lang.String value;
        InterfaceC56387yDm<java.lang.String> interfaceC56387yDmCopydefault;
        if (dexMultiTokenInfoBean == null || dexMultiTokenInfoBean2 == null) {
            return;
        }
        androidx.fragment.app.Fragment fragment = this.EZpvd;
        AdvancedMainFragment advancedMainFragment = fragment instanceof AdvancedMainFragment ? (AdvancedMainFragment) fragment : null;
        if (advancedMainFragment == null || (interfaceC56387yDmCopydefault = C31200lpY.copydefault(advancedMainFragment)) == null || (value = interfaceC56387yDmCopydefault.getValue()) == null) {
            value = "default_trade";
        }
        C21686hIo.AEQbTJ(C22380heK.OLrzqt.copydefault(value).fetchVPNInfo().KWHzl(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean2.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress(), dexMultiTokenInfoBean2.getTokenContractAddress()), false, (Function1<? super hHS, Unit>) new Function1() { // from class: o.ley
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30637les.copydefault(dexMultiTokenInfoBean, value, dexMultiTokenInfoBean2, this, (hHS) obj);
            }
        });
    }

    public static final Unit copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean2, C30637les c30637les, hHS hhs) {
        Intrinsics.checkNotNullParameter(hhs, "");
        DexDappRedirectListFragment.Activity activity = DexDappRedirectListFragment.Companion;
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        DexDappRedirectListFragment.Activity.newInstance$default(activity, null, C24632ihW.copydefault(dexMultiTokenInfoBean, c22825hmf.EZpvd(str, dexMultiTokenInfoBean.getChainId(), true), false), C24632ihW.copydefault(dexMultiTokenInfoBean2, c22825hmf.EZpvd(str, dexMultiTokenInfoBean2.getChainId(), true), false), DAppRedirectFrom.SWAP, hhs, new Function0() { // from class: o.leA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30637les.OLrzqt();
            }
        }, new Function0() { // from class: o.leB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30637les.copydefault();
            }
        }, str, null, 0, 0, 1792, null).show(c30637les.EZpvd.getChildFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z) {
        java.util.List listAhwBna;
        xWO xwo = (xWO) C43251rlk.copydefault(xWO.class);
        androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        if (z) {
            listAhwBna = yDY.gEmmrt(UnsupportedWalletType.HardwareWallet, UnsupportedWalletType.MPCWallet, UnsupportedWalletType.PrivateKeyWallet);
        } else {
            listAhwBna = yDY.AhwBna();
        }
        xWO.ActionBar.showConnectWalletDialog$default(xwo, childFragmentManager, new Activity(), (java.util.List) null, listAhwBna, (InterfaceC54856xXw) null, 20, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.les$Activity */
    public static final class Activity implements InterfaceC54859xXz {
        public Activity() {
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            androidx.fragment.app.Fragment fragmentEZpvd = C30637les.this.EZpvd();
            AdvancedMainFragment advancedMainFragment = fragmentEZpvd instanceof AdvancedMainFragment ? (AdvancedMainFragment) fragmentEZpvd : null;
            if (advancedMainFragment != null) {
                advancedMainFragment.KWHzl(true);
            }
        }
    }

    public final void AEQbTJ(final java.lang.String str) {
        xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
        androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, childFragmentManager, new CurrentWalletSwitchConfig(null, new CurrentWalletSwitchNetworkMode.SingleNetwork(C33129mqd.valueOf(str)), C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s), null, null, 0, null, null, 249, null), new Function2() { // from class: o.leE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C30637les.KWHzl(str, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new StateListAnimator(), 8, null);
    }

    public static final boolean KWHzl(java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.getFieldNames() || !interfaceC9738bbJ.AkhnZx(C33129mqd.valueOf(str))) ? false : true;
    }

    /* JADX INFO: renamed from: o.les$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54855xXv {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            androidx.fragment.app.Fragment fragmentEZpvd = C30637les.this.EZpvd();
            AdvancedMainFragment advancedMainFragment = fragmentEZpvd instanceof AdvancedMainFragment ? (AdvancedMainFragment) fragmentEZpvd : null;
            if (advancedMainFragment != null) {
                advancedMainFragment.KWHzl(true);
            }
        }
    }
}

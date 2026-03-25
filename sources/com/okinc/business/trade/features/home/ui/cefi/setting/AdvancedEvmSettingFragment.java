package com.okinc.business.trade.features.home.ui.cefi.setting;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityParam;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.SlippageSelectionBean;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.mev.MevRouteParam;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedCustomMevPresetVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData;
import com.okinc.business.trade.features.home.ui.cefi.data.PriorityFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC30855liy;
import o.C23272hvB;
import o.C23274hvD;
import o.C23430hyA;
import o.C25299iuB;
import o.C25308iuK;
import o.C25337iun;
import o.C25390ivn;
import o.C30563ldX;
import o.C30565ldZ;
import o.C30622led;
import o.C30807liC;
import o.C30823liS;
import o.C30824liT;
import o.C31200lpY;
import o.C31256lqb;
import o.C33070mpX;
import o.C33129mqd;
import o.C52794wYp;
import o.C55001xbh;
import o.C55008xbo;
import o.C55296xhK;
import o.C55298xhM;
import o.C56392yDr;
import o.C56424yEw;
import o.C56524yIo;
import o.C59541ziw;
import o.InterfaceC25348iuy;
import o.InterfaceC30614leV;
import o.InterfaceC30853liw;
import o.InterfaceC56387yDm;
import o.InterfaceC59496ziD;
import o.pUU;
import o.rVN;
import o.wYF;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AdvancedEvmSettingFragment extends AbstractC30855liy<C23430hyA> {
    public AdvancedPriorityFeeType EZpvd;
    public PresetRouteType KWHzl;
    public AdvancedSettingsContract.Input OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public InterfaceC30853liw djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    @yCM
    public InterfaceC30614leV settingsTracker;
    public final InterfaceC56387yDm valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedEvmSettingFragment OLrzqt(@NotNull InterfaceC30853liw interfaceC30853liw) {
        Intrinsics.checkNotNullParameter(interfaceC30853liw, "");
        this.djBIcL = interfaceC30853liw;
        return this;
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C23430hyA KWHzl(AdvancedEvmSettingFragment advancedEvmSettingFragment) {
        return (C23430hyA) advancedEvmSettingFragment.fARcdN();
    }

    public AdvancedEvmSettingFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedCustomMevPresetVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.lhR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedEvmSettingFragment.DbNXlk(this.copydefault);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.lhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedEvmSettingFragment.AuCTel(this.copydefault);
            }
        });
        this.KWHzl = PresetRouteType.RouteTypeAuto;
        this.EZpvd = AdvancedPriorityFeeType.Market;
    }

    public final AdvancedCustomMevPresetVM AEQbTJ() {
        return (AdvancedCustomMevPresetVM) this.copydefault.getValue();
    }

    /* JADX DEBUG: Possible override for method o.liy.KWHzl()V */
    public final InterfaceC30614leV KWHzl() {
        InterfaceC30614leV interfaceC30614leV = this.settingsTracker;
        if (interfaceC30614leV != null) {
            return interfaceC30614leV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final DexMultiTokenInfoBean iwGUEr() {
        return (DexMultiTokenInfoBean) this.gEmmrt.getValue();
    }

    public static final DexMultiTokenInfoBean DbNXlk(AdvancedEvmSettingFragment advancedEvmSettingFragment) {
        return advancedEvmSettingFragment.AEQbTJ().OLrzqt();
    }

    private final PriorityFeeInfo getNewProxyInstance() {
        return (PriorityFeeInfo) this.valueOf.getValue();
    }

    public static final PriorityFeeInfo AuCTel(AdvancedEvmSettingFragment advancedEvmSettingFragment) {
        return advancedEvmSettingFragment.AEQbTJ().AEQbTJ();
    }

    public static final class TaskDescription implements TextWatcher {
        public final /* synthetic */ AdvancedEvmSettingFragment KWHzl;
        public final /* synthetic */ C55001xbh copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(C55001xbh c55001xbh, AdvancedEvmSettingFragment advancedEvmSettingFragment) {
            this.copydefault = c55001xbh;
            this.KWHzl = advancedEvmSettingFragment;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C30807liC c30807liC;
            C23430hyA c23430hyAKWHzl;
            C30807liC c30807liC2;
            String strIsConnected = this.copydefault.isConnected();
            if (C33129mqd.OLrzqt((CharSequence) strIsConnected) && (c23430hyAKWHzl = AdvancedEvmSettingFragment.KWHzl(this.KWHzl)) != null && (c30807liC2 = c23430hyAKWHzl.EZpvd) != null) {
                c30807liC2.OLrzqt(this.KWHzl.AEQbTJ().djBIcL(), strIsConnected);
            }
            C23430hyA c23430hyAKWHzl2 = AdvancedEvmSettingFragment.KWHzl(this.KWHzl);
            if (c23430hyAKWHzl2 != null && (c30807liC = c23430hyAKWHzl2.EZpvd) != null) {
                c30807liC.setPriorityMessageStyle(strIsConnected);
            }
            pUU.copydefault("MemeMevCustomPresetFragment", "okInputFieldCustomPriority listener event: isCustom: true\n>>>>priorityFee: " + strIsConnected);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AdvancedEvmSettingFragment copydefault(@NotNull AdvancedSettingsContract.Input input) {
            Intrinsics.checkNotNullParameter(input, "");
            AdvancedEvmSettingFragment advancedEvmSettingFragment = new AdvancedEvmSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", input);
            C31200lpY.EZpvd(bundle, input.getSourceType());
            advancedEvmSettingFragment.setArguments(bundle);
            return advancedEvmSettingFragment;
        }
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        AdvancedSettingsContract.Input input;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (input = (AdvancedSettingsContract.Input) ((Parcelable) BundleCompat.getParcelable(arguments, "data", AdvancedSettingsContract.Input.class))) != null) {
            this.OLrzqt = input;
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        wYF wyf;
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA == null || (wyf = c23430hyA.OLrzqt) == null) {
            return;
        }
        wyf.setType(14);
        wyf.setOKDSSize(52);
        ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        Context context = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) layoutParams, C55298xhM.copydefault(8.0f, context));
        ViewGroup.LayoutParams layoutParams2 = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        Context context2 = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2, C55298xhM.copydefault(8.0f, context2));
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.DGgnkA));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setContentDescription("web3_dex_trade_setting_confirm_button");
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.lhT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AdvancedEvmSettingFragment.KWHzl(this.KWHzl, view);
                }
            });
        }
        copydefault(wyf);
    }

    public static final void KWHzl(AdvancedEvmSettingFragment advancedEvmSettingFragment, View view) {
        AdvancedSettingsContract.Input input = advancedEvmSettingFragment.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedSettingsContract.Input input3 = advancedEvmSettingFragment.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        input3.setRouterModeType(advancedEvmSettingFragment.AEQbTJ().AhwBna());
        input.setPriorityValue(advancedEvmSettingFragment.AEQbTJ().gEmmrt().getValue().OLrzqt());
        input.setSlippageValue(advancedEvmSettingFragment.AEQbTJ().AYXKKw().getValue());
        input.setSlippageFeeType(advancedEvmSettingFragment.AEQbTJ().values());
        input.setPriorityFeeType(advancedEvmSettingFragment.AEQbTJ().djBIcL());
        input.setSlippageMode(advancedEvmSettingFragment.AEQbTJ().fetchVPNInfo());
        input.setMaxSlippage(advancedEvmSettingFragment.AEQbTJ().copydefault());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = advancedEvmSettingFragment.AEQbTJ();
        AdvancedSettingsContract.Input input4 = advancedEvmSettingFragment.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        AdvancedQuoteUiData quoteData = input4.getQuoteData();
        AdvancedSettingsContract.Input input5 = advancedEvmSettingFragment.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        String estimateGasFee = input5.getEstimateGasFee();
        AdvancedSettingsContract.Input input6 = advancedEvmSettingFragment.OLrzqt;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        input.setTotalFee(advancedCustomMevPresetVMAEQbTJ.copydefault(quoteData, estimateGasFee, input6.getPerTokenUsd()));
        InterfaceC30853liw interfaceC30853liw = advancedEvmSettingFragment.djBIcL;
        if (interfaceC30853liw != null) {
            AdvancedSettingsContract.Input input7 = advancedEvmSettingFragment.OLrzqt;
            if (input7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input7;
            }
            interfaceC30853liw.KWHzl(input2);
        }
        advancedEvmSettingFragment.fetchVPNInfo();
    }

    public final void copydefault(wYF wyf) {
        AdvancedSettingsContract.Input input = this.OLrzqt;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        if (input.getSupportReset()) {
            wyf.setSecondaryText(getString(C23274hvD.Fragment.hDKMBd));
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOKDSType(260);
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setOnClickListener(new Activity(c52794wYpAEQbTJ2, 1000L, this));
                return;
            }
            return;
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags));
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ4 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ4 != null) {
            c52794wYpAEQbTJ4.setOnClickListener(new View.OnClickListener() { // from class: o.lhP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AdvancedEvmSettingFragment.AEQbTJ(this.copydefault, view);
                }
            });
        }
    }

    public static final void AEQbTJ(AdvancedEvmSettingFragment advancedEvmSettingFragment, View view) {
        FragmentActivity activity = advancedEvmSettingFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        C25299iuB c25299iuB;
        C25299iuB c25299iuB2;
        C25337iun c25337iun;
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        PresetRouteType presetRouteType = !input.getTradeMode().isCopyTrading() ? PresetRouteType.RouteTypeAuto : this.KWHzl;
        AEQbTJ().KWHzl(presetRouteType.getValue());
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        if (!input3.getTradeMode().isCopyTrading()) {
            EZpvd(presetRouteType.getValue());
        } else {
            AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
            AdvancedSettingsContract.Input input4 = this.OLrzqt;
            if (input4 == null) {
                Intrinsics.gEmmrt("");
                input4 = null;
            }
            boolean zOLrzqt = advancedCustomMevPresetVMAEQbTJ.OLrzqt(input4.getQuoteData());
            AdvancedSettingsContract.Input input5 = this.OLrzqt;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
                input5 = null;
            }
            AdvancedMainConfig config = input5.getConfig();
            boolean supportAutoMode = config != null ? config.getSupportAutoMode() : false;
            C23430hyA c23430hyA = (C23430hyA) fARcdN();
            if (c23430hyA != null && (c25299iuB = c23430hyA.copydefault) != null) {
                AdvancedSettingsContract.Input input6 = this.OLrzqt;
                if (input6 == null) {
                    Intrinsics.gEmmrt("");
                    input6 = null;
                }
                c25299iuB.setData(new MevSimpleParam(input6.getTradeMode(), supportAutoMode, zOLrzqt, null, 8, null));
            }
        }
        AdvancedSettingsContract.Input input7 = this.OLrzqt;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        AdvancedMainConfig config2 = input7.getConfig();
        boolean supportAutoMode2 = config2 != null ? config2.getSupportAutoMode() : false;
        C23430hyA c23430hyA2 = (C23430hyA) fARcdN();
        if (c23430hyA2 != null && (c25337iun = c23430hyA2.KWHzl) != null) {
            AdvancedSettingsContract.Input input8 = this.OLrzqt;
            if (input8 == null) {
                Intrinsics.gEmmrt("");
                input8 = null;
            }
            c25337iun.setVisibility((input8.getTradeMode().isCopyTrading() || !supportAutoMode2) ? 8 : 0);
        }
        C23430hyA c23430hyA3 = (C23430hyA) fARcdN();
        if (c23430hyA3 == null || (c25299iuB2 = c23430hyA3.copydefault) == null) {
            return;
        }
        AdvancedSettingsContract.Input input9 = this.OLrzqt;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input9;
        }
        c25299iuB2.setVisibility(input2.getTradeMode().isCopyTrading() ? 0 : 8);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ AdvancedEvmSettingFragment OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, AdvancedEvmSettingFragment advancedEvmSettingFragment) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = advancedEvmSettingFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.valueOf();
                this.OLrzqt.AkhnZx();
                this.OLrzqt.AYXKKw();
                AdvancedEvmSettingFragment.trackSettingsPageClick$default(this.OLrzqt, DexTrackEventParameter.ButtonName.RESET.getValue(), DexTrackEventParameter.ButtonType.TRADE.getValue(), null, 4, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        int slippageFeeType;
        C25308iuK c25308iuK;
        C55008xbo c55008xboEZpvd;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboAEQbTJ;
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA != null && (c25308iuK2 = c23430hyA.AYXKKw) != null && (c55008xboAEQbTJ = c25308iuK2.AEQbTJ()) != null) {
            c55008xboAEQbTJ.setText("");
        }
        C23430hyA c23430hyA2 = (C23430hyA) fARcdN();
        if (c23430hyA2 != null && (c25308iuK = c23430hyA2.AYXKKw) != null && (c55008xboEZpvd = c25308iuK.EZpvd()) != null) {
            c55008xboEZpvd.setText("");
        }
        AdvancedSettingsContract.Input input = this.OLrzqt;
        String maxSlippage = null;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        SlippageMode slippageMode = !input.getTradeMode().isCopyTrading() ? SlippageMode.Dynamic : SlippageMode.Fixed;
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        input3.setSlippageMode(slippageMode);
        AEQbTJ().OLrzqt(slippageMode);
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        if (input4.getTradeMode().isCopyTrading()) {
            AdvancedSettingsContract.Input input5 = this.OLrzqt;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
                input5 = null;
            }
            slippageFeeType = input5.getSlippageFeeType();
        } else {
            slippageFeeType = AdvancedSlippageType.Auto.getValue();
        }
        advancedCustomMevPresetVMAEQbTJ.KWHzl(slippageFeeType);
        AdvancedSettingsContract.Input input6 = this.OLrzqt;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        if (!input6.getTradeMode().isCopyTrading()) {
            AEQbTJ().copydefault(OLrzqt());
        }
        AdvancedSettingsContract.Input input7 = this.OLrzqt;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        if (input7.getTradeMode().isCopyTrading()) {
            AdvancedSettingsContract.Input input8 = this.OLrzqt;
            if (input8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input8;
            }
            maxSlippage = input2.getMaxSlippage();
        }
        OLrzqt(slippageMode, maxSlippage);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        int value;
        C30807liC c30807liC;
        C55001xbh c55001xbhAEQbTJ;
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA != null && (c30807liC = c23430hyA.EZpvd) != null && (c55001xbhAEQbTJ = c30807liC.AEQbTJ()) != null) {
            c55001xbhAEQbTJ.setText("");
        }
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        if (!input.getTradeMode().isCopyTrading()) {
            value = AdvancedPriorityFeeType.Market.getValue();
        } else {
            value = this.EZpvd.getValue();
        }
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        input3.setPriorityFeeType(value);
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ2 = AEQbTJ();
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        advancedCustomMevPresetVMAEQbTJ.EZpvd(new PriorityParam(advancedCustomMevPresetVMAEQbTJ2.EZpvd(value, input4.getQuoteData()), value, false, 4, (DefaultConstructorMarker) null));
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ3 = AEQbTJ();
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        advancedCustomMevPresetVMAEQbTJ3.copydefault(value, input2.getQuoteData());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        DexAutoSlippageInfoParam dexAutoSlippageInfoParamCopydefault;
        C30807liC c30807liC;
        C30807liC c30807liC2;
        C25308iuK c25308iuK;
        C55001xbh c55001xbhAEQbTJ = null;
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(AEQbTJ().AYXKKw(), AEQbTJ().gEmmrt(), AEQbTJ().valueOf(), new AdvancedEvmSettingFragment$initListener$1(null)), null, new StateListAnimator(), 2, null);
        C30824liT c30824liT = new C30824liT(AEQbTJ());
        AdvancedSettingsContract.Input input = this.OLrzqt;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        AdvancedSettingsContract.Input input2 = this.OLrzqt;
        if (input2 == null) {
            Intrinsics.gEmmrt("");
            input2 = null;
        }
        AutoSlippageInfo autoSlippageInfo = input2.getAutoSlippageInfo();
        if (autoSlippageInfo != null) {
            AdvancedSettingsContract.Input input3 = this.OLrzqt;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
                input3 = null;
            }
            int type = input3.getSlippageMode().getType();
            AdvancedSettingsContract.Input input4 = this.OLrzqt;
            if (input4 == null) {
                Intrinsics.gEmmrt("");
                input4 = null;
            }
            dexAutoSlippageInfoParamCopydefault = C30622led.copydefault(autoSlippageInfo, type, input4.getSlippageValue());
        } else {
            dexAutoSlippageInfoParamCopydefault = null;
        }
        c30824liT.EZpvd(quoteData, dexAutoSlippageInfoParamCopydefault);
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA != null && (c25308iuK = c23430hyA.AYXKKw) != null) {
            c25308iuK.setListener(c30824liT);
        }
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().isConnected(), null, new ActionBar(), 2, null);
        C23430hyA c23430hyA2 = (C23430hyA) fARcdN();
        if (c23430hyA2 != null && (c30807liC2 = c23430hyA2.EZpvd) != null) {
            c30807liC2.setFeeValueCallback(new Function1() { // from class: o.lhL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedEvmSettingFragment.EZpvd(this.AEQbTJ, (PriorityParam) obj);
                }
            });
        }
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().DbNXlk(), null, new Dialog(), 2, null);
        C23430hyA c23430hyA3 = (C23430hyA) fARcdN();
        if (c23430hyA3 != null && (c30807liC = c23430hyA3.EZpvd) != null) {
            c55001xbhAEQbTJ = c30807liC.AEQbTJ();
        }
        if (c55001xbhAEQbTJ != null) {
            c55001xbhAEQbTJ.addTextChangedListener(new TaskDescription(c55001xbhAEQbTJ, this));
        }
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().EZpvd(), null, new LoaderManager(), 2, null);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, this, new InterfaceC59496ziD() { // from class: o.lhU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                AdvancedEvmSettingFragment.EZpvd(this.AEQbTJ, z);
            }
        });
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Triple<String, C30563ldX, ? extends SlippageMode> triple, Continuation<? super Unit> continuation) {
            boolean z;
            wYF wyf;
            C52794wYp c52794wYpCopydefault;
            String strComponent1 = triple.component1();
            C30563ldX c30563ldXComponent2 = triple.component2();
            SlippageMode slippageModeComponent3 = triple.component3();
            boolean z2 = false;
            if (C30565ldZ.EZpvd(strComponent1)) {
                z = true;
            } else {
                if (slippageModeComponent3 == SlippageMode.Dynamic) {
                    AdvancedSettingsContract.Input input = AdvancedEvmSettingFragment.this.OLrzqt;
                    if (input == null) {
                        Intrinsics.gEmmrt("");
                        input = null;
                    }
                    if (input.getQuoteData() == null) {
                    }
                }
                z = false;
            }
            C23430hyA c23430hyAKWHzl = AdvancedEvmSettingFragment.KWHzl(AdvancedEvmSettingFragment.this);
            if (c23430hyAKWHzl != null && (wyf = c23430hyAKWHzl.OLrzqt) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                if (z && c30563ldXComponent2.KWHzl()) {
                    z2 = true;
                }
                c52794wYpCopydefault.setEnabled(z2);
            }
            AdvancedEvmSettingFragment.this.uzCIH();
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SlippageSelectionBean> list, Continuation<? super Unit> continuation) {
            AdvancedEvmSettingFragment advancedEvmSettingFragment = AdvancedEvmSettingFragment.this;
            AdvancedSettingsContract.Input input = advancedEvmSettingFragment.OLrzqt;
            AdvancedSettingsContract.Input input2 = null;
            if (input == null) {
                Intrinsics.gEmmrt("");
                input = null;
            }
            SlippageMode slippageMode = input.getSlippageMode();
            AdvancedSettingsContract.Input input3 = AdvancedEvmSettingFragment.this.OLrzqt;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input3;
            }
            advancedEvmSettingFragment.OLrzqt(slippageMode, input2.getMaxSlippage());
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(AdvancedEvmSettingFragment advancedEvmSettingFragment, PriorityParam priorityParam) {
        Intrinsics.checkNotNullParameter(priorityParam, "");
        advancedEvmSettingFragment.AEQbTJ().EZpvd(priorityParam);
        AdvancedSettingsContract.Input input = advancedEvmSettingFragment.OLrzqt;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        input.setPriorityFeeType(advancedEvmSettingFragment.AEQbTJ().djBIcL());
        return Unit.INSTANCE;
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            InterfaceC30853liw interfaceC30853liw = AdvancedEvmSettingFragment.this.djBIcL;
            if (interfaceC30853liw != null) {
                interfaceC30853liw.EZpvd(str);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<PrioritySelectionBean> list, Continuation<? super Unit> continuation) {
            AdvancedEvmSettingFragment advancedEvmSettingFragment = AdvancedEvmSettingFragment.this;
            advancedEvmSettingFragment.KWHzl(list, advancedEvmSettingFragment.AEQbTJ().djBIcL(), AdvancedEvmSettingFragment.this.AEQbTJ().gEmmrt().getValue().OLrzqt());
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(AdvancedEvmSettingFragment advancedEvmSettingFragment, boolean z) {
        C30807liC c30807liC;
        C55001xbh c55001xbhAEQbTJ;
        C25308iuK c25308iuK;
        C55008xbo c55008xboAEQbTJ;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboEZpvd;
        if (z) {
            return;
        }
        C23430hyA c23430hyA = (C23430hyA) advancedEvmSettingFragment.fARcdN();
        if (c23430hyA != null && (c25308iuK2 = c23430hyA.AYXKKw) != null && (c55008xboEZpvd = c25308iuK2.EZpvd()) != null) {
            c55008xboEZpvd.clearFocus();
        }
        C23430hyA c23430hyA2 = (C23430hyA) advancedEvmSettingFragment.fARcdN();
        if (c23430hyA2 != null && (c25308iuK = c23430hyA2.AYXKKw) != null && (c55008xboAEQbTJ = c25308iuK.AEQbTJ()) != null) {
            c55008xboAEQbTJ.clearFocus();
        }
        C23430hyA c23430hyA3 = (C23430hyA) advancedEvmSettingFragment.fARcdN();
        if (c23430hyA3 == null || (c30807liC = c23430hyA3.EZpvd) == null || (c55001xbhAEQbTJ = c30807liC.AEQbTJ()) == null) {
            return;
        }
        c55001xbhAEQbTJ.clearFocus();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(List<PrioritySelectionBean> list, int i, String str) {
        C30807liC c30807liC;
        Object maxValue;
        String strAEQbTJ;
        String strKWHzl;
        PriorityFeeInfo priorityFeeInfo;
        PriorityFeeInfo priorityFeeInfo2;
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA == null || (c30807liC = c23430hyA.EZpvd) == null) {
            return;
        }
        String value = MemeChainType.MemeChainTypeEVM.getValue();
        List<PrioritySelectionBean> listAhwBna = list == null ? yDY.AhwBna() : list;
        PriorityFeeInfo newProxyInstance = getNewProxyInstance();
        if (newProxyInstance == null || (maxValue = newProxyInstance.getMaxValue()) == null) {
            maxValue = 5;
        }
        String string = maxValue.toString();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedMainConfig config = input.getConfig();
        if (config == null || (priorityFeeInfo2 = config.getPriorityFeeInfo()) == null || (strAEQbTJ = priorityFeeInfo2.getMin()) == null) {
            AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
            AdvancedSettingsContract.Input input3 = this.OLrzqt;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
                input3 = null;
            }
            strAEQbTJ = advancedCustomMevPresetVMAEQbTJ.AEQbTJ(input3.getQuoteData());
        }
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        AdvancedMainConfig config2 = input4.getConfig();
        if (config2 == null || (priorityFeeInfo = config2.getPriorityFeeInfo()) == null || (strKWHzl = priorityFeeInfo.getMaxValue()) == null) {
            AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ2 = AEQbTJ();
            AdvancedSettingsContract.Input input5 = this.OLrzqt;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
                input5 = null;
            }
            strKWHzl = advancedCustomMevPresetVMAEQbTJ2.KWHzl(input5.getQuoteData());
        }
        String strKWHzl2 = AEQbTJ().KWHzl();
        Boolean boolAkhnZx = AEQbTJ().AkhnZx();
        boolean z = boolAkhnZx != null && (boolAkhnZx.booleanValue() ^ true);
        AdvancedSettingsContract.Input input6 = this.OLrzqt;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input6;
        }
        c30807liC.setData(value, listAhwBna, string, strAEQbTJ, strKWHzl, i, str, "Gwei", strKWHzl2, z, input2.getTradeMode());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(SlippageMode slippageMode, String str) {
        C25308iuK c25308iuK;
        String slippageValue;
        SlippageFeeType slippageFeeTypeOLrzqt;
        DexMultiTokenInfoBean second;
        Boolean supportMaxSlippage;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedSettingsContract.Input input = this.OLrzqt;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        Pair<Boolean, DexMultiTokenInfoBean> pairEjfBZ = (quoteData == null || (advancedQuoteAndCallDataKWHzl = quoteData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.ejfBZ();
        AdvancedSettingsContract.Input input2 = this.OLrzqt;
        if (input2 == null) {
            Intrinsics.gEmmrt("");
            input2 = null;
        }
        AdvancedMainConfig config = input2.getConfig();
        MinMaxData slippageConfig = config != null ? config.getSlippageConfig() : null;
        boolean zEZpvd = Intrinsics.EZpvd((Object) AuCTel(), (Object) "cefi_mode");
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA == null || (c25308iuK = c23430hyA.AYXKKw) == null) {
            return;
        }
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        AutoSlippageInfo autoSlippageInfo = input4.getAutoSlippageInfo();
        boolean zBooleanValue = (autoSlippageInfo == null || (supportMaxSlippage = autoSlippageInfo.getSupportMaxSlippage()) == null) ? false : supportMaxSlippage.booleanValue();
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        AutoSlippageInfo autoSlippageInfo2 = input5.getAutoSlippageInfo();
        String referenceSlippage = autoSlippageInfo2 != null ? autoSlippageInfo2.getReferenceSlippage() : null;
        String strOLrzqt = OLrzqt();
        AdvancedSettingsContract.Input input6 = this.OLrzqt;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        AutoSlippageInfo autoSlippageInfo3 = input6.getAutoSlippageInfo();
        String dynamicSlippageRangeMin = autoSlippageInfo3 != null ? autoSlippageInfo3.getDynamicSlippageRangeMin() : null;
        String str2 = dynamicSlippageRangeMin == null ? "" : dynamicSlippageRangeMin;
        AdvancedSettingsContract.Input input7 = this.OLrzqt;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        AutoSlippageInfo autoSlippageInfo4 = input7.getAutoSlippageInfo();
        String dynamicSlippageRangeMax = autoSlippageInfo4 != null ? autoSlippageInfo4.getDynamicSlippageRangeMax() : null;
        String str3 = dynamicSlippageRangeMax == null ? "" : dynamicSlippageRangeMax;
        AdvancedSettingsContract.Input input8 = this.OLrzqt;
        if (input8 == null) {
            Intrinsics.gEmmrt("");
            input8 = null;
        }
        AutoSlippageInfo autoSlippageInfo5 = input8.getAutoSlippageInfo();
        String recommendSlippageRangeMin = autoSlippageInfo5 != null ? autoSlippageInfo5.getRecommendSlippageRangeMin() : null;
        String str4 = recommendSlippageRangeMin == null ? "" : recommendSlippageRangeMin;
        AdvancedSettingsContract.Input input9 = this.OLrzqt;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
            input9 = null;
        }
        AutoSlippageInfo autoSlippageInfo6 = input9.getAutoSlippageInfo();
        String recommendSlippageRangeMax = autoSlippageInfo6 != null ? autoSlippageInfo6.getRecommendSlippageRangeMax() : null;
        String str5 = recommendSlippageRangeMax == null ? "" : recommendSlippageRangeMax;
        String tokenSymbol = (pairEjfBZ == null || (second = pairEjfBZ.getSecond()) == null) ? null : second.getTokenSymbol();
        boolean zBooleanValue2 = pairEjfBZ != null ? pairEjfBZ.getFirst().booleanValue() : false;
        AdvancedSettingsContract.Input input10 = this.OLrzqt;
        if (input10 == null) {
            Intrinsics.gEmmrt("");
            input10 = null;
        }
        DynamicParam dynamicParam = new DynamicParam(zBooleanValue, str, referenceSlippage, strOLrzqt, str2, str3, str4, str5, false, !input10.getTradeMode().isCopyTrading(), tokenSymbol, zBooleanValue2, false, false, null, 20736, null);
        SlippageMode slippageMode2 = SlippageMode.Fixed;
        if (slippageMode == slippageMode2) {
            AdvancedSettingsContract.Input input11 = this.OLrzqt;
            if (input11 == null) {
                Intrinsics.gEmmrt("");
                input11 = null;
            }
            slippageValue = input11.getSlippageValue();
        } else {
            slippageValue = "";
        }
        if (slippageMode == slippageMode2) {
            SlippageFeeType.TaskDescription taskDescription = SlippageFeeType.Companion;
            AdvancedSettingsContract.Input input12 = this.OLrzqt;
            if (input12 == null) {
                Intrinsics.gEmmrt("");
                input12 = null;
            }
            slippageFeeTypeOLrzqt = taskDescription.OLrzqt(input12.getSlippageFeeType());
        } else {
            slippageFeeTypeOLrzqt = SlippageFeeType.SlippageLow;
        }
        SlippageFeeType slippageFeeType = slippageFeeTypeOLrzqt;
        AdvancedSettingsContract.Input input13 = this.OLrzqt;
        if (input13 == null) {
            Intrinsics.gEmmrt("");
            input13 = null;
        }
        AutoSlippageInfo autoSlippageInfo7 = input13.getAutoSlippageInfo();
        List<String> shortcutFixSlippage = autoSlippageInfo7 != null ? autoSlippageInfo7.getShortcutFixSlippage() : null;
        String max = slippageConfig != null ? slippageConfig.getMax() : null;
        String str6 = max == null ? "" : max;
        String min = slippageConfig != null ? slippageConfig.getMin() : null;
        String str7 = min == null ? "" : min;
        AdvancedSettingsContract.Input input14 = this.OLrzqt;
        if (input14 == null) {
            Intrinsics.gEmmrt("");
            input14 = null;
        }
        AutoSlippageInfo autoSlippageInfo8 = input14.getAutoSlippageInfo();
        String recommendSlippageRangeMax2 = autoSlippageInfo8 != null ? autoSlippageInfo8.getRecommendSlippageRangeMax() : null;
        String str8 = recommendSlippageRangeMax2 == null ? "" : recommendSlippageRangeMax2;
        AdvancedSettingsContract.Input input15 = this.OLrzqt;
        if (input15 == null) {
            Intrinsics.gEmmrt("");
            input15 = null;
        }
        AutoSlippageInfo autoSlippageInfo9 = input15.getAutoSlippageInfo();
        String recommendSlippageRangeMin2 = autoSlippageInfo9 != null ? autoSlippageInfo9.getRecommendSlippageRangeMin() : null;
        c25308iuK.setData(new SlippageViewParam(tradeMode, slippageMode, dynamicParam, new FixedParam(slippageValue, shortcutFixSlippage, str6, str7, slippageFeeType, !zEZpvd, null, str8, recommendSlippageRangeMin2 == null ? "" : recommendSlippageRangeMin2, null, 576, null)));
    }

    public final String OLrzqt() {
        AdvancedSettingsContract.Input input = this.OLrzqt;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AutoSlippageInfo autoSlippageInfo = input.getAutoSlippageInfo();
        String autoSlippage = autoSlippageInfo != null ? autoSlippageInfo.getAutoSlippage() : null;
        return C31256lqb.KWHzl(autoSlippage != null ? autoSlippage : "", (Function0<String>) new Function0() { // from class: o.lhS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedEvmSettingFragment.isConnected(this.AEQbTJ);
            }
        });
    }

    public static final String isConnected(AdvancedEvmSettingFragment advancedEvmSettingFragment) {
        AdvancedSettingsContract.Input input = advancedEvmSettingFragment.OLrzqt;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AutoSlippageInfo autoSlippageInfo = input.getAutoSlippageInfo();
        String referenceSlippage = autoSlippageInfo != null ? autoSlippageInfo.getReferenceSlippage() : null;
        return referenceSlippage == null ? "" : referenceSlippage;
    }

    public final void djBIcL() {
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        String slippageValue = input.getSlippageValue();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        int slippageFeeType = input3.getSlippageFeeType();
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input4;
        }
        advancedCustomMevPresetVMAEQbTJ.AEQbTJ(slippageValue, slippageFeeType, input2.getAutoSlippageValue());
    }

    public final void AhwBna() {
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        int priorityFeeType = input.getPriorityFeeType();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input3;
        }
        advancedCustomMevPresetVMAEQbTJ.copydefault(priorityFeeType, input2.getQuoteData());
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C23430hyA OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23430hyA c23430hyAKWHzl = C23430hyA.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23430hyAKWHzl, "");
        return c23430hyAKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C23430hyA c23430hyA, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c23430hyA, "");
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        advancedCustomMevPresetVMAEQbTJ.KWHzl(input.getSlippageFeeType());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ2 = AEQbTJ();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        advancedCustomMevPresetVMAEQbTJ2.AEQbTJ(input3.getPriorityFeeType());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ3 = AEQbTJ();
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        advancedCustomMevPresetVMAEQbTJ3.KWHzl(input4.getRouterModeType());
        PresetRouteType.TaskDescription taskDescription = PresetRouteType.Companion;
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        this.KWHzl = taskDescription.EZpvd(input5.getRouterModeType());
        AdvancedPriorityFeeType.Activity activity = AdvancedPriorityFeeType.Companion;
        AdvancedSettingsContract.Input input6 = this.OLrzqt;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        this.EZpvd = activity.EZpvd(input6.getPriorityFeeType());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ4 = AEQbTJ();
        AdvancedSettingsContract.Input input7 = this.OLrzqt;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        String slippageValue = input7.getSlippageValue();
        AdvancedSettingsContract.Input input8 = this.OLrzqt;
        if (input8 == null) {
            Intrinsics.gEmmrt("");
            input8 = null;
        }
        SlippageMode slippageMode = input8.getSlippageMode();
        int iDjBIcL = AEQbTJ().djBIcL();
        AdvancedSettingsContract.Input input9 = this.OLrzqt;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
            input9 = null;
        }
        advancedCustomMevPresetVMAEQbTJ4.KWHzl(slippageValue, slippageMode, iDjBIcL, input9.getPriorityValue());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ5 = AEQbTJ();
        AdvancedSettingsContract.Input input10 = this.OLrzqt;
        if (input10 == null) {
            Intrinsics.gEmmrt("");
            input10 = null;
        }
        advancedCustomMevPresetVMAEQbTJ5.OLrzqt(input10.getMaxSlippage());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ6 = AEQbTJ();
        AdvancedSettingsContract.Input input11 = this.OLrzqt;
        if (input11 == null) {
            Intrinsics.gEmmrt("");
            input11 = null;
        }
        advancedCustomMevPresetVMAEQbTJ6.copydefault(input11.getConfig());
        AdvancedSettingsContract.Input input12 = this.OLrzqt;
        if (input12 == null) {
            Intrinsics.gEmmrt("");
            input12 = null;
        }
        EZpvd(input12.getRouterModeType());
        AdvancedSettingsContract.Input input13 = this.OLrzqt;
        if (input13 == null) {
            Intrinsics.gEmmrt("");
            input13 = null;
        }
        AdvancedMainConfig config = input13.getConfig();
        boolean supportAutoMode = config != null ? config.getSupportAutoMode() : false;
        AdvancedSettingsContract.Input input14 = this.OLrzqt;
        if (input14 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input14;
        }
        if (!input2.getTradeMode().isCopyTrading()) {
            C25337iun c25337iun = c23430hyA.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c25337iun, "");
            c25337iun.setVisibility(supportAutoMode ? 0 : 8);
            c23430hyA.KWHzl.setListener(new C30823liS(new AdvancedEvmSettingFragment$initView$1(this)));
            C25299iuB c25299iuB = c23430hyA.copydefault;
            Intrinsics.checkNotNullExpressionValue(c25299iuB, "");
            c25299iuB.setVisibility(8);
        } else {
            C25337iun c25337iun2 = c23430hyA.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c25337iun2, "");
            c25337iun2.setVisibility(8);
            C25299iuB c25299iuB2 = c23430hyA.copydefault;
            Intrinsics.checkNotNullExpressionValue(c25299iuB2, "");
            c25299iuB2.setVisibility(0);
            c23430hyA.copydefault.setListener(new FragmentManager(c23430hyA));
        }
        djBIcL();
        AhwBna();
        EZpvd();
        gEmmrt();
        isConnected();
        values();
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o.lhM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AdvancedEvmSettingFragment.AkhnZx(this.AEQbTJ);
                }
            });
        }
    }

    public static final class FragmentManager implements InterfaceC25348iuy {
        public final /* synthetic */ C23430hyA copydefault;

        @Override // o.InterfaceC25348iuy
        public void copydefault() {
        }

        public FragmentManager(C23430hyA c23430hyA) {
            this.copydefault = c23430hyA;
        }

        @Override // o.InterfaceC25348iuy
        public void KWHzl(boolean z) {
            AdvancedEvmSettingFragment.this.copydefault(z ? PresetRouteType.RouteTypeMev : PresetRouteType.RouteTypeAuto);
            AppCompatTextView appCompatTextViewCopydefault = this.copydefault.copydefault.copydefault();
            if (appCompatTextViewCopydefault != null) {
                appCompatTextViewCopydefault.setVisibility(z ^ true ? 0 : 8);
            }
        }
    }

    public static final void AkhnZx(AdvancedEvmSettingFragment advancedEvmSettingFragment) {
        rVN.reportFullyDrawn$default((Fragment) advancedEvmSettingFragment, true, (String) null, 2, (Object) null);
    }

    public final void copydefault(PresetRouteType presetRouteType) {
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        input.setRouterModeType(presetRouteType.getValue());
        AEQbTJ().KWHzl(presetRouteType.getValue());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        int priorityFeeType = input3.getPriorityFeeType();
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input4;
        }
        advancedCustomMevPresetVMAEQbTJ.OLrzqt(priorityFeeType, input2.getQuoteData());
        uzCIH();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(String str) {
        C25299iuB c25299iuB;
        C25337iun c25337iun;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        AdvancedSettingsContract.Input input = null;
        if (c23430hyA != null && (c25337iun = c23430hyA.KWHzl) != null) {
            AdvancedSettingsContract.Input input2 = this.OLrzqt;
            if (input2 == null) {
                Intrinsics.gEmmrt("");
                input2 = null;
            }
            TradeMode tradeMode = input2.getTradeMode();
            PresetRouteType presetRouteTypeEZpvd = PresetRouteType.Companion.EZpvd(str);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanIwGUEr = iwGUEr();
            String chainName = dexMultiTokenInfoBeanIwGUEr != null ? dexMultiTokenInfoBeanIwGUEr.getChainName() : null;
            String str2 = chainName == null ? "" : chainName;
            AdvancedSettingsContract.Input input3 = this.OLrzqt;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
                input3 = null;
            }
            AdvancedMainConfig config = input3.getConfig();
            String mevPriceThreshold = config != null ? config.getMevPriceThreshold() : null;
            String str3 = mevPriceThreshold == null ? "" : mevPriceThreshold;
            AdvancedSettingsContract.Input input4 = this.OLrzqt;
            if (input4 == null) {
                Intrinsics.gEmmrt("");
                input4 = null;
            }
            AdvancedMainConfig config2 = input4.getConfig();
            boolean supportAutoMode = config2 != null ? config2.getSupportAutoMode() : false;
            MevUnstableShowLevelType.Activity activity = MevUnstableShowLevelType.Companion;
            AdvancedSettingsContract.Input input5 = this.OLrzqt;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
                input5 = null;
            }
            AdvancedQuoteUiData quoteData = input5.getQuoteData();
            c25337iun.setData(new MevRouteParam(tradeMode, presetRouteTypeEZpvd, str2, str3, supportAutoMode, activity.copydefault((quoteData == null || (advancedQuoteAndCallDataKWHzl = quoteData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.fARcdN()), null, 64, null));
        }
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input6 = this.OLrzqt;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        advancedCustomMevPresetVMAEQbTJ.KWHzl(input6.getRouterModeType());
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ2 = AEQbTJ();
        AdvancedSettingsContract.Input input7 = this.OLrzqt;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        boolean zOLrzqt = advancedCustomMevPresetVMAEQbTJ2.OLrzqt(input7.getQuoteData());
        AdvancedSettingsContract.Input input8 = this.OLrzqt;
        if (input8 == null) {
            Intrinsics.gEmmrt("");
            input8 = null;
        }
        AdvancedMainConfig config3 = input8.getConfig();
        boolean supportAutoMode2 = config3 != null ? config3.getSupportAutoMode() : false;
        C23430hyA c23430hyA2 = (C23430hyA) fARcdN();
        if (c23430hyA2 == null || (c25299iuB = c23430hyA2.copydefault) == null) {
            return;
        }
        AdvancedSettingsContract.Input input9 = this.OLrzqt;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input = input9;
        }
        c25299iuB.setData(new MevSimpleParam(input.getTradeMode(), supportAutoMode2, zOLrzqt, null, 8, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uzCIH() {
        C30807liC c30807liC;
        boolean z;
        AdvancedCustomMevPresetVM advancedCustomMevPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        String estimateGasFee = input3.getEstimateGasFee();
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String strCopydefault = advancedCustomMevPresetVMAEQbTJ.copydefault(quoteData, estimateGasFee, input4.getPerTokenUsd());
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA == null || (c30807liC = c23430hyA.EZpvd) == null) {
            return;
        }
        String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.prepareFromUri);
        String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strCopydefault, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        if (input5.getQuoteData() == null) {
            z = false;
        } else {
            AdvancedSettingsContract.Input input6 = this.OLrzqt;
            if (input6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input6;
            }
            if (!input2.getTradeMode().isCopyTrading()) {
                z = true;
            }
        }
        c30807liC.setTotalFeeView(strAYXKKw, scientificCurrency$default, false, z);
    }

    public final void isConnected() {
        InterfaceC30614leV interfaceC30614leVKWHzl = KWHzl();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanIwGUEr = iwGUEr();
        String chainName = dexMultiTokenInfoBeanIwGUEr != null ? dexMultiTokenInfoBeanIwGUEr.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        interfaceC30614leVKWHzl.OLrzqt(strAuCTel, orderType, chainName, chainId, tradeMode, input2.getTransaction());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSettingsPageClick$default(AdvancedEvmSettingFragment advancedEvmSettingFragment, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        advancedEvmSettingFragment.AEQbTJ(str, str2, map);
    }

    public final void AEQbTJ(String str, String str2, Map<String, String> map) {
        InterfaceC30614leV interfaceC30614leVKWHzl = KWHzl();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanIwGUEr = iwGUEr();
        String chainName = dexMultiTokenInfoBeanIwGUEr != null ? dexMultiTokenInfoBeanIwGUEr.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        interfaceC30614leVKWHzl.EZpvd(strAuCTel, orderType, tradeMode, chainName, chainId, str, str2, map, input2.getTransaction());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.leV.ActionBar.trackSettingsSubmit$default(o.leV, java.lang.String, com.okinc.business.dexlogic.bean.track.TrackOrderType, com.okinc.business.dexui.main.shared.model.TradeMode, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.PresetRouteType, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType, java.lang.String, int, java.util.Map, int, java.lang.Object):void */
    public final void fetchVPNInfo() {
        boolean z;
        String strAhwBna = AEQbTJ().AhwBna();
        if (Intrinsics.EZpvd((Object) strAhwBna, (Object) PresetRouteType.RouteTypeAuto.getValue()) || Intrinsics.EZpvd((Object) strAhwBna, (Object) PresetRouteType.RouteTypeMev.getValue())) {
            z = true;
        } else {
            if (!Intrinsics.EZpvd((Object) strAhwBna, (Object) PresetRouteType.RouteTypeFast.getValue())) {
                Intrinsics.EZpvd((Object) strAhwBna, (Object) PresetRouteType.RouteTypeNotSupport.getValue());
            }
            z = false;
        }
        boolean z2 = z;
        InterfaceC30614leV interfaceC30614leVKWHzl = KWHzl();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanIwGUEr = iwGUEr();
        String chainName = dexMultiTokenInfoBeanIwGUEr != null ? dexMultiTokenInfoBeanIwGUEr.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        String value = DexTrackEventParameter.ButtonName.CONFIRM.getValue();
        PresetRouteType presetRouteTypeEZpvd = PresetRouteType.Companion.EZpvd(AEQbTJ().AhwBna());
        SlippageMode slippageModeFetchVPNInfo = AEQbTJ().fetchVPNInfo();
        String value2 = AEQbTJ().AYXKKw().getValue();
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        InterfaceC30614leV.ActionBar.trackSettingsSubmit$default(interfaceC30614leVKWHzl, strAuCTel, orderType, tradeMode, chainName, chainId, value, z2, presetRouteTypeEZpvd, slippageModeFetchVPNInfo, null, value2, input2.getTransaction(), null, 4608, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        C30807liC c30807liC;
        C25337iun c25337iun;
        C25308iuK c25308iuK;
        InterfaceC30614leV interfaceC30614leVKWHzl = KWHzl();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.OLrzqt;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.OLrzqt;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanIwGUEr = iwGUEr();
        String chainName = dexMultiTokenInfoBeanIwGUEr != null ? dexMultiTokenInfoBeanIwGUEr.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.OLrzqt;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.OLrzqt;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        yHO<String, String, Map<String, String>, Unit> yhoAEQbTJ = interfaceC30614leVKWHzl.AEQbTJ(strAuCTel, orderType, tradeMode, chainName, chainId, input2.getTransaction());
        C23430hyA c23430hyA = (C23430hyA) fARcdN();
        if (c23430hyA != null && (c25308iuK = c23430hyA.AYXKKw) != null) {
            c25308iuK.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
        }
        C23430hyA c23430hyA2 = (C23430hyA) fARcdN();
        if (c23430hyA2 != null && (c25337iun = c23430hyA2.KWHzl) != null) {
            c25337iun.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
        }
        C23430hyA c23430hyA3 = (C23430hyA) fARcdN();
        if (c23430hyA3 == null || (c30807liC = c23430hyA3.EZpvd) == null) {
            return;
        }
        c30807liC.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.djBIcL = null;
        super.onDestroyView();
    }
}

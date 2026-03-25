package com.okinc.business.trade.features.home.ui.cefi.setting;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatTextView;
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
import com.okinc.business.dex.trade.widget.SimpleNetworkFeeParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.PresetRouteType;
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
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedCustomOtherChainPresetVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC30854lix;
import o.C22312hcw;
import o.C23274hvD;
import o.C23395hxS;
import o.C25299iuB;
import o.C25308iuK;
import o.C25337iun;
import o.C25390ivn;
import o.C30563ldX;
import o.C30820liP;
import o.C30828liX;
import o.C31200lpY;
import o.C31256lqb;
import o.C33070mpX;
import o.C33129mqd;
import o.C52794wYp;
import o.C55008xbo;
import o.C55239xgG;
import o.C55296xhK;
import o.C55298xhM;
import o.C56392yDr;
import o.C56424yEw;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC25348iuy;
import o.InterfaceC30614leV;
import o.InterfaceC30853liw;
import o.InterfaceC56387yDm;
import o.rVN;
import o.wYF;
import o.yCM;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AdvancedOtherChainSettingFragment extends AbstractC30854lix<C23395hxS> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public PresetRouteType AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public AdvancedSettingsContract.Input KWHzl;
    public final InterfaceC56387yDm copydefault;
    public InterfaceC30853liw gEmmrt;

    @yCM
    public InterfaceC30614leV settingsTracker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedOtherChainSettingFragment AEQbTJ(@NotNull InterfaceC30853liw interfaceC30853liw) {
        Intrinsics.checkNotNullParameter(interfaceC30853liw, "");
        this.gEmmrt = interfaceC30853liw;
        return this;
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C23395hxS AYXKKw(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment) {
        return (C23395hxS) advancedOtherChainSettingFragment.fARcdN();
    }

    public AdvancedOtherChainSettingFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedCustomOtherChainPresetVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment$special$$inlined$viewModels$default$5
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
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedOtherChainSettingFragment.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.AEQbTJ = PresetRouteType.RouteTypeAuto;
    }

    public final AdvancedCustomOtherChainPresetVM EZpvd() {
        return (AdvancedCustomOtherChainPresetVM) this.copydefault.getValue();
    }

    /* JADX DEBUG: Possible override for method o.lix.OLrzqt()V */
    public final InterfaceC30614leV OLrzqt() {
        InterfaceC30614leV interfaceC30614leV = this.settingsTracker;
        if (interfaceC30614leV != null) {
            return interfaceC30614leV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final DexMultiTokenInfoBean AhwBna() {
        return (DexMultiTokenInfoBean) this.EZpvd.getValue();
    }

    public static final DexMultiTokenInfoBean fetchVPNInfo(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment) {
        return advancedOtherChainSettingFragment.EZpvd().OLrzqt();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AdvancedOtherChainSettingFragment OLrzqt(@NotNull AdvancedSettingsContract.Input input) {
            Intrinsics.checkNotNullParameter(input, "");
            AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment = new AdvancedOtherChainSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", input);
            C31200lpY.EZpvd(bundle, input.getSourceType());
            advancedOtherChainSettingFragment.setArguments(bundle);
            return advancedOtherChainSettingFragment;
        }
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        AdvancedSettingsContract.Input input;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (input = (AdvancedSettingsContract.Input) ((Parcelable) BundleCompat.getParcelable(arguments, "data", AdvancedSettingsContract.Input.class))) != null) {
            this.KWHzl = input;
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        wYF wyf;
        C23395hxS c23395hxS = (C23395hxS) fARcdN();
        if (c23395hxS == null || (wyf = c23395hxS.KWHzl) == null) {
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
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.lhV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AdvancedOtherChainSettingFragment.KWHzl(this.AEQbTJ, view);
                }
            });
        }
        EZpvd(wyf);
    }

    public static final void KWHzl(final AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment, View view) {
        advancedOtherChainSettingFragment.EZpvd().copydefault();
        AdvancedSettingsContract.Input input = advancedOtherChainSettingFragment.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedSettingsContract.Input input3 = advancedOtherChainSettingFragment.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        input3.setPriorityFeeType(advancedOtherChainSettingFragment.EZpvd().copydefault());
        AdvancedSettingsContract.Input input4 = advancedOtherChainSettingFragment.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        input4.setOpenMev(advancedOtherChainSettingFragment.EZpvd().values());
        AdvancedSettingsContract.Input input5 = advancedOtherChainSettingFragment.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        input5.setRouterModeType(advancedOtherChainSettingFragment.EZpvd().KWHzl().getValue().getValue());
        input.setPriorityValue(advancedOtherChainSettingFragment.EZpvd().gEmmrt().getValue().OLrzqt());
        input.setSlippageValue(advancedOtherChainSettingFragment.EZpvd().AYXKKw().getValue());
        input.setSlippageFeeType(advancedOtherChainSettingFragment.EZpvd().AhwBna());
        input.setPriorityFeeType(advancedOtherChainSettingFragment.EZpvd().copydefault());
        input.setSlippageMode(advancedOtherChainSettingFragment.EZpvd().djBIcL());
        input.setMaxSlippage(advancedOtherChainSettingFragment.EZpvd().EZpvd());
        advancedOtherChainSettingFragment.iwGUEr();
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd = advancedOtherChainSettingFragment.EZpvd();
        AdvancedSettingsContract.Input input6 = advancedOtherChainSettingFragment.KWHzl;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        input.setTotalFee(C31256lqb.KWHzl(advancedCustomOtherChainPresetVMEZpvd.KWHzl(input6.getQuoteData()), (Function0<String>) new Function0() { // from class: o.lia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedOtherChainSettingFragment.isConnected(this.KWHzl);
            }
        }));
        InterfaceC30853liw interfaceC30853liw = advancedOtherChainSettingFragment.gEmmrt;
        if (interfaceC30853liw != null) {
            AdvancedSettingsContract.Input input7 = advancedOtherChainSettingFragment.KWHzl;
            if (input7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input7;
            }
            interfaceC30853liw.KWHzl(input2);
        }
    }

    public static final String isConnected(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment) {
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd = advancedOtherChainSettingFragment.EZpvd();
        AdvancedSettingsContract.Input input = advancedOtherChainSettingFragment.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        AdvancedSettingsContract.Input input3 = advancedOtherChainSettingFragment.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        String estimateGasFee = input3.getEstimateGasFee();
        AdvancedSettingsContract.Input input4 = advancedOtherChainSettingFragment.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String perTokenUsd = input4.getPerTokenUsd();
        AdvancedSettingsContract.Input input5 = advancedOtherChainSettingFragment.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        return advancedCustomOtherChainPresetVMEZpvd.OLrzqt(quoteData, estimateGasFee, perTokenUsd, input2.isFreeGas());
    }

    private final void EZpvd(wYF wyf) {
        AdvancedSettingsContract.Input input = this.KWHzl;
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
                c52794wYpAEQbTJ2.setOnClickListener(new Application(c52794wYpAEQbTJ2, 1000L, this));
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
            c52794wYpAEQbTJ4.setOnClickListener(new View.OnClickListener() { // from class: o.lie
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AdvancedOtherChainSettingFragment.EZpvd(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void EZpvd(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment, View view) {
        FragmentActivity activity = advancedOtherChainSettingFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        PresetRouteType presetRouteType;
        C25299iuB c25299iuB;
        C25299iuB c25299iuB2;
        C25337iun c25337iun;
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedMainConfig config = input.getConfig();
        boolean supportAutoMode = config != null ? config.getSupportAutoMode() : false;
        if (supportAutoMode) {
            AdvancedSettingsContract.Input input3 = this.KWHzl;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
                input3 = null;
            }
            presetRouteType = !input3.getTradeMode().isCopyTrading() ? PresetRouteType.RouteTypeAuto : this.AEQbTJ;
        } else {
            presetRouteType = PresetRouteType.RouteTypeNotSupport;
        }
        EZpvd().OLrzqt(presetRouteType);
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        if (!input4.getTradeMode().isCopyTrading()) {
            EZpvd(presetRouteType.getValue());
        } else {
            boolean zIsConnected = EZpvd().isConnected();
            C23395hxS c23395hxS = (C23395hxS) fARcdN();
            if (c23395hxS != null && (c25299iuB = c23395hxS.copydefault) != null) {
                AdvancedSettingsContract.Input input5 = this.KWHzl;
                if (input5 == null) {
                    Intrinsics.gEmmrt("");
                    input5 = null;
                }
                c25299iuB.setData(new MevSimpleParam(input5.getTradeMode(), supportAutoMode, zIsConnected, null, 8, null));
            }
        }
        C23395hxS c23395hxS2 = (C23395hxS) fARcdN();
        if (c23395hxS2 != null && (c25337iun = c23395hxS2.OLrzqt) != null) {
            AdvancedSettingsContract.Input input6 = this.KWHzl;
            if (input6 == null) {
                Intrinsics.gEmmrt("");
                input6 = null;
            }
            c25337iun.setVisibility((input6.getTradeMode().isCopyTrading() || !supportAutoMode) ? 8 : 0);
        }
        C23395hxS c23395hxS3 = (C23395hxS) fARcdN();
        if (c23395hxS3 == null || (c25299iuB2 = c23395hxS3.copydefault) == null) {
            return;
        }
        AdvancedSettingsContract.Input input7 = this.KWHzl;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input7;
        }
        c25299iuB2.setVisibility(input2.getTradeMode().isCopyTrading() ? 0 : 8);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ AdvancedOtherChainSettingFragment EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = advancedOtherChainSettingFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.fJNWhG();
                this.EZpvd.uzCIH();
                AdvancedOtherChainSettingFragment.trackSettingsPageClick$default(this.EZpvd, DexTrackEventParameter.ButtonName.RESET.getValue(), DexTrackEventParameter.ButtonType.TRADE.getValue(), null, 4, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        int slippageFeeType;
        C25308iuK c25308iuK;
        C55008xbo c55008xboEZpvd;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboAEQbTJ;
        C23395hxS c23395hxS = (C23395hxS) fARcdN();
        if (c23395hxS != null && (c25308iuK2 = c23395hxS.gEmmrt) != null && (c55008xboAEQbTJ = c25308iuK2.AEQbTJ()) != null) {
            c55008xboAEQbTJ.setText("");
        }
        C23395hxS c23395hxS2 = (C23395hxS) fARcdN();
        if (c23395hxS2 != null && (c25308iuK = c23395hxS2.gEmmrt) != null && (c55008xboEZpvd = c25308iuK.EZpvd()) != null) {
            c55008xboEZpvd.setText("");
        }
        AdvancedSettingsContract.Input input = this.KWHzl;
        String maxSlippage = null;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        SlippageMode slippageMode = !input.getTradeMode().isCopyTrading() ? SlippageMode.Dynamic : SlippageMode.Fixed;
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        input3.setSlippageMode(slippageMode);
        EZpvd().AEQbTJ(slippageMode);
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd = EZpvd();
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        if (input4.getTradeMode().isCopyTrading()) {
            AdvancedSettingsContract.Input input5 = this.KWHzl;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
                input5 = null;
            }
            slippageFeeType = input5.getSlippageFeeType();
        } else {
            slippageFeeType = AdvancedSlippageType.Auto.getValue();
        }
        advancedCustomOtherChainPresetVMEZpvd.EZpvd(slippageFeeType);
        AdvancedSettingsContract.Input input6 = this.KWHzl;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        if (!input6.getTradeMode().isCopyTrading()) {
            EZpvd().AEQbTJ(gEmmrt());
        }
        AdvancedSettingsContract.Input input7 = this.KWHzl;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        if (input7.getTradeMode().isCopyTrading()) {
            AdvancedSettingsContract.Input input8 = this.KWHzl;
            if (input8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input8;
            }
            maxSlippage = input2.getMaxSlippage();
        }
        copydefault(slippageMode, maxSlippage);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C25308iuK c25308iuK;
        C30828liX c30828liX = new C30828liX(EZpvd());
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input3;
        }
        c30828liX.KWHzl(quoteData, input2.getAutoSlippageInfo());
        C23395hxS c23395hxS = (C23395hxS) fARcdN();
        if (c23395hxS != null && (c25308iuK = c23395hxS.gEmmrt) != null) {
            c25308iuK.setListener(c30828liX);
        }
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().valueOf(), null, new FragmentManager(), 2, null);
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SlippageSelectionBean> list, Continuation<? super Unit> continuation) {
            AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment = AdvancedOtherChainSettingFragment.this;
            AdvancedSettingsContract.Input input = advancedOtherChainSettingFragment.KWHzl;
            AdvancedSettingsContract.Input input2 = null;
            if (input == null) {
                Intrinsics.gEmmrt("");
                input = null;
            }
            SlippageMode slippageMode = input.getSlippageMode();
            AdvancedSettingsContract.Input input3 = AdvancedOtherChainSettingFragment.this.KWHzl;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input3;
            }
            advancedOtherChainSettingFragment.copydefault(slippageMode, input2.getMaxSlippage());
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(SlippageMode slippageMode, String str) {
        C25308iuK c25308iuK;
        String slippageValue;
        SlippageFeeType slippageFeeTypeOLrzqt;
        DexMultiTokenInfoBean second;
        Boolean supportMaxSlippage;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedSettingsContract.Input input = this.KWHzl;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        Pair<Boolean, DexMultiTokenInfoBean> pairEjfBZ = (quoteData == null || (advancedQuoteAndCallDataKWHzl = quoteData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.ejfBZ();
        AdvancedSettingsContract.Input input2 = this.KWHzl;
        if (input2 == null) {
            Intrinsics.gEmmrt("");
            input2 = null;
        }
        AdvancedMainConfig config = input2.getConfig();
        MinMaxData slippageConfig = config != null ? config.getSlippageConfig() : null;
        boolean zEZpvd = Intrinsics.EZpvd((Object) AuCTel(), (Object) "cefi_mode");
        C23395hxS c23395hxS = (C23395hxS) fARcdN();
        if (c23395hxS == null || (c25308iuK = c23395hxS.gEmmrt) == null) {
            return;
        }
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        AutoSlippageInfo autoSlippageInfo = input4.getAutoSlippageInfo();
        boolean zBooleanValue = (autoSlippageInfo == null || (supportMaxSlippage = autoSlippageInfo.getSupportMaxSlippage()) == null) ? false : supportMaxSlippage.booleanValue();
        AdvancedSettingsContract.Input input5 = this.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        AutoSlippageInfo autoSlippageInfo2 = input5.getAutoSlippageInfo();
        String referenceSlippage = autoSlippageInfo2 != null ? autoSlippageInfo2.getReferenceSlippage() : null;
        String strGEmmrt = gEmmrt();
        AdvancedSettingsContract.Input input6 = this.KWHzl;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        AutoSlippageInfo autoSlippageInfo3 = input6.getAutoSlippageInfo();
        String dynamicSlippageRangeMin = autoSlippageInfo3 != null ? autoSlippageInfo3.getDynamicSlippageRangeMin() : null;
        String str2 = dynamicSlippageRangeMin == null ? "" : dynamicSlippageRangeMin;
        AdvancedSettingsContract.Input input7 = this.KWHzl;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        AutoSlippageInfo autoSlippageInfo4 = input7.getAutoSlippageInfo();
        String dynamicSlippageRangeMax = autoSlippageInfo4 != null ? autoSlippageInfo4.getDynamicSlippageRangeMax() : null;
        String str3 = dynamicSlippageRangeMax == null ? "" : dynamicSlippageRangeMax;
        AdvancedSettingsContract.Input input8 = this.KWHzl;
        if (input8 == null) {
            Intrinsics.gEmmrt("");
            input8 = null;
        }
        AutoSlippageInfo autoSlippageInfo5 = input8.getAutoSlippageInfo();
        String recommendSlippageRangeMin = autoSlippageInfo5 != null ? autoSlippageInfo5.getRecommendSlippageRangeMin() : null;
        String str4 = recommendSlippageRangeMin == null ? "" : recommendSlippageRangeMin;
        AdvancedSettingsContract.Input input9 = this.KWHzl;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
            input9 = null;
        }
        AutoSlippageInfo autoSlippageInfo6 = input9.getAutoSlippageInfo();
        String recommendSlippageRangeMax = autoSlippageInfo6 != null ? autoSlippageInfo6.getRecommendSlippageRangeMax() : null;
        String str5 = recommendSlippageRangeMax == null ? "" : recommendSlippageRangeMax;
        String tokenSymbol = (pairEjfBZ == null || (second = pairEjfBZ.getSecond()) == null) ? null : second.getTokenSymbol();
        boolean zBooleanValue2 = pairEjfBZ != null ? pairEjfBZ.getFirst().booleanValue() : false;
        AdvancedSettingsContract.Input input10 = this.KWHzl;
        if (input10 == null) {
            Intrinsics.gEmmrt("");
            input10 = null;
        }
        DynamicParam dynamicParam = new DynamicParam(zBooleanValue, str, referenceSlippage, strGEmmrt, str2, str3, str4, str5, false, !input10.getTradeMode().isCopyTrading(), tokenSymbol, zBooleanValue2, false, false, null, 20736, null);
        SlippageMode slippageMode2 = SlippageMode.Fixed;
        if (slippageMode == slippageMode2) {
            AdvancedSettingsContract.Input input11 = this.KWHzl;
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
            AdvancedSettingsContract.Input input12 = this.KWHzl;
            if (input12 == null) {
                Intrinsics.gEmmrt("");
                input12 = null;
            }
            slippageFeeTypeOLrzqt = taskDescription.OLrzqt(input12.getSlippageFeeType());
        } else {
            slippageFeeTypeOLrzqt = SlippageFeeType.SlippageLow;
        }
        SlippageFeeType slippageFeeType = slippageFeeTypeOLrzqt;
        AdvancedSettingsContract.Input input13 = this.KWHzl;
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
        AdvancedSettingsContract.Input input14 = this.KWHzl;
        if (input14 == null) {
            Intrinsics.gEmmrt("");
            input14 = null;
        }
        AutoSlippageInfo autoSlippageInfo8 = input14.getAutoSlippageInfo();
        String recommendSlippageRangeMax2 = autoSlippageInfo8 != null ? autoSlippageInfo8.getRecommendSlippageRangeMax() : null;
        String str8 = recommendSlippageRangeMax2 == null ? "" : recommendSlippageRangeMax2;
        AdvancedSettingsContract.Input input15 = this.KWHzl;
        if (input15 == null) {
            Intrinsics.gEmmrt("");
            input15 = null;
        }
        AutoSlippageInfo autoSlippageInfo9 = input15.getAutoSlippageInfo();
        String recommendSlippageRangeMin2 = autoSlippageInfo9 != null ? autoSlippageInfo9.getRecommendSlippageRangeMin() : null;
        c25308iuK.setData(new SlippageViewParam(tradeMode, slippageMode, dynamicParam, new FixedParam(slippageValue, shortcutFixSlippage, str6, str7, slippageFeeType, !zEZpvd, null, str8, recommendSlippageRangeMin2 == null ? "" : recommendSlippageRangeMin2, null, 576, null)));
    }

    private final String gEmmrt() {
        AdvancedSettingsContract.Input input = this.KWHzl;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AutoSlippageInfo autoSlippageInfo = input.getAutoSlippageInfo();
        String autoSlippage = autoSlippageInfo != null ? autoSlippageInfo.getAutoSlippage() : null;
        return C31256lqb.KWHzl(autoSlippage != null ? autoSlippage : "", (Function0<String>) new Function0() { // from class: o.lhX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedOtherChainSettingFragment.values(this.copydefault);
            }
        });
    }

    public static final String values(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment) {
        AdvancedSettingsContract.Input input = advancedOtherChainSettingFragment.KWHzl;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AutoSlippageInfo autoSlippageInfo = input.getAutoSlippageInfo();
        String referenceSlippage = autoSlippageInfo != null ? autoSlippageInfo.getReferenceSlippage() : null;
        return referenceSlippage == null ? "" : referenceSlippage;
    }

    private final void isConnected() {
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(EZpvd().AYXKKw(), EZpvd().gEmmrt(), new AdvancedOtherChainSettingFragment$initListener$1(null)), null, new Activity(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().KWHzl(), null, new StateListAnimator(), 2, null);
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(Pair<String, C30563ldX> pair, Continuation<? super Unit> continuation) {
            wYF wyf;
            C52794wYp c52794wYpCopydefault;
            String strComponent1 = pair.component1();
            C30563ldX c30563ldXComponent2 = pair.component2();
            boolean z = false;
            boolean z2 = strComponent1.length() > 0;
            boolean z3 = AdvancedOtherChainSettingFragment.this.EZpvd().copydefault() != AdvancedPriorityFeeType.Custom.getValue() || C33129mqd.AEQbTJ(c30563ldXComponent2.OLrzqt(), C56443yFo.AEQbTJ(0));
            C23395hxS c23395hxSAYXKKw = AdvancedOtherChainSettingFragment.AYXKKw(AdvancedOtherChainSettingFragment.this);
            if (c23395hxSAYXKKw != null && (wyf = c23395hxSAYXKKw.KWHzl) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                if (z2 && z3) {
                    z = true;
                }
                c52794wYpCopydefault.setEnabled(z);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(PresetRouteType presetRouteType, Continuation<? super Unit> continuation) {
            C23395hxS c23395hxSAYXKKw;
            C25299iuB c25299iuB;
            AppCompatTextView appCompatTextViewCopydefault;
            C25299iuB c25299iuB2;
            C55239xgG c55239xgGEZpvd;
            AdvancedSettingsContract.Input input = AdvancedOtherChainSettingFragment.this.KWHzl;
            if (input == null) {
                Intrinsics.gEmmrt("");
                input = null;
            }
            if (input.getTradeMode().isCopyTrading() && (c23395hxSAYXKKw = AdvancedOtherChainSettingFragment.AYXKKw(AdvancedOtherChainSettingFragment.this)) != null && (c25299iuB = c23395hxSAYXKKw.copydefault) != null && (appCompatTextViewCopydefault = c25299iuB.copydefault()) != null) {
                C23395hxS c23395hxSAYXKKw2 = AdvancedOtherChainSettingFragment.AYXKKw(AdvancedOtherChainSettingFragment.this);
                appCompatTextViewCopydefault.setVisibility((c23395hxSAYXKKw2 == null || (c25299iuB2 = c23395hxSAYXKKw2.copydefault) == null || (c55239xgGEZpvd = c25299iuB2.EZpvd()) == null || c55239xgGEZpvd.isChecked()) ? 8 : 0);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fetchVPNInfo() {
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd = EZpvd();
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        String slippageValue = input.getSlippageValue();
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        int slippageFeeType = input3.getSlippageFeeType();
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input4;
        }
        advancedCustomOtherChainPresetVMEZpvd.OLrzqt(slippageValue, slippageFeeType, input2.getAutoSlippageValue());
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C23395hxS OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23395hxS c23395hxSKWHzl = C23395hxS.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23395hxSKWHzl, "");
        return c23395hxSKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C23395hxS c23395hxS, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c23395hxS, "");
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd = EZpvd();
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        advancedCustomOtherChainPresetVMEZpvd.EZpvd(input.getSlippageFeeType());
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd2 = EZpvd();
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        advancedCustomOtherChainPresetVMEZpvd2.KWHzl(input3.getPriorityFeeType());
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd3 = EZpvd();
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        advancedCustomOtherChainPresetVMEZpvd3.KWHzl(input4.isOpenMev());
        PresetRouteType.TaskDescription taskDescription = PresetRouteType.Companion;
        AdvancedSettingsContract.Input input5 = this.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        this.AEQbTJ = taskDescription.EZpvd(input5.getRouterModeType());
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd4 = EZpvd();
        AdvancedSettingsContract.Input input6 = this.KWHzl;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        advancedCustomOtherChainPresetVMEZpvd4.AEQbTJ(input6.getSlippageMode());
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd5 = EZpvd();
        AdvancedSettingsContract.Input input7 = this.KWHzl;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        advancedCustomOtherChainPresetVMEZpvd5.OLrzqt(input7.getMaxSlippage());
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd6 = EZpvd();
        AdvancedSettingsContract.Input input8 = this.KWHzl;
        if (input8 == null) {
            Intrinsics.gEmmrt("");
            input8 = null;
        }
        String slippageValue = input8.getSlippageValue();
        AdvancedSettingsContract.Input input9 = this.KWHzl;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
            input9 = null;
        }
        int priorityFeeType = input9.getPriorityFeeType();
        AdvancedSettingsContract.Input input10 = this.KWHzl;
        if (input10 == null) {
            Intrinsics.gEmmrt("");
            input10 = null;
        }
        advancedCustomOtherChainPresetVMEZpvd6.copydefault(slippageValue, priorityFeeType, input10.getPriorityValue());
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd7 = EZpvd();
        AdvancedSettingsContract.Input input11 = this.KWHzl;
        if (input11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input11;
        }
        advancedCustomOtherChainPresetVMEZpvd7.AEQbTJ(input2.getConfig());
        AEQbTJ();
        fetchVPNInfo();
        values();
        AkhnZx();
        isConnected();
        KWHzl();
        hDKMBd();
        getFieldNames();
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o.lhW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AdvancedOtherChainSettingFragment.AkhnZx(this.OLrzqt);
                }
            });
        }
    }

    public static final void AkhnZx(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment) {
        rVN.reportFullyDrawn$default((Fragment) advancedOtherChainSettingFragment, true, (String) null, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        C22312hcw c22312hcw;
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd = EZpvd();
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        String strKWHzl = C31256lqb.KWHzl(advancedCustomOtherChainPresetVMEZpvd.KWHzl(input.getQuoteData()), (Function0<String>) new Function0() { // from class: o.lib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedOtherChainSettingFragment.DbNXlk(this.OLrzqt);
            }
        });
        C23395hxS c23395hxS = (C23395hxS) fARcdN();
        if (c23395hxS == null || (c22312hcw = c23395hxS.EZpvd) == null) {
            return;
        }
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input3;
        }
        c22312hcw.setData(new SimpleNetworkFeeParam(input2.getTradeMode(), C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow11), strKWHzl));
    }

    public static final String DbNXlk(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment) {
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVMEZpvd = advancedOtherChainSettingFragment.EZpvd();
        AdvancedSettingsContract.Input input = advancedOtherChainSettingFragment.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        AdvancedSettingsContract.Input input3 = advancedOtherChainSettingFragment.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        String estimateGasFee = input3.getEstimateGasFee();
        AdvancedSettingsContract.Input input4 = advancedOtherChainSettingFragment.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String perTokenUsd = input4.getPerTokenUsd();
        AdvancedSettingsContract.Input input5 = advancedOtherChainSettingFragment.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        return advancedCustomOtherChainPresetVMEZpvd.OLrzqt(quoteData, estimateGasFee, perTokenUsd, input2.isFreeGas());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        C25299iuB c25299iuB;
        C25299iuB c25299iuB2;
        C25337iun c25337iun;
        C25299iuB c25299iuB3;
        C25337iun c25337iun2;
        C25337iun c25337iun3;
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        EZpvd(input.getRouterModeType());
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        AdvancedMainConfig config = input3.getConfig();
        boolean supportAutoMode = config != null ? config.getSupportAutoMode() : false;
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input4;
        }
        if (!input2.getTradeMode().isCopyTrading()) {
            C23395hxS c23395hxS = (C23395hxS) fARcdN();
            if (c23395hxS != null && (c25337iun3 = c23395hxS.OLrzqt) != null) {
                c25337iun3.setVisibility(supportAutoMode ? 0 : 8);
            }
            C23395hxS c23395hxS2 = (C23395hxS) fARcdN();
            if (c23395hxS2 != null && (c25337iun2 = c23395hxS2.OLrzqt) != null) {
                c25337iun2.setListener(new C30820liP(new AdvancedOtherChainSettingFragment$initMevDisplay$1(this)));
            }
            C23395hxS c23395hxS3 = (C23395hxS) fARcdN();
            if (c23395hxS3 == null || (c25299iuB3 = c23395hxS3.copydefault) == null) {
                return;
            }
            c25299iuB3.setVisibility(8);
            return;
        }
        C23395hxS c23395hxS4 = (C23395hxS) fARcdN();
        if (c23395hxS4 != null && (c25337iun = c23395hxS4.OLrzqt) != null) {
            c25337iun.setVisibility(8);
        }
        C23395hxS c23395hxS5 = (C23395hxS) fARcdN();
        if (c23395hxS5 != null && (c25299iuB2 = c23395hxS5.copydefault) != null) {
            c25299iuB2.setVisibility(0);
        }
        C23395hxS c23395hxS6 = (C23395hxS) fARcdN();
        if (c23395hxS6 == null || (c25299iuB = c23395hxS6.copydefault) == null) {
            return;
        }
        c25299iuB.setListener(new ActionBar());
    }

    public static final class ActionBar implements InterfaceC25348iuy {
        @Override // o.InterfaceC25348iuy
        public void copydefault() {
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC25348iuy
        public void KWHzl(boolean z) {
            AdvancedOtherChainSettingFragment.this.KWHzl(z ? PresetRouteType.RouteTypeMev : PresetRouteType.RouteTypeFast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(PresetRouteType presetRouteType) {
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        input.setRouterModeType(presetRouteType.getValue());
        EZpvd().KWHzl(EZpvd().isConnected());
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input3;
        }
        input2.setOpenMev(EZpvd().values());
        EZpvd().OLrzqt(presetRouteType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(String str) {
        C25299iuB c25299iuB;
        C25337iun c25337iun;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        C23395hxS c23395hxS = (C23395hxS) fARcdN();
        AdvancedSettingsContract.Input input = null;
        if (c23395hxS != null && (c25337iun = c23395hxS.OLrzqt) != null) {
            AdvancedSettingsContract.Input input2 = this.KWHzl;
            if (input2 == null) {
                Intrinsics.gEmmrt("");
                input2 = null;
            }
            TradeMode tradeMode = input2.getTradeMode();
            PresetRouteType presetRouteTypeEZpvd = PresetRouteType.Companion.EZpvd(str);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = AhwBna();
            String chainName = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainName() : null;
            String str2 = chainName == null ? "" : chainName;
            AdvancedMainConfig advancedMainConfigAEQbTJ = EZpvd().AEQbTJ();
            String mevPriceThreshold = advancedMainConfigAEQbTJ != null ? advancedMainConfigAEQbTJ.getMevPriceThreshold() : null;
            String str3 = mevPriceThreshold == null ? "" : mevPriceThreshold;
            AdvancedMainConfig advancedMainConfigAEQbTJ2 = EZpvd().AEQbTJ();
            boolean supportAutoMode = advancedMainConfigAEQbTJ2 != null ? advancedMainConfigAEQbTJ2.getSupportAutoMode() : false;
            MevUnstableShowLevelType.Activity activity = MevUnstableShowLevelType.Companion;
            AdvancedSettingsContract.Input input3 = this.KWHzl;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
                input3 = null;
            }
            AdvancedQuoteUiData quoteData = input3.getQuoteData();
            c25337iun.setData(new MevRouteParam(tradeMode, presetRouteTypeEZpvd, str2, str3, supportAutoMode, activity.copydefault((quoteData == null || (advancedQuoteAndCallDataKWHzl = quoteData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.fARcdN()), null, 64, null));
        }
        boolean zIsConnected = EZpvd().isConnected();
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        AdvancedMainConfig config = input4.getConfig();
        boolean supportAutoMode2 = config != null ? config.getSupportAutoMode() : false;
        C23395hxS c23395hxS2 = (C23395hxS) fARcdN();
        if (c23395hxS2 == null || (c25299iuB = c23395hxS2.copydefault) == null) {
            return;
        }
        AdvancedSettingsContract.Input input5 = this.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input = input5;
        }
        c25299iuB.setData(new MevSimpleParam(input.getTradeMode(), supportAutoMode2, zIsConnected, null, 8, null));
    }

    private final void hDKMBd() {
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = AhwBna();
        String chainName = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        interfaceC30614leVOLrzqt.OLrzqt(strAuCTel, orderType, chainName, chainId, tradeMode, input2.getTransaction());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSettingsPageClick$default(AdvancedOtherChainSettingFragment advancedOtherChainSettingFragment, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        advancedOtherChainSettingFragment.AEQbTJ(str, str2, map);
    }

    private final void AEQbTJ(String str, String str2, Map<String, String> map) {
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = AhwBna();
        String chainName = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        interfaceC30614leVOLrzqt.EZpvd(strAuCTel, orderType, tradeMode, chainName, chainId, str, str2, map, input2.getTransaction());
    }

    private final void iwGUEr() {
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = AhwBna();
        String chainName = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        String value = DexTrackEventParameter.ButtonName.CONFIRM.getValue();
        boolean zValues = EZpvd().values();
        PresetRouteType value2 = EZpvd().KWHzl().getValue();
        SlippageMode slippageModeDjBIcL = EZpvd().djBIcL();
        String value3 = EZpvd().AYXKKw().getValue();
        AdvancedSettingsContract.Input input5 = this.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        InterfaceC30614leV.ActionBar.trackSettingsSubmit$default(interfaceC30614leVOLrzqt, strAuCTel, orderType, tradeMode, chainName, chainId, value, zValues, value2, slippageModeDjBIcL, null, value3, input2.getTransaction(), null, 4608, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        C25337iun c25337iun;
        C25308iuK c25308iuK;
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.KWHzl;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.KWHzl;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = AhwBna();
        String chainName = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.KWHzl;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.KWHzl;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        yHO<String, String, Map<String, String>, Unit> yhoAEQbTJ = interfaceC30614leVOLrzqt.AEQbTJ(strAuCTel, orderType, tradeMode, chainName, chainId, input2.getTransaction());
        C23395hxS c23395hxS = (C23395hxS) fARcdN();
        if (c23395hxS != null && (c25308iuK = c23395hxS.gEmmrt) != null) {
            c25308iuK.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
        }
        C23395hxS c23395hxS2 = (C23395hxS) fARcdN();
        if (c23395hxS2 == null || (c25337iun = c23395hxS2.OLrzqt) == null) {
            return;
        }
        c25337iun.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
    }
}

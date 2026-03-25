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
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedCustomSolPresetVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData;
import com.okinc.business.trade.features.home.ui.cefi.data.PriorityFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment;
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
import o.AbstractC30856liz;
import o.C23272hvB;
import o.C23274hvD;
import o.C23313hvq;
import o.C23481hyz;
import o.C25299iuB;
import o.C25308iuK;
import o.C25337iun;
import o.C25390ivn;
import o.C30563ldX;
import o.C30565ldZ;
import o.C30622led;
import o.C30807liC;
import o.C30819liO;
import o.C30823liS;
import o.C30826liV;
import o.C31200lpY;
import o.C31256lqb;
import o.C33070mpX;
import o.C33129mqd;
import o.C52794wYp;
import o.C55001xbh;
import o.C55008xbo;
import o.C55239xgG;
import o.C55296xhK;
import o.C55298xhM;
import o.C56392yDr;
import o.C56424yEw;
import o.C56443yFo;
import o.C56524yIo;
import o.C59541ziw;
import o.InterfaceC25348iuy;
import o.InterfaceC30614leV;
import o.InterfaceC30853liw;
import o.InterfaceC56387yDm;
import o.InterfaceC59496ziD;
import o.hTI;
import o.pUU;
import o.rVN;
import o.wYF;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AdvancedSolSettingFragment extends AbstractC30856liz<C23481hyz> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AdvancedSettingsContract.Input AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public InterfaceC30853liw AhwBna;
    public PresetRouteType EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public AdvancedPriorityFeeType copydefault;

    @yCM
    public InterfaceC30614leV settingsTracker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedSolSettingFragment KWHzl(@NotNull InterfaceC30853liw interfaceC30853liw) {
        Intrinsics.checkNotNullParameter(interfaceC30853liw, "");
        this.AhwBna = interfaceC30853liw;
        return this;
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C23481hyz KWHzl(AdvancedSolSettingFragment advancedSolSettingFragment) {
        return (C23481hyz) advancedSolSettingFragment.fARcdN();
    }

    public AdvancedSolSettingFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedCustomSolPresetVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.lis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedSolSettingFragment.fJNWhG(this.AEQbTJ);
            }
        });
        this.EZpvd = PresetRouteType.RouteTypeAuto;
        this.copydefault = AdvancedPriorityFeeType.Market;
    }

    /* JADX DEBUG: Possible override for method o.liz.AEQbTJ()V */
    public final AdvancedCustomSolPresetVM AEQbTJ() {
        return (AdvancedCustomSolPresetVM) this.OLrzqt.getValue();
    }

    public final InterfaceC30614leV OLrzqt() {
        InterfaceC30614leV interfaceC30614leV = this.settingsTracker;
        if (interfaceC30614leV != null) {
            return interfaceC30614leV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Dialog implements TextWatcher {
        public final /* synthetic */ AdvancedSolSettingFragment AEQbTJ;
        public final /* synthetic */ C55001xbh KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Dialog(C55001xbh c55001xbh, AdvancedSolSettingFragment advancedSolSettingFragment) {
            this.KWHzl = c55001xbh;
            this.AEQbTJ = advancedSolSettingFragment;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C30807liC c30807liC;
            C23481hyz c23481hyzKWHzl;
            C30807liC c30807liC2;
            String strIsConnected = this.KWHzl.isConnected();
            if (C33129mqd.OLrzqt((CharSequence) strIsConnected) && (c23481hyzKWHzl = AdvancedSolSettingFragment.KWHzl(this.AEQbTJ)) != null && (c30807liC2 = c23481hyzKWHzl.KWHzl) != null) {
                c30807liC2.OLrzqt(this.AEQbTJ.AEQbTJ().AhwBna(), strIsConnected);
            }
            C23481hyz c23481hyzKWHzl2 = AdvancedSolSettingFragment.KWHzl(this.AEQbTJ);
            if (c23481hyzKWHzl2 != null && (c30807liC = c23481hyzKWHzl2.KWHzl) != null) {
                c30807liC.setPriorityMessageStyle(strIsConnected);
            }
            pUU.copydefault("MemeModeSettingBottomDialog", "okInputFieldCustomPriority listener event: isCustom: true\n>>>>priorityFee: " + strIsConnected);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DexMultiTokenInfoBean AYXKKw() {
        return (DexMultiTokenInfoBean) this.AYXKKw.getValue();
    }

    public static final DexMultiTokenInfoBean fJNWhG(AdvancedSolSettingFragment advancedSolSettingFragment) {
        return advancedSolSettingFragment.AEQbTJ().copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AdvancedSolSettingFragment OLrzqt(@NotNull AdvancedSettingsContract.Input input) {
            Intrinsics.checkNotNullParameter(input, "");
            AdvancedSolSettingFragment advancedSolSettingFragment = new AdvancedSolSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", input);
            C31200lpY.EZpvd(bundle, input.getSourceType());
            advancedSolSettingFragment.setArguments(bundle);
            return advancedSolSettingFragment;
        }
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        AdvancedSettingsContract.Input input;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (input = (AdvancedSettingsContract.Input) ((Parcelable) BundleCompat.getParcelable(arguments, "data", AdvancedSettingsContract.Input.class))) != null) {
            this.AEQbTJ = input;
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        wYF wyf;
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz == null || (wyf = c23481hyz.copydefault) == null) {
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
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.lil
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AdvancedSolSettingFragment.EZpvd(this.OLrzqt, view);
                }
            });
        }
        KWHzl(wyf);
    }

    public static final void EZpvd(AdvancedSolSettingFragment advancedSolSettingFragment, View view) {
        advancedSolSettingFragment.AEQbTJ().AhwBna();
        AdvancedSettingsContract.Input input = advancedSolSettingFragment.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedSettingsContract.Input input3 = advancedSolSettingFragment.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        input3.setPriorityFeeType(advancedSolSettingFragment.AEQbTJ().AhwBna());
        AdvancedSettingsContract.Input input4 = advancedSolSettingFragment.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        input4.setOpenMev(advancedSolSettingFragment.AEQbTJ().AkhnZx());
        AdvancedSettingsContract.Input input5 = advancedSolSettingFragment.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        input5.setRouterModeType(advancedSolSettingFragment.AEQbTJ().djBIcL().getValue().getValue());
        input.setPriorityValue(advancedSolSettingFragment.AEQbTJ().valueOf().getValue().OLrzqt());
        input.setSlippageValue(advancedSolSettingFragment.AEQbTJ().AYXKKw().getValue());
        input.setSlippageFeeType(advancedSolSettingFragment.AEQbTJ().DbNXlk());
        input.setPriorityFeeType(advancedSolSettingFragment.AEQbTJ().AhwBna());
        input.setSlippageMode(advancedSolSettingFragment.AEQbTJ().values());
        input.setMaxSlippage(advancedSolSettingFragment.AEQbTJ().OLrzqt());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = advancedSolSettingFragment.AEQbTJ();
        int iAhwBna = advancedSolSettingFragment.AEQbTJ().AhwBna();
        AdvancedSettingsContract.Input input6 = advancedSolSettingFragment.AEQbTJ;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        input.setTotalFee(C23313hvq.mulCheckS$default(advancedCustomSolPresetVMAEQbTJ.EZpvd(iAhwBna, input6.getQuoteData()), input.getPerTokenUsd(), null, null, null, 14, null));
        InterfaceC30853liw interfaceC30853liw = advancedSolSettingFragment.AhwBna;
        if (interfaceC30853liw != null) {
            AdvancedSettingsContract.Input input7 = advancedSolSettingFragment.AEQbTJ;
            if (input7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input7;
            }
            interfaceC30853liw.KWHzl(input2);
        }
        advancedSolSettingFragment.AuCTelauCTel();
    }

    private final void KWHzl(wYF wyf) {
        AdvancedSettingsContract.Input input = this.AEQbTJ;
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
                c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
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
            c52794wYpAEQbTJ4.setOnClickListener(new View.OnClickListener() { // from class: o.lik
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AdvancedSolSettingFragment.AEQbTJ(this.EZpvd, view);
                }
            });
        }
    }

    public static final void AEQbTJ(AdvancedSolSettingFragment advancedSolSettingFragment, View view) {
        FragmentActivity activity = advancedSolSettingFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ AdvancedSolSettingFragment AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, AdvancedSolSettingFragment advancedSolSettingFragment) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = advancedSolSettingFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.uzCIH();
                this.AEQbTJ.getNewProxyInstance();
                this.AEQbTJ.hDKMBd();
                AdvancedSolSettingFragment.trackSettingsPageClick$default(this.AEQbTJ, DexTrackEventParameter.ButtonName.RESET.getValue(), DexTrackEventParameter.ButtonType.TRADE.getValue(), null, 4, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        C25299iuB c25299iuB;
        C25299iuB c25299iuB2;
        C25337iun c25337iun;
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        PresetRouteType presetRouteType = !input.getTradeMode().isCopyTrading() ? PresetRouteType.RouteTypeAuto : this.EZpvd;
        AEQbTJ().AEQbTJ(presetRouteType);
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        if (!input3.getTradeMode().isCopyTrading()) {
            AEQbTJ(presetRouteType.getValue());
        } else {
            AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
            String value = presetRouteType.getValue();
            AdvancedSettingsContract.Input input4 = this.AEQbTJ;
            if (input4 == null) {
                Intrinsics.gEmmrt("");
                input4 = null;
            }
            boolean zOLrzqt = advancedCustomSolPresetVMAEQbTJ.OLrzqt(value, input4.getQuoteData());
            AdvancedSettingsContract.Input input5 = this.AEQbTJ;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
                input5 = null;
            }
            AdvancedMainConfig config = input5.getConfig();
            boolean supportAutoMode = config != null ? config.getSupportAutoMode() : false;
            C23481hyz c23481hyz = (C23481hyz) fARcdN();
            if (c23481hyz != null && (c25299iuB = c23481hyz.EZpvd) != null) {
                AdvancedSettingsContract.Input input6 = this.AEQbTJ;
                if (input6 == null) {
                    Intrinsics.gEmmrt("");
                    input6 = null;
                }
                c25299iuB.setData(new MevSimpleParam(input6.getTradeMode(), supportAutoMode, zOLrzqt, null, 8, null));
            }
        }
        AdvancedSettingsContract.Input input7 = this.AEQbTJ;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        AdvancedMainConfig config2 = input7.getConfig();
        boolean supportAutoMode2 = config2 != null ? config2.getSupportAutoMode() : false;
        C23481hyz c23481hyz2 = (C23481hyz) fARcdN();
        if (c23481hyz2 != null && (c25337iun = c23481hyz2.OLrzqt) != null) {
            AdvancedSettingsContract.Input input8 = this.AEQbTJ;
            if (input8 == null) {
                Intrinsics.gEmmrt("");
                input8 = null;
            }
            c25337iun.setVisibility((input8.getTradeMode().isCopyTrading() || !supportAutoMode2) ? 8 : 0);
        }
        C23481hyz c23481hyz3 = (C23481hyz) fARcdN();
        if (c23481hyz3 == null || (c25299iuB2 = c23481hyz3.EZpvd) == null) {
            return;
        }
        AdvancedSettingsContract.Input input9 = this.AEQbTJ;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input9;
        }
        c25299iuB2.setVisibility(input2.getTradeMode().isCopyTrading() ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        int slippageFeeType;
        C25308iuK c25308iuK;
        C55008xbo c55008xboEZpvd;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboAEQbTJ;
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz != null && (c25308iuK2 = c23481hyz.valueOf) != null && (c55008xboAEQbTJ = c25308iuK2.AEQbTJ()) != null) {
            c55008xboAEQbTJ.setText("");
        }
        C23481hyz c23481hyz2 = (C23481hyz) fARcdN();
        if (c23481hyz2 != null && (c25308iuK = c23481hyz2.valueOf) != null && (c55008xboEZpvd = c25308iuK.EZpvd()) != null) {
            c55008xboEZpvd.setText("");
        }
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        String maxSlippage = null;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        SlippageMode slippageMode = !input.getTradeMode().isCopyTrading() ? SlippageMode.Dynamic : SlippageMode.Fixed;
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        input3.setSlippageMode(slippageMode);
        AEQbTJ().OLrzqt(slippageMode);
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        if (input4.getTradeMode().isCopyTrading()) {
            AdvancedSettingsContract.Input input5 = this.AEQbTJ;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
                input5 = null;
            }
            slippageFeeType = input5.getSlippageFeeType();
        } else {
            slippageFeeType = AdvancedSlippageType.Auto.getValue();
        }
        advancedCustomSolPresetVMAEQbTJ.copydefault(slippageFeeType);
        AdvancedSettingsContract.Input input6 = this.AEQbTJ;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        if (!input6.getTradeMode().isCopyTrading()) {
            AEQbTJ().copydefault(djBIcL());
        }
        AdvancedSettingsContract.Input input7 = this.AEQbTJ;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        if (input7.getTradeMode().isCopyTrading()) {
            AdvancedSettingsContract.Input input8 = this.AEQbTJ;
            if (input8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input8;
            }
            maxSlippage = input2.getMaxSlippage();
        }
        EZpvd(slippageMode, maxSlippage);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        int value;
        C30807liC c30807liC;
        C55001xbh c55001xbhAEQbTJ;
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz != null && (c30807liC = c23481hyz.KWHzl) != null && (c55001xbhAEQbTJ = c30807liC.AEQbTJ()) != null) {
            c55001xbhAEQbTJ.setText("");
        }
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        if (!input.getTradeMode().isCopyTrading()) {
            value = AdvancedPriorityFeeType.Market.getValue();
        } else {
            value = this.copydefault.getValue();
        }
        AdvancedSettingsContract.Input input2 = this.AEQbTJ;
        if (input2 == null) {
            Intrinsics.gEmmrt("");
            input2 = null;
        }
        input2.setPriorityFeeType(value);
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ2 = AEQbTJ();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        advancedCustomSolPresetVMAEQbTJ.AEQbTJ(new PriorityParam(advancedCustomSolPresetVMAEQbTJ2.KWHzl(value, input3.getQuoteData()), value, false, 4, (DefaultConstructorMarker) null));
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ3 = AEQbTJ();
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        AdvancedQuoteUiData quoteData = input4.getQuoteData();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AYXKKw();
        String tokenSymbol = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getTokenSymbol() : null;
        advancedCustomSolPresetVMAEQbTJ3.AEQbTJ(value, quoteData, tokenSymbol != null ? tokenSymbol : "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C30807liC c30807liC;
        C30807liC c30807liC2;
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz != null && (c30807liC2 = c23481hyz.KWHzl) != null) {
            c30807liC2.setFeeValueCallback(new Function1() { // from class: o.lim
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedSolSettingFragment.KWHzl(this.AEQbTJ, (PriorityParam) obj);
                }
            });
        }
        C23481hyz c23481hyz2 = (C23481hyz) fARcdN();
        C55001xbh c55001xbhAEQbTJ = (c23481hyz2 == null || (c30807liC = c23481hyz2.KWHzl) == null) ? null : c30807liC.AEQbTJ();
        if (c55001xbhAEQbTJ != null) {
            c55001xbhAEQbTJ.addTextChangedListener(new Dialog(c55001xbhAEQbTJ, this));
        }
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().KWHzl(), null, new LoaderManager(), 2, null);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, this, new InterfaceC59496ziD() { // from class: o.lip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                AdvancedSolSettingFragment.EZpvd(this.EZpvd, z);
            }
        });
    }

    public static final Unit KWHzl(AdvancedSolSettingFragment advancedSolSettingFragment, PriorityParam priorityParam) {
        Intrinsics.checkNotNullParameter(priorityParam, "");
        AdvancedSettingsContract.Input input = advancedSolSettingFragment.AEQbTJ;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        input.setPriorityFeeType(priorityParam.getPriorityType());
        advancedSolSettingFragment.AEQbTJ().AEQbTJ(priorityParam);
        return Unit.INSTANCE;
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<PrioritySelectionBean> list, Continuation<? super Unit> continuation) {
            C30807liC c30807liC;
            Object objAEQbTJ;
            String strAEQbTJ;
            String strKWHzl;
            String decimals;
            PriorityFeeInfo priorityFeeInfo;
            PriorityFeeInfo priorityFeeInfo2;
            C23481hyz c23481hyzKWHzl = AdvancedSolSettingFragment.KWHzl(AdvancedSolSettingFragment.this);
            if (c23481hyzKWHzl != null && (c30807liC = c23481hyzKWHzl.KWHzl) != null) {
                String value = MemeChainType.MemeChainTypeSol.getValue();
                if (list == null) {
                    list = yDY.AhwBna();
                }
                List<PrioritySelectionBean> list2 = list;
                PriorityFeeInfo priorityFeeInfoEZpvd = AdvancedSolSettingFragment.this.AEQbTJ().EZpvd();
                if (priorityFeeInfoEZpvd == null || (objAEQbTJ = priorityFeeInfoEZpvd.getMaxValue()) == null) {
                    objAEQbTJ = C56443yFo.AEQbTJ(5);
                }
                String string = objAEQbTJ.toString();
                AdvancedSettingsContract.Input input = AdvancedSolSettingFragment.this.AEQbTJ;
                AdvancedSettingsContract.Input input2 = null;
                if (input == null) {
                    Intrinsics.gEmmrt("");
                    input = null;
                }
                AdvancedMainConfig config = input.getConfig();
                if (config == null || (priorityFeeInfo2 = config.getPriorityFeeInfo()) == null || (strAEQbTJ = priorityFeeInfo2.getMin()) == null) {
                    AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AdvancedSolSettingFragment.this.AEQbTJ();
                    AdvancedSettingsContract.Input input3 = AdvancedSolSettingFragment.this.AEQbTJ;
                    if (input3 == null) {
                        Intrinsics.gEmmrt("");
                        input3 = null;
                    }
                    strAEQbTJ = advancedCustomSolPresetVMAEQbTJ.AEQbTJ(input3.getQuoteData());
                }
                AdvancedSettingsContract.Input input4 = AdvancedSolSettingFragment.this.AEQbTJ;
                if (input4 == null) {
                    Intrinsics.gEmmrt("");
                    input4 = null;
                }
                AdvancedMainConfig config2 = input4.getConfig();
                if (config2 == null || (priorityFeeInfo = config2.getPriorityFeeInfo()) == null || (strKWHzl = priorityFeeInfo.getMaxValue()) == null) {
                    AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ2 = AdvancedSolSettingFragment.this.AEQbTJ();
                    AdvancedSettingsContract.Input input5 = AdvancedSolSettingFragment.this.AEQbTJ;
                    if (input5 == null) {
                        Intrinsics.gEmmrt("");
                        input5 = null;
                    }
                    strKWHzl = advancedCustomSolPresetVMAEQbTJ2.KWHzl(input5.getQuoteData());
                }
                DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AdvancedSolSettingFragment.this.AYXKKw();
                String tokenSymbol = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getTokenSymbol() : null;
                String str = tokenSymbol == null ? "" : tokenSymbol;
                DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw2 = AdvancedSolSettingFragment.this.AYXKKw();
                if (dexMultiTokenInfoBeanAYXKKw2 == null || (decimals = dexMultiTokenInfoBeanAYXKKw2.getDecimals()) == null) {
                    decimals = "12";
                }
                String str2 = decimals;
                int iAhwBna = AdvancedSolSettingFragment.this.AEQbTJ().AhwBna();
                String strOLrzqt = AdvancedSolSettingFragment.this.AEQbTJ().valueOf().getValue().OLrzqt();
                AdvancedSettingsContract.Input input6 = AdvancedSolSettingFragment.this.AEQbTJ;
                if (input6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    input2 = input6;
                }
                c30807liC.setData(value, list2, string, strAEQbTJ, strKWHzl, iAhwBna, strOLrzqt, str, str2, false, hTI.OLrzqt(input2.getSourceType()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(AdvancedSolSettingFragment advancedSolSettingFragment, boolean z) {
        C30807liC c30807liC;
        C55001xbh c55001xbhAEQbTJ;
        C25308iuK c25308iuK;
        C55008xbo c55008xboAEQbTJ;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboEZpvd;
        if (z) {
            return;
        }
        C23481hyz c23481hyz = (C23481hyz) advancedSolSettingFragment.fARcdN();
        if (c23481hyz != null && (c25308iuK2 = c23481hyz.valueOf) != null && (c55008xboEZpvd = c25308iuK2.EZpvd()) != null) {
            c55008xboEZpvd.clearFocus();
        }
        C23481hyz c23481hyz2 = (C23481hyz) advancedSolSettingFragment.fARcdN();
        if (c23481hyz2 != null && (c25308iuK = c23481hyz2.valueOf) != null && (c55008xboAEQbTJ = c25308iuK.AEQbTJ()) != null) {
            c55008xboAEQbTJ.clearFocus();
        }
        C23481hyz c23481hyz3 = (C23481hyz) advancedSolSettingFragment.fARcdN();
        if (c23481hyz3 == null || (c30807liC = c23481hyz3.KWHzl) == null || (c55001xbhAEQbTJ = c30807liC.AEQbTJ()) == null) {
            return;
        }
        c55001xbhAEQbTJ.clearFocus();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void iwGUEr() {
        C25308iuK c25308iuK;
        C30826liV c30826liV = new C30826liV(AEQbTJ());
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParamCopydefault = null;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        AutoSlippageInfo autoSlippageInfo = input3.getAutoSlippageInfo();
        if (autoSlippageInfo != null) {
            AdvancedSettingsContract.Input input4 = this.AEQbTJ;
            if (input4 == null) {
                Intrinsics.gEmmrt("");
                input4 = null;
            }
            int type = input4.getSlippageMode().getType();
            AdvancedSettingsContract.Input input5 = this.AEQbTJ;
            if (input5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input5;
            }
            dexAutoSlippageInfoParamCopydefault = C30622led.copydefault(autoSlippageInfo, type, input2.getSlippageValue());
        }
        c30826liV.OLrzqt(quoteData, dexAutoSlippageInfoParamCopydefault);
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz != null && (c25308iuK = c23481hyz.valueOf) != null) {
            c25308iuK.setListener(c30826liV);
        }
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().isConnected(), null, new Fragment(), 2, null);
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SlippageSelectionBean> list, Continuation<? super Unit> continuation) {
            AdvancedSettingsContract.Input input = AdvancedSolSettingFragment.this.AEQbTJ;
            AdvancedSettingsContract.Input input2 = null;
            if (input == null) {
                Intrinsics.gEmmrt("");
                input = null;
            }
            SlippageMode slippageMode = input.getSlippageMode();
            AdvancedSolSettingFragment advancedSolSettingFragment = AdvancedSolSettingFragment.this;
            AdvancedSettingsContract.Input input3 = advancedSolSettingFragment.AEQbTJ;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                input2 = input3;
            }
            advancedSolSettingFragment.EZpvd(slippageMode, input2.getMaxSlippage());
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(SlippageMode slippageMode, String str) {
        C25308iuK c25308iuK;
        String slippageValue;
        SlippageFeeType slippageFeeTypeOLrzqt;
        DexMultiTokenInfoBean second;
        Boolean supportMaxSlippage;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        Pair<Boolean, DexMultiTokenInfoBean> pairEjfBZ = (quoteData == null || (advancedQuoteAndCallDataKWHzl = quoteData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.ejfBZ();
        AdvancedSettingsContract.Input input2 = this.AEQbTJ;
        if (input2 == null) {
            Intrinsics.gEmmrt("");
            input2 = null;
        }
        AdvancedMainConfig config = input2.getConfig();
        MinMaxData slippageConfig = config != null ? config.getSlippageConfig() : null;
        boolean zEZpvd = Intrinsics.EZpvd((Object) AuCTel(), (Object) "cefi_mode");
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz == null || (c25308iuK = c23481hyz.valueOf) == null) {
            return;
        }
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        AutoSlippageInfo autoSlippageInfo = input4.getAutoSlippageInfo();
        boolean zBooleanValue = (autoSlippageInfo == null || (supportMaxSlippage = autoSlippageInfo.getSupportMaxSlippage()) == null) ? false : supportMaxSlippage.booleanValue();
        AdvancedSettingsContract.Input input5 = this.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        AutoSlippageInfo autoSlippageInfo2 = input5.getAutoSlippageInfo();
        String referenceSlippage = autoSlippageInfo2 != null ? autoSlippageInfo2.getReferenceSlippage() : null;
        String strDjBIcL = djBIcL();
        AdvancedSettingsContract.Input input6 = this.AEQbTJ;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        AutoSlippageInfo autoSlippageInfo3 = input6.getAutoSlippageInfo();
        String dynamicSlippageRangeMin = autoSlippageInfo3 != null ? autoSlippageInfo3.getDynamicSlippageRangeMin() : null;
        String str2 = dynamicSlippageRangeMin == null ? "" : dynamicSlippageRangeMin;
        AdvancedSettingsContract.Input input7 = this.AEQbTJ;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        AutoSlippageInfo autoSlippageInfo4 = input7.getAutoSlippageInfo();
        String dynamicSlippageRangeMax = autoSlippageInfo4 != null ? autoSlippageInfo4.getDynamicSlippageRangeMax() : null;
        String str3 = dynamicSlippageRangeMax == null ? "" : dynamicSlippageRangeMax;
        AdvancedSettingsContract.Input input8 = this.AEQbTJ;
        if (input8 == null) {
            Intrinsics.gEmmrt("");
            input8 = null;
        }
        AutoSlippageInfo autoSlippageInfo5 = input8.getAutoSlippageInfo();
        String recommendSlippageRangeMin = autoSlippageInfo5 != null ? autoSlippageInfo5.getRecommendSlippageRangeMin() : null;
        String str4 = recommendSlippageRangeMin == null ? "" : recommendSlippageRangeMin;
        AdvancedSettingsContract.Input input9 = this.AEQbTJ;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
            input9 = null;
        }
        AutoSlippageInfo autoSlippageInfo6 = input9.getAutoSlippageInfo();
        String recommendSlippageRangeMax = autoSlippageInfo6 != null ? autoSlippageInfo6.getRecommendSlippageRangeMax() : null;
        String str5 = recommendSlippageRangeMax == null ? "" : recommendSlippageRangeMax;
        String tokenSymbol = (pairEjfBZ == null || (second = pairEjfBZ.getSecond()) == null) ? null : second.getTokenSymbol();
        boolean zBooleanValue2 = pairEjfBZ != null ? pairEjfBZ.getFirst().booleanValue() : false;
        AdvancedSettingsContract.Input input10 = this.AEQbTJ;
        if (input10 == null) {
            Intrinsics.gEmmrt("");
            input10 = null;
        }
        DynamicParam dynamicParam = new DynamicParam(zBooleanValue, str, referenceSlippage, strDjBIcL, str2, str3, str4, str5, false, !input10.getTradeMode().isCopyTrading(), tokenSymbol, zBooleanValue2, false, false, null, 20736, null);
        SlippageMode slippageMode2 = SlippageMode.Fixed;
        if (slippageMode == slippageMode2) {
            AdvancedSettingsContract.Input input11 = this.AEQbTJ;
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
            AdvancedSettingsContract.Input input12 = this.AEQbTJ;
            if (input12 == null) {
                Intrinsics.gEmmrt("");
                input12 = null;
            }
            slippageFeeTypeOLrzqt = taskDescription.OLrzqt(input12.getSlippageFeeType());
        } else {
            slippageFeeTypeOLrzqt = SlippageFeeType.SlippageLow;
        }
        SlippageFeeType slippageFeeType = slippageFeeTypeOLrzqt;
        AdvancedSettingsContract.Input input13 = this.AEQbTJ;
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
        AdvancedSettingsContract.Input input14 = this.AEQbTJ;
        if (input14 == null) {
            Intrinsics.gEmmrt("");
            input14 = null;
        }
        AutoSlippageInfo autoSlippageInfo8 = input14.getAutoSlippageInfo();
        String recommendSlippageRangeMax2 = autoSlippageInfo8 != null ? autoSlippageInfo8.getRecommendSlippageRangeMax() : null;
        String str8 = recommendSlippageRangeMax2 == null ? "" : recommendSlippageRangeMax2;
        AdvancedSettingsContract.Input input15 = this.AEQbTJ;
        if (input15 == null) {
            Intrinsics.gEmmrt("");
            input15 = null;
        }
        AutoSlippageInfo autoSlippageInfo9 = input15.getAutoSlippageInfo();
        String recommendSlippageRangeMin2 = autoSlippageInfo9 != null ? autoSlippageInfo9.getRecommendSlippageRangeMin() : null;
        c25308iuK.setData(new SlippageViewParam(tradeMode, slippageMode, dynamicParam, new FixedParam(slippageValue, shortcutFixSlippage, str6, str7, slippageFeeType, !zEZpvd, null, str8, recommendSlippageRangeMin2 == null ? "" : recommendSlippageRangeMin2, null, 576, null)));
    }

    private final String djBIcL() {
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AutoSlippageInfo autoSlippageInfo = input.getAutoSlippageInfo();
        String autoSlippage = autoSlippageInfo != null ? autoSlippageInfo.getAutoSlippage() : null;
        return C31256lqb.KWHzl(autoSlippage != null ? autoSlippage : "", (Function0<String>) new Function0() { // from class: o.lit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedSolSettingFragment.values(this.EZpvd);
            }
        });
    }

    public static final String values(AdvancedSolSettingFragment advancedSolSettingFragment) {
        AdvancedSettingsContract.Input input = advancedSolSettingFragment.AEQbTJ;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AutoSlippageInfo autoSlippageInfo = input.getAutoSlippageInfo();
        String referenceSlippage = autoSlippageInfo != null ? autoSlippageInfo.getReferenceSlippage() : null;
        return referenceSlippage == null ? "" : referenceSlippage;
    }

    private final void AkhnZx() {
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(AEQbTJ().AYXKKw(), AEQbTJ().valueOf(), AEQbTJ().gEmmrt(), new AdvancedSolSettingFragment$initListener$1(null)), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().djBIcL(), null, new Application(), 2, null);
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
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
                    AdvancedSettingsContract.Input input = AdvancedSolSettingFragment.this.AEQbTJ;
                    if (input == null) {
                        Intrinsics.gEmmrt("");
                        input = null;
                    }
                    if (input.getQuoteData() == null) {
                    }
                }
                z = false;
            }
            C23481hyz c23481hyzKWHzl = AdvancedSolSettingFragment.KWHzl(AdvancedSolSettingFragment.this);
            if (c23481hyzKWHzl != null && (wyf = c23481hyzKWHzl.copydefault) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                if (z && c30563ldXComponent2.KWHzl()) {
                    z2 = true;
                }
                c52794wYpCopydefault.setEnabled(z2);
            }
            AdvancedSolSettingFragment.this.EZpvd();
            return Unit.INSTANCE;
        }
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(PresetRouteType presetRouteType, Continuation<? super Unit> continuation) {
            C23481hyz c23481hyzKWHzl;
            C25299iuB c25299iuB;
            AppCompatTextView appCompatTextViewCopydefault;
            C25299iuB c25299iuB2;
            C55239xgG c55239xgGEZpvd;
            AdvancedSettingsContract.Input input = AdvancedSolSettingFragment.this.AEQbTJ;
            if (input == null) {
                Intrinsics.gEmmrt("");
                input = null;
            }
            if (input.getTradeMode().isCopyTrading() && (c23481hyzKWHzl = AdvancedSolSettingFragment.KWHzl(AdvancedSolSettingFragment.this)) != null && (c25299iuB = c23481hyzKWHzl.EZpvd) != null && (appCompatTextViewCopydefault = c25299iuB.copydefault()) != null) {
                C23481hyz c23481hyzKWHzl2 = AdvancedSolSettingFragment.KWHzl(AdvancedSolSettingFragment.this);
                appCompatTextViewCopydefault.setVisibility((c23481hyzKWHzl2 == null || (c25299iuB2 = c23481hyzKWHzl2.EZpvd) == null || (c55239xgGEZpvd = c25299iuB2.EZpvd()) == null || c55239xgGEZpvd.isChecked()) ? 8 : 0);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fJNWhG() {
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        String slippageValue = input.getSlippageValue();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        int slippageFeeType = input3.getSlippageFeeType();
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input4;
        }
        advancedCustomSolPresetVMAEQbTJ.copydefault(slippageValue, slippageFeeType, input2.getAutoSlippageValue());
    }

    private final void isConnected() {
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        int priorityFeeType = input.getPriorityFeeType();
        AdvancedSettingsContract.Input input2 = this.AEQbTJ;
        if (input2 == null) {
            Intrinsics.gEmmrt("");
            input2 = null;
        }
        AdvancedQuoteUiData quoteData = input2.getQuoteData();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AYXKKw();
        String tokenSymbol = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getTokenSymbol() : null;
        advancedCustomSolPresetVMAEQbTJ.AEQbTJ(priorityFeeType, quoteData, tokenSymbol != null ? tokenSymbol : "");
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C23481hyz OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23481hyz c23481hyzEZpvd = C23481hyz.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23481hyzEZpvd, "");
        return c23481hyzEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C23481hyz c23481hyz, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c23481hyz, "");
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        advancedCustomSolPresetVMAEQbTJ.copydefault(input.getSlippageFeeType());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ2 = AEQbTJ();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        advancedCustomSolPresetVMAEQbTJ2.AEQbTJ(input3.getPriorityFeeType());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ3 = AEQbTJ();
        PresetRouteType.TaskDescription taskDescription = PresetRouteType.Companion;
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        advancedCustomSolPresetVMAEQbTJ3.AEQbTJ(taskDescription.EZpvd(input4.getRouterModeType()));
        AdvancedSettingsContract.Input input5 = this.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        this.EZpvd = taskDescription.EZpvd(input5.getRouterModeType());
        AdvancedPriorityFeeType.Activity activity = AdvancedPriorityFeeType.Companion;
        AdvancedSettingsContract.Input input6 = this.AEQbTJ;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        this.copydefault = activity.EZpvd(input6.getPriorityFeeType());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ4 = AEQbTJ();
        AdvancedSettingsContract.Input input7 = this.AEQbTJ;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
            input7 = null;
        }
        advancedCustomSolPresetVMAEQbTJ4.KWHzl(input7.isOpenMev());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ5 = AEQbTJ();
        AdvancedSettingsContract.Input input8 = this.AEQbTJ;
        if (input8 == null) {
            Intrinsics.gEmmrt("");
            input8 = null;
        }
        String slippageValue = input8.getSlippageValue();
        AdvancedSettingsContract.Input input9 = this.AEQbTJ;
        if (input9 == null) {
            Intrinsics.gEmmrt("");
            input9 = null;
        }
        SlippageMode slippageMode = input9.getSlippageMode();
        AdvancedSettingsContract.Input input10 = this.AEQbTJ;
        if (input10 == null) {
            Intrinsics.gEmmrt("");
            input10 = null;
        }
        int priorityFeeType = input10.getPriorityFeeType();
        AdvancedSettingsContract.Input input11 = this.AEQbTJ;
        if (input11 == null) {
            Intrinsics.gEmmrt("");
            input11 = null;
        }
        advancedCustomSolPresetVMAEQbTJ5.OLrzqt(slippageValue, slippageMode, priorityFeeType, input11.getPriorityValue());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ6 = AEQbTJ();
        AdvancedSettingsContract.Input input12 = this.AEQbTJ;
        if (input12 == null) {
            Intrinsics.gEmmrt("");
            input12 = null;
        }
        advancedCustomSolPresetVMAEQbTJ6.OLrzqt(input12.getMaxSlippage());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ7 = AEQbTJ();
        AdvancedSettingsContract.Input input13 = this.AEQbTJ;
        if (input13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input13;
        }
        advancedCustomSolPresetVMAEQbTJ7.KWHzl(input2.getConfig());
        fetchVPNInfo();
        fJNWhG();
        isConnected();
        values();
        AkhnZx();
        iwGUEr();
        KWHzl();
        zLjUOn();
        getFieldNames();
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o.lin
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AdvancedSolSettingFragment.DbNXlk(this.KWHzl);
                }
            });
        }
    }

    public static final void DbNXlk(AdvancedSolSettingFragment advancedSolSettingFragment) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) advancedSolSettingFragment, true, (String) null, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd() {
        C30807liC c30807liC;
        C30807liC c30807liC2;
        boolean z;
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        int iAhwBna = AEQbTJ().AhwBna();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        String strEZpvd = advancedCustomSolPresetVMAEQbTJ.EZpvd(iAhwBna, input.getQuoteData());
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz != null && (c30807liC2 = c23481hyz.KWHzl) != null) {
            String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.prepareFromUri);
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            AdvancedSettingsContract.Input input3 = this.AEQbTJ;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
                input3 = null;
            }
            String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, C23313hvq.mulCheckS$default(strEZpvd, input3.getPerTokenUsd(), null, null, null, 14, null), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            AdvancedSettingsContract.Input input4 = this.AEQbTJ;
            if (input4 == null) {
                Intrinsics.gEmmrt("");
                input4 = null;
            }
            if (input4.getQuoteData() == null) {
                z = false;
                c30807liC2.setTotalFeeView(strAYXKKw, scientificCurrency$default, true, z);
            } else {
                AdvancedSettingsContract.Input input5 = this.AEQbTJ;
                if (input5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    input2 = input5;
                }
                if (!input2.getTradeMode().isCopyTrading()) {
                    z = true;
                }
                c30807liC2.setTotalFeeView(strAYXKKw, scientificCurrency$default, true, z);
            }
        }
        C23481hyz c23481hyz2 = (C23481hyz) fARcdN();
        if (c23481hyz2 == null || (c30807liC = c23481hyz2.KWHzl) == null) {
            return;
        }
        c30807liC.setTotalFeeShowDetailDialog(new Function0() { // from class: o.lir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedSolSettingFragment.fetchVPNInfo(this.EZpvd);
            }
        });
    }

    public static final Unit fetchVPNInfo(AdvancedSolSettingFragment advancedSolSettingFragment) {
        if (advancedSolSettingFragment.AEQbTJ == null) {
            Intrinsics.gEmmrt("");
        }
        Context contextRequireContext = advancedSolSettingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = advancedSolSettingFragment.AEQbTJ();
        AdvancedSettingsContract.Input input = advancedSolSettingFragment.AEQbTJ;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = advancedSolSettingFragment.AYXKKw();
        String tokenSymbol = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getTokenSymbol() : null;
        new C30819liO(contextRequireContext, advancedCustomSolPresetVMAEQbTJ, input, tokenSymbol != null ? tokenSymbol : "").EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        C25299iuB c25299iuB;
        C25299iuB c25299iuB2;
        C25337iun c25337iun;
        C25299iuB c25299iuB3;
        C25337iun c25337iun2;
        C25337iun c25337iun3;
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        AEQbTJ(input.getRouterModeType());
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        AdvancedMainConfig config = input3.getConfig();
        boolean supportAutoMode = config != null ? config.getSupportAutoMode() : false;
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input4;
        }
        if (!input2.getTradeMode().isCopyTrading()) {
            C23481hyz c23481hyz = (C23481hyz) fARcdN();
            if (c23481hyz != null && (c25337iun3 = c23481hyz.OLrzqt) != null) {
                c25337iun3.setVisibility(supportAutoMode ? 0 : 8);
            }
            C23481hyz c23481hyz2 = (C23481hyz) fARcdN();
            if (c23481hyz2 != null && (c25337iun2 = c23481hyz2.OLrzqt) != null) {
                c25337iun2.setListener(new C30823liS(new AdvancedSolSettingFragment$initMevDisplay$1(this)));
            }
            C23481hyz c23481hyz3 = (C23481hyz) fARcdN();
            if (c23481hyz3 == null || (c25299iuB3 = c23481hyz3.EZpvd) == null) {
                return;
            }
            c25299iuB3.setVisibility(8);
            return;
        }
        C23481hyz c23481hyz4 = (C23481hyz) fARcdN();
        if (c23481hyz4 != null && (c25337iun = c23481hyz4.OLrzqt) != null) {
            c25337iun.setVisibility(8);
        }
        C23481hyz c23481hyz5 = (C23481hyz) fARcdN();
        if (c23481hyz5 != null && (c25299iuB2 = c23481hyz5.EZpvd) != null) {
            c25299iuB2.setVisibility(0);
        }
        C23481hyz c23481hyz6 = (C23481hyz) fARcdN();
        if (c23481hyz6 == null || (c25299iuB = c23481hyz6.EZpvd) == null) {
            return;
        }
        c25299iuB.setListener(new Activity());
    }

    public static final class Activity implements InterfaceC25348iuy {
        @Override // o.InterfaceC25348iuy
        public void copydefault() {
        }

        public Activity() {
        }

        @Override // o.InterfaceC25348iuy
        public void KWHzl(boolean z) {
            AdvancedSolSettingFragment.this.KWHzl(z ? PresetRouteType.RouteTypeMev : PresetRouteType.RouteTypeFast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(PresetRouteType presetRouteType) {
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        input.setRouterModeType(presetRouteType.getValue());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ2 = AEQbTJ();
        String value = presetRouteType.getValue();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        advancedCustomSolPresetVMAEQbTJ.KWHzl(advancedCustomSolPresetVMAEQbTJ2.OLrzqt(value, input3.getQuoteData()));
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input4;
        }
        input2.setOpenMev(AEQbTJ().AkhnZx());
        AEQbTJ().AEQbTJ(presetRouteType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ(String str) {
        C25299iuB c25299iuB;
        C25337iun c25337iun;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        AdvancedSettingsContract.Input input = null;
        if (c23481hyz != null && (c25337iun = c23481hyz.OLrzqt) != null) {
            AdvancedSettingsContract.Input input2 = this.AEQbTJ;
            if (input2 == null) {
                Intrinsics.gEmmrt("");
                input2 = null;
            }
            TradeMode tradeMode = input2.getTradeMode();
            PresetRouteType presetRouteTypeEZpvd = PresetRouteType.Companion.EZpvd(str);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AYXKKw();
            String chainName = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getChainName() : null;
            String str2 = chainName == null ? "" : chainName;
            AdvancedMainConfig advancedMainConfigAEQbTJ = AEQbTJ().AEQbTJ();
            String mevPriceThreshold = advancedMainConfigAEQbTJ != null ? advancedMainConfigAEQbTJ.getMevPriceThreshold() : null;
            String str3 = mevPriceThreshold == null ? "" : mevPriceThreshold;
            AdvancedMainConfig advancedMainConfigAEQbTJ2 = AEQbTJ().AEQbTJ();
            boolean supportAutoMode = advancedMainConfigAEQbTJ2 != null ? advancedMainConfigAEQbTJ2.getSupportAutoMode() : false;
            MevUnstableShowLevelType.Activity activity = MevUnstableShowLevelType.Companion;
            AdvancedSettingsContract.Input input3 = this.AEQbTJ;
            if (input3 == null) {
                Intrinsics.gEmmrt("");
                input3 = null;
            }
            AdvancedQuoteUiData quoteData = input3.getQuoteData();
            c25337iun.setData(new MevRouteParam(tradeMode, presetRouteTypeEZpvd, str2, str3, supportAutoMode, activity.copydefault((quoteData == null || (advancedQuoteAndCallDataKWHzl = quoteData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.fARcdN()), null, 64, null));
        }
        AdvancedCustomSolPresetVM advancedCustomSolPresetVMAEQbTJ = AEQbTJ();
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String routerModeType = input4.getRouterModeType();
        AdvancedSettingsContract.Input input5 = this.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
            input5 = null;
        }
        boolean zOLrzqt = advancedCustomSolPresetVMAEQbTJ.OLrzqt(routerModeType, input5.getQuoteData());
        AdvancedSettingsContract.Input input6 = this.AEQbTJ;
        if (input6 == null) {
            Intrinsics.gEmmrt("");
            input6 = null;
        }
        AdvancedMainConfig config = input6.getConfig();
        boolean supportAutoMode2 = config != null ? config.getSupportAutoMode() : false;
        C23481hyz c23481hyz2 = (C23481hyz) fARcdN();
        if (c23481hyz2 == null || (c25299iuB = c23481hyz2.EZpvd) == null) {
            return;
        }
        AdvancedSettingsContract.Input input7 = this.AEQbTJ;
        if (input7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input = input7;
        }
        c25299iuB.setData(new MevSimpleParam(input.getTradeMode(), supportAutoMode2, zOLrzqt, null, 8, null));
    }

    private final void zLjUOn() {
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AYXKKw();
        String chainName = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        interfaceC30614leVOLrzqt.OLrzqt(strAuCTel, orderType, chainName, chainId, tradeMode, input2.getTransaction());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSettingsPageClick$default(AdvancedSolSettingFragment advancedSolSettingFragment, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        advancedSolSettingFragment.EZpvd(str, str2, map);
    }

    private final void EZpvd(String str, String str2, Map<String, String> map) {
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AYXKKw();
        String chainName = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        interfaceC30614leVOLrzqt.EZpvd(strAuCTel, orderType, tradeMode, chainName, chainId, str, str2, map, input2.getTransaction());
    }

    private final void AuCTelauCTel() {
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AYXKKw();
        String chainName = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        String value = DexTrackEventParameter.ButtonName.CONFIRM.getValue();
        boolean zAkhnZx = AEQbTJ().AkhnZx();
        PresetRouteType value2 = AEQbTJ().djBIcL().getValue();
        SlippageMode slippageModeValues = AEQbTJ().values();
        String value3 = AEQbTJ().AYXKKw().getValue();
        AdvancedSettingsContract.Input input5 = this.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        InterfaceC30614leV.ActionBar.trackSettingsSubmit$default(interfaceC30614leVOLrzqt, strAuCTel, orderType, tradeMode, chainName, chainId, value, zAkhnZx, value2, slippageModeValues, AdvancedPriorityFeeType.Companion.EZpvd(AEQbTJ().AhwBna()), value3, input2.getTransaction(), null, 4096, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        C30807liC c30807liC;
        C25308iuK c25308iuK;
        C25337iun c25337iun;
        InterfaceC30614leV interfaceC30614leVOLrzqt = OLrzqt();
        String strAuCTel = AuCTel();
        AdvancedSettingsContract.Input input = this.AEQbTJ;
        AdvancedSettingsContract.Input input2 = null;
        if (input == null) {
            Intrinsics.gEmmrt("");
            input = null;
        }
        TrackOrderType orderType = input.getOrderType();
        AdvancedSettingsContract.Input input3 = this.AEQbTJ;
        if (input3 == null) {
            Intrinsics.gEmmrt("");
            input3 = null;
        }
        TradeMode tradeMode = input3.getTradeMode();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = AYXKKw();
        String chainName = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        AdvancedSettingsContract.Input input4 = this.AEQbTJ;
        if (input4 == null) {
            Intrinsics.gEmmrt("");
            input4 = null;
        }
        String chainId = input4.getChainId();
        AdvancedSettingsContract.Input input5 = this.AEQbTJ;
        if (input5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            input2 = input5;
        }
        yHO<String, String, Map<String, String>, Unit> yhoAEQbTJ = interfaceC30614leVOLrzqt.AEQbTJ(strAuCTel, orderType, tradeMode, chainName, chainId, input2.getTransaction());
        C23481hyz c23481hyz = (C23481hyz) fARcdN();
        if (c23481hyz != null && (c25337iun = c23481hyz.OLrzqt) != null) {
            c25337iun.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
        }
        C23481hyz c23481hyz2 = (C23481hyz) fARcdN();
        if (c23481hyz2 != null && (c25308iuK = c23481hyz2.valueOf) != null) {
            c25308iuK.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
        }
        C23481hyz c23481hyz3 = (C23481hyz) fARcdN();
        if (c23481hyz3 == null || (c30807liC = c23481hyz3.KWHzl) == null) {
            return;
        }
        c30807liC.setEventTrackingSettingsClickCallback(yhoAEQbTJ);
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        super.onDestroyView();
    }
}

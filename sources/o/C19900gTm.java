package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingSellSettingFragment$bindSellSettings$3$1;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingSellSettingFragment$bindSellSettings$4;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.BuySellConfigData;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C19927gUm;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gTm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19900gTm extends AbstractC7000aZw<C21460hAe> implements C19927gUm.Application {
    public final InterfaceC56387yDm KWHzl;
    public final ActivityResultLauncher<AdvancedSettingsContract.Input> copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.QIZEnU;
    }

    public C19900gTm() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingEditStrategyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingSellSettingFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingSellSettingFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingSellSettingFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        ActivityResultLauncher<AdvancedSettingsContract.Input> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new AdvancedSettingsContract(), new ActivityResultCallback() { // from class: o.gTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C19900gTm.copydefault(this.OLrzqt, (AdvancedSettingsContract.Input) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.gTm$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gTm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C19900gTm EZpvd() {
            return new C19900gTm();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C21460hAe AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C21460hAe c21460hAeAEQbTJ = C21460hAe.AEQbTJ(view);
        Intrinsics.checkNotNullExpressionValue(c21460hAeAEQbTJ, "");
        return c21460hAeAEQbTJ;
    }

    public final CopyTradingEditStrategyViewModel copydefault() {
        return (CopyTradingEditStrategyViewModel) this.KWHzl.getValue();
    }

    public final C19927gUm OLrzqt() {
        C21460hAe c21460hAeAEQbTJ = AEQbTJ();
        if (c21460hAeAEQbTJ != null) {
            return c21460hAeAEQbTJ.AEQbTJ;
        }
        return null;
    }

    public static final void copydefault(C19900gTm c19900gTm, AdvancedSettingsContract.Input input) {
        C19927gUm c19927gUm;
        if (input == null) {
            return;
        }
        pUU.KWHzl(c19900gTm.getTAG(), "result: " + input);
        C21460hAe c21460hAeAEQbTJ = c19900gTm.AEQbTJ();
        if (c21460hAeAEQbTJ == null || (c19927gUm = c21460hAeAEQbTJ.AEQbTJ) == null || c19927gUm.OLrzqt() == null) {
            return;
        }
        c19900gTm.AEQbTJ(new BuySellConfigData(Intrinsics.EZpvd((java.lang.Object) input.getRouterModeType(), (java.lang.Object) PresetRouteType.RouteTypeMev.getValue()), PresetRouteType.Companion.EZpvd(input.getRouterModeType()), input.getSlippageMode(), input.getSlippageValue(), PriorityFeeType.Companion.copydefault(input.getPriorityFeeType()), input.getPriorityValue()));
        c19900gTm.copydefault().AEQbTJ(input);
    }

    @Override // o.AbstractC7000aZw, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C21460hAe c21460hAeAEQbTJ = AEQbTJ();
        if (c21460hAeAEQbTJ != null) {
            copydefault(c21460hAeAEQbTJ);
        }
    }

    @Override // o.C19927gUm.Application
    public void AhwBna() {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(copydefault(), TrackButtonName.EXPAND_SELL_SETTINGS.getButtonName(), null, 2, null);
    }

    @Override // o.C19927gUm.Application
    public void valueOf() {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(copydefault(), TrackButtonName.COPY_SELL_EXPLAIN.getButtonName(), null, 2, null);
    }

    @Override // o.C19927gUm.Application
    public void EZpvd() {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(copydefault(), TrackButtonName.AUTO_SELL_EXPLAIN.getButtonName(), null, 2, null);
    }

    public final void copydefault(final C21460hAe c21460hAe) {
        c21460hAe.AEQbTJ.setCallback$OKDex_dex_impl(this);
        getChildFragmentManager().setFragmentResultListener("AdvancedAutoSellStrategySelectionBottomSheet.requestKey", this, new FragmentResultListener() { // from class: o.gTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C19900gTm.EZpvd(c21460hAe, str, bundle);
            }
        });
        android.widget.TextView textViewCopydefault = c21460hAe.AEQbTJ.copydefault().copydefault();
        textViewCopydefault.setOnClickListener(new ActionBar(textViewCopydefault, 1000L, this, c21460hAe));
        C19919gUe c19919gUeOLrzqt = c21460hAe.AEQbTJ.OLrzqt();
        c19919gUeOLrzqt.setOnClickListener(new Application(c19919gUeOLrzqt, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingSellSettingFragment$bindSellSettings$4(this, c21460hAe, null), 3, null);
    }

    /* JADX INFO: renamed from: o.gTm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C19900gTm KWHzl;
        public final /* synthetic */ C21460hAe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19900gTm c19900gTm, C21460hAe c21460hAe) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c19900gTm;
            this.copydefault = c21460hAe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.widget.TextView textView = (android.widget.TextView) this.EZpvd;
                CopyTradingEditStrategyViewModel.trackClickEvent$default(this.KWHzl.copydefault(), TrackButtonName.ADD_STRATEGY.getButtonName(), null, 2, null);
                if (this.copydefault.AEQbTJ.copydefault().OLrzqt()) {
                    gUI.Companion.OLrzqt().show(this.KWHzl.getChildFragmentManager(), "AdvancedAutoSellStrategySelectionBottomSheet");
                } else {
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.copydefault(C23274hvD.Fragment.OmJATG, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(this.copydefault.AEQbTJ.copydefault().KWHzl())))), ContextCompat.getDrawable(textView.getContext(), C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gTm$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C19900gTm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19900gTm c19900gTm) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c19900gTm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                CopyTradingEditStrategyViewModel.trackClickEvent$default(this.copydefault.copydefault(), TrackButtonName.COPY_SELL_CONFIG.getButtonName(), null, 2, null);
                C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new CopyTradingSellSettingFragment$bindSellSettings$3$1(this.copydefault, null), 3, null);
            }
        }
    }

    public final void AEQbTJ(BuySellConfigData buySellConfigData) {
        C19927gUm c19927gUm;
        C19919gUe c19919gUeOLrzqt;
        C21460hAe c21460hAeAEQbTJ = AEQbTJ();
        if (c21460hAeAEQbTJ == null || (c19927gUm = c21460hAeAEQbTJ.AEQbTJ) == null || (c19919gUeOLrzqt = c19927gUm.OLrzqt()) == null) {
            return;
        }
        c19919gUeOLrzqt.setBuySellConfigData(buySellConfigData);
        c19919gUeOLrzqt.setMevDisplay(buySellConfigData.KWHzl());
        c19919gUeOLrzqt.setSlippageValue(buySellConfigData.AEQbTJ());
        c19919gUeOLrzqt.setPriorityFeeValue(buySellConfigData.copydefault(), buySellConfigData.EZpvd());
    }

    @Override // o.AbstractC7000aZw, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C19927gUm c19927gUm;
        C21460hAe c21460hAeAEQbTJ = AEQbTJ();
        if (c21460hAeAEQbTJ != null && (c19927gUm = c21460hAeAEQbTJ.AEQbTJ) != null) {
            c19927gUm.setCallback$OKDex_dex_impl(null);
        }
        super.onDestroyView();
    }

    public static final void EZpvd(C21460hAe c21460hAe, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        CopyTradingAutoSellStrategy copyTradingAutoSellStrategy = (CopyTradingAutoSellStrategy) ((android.os.Parcelable) BundleCompat.getParcelable(bundle, "AdvancedAutoSellStrategySelectionBottomSheet.selectedStrategy", CopyTradingAutoSellStrategy.class));
        if (copyTradingAutoSellStrategy == null) {
            return;
        }
        c21460hAe.AEQbTJ.copydefault().EZpvd().AEQbTJ(copyTradingAutoSellStrategy);
    }
}

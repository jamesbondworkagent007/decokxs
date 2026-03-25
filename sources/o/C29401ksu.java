package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import com.okinc.business.market.features.meme.selection_filter.MemeSelectionParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheetParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.scanner.surge.trending.data.ProtocolFilterData;
import com.okinc.business.market.features.scanner.surge.trending.data.RankInfoData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.domain.model.TrendingProtocolUiModel;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.ProtocolFilterInfo;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.ProtocolInfo;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.RankTypeFilter;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetParams;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$setupComposeView$1$1$1$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$setupComposeView$1$1$2$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$setupComposeView$1$1$3$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$setupComposeView$1$1$5$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$setupComposeView$1$1$6$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$setupComposeView$1$1$7$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabViewModel;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C28832kiH;
import o.C29401ksu;
import o.C29642kxW;
import o.C29644kxY;
import o.C57406yhn;
import o.InterfaceC28823khz;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ksu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29401ksu extends AbstractC29331krd implements InterfaceC28773khB, InterfaceC29270kqV {
    public final InterfaceC56387yDm AYXKKw;
    public hBF gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    public C29401ksu() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SurgeTabViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ksC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29401ksu.AhwBna();
            }
        });
    }

    public final SurgeTabViewModel AYXKKw() {
        return (SurgeTabViewModel) this.valueOf.getValue();
    }

    public static final gKO AhwBna() {
        return (gKO) C43251rlk.copydefault(gKO.class);
    }

    public final gKO djBIcL() {
        return (gKO) this.AYXKKw.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBF hbfKWHzl = hBF.KWHzl(layoutInflater, viewGroup, false);
        this.gEmmrt = hbfKWHzl;
        if (hbfKWHzl != null) {
            return hbfKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
        valueOf();
        view.post(new java.lang.Runnable() { // from class: o.ksy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29401ksu.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final void gEmmrt(C29401ksu c29401ksu) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c29401ksu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    private final void values() {
        ComposeView composeView;
        hBF hbf = this.gEmmrt;
        if (hbf == null || (composeView = hbf.EZpvd) == null) {
            return;
        }
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-491994287, true, new ActionBar()));
    }

    /* JADX INFO: renamed from: o.ksu$ActionBar */
    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-491994287, i, -1, "com.okinc.business.market.features.scanner.surge.ui.SurgeTabFragment.setupComposeView.<anonymous>.<anonymous> (SurgeTabFragment.kt:84)");
                }
                SurgeTabViewModel surgeTabViewModelAYXKKw = C29401ksu.this.AYXKKw();
                C29401ksu c29401ksu = C29401ksu.this;
                composer.startReplaceableGroup(-568872843);
                boolean zChangedInstance = composer.changedInstance(c29401ksu);
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new SurgeTabFragment$setupComposeView$1$1$1$1(c29401ksu);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Function0 function0 = (Function0) ((InterfaceC56555yJs) objRememberedValue);
                C29401ksu c29401ksu2 = C29401ksu.this;
                composer.startReplaceableGroup(-568870736);
                boolean zChangedInstance2 = composer.changedInstance(c29401ksu2);
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new SurgeTabFragment$setupComposeView$1$1$2$1(c29401ksu2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Function0 function02 = (Function0) ((InterfaceC56555yJs) objRememberedValue2);
                C29401ksu c29401ksu3 = C29401ksu.this;
                composer.startReplaceableGroup(-568868718);
                boolean zChangedInstance3 = composer.changedInstance(c29401ksu3);
                java.lang.Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new SurgeTabFragment$setupComposeView$1$1$3$1(c29401ksu3);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                Function1 function1 = (Function1) ((InterfaceC56555yJs) objRememberedValue3);
                composer.startReplaceableGroup(-568866218);
                boolean zChangedInstance4 = composer.changedInstance(C29401ksu.this);
                final C29401ksu c29401ksu4 = C29401ksu.this;
                java.lang.Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: o.ksB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29401ksu.ActionBar.OLrzqt(c29401ksu4, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function1 function12 = (Function1) objRememberedValue4;
                composer.endReplaceableGroup();
                C29401ksu c29401ksu5 = C29401ksu.this;
                composer.startReplaceableGroup(-568859095);
                boolean zChangedInstance5 = composer.changedInstance(c29401ksu5);
                java.lang.Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new SurgeTabFragment$setupComposeView$1$1$5$1(c29401ksu5);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                Function0 function03 = (Function0) ((InterfaceC56555yJs) objRememberedValue5);
                C29401ksu c29401ksu6 = C29401ksu.this;
                composer.startReplaceableGroup(-568856875);
                boolean zChangedInstance6 = composer.changedInstance(c29401ksu6);
                java.lang.Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = new SurgeTabFragment$setupComposeView$1$1$6$1(c29401ksu6);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceableGroup();
                Function2 function2 = (Function2) ((InterfaceC56555yJs) objRememberedValue6);
                C29401ksu c29401ksu7 = C29401ksu.this;
                composer.startReplaceableGroup(-568854407);
                boolean zChangedInstance7 = composer.changedInstance(c29401ksu7);
                java.lang.Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance7 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = new SurgeTabFragment$setupComposeView$1$1$7$1(c29401ksu7);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceableGroup();
                C29347krt.AEQbTJ(surgeTabViewModelAYXKKw, function0, function02, function1, function12, function03, function2, (Function0) ((InterfaceC56555yJs) objRememberedValue7), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt(C29401ksu c29401ksu, boolean z) {
            C33546myW c33546myW;
            hBF hbf = c29401ksu.gEmmrt;
            if (hbf != null && (c33546myW = hbf.OLrzqt) != null) {
                c33546myW.djBIcL(z);
            }
            return Unit.INSTANCE;
        }
    }

    public final void valueOf() {
        C33546myW c33546myW;
        hBF hbf = this.gEmmrt;
        if (hbf != null && (c33546myW = hbf.OLrzqt) != null) {
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.ksA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C29401ksu.KWHzl(this.AEQbTJ, interfaceC57934yrl);
                }
            });
        }
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AYXKKw(), null, new StateListAnimator(), 2, null);
    }

    public static final void KWHzl(C29401ksu c29401ksu, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (c29401ksu.AYXKKw().AhwBna() != null) {
            c29401ksu.AYXKKw().EZpvd(false);
            c29401ksu.AYXKKw().KWHzl(true);
        }
    }

    /* JADX INFO: renamed from: o.ksu$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return KWHzl(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            hBF hbf;
            C33546myW c33546myW;
            if (!z && (hbf = C29401ksu.this.gEmmrt) != null && (c33546myW = hbf.OLrzqt) != null) {
                c33546myW.AEQbTJ();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }

    public final void AkhnZx() {
        SmartMoneyConfig value = AYXKKw().djBIcL().getValue();
        if (value == null) {
            return;
        }
        C29642kxW.TaskDescription.newInstance$default(C29642kxW.Companion, C29556kvq.copydefault(value.copydefault(), value.KWHzl()), java.lang.Integer.valueOf(C23274hvD.Fragment.RlQdEF), new Function1() { // from class: o.ksz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29401ksu.AEQbTJ(this.KWHzl, (C29635kxP) obj);
            }
        }, null, 8, null).show(getChildFragmentManager(), "DexSelectionBottomSheet");
    }

    public static final Unit AEQbTJ(C29401ksu c29401ksu, C29635kxP c29635kxP) {
        if (c29635kxP == null) {
            return Unit.INSTANCE;
        }
        c29401ksu.AYXKKw().KWHzl(c29635kxP.valueOf());
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        TrendingConfigData trendingConfigDataAhwBna;
        java.util.List listAhwBna;
        if (getChildFragmentManager().findFragmentByTag("DexSelectionBottomSheet") == null && (trendingConfigDataAhwBna = AYXKKw().AhwBna()) != null) {
            java.lang.String strCopydefault = AYXKKw().copydefault();
            java.util.List<ChainInfoData> listCopydefault = trendingConfigDataAhwBna.copydefault();
            if (listCopydefault != null) {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                for (ChainInfoData chainInfoData : listCopydefault) {
                    java.lang.String strEZpvd = chainInfoData.EZpvd();
                    listAhwBna.add(new MemeSelection(chainInfoData.OLrzqt(), null, chainInfoData.KWHzl(), java.lang.Integer.valueOf(C57406yhn.Activity.QKVWgx), Intrinsics.EZpvd((java.lang.Object) chainInfoData.EZpvd(), (java.lang.Object) strCopydefault), strEZpvd, null, 66, null));
                }
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            C28819khv.Companion.KWHzl(new MemeSelectionParams(listAhwBna, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistryOwner), 0)).show(getChildFragmentManager(), "DexSelectionBottomSheet");
        }
    }

    @Override // o.InterfaceC28773khB
    public void copydefault(MemeSelection memeSelection, int i) {
        java.lang.String strKWHzl;
        if (memeSelection == null || (strKWHzl = memeSelection.KWHzl()) == null) {
            return;
        }
        AYXKKw().EZpvd(strKWHzl);
    }

    public final void isConnected() {
        TrendingConfigData trendingConfigDataAhwBna;
        java.util.List listAhwBna;
        java.util.ArrayList arrayList;
        java.lang.String strOLrzqt;
        if (getChildFragmentManager().findFragmentByTag(C29260kqL.class.getName()) == null && (trendingConfigDataAhwBna = AYXKKw().AhwBna()) != null) {
            C29346krs c29346krsEZpvd = AYXKKw().EZpvd();
            java.util.List<ProtocolInfoData> listAEQbTJ = c29346krsEZpvd.AEQbTJ().AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (true) {
                java.lang.String str = "";
                if (!it.hasNext()) {
                    break;
                }
                ProtocolInfoData protocolInfoData = (ProtocolInfoData) it.next();
                java.lang.String protocolId = protocolInfoData.getProtocolId();
                if (protocolId == null) {
                    protocolId = "";
                }
                java.lang.String protocolName = protocolInfoData.getProtocolName();
                if (protocolName == null) {
                    protocolName = "";
                }
                java.lang.String protocolLogo = protocolInfoData.getProtocolLogo();
                if (protocolLogo == null) {
                    protocolLogo = "";
                }
                java.util.List<java.lang.String> listKWHzl = c29346krsEZpvd.AEQbTJ().KWHzl();
                java.lang.String protocolId2 = protocolInfoData.getProtocolId();
                if (protocolId2 != null) {
                    str = protocolId2;
                }
                arrayList2.add(new TrendingProtocolUiModel(protocolId, protocolName, protocolLogo, listKWHzl.contains(str)));
            }
            java.util.List<RankInfoData> listOLrzqt = trendingConfigDataAhwBna.OLrzqt();
            java.util.ArrayList arrayList3 = null;
            if (listOLrzqt != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (RankInfoData rankInfoData : listOLrzqt) {
                    java.lang.String strKWHzl = rankInfoData.KWHzl();
                    RankTypeFilter rankTypeFilter = (strKWHzl == null || (strOLrzqt = rankInfoData.OLrzqt()) == null) ? null : new RankTypeFilter(strKWHzl, strOLrzqt);
                    if (rankTypeFilter != null) {
                        arrayList4.add(rankTypeFilter);
                    }
                }
                listAhwBna = CollectionsKt___CollectionsKt.QbewEr(arrayList4);
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List<ProtocolFilterData> listKWHzl2 = trendingConfigDataAhwBna.KWHzl();
            if (listKWHzl2 != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl2, 10));
                for (ProtocolFilterData protocolFilterData : listKWHzl2) {
                    java.lang.String strCopydefault = protocolFilterData.copydefault();
                    if (strCopydefault == null) {
                        strCopydefault = "";
                    }
                    java.util.List<java.lang.String> listOLrzqt2 = protocolFilterData.OLrzqt();
                    if (listOLrzqt2 == null) {
                        listOLrzqt2 = yDY.AhwBna();
                    }
                    java.util.List<java.lang.String> listEZpvd = protocolFilterData.EZpvd();
                    if (listEZpvd == null) {
                        listEZpvd = yDY.AhwBna();
                    }
                    arrayList.add(new ProtocolFilterInfo(strCopydefault, listOLrzqt2, listEZpvd));
                }
            } else {
                arrayList = null;
            }
            java.util.List listAhwBna2 = arrayList == null ? yDY.AhwBna() : arrayList;
            java.util.List<ProtocolInfoData> listEZpvd2 = trendingConfigDataAhwBna.EZpvd();
            if (listEZpvd2 != null) {
                arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
                for (ProtocolInfoData protocolInfoData2 : listEZpvd2) {
                    java.lang.String protocolId3 = protocolInfoData2.getProtocolId();
                    if (protocolId3 == null) {
                        protocolId3 = "";
                    }
                    java.lang.String protocolName2 = protocolInfoData2.getProtocolName();
                    if (protocolName2 == null) {
                        protocolName2 = "";
                    }
                    java.lang.String protocolLogo2 = protocolInfoData2.getProtocolLogo();
                    if (protocolLogo2 == null) {
                        protocolLogo2 = "";
                    }
                    arrayList3.add(new ProtocolInfo(protocolId3, protocolName2, protocolLogo2));
                }
            }
            C29260kqL.Companion.OLrzqt(new TrendingFilterBottomSheetParams(arrayList2, c29346krsEZpvd.OLrzqt(), listAhwBna, AYXKKw().EZpvd().copydefault(), AYXKKw().copydefault(), listAhwBna2, arrayList3 == null ? yDY.AhwBna() : arrayList3)).show(getChildFragmentManager(), C29260kqL.class.getName());
        }
    }

    @Override // o.InterfaceC29270kqV
    public void KWHzl(C29264kqP c29264kqP) {
        java.util.List listAhwBna;
        java.util.List<ProtocolInfoData> listEZpvd;
        if (c29264kqP == null) {
            AYXKKw().fetchVPNInfo();
            return;
        }
        TrendingFilter trendingFilterEZpvd = c29264kqP.EZpvd();
        java.util.List<InterfaceC28823khz.ActionBar> listAEQbTJ = c29264kqP.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAEQbTJ) {
            if (((InterfaceC28823khz.ActionBar) obj).EZpvd()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC28823khz.ActionBar) it.next()).OLrzqt());
        }
        if (!Intrinsics.EZpvd((java.lang.Object) c29264kqP.KWHzl(), (java.lang.Object) AYXKKw().EZpvd().copydefault())) {
            AYXKKw().EZpvd(c29264kqP.KWHzl(), trendingFilterEZpvd, arrayList2);
        } else {
            AYXKKw().AEQbTJ(trendingFilterEZpvd, arrayList2);
        }
        TrendingConfigData trendingConfigDataAhwBna = AYXKKw().AhwBna();
        if (trendingConfigDataAhwBna == null || (listEZpvd = trendingConfigDataAhwBna.EZpvd()) == null) {
            listAhwBna = null;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : listEZpvd) {
                if (arrayList2.contains(((ProtocolInfoData) obj2).getProtocolId())) {
                    arrayList3.add(obj2);
                }
            }
            listAhwBna = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                java.lang.String protocolTagKey = ((ProtocolInfoData) it2.next()).getProtocolTagKey();
                if (protocolTagKey != null) {
                    listAhwBna.add(protocolTagKey);
                }
            }
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        C29229kph.OLrzqt(c29264kqP, CollectionsKt___CollectionsKt.joinToString$default(listAhwBna, ",", null, null, 0, null, null, 62, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            C28648kej.OLrzqt(this);
        }
    }

    public final void copydefault(TokenBase tokenBase) {
        gKO gkoDjBIcL = djBIcL();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default(gkoDjBIcL, childFragmentManager, "default_trade", tokenBase, TransactionType.Buy.getType(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        MemeQuickPopUpSource.Companion.copydefault(MemeQuickPopUpSource.MarketSaSurge);
    }

    public final void KWHzl(C29250kqB c29250kqB, TokenDetailTabType tokenDetailTabType) {
        TokenDetailTabData[] tokenDetailTabDataArr = new TokenDetailTabData[2];
        java.lang.String strAkhnZx = c29250kqB.AkhnZx();
        if (strAkhnZx == null) {
            strAkhnZx = c29250kqB.DbNXlk();
        }
        tokenDetailTabDataArr[0] = new TokenDetailTabData.TokenTab(strAkhnZx, c29250kqB.AhwBna(), false, null, 12, null);
        java.util.List<MemeSocialMediaData> listFetchVPNInfo = c29250kqB.fetchVPNInfo();
        java.lang.String strDjBIcL = c29250kqB.djBIcL();
        tokenDetailTabDataArr[1] = new TokenDetailTabData.SocialTab(false, listFetchVPNInfo, strDjBIcL == null ? "" : strDjBIcL, null, null, 25, null);
        java.util.List listGEmmrt = yDY.gEmmrt(tokenDetailTabDataArr);
        C28832kiH.StateListAnimator stateListAnimator = C28832kiH.Companion;
        java.lang.String strValueOf = c29250kqB.valueOf();
        java.lang.String strValues = c29250kqB.values();
        java.lang.String strAYXKKw = c29250kqB.AYXKKw();
        java.lang.String strIsConnected = c29250kqB.isConnected();
        java.lang.String strDbNXlk = c29250kqB.DbNXlk();
        java.lang.String strAEQbTJ = c29250kqB.AEQbTJ();
        C28832kiH c28832kiHOLrzqt = stateListAnimator.OLrzqt(new TokenDetailBottomSheetParams(new TokenDetailCommonParams(strValueOf, strValues, strAYXKKw, strIsConnected, strDbNXlk, true, true, strAEQbTJ == null ? "" : strAEQbTJ, "default_trade", false, 512, null), listGEmmrt, tokenDetailTabType));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28832kiHOLrzqt.show(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        C29229kph.KWHzl("signal_detail");
        DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this);
        if (dexFragmentNavigatorAEQbTJ != null) {
            C29644kxY c29644kxYNewInstance$default = C29644kxY.Application.newInstance$default(C29644kxY.Companion, "Smart money_DL", true, null, 4, null);
            dexFragmentNavigatorAEQbTJ.EZpvd(c29644kxYNewInstance$default, (6 & 2) != 0 ? c29644kxYNewInstance$default.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
        }
    }

    /* JADX INFO: renamed from: o.ksu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ksu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C29401ksu AEQbTJ() {
            return new C29401ksu();
        }
    }
}

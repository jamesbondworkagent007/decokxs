package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheet$observeKLineData$1;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheetParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C28832kiH;
import o.C52761wXj;
import o.C57406yhn;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kiH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28832kiH extends AbstractC28864kin {
    public C23477hyv AYXKKw;
    public TabLayoutMediator djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final boolean gEmmrt = true;
    public final InterfaceC56387yDm valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.kiH$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TokenDetailTabType.values().length];
            try {
                iArr[TokenDetailTabType.TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TokenDetailTabType.SOCIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenDetailTabType.DATA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TokenDetailTabType.TAG_EXPLANATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TokenDetailTabType.DEV_TOKEN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.gEmmrt;
    }

    public C28832kiH() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheet$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheet$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kiG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28832kiH.valueOf(this.EZpvd);
            }
        });
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return gEmmrt().copydefault().OLrzqt();
    }

    public final C23477hyv djBIcL() {
        C23477hyv c23477hyv = this.AYXKKw;
        Intrinsics.copydefault(c23477hyv);
        return c23477hyv;
    }

    public final TokenDetailBottomSheetParams gEmmrt() {
        TokenDetailBottomSheetParams tokenDetailBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenDetailBottomSheetParams = (TokenDetailBottomSheetParams) arguments.getParcelable("params.token_detail_bs")) == null) ? new TokenDetailBottomSheetParams(null, null, null, 7, null) : tokenDetailBottomSheetParams;
    }

    public final TokenDetailViewModel AYXKKw() {
        return (TokenDetailViewModel) this.fetchVPNInfo.getValue();
    }

    public final C28833kiI AhwBna() {
        return (C28833kiI) this.valueOf.getValue();
    }

    public static final C28833kiI valueOf(C28832kiH c28832kiH) {
        return new C28833kiI(c28832kiH, c28832kiH.gEmmrt());
    }

    /* JADX INFO: renamed from: o.kiH$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kiH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28832kiH OLrzqt(@NotNull TokenDetailBottomSheetParams tokenDetailBottomSheetParams) {
            Intrinsics.checkNotNullParameter(tokenDetailBottomSheetParams, "");
            C28832kiH c28832kiH = new C28832kiH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("params.token_detail_bs", tokenDetailBottomSheetParams);
            c28832kiH.setArguments(bundle);
            C32866mlf.onEvent$default("DEXMarket_Memefactory_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.kiK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28832kiH.StateListAnimator.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return c28832kiH;
        }

        public static final Unit AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "is_tee", "false", false, 4, null);
            EventParamsList.put$default(eventParamsList, "module", "memepump", false, 4, null);
            EventParamsList.put$default(eventParamsList, "product_type", "memepump", false, 4, null);
            EventParamsList.put$default(eventParamsList, "page_name", "token_detail_preview", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C23477hyv.EZpvd(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        AkhnZx();
        if (gEmmrt().copydefault().AEQbTJ()) {
            fetchVPNInfo();
            KWHzl();
        }
    }

    private final void AkhnZx() {
        java.lang.String string;
        C23477hyv c23477hyvDjBIcL = djBIcL();
        c23477hyvDjBIcL.getRoot().setContentDescription("web3_dex_market_token_detail_bottom_sheet");
        java.util.List<TokenDetailTabData> listAEQbTJ = gEmmrt().AEQbTJ();
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            int i = TaskDescription.AEQbTJ[((TokenDetailTabData) it.next()).EZpvd().ordinal()];
            if (i == 1) {
                string = c23477hyvDjBIcL.getRoot().getContext().getString(C23274hvD.Fragment.Hx);
            } else if (i == 2) {
                string = c23477hyvDjBIcL.getRoot().getContext().getString(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi191);
            } else if (i == 3) {
                string = c23477hyvDjBIcL.getRoot().getContext().getString(C23274hvD.Fragment.DcMfJKDDUqPf);
            } else if (i == 4) {
                string = c23477hyvDjBIcL.getRoot().getContext().getString(C23274hvD.Fragment.onMultiWindowModeChanged);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                string = c23477hyvDjBIcL.getRoot().getContext().getString(C23274hvD.Fragment.iLWfRf);
            }
            arrayList.add(string);
        }
        c23477hyvDjBIcL.AhwBna.setAdapter(AhwBna());
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c23477hyvDjBIcL.EZpvd.copydefault(), c23477hyvDjBIcL.AhwBna, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kiE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                C28832kiH.AEQbTJ(arrayList, this, tab, i2);
            }
        });
        tabLayoutMediator.attach();
        this.djBIcL = tabLayoutMediator;
        c23477hyvDjBIcL.AhwBna.setCurrentItem(gEmmrt().EZpvd(), false);
        c23477hyvDjBIcL.EZpvd.copydefault().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.kiD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i2, int i3, int i4, int i5) {
                C28832kiH.EZpvd(view, i2, i3, i4, i5);
            }
        });
        c23477hyvDjBIcL.EZpvd.setFadingEdgeLength(0);
        android.view.View viewFindViewById = c23477hyvDjBIcL.EZpvd.findViewById(C52761wXj.FragmentManager.hrjNmC);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        android.view.View viewFindViewById2 = c23477hyvDjBIcL.EZpvd.findViewById(C52761wXj.FragmentManager.AxsJAYaxsJAY);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        c23477hyvDjBIcL.EZpvd.AEQbTJ(new Activity());
        android.view.View view = c23477hyvDjBIcL.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(gEmmrt().copydefault().AEQbTJ() ? 0 : 8);
        android.widget.LinearLayout linearLayout = c23477hyvDjBIcL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(gEmmrt().copydefault().AEQbTJ() ? 0 : 8);
        c23477hyvDjBIcL.gEmmrt.setText(gEmmrt().copydefault().AYXKKw() + " " + c23477hyvDjBIcL.getRoot().getContext().getString(C23274hvD.Fragment.cancel));
        c23477hyvDjBIcL.valueOf.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, gEmmrt().copydefault().copydefault(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        android.widget.LinearLayout linearLayout2 = c23477hyvDjBIcL.KWHzl;
        linearLayout2.setOnClickListener(new FragmentManager(linearLayout2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.kiH$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((CandlesticksBean) t).getTs(), ((CandlesticksBean) t2).getTs());
        }
    }

    public static final void AEQbTJ(java.util.List list, C28832kiH c28832kiH, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list, i);
        tab.setText(str != null ? str : "");
        TokenDetailTabData tokenDetailTabData = (TokenDetailTabData) CollectionsKt___CollectionsKt.AkhnZx(c28832kiH.gEmmrt().AEQbTJ(), i);
        if ((tokenDetailTabData != null ? tokenDetailTabData.EZpvd() : null) == TokenDetailTabType.TAG_EXPLANATION) {
            tab.view.setContentDescription("web3_dex_market_label_definitions_tab");
        }
    }

    public static final void EZpvd(android.view.View view, int i, int i2, int i3, int i4) {
        if (i != 0) {
            view.scrollTo(0, 0);
        }
    }

    /* JADX INFO: renamed from: o.kiH$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: o.kiH$Activity$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TokenDetailTabType.values().length];
                try {
                    iArr[TokenDetailTabType.TOKEN.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TokenDetailTabType.SOCIAL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TokenDetailTabType.DATA.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[TokenDetailTabType.TAG_EXPLANATION.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[TokenDetailTabType.DEV_TOKEN.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                EZpvd = iArr;
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(tab, "");
            TokenDetailTabType tokenDetailTabTypeCopydefault = C28832kiH.this.gEmmrt().copydefault(tab.getPosition());
            int i = tokenDetailTabTypeCopydefault == null ? -1 : TaskDescription.EZpvd[tokenDetailTabTypeCopydefault.ordinal()];
            if (i == -1) {
                str = "unknown";
            } else if (i == 1) {
                str = "token";
            } else if (i == 2) {
                str = "socials";
            } else if (i == 3) {
                str = "data";
            } else if (i == 4) {
                str = "tags";
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "dev_token";
            }
            C28840kiP.EZpvd(str);
        }
    }

    /* JADX INFO: renamed from: o.kiH$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28832kiH EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28832kiH c28832kiH) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c28832kiH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C28840kiP.EZpvd("quick_buy_button");
                this.EZpvd.isConnected();
            }
        }
    }

    /* JADX INFO: renamed from: o.kiH$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C28832kiH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C28832kiH c28832kiH) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c28832kiH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28840kiP.EZpvd("token_detail");
                this.copydefault.valueOf();
            }
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(wyf.getContext().getString(C23274hvD.Fragment.getSessionToken2Bundle));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(0);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            android.content.Context context = wyf.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYpCopydefault2.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context));
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setCompoundDrawablesWithIntrinsicBounds(C57406yhn.Activity.aKErDB, 0, 0, 0);
        }
        C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
        if (c52794wYpCopydefault4 != null) {
            c52794wYpCopydefault4.setOnClickListener(new ActionBar(c52794wYpCopydefault4, 1000L, this));
        }
    }

    public final void isConnected() {
        TokenDetailCommonParams tokenDetailCommonParamsCopydefault = gEmmrt().copydefault();
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, tokenDetailCommonParamsCopydefault.EZpvd(), new TokenBase(tokenDetailCommonParamsCopydefault.KWHzl(), tokenDetailCommonParamsCopydefault.djBIcL(), tokenDetailCommonParamsCopydefault.AhwBna(), null, null, tokenDetailCommonParamsCopydefault.AYXKKw(), tokenDetailCommonParamsCopydefault.gEmmrt(), tokenDetailCommonParamsCopydefault.valueOf() ? 1 : 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -232, null), TransactionType.Buy.getType(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
        TabLayoutMediator tabLayoutMediator = this.djBIcL;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.djBIcL = null;
    }

    public final void valueOf() {
        TokenDetailCommonParams tokenDetailCommonParamsCopydefault = gEmmrt().copydefault();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "default_trade", new TokenBase(tokenDetailCommonParamsCopydefault.KWHzl(), tokenDetailCommonParamsCopydefault.djBIcL(), tokenDetailCommonParamsCopydefault.AhwBna(), null, null, tokenDetailCommonParamsCopydefault.AYXKKw(), null, tokenDetailCommonParamsCopydefault.valueOf() ? 1 : 0, 0, 0, 0, null, "default_trade", null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4264, null), "meme_factory", null, new int[0], 8, null);
        }
    }

    public final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenDetailBottomSheet$observeKLineData$1(this, null), 3, null);
    }

    public final void AEQbTJ(java.util.List<CandlesticksBean> list) {
        java.util.List<? extends Entry> listGEmmrt;
        C23477hyv c23477hyvDjBIcL = djBIcL();
        if (list.isEmpty()) {
            values();
            return;
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new Application());
        if (listEZpvd.size() <= 1) {
            listGEmmrt = yDY.gEmmrt(new Entry(0.0f, 0.0f), new Entry(1.0f, 0.0f));
        } else {
            listGEmmrt = new java.util.ArrayList<>(C56403yEb.AYXKKw(listEZpvd, 10));
            int i = 0;
            for (java.lang.Object obj : listEZpvd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                listGEmmrt.add(new Entry(i, java.lang.Float.parseFloat(((CandlesticksBean) obj).getC())));
                i++;
            }
        }
        int i2 = C52761wXj.ActionBar.DCUTEI;
        android.content.Context context = c23477hyvDjBIcL.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        EZpvd(listGEmmrt, C25382ivf.copydefault(i2, context));
    }

    public final void values() {
        java.util.List<? extends Entry> listGEmmrt = yDY.gEmmrt(new Entry(0.0f, 0.0f), new Entry(1.0f, 0.0f));
        int i = C52761wXj.Activity.UlJrfe;
        android.content.Context context = djBIcL().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        EZpvd(listGEmmrt, C25382ivf.copydefault(i, context));
    }

    public final void EZpvd(java.util.List<? extends Entry> list, int i) {
        C23477hyv c23477hyvDjBIcL = djBIcL();
        LineDataSet lineDataSet = new LineDataSet(list, "Price");
        lineDataSet.setColor(i);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawHighlightIndicators(false);
        lineDataSet.setHighlightEnabled(false);
        LineChart lineChart = c23477hyvDjBIcL.AEQbTJ;
        Intrinsics.copydefault(lineChart);
        lineChart.setVisibility(0);
        lineChart.getDescription().setEnabled(false);
        lineChart.getLegend().setEnabled(false);
        lineChart.setMinOffset(0.0f);
        lineChart.getAxisRight().setEnabled(false);
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.setEnabled(false);
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setEnabled(false);
        xAxis.setDrawLabels(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        lineChart.setScaleXEnabled(false);
        lineChart.setScaleYEnabled(false);
        lineChart.setDragEnabled(false);
        lineChart.setDoubleTapToZoomEnabled(false);
        lineChart.setPinchZoom(false);
        lineChart.setDragYEnabled(false);
        lineChart.setData(new LineData(lineDataSet));
        lineChart.notifyDataSetChanged();
        lineChart.invalidate();
    }

    public final void KWHzl() {
        AYXKKw().AEQbTJ(gEmmrt().copydefault().KWHzl(), gEmmrt().copydefault().djBIcL(), "5s");
    }
}

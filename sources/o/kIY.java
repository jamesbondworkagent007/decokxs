package o;

import android.os.MessageQueue;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$observer$1$1$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$onCreate$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$onCreate$2;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$onRecommendAdded$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$requestData$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$resetRefresh$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$updateTabs$2$onPageSelected$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.ActivityC26135jTf;
import o.C27831kEy;
import o.C27869kGi;
import o.C27947kJf;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kIY extends AbstractC27806kEY implements pWK, C27831kEy.Application {
    public C57596ylR AuCTelauCTel;
    public kIF AubY;
    public boolean AwvSrB;
    public final InterfaceC56387yDm AxsJAY;
    public xTS ejfBZ;
    public kIR gHZMYf = new kIR();
    public MutableLiveData<SourceResp<xTS>> getFieldNames;
    public boolean getNewProxyInstance;
    public android.view.ViewGroup hDKMBd;
    public Job iwGUEr;
    public final Function1<WatchListData, java.lang.Boolean> sSMYrx;
    public boolean uzCIH;
    public C55254xgV wlaJM;
    public final Observer<SourceResp<xTS>> zLjUOn;
    public android.view.ViewGroup zsXlph;
    public AppCompatImageView zuBGHE;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketToolDialog.Action.values().length];
            try {
                iArr[MarketToolDialog.Action.STAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketToolDialog.Action.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketToolDialog.Action.EDIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public static final class Application implements InterfaceC55701xos<Unit> {
        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, Unit unit, java.lang.Exception exc) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AEQbTJ(WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27806kEY
    public AbstractC54646xQb AEQbTJ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function1<WatchListData, java.lang.Boolean> AuCTel() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27806kEY
    public void OLrzqt(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.kEY.fJNWhG()Lo/pWt; */
    @Override // o.C27831kEy.Application
    public java.lang.String fJNWhG() {
        return "markets";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27806kEY
    public java.lang.Boolean[] gEmmrt() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return new java.lang.Boolean[]{bool, bool, bool, bool};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kIR getNewProxyInstance() {
        return this.gHZMYf;
    }

    public kIY() {
        Function0 function0 = new Function0() { // from class: o.kJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kIY.AhwBna(this.copydefault);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AxsJAY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C27947kJf.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.sSMYrx = new Function1() { // from class: o.kJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kIY.AEQbTJ((WatchListData) obj));
            }
        };
        this.zLjUOn = new Observer() { // from class: o.kJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                kIY.OLrzqt(this.EZpvd, (SourceResp) obj);
            }
        };
    }

    public static final class TaskDescription implements ViewModelProvider.Factory {
        public TaskDescription() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C27947kJf(C43246rlf.OLrzqt.valueOf(), kIY.this.getNewProxyInstance(), kIY.this);
        }
    }

    public final C27947kJf uzCIH() {
        return (C27947kJf) this.AxsJAY.getValue();
    }

    public static final ViewModelProvider.Factory AhwBna(kIY kiy) {
        return kiy.new TaskDescription();
    }

    @Override // o.AbstractC27806kEY, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.zsXlph = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.sEAkxl);
        this.hDKMBd = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.GGlJim);
        C55254xgV c55254xgV = (C55254xgV) view.findViewById(qZH.StateListAnimator.OmJATG);
        this.wlaJM = c55254xgV;
        if (c55254xgV != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(requireActivity()).inflate(qZH.ActionBar.OqFWZa, (android.view.ViewGroup) c55254xgV, false);
            this.zuBGHE = (AppCompatImageView) viewInflate.findViewById(qZH.StateListAnimator.onComplete);
            ((AppCompatImageView) viewInflate.findViewById(qZH.StateListAnimator.onComplete)).setOnClickListener(new View.OnClickListener() { // from class: o.kIW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    kIY.copydefault(this.copydefault, view2);
                }
            });
            Intrinsics.copydefault(viewInflate);
            c55254xgV.OLrzqt(viewInflate);
        }
        C55254xgV c55254xgV2 = this.wlaJM;
        if (c55254xgV2 != null) {
            c55254xgV2.AEQbTJ(new Activity());
        }
        this.AuCTelauCTel = (C57596ylR) view.findViewById(qZH.StateListAnimator.QMuEJi);
        java.util.List listAhwBna = yDY.AhwBna();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        kIF kif = new kIF(listAhwBna, childFragmentManager);
        this.AubY = kif;
        C57596ylR c57596ylR = this.AuCTelauCTel;
        if (c57596ylR != null) {
            c57596ylR.setAdapter(kif);
        }
        C55254xgV c55254xgV3 = this.wlaJM;
        if (c55254xgV3 != null) {
            c55254xgV3.setupWithViewPager(this.AuCTelauCTel);
        }
    }

    public static final void copydefault(final kIY kiy, android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        C27947kJf.ActionBar value = kiy.uzCIH().copydefault().getValue();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(value.OLrzqt().get(value.KWHzl()).EZpvd());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = "ANY";
        }
        ActivityC26135jTf.Application application3 = ActivityC26135jTf.Companion;
        FragmentActivity fragmentActivityRequireActivity = kiy.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        application3.KWHzl(fragmentActivityRequireActivity);
        C27986kKr.AEQbTJ.OLrzqt("pic_url", "market_favorite_edit");
        C32866mlf.onEvent$default("DiscoverPage_Favorites_Edit_Click", (TrackChannel[]) null, new Function1() { // from class: o.kJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kIY.copydefault(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(kIY kiy, EventParamsList eventParamsList) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C27947kJf.ActionBar value = kiy.uzCIH().copydefault().getValue();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(value.OLrzqt().get(value.KWHzl()).copydefault());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = "all";
        }
        java.lang.String string = objM7377constructorimpl != null ? objM7377constructorimpl.toString() : null;
        eventParamsList.put("tab", string != null ? string : "all", true);
        return Unit.INSTANCE;
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onTabSelected(TabLayout.Tab tab) {
            java.util.List<C27869kGi.ActionBar> listEZpvd;
            if (kIY.this.uzCIH) {
                C27986kKr c27986kKr = C27986kKr.AEQbTJ;
                kIF kif = kIY.this.AubY;
                if (kif == null || (listEZpvd = kif.EZpvd()) == null) {
                    java.lang.String strEZpvd = "";
                    c27986kKr.OLrzqt("pic_url", strEZpvd);
                } else {
                    C27869kGi.ActionBar actionBar = (C27869kGi.ActionBar) CollectionsKt___CollectionsKt.AkhnZx(listEZpvd, tab != null ? tab.getPosition() : 0);
                    if (actionBar == null || (strEZpvd = actionBar.EZpvd()) == null) {
                    }
                    c27986kKr.OLrzqt("pic_url", strEZpvd);
                }
            }
            kIY.this.uzCIH = true;
        }
    }

    @Override // o.AbstractC27806kEY
    public void valueOf() {
        java.lang.Object objM7377constructorimpl;
        C27947kJf.ActionBar value = uzCIH().copydefault().getValue();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(value.OLrzqt().get(value.KWHzl()).EZpvd());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = "ANY";
        }
        ActivityC26135jTf.Application application3 = ActivityC26135jTf.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        application3.KWHzl(fragmentActivityRequireActivity);
    }

    public void OLrzqt(@NotNull final java.util.List<C27869kGi.ActionBar> list) {
        Intrinsics.checkNotNullParameter(list, "");
        kIF kif = this.AubY;
        if (kif != null) {
            kif.copydefault(list);
        }
        kIF kif2 = this.AubY;
        if (kif2 != null) {
            kif2.notifyDataSetChanged();
        }
        android.os.Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.kIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return kIY.AEQbTJ(this.KWHzl, list);
            }
        });
        C57596ylR c57596ylR = this.AuCTelauCTel;
        if (c57596ylR != null) {
            c57596ylR.addOnPageChangeListener(new StateListAnimator());
        }
    }

    public static final boolean AEQbTJ(kIY kiy, java.util.List list) {
        C57596ylR c57596ylR = kiy.AuCTelauCTel;
        if (c57596ylR == null) {
            return false;
        }
        c57596ylR.setOffscreenPageLimit(java.lang.Math.max(3, list.size()));
        return false;
    }

    public static final class StateListAnimator implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public StateListAnimator() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(kIY.this), null, null, new WatchListTabFragment$updateTabs$2$onPageSelected$1(kIY.this, i, null), 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        uzCIH().EZpvd(this);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WatchListTabFragment$onCreate$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WatchListTabFragment$onCreate$2(this, null));
    }

    @Override // o.AbstractC27806kEY
    public void AkhnZx() {
        xTS xts = this.ejfBZ;
        if (xts != null) {
            xts.AEQbTJ(AYXKKw());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(boolean z) {
        if (isAdded()) {
            android.view.ViewGroup viewGroup = null;
            if (z) {
                android.view.ViewGroup viewGroup2 = this.zsXlph;
                if (viewGroup2 == null) {
                    Intrinsics.gEmmrt("");
                    viewGroup2 = null;
                }
                viewGroup2.setVisibility(0);
                android.view.ViewGroup viewGroup3 = this.hDKMBd;
                if (viewGroup3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    viewGroup = viewGroup3;
                }
                viewGroup.setVisibility(8);
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C27831kEy.class);
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C27831kEy c27831kEy = (C27831kEy) C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ, childFragmentManager, qZH.StateListAnimator.sEAkxl, null, null, null, 28, null);
                if (c27831kEy != null) {
                    c27831kEy.EZpvd(true);
                }
                this.getNewProxyInstance = true;
                return;
            }
            android.view.ViewGroup viewGroup4 = this.zsXlph;
            if (viewGroup4 == null) {
                Intrinsics.gEmmrt("");
                viewGroup4 = null;
            }
            viewGroup4.setVisibility(8);
            android.view.ViewGroup viewGroup5 = this.hDKMBd;
            if (viewGroup5 == null) {
                Intrinsics.gEmmrt("");
                viewGroup5 = null;
            }
            viewGroup5.setVisibility(0);
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(C27831kEy.class);
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            C27831kEy c27831kEy2 = (C27831kEy) C33062mpP.findFragment$default(interfaceC56551yJoAEQbTJ2, childFragmentManager2, null, 2, null);
            if (c27831kEy2 != null) {
                androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                C33062mpP.copydefault(c27831kEy2, childFragmentManager3);
            }
            if (this.getNewProxyInstance) {
                this.getNewProxyInstance = false;
                getFieldNames();
            }
        }
    }

    @Override // o.AbstractC27806kEY
    public void KWHzl(java.util.List<CoinQuote> list) {
        if ((list == null || list.isEmpty()) && !this.getNewProxyInstance) {
            this.AwvSrB = true;
        } else {
            super.KWHzl(list);
            values();
        }
    }

    public final void iwGUEr() {
        this.AwvSrB = false;
        values();
    }

    @Override // o.AbstractC27806kEY
    public java.lang.String OLrzqt(CoinQuote coinQuote) {
        if (C55608xnE.OLrzqt()) {
            return "inst_list";
        }
        if (Intrinsics.EZpvd((java.lang.Object) (coinQuote != null ? coinQuote.getInstType() : null), (java.lang.Object) "OPTION")) {
            return "inst_list";
        }
        return (coinQuote != null ? coinQuote.getCountDownInfo() : null) != null ? "inst_list" : "watch_list";
    }

    @Override // o.AbstractC27806kEY
    public void DbNXlk() {
        Job job = this.iwGUEr;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.iwGUEr = LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WatchListTabFragment$requestData$1(this, null));
    }

    @Override // o.AbstractC27806kEY
    public void isConnected() {
        super.isConnected();
        onInvisible();
        AhwBna();
        DbNXlk();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WatchListTabFragment$resetRefresh$1(this, null), 3, null);
    }

    @Override // o.AbstractC27806kEY, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        Job job = this.iwGUEr;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        MutableLiveData<SourceResp<xTS>> mutableLiveData = this.getFieldNames;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.zLjUOn);
        }
        this.getFieldNames = null;
        xTS xts = this.ejfBZ;
        if (xts != null) {
            xts.valueOf();
        }
        ActivityResultCaller parentFragment = getParentFragment();
        pWM pwm = parentFragment instanceof pWM ? (pWM) parentFragment : null;
        if (pwm != null) {
            pwm.OLrzqt(false);
        }
        C27889kHb.AEQbTJ.EZpvd();
    }

    @Override // o.AbstractC27806kEY, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        C32866mlf.onEvent$default("Discover_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.kIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kIY.EZpvd(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        AppCompatImageView appCompatImageView = this.zuBGHE;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(fARcdN() ? 0 : 8);
        }
    }

    public static final Unit EZpvd(kIY kiy, EventParamsList eventParamsList) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C27947kJf.ActionBar value = kiy.uzCIH().copydefault().getValue();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(value.OLrzqt().get(value.KWHzl()).EZpvd());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = "ANY";
        }
        EventParamsList.put$default(eventParamsList, "tab", "favorites", false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), C27993kKy.copydefault((java.lang.String) objM7377constructorimpl), false, 4, null);
        return Unit.INSTANCE;
    }

    public boolean fARcdN() {
        return C55608xnE.isLogin$default(null, 1, null);
    }

    public static final void OLrzqt(final kIY kiy, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (Intrinsics.EZpvd(sourceResp.isSuccess(), java.lang.Boolean.TRUE)) {
            xTS xts = kiy.ejfBZ;
            if (xts != null) {
                xts.fARcdN();
            }
            if (!Intrinsics.EZpvd(kiy.ejfBZ, sourceResp.getData())) {
                xTS xts2 = kiy.ejfBZ;
                if (xts2 != null) {
                    xts2.iwGUEr();
                }
                xTS xts3 = kiy.ejfBZ;
                if (xts3 != null) {
                    xts3.valueOf();
                }
            }
            xTS xts4 = (xTS) sourceResp.getData();
            kiy.ejfBZ = xts4;
            kiy.gHZMYf.EZpvd(xts4);
            kiy.AkhnZx();
            xTS xts5 = kiy.ejfBZ;
            if (xts5 != null) {
                xts5.copydefault(new Function1() { // from class: o.kJa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kIY.OLrzqt(this.copydefault, (java.util.ArrayList) obj);
                    }
                });
                return;
            }
            return;
        }
        kiy.fIwbmz();
    }

    public static final Unit OLrzqt(kIY kiy, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(kiy), null, null, new WatchListTabFragment$observer$1$1$1(arrayList, kiy, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27806kEY
    public java.lang.String[] djBIcL() {
        java.lang.String strAYXKKw;
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw((interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() != 0) ? qZH.PendingIntent.zsXlph : qZH.PendingIntent.ihnvzI);
        if (Intrinsics.EZpvd((java.lang.Object) "Turnover", (java.lang.Object) C42955rgF.copydefault.OLrzqt())) {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.AubY);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.AuCTelauCTel);
        }
        return new java.lang.String[]{C33070mpX.AYXKKw(qZH.PendingIntent.zLjUOn), C33070mpX.AYXKKw(qZH.PendingIntent.gdmIOq), strAYXKKw2, " / " + strAYXKKw};
    }

    @Override // o.AbstractC27806kEY
    public void fIwbmz() {
        java.util.List<C27869kGi.ActionBar> listEZpvd;
        java.util.List<CoinQuote> listAEQbTJ;
        EZpvd(false);
        kIF kif = this.AubY;
        if (kif != null && (listEZpvd = kif.EZpvd()) != null && C33129mqd.KWHzl((java.util.Collection) listEZpvd)) {
            C57596ylR c57596ylR = this.AuCTelauCTel;
            if ((c57596ylR != null ? c57596ylR.getAdapter() : null) != null && (listAEQbTJ = uzCIH().copydefault().getValue().AEQbTJ()) != null && !listAEQbTJ.isEmpty()) {
                return;
            }
        }
        KWHzl(true);
    }

    @Override // o.pWK
    public void getFieldNames() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WatchListTabFragment$onRecommendAdded$1(this, null), 3, null);
        DbNXlk();
    }

    @Override // o.AbstractC27806kEY, o.AbstractC27554jxQ.ActionBar
    public boolean OLrzqt(@NotNull android.view.View view, int i, final CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(view, "");
        C32866mlf.onEvent$default("DiscoverPage_Favorites_FloatingWindow_View", (TrackChannel[]) null, new Function1() { // from class: o.kIV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kIY.copydefault(coinQuote, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return super.OLrzqt(view, i, coinQuote);
    }

    public static final Unit copydefault(CoinQuote coinQuote, EventParamsList eventParamsList) {
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String strAEQbTJ;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (coinQuote == null || (instId = coinQuote.getInstId()) == null) {
            instId = "";
        }
        eventParamsList.put("token_pair", instId, false);
        if (coinQuote != null && (instType = coinQuote.getInstType()) != null && (strAEQbTJ = qTA.AEQbTJ(instType)) != null) {
            str = strAEQbTJ;
        }
        eventParamsList.put("biz_type", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27806kEY, com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        java.util.List<WatchListData> listKWHzl;
        xTS xts;
        Intrinsics.checkNotNullParameter(action, "");
        int iKWHzl = uzCIH().copydefault().getValue().KWHzl();
        CoinQuote coinQuoteOLrzqt = OLrzqt();
        if (coinQuoteOLrzqt != null) {
            if (iKWHzl == 0 || action != MarketToolDialog.Action.TOP) {
                super.OLrzqt(action);
            } else {
                xTS xts2 = this.ejfBZ;
                if (xts2 != null && (listKWHzl = xts2.KWHzl(coinQuoteOLrzqt)) != null && (xts = this.ejfBZ) != null) {
                    xts.AEQbTJ(listKWHzl, (InterfaceC55701xos<Unit>) new Application(), true);
                }
            }
        }
        int i = ActionBar.KWHzl[action.ordinal()];
        final java.lang.String str = i != 1 ? i != 2 ? i != 3 ? null : "edit" : "top" : "unfavorite";
        if (str != null) {
            C32866mlf.onEvent$default("DiscoverPage_Favorites_FloatingWindow_Click", (TrackChannel[]) null, new Function1() { // from class: o.kJe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kIY.copydefault(this.OLrzqt, str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(kIY kiy, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String strAEQbTJ;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C27947kJf.ActionBar value = kiy.uzCIH().copydefault().getValue();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(value.OLrzqt().get(value.KWHzl()).copydefault());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = "all";
        }
        java.lang.String string = objM7377constructorimpl != null ? objM7377constructorimpl.toString() : null;
        CoinQuote coinQuoteOLrzqt = kiy.OLrzqt();
        if (coinQuoteOLrzqt == null || (instId = coinQuoteOLrzqt.getInstId()) == null) {
            instId = "";
        }
        eventParamsList.put("token_pair", instId, false);
        CoinQuote coinQuoteOLrzqt2 = kiy.OLrzqt();
        if (coinQuoteOLrzqt2 != null && (instType = coinQuoteOLrzqt2.getInstType()) != null && (strAEQbTJ = qTA.AEQbTJ(instType)) != null) {
            str2 = strAEQbTJ;
        }
        eventParamsList.put("biz_type", str2, true);
        eventParamsList.put("tab", string != null ? string : "all", true);
        eventParamsList.put("button_type", str, false);
        return Unit.INSTANCE;
    }
}

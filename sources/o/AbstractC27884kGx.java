package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.okinc.business.market.market.fragment.BaseMarketTabFragment$initView$1$1;
import com.okinc.business.market.market.fragment.BaseMarketTabFragment$initView$2;
import com.okinc.business.market.market.fragment.BaseMarketTabFragment$tryInitOKTrade$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.ChargeGroupData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC27884kGx;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.qZH;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC27884kGx extends AbstractC32998moE {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public boolean AYXKKw;
    public boolean AhwBna;
    public android.widget.LinearLayout AuCTel;
    public android.view.View DbNXlk;
    public android.widget.ImageView KWHzl;
    public ChargeGroupData copydefault;
    public StateListAnimator djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public java.lang.String fJNWhG;
    public android.view.View fetchVPNInfo;
    public android.widget.FrameLayout gEmmrt;
    public android.widget.TextView isConnected;
    public C28000kLe values;
    public boolean AkhnZx = true;
    public boolean OLrzqt = true;
    public final InterfaceC56387yDm fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.kGz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27884kGx.AEQbTJ(this.EZpvd);
        }
    });
    public java.util.ArrayList<TradeGroupData> AEQbTJ = new java.util.ArrayList<>();
    public java.util.ArrayList<ChargeGroupData> valueOf = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AhwBna() {
        return this.isConnected;
    }

    public abstract java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<ChargeGroupData> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28000kLe KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(ChargeGroupData chargeGroupData) {
        this.copydefault = chargeGroupData;
    }

    public abstract androidx.fragment.app.Fragment OLrzqt(@NotNull TradeGroupData tradeGroupData);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupData OLrzqt() {
        return this.copydefault;
    }

    public abstract java.util.ArrayList<ChargeGroupData> copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.LinearLayout djBIcL() {
        return this.AuCTel;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public AbstractC27884kGx() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.BaseMarketTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.BaseMarketTabFragment$special$$inlined$viewModels$default$2
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C27954kJm.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.BaseMarketTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.BaseMarketTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.BaseMarketTabFragment$special$$inlined$viewModels$default$5
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
        this.fJNWhG = "";
    }

    /* JADX INFO: renamed from: o.kGx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kGx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.DbNXlk = view.findViewById(qZH.StateListAnimator.RcvFxC);
        this.values = (C28000kLe) view.findViewById(qZH.StateListAnimator.QMuEJi);
        this.AuCTel = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.hQufeQ);
        this.KWHzl = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.ICustomTabsServiceDefault);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.HJWChPOKBmQN);
        this.isConnected = textView;
        if (textView != null) {
            textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseMarketTabFragment$initView$2(this, null), 3, null);
        android.widget.LinearLayout linearLayout = this.AuCTel;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        this.gEmmrt = (android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.OKSWiw);
        this.fetchVPNInfo = view.findViewById(qZH.StateListAnimator.onReceive);
        AEQbTJ(true);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk);
        if (viewGroup != null) {
            C6873aXb.OLrzqt(viewGroup);
        }
    }

    public final void isConnected() {
        StateListAnimator stateListAnimator = new StateListAnimator(this, Util.toImmutableList(CollectionsKt___CollectionsKt.QfsBiF(this.AEQbTJ)));
        this.djBIcL = stateListAnimator;
        C28000kLe c28000kLe = this.values;
        if (c28000kLe != null) {
            c28000kLe.setAdapter(stateListAnimator);
        }
        android.view.View view = this.DbNXlk;
        if (view != null) {
            copydefault(view);
        }
        C28000kLe c28000kLe2 = this.values;
        if (c28000kLe2 != null) {
            c28000kLe2.setOffscreenPageLimit(3);
        }
        C28000kLe c28000kLe3 = this.values;
        if (c28000kLe3 != null) {
            c28000kLe3.addOnPageChangeListener(new Application());
        }
    }

    /* JADX INFO: renamed from: o.kGx$Application */
    public static final class Application extends ViewPager.SimpleOnPageChangeListener {
        public Application() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            java.lang.Object objM7377constructorimpl;
            final java.lang.String type;
            java.util.List<TradeGroupData> listKWHzl;
            super.onPageSelected(i);
            if (i == 0) {
                type = "All";
            } else {
                AbstractC27884kGx abstractC27884kGx = AbstractC27884kGx.this;
                try {
                    Result.Application application = Result.Companion;
                    StateListAnimator stateListAnimator = abstractC27884kGx.djBIcL;
                    objM7377constructorimpl = Result.m7377constructorimpl((stateListAnimator == null || (listKWHzl = stateListAnimator.KWHzl()) == null) ? null : listKWHzl.get(i));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                TradeGroupData tradeGroupData = (TradeGroupData) objM7377constructorimpl;
                type = tradeGroupData != null ? tradeGroupData.getType() : null;
            }
            C32866mlf.onEvent$default("Markets_Category_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.kGw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC27884kGx.Application.copydefault(type, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "terminal", "app", false, 4, null);
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, "market_page", false, 4, null);
            EventParamsList.put$default(eventParamsList, "category_type", str == null ? "" : str, false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof C55241xgI) {
            ((C55241xgI) view).setupWithViewPager(this.values);
        }
    }

    public final void values() {
        ChargeGroupData chargeGroupData = this.copydefault;
        if (chargeGroupData == null) {
            chargeGroupData = (ChargeGroupData) CollectionsKt___CollectionsKt.firstOrNull(this.valueOf);
        }
        this.copydefault = chargeGroupData;
        java.lang.String strKWHzl = KWHzl(this.valueOf, chargeGroupData);
        this.fJNWhG = strKWHzl;
        OLrzqt(strKWHzl);
    }

    /* JADX INFO: renamed from: o.kGx$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ AbstractC27884kGx AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC27884kGx abstractC27884kGx) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = abstractC27884kGx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new BaseMarketTabFragment$initView$1$1(this.AEQbTJ, null), 3, null);
            }
        }
    }

    public final java.lang.String KWHzl(java.util.ArrayList<ChargeGroupData> arrayList, ChargeGroupData chargeGroupData) {
        java.lang.String id;
        java.lang.Object next;
        java.lang.String id2;
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            if (chargeGroupData == null) {
                ChargeGroupData chargeGroupData2 = (ChargeGroupData) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (chargeGroupData2 != null && (id = chargeGroupData2.getId()) != null) {
                    return id;
                }
            } else {
                java.util.Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((ChargeGroupData) next).getId(), (java.lang.Object) chargeGroupData.getId())) {
                        break;
                    }
                }
                ChargeGroupData chargeGroupData3 = (ChargeGroupData) next;
                if (chargeGroupData3 != null && (id2 = chargeGroupData3.getId()) != null) {
                    return id2;
                }
            }
        }
        return "1";
    }

    public void DbNXlk() {
        AEQbTJ(false);
        EZpvd(false);
        copydefault(true);
    }

    public void copydefault(boolean z) {
        if (this.OLrzqt) {
            this.OLrzqt = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        android.view.ViewGroup viewGroup;
        if (!this.AYXKKw) {
            if (!this.AhwBna) {
                this.AhwBna = true;
                android.view.View view = getView();
                if (view != null && (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) != null) {
                    C6873aXb.EZpvd(viewGroup);
                }
            }
            this.AYXKKw = !this.AYXKKw;
            AkhnZx();
            return;
        }
        StateListAnimator stateListAnimator = this.djBIcL;
        java.util.List<TradeGroupData> listKWHzl = stateListAnimator != null ? stateListAnimator.KWHzl() : null;
        if (listKWHzl != null && !listKWHzl.isEmpty()) {
            C28000kLe c28000kLe = this.values;
            if ((c28000kLe != null ? c28000kLe.getAdapter() : null) != null) {
                return;
            }
        }
        AkhnZx();
    }

    public final void fetchVPNInfo() {
        android.view.ViewGroup viewGroup;
        if (this.AYXKKw) {
            return;
        }
        if (!this.AhwBna) {
            this.AhwBna = true;
            android.view.View view = getView();
            if (view != null && (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) != null) {
                C6873aXb.EZpvd(viewGroup);
            }
        }
        this.AYXKKw = !this.AYXKKw;
        fIwbmz();
    }

    public void AkhnZx() {
        ejfBZ();
    }

    public void fIwbmz() {
        ejfBZ();
    }

    public final void ejfBZ() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseMarketTabFragment$tryInitOKTrade$1(this, null));
    }

    public final void AEQbTJ(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.AkhnZx || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.AkhnZx = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    public final void fARcdN() {
        AEQbTJ(false);
        EZpvd(true);
        copydefault(false);
    }

    public final C55173xeu AYXKKw() {
        return (C55173xeu) this.fIwbmz.getValue();
    }

    public static final C55173xeu AEQbTJ(AbstractC27884kGx abstractC27884kGx) {
        android.content.Context contextRequireContext = abstractC27884kGx.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C55173xeu(contextRequireContext, null, 0, 6, null);
    }

    public final void EZpvd(boolean z) {
        if (getContext() != null) {
            android.widget.FrameLayout frameLayout = this.gEmmrt;
            if (frameLayout != null) {
                frameLayout.setVisibility(z ? 0 : 8);
            }
            if (!z) {
                android.widget.FrameLayout frameLayout2 = this.gEmmrt;
                if (frameLayout2 == null || frameLayout2 == null) {
                    return;
                }
                frameLayout2.removeAllViews();
                return;
            }
            C55173xeu c55173xeuAYXKKw = AYXKKw();
            java.lang.String string = getString(qZH.PendingIntent.DsL);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuAYXKKw.setTitle(string);
            AYXKKw().setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
            C55173xeu c55173xeuAYXKKw2 = AYXKKw();
            java.lang.String string2 = getString(qZH.PendingIntent.fetchVPNInfo);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeuAYXKKw2.setRetry(string2);
            AYXKKw().setRetryClickListener(new View.OnClickListener() { // from class: o.kGy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC27884kGx.EZpvd(this.KWHzl, view);
                }
            });
            AYXKKw().setEmptyTypeImage(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            layoutParams.topMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            AYXKKw().setLayoutParams(layoutParams);
            if (AYXKKw().getParent() != null) {
                android.view.ViewParent parent = AYXKKw().getParent();
                Intrinsics.copydefault(parent, "");
                ((android.view.ViewGroup) parent).removeView(AYXKKw());
            }
            android.widget.FrameLayout frameLayout3 = this.gEmmrt;
            if (frameLayout3 != null) {
                frameLayout3.addView(AYXKKw());
            }
        }
    }

    public static final void EZpvd(AbstractC27884kGx abstractC27884kGx, android.view.View view) {
        android.widget.FrameLayout frameLayout = abstractC27884kGx.gEmmrt;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        abstractC27884kGx.AkhnZx = true;
        abstractC27884kGx.AEQbTJ(true);
        abstractC27884kGx.AYXKKw = false;
        abstractC27884kGx.fetchVPNInfo();
    }

    public final void gEmmrt() {
        java.util.ArrayList<TradeGroupData> arrayList;
        this.AEQbTJ.clear();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (arrayList = interfaceC54581xNrOLrzqt.uzCIH()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        java.util.ArrayList<TradeGroupData> arrayList2 = new java.util.ArrayList<>(arrayList);
        KWHzl(arrayList2);
        this.AEQbTJ.addAll(arrayList2);
    }

    public void KWHzl(@NotNull java.util.ArrayList<TradeGroupData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.lang.String string = C55734xpY.Companion.copydefault().getString(C55688xof.Application.sbu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        arrayList.add(0, new TradeGroupData((java.lang.String) null, string, "all", (java.lang.String) null, false, 24, (DefaultConstructorMarker) null));
    }

    public final C27954kJm valueOf() {
        return (C27954kJm) this.ejfBZ.getValue();
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().KWHzl(str);
    }

    public final void fJNWhG() {
        try {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null)) {
                copydefault();
            }
            java.util.Iterator<ChargeGroupData> it = this.valueOf.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                java.lang.String id = it.next().getId();
                ChargeGroupData chargeGroupData = this.copydefault;
                if (Intrinsics.EZpvd((java.lang.Object) id, (java.lang.Object) (chargeGroupData != null ? chargeGroupData.getId() : null))) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                i = i2;
            }
            C27861kGa c27861kGaCopydefault = C27861kGa.Companion.copydefault();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key.request_key_spot", "request_key_unit_type");
            bundle.putInt("key.select_index", i);
            bundle.putParcelableArrayList("key.group_data", copydefault());
            c27861kGaCopydefault.setArguments(bundle);
            c27861kGaCopydefault.show(getChildFragmentManager(), C27861kGa.class.getName());
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o.kGx$StateListAnimator */
    public final class StateListAnimator extends AbstractC32997moD {
        public java.util.List<TradeGroupData> EZpvd;
        public final /* synthetic */ AbstractC27884kGx OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TradeGroupData> KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC27884kGx abstractC27884kGx, java.util.List<TradeGroupData> list) {
            super(abstractC27884kGx.getChildFragmentManager());
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = abstractC27884kGx;
            this.EZpvd = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.EZpvd.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return this.EZpvd.get(i).getName();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            return this.OLrzqt.OLrzqt(this.EZpvd.get(i));
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public java.lang.Object instantiateItem(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            try {
                java.lang.Object objInstantiateItem = super.instantiateItem(viewGroup, i);
                Intrinsics.checkNotNullExpressionValue(objInstantiateItem, "");
                return objInstantiateItem;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return new androidx.fragment.app.Fragment();
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        getChildFragmentManager().setFragmentResultListener("request_key_unit_type", this, new FragmentResultListener() { // from class: o.kGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                this.AEQbTJ.EZpvd(str, bundle);
            }
        });
    }

    public final void EZpvd(java.lang.String str, android.os.Bundle bundle) {
        android.widget.ImageView imageView;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "request_key_unit_type")) {
            bundle.getInt("key.select_index");
            ChargeGroupData chargeGroupData = (ChargeGroupData) bundle.getParcelable("key.select_data");
            ChargeGroupData chargeGroupData2 = this.copydefault;
            if (!Intrinsics.EZpvd((java.lang.Object) (chargeGroupData2 != null ? chargeGroupData2.getId() : null), (java.lang.Object) (chargeGroupData != null ? chargeGroupData.getId() : null)) && (imageView = this.KWHzl) != null) {
                imageView.setImageResource(C52761wXj.TaskDescription.RcvFxC);
            }
            this.copydefault = chargeGroupData;
            values();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
